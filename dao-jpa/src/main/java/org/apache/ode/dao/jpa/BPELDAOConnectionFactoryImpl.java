/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ode.dao.jpa;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ode.bpel.dao.BpelDAOConnection;
import org.apache.ode.bpel.dao.BpelDAOConnectionFactoryJDBC;
import org.apache.openjpa.ee.ManagedRuntime;
import org.apache.openjpa.kernel.Broker;
import org.apache.openjpa.persistence.EntityManagerImpl;
import org.apache.openjpa.persistence.OpenJPAEntityManager;
import org.apache.openjpa.util.GeneralException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.Status;
import javax.transaction.Synchronization;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Matthieu Riou <mriou at apache dot org>
 */
public class BPELDAOConnectionFactoryImpl implements BpelDAOConnectionFactoryJDBC {
    static final Log __log = LogFactory.getLog(BPELDAOConnectionFactoryImpl.class);

    protected EntityManagerFactory _emf;
    private TransactionManager _tm;
    private DataSource _ds;
    private Object _dbdictionary;

    static ThreadLocal<BPELDAOConnectionImpl> _connections = new ThreadLocal<BPELDAOConnectionImpl>();

    public BPELDAOConnectionFactoryImpl() {
    }
    
    /**
     * @see http://openjpa.apache.org/builds/2.2.1/apache-openjpa/docs/ref_guide_dbsetup_sqlconn.html.
     */
    public static Connection getExistingJDBCConnection() {

        BPELDAOConnectionImpl bpelConn = _connections.get();
        if (bpelConn != null) {
            __log.debug("getting existing db connection ");
            Object delegate = bpelConn.getEntityManager().getDelegate();
            if (delegate instanceof EntityManagerImpl) {
            	EntityManagerImpl em = (EntityManagerImpl) delegate;
                __log.debug(" getting the delegate from entity manager");
                em.beginStore();
                Object conn = em.getConnection();
                return (Connection) conn;
            } else {
               __log.debug(" Entity manage is not the delegate");
                return null;
            }
        } else {
            __log.debug(" existing db connection is null");
            return null;
        }
    }

    private boolean isInTx() throws SystemException {
    	return _tm.getTransaction() != null && _tm.getTransaction().getStatus() == Status.STATUS_ACTIVE;
    }
    
    @SuppressWarnings("unchecked")
    public BpelDAOConnection getConnection() {
        if (_connections.get() != null) {
            return _connections.get();
        } else {
        	try {
				if (this.isInTx()) {
					HashMap propMap2 = new HashMap();
					//propMap2.put("openjpa.TransactionMode", "managed");
					EntityManager em = _emf.createEntityManager(propMap2);
					em.getTransaction().begin();
					BPELDAOConnectionImpl conn = createBPELDAOConnection(em);
					_connections.set(conn);
					_tm.getTransaction().registerSynchronization(
							new Synchronization() {
								// OpenJPA allows cross-transaction entity
								// managers, which we don't want
								
								public void afterCompletion(int i) {
									if (_connections.get() != null) {
										if (i == Status.STATUS_COMMITTED) {
											__log.debug(" get connection synchronization: COMMITTED START");
										    _connections.get().getEntityManager().getTransaction().commit();
										    _connections.get().getEntityManager().close();
										    _connections.set(null);
										} else if (i == Status.STATUS_ROLLEDBACK) {
											__log.debug(" getConnection synchronization: ROLLBACK START");
											_connections.get().getEntityManager().getTransaction().rollback();
											_connections.get().getEntityManager().close();
											_connections.set(null);
										}
									}
								}
								public void beforeCompletion() {
								}
							});

					return conn;
				} else {
					return null;
				}
        	} catch (RollbackException e) {
				throw new RuntimeException("Coulnd't register synchronizer!");
			} catch (SystemException e) {
				throw new RuntimeException("Coulnd't register synchronizer!");
			}
        }
    }

    protected BPELDAOConnectionImpl createBPELDAOConnection(EntityManager em) {
        return new BPELDAOConnectionImpl(em);
    }

    @SuppressWarnings("unchecked")
    public void init(Properties properties) {
        HashMap<String, Object> propMap = new HashMap<String,Object>();

//        propMap.put("openjpa.Log", "DefaultLevel=TRACE");
        propMap.put("openjpa.Log", "commons");
//        propMap.put("openjpa.jdbc.DBDictionary", "org.apache.openjpa.jdbc.sql.DerbyDictionary");

        propMap.put("openjpa.ManagedRuntime", new JpaTxMgrProvider(_tm));
        propMap.put("openjpa.ConnectionFactory", _ds);
        propMap.put("openjpa.ConnectionFactoryMode", "managed");
//        propMap.put("openjpa.FlushBeforeQueries", "false");
        //propMap.put("openjpa.FetchBatchSize", 1000);
        propMap.put("openjpa.jdbc.TransactionIsolation", "read-committed");

        if (_dbdictionary != null)
            propMap.put("openjpa.jdbc.DBDictionary", _dbdictionary);

        if (properties != null)
            for (Map.Entry me : properties.entrySet())
                propMap.put((String)me.getKey(),me.getValue());

        _emf = Persistence.createEntityManagerFactory("ode-dao", propMap);
    }

    public void setTransactionManager(TransactionManager tm) {
        _tm = tm;
    }

    public void setDataSource(DataSource datasource) {
        _ds = datasource;

    }

    public void setDBDictionary(String dbd) {
        _dbdictionary = dbd;
    }

    public void setTransactionManager(Object tm) {
        _tm = (TransactionManager) tm;

    }

    public void setUnmanagedDataSource(DataSource ds) {
    }

    public void shutdown() {
        _emf.close();
    }

    public DataSource getDataSource() {
        return _ds;
    }
}
