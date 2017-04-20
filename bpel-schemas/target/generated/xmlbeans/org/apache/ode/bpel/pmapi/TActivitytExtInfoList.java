/*
 * XML Type:  tActivitytExtInfoList
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TActivitytExtInfoList
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tActivitytExtInfoList(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TActivitytExtInfoList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TActivitytExtInfoList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tactivitytextinfolist1cfbtype");
    
    /**
     * Gets a List of "activity-ext-info" elements
     */
    java.util.List<org.apache.ode.bpel.pmapi.TActivityExtInfo> getActivityExtInfoList();
    
    /**
     * Gets array of all "activity-ext-info" elements
     * @deprecated
     */
    org.apache.ode.bpel.pmapi.TActivityExtInfo[] getActivityExtInfoArray();
    
    /**
     * Gets ith "activity-ext-info" element
     */
    org.apache.ode.bpel.pmapi.TActivityExtInfo getActivityExtInfoArray(int i);
    
    /**
     * Returns number of "activity-ext-info" element
     */
    int sizeOfActivityExtInfoArray();
    
    /**
     * Sets array of all "activity-ext-info" element
     */
    void setActivityExtInfoArray(org.apache.ode.bpel.pmapi.TActivityExtInfo[] activityExtInfoArray);
    
    /**
     * Sets ith "activity-ext-info" element
     */
    void setActivityExtInfoArray(int i, org.apache.ode.bpel.pmapi.TActivityExtInfo activityExtInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activity-ext-info" element
     */
    org.apache.ode.bpel.pmapi.TActivityExtInfo insertNewActivityExtInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activity-ext-info" element
     */
    org.apache.ode.bpel.pmapi.TActivityExtInfo addNewActivityExtInfo();
    
    /**
     * Removes the ith "activity-ext-info" element
     */
    void removeActivityExtInfo(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList newInstance() {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TActivitytExtInfoList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TActivitytExtInfoList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
