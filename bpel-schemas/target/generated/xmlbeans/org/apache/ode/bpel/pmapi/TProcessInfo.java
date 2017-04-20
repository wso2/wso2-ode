/*
 * XML Type:  tProcessInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TProcessInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tProcessInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TProcessInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TProcessInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tprocessinfoabdatype");
    
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
     * Gets the "status" element
     */
    org.apache.ode.bpel.pmapi.TProcessStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    org.apache.ode.bpel.pmapi.TProcessStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.apache.ode.bpel.pmapi.TProcessStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(org.apache.ode.bpel.pmapi.TProcessStatus status);
    
    /**
     * Gets the "version" element
     */
    long getVersion();
    
    /**
     * Gets (as xml) the "version" element
     */
    org.apache.xmlbeans.XmlLong xgetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(long version);
    
    /**
     * Sets (as xml) the "version" element
     */
    void xsetVersion(org.apache.xmlbeans.XmlLong version);
    
    /**
     * Gets the "definition-info" element
     */
    org.apache.ode.bpel.pmapi.TDefinitionInfo getDefinitionInfo();
    
    /**
     * Sets the "definition-info" element
     */
    void setDefinitionInfo(org.apache.ode.bpel.pmapi.TDefinitionInfo definitionInfo);
    
    /**
     * Appends and returns a new empty "definition-info" element
     */
    org.apache.ode.bpel.pmapi.TDefinitionInfo addNewDefinitionInfo();
    
    /**
     * Gets the "deployment-info" element
     */
    org.apache.ode.bpel.pmapi.TDeploymentInfo getDeploymentInfo();
    
    /**
     * Sets the "deployment-info" element
     */
    void setDeploymentInfo(org.apache.ode.bpel.pmapi.TDeploymentInfo deploymentInfo);
    
    /**
     * Appends and returns a new empty "deployment-info" element
     */
    org.apache.ode.bpel.pmapi.TDeploymentInfo addNewDeploymentInfo();
    
    /**
     * Gets the "instance-summary" element
     */
    org.apache.ode.bpel.pmapi.TInstanceSummary getInstanceSummary();
    
    /**
     * True if has "instance-summary" element
     */
    boolean isSetInstanceSummary();
    
    /**
     * Sets the "instance-summary" element
     */
    void setInstanceSummary(org.apache.ode.bpel.pmapi.TInstanceSummary instanceSummary);
    
    /**
     * Appends and returns a new empty "instance-summary" element
     */
    org.apache.ode.bpel.pmapi.TInstanceSummary addNewInstanceSummary();
    
    /**
     * Unsets the "instance-summary" element
     */
    void unsetInstanceSummary();
    
    /**
     * Gets the "properties" element
     */
    org.apache.ode.bpel.pmapi.TProcessProperties getProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(org.apache.ode.bpel.pmapi.TProcessProperties properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    org.apache.ode.bpel.pmapi.TProcessProperties addNewProperties();
    
    /**
     * Gets the "endpoints" element
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences getEndpoints();
    
    /**
     * Sets the "endpoints" element
     */
    void setEndpoints(org.apache.ode.bpel.pmapi.TEndpointReferences endpoints);
    
    /**
     * Appends and returns a new empty "endpoints" element
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences addNewEndpoints();
    
    /**
     * Gets the "documents" element
     */
    org.apache.ode.bpel.pmapi.TProcessInfo.Documents getDocuments();
    
    /**
     * Sets the "documents" element
     */
    void setDocuments(org.apache.ode.bpel.pmapi.TProcessInfo.Documents documents);
    
    /**
     * Appends and returns a new empty "documents" element
     */
    org.apache.ode.bpel.pmapi.TProcessInfo.Documents addNewDocuments();
    
    /**
     * An XML documents(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface Documents extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Documents.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("documentsfb36elemtype");
        
        /**
         * Gets a List of "document" elements
         */
        java.util.List<org.apache.ode.bpel.pmapi.TDocumentInfo> getDocumentList();
        
        /**
         * Gets array of all "document" elements
         * @deprecated
         */
        org.apache.ode.bpel.pmapi.TDocumentInfo[] getDocumentArray();
        
        /**
         * Gets ith "document" element
         */
        org.apache.ode.bpel.pmapi.TDocumentInfo getDocumentArray(int i);
        
        /**
         * Returns number of "document" element
         */
        int sizeOfDocumentArray();
        
        /**
         * Sets array of all "document" element
         */
        void setDocumentArray(org.apache.ode.bpel.pmapi.TDocumentInfo[] documentArray);
        
        /**
         * Sets ith "document" element
         */
        void setDocumentArray(int i, org.apache.ode.bpel.pmapi.TDocumentInfo document);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "document" element
         */
        org.apache.ode.bpel.pmapi.TDocumentInfo insertNewDocument(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "document" element
         */
        org.apache.ode.bpel.pmapi.TDocumentInfo addNewDocument();
        
        /**
         * Removes the ith "document" element
         */
        void removeDocument(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TProcessInfo.Documents newInstance() {
              return (org.apache.ode.bpel.pmapi.TProcessInfo.Documents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TProcessInfo.Documents newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TProcessInfo.Documents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TProcessInfo newInstance() {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TProcessInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TProcessInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
