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
package org.apache.ode.daohib.bpel;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ode.bpel.common.BpelEventFilter;
import org.apache.ode.bpel.common.InstanceFilter;
import org.apache.ode.bpel.common.ProcessState;
import org.apache.ode.bpel.dao.*;
import org.apache.ode.bpel.evt.BpelEvent;
import org.apache.ode.bpel.evt.ScopeEvent;
import org.apache.ode.bpel.iapi.ProcessConf.CLEANUP_CATEGORY;
import org.apache.ode.daohib.SessionManager;
import org.apache.ode.daohib.bpel.hobj.*;
import org.apache.ode.daohib.bpel.ql.HibernateInstancesQueryCompiler;
import org.apache.ode.ql.eval.skel.CommandEvaluator;
import org.apache.ode.ql.tree.Builder;
import org.apache.ode.ql.tree.BuilderFactory;
import org.apache.ode.ql.tree.nodes.Query;
import org.apache.ode.utils.SerializableUtils;
import org.apache.ode.utils.stl.CollectionsX;
import org.apache.ode.utils.stl.UnaryFunctionEx;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * Hibernate-based {@link BpelDAOConnection} implementation.
 */
public class BpelDAOConnectionImpl implements BpelDAOConnection, FilteredInstanceDeletable {
    private static final Log __log = LogFactory.getLog(BpelDAOConnectionImpl.class);

    public SessionManager _sm;

    public BpelDAOConnectionImpl(SessionManager sm) {
        _sm = sm;
    }

    protected Session getSession(){
        return _sm.getSession();
    }

    public MessageExchangeDAO createMessageExchange(char dir) {
        HMessageExchange mex = new HMessageExchange();
        mex.setDirection(dir);
        mex.setInsertTime(new Date(System.currentTimeMillis()));
        getSession().save(mex);
        return new MessageExchangeDaoImpl(_sm, mex);
    }

    public MessageExchangeDAO getMessageExchange(String mexid) {
        HMessageExchange mex = (HMessageExchange) getSession().get(HMessageExchange.class, new Long(mexid));
        return mex == null ? null : new MessageExchangeDaoImpl(_sm, mex);
    }

    public ProcessDAO createProcess(QName pid, QName type, String guid, long version) {
        HProcess process = new HProcess();
        process.setProcessId(pid.toString());
        process.setTypeName(type.getLocalPart());
        process.setTypeNamespace(type.getNamespaceURI());
        process.setDeployDate(new Date());
        process.setGuid(guid);
        process.setVersion(version);
        getSession().save(process);
        return new ProcessDaoImpl(_sm, process);
    }

    public ProcessDAO createTransientProcess(Long id) {
        HProcess process = new HProcess();
        process.setId(id);

        return new ProcessDaoImpl(_sm, process);
    }

    public ProcessDAO getProcess(QName processId) {
        try {
            Criteria criteria = getSession().createCriteria(HProcess.class);
            criteria.add(Expression.eq("processId", processId.toString()));
            // For the moment we are expecting only one result.
            HProcess hprocess = (HProcess) criteria.uniqueResult();
            return hprocess == null ? null : new ProcessDaoImpl(_sm, hprocess);
        } catch (HibernateException e) {
            __log.error("DbError", e);
            throw e;
        }

    }

    public void close() {
    }

    /**
     * @see org.apache.ode.bpel.dao.ProcessDAO#getInstance(java.lang.Long)
     */
    public ProcessInstanceDAO getInstance(Long instanceId) {
        return _getInstance(_sm, getSession(), instanceId);
    }

    public ProcessInstanceDAO getInstanceEagerly(Long iid, boolean withEvents) {
        throw new UnsupportedOperationException("This method is not implemented in this version of the ODE");
    }

    public ProcessInstanceDAO getInstanceEagerly(Long instanceId) {
        ProcessInstanceDaoImpl processInstanceDao = null;

		StringBuilder sql = new StringBuilder(" SELECT DISTINCT a FROM HProcessInstance a LEFT JOIN FETCH a.process ");
		sql.append(" WHERE a.id = :iid ");

		org.hibernate.Query query = getSession().createQuery(sql.toString());
		query.setParameter("iid", instanceId);
		List<HProcessInstance> result = query.list();

		if (result != null && (!result.isEmpty())) {
            HProcessInstance instance = result.iterator().next();
            processInstanceDao = new ProcessInstanceDaoImpl(_sm, instance );
		}

		return processInstanceDao;

	}

