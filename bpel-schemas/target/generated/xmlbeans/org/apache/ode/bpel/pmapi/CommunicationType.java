/*
 * XML Type:  CommunicationType
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.CommunicationType
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML CommunicationType(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface CommunicationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CommunicationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("communicationtype4dcftype");
    
    /**
     * Gets the "processType" element
     */
    javax.xml.namespace.QName getProcessType();
    
    /**
     * Gets (as xml) the "processType" element
     */
    org.apache.xmlbeans.XmlQName xgetProcessType();
    
    /**
     * Sets the "processType" element
     */
    void setProcessType(javax.xml.namespace.QName processType);
    
    /**
     * Sets (as xml) the "processType" element
     */
    void xsetProcessType(org.apache.xmlbeans.XmlQName processType);
    
    /**
     * Gets the "rollbackOnFault" element
     */
    boolean getRollbackOnFault();
    
    /**
     * Gets (as xml) the "rollbackOnFault" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRollbackOnFault();
    
    /**
     * True if has "rollbackOnFault" element
     */
    boolean isSetRollbackOnFault();
    
    /**
     * Sets the "rollbackOnFault" element
     */
    void setRollbackOnFault(boolean rollbackOnFault);
    
    /**
     * Sets (as xml) the "rollbackOnFault" element
     */
    void xsetRollbackOnFault(org.apache.xmlbeans.XmlBoolean rollbackOnFault);
    
    /**
     * Unsets the "rollbackOnFault" element
     */
    void unsetRollbackOnFault();
    
    /**
     * Gets a List of "serviceConfig" elements
     */
    java.util.List<org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig> getServiceConfigList();
    
    /**
     * Gets array of all "serviceConfig" elements
     * @deprecated
     */
    org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig[] getServiceConfigArray();
    
    /**
     * Gets ith "serviceConfig" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig getServiceConfigArray(int i);
    
    /**
     * Returns number of "serviceConfig" element
     */
    int sizeOfServiceConfigArray();
    
    /**
     * Sets array of all "serviceConfig" element
     */
    void setServiceConfigArray(org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig[] serviceConfigArray);
    
    /**
     * Sets ith "serviceConfig" element
     */
    void setServiceConfigArray(int i, org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig serviceConfig);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceConfig" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig insertNewServiceConfig(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceConfig" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig addNewServiceConfig();
    
    /**
     * Removes the ith "serviceConfig" element
     */
    void removeServiceConfig(int i);
    
    /**
     * Gets a List of "exchange" elements
     */
    java.util.List<org.apache.ode.bpel.pmapi.CommunicationType.Exchange> getExchangeList();
    
    /**
     * Gets array of all "exchange" elements
     * @deprecated
     */
    org.apache.ode.bpel.pmapi.CommunicationType.Exchange[] getExchangeArray();
    
    /**
     * Gets ith "exchange" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType.Exchange getExchangeArray(int i);
    
    /**
     * Returns number of "exchange" element
     */
    int sizeOfExchangeArray();
    
    /**
     * Sets array of all "exchange" element
     */
    void setExchangeArray(org.apache.ode.bpel.pmapi.CommunicationType.Exchange[] exchangeArray);
    
    /**
     * Sets ith "exchange" element
     */
    void setExchangeArray(int i, org.apache.ode.bpel.pmapi.CommunicationType.Exchange exchange);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exchange" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType.Exchange insertNewExchange(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exchange" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType.Exchange addNewExchange();
    
    /**
     * Removes the ith "exchange" element
     */
    void removeExchange(int i);
    
    /**
     * An XML serviceConfig(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface ServiceConfig extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("serviceconfig2052elemtype");
        
        /**
         * Gets the "service" element
         */
        javax.xml.namespace.QName getService();
        
        /**
         * Gets (as xml) the "service" element
         */
        org.apache.xmlbeans.XmlQName xgetService();
        
        /**
         * Sets the "service" element
         */
        void setService(javax.xml.namespace.QName service);
        
        /**
         * Sets (as xml) the "service" element
         */
        void xsetService(org.apache.xmlbeans.XmlQName service);
        
        /**
         * Gets the "replayType" element
         */
        org.apache.ode.bpel.pmapi.ReplayType getReplayType();
        
        /**
         * Sets the "replayType" element
         */
        void setReplayType(org.apache.ode.bpel.pmapi.ReplayType replayType);
        
        /**
         * Appends and returns a new empty "replayType" element
         */
        org.apache.ode.bpel.pmapi.ReplayType addNewReplayType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig newInstance() {
              return (org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML exchange(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface Exchange extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Exchange.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("exchange094eelemtype");
        
        /**
         * Gets the "type" element
         */
        org.apache.ode.bpel.pmapi.ExchangeType.Enum getType();
        
        /**
         * Gets (as xml) the "type" element
         */
        org.apache.ode.bpel.pmapi.ExchangeType xgetType();
        
        /**
         * Sets the "type" element
         */
        void setType(org.apache.ode.bpel.pmapi.ExchangeType.Enum type);
        
        /**
         * Sets (as xml) the "type" element
         */
        void xsetType(org.apache.ode.bpel.pmapi.ExchangeType type);
        
        /**
         * Gets the "createTime" element
         */
        java.util.Calendar getCreateTime();
        
        /**
         * Gets (as xml) the "createTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCreateTime();
        
        /**
         * Sets the "createTime" element
         */
        void setCreateTime(java.util.Calendar createTime);
        
        /**
         * Sets (as xml) the "createTime" element
         */
        void xsetCreateTime(org.apache.xmlbeans.XmlDateTime createTime);
        
        /**
         * Gets the "service" element
         */
        javax.xml.namespace.QName getService();
        
        /**
         * Gets (as xml) the "service" element
         */
        org.apache.xmlbeans.XmlQName xgetService();
        
        /**
         * Sets the "service" element
         */
        void setService(javax.xml.namespace.QName service);
        
        /**
         * Sets (as xml) the "service" element
         */
        void xsetService(org.apache.xmlbeans.XmlQName service);
        
        /**
         * Gets the "operation" element
         */
        java.lang.String getOperation();
        
        /**
         * Gets (as xml) the "operation" element
         */
        org.apache.xmlbeans.XmlString xgetOperation();
        
        /**
         * Sets the "operation" element
         */
        void setOperation(java.lang.String operation);
        
        /**
         * Sets (as xml) the "operation" element
         */
        void xsetOperation(org.apache.xmlbeans.XmlString operation);
        
        /**
         * Gets the "in" element
         */
        org.apache.xmlbeans.XmlObject getIn();
        
        /**
         * Sets the "in" element
         */
        void setIn(org.apache.xmlbeans.XmlObject in);
        
        /**
         * Appends and returns a new empty "in" element
         */
        org.apache.xmlbeans.XmlObject addNewIn();
        
        /**
         * Gets the "out" element
         */
        org.apache.xmlbeans.XmlObject getOut();
        
        /**
         * True if has "out" element
         */
        boolean isSetOut();
        
        /**
         * Sets the "out" element
         */
        void setOut(org.apache.xmlbeans.XmlObject out);
        
        /**
         * Appends and returns a new empty "out" element
         */
        org.apache.xmlbeans.XmlObject addNewOut();
        
        /**
         * Unsets the "out" element
         */
        void unsetOut();
        
        /**
         * Gets the "fault" element
         */
        org.apache.ode.bpel.pmapi.FaultType getFault();
        
        /**
         * True if has "fault" element
         */
        boolean isSetFault();
        
        /**
         * Sets the "fault" element
         */
        void setFault(org.apache.ode.bpel.pmapi.FaultType fault);
        
        /**
         * Appends and returns a new empty "fault" element
         */
        org.apache.ode.bpel.pmapi.FaultType addNewFault();
        
        /**
         * Unsets the "fault" element
         */
        void unsetFault();
        
        /**
         * Gets the "failure" element
         */
        org.apache.ode.bpel.pmapi.FailureType getFailure();
        
        /**
         * True if has "failure" element
         */
        boolean isSetFailure();
        
        /**
         * Sets the "failure" element
         */
        void setFailure(org.apache.ode.bpel.pmapi.FailureType failure);
        
        /**
         * Appends and returns a new empty "failure" element
         */
        org.apache.ode.bpel.pmapi.FailureType addNewFailure();
        
        /**
         * Unsets the "failure" element
         */
        void unsetFailure();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.CommunicationType.Exchange newInstance() {
              return (org.apache.ode.bpel.pmapi.CommunicationType.Exchange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.CommunicationType.Exchange newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.CommunicationType.Exchange) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.CommunicationType newInstance() {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.CommunicationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.CommunicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
