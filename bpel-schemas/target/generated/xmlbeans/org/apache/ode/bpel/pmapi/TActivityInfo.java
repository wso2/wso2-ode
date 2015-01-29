/*
 * XML Type:  tActivityInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TActivityInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tActivityInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TActivityInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TActivityInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tactivityinfoc1f0type");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
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
     * Gets the "aiid" element
     */
    java.lang.String getAiid();
    
    /**
     * Gets (as xml) the "aiid" element
     */
    org.apache.xmlbeans.XmlString xgetAiid();
    
    /**
     * Sets the "aiid" element
     */
    void setAiid(java.lang.String aiid);
    
    /**
     * Sets (as xml) the "aiid" element
     */
    void xsetAiid(org.apache.xmlbeans.XmlString aiid);
    
    /**
     * Gets the "status" element
     */
    org.apache.ode.bpel.pmapi.TActivityStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    org.apache.ode.bpel.pmapi.TActivityStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.apache.ode.bpel.pmapi.TActivityStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(org.apache.ode.bpel.pmapi.TActivityStatus status);
    
    /**
     * Gets the "scope" element
     */
    org.apache.ode.bpel.pmapi.TScopeRef getScope();
    
    /**
     * True if has "scope" element
     */
    boolean isSetScope();
    
    /**
     * Sets the "scope" element
     */
    void setScope(org.apache.ode.bpel.pmapi.TScopeRef scope);
    
    /**
     * Appends and returns a new empty "scope" element
     */
    org.apache.ode.bpel.pmapi.TScopeRef addNewScope();
    
    /**
     * Unsets the "scope" element
     */
    void unsetScope();
    
    /**
     * Gets the "dt-enabled" element
     */
    java.util.Calendar getDtEnabled();
    
    /**
     * Gets (as xml) the "dt-enabled" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtEnabled();
    
    /**
     * True if has "dt-enabled" element
     */
    boolean isSetDtEnabled();
    
    /**
     * Sets the "dt-enabled" element
     */
    void setDtEnabled(java.util.Calendar dtEnabled);
    
    /**
     * Sets (as xml) the "dt-enabled" element
     */
    void xsetDtEnabled(org.apache.xmlbeans.XmlDateTime dtEnabled);
    
    /**
     * Unsets the "dt-enabled" element
     */
    void unsetDtEnabled();
    
    /**
     * Gets the "dt-started" element
     */
    java.util.Calendar getDtStarted();
    
    /**
     * Gets (as xml) the "dt-started" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtStarted();
    
    /**
     * True if has "dt-started" element
     */
    boolean isSetDtStarted();
    
    /**
     * Sets the "dt-started" element
     */
    void setDtStarted(java.util.Calendar dtStarted);
    
    /**
     * Sets (as xml) the "dt-started" element
     */
    void xsetDtStarted(org.apache.xmlbeans.XmlDateTime dtStarted);
    
    /**
     * Unsets the "dt-started" element
     */
    void unsetDtStarted();
    
    /**
     * Gets the "dt-completed" element
     */
    java.util.Calendar getDtCompleted();
    
    /**
     * Gets (as xml) the "dt-completed" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtCompleted();
    
    /**
     * True if has "dt-completed" element
     */
    boolean isSetDtCompleted();
    
    /**
     * Sets the "dt-completed" element
     */
    void setDtCompleted(java.util.Calendar dtCompleted);
    
    /**
     * Sets (as xml) the "dt-completed" element
     */
    void xsetDtCompleted(org.apache.xmlbeans.XmlDateTime dtCompleted);
    
    /**
     * Unsets the "dt-completed" element
     */
    void unsetDtCompleted();
    
    /**
     * Gets the "failure" element
     */
    org.apache.ode.bpel.pmapi.TFailureInfo getFailure();
    
    /**
     * True if has "failure" element
     */
    boolean isSetFailure();
    
    /**
     * Sets the "failure" element
     */
    void setFailure(org.apache.ode.bpel.pmapi.TFailureInfo failure);
    
    /**
     * Appends and returns a new empty "failure" element
     */
    org.apache.ode.bpel.pmapi.TFailureInfo addNewFailure();
    
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
        public static org.apache.ode.bpel.pmapi.TActivityInfo newInstance() {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TActivityInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TActivityInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
