/*
 * An XML document type.
 * Localname: failureHandling
 * Namespace: http://ode.apache.org/activityRecovery
 * Java type: org.apache.ode.activityRecovery.FailureHandlingDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.activityRecovery;


/**
 * A document containing one failureHandling(@http://ode.apache.org/activityRecovery) element.
 *
 * This is a complex type.
 */
public interface FailureHandlingDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FailureHandlingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("failurehandlingc4a9doctype");
    
    /**
     * Gets the "failureHandling" element
     */
    org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling getFailureHandling();
    
    /**
     * Sets the "failureHandling" element
     */
    void setFailureHandling(org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling failureHandling);
    
    /**
     * Appends and returns a new empty "failureHandling" element
     */
    org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling addNewFailureHandling();
    
    /**
     * An XML failureHandling(@http://ode.apache.org/activityRecovery).
     *
     * This is a complex type.
     */
    public interface FailureHandling extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FailureHandling.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("failurehandlingb00eelemtype");
        
        /**
         * Gets the "retryFor" element
         */
        int getRetryFor();
        
        /**
         * Gets (as xml) the "retryFor" element
         */
        org.apache.xmlbeans.XmlInt xgetRetryFor();
        
        /**
         * True if has "retryFor" element
         */
        boolean isSetRetryFor();
        
        /**
         * Sets the "retryFor" element
         */
        void setRetryFor(int retryFor);
        
        /**
         * Sets (as xml) the "retryFor" element
         */
        void xsetRetryFor(org.apache.xmlbeans.XmlInt retryFor);
        
        /**
         * Unsets the "retryFor" element
         */
        void unsetRetryFor();
        
        /**
         * Gets the "retryDelay" element
         */
        int getRetryDelay();
        
        /**
         * Gets (as xml) the "retryDelay" element
         */
        org.apache.xmlbeans.XmlInt xgetRetryDelay();
        
        /**
         * True if has "retryDelay" element
         */
        boolean isSetRetryDelay();
        
        /**
         * Sets the "retryDelay" element
         */
        void setRetryDelay(int retryDelay);
        
        /**
         * Sets (as xml) the "retryDelay" element
         */
        void xsetRetryDelay(org.apache.xmlbeans.XmlInt retryDelay);
        
        /**
         * Unsets the "retryDelay" element
         */
        void unsetRetryDelay();
        
        /**
         * Gets the "faultOnFailure" element
         */
        boolean getFaultOnFailure();
        
        /**
         * Gets (as xml) the "faultOnFailure" element
         */
        org.apache.xmlbeans.XmlBoolean xgetFaultOnFailure();
        
        /**
         * True if has "faultOnFailure" element
         */
        boolean isSetFaultOnFailure();
        
        /**
         * Sets the "faultOnFailure" element
         */
        void setFaultOnFailure(boolean faultOnFailure);
        
        /**
         * Sets (as xml) the "faultOnFailure" element
         */
        void xsetFaultOnFailure(org.apache.xmlbeans.XmlBoolean faultOnFailure);
        
        /**
         * Unsets the "faultOnFailure" element
         */
        void unsetFaultOnFailure();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling newInstance() {
              return (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.activityRecovery.FailureHandlingDocument newInstance() {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.activityRecovery.FailureHandlingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.activityRecovery.FailureHandlingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
