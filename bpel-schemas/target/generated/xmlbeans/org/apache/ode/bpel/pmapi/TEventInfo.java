/*
 * XML Type:  tEventInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TEventInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tEventInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TEventInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TEventInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("teventinfo7305type");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Gets the "line-number" element
     */
    int getLineNumber();
    
    /**
     * Gets (as xml) the "line-number" element
     */
    org.apache.xmlbeans.XmlInt xgetLineNumber();
    
    /**
     * Sets the "line-number" element
     */
    void setLineNumber(int lineNumber);
    
    /**
     * Sets (as xml) the "line-number" element
     */
    void xsetLineNumber(org.apache.xmlbeans.XmlInt lineNumber);
    
    /**
     * Gets the "timestamp" element
     */
    java.util.Calendar getTimestamp();
    
    /**
     * Gets (as xml) the "timestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetTimestamp();
    
    /**
     * Sets the "timestamp" element
     */
    void setTimestamp(java.util.Calendar timestamp);
    
    /**
     * Sets (as xml) the "timestamp" element
     */
    void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp);
    
    /**
     * Gets the "process-id" element
     */
    javax.xml.namespace.QName getProcessId();
    
    /**
     * Gets (as xml) the "process-id" element
     */
    org.apache.xmlbeans.XmlQName xgetProcessId();
    
    /**
     * True if has "process-id" element
     */
    boolean isSetProcessId();
    
    /**
     * Sets the "process-id" element
     */
    void setProcessId(javax.xml.namespace.QName processId);
    
    /**
     * Sets (as xml) the "process-id" element
     */
    void xsetProcessId(org.apache.xmlbeans.XmlQName processId);
    
    /**
     * Unsets the "process-id" element
     */
    void unsetProcessId();
    
    /**
     * Gets the "process-type" element
     */
    javax.xml.namespace.QName getProcessType();
    
    /**
     * Gets (as xml) the "process-type" element
     */
    org.apache.xmlbeans.XmlQName xgetProcessType();
    
    /**
     * True if has "process-type" element
     */
    boolean isSetProcessType();
    
    /**
     * Sets the "process-type" element
     */
    void setProcessType(javax.xml.namespace.QName processType);
    
    /**
     * Sets (as xml) the "process-type" element
     */
    void xsetProcessType(org.apache.xmlbeans.XmlQName processType);
    
    /**
     * Unsets the "process-type" element
     */
    void unsetProcessType();
    
    /**
     * Gets the "instance-id" element
     */
    long getInstanceId();
    
    /**
     * Gets (as xml) the "instance-id" element
     */
    org.apache.xmlbeans.XmlLong xgetInstanceId();
    
    /**
     * True if has "instance-id" element
     */
    boolean isSetInstanceId();
    
    /**
     * Sets the "instance-id" element
     */
    void setInstanceId(long instanceId);
    
    /**
     * Sets (as xml) the "instance-id" element
     */
    void xsetInstanceId(org.apache.xmlbeans.XmlLong instanceId);
    
    /**
     * Unsets the "instance-id" element
     */
    void unsetInstanceId();
    
    /**
     * Gets the "scope-id" element
     */
    long getScopeId();
    
    /**
     * Gets (as xml) the "scope-id" element
     */
    org.apache.xmlbeans.XmlLong xgetScopeId();
    
    /**
     * True if has "scope-id" element
     */
    boolean isSetScopeId();
    
    /**
     * Sets the "scope-id" element
     */
    void setScopeId(long scopeId);
    
    /**
     * Sets (as xml) the "scope-id" element
     */
    void xsetScopeId(org.apache.xmlbeans.XmlLong scopeId);
    
    /**
     * Unsets the "scope-id" element
     */
    void unsetScopeId();
    
    /**
     * Gets the "parent-scope-id" element
     */
    long getParentScopeId();
    
    /**
     * Gets (as xml) the "parent-scope-id" element
     */
    org.apache.xmlbeans.XmlLong xgetParentScopeId();
    
    /**
     * True if has "parent-scope-id" element
     */
    boolean isSetParentScopeId();
    
    /**
     * Sets the "parent-scope-id" element
     */
    void setParentScopeId(long parentScopeId);
    
    /**
     * Sets (as xml) the "parent-scope-id" element
     */
    void xsetParentScopeId(org.apache.xmlbeans.XmlLong parentScopeId);
    
    /**
     * Unsets the "parent-scope-id" element
     */
    void unsetParentScopeId();
    
    /**
     * Gets the "scope-name" element
     */
    java.lang.String getScopeName();
    
    /**
     * Gets (as xml) the "scope-name" element
     */
    org.apache.xmlbeans.XmlString xgetScopeName();
    
    /**
     * True if has "scope-name" element
     */
    boolean isSetScopeName();
    
    /**
     * Sets the "scope-name" element
     */
    void setScopeName(java.lang.String scopeName);
    
    /**
     * Sets (as xml) the "scope-name" element
     */
    void xsetScopeName(org.apache.xmlbeans.XmlString scopeName);
    
    /**
     * Unsets the "scope-name" element
     */
    void unsetScopeName();
    
    /**
     * Gets the "scope-definition-id" element
     */
    int getScopeDefinitionId();
    
    /**
     * Gets (as xml) the "scope-definition-id" element
     */
    org.apache.xmlbeans.XmlInt xgetScopeDefinitionId();
    
    /**
     * True if has "scope-definition-id" element
     */
    boolean isSetScopeDefinitionId();
    
    /**
     * Sets the "scope-definition-id" element
     */
    void setScopeDefinitionId(int scopeDefinitionId);
    
    /**
     * Sets (as xml) the "scope-definition-id" element
     */
    void xsetScopeDefinitionId(org.apache.xmlbeans.XmlInt scopeDefinitionId);
    
    /**
     * Unsets the "scope-definition-id" element
     */
    void unsetScopeDefinitionId();
    
    /**
     * Gets the "activity-id" element
     */
    long getActivityId();
    
    /**
     * Gets (as xml) the "activity-id" element
     */
    org.apache.xmlbeans.XmlLong xgetActivityId();
    
    /**
     * True if has "activity-id" element
     */
    boolean isSetActivityId();
    
    /**
     * Sets the "activity-id" element
     */
    void setActivityId(long activityId);
    
    /**
     * Sets (as xml) the "activity-id" element
     */
    void xsetActivityId(org.apache.xmlbeans.XmlLong activityId);
    
    /**
     * Unsets the "activity-id" element
     */
    void unsetActivityId();
    
    /**
     * Gets the "activity-name" element
     */
    java.lang.String getActivityName();
    
    /**
     * Gets (as xml) the "activity-name" element
     */
    org.apache.xmlbeans.XmlString xgetActivityName();
    
    /**
     * True if has "activity-name" element
     */
    boolean isSetActivityName();
    
    /**
     * Sets the "activity-name" element
     */
    void setActivityName(java.lang.String activityName);
    
    /**
     * Sets (as xml) the "activity-name" element
     */
    void xsetActivityName(org.apache.xmlbeans.XmlString activityName);
    
    /**
     * Unsets the "activity-name" element
     */
    void unsetActivityName();
    
    /**
     * Gets the "activity-type" element
     */
    java.lang.String getActivityType();
    
    /**
     * Gets (as xml) the "activity-type" element
     */
    org.apache.xmlbeans.XmlString xgetActivityType();
    
    /**
     * True if has "activity-type" element
     */
    boolean isSetActivityType();
    
    /**
     * Sets the "activity-type" element
     */
    void setActivityType(java.lang.String activityType);
    
    /**
     * Sets (as xml) the "activity-type" element
     */
    void xsetActivityType(org.apache.xmlbeans.XmlString activityType);
    
    /**
     * Unsets the "activity-type" element
     */
    void unsetActivityType();
    
    /**
     * Gets the "activity-definition-id" element
     */
    int getActivityDefinitionId();
    
    /**
     * Gets (as xml) the "activity-definition-id" element
     */
    org.apache.xmlbeans.XmlInt xgetActivityDefinitionId();
    
    /**
     * True if has "activity-definition-id" element
     */
    boolean isSetActivityDefinitionId();
    
    /**
     * Sets the "activity-definition-id" element
     */
    void setActivityDefinitionId(int activityDefinitionId);
    
    /**
     * Sets (as xml) the "activity-definition-id" element
     */
    void xsetActivityDefinitionId(org.apache.xmlbeans.XmlInt activityDefinitionId);
    
    /**
     * Unsets the "activity-definition-id" element
     */
    void unsetActivityDefinitionId();
    
    /**
     * Gets the "activity-failure-reason" element
     */
    java.lang.String getActivityFailureReason();
    
    /**
     * Gets (as xml) the "activity-failure-reason" element
     */
    org.apache.xmlbeans.XmlString xgetActivityFailureReason();
    
    /**
     * True if has "activity-failure-reason" element
     */
    boolean isSetActivityFailureReason();
    
    /**
     * Sets the "activity-failure-reason" element
     */
    void setActivityFailureReason(java.lang.String activityFailureReason);
    
    /**
     * Sets (as xml) the "activity-failure-reason" element
     */
    void xsetActivityFailureReason(org.apache.xmlbeans.XmlString activityFailureReason);
    
    /**
     * Unsets the "activity-failure-reason" element
     */
    void unsetActivityFailureReason();
    
    /**
     * Gets the "activity-recovery-action" element
     */
    java.lang.String getActivityRecoveryAction();
    
    /**
     * Gets (as xml) the "activity-recovery-action" element
     */
    org.apache.xmlbeans.XmlString xgetActivityRecoveryAction();
    
    /**
     * True if has "activity-recovery-action" element
     */
    boolean isSetActivityRecoveryAction();
    
    /**
     * Sets the "activity-recovery-action" element
     */
    void setActivityRecoveryAction(java.lang.String activityRecoveryAction);
    
    /**
     * Sets (as xml) the "activity-recovery-action" element
     */
    void xsetActivityRecoveryAction(org.apache.xmlbeans.XmlString activityRecoveryAction);
    
    /**
     * Unsets the "activity-recovery-action" element
     */
    void unsetActivityRecoveryAction();
    
    /**
     * Gets the "variable-name" element
     */
    java.lang.String getVariableName();
    
    /**
     * Gets (as xml) the "variable-name" element
     */
    org.apache.xmlbeans.XmlString xgetVariableName();
    
    /**
     * True if has "variable-name" element
     */
    boolean isSetVariableName();
    
    /**
     * Sets the "variable-name" element
     */
    void setVariableName(java.lang.String variableName);
    
    /**
     * Sets (as xml) the "variable-name" element
     */
    void xsetVariableName(org.apache.xmlbeans.XmlString variableName);
    
    /**
     * Unsets the "variable-name" element
     */
    void unsetVariableName();
    
    /**
     * Gets the "new-value" element
     */
    java.lang.String getNewValue();
    
    /**
     * Gets (as xml) the "new-value" element
     */
    org.apache.xmlbeans.XmlString xgetNewValue();
    
    /**
     * True if has "new-value" element
     */
    boolean isSetNewValue();
    
    /**
     * Sets the "new-value" element
     */
    void setNewValue(java.lang.String newValue);
    
    /**
     * Sets (as xml) the "new-value" element
     */
    void xsetNewValue(org.apache.xmlbeans.XmlString newValue);
    
    /**
     * Unsets the "new-value" element
     */
    void unsetNewValue();
    
    /**
     * Gets the "port-type" element
     */
    javax.xml.namespace.QName getPortType();
    
    /**
     * Gets (as xml) the "port-type" element
     */
    org.apache.xmlbeans.XmlQName xgetPortType();
    
    /**
     * True if has "port-type" element
     */
    boolean isSetPortType();
    
    /**
     * Sets the "port-type" element
     */
    void setPortType(javax.xml.namespace.QName portType);
    
    /**
     * Sets (as xml) the "port-type" element
     */
    void xsetPortType(org.apache.xmlbeans.XmlQName portType);
    
    /**
     * Unsets the "port-type" element
     */
    void unsetPortType();
    
    /**
     * Gets the "operation" element
     */
    java.lang.String getOperation();
    
    /**
     * Gets (as xml) the "operation" element
     */
    org.apache.xmlbeans.XmlString xgetOperation();
    
    /**
     * True if has "operation" element
     */
    boolean isSetOperation();
    
    /**
     * Sets the "operation" element
     */
    void setOperation(java.lang.String operation);
    
    /**
     * Sets (as xml) the "operation" element
     */
    void xsetOperation(org.apache.xmlbeans.XmlString operation);
    
    /**
     * Unsets the "operation" element
     */
    void unsetOperation();
    
    /**
     * Gets the "correlation-set" element
     */
    java.lang.String getCorrelationSet();
    
    /**
     * Gets (as xml) the "correlation-set" element
     */
    org.apache.xmlbeans.XmlString xgetCorrelationSet();
    
    /**
     * True if has "correlation-set" element
     */
    boolean isSetCorrelationSet();
    
    /**
     * Sets the "correlation-set" element
     */
    void setCorrelationSet(java.lang.String correlationSet);
    
    /**
     * Sets (as xml) the "correlation-set" element
     */
    void xsetCorrelationSet(org.apache.xmlbeans.XmlString correlationSet);
    
    /**
     * Unsets the "correlation-set" element
     */
    void unsetCorrelationSet();
    
    /**
     * Gets the "mex-id" element
     */
    java.lang.String getMexId();
    
    /**
     * Gets (as xml) the "mex-id" element
     */
    org.apache.xmlbeans.XmlString xgetMexId();
    
    /**
     * True if has "mex-id" element
     */
    boolean isSetMexId();
    
    /**
     * Sets the "mex-id" element
     */
    void setMexId(java.lang.String mexId);
    
    /**
     * Sets (as xml) the "mex-id" element
     */
    void xsetMexId(org.apache.xmlbeans.XmlString mexId);
    
    /**
     * Unsets the "mex-id" element
     */
    void unsetMexId();
    
    /**
     * Gets the "correlation-key" element
     */
    java.lang.String getCorrelationKey();
    
    /**
     * Gets (as xml) the "correlation-key" element
     */
    org.apache.xmlbeans.XmlString xgetCorrelationKey();
    
    /**
     * True if has "correlation-key" element
     */
    boolean isSetCorrelationKey();
    
    /**
     * Sets the "correlation-key" element
     */
    void setCorrelationKey(java.lang.String correlationKey);
    
    /**
     * Sets (as xml) the "correlation-key" element
     */
    void xsetCorrelationKey(org.apache.xmlbeans.XmlString correlationKey);
    
    /**
     * Unsets the "correlation-key" element
     */
    void unsetCorrelationKey();
    
    /**
     * Gets the "expression" element
     */
    java.lang.String getExpression();
    
    /**
     * Gets (as xml) the "expression" element
     */
    org.apache.xmlbeans.XmlString xgetExpression();
    
    /**
     * True if has "expression" element
     */
    boolean isSetExpression();
    
    /**
     * Sets the "expression" element
     */
    void setExpression(java.lang.String expression);
    
    /**
     * Sets (as xml) the "expression" element
     */
    void xsetExpression(org.apache.xmlbeans.XmlString expression);
    
    /**
     * Unsets the "expression" element
     */
    void unsetExpression();
    
    /**
     * Gets the "fault" element
     */
    javax.xml.namespace.QName getFault();
    
    /**
     * Gets (as xml) the "fault" element
     */
    org.apache.xmlbeans.XmlQName xgetFault();
    
    /**
     * True if has "fault" element
     */
    boolean isSetFault();
    
    /**
     * Sets the "fault" element
     */
    void setFault(javax.xml.namespace.QName fault);
    
    /**
     * Sets (as xml) the "fault" element
     */
    void xsetFault(org.apache.xmlbeans.XmlQName fault);
    
    /**
     * Unsets the "fault" element
     */
    void unsetFault();
    
    /**
     * Gets the "fault-line-number" element
     */
    int getFaultLineNumber();
    
    /**
     * Gets (as xml) the "fault-line-number" element
     */
    org.apache.xmlbeans.XmlInt xgetFaultLineNumber();
    
    /**
     * True if has "fault-line-number" element
     */
    boolean isSetFaultLineNumber();
    
    /**
     * Sets the "fault-line-number" element
     */
    void setFaultLineNumber(int faultLineNumber);
    
    /**
     * Sets (as xml) the "fault-line-number" element
     */
    void xsetFaultLineNumber(org.apache.xmlbeans.XmlInt faultLineNumber);
    
    /**
     * Unsets the "fault-line-number" element
     */
    void unsetFaultLineNumber();
    
    /**
     * Gets the "explanation" element
     */
    java.lang.String getExplanation();
    
    /**
     * Gets (as xml) the "explanation" element
     */
    org.apache.xmlbeans.XmlString xgetExplanation();
    
    /**
     * True if has "explanation" element
     */
    boolean isSetExplanation();
    
    /**
     * Sets the "explanation" element
     */
    void setExplanation(java.lang.String explanation);
    
    /**
     * Sets (as xml) the "explanation" element
     */
    void xsetExplanation(org.apache.xmlbeans.XmlString explanation);
    
    /**
     * Unsets the "explanation" element
     */
    void unsetExplanation();
    
    /**
     * Gets the "result" element
     */
    java.lang.String getResult();
    
    /**
     * Gets (as xml) the "result" element
     */
    org.apache.xmlbeans.XmlString xgetResult();
    
    /**
     * True if has "result" element
     */
    boolean isSetResult();
    
    /**
     * Sets the "result" element
     */
    void setResult(java.lang.String result);
    
    /**
     * Sets (as xml) the "result" element
     */
    void xsetResult(org.apache.xmlbeans.XmlString result);
    
    /**
     * Unsets the "result" element
     */
    void unsetResult();
    
    /**
     * Gets the "root-scope-id" element
     */
    long getRootScopeId();
    
    /**
     * Gets (as xml) the "root-scope-id" element
     */
    org.apache.xmlbeans.XmlLong xgetRootScopeId();
    
    /**
     * True if has "root-scope-id" element
     */
    boolean isSetRootScopeId();
    
    /**
     * Sets the "root-scope-id" element
     */
    void setRootScopeId(long rootScopeId);
    
    /**
     * Sets (as xml) the "root-scope-id" element
     */
    void xsetRootScopeId(org.apache.xmlbeans.XmlLong rootScopeId);
    
    /**
     * Unsets the "root-scope-id" element
     */
    void unsetRootScopeId();
    
    /**
     * Gets the "root-scope-declaration-id" element
     */
    int getRootScopeDeclarationId();
    
    /**
     * Gets (as xml) the "root-scope-declaration-id" element
     */
    org.apache.xmlbeans.XmlInt xgetRootScopeDeclarationId();
    
    /**
     * True if has "root-scope-declaration-id" element
     */
    boolean isSetRootScopeDeclarationId();
    
    /**
     * Sets the "root-scope-declaration-id" element
     */
    void setRootScopeDeclarationId(int rootScopeDeclarationId);
    
    /**
     * Sets (as xml) the "root-scope-declaration-id" element
     */
    void xsetRootScopeDeclarationId(org.apache.xmlbeans.XmlInt rootScopeDeclarationId);
    
    /**
     * Unsets the "root-scope-declaration-id" element
     */
    void unsetRootScopeDeclarationId();
    
    /**
     * Gets the "partner-link-name" element
     */
    java.lang.String getPartnerLinkName();
    
    /**
     * Gets (as xml) the "partner-link-name" element
     */
    org.apache.xmlbeans.XmlString xgetPartnerLinkName();
    
    /**
     * True if has "partner-link-name" element
     */
    boolean isSetPartnerLinkName();
    
    /**
     * Sets the "partner-link-name" element
     */
    void setPartnerLinkName(java.lang.String partnerLinkName);
    
    /**
     * Sets (as xml) the "partner-link-name" element
     */
    void xsetPartnerLinkName(org.apache.xmlbeans.XmlString partnerLinkName);
    
    /**
     * Unsets the "partner-link-name" element
     */
    void unsetPartnerLinkName();
    
    /**
     * Gets the "old-state" element
     */
    int getOldState();
    
    /**
     * Gets (as xml) the "old-state" element
     */
    org.apache.xmlbeans.XmlInt xgetOldState();
    
    /**
     * True if has "old-state" element
     */
    boolean isSetOldState();
    
    /**
     * Sets the "old-state" element
     */
    void setOldState(int oldState);
    
    /**
     * Sets (as xml) the "old-state" element
     */
    void xsetOldState(org.apache.xmlbeans.XmlInt oldState);
    
    /**
     * Unsets the "old-state" element
     */
    void unsetOldState();
    
    /**
     * Gets the "new-state" element
     */
    int getNewState();
    
    /**
     * Gets (as xml) the "new-state" element
     */
    org.apache.xmlbeans.XmlInt xgetNewState();
    
    /**
     * True if has "new-state" element
     */
    boolean isSetNewState();
    
    /**
     * Sets the "new-state" element
     */
    void setNewState(int newState);
    
    /**
     * Sets (as xml) the "new-state" element
     */
    void xsetNewState(org.apache.xmlbeans.XmlInt newState);
    
    /**
     * Unsets the "new-state" element
     */
    void unsetNewState();
    
    /**
     * Gets the "success" element
     */
    boolean getSuccess();
    
    /**
     * Gets (as xml) the "success" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSuccess();
    
    /**
     * True if has "success" element
     */
    boolean isSetSuccess();
    
    /**
     * Sets the "success" element
     */
    void setSuccess(boolean success);
    
    /**
     * Sets (as xml) the "success" element
     */
    void xsetSuccess(org.apache.xmlbeans.XmlBoolean success);
    
    /**
     * Unsets the "success" element
     */
    void unsetSuccess();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TEventInfo newInstance() {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TEventInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TEventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
