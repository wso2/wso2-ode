/*
 * XML Type:  tInstanceSummary
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TInstanceSummary
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tInstanceSummary(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TInstanceSummary extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TInstanceSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tinstancesummary6deetype");
    
    /**
     * Gets a List of "instances" elements
     */
    java.util.List<org.apache.ode.bpel.pmapi.TInstanceSummary.Instances> getInstancesList();
    
    /**
     * Gets array of all "instances" elements
     * @deprecated
     */
    org.apache.ode.bpel.pmapi.TInstanceSummary.Instances[] getInstancesArray();
    
    /**
     * Gets ith "instances" element
     */
    org.apache.ode.bpel.pmapi.TInstanceSummary.Instances getInstancesArray(int i);
    
    /**
     * Returns number of "instances" element
     */
    int sizeOfInstancesArray();
    
    /**
     * Sets array of all "instances" element
     */
    void setInstancesArray(org.apache.ode.bpel.pmapi.TInstanceSummary.Instances[] instancesArray);
    
    /**
     * Sets ith "instances" element
     */
    void setInstancesArray(int i, org.apache.ode.bpel.pmapi.TInstanceSummary.Instances instances);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instances" element
     */
    org.apache.ode.bpel.pmapi.TInstanceSummary.Instances insertNewInstances(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instances" element
     */
    org.apache.ode.bpel.pmapi.TInstanceSummary.Instances addNewInstances();
    
    /**
     * Removes the ith "instances" element
     */
    void removeInstances(int i);
    
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
     * An XML instances(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface Instances extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Instances.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("instances9f44elemtype");
        
        /**
         * Gets the "state" attribute
         */
        org.apache.ode.bpel.pmapi.TInstanceStatus.Enum getState();
        
        /**
         * Gets (as xml) the "state" attribute
         */
        org.apache.ode.bpel.pmapi.TInstanceStatus xgetState();
        
        /**
         * Sets the "state" attribute
         */
        void setState(org.apache.ode.bpel.pmapi.TInstanceStatus.Enum state);
        
        /**
         * Sets (as xml) the "state" attribute
         */
        void xsetState(org.apache.ode.bpel.pmapi.TInstanceStatus state);
        
        /**
         * Gets the "count" attribute
         */
        int getCount();
        
        /**
         * Gets (as xml) the "count" attribute
         */
        org.apache.xmlbeans.XmlInt xgetCount();
        
        /**
         * Sets the "count" attribute
         */
        void setCount(int count);
        
        /**
         * Sets (as xml) the "count" attribute
         */
        void xsetCount(org.apache.xmlbeans.XmlInt count);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TInstanceSummary.Instances newInstance() {
              return (org.apache.ode.bpel.pmapi.TInstanceSummary.Instances) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TInstanceSummary.Instances newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TInstanceSummary.Instances) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TInstanceSummary newInstance() {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TInstanceSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TInstanceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
