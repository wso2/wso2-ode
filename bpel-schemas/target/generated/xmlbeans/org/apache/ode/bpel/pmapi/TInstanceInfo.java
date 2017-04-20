/*
 * XML Type:  tInstanceInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TInstanceInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tInstanceInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TInstanceInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TInstanceInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tinstanceinfo42f6type");
    
    /**
     * Gets the "iid" element
     */
    java.lang.String getIid();
    
    /**
     * Gets (as xml) the "iid" element
     */
    org.apache.xmlbeans.XmlString xgetIid();
    
    /**
     * Sets the "iid" element
     */
    void setIid(java.lang.String iid);
    
    /**
     * Sets (as xml) the "iid" element
     */
    void xsetIid(org.apache.xmlbeans.XmlString iid);
    
    /**
     * Gets the "pid" element
     */
    java.lang.String getPid();
    
    /**
     * Gets (as xml) the "pid" element
     */
    org.apache.xmlbeans.XmlString xgetPid();
    
    /**
     * Sets the "pid" element
     */
    void setPid(java.lang.String pid);
    
    /**
     * Sets (as xml) the "pid" element
     */
    void xsetPid(org.apache.xmlbeans.XmlString pid);
    
    /**
     * Gets the "process-name" element
     */
    javax.xml.namespace.QName getProcessName();
    
    /**
     * Gets (as xml) the "process-name" element
     */
    org.apache.xmlbeans.XmlQName xgetProcessName();
    
    /**
     * Sets the "process-name" element
     */
    void setProcessName(javax.xml.namespace.QName processName);
    
    /**
     * Sets (as xml) the "process-name" element
     */
    void xsetProcessName(org.apache.xmlbeans.XmlQName processName);
    
    /**
     * Gets the "root-scope" element
     */
    org.apache.ode.bpel.pmapi.TScopeRef getRootScope();
    
    /**
     * True if has "root-scope" element
     */
    boolean isSetRootScope();
    
    /**
     * Sets the "root-scope" element
     */
    void setRootScope(org.apache.ode.bpel.pmapi.TScopeRef rootScope);
    
    /**
     * Appends and returns a new empty "root-scope" element
     */
    org.apache.ode.bpel.pmapi.TScopeRef addNewRootScope();
    
    /**
     * Unsets the "root-scope" element
     */
    void unsetRootScope();
    
    /**
     * Gets the "status" element
     */
    org.apache.ode.bpel.pmapi.TInstanceStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    org.apache.ode.bpel.pmapi.TInstanceStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.apache.ode.bpel.pmapi.TInstanceStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(org.apache.ode.bpel.pmapi.TInstanceStatus status);
    
    /**
     * Gets the "dt-started" element
     */
    java.util.Calendar getDtStarted();
    
    /**
     * Gets (as xml) the "dt-started" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtStarted();
    
    /**
     * Sets the "dt-started" element
     */
    void setDtStarted(java.util.Calendar dtStarted);
    
    /**
     * Sets (as xml) the "dt-started" element
     */
    void xsetDtStarted(org.apache.xmlbeans.XmlDateTime dtStarted);
    
    /**
     * Gets the "dt-last-active" element
     */
    java.util.Calendar getDtLastActive();
    
    /**
     * Gets (as xml) the "dt-last-active" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtLastActive();
    
    /**
     * Sets the "dt-last-active" element
     */
    void setDtLastActive(java.util.Calendar dtLastActive);
    
    /**
     * Sets (as xml) the "dt-last-active" element
     */
    void xsetDtLastActive(org.apache.xmlbeans.XmlDateTime dtLastActive);
    
    /**
     * Gets the "dt-error-since" element
     */
    java.util.Calendar getDtErrorSince();
    
    /**
     * Gets (as xml) the "dt-error-since" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtErrorSince();
    
    /**
     * True if has "dt-error-since" element
     */
    boolean isSetDtErrorSince();
    
    /**
     * Sets the "dt-error-since" element
     */
    void setDtErrorSince(java.util.Calendar dtErrorSince);
    
    /**
     * Sets (as xml) the "dt-error-since" element
     */
    void xsetDtErrorSince(org.apache.xmlbeans.XmlDateTime dtErrorSince);
    
    /**
     * Unsets the "dt-error-since" element
     */
    void unsetDtErrorSince();
    
    /**
     * Gets the "correlation-properties" element
     */
    org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties getCorrelationProperties();
    
    /**
     * True if has "correlation-properties" element
     */
    boolean isSetCorrelationProperties();
    
    /**
     * Sets the "correlation-properties" element
     */
    void setCorrelationProperties(org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties correlationProperties);
    
    /**
     * Appends and returns a new empty "correlation-properties" element
     */
    org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties addNewCorrelationProperties();
    
    /**
     * Unsets the "correlation-properties" element
     */
    void unsetCorrelationProperties();
    
    /**
     * Gets the "event-info" element
     */
    org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo getEventInfo();
    
    /**
     * True if has "event-info" element
     */
    boolean isSetEventInfo();
    
    /**
     * Sets the "event-info" element
     */
    void setEventInfo(org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo eventInfo);
    
    /**
     * Appends and returns a new empty "event-info" element
     */
    org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo addNewEventInfo();
    
    /**
     * Unsets the "event-info" element
     */
    void unsetEventInfo();
    
    /**
     * Gets the "fault-info" element
     */
    org.apache.ode.bpel.pmapi.TFaultInfo getFaultInfo();
    
    /**
     * True if has "fault-info" element
     */
    boolean isSetFaultInfo();
    
    /**
     * Sets the "fault-info" element
     */
    void setFaultInfo(org.apache.ode.bpel.pmapi.TFaultInfo faultInfo);
    
    /**
     * Appends and returns a new empty "fault-info" element
     */
    org.apache.ode.bpel.pmapi.TFaultInfo addNewFaultInfo();
    
    /**
     * Unsets the "fault-info" element
     */
    void unsetFaultInfo();
    
    /**
     * Gets the "failures" element
     */
    org.apache.ode.bpel.pmapi.TFailuresInfo getFailures();
    
    /**
     * True if has "failures" element
     */
    boolean isSetFailures();
    
    /**
     * Sets the "failures" element
     */
    void setFailures(org.apache.ode.bpel.pmapi.TFailuresInfo failures);
    
    /**
     * Appends and returns a new empty "failures" element
     */
    org.apache.ode.bpel.pmapi.TFailuresInfo addNewFailures();
    
    /**
     * Unsets the "failures" element
     */
    void unsetFailures();
    
    /**
     * An XML correlation-properties(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface CorrelationProperties extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CorrelationProperties.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("correlationproperties6170elemtype");
        
        /**
         * Gets a List of "correlation-property" elements
         */
        java.util.List<org.apache.ode.bpel.pmapi.TCorrelationProperty> getCorrelationPropertyList();
        
        /**
         * Gets array of all "correlation-property" elements
         * @deprecated
         */
        org.apache.ode.bpel.pmapi.TCorrelationProperty[] getCorrelationPropertyArray();
        
        /**
         * Gets ith "correlation-property" element
         */
        org.apache.ode.bpel.pmapi.TCorrelationProperty getCorrelationPropertyArray(int i);
        
        /**
         * Returns number of "correlation-property" element
         */
        int sizeOfCorrelationPropertyArray();
        
        /**
         * Sets array of all "correlation-property" element
         */
        void setCorrelationPropertyArray(org.apache.ode.bpel.pmapi.TCorrelationProperty[] correlationPropertyArray);
        
        /**
         * Sets ith "correlation-property" element
         */
        void setCorrelationPropertyArray(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty correlationProperty);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "correlation-property" element
         */
        org.apache.ode.bpel.pmapi.TCorrelationProperty insertNewCorrelationProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "correlation-property" element
         */
        org.apache.ode.bpel.pmapi.TCorrelationProperty addNewCorrelationProperty();
        
        /**
         * Removes the ith "correlation-property" element
         */
        void removeCorrelationProperty(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties newInstance() {
              return (org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML event-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface EventInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("eventinfo7653elemtype");
        
        /**
         * Gets the "count" element
         */
        int getCount();
        
        /**
         * Gets (as xml) the "count" element
         */
        org.apache.xmlbeans.XmlInt xgetCount();
        
        /**
         * Sets the "count" element
         */
        void setCount(int count);
        
        /**
         * Sets (as xml) the "count" element
         */
        void xsetCount(org.apache.xmlbeans.XmlInt count);
        
        /**
         * Gets the "first-dtime" element
         */
        java.util.Calendar getFirstDtime();
        
        /**
         * Gets (as xml) the "first-dtime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetFirstDtime();
        
        /**
         * Sets the "first-dtime" element
         */
        void setFirstDtime(java.util.Calendar firstDtime);
        
        /**
         * Sets (as xml) the "first-dtime" element
         */
        void xsetFirstDtime(org.apache.xmlbeans.XmlDateTime firstDtime);
        
        /**
         * Gets the "last-dtime" element
         */
        java.util.Calendar getLastDtime();
        
        /**
         * Gets (as xml) the "last-dtime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetLastDtime();
        
        /**
         * Sets the "last-dtime" element
         */
        void setLastDtime(java.util.Calendar lastDtime);
        
        /**
         * Sets (as xml) the "last-dtime" element
         */
        void xsetLastDtime(org.apache.xmlbeans.XmlDateTime lastDtime);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo newInstance() {
              return (org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TInstanceInfo newInstance() {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TInstanceInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TInstanceInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