    public int getNumInstances(QName processId) {
        ProcessDAO process = getProcess(processId);
        if (process != null)
            return process.getNumInstances();
        else return -1;
    }

    public ScopeDAO getScope(Long siidl) {
        return _getScope(_sm, getSession(), siidl);
    }
    
    /*public ScopeDAO getScopeEagerly(Long siidl) {
		ScopeDAO scope = null;
		StringBuilder sql = new StringBuilder(" SELECT DISTINCT a FROM ScopeDAOImpl a LEFT JOIN FETCH a._childScopes " +
				"WHERE a._scopeInstanceId = :siidl ");

		org.hibernate.Query query = getSession().createQuery(sql.toString());
		query.setParameter("siidl", siidl);
		List<ScopeDAO> result = query.list();

		if (result != null && (!result.isEmpty())) {
			scope = result.iterator().next();
		}

		return scope;
    }*/
    
    public ScopeDAO getScopeEagerly(Long siidl) {
        return getScope(siidl);
//    	HScope scope = null;
//
//		Criteria criteriaBuilder = getSession().createCriteria(HScope.class);
//		criteriaBuilder.add(Restrictions.eq("id", siidl));
//		criteriaBuilder.createAlias("parentScope", "pa");
//		criteriaBuilder.createAlias("instance", "in");
//		criteriaBuilder.createAlias("variables", "va");
//		criteriaBuilder.createAlias("correlationSets", "co");
//
//
//		List<HScope> result = criteriaBuilder.list();
//
//		if (result != null && (!result.isEmpty())) {
//			scope = result.iterator().next();
//		}
//
//		return scope != null ? new ScopeDaoImpl(_sm, scope) : null;
	}

    public Collection<ProcessInstanceDAO> instanceQuery(InstanceFilter criteria) {
        if (criteria.getLimit() == 0) {
            return Collections.emptyList();
        }
        List<ProcessInstanceDAO> daos = new ArrayList<ProcessInstanceDAO>();

        Iterator<HProcessInstance> iter = _instanceQuery(getSession(), false, criteria);
        while (iter.hasNext()) {
            daos.add(new ProcessInstanceDaoImpl(_sm, iter.next()));
        }

        return daos;
    }

    public int deleteInstances(InstanceFilter criteria, Set<CLEANUP_CATEGORY> categories) {
        if (criteria.getLimit() == 0) {
            return 0;
        }

        List<HProcessInstance> instances = _instanceQueryForList(getSession(), false, criteria);
        if( __log.isDebugEnabled() ) __log.debug("Collected " + instances.size() + " instances to delete.");

        if( !instances.isEmpty() ) {
            ProcessDaoImpl process = (ProcessDaoImpl)createTransientProcess(instances.get(0).getProcessId());
            return process.deleteInstances(instances, categories);
        }

        return 0;
    }

    static Iterator<HProcessInstance> _instanceQuery(Session session, boolean countOnly, InstanceFilter filter) {
        return _instanceQueryForList(session, countOnly, filter).iterator();
    }

    @SuppressWarnings("unchecked")
    private static List<HProcessInstance> _instanceQueryForList(Session session, boolean countOnly, InstanceFilter filter) {
        CriteriaBuilder cb = new CriteriaBuilder();

        return cb.buildHQLQuery(session, filter).list();
    }

    static ProcessInstanceDAO _getInstance(SessionManager sm, Session session, Long iid) {
        HProcessInstance instance = (HProcessInstance) session.get(HProcessInstance.class, iid);
        return instance != null ? new ProcessInstanceDaoImpl(sm, instance) : null;
    }

    static ScopeDAO _getScope(SessionManager sm, Session session, Long siid) {
        HScope scope = (HScope) session.get(HScope.class, siid);
        return scope != null ? new ScopeDaoImpl(sm, scope) : null;
    }

