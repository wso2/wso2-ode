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

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ode.bpel.common.BpelEventFilter;
import org.apache.ode.bpel.common.Filter;
import org.apache.ode.bpel.common.InstanceFilter;
import org.apache.ode.bpel.common.ProcessState;
import org.apache.ode.bpel.dao.ActivityRecoveryDAO;
import org.apache.ode.bpel.dao.AttachmentDAO;
import org.apache.ode.bpel.dao.BpelDAOConnection;
import org.apache.ode.bpel.dao.CorrelationSetDAO;
import org.apache.ode.bpel.dao.FilteredInstanceDeletable;
import org.apache.ode.bpel.dao.MessageExchangeDAO;
import org.apache.ode.bpel.dao.ProcessDAO;
import org.apache.ode.bpel.dao.ProcessInstanceDAO;
import org.apache.ode.bpel.dao.ProcessManagementDAO;
import org.apache.ode.bpel.dao.ScopeDAO;
import org.apache.ode.bpel.evt.BpelEvent;
import org.apache.ode.bpel.evt.ScopeEvent;
import org.apache.ode.bpel.iapi.ProcessConf;
import org.apache.ode.utils.ISO8601DateParser;
import org.apache.openjpa.jdbc.conf.JDBCConfiguration;
import org.apache.openjpa.jdbc.sql.DBDictionary;
import org.apache.openjpa.jdbc.sql.OracleDictionary;
import org.apache.openjpa.persistence.OpenJPAEntityManager;
import org.apache.openjpa.persistence.OpenJPAEntityManagerSPI;
import org.apache.openjpa.persistence.OpenJPAPersistence;
import org.apache.openjpa.persistence.OpenJPAQuery;
import org.apache.openjpa.persistence.jdbc.FetchMode;
import org.apache.openjpa.persistence.jdbc.JDBCFetchPlan;

/**
 * @author Matthieu Riou <mriou at apache dot org>
 */
public class BPELDAOConnectionImpl implements BpelDAOConnection, FilteredInstanceDeletable {
    static final Log __log = LogFactory.getLog(BPELDAOConnectionImpl.class);

    protected EntityManager _em;
    private static DBDictionary _dbDictionary;
    public BPELDAOConnectionImpl(EntityManager em) {
        _em = em;
        _dbDictionary = ((JDBCConfiguration)((OpenJPAEntityManagerSPI) _em).getConfiguration()).getDBDictionaryInstance();
    }

    public List<BpelEvent> bpelEventQuery(InstanceFilter ifilter,
                                          BpelEventFilter efilter) {
        // TODO
        throw new UnsupportedOperationException();
    }

    public List<Date> bpelEventTimelineQuery(InstanceFilter ifilter,
                                             BpelEventFilter efilter) {
        // TODO
        throw new UnsupportedOperationException();
    }

    public ProcessInstanceDAO getInstance(Long iid) {
        ProcessInstanceDAOImpl instance = _em.find(ProcessInstanceDAOImpl.class, iid);
        return instance;
    }

