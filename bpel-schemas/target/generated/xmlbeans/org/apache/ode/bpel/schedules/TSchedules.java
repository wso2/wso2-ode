/*
 * XML Type:  tSchedules
 * Namespace: http://www.apache.org/ode/schemas/schedules/2009/05
 * Java type: org.apache.ode.bpel.schedules.TSchedules
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.schedules;


/**
 * An XML tSchedules(@http://www.apache.org/ode/schemas/schedules/2009/05).
 *
 * This is a complex type.
 */
public interface TSchedules extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TSchedules.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tschedules1a0dtype");
    
    /**
     * Gets a List of "schedule" elements
     */
    java.util.List<org.apache.ode.bpel.schedules.TSchedule> getScheduleList();
    
    /**
     * Gets array of all "schedule" elements
     * @deprecated
     */
    org.apache.ode.bpel.schedules.TSchedule[] getScheduleArray();
    
    /**
     * Gets ith "schedule" element
     */
    org.apache.ode.bpel.schedules.TSchedule getScheduleArray(int i);
    
    /**
     * Returns number of "schedule" element
     */
    int sizeOfScheduleArray();
    
    /**
     * Sets array of all "schedule" element
     */
    void setScheduleArray(org.apache.ode.bpel.schedules.TSchedule[] scheduleArray);
    
    /**
     * Sets ith "schedule" element
     */
    void setScheduleArray(int i, org.apache.ode.bpel.schedules.TSchedule schedule);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schedule" element
     */
    org.apache.ode.bpel.schedules.TSchedule insertNewSchedule(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schedule" element
     */
    org.apache.ode.bpel.schedules.TSchedule addNewSchedule();
    
    /**
     * Removes the ith "schedule" element
     */
    void removeSchedule(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.schedules.TSchedules newInstance() {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.schedules.TSchedules parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.schedules.TSchedules parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.schedules.TSchedules parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.schedules.TSchedules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
