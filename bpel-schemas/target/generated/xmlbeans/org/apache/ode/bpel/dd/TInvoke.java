/*
 * XML Type:  tInvoke
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TInvoke
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd;


/**
 * An XML tInvoke(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public interface TInvoke extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TInvoke.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tinvoke47d9type");
    
    /**
     * Gets the "service" element
     */
    org.apache.ode.bpel.dd.TService getService();
    
    /**
     * Sets the "service" element
     */
    void setService(org.apache.ode.bpel.dd.TService service);
    
    /**
     * Appends and returns a new empty "service" element
     */
    org.apache.ode.bpel.dd.TService addNewService();
    
    /**
     * Gets the "binding" element
     */
    org.apache.ode.bpel.dd.TInvoke.Binding getBinding();
    
    /**
     * True if has "binding" element
     */
    boolean isSetBinding();
    
    /**
     * Sets the "binding" element
     */
    void setBinding(org.apache.ode.bpel.dd.TInvoke.Binding binding);
    
    /**
     * Appends and returns a new empty "binding" element
     */
    org.apache.ode.bpel.dd.TInvoke.Binding addNewBinding();
    
    /**
     * Unsets the "binding" element
     */
    void unsetBinding();
    
    /**
     * Gets the "failureHandling" element
     */
    org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling getFailureHandling();
    
    /**
     * True if has "failureHandling" element
     */
    boolean isSetFailureHandling();
    
    /**
     * Sets the "failureHandling" element
     */
    void setFailureHandling(org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling failureHandling);
    
    /**
     * Appends and returns a new empty "failureHandling" element
     */
    org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling addNewFailureHandling();
    
    /**
     * Unsets the "failureHandling" element
     */
    void unsetFailureHandling();
    
    /**
     * Gets the "partnerLink" attribute
     */
    java.lang.String getPartnerLink();
    
    /**
     * Gets (as xml) the "partnerLink" attribute
     */
    org.apache.xmlbeans.XmlString xgetPartnerLink();
    
    /**
     * Sets the "partnerLink" attribute
     */
    void setPartnerLink(java.lang.String partnerLink);
    
    /**
     * Sets (as xml) the "partnerLink" attribute
     */
    void xsetPartnerLink(org.apache.xmlbeans.XmlString partnerLink);
    
    /**
     * Gets the "usePeer2Peer" attribute
     */
    boolean getUsePeer2Peer();
    
    /**
     * Gets (as xml) the "usePeer2Peer" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUsePeer2Peer();
    
    /**
     * True if has "usePeer2Peer" attribute
     */
    boolean isSetUsePeer2Peer();
    
    /**
     * Sets the "usePeer2Peer" attribute
     */
    void setUsePeer2Peer(boolean usePeer2Peer);
    
    /**
     * Sets (as xml) the "usePeer2Peer" attribute
     */
    void xsetUsePeer2Peer(org.apache.xmlbeans.XmlBoolean usePeer2Peer);
    
    /**
     * Unsets the "usePeer2Peer" attribute
     */
    void unsetUsePeer2Peer();
    
    /**
     * An XML binding(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is a complex type.
     */
    public interface Binding extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Binding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("bindingc1c8elemtype");
        
        /**
         * Gets the "name" attribute
         */
        javax.xml.namespace.QName getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlQName xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(javax.xml.namespace.QName name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlQName name);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.dd.TInvoke.Binding newInstance() {
              return (org.apache.ode.bpel.dd.TInvoke.Binding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.dd.TInvoke.Binding newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.dd.TInvoke.Binding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.dd.TInvoke newInstance() {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.dd.TInvoke parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.dd.TInvoke parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.dd.TInvoke parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TInvoke parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TInvoke parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TInvoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
