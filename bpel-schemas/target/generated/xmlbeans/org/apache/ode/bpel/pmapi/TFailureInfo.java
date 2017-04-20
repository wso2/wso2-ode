/*
 * XML Type:  tFailureInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TFailureInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tFailureInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TFailureInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TFailureInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tfailureinfo7cb5type");
    
    /**
     * Gets the "dt-failure" element
     */
    java.util.Calendar getDtFailure();
    
    /**
     * Gets (as xml) the "dt-failure" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDtFailure();
    
    /**
     * Sets the "dt-failure" element
     */
    void setDtFailure(java.util.Calendar dtFailure);
    
    /**
     * Sets (as xml) the "dt-failure" element
     */
    void xsetDtFailure(org.apache.xmlbeans.XmlDateTime dtFailure);
    
    /**
     * Gets the "retries" element
     */
    int getRetries();
    
    /**
     * Gets (as xml) the "retries" element
     */
    org.apache.xmlbeans.XmlInt xgetRetries();
    
    /**
     * Sets the "retries" element
     */
    void setRetries(int retries);
    
    /**
     * Sets (as xml) the "retries" element
     */
    void xsetRetries(org.apache.xmlbeans.XmlInt retries);
    
    /**
     * Gets the "reason" element
     */
    java.lang.String getReason();
    
    /**
     * Gets (as xml) the "reason" element
     */
    org.apache.xmlbeans.XmlString xgetReason();
    
    /**
     * Sets the "reason" element
     */
    void setReason(java.lang.String reason);
    
    /**
     * Sets (as xml) the "reason" element
     */
    void xsetReason(org.apache.xmlbeans.XmlString reason);
    
    /**
     * Gets the "actions" element
     */
    java.lang.String getActions();
    
    /**
     * Gets (as xml) the "actions" element
     */
    org.apache.xmlbeans.XmlString xgetActions();
    
    /**
     * Sets the "actions" element
     */
    void setActions(java.lang.String actions);
    
    /**
     * Sets (as xml) the "actions" element
     */
    void xsetActions(org.apache.xmlbeans.XmlString actions);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TFailureInfo newInstance() {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TFailureInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TFailureInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