   	public ProcessInstanceDAO getInstanceEagerly(Long iid, boolean withEvents) {
		ScopeDAO rootScope = null;
		ProcessInstanceDAOImpl instance = null;

		String sql = "select c from ProcessInstanceDAOImpl c "
				+ (withEvents ? " left join c.events e left join fetch e._event " : "")
				+ " left join fetch c._recoveries left join c._scopes s left join fetch c._rootScope left join fetch s._parentScope  left join fetch s._processInstance "
				+
				// " left join fetch s._variables   left join fetch s._correlationSets  "
				// +
				" where c._instanceId = :siidl ";
		Query query = _em.createQuery(sql);
		OpenJPAEntityManager oem = OpenJPAPersistence.cast(_em);
		// query.setParameter("siidl", siidl);

		OpenJPAQuery kq = OpenJPAPersistence.cast(query);
		JDBCFetchPlan fetch = (JDBCFetchPlan) kq.getFetchPlan();

		kq.setParameter("siidl", iid);
		kq.setIgnoreChanges(true);

		List<ProcessInstanceDAOImpl> result = kq.getResultList();

		if (result != null && (!result.isEmpty())) {
			instance = result.iterator().next();
			rootScope = instance.getRootScope();
			Collection<ScopeDAO> scopes = instance.getScopes();
			List<EventDAOImpl> events = Collections.EMPTY_LIST;
			Collection<ActivityRecoveryDAO> recoveries = Collections.EMPTY_LIST;
			Map<Long, EventDAOImpl> eventsMap = new HashMap<Long, EventDAOImpl>();
			if (withEvents) {
				events = instance.getEvents();
			}

			recoveries = instance.getActivityRecoveries();
			if (recoveries == null || recoveries.isEmpty()) {
				recoveries = Collections.EMPTY_LIST;
			}
			// _em.detach(instance);
			Set<ScopeDAO> rootCandidates = new HashSet<ScopeDAO>();

			boolean hasEvents = ((withEvents && events != null && !events.isEmpty()) ? true : false);

			Map<Long, ScopeDAO> scopeIds = new HashMap<Long, ScopeDAO>();

			if (scopes != null) {
				for (ScopeDAO parentScope : scopes) {
					parentScope.setChildScopes(Collections.EMPTY_LIST);
					parentScope.getProcessInstance().setActivityRecoveries(recoveries);

					scopeIds.put(parentScope.getScopeInstanceId(), parentScope);

					parentScope.isChildrenExist();
					Set<ScopeDAO> candidates = new HashSet<ScopeDAO>();
					if (parentScope.isParentExist() && parentScope.getParentScope().equals(rootScope)) {
						rootCandidates.add(parentScope);
					}
					for (ScopeDAO scope : scopes) {
						if (scope.isParentExist() && scope.getParentScope().equals(parentScope)) {
							candidates.add(scope);
						}
					}
					parentScope.setChildScopes(new ArrayList<ScopeDAO>(candidates));

					if (hasEvents) {
						for (EventDAOImpl event : events) {
							if (!eventsMap.containsKey(event.getId())) {
								event.getEvent();
								eventsMap.put(event.getId(), event);
							}
							if (parentScope.getScopeInstanceId().equals(event.getScopeId())) {
								((ScopeDAOImpl) parentScope).getEvents().add(eventsMap.get(event.getId()));

							}
						}
					}

				}
			}

			sql = "select s from XmlDataDAOImpl s  " + "  left join fetch s._data   left join fetch s._scope "
					+ " where s._scope._scopeInstanceId " + " in (:siidl)";

			query = _em.createQuery(sql);
			query.setParameter("siidl", scopeIds.keySet());
			kq = OpenJPAPersistence.cast(query);

			List<XmlDataDAOImpl> xmlData = query.getResultList();

			for (XmlDataDAOImpl variable : xmlData) {
				ScopeDAOImpl scopeDTO = (ScopeDAOImpl) scopeIds.get(variable.getScopeDAO().getScopeInstanceId());
				scopeDTO.getVariablesDTOs().add(variable);

			}

			sql = "select s from CorrelationSetDAOImpl s  " + "  left join fetch s._props "
					+ " where s._scope._scopeInstanceId " + " in (:siidl)";

			query = _em.createQuery(sql);
			query.setParameter("siidl", scopeIds.keySet());

			List<CorrelationSetDAOImpl> entities = query.getResultList();

			for (CorrelationSetDAOImpl entity : entities) {
				ScopeDAOImpl scopeDTO = (ScopeDAOImpl) scopeIds.get(entity.getScope().getScopeInstanceId());
				scopeDTO.getCorrelationDTOs().add(entity);

			}

			if (rootScope != null && !rootCandidates.isEmpty()) {
				rootScope.setChildScopes(new ArrayList<ScopeDAO>(rootCandidates));
			}

		}

		__log.info("result size " + result.size());

		return instance;
	}

    public void close() {
        _em = null;
    }

    public MessageExchangeDAO createMessageExchange(char dir) {
        MessageExchangeDAOImpl ret = new MessageExchangeDAOImpl(dir);
        _em.persist(ret);
        return ret;
    }

