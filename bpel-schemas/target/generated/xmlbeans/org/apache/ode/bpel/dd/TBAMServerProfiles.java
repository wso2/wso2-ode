/*
 * XML Type:  tBAMServerProfiles
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TBAMServerProfiles
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd;


/**
 * An XML tBAMServerProfiles(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public interface TBAMServerProfiles extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TBAMServerProfiles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tbamserverprofilesb86ctype");
    
    /**
     * Gets a List of "profile" elements
     */
    java.util.List<org.apache.ode.bpel.dd.TBAMServerProfiles.Profile> getProfileList();
    
    /**
     * Gets array of all "profile" elements
     * @deprecated
     */
    org.apache.ode.bpel.dd.TBAMServerProfiles.Profile[] getProfileArray();
    
    /**
     * Gets ith "profile" element
     */
    org.apache.ode.bpel.dd.TBAMServerProfiles.Profile getProfileArray(int i);
    
    /**
     * Returns number of "profile" element
     */
    int sizeOfProfileArray();
    
    /**
     * Sets array of all "profile" element
     */
    void setProfileArray(org.apache.ode.bpel.dd.TBAMServerProfiles.Profile[] profileArray);
    
    /**
     * Sets ith "profile" element
     */
    void setProfileArray(int i, org.apache.ode.bpel.dd.TBAMServerProfiles.Profile profile);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "profile" element
     */
    org.apache.ode.bpel.dd.TBAMServerProfiles.Profile insertNewProfile(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "profile" element
     */
    org.apache.ode.bpel.dd.TBAMServerProfiles.Profile addNewProfile();
    
    /**
     * Removes the ith "profile" element
     */
    void removeProfile(int i);
    
    /**
     * An XML profile(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is a complex type.
     */
    public interface Profile extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Profile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("profile8541elemtype");
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "location" attribute
         */
        java.lang.String getLocation();
        
        /**
         * Gets (as xml) the "location" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocation();
        
        /**
         * Sets the "location" attribute
         */
        void setLocation(java.lang.String location);
        
        /**
         * Sets (as xml) the "location" attribute
         */
        void xsetLocation(org.apache.xmlbeans.XmlString location);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.dd.TBAMServerProfiles.Profile newInstance() {
              return (org.apache.ode.bpel.dd.TBAMServerProfiles.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.dd.TBAMServerProfiles.Profile newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.dd.TBAMServerProfiles.Profile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.dd.TBAMServerProfiles newInstance() {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TBAMServerProfiles parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TBAMServerProfiles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