    public void insertBpelEvent(BpelEvent event, ProcessDAO process, ProcessInstanceDAO instance) {
        _insertBpelEvent(_sm.getSession(), event, process, instance);
    }

    /**
     * Helper method for inserting bpel events into the database.
     *
     * @param sess
     * @param event
     * @param process
     * @param instance
     */
    static void _insertBpelEvent(Session sess, BpelEvent event, ProcessDAO process, ProcessInstanceDAO instance) {
        HBpelEvent hevent = new HBpelEvent();
        hevent.setTstamp(new Timestamp(System.currentTimeMillis()));
        hevent.setType(BpelEvent.eventName(event));
        hevent.setDetail(event.toString());
        if (process != null)
            hevent.setProcess((HProcess) ((ProcessDaoImpl) process).getHibernateObj());
        if (instance != null)
            hevent.setInstance((HProcessInstance) ((ProcessInstanceDaoImpl) instance).getHibernateObj());
        if (event instanceof ScopeEvent)
            hevent.setScopeId(((ScopeEvent) event).getScopeId());
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(event);
            oos.flush();
            hevent.setData(bos.toByteArray());
        } catch (Throwable ex) {
            // this is really unexpected.
            __log.fatal("InternalError: BpelEvent serialization failed.", ex);
        }
        sess.save(hevent);
    }

    @SuppressWarnings( { "unchecked", "deprecation" })
    public List<Date> bpelEventTimelineQuery(InstanceFilter ifilter, BpelEventFilter efilter) {
        CriteriaBuilder cb = new CriteriaBuilder();
        Criteria crit = getSession().createCriteria(HBpelEvent.class);
        if (ifilter != null)
            cb.buildCriteria(crit, efilter);
        if (ifilter != null)
            cb.buildCriteria(crit.createCriteria("instance"), ifilter);
        crit.setFetchMode("tstamp", FetchMode.EAGER);
        crit.setProjection(Projections.property("tstamp"));
        return crit.list();
    }

    @SuppressWarnings("unchecked")
    public List<BpelEvent> bpelEventQuery(InstanceFilter ifilter, BpelEventFilter efilter) {
        CriteriaBuilder cb = new CriteriaBuilder();
        Criteria crit = getSession().createCriteria(HBpelEvent.class);
        if (efilter != null)
            cb.buildCriteria(crit, efilter);
        if (ifilter != null)
            cb.buildCriteria(crit.createCriteria("instance"), ifilter);
        List<HBpelEvent> hevents = crit.list();
        List<BpelEvent> ret = new ArrayList<BpelEvent>(hevents.size());
        try {
            CollectionsX.transformEx(ret, hevents, new UnaryFunctionEx<HBpelEvent, BpelEvent>() {
                public BpelEvent apply(HBpelEvent x) throws Exception {
                    return (BpelEvent) SerializableUtils.toObject(x.getData(), BpelEvent.class
                            .getClassLoader());
                }

            });
        } catch (Exception ex) {
            __log.fatal("Internal error: unable to transform HBpelEvent", ex);
            throw new RuntimeException(ex);
        }
        return ret;
    }

    /**
     * @see org.apache.ode.bpel.dao.BpelDAOConnection#instanceQuery(String)
     */
    @SuppressWarnings("unchecked")
    public Collection<ProcessInstanceDAO> instanceQuery(String expression) {
        Builder<String> builder = BuilderFactory.getInstance().createBuilder();
        final org.apache.ode.ql.tree.nodes.Node rootNode = builder.build(expression);

        HibernateInstancesQueryCompiler compiler = new HibernateInstancesQueryCompiler();

        CommandEvaluator<List, Session> eval = compiler.compile((Query) rootNode);
        List<HProcessInstance> instancesList = (List<HProcessInstance>) eval.evaluate(getSession());

        Collection<ProcessInstanceDAO> result = new ArrayList<ProcessInstanceDAO>(instancesList.size());
        for (HProcessInstance instance : instancesList) {
            result.add(getInstance(instance.getId()));
        }
        return result;
    }

    public Long instanceCount(InstanceFilter criteria) {
        throw new UnsupportedOperationException();
    }

    @SuppressWarnings("unchecked")
    public Map<Long, Collection<CorrelationSetDAO>> getCorrelationSets(Collection<ProcessInstanceDAO> instances) {
        if (instances.size() == 0) {
            return new HashMap<Long, Collection<CorrelationSetDAO>>();
        }
        ArrayList<Long> iids = new ArrayList<Long>(instances.size());
        int i=0;
        for (ProcessInstanceDAO dao: instances) {
            iids.add(dao.getInstanceId());
            i++;
        }
        Collection<HCorrelationSet> csets = new ArrayList<HCorrelationSet>();
        // some databases don't like long lists of values with IN operator
        // so we select in batches.  Oracle 9i, for instance, doesn't support
        // more than 1000 -- we opt to be conservative.
        final int batchSize = 100;
        int index = 0;
        while (index < iids.size()) {
            List<Long> subList = iids.subList(index, Math.min(index+batchSize, iids.size()));
            csets.addAll(getSession().getNamedQuery(HCorrelationSet.SELECT_CORSETS_BY_INSTANCES).setParameterList("instances", subList).list());
            index += batchSize;
        }
        Map<Long, Collection<CorrelationSetDAO>> map = new HashMap<Long, Collection<CorrelationSetDAO>>();
        for (HCorrelationSet cset: csets) {
            Long id = cset.getInstance().getId();
            Collection<CorrelationSetDAO> existing = map.get(id);
            if (existing == null) {
                existing = new ArrayList<CorrelationSetDAO>();
                map.put(id, existing);
            }
            existing.add(new CorrelationSetDaoImpl(_sm, cset));
        }
        return map;
    }

    @SuppressWarnings("unchecked")
    public Collection<CorrelationSetDAO> getActiveCorrelationSets() {
        ArrayList<CorrelationSetDAO> csetDaos = new ArrayList<CorrelationSetDAO>();
        Collection<HCorrelationSet> csets = getSession().getNamedQuery(HCorrelationSet.SELECT_CORSETS_BY_PROCESS_STATES).setParameter("states", ProcessState.STATE_ACTIVE).list();
        for (HCorrelationSet cset : csets)
            csetDaos.add(new CorrelationSetDaoImpl(_sm, cset));
        return csetDaos;
    }

	public Collection<CorrelationSetDAO> getActiveCorrelationSets(String correlationName, String correlationKey,
	                                                              QName processType) {
		ArrayList<CorrelationSetDAO> csetDaos = new ArrayList<CorrelationSetDAO>();
		String sql = " select c from CorrelationSetDAOImpl as c left join fetch c._scope " +
		             " where c._scope._processInstance._state = (:state) " +
		             " and c._name = (:name) " +
		             " and c._correlationKey = (:key) " +
		             " and c._scope._processInstance._process._processType = :processType ";
		Collection<HCorrelationSet> csets =
				getSession().createQuery(sql).setParameter("state", ProcessState.STATE_ACTIVE)
				            .setParameter("name", correlationName).setParameter("key", correlationKey)
				            .setParameter("processType", processType.toString()).list();
		for (HCorrelationSet cset : csets)
			csetDaos.add(new CorrelationSetDaoImpl(_sm, cset));
		return csetDaos;
	}

    public ProcessManagementDAO getProcessManagement() {
        return new ProcessManagementDaoImpl(_sm);
    }

    @Override
    public AttachmentDAO getAttachmentDAO(Long attachmentID, MessageExchangeDAO mex) {
        HAttachment attachment = new HAttachment();
        attachment.setAttachmentId(attachmentID);
        attachment.setMessageExchange((HMessageExchange)((MessageExchangeDaoImpl)mex).getHibernateObj());
        getSession().save(attachment);
        AttachmentDAOImpl attachmentDAO = new AttachmentDAOImpl(_sm,  attachment);
        return attachmentDAO;
    }

    @Override
    public List<ActivityRecoveryDAO> getFailedActivities(int startNo, int pageSize) {
        return null;
    }

    @Override
    public Object getCountOfAllFailedActivities() {
        return null;
    }
}