    public ProcessDAO createProcess(QName pid, QName type, String guid, long version) {
        ProcessDAOImpl ret = new ProcessDAOImpl(pid, type, guid, version);
        _em.persist(ret);
        return ret;
    }

    public ProcessDAO createTransientProcess(Long id) {
        ProcessDAOImpl ret = new ProcessDAOImpl(null, null, null, 0);
        ret.setId(id);

        return ret;
    }

    @SuppressWarnings("unchecked")
    public ProcessDAO getProcess(QName processId) {
        List l = _em.createQuery("select x from ProcessDAOImpl x where x._processId = ?1")
                .setParameter(1, processId.toString()).getResultList();

        if (l.size() == 0) {
            return null;
        } else {
            if (__log.isDebugEnabled()) {
                __log.debug("GetProcess#size=" + l.size());
            }
        }
        return (ProcessDAOImpl) l.get(0);
    }

    public int getNumInstances(QName processId) {
        ProcessDAO process = getProcess(processId);
        if (process != null)
            return process.getNumInstances();
        else return -1;
    }

    public ScopeDAO getScope(Long siidl) {
        return _em.find(ScopeDAOImpl.class, siidl);
    }
    
	public ScopeDAO getScopeEagerly(Long siidl) {
		ScopeDAO rootScope = null;
		ProcessInstanceDAOImpl instance = null;
		
		/*CriteriaBuilder criteriaBuilder = _em.getCriteriaBuilder();
		CriteriaQuery<ScopeDAOImpl> criteriaQuery = criteriaBuilder.createQuery(ScopeDAOImpl.class);
		Root<ScopeDAOImpl> root = criteriaQuery.from(ScopeDAOImpl.class);

		Fetch<ScopeDAOImpl, ScopeDAOImpl> chileScopes = root.fetch("_childScopes", JoinType.LEFT);
		Fetch<ScopeDAOImpl, XmlDataDAO> variables = root.fetch("_variables", JoinType.LEFT);
		Fetch<ScopeDAOImpl, ProcessInstanceDAOImpl> process = root.fetch("_processInstance", JoinType.LEFT);
		Fetch<ScopeDAOImpl, CorrelationSetDAOImpl> correlations = root.fetch("_correlationSets", JoinType.LEFT);
		Fetch<ProcessInstanceDAOImpl, ActivityRecoveryDAOImpl> recoveries = process.fetch("_recoveries", JoinType.LEFT);
		Fetch<CorrelationSetDAOImpl, CorrSetProperty> props = correlations.fetch("_props", JoinType.LEFT);

		criteriaQuery.where(criteriaBuilder.equal(root.get("_scopeInstanceId"), siidl));

		TypedQuery<ScopeDAOImpl> query = _em.createQuery(criteriaQuery);*/
		/*String sql = "select c from ScopeDAOImpl c left join fetch c._childScopes left join fetch c._parentScope  " +
				" left join fetch c._variables  inner join fetch c._processInstance  left join fetch c._correlationSets  " +
				" where c._processInstance._instanceId = :siidl ";*/
		String sql = "select distinct c from ProcessInstanceDAOImpl c left join c.events e left join fetch e._event left join c._scopes s left join fetch c._rootScope left join fetch s._parentScope  left join fetch s._childScopes " +
				" left join fetch s._variables   left join fetch s._correlationSets  " +
				" where c._instanceId = :siidl ";
		Query query = _em.createQuery(sql);
		//query.setParameter("siidl", siidl);
		
		OpenJPAQuery kq = OpenJPAPersistence.cast(query);
		/*kq.getFetchPlan().setMaxFetchDepth(100).addFetchGroup("detail");*/
		kq.setParameter("siidl", siidl);
		
		List<ProcessInstanceDAOImpl> result = kq.getResultList();

		if (result != null && (!result.isEmpty())) {
			instance = result.iterator().next();
			rootScope = instance.getRootScope();
			Collection<ScopeDAO> scopes = instance.getScopes();
			Set<ScopeDAO> rootCandidates = new HashSet<ScopeDAO>();
			if(scopes != null){
				for(ScopeDAO parentScope : scopes){
					parentScope.setChildScopes(Collections.EMPTY_LIST);
					parentScope.isChildrenExist();
					Set<ScopeDAO> candidates = new HashSet<ScopeDAO>();
					if(parentScope.isParentExist() && parentScope.getParentScope().equals(rootScope)){
						rootCandidates.add(parentScope);
					}
					for(ScopeDAO scope : scopes){
						if(scope.isParentExist() && scope.getParentScope().equals(parentScope)){
							candidates.add(scope);
						}
					}
					parentScope.setChildScopes(new ArrayList<ScopeDAO>(candidates));
				}
			}
			if(rootScope != null && !rootCandidates.isEmpty()){
				rootScope.setChildScopes(new ArrayList<ScopeDAO>(rootCandidates));
			}
			
		}
		
		__log.info("result size "+result.size());

		return rootScope;
	}
	
	

