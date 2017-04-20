/*
 * XML Type:  tSchedule
 * Namespace: http://www.apache.org/ode/schemas/schedules/2009/05
 * Java type: org.apache.ode.bpel.schedules.TSchedule
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.schedules;


/**
 * An XML tSchedule(@http://www.apache.org/ode/schemas/schedules/2009/05).
 *
 * This is a complex type.
 */
public interface TSchedule extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSchedule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tschedule449etype");
    
    /**
     * Gets a List of "cleanup" elements
     */
    java.util.List<org.apache.ode.bpel.dd.TCleanup> getCleanupList();
    
    /**
     * Gets array of all "cleanup" elements
     * @deprecated
     */
    org.apache.ode.bpel.dd.TCleanup[] getCleanupArray();
    
    /**
     * Gets ith "cleanup" element
     */
    org.apache.ode.bpel.dd.TCleanup getCleanupArray(int i);
    
    /**
     * Returns number of "cleanup" element
     */
    int sizeOfCleanupArray();
    
    /**
     * Sets array of all "cleanup" element
     */
    void setCleanupArray(org.apache.ode.bpel.dd.TCleanup[] cleanupArray);
    
    /**
     * Sets ith "cleanup" element
     */
    void setCleanupArray(int i, org.apache.ode.bpel.dd.TCleanup cleanup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cleanup" element
     */
    org.apache.ode.bpel.dd.TCleanup insertNewCleanup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cleanup" element
     */
    org.apache.ode.bpel.dd.TCleanup addNewCleanup();
    
    /**
     * Removes the ith "cleanup" element
     */
    void removeCleanup(int i);
    
    /**
     * Gets the "when" attribute
     */
    java.lang.String getWhen();
    
    /**
     * Gets (as xml) the "when" attribute
     */
    org.apache.xmlbeans.XmlString xgetWhen();
    
    /**
     * Sets the "when" attribute
     */
    void setWhen(java.lang.String when);
    
    /**
     * Sets (as xml) the "when" attribute
     */
    void xsetWhen(org.apache.xmlbeans.XmlString when);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.schedules.TSchedule newInstance() {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedule parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.schedules.TSchedule parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.schedules.TSchedule parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.schedules.TSchedule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