    public void insertBpelEvent(BpelEvent event, ProcessDAO process, ProcessInstanceDAO instance) {
        EventDAOImpl eventDao = new EventDAOImpl();
        eventDao.setTstamp(new Timestamp(System.currentTimeMillis()));
        eventDao.setType(BpelEvent.eventName(event));
        String evtStr = event.toString();
        eventDao.setDetail(evtStr.substring(0, Math.min(254, evtStr.length())));
        if (process != null)
            eventDao.setProcess((ProcessDAOImpl) process);
        if (instance != null)
            eventDao.setInstance((ProcessInstanceDAOImpl) instance);
        if (event instanceof ScopeEvent)
            eventDao.setScopeId(((ScopeEvent) event).getScopeId());
        eventDao.setEvent(event);
        _em.persist(eventDao);
    }

    private static String dateFilter(String filter) {
        String date = Filter.getDateWithoutOp(filter);
        String op = filter.substring(0, filter.indexOf(date));
        Date dt = null;
        try {
            dt = ISO8601DateParser.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(_dbDictionary.getClass() == OracleDictionary.class){
            String time = new SimpleDateFormat("dd-MMM-yy hh:mm:ss a").format(dt);
            return op + " '" + time + "'";
        }
        Timestamp ts = new Timestamp(dt.getTime());
        return op + " '" + ts.toString() + "'";
    }

    @SuppressWarnings("unchecked")
    public Collection<ProcessInstanceDAO> instanceQuery(InstanceFilter criteria) {
        StringBuffer query = instanceFilterToJPQLQuery(criteria, false);

        if (__log.isDebugEnabled()) {
            __log.debug(query.toString());
        }

        // criteria limit
        Query pq = _em.createQuery(query.toString());
        pq.setMaxResults(criteria.getLimit());
        OpenJPAQuery kq = OpenJPAPersistence.cast(pq);
        kq.getFetchPlan().setFetchBatchSize(criteria.getLimit() + 5);
        // Added +5 to make lazy loading safe with streaming result sets.
        List<ProcessInstanceDAO> ql = pq.getResultList();

        Collection<ProcessInstanceDAO> list = new ArrayList<ProcessInstanceDAO>();
        int num = 0;
        for (Iterator iterator = ql.iterator(); iterator.hasNext();) {
            if (num++ > criteria.getLimit()) break;
            ProcessInstanceDAO processInstanceDAO = (ProcessInstanceDAO) iterator.next();
            list.add(processInstanceDAO);
        }

        return list;
    }

    public Collection<ProcessInstanceDAO> instanceQuery(String expression) {
        return instanceQuery(new InstanceFilter(expression));
    }

    public Long instanceCount(InstanceFilter criteria) {
        StringBuffer queryString = instanceFilterToJPQLQuery(criteria, true);

        if(__log.isDebugEnabled()){
            __log.debug("Instance Count Query: " + queryString.toString());
        }

        Query query = _em.createQuery(queryString.toString());
        OpenJPAQuery jpaQuery = OpenJPAPersistence.cast(query);
        Long instanceCount = (Long)jpaQuery.getSingleResult();
        return instanceCount;
    }


    public StringBuffer instanceFilterToJPQLQuery(InstanceFilter criteria, boolean returnCount) {
        StringBuffer query = new StringBuffer();
        if (returnCount) {
            query.append("select count(pi) from ProcessInstanceDAOImpl as pi ");
        } else {
            query.append("select pi from ProcessInstanceDAOImpl as pi left join fetch pi._fault ");
        }

        if (criteria != null) {
            // Building each clause
            ArrayList<String> clauses = new ArrayList<String>();

            // iid filter
            if (criteria.getIidFilter() != null) {
                StringBuffer filters = new StringBuffer();
                List<String> iids = criteria.getIidFilter();
                for (int m = 0; m < iids.size(); m++) {
                    filters.append(" pi._instanceId = ").append(iids.get(m));
                    if (m < iids.size() - 1) filters.append(" or");
                }
                clauses.add(" (" + filters + ")");
            }

            // pid filter
            if (criteria.getPidFilter() != null) {
                StringBuffer filters = new StringBuffer();
                List<String> pids = criteria.getPidFilter();
                for (int m = 0; m < pids.size(); m++) {
                    filters.append(" pi._process._processId = '").append(pids.get(m)).append("'");
                    if (m < pids.size() - 1) filters.append(" or");
                }
                clauses.add(" (" + filters + ")");
            }

            // name filter
            if (criteria.getNameFilter() != null) {
                String val = criteria.getNameFilter();
                if (val.endsWith("*")) {
                    val = val.substring(0, val.length() - 1) + "%";
                }
                //process type string begins with name space
                //this could possibly match more than you want
                //because the name space and name are stored together
                clauses.add(" pi._process._processType like '%" + val + "'");
            }

            // name space filter
            if (criteria.getNamespaceFilter() != null) {
                //process type string begins with name space
                //this could possibly match more than you want
                //because the name space and name are stored together
                clauses.add(" pi._process._processType like '{" +
                        criteria.getNamespaceFilter() + "%'");
            }

            // started filter
            if (criteria.getStartedDateFilter() != null) {
                for (String ds : criteria.getStartedDateFilter()) {
                    clauses.add(" pi._dateCreated " + dateFilter(ds));
                }
            }

            // last-active filter
            if (criteria.getLastActiveDateFilter() != null) {
                for (String ds : criteria.getLastActiveDateFilter()) {
                    clauses.add(" pi._lastActive " + dateFilter(ds));
                }
            }

            // status filter
            if (criteria.getStatusFilter() != null) {
                StringBuffer filters = new StringBuffer();
                List<Short> states = criteria.convertFilterState();
                for (int m = 0; m < states.size(); m++) {
                    filters.append(" pi._state = ").append(states.get(m));
                    if (m < states.size() - 1) filters.append(" or");
                }
                clauses.add(" (" + filters.toString() + ")");
            }

            // $property filter
            if (criteria.getPropertyValuesFilter() != null) {
                Map<String, String> props = criteria.getPropertyValuesFilter();
                // join to correlation sets
                query.append(" inner join pi._rootScope._correlationSets as cs");
                int i = 0;
                for (String propKey : props.keySet()) {
                    i++;
                    // join to props for each prop
                    query.append(" inner join cs._props as csp" + i);
                    // add clause for prop key and value
                    clauses.add(" csp" + i + ".propertyKey = '" + propKey +
                            "' and csp" + i + ".propertyValue = '" +
                            // spaces have to be escaped, might be better handled in InstanceFilter
                            props.get(propKey).replaceAll("&#32;", " ") + "'");
                }
            }

            // order by
            StringBuffer orderby = new StringBuffer("");
            if (criteria.getOrders() != null) {
                orderby.append(" order by");
                List<String> orders = criteria.getOrders();
                for (int m = 0; m < orders.size(); m++) {
                    String field = orders.get(m);
                    String ord = " asc";
                    if (field.startsWith("-")) {
                        ord = " desc";
                    }
                    String fieldName = " pi._instanceId";
                    if (field.endsWith("name") || field.endsWith("namespace")) {
                        fieldName = " pi._process._processType";
                    }
                    if (field.endsWith("version")) {
                        fieldName = " pi._process._version";
                    }
                    if (field.endsWith("status")) {
                        fieldName = " pi._state";
                    }
                    if (field.endsWith("started")) {
                        fieldName = " pi._dateCreated";
                    }
                    if (field.endsWith("last-active")) {
                        fieldName = " pi._lastActive";
                    }
                    orderby.append(fieldName + ord);
                    if (m < orders.size() - 1) orderby.append(", ");
                }

            }

            // Preparing the statement
            if (clauses.size() > 0) {
                query.append(" where");
                for (int m = 0; m < clauses.size(); m++) {
                    query.append(clauses.get(m));
                    if (m < clauses.size() - 1) query.append(" and");
                }
            }

            query.append(orderby);
        }

        return query;

    }


    public void setEntityManger(EntityManager em) {
        _em = em;
    }

    public MessageExchangeDAO getMessageExchange(String mexid) {
        return _em.find(MessageExchangeDAOImpl.class, mexid);
    }

    public void deleteMessageExchange(MessageExchangeDAO mexDao) {
        _em.remove(mexDao);
    }

    public EntityManager getEntityManager() {
        return _em;
    }

    @SuppressWarnings("unchecked")
    public Map<Long, Collection<CorrelationSetDAO>> getCorrelationSets(Collection<ProcessInstanceDAO> instances) {
        if (instances.size() == 0) {
            return new HashMap<Long, Collection<CorrelationSetDAO>>();
        }
        ArrayList<Long> iids = new ArrayList<Long>(instances.size());
        for (ProcessInstanceDAO dao : instances) {
            iids.add(dao.getInstanceId());
        }
        Collection<CorrelationSetDAOImpl> csets = _em.createNamedQuery(CorrelationSetDAOImpl.SELECT_CORRELATION_SETS_BY_INSTANCES).setParameter("instances", iids).getResultList();
        Map<Long, Collection<CorrelationSetDAO>> map = new HashMap<Long, Collection<CorrelationSetDAO>>();
        for (CorrelationSetDAOImpl cset : csets) {
            Long id = cset.getScope().getProcessInstance().getInstanceId();
            Collection<CorrelationSetDAO> existing = map.get(id);
            if (existing == null) {
                existing = new ArrayList<CorrelationSetDAO>();
                map.put(id, existing);
            }
            existing.add(cset);
        }
        return map;
    }

    @SuppressWarnings("unchecked")
    public Collection<CorrelationSetDAO> getActiveCorrelationSets() {
        return _em.createNamedQuery(CorrelationSetDAOImpl.SELECT_ACTIVE_SETS).setParameter("state", ProcessState.STATE_ACTIVE).getResultList();
    }

    public int deleteInstances(InstanceFilter filter, Set<ProcessConf.CLEANUP_CATEGORY> categories) {
        if(filter.getLimit() == 0){
            return 0;
        }

        Collection<ProcessInstanceDAO> instances = instanceQuery(filter);
        if(__log.isDebugEnabled()){
            __log.debug("Collected " + instances.size() + " instances to delete.");
        }

        if(!instances.isEmpty()){
            for(ProcessInstanceDAO processInstance : instances){
                processInstance.delete(categories, true);
            }

            return instances.size();
        }
        return 0;
    }

    public ProcessManagementDAO getProcessManagement() {
        return new ProcessManagementDAOImpl(_em);
    }

    @Override
    public AttachmentDAO getAttachmentDAO(Long attachmentID, MessageExchangeDAO mex) {
        AttachmentDAO dao = new AttachmentDAOImpl();
        dao.setId(attachmentID);
        dao.setMexDAO(mex);

        return dao;
    }

    public List<ActivityRecoveryDAO> getFailedActivities(int startNo, int pageSize) {
        List<ActivityRecoveryDAO> failedActivityList =
                _em.createNamedQuery(ActivityRecoveryDAOImpl.SELECT_ALL_FAILED_ACTIVITIES).setFirstResult(startNo).setMaxResults(pageSize).getResultList();

        return failedActivityList;
    }

    public Object getCountOfAllFailedActivities()
    {
       Object failedActivitycount=  _em.createNamedQuery(ActivityRecoveryDAOImpl.COUNT_All_ACTIVITY_RECOVERIES).getSingleResult();
       return failedActivitycount;
    }
}