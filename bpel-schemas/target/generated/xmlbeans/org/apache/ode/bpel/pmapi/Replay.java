/*
 * XML Type:  Replay
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.Replay
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML Replay(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface Replay extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Replay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("replayc078type");
    
    /**
     * Gets a List of "upgradeInstance" elements
     */
    java.util.List<java.lang.Long> getUpgradeInstanceList();
    
    /**
     * Gets array of all "upgradeInstance" elements
     * @deprecated
     */
    long[] getUpgradeInstanceArray();
    
    /**
     * Gets ith "upgradeInstance" element
     */
    long getUpgradeInstanceArray(int i);
    
    /**
     * Gets (as xml) a List of "upgradeInstance" elements
     */
    java.util.List<org.apache.xmlbeans.XmlLong> xgetUpgradeInstanceList();
    
    /**
     * Gets (as xml) array of all "upgradeInstance" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlLong[] xgetUpgradeInstanceArray();
    
    /**
     * Gets (as xml) ith "upgradeInstance" element
     */
    org.apache.xmlbeans.XmlLong xgetUpgradeInstanceArray(int i);
    
    /**
     * Returns number of "upgradeInstance" element
     */
    int sizeOfUpgradeInstanceArray();
    
    /**
     * Sets array of all "upgradeInstance" element
     */
    void setUpgradeInstanceArray(long[] upgradeInstanceArray);
    
    /**
     * Sets ith "upgradeInstance" element
     */
    void setUpgradeInstanceArray(int i, long upgradeInstance);
    
    /**
     * Sets (as xml) array of all "upgradeInstance" element
     */
    void xsetUpgradeInstanceArray(org.apache.xmlbeans.XmlLong[] upgradeInstanceArray);
    
    /**
     * Sets (as xml) ith "upgradeInstance" element
     */
    void xsetUpgradeInstanceArray(int i, org.apache.xmlbeans.XmlLong upgradeInstance);
    
    /**
     * Inserts the value as the ith "upgradeInstance" element
     */
    void insertUpgradeInstance(int i, long upgradeInstance);
    
    /**
     * Appends the value as the last "upgradeInstance" element
     */
    void addUpgradeInstance(long upgradeInstance);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "upgradeInstance" element
     */
    org.apache.xmlbeans.XmlLong insertNewUpgradeInstance(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "upgradeInstance" element
     */
    org.apache.xmlbeans.XmlLong addNewUpgradeInstance();
    
    /**
     * Removes the ith "upgradeInstance" element
     */
    void removeUpgradeInstance(int i);
    
    /**
     * Gets a List of "replaceInstance" elements
     */
    java.util.List<java.lang.Long> getReplaceInstanceList();
    
    /**
     * Gets array of all "replaceInstance" elements
     * @deprecated
     */
    long[] getReplaceInstanceArray();
    
    /**
     * Gets ith "replaceInstance" element
     */
    long getReplaceInstanceArray(int i);
    
    /**
     * Gets (as xml) a List of "replaceInstance" elements
     */
    java.util.List<org.apache.xmlbeans.XmlLong> xgetReplaceInstanceList();
    
    /**
     * Gets (as xml) array of all "replaceInstance" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlLong[] xgetReplaceInstanceArray();
    
    /**
     * Gets (as xml) ith "replaceInstance" element
     */
    org.apache.xmlbeans.XmlLong xgetReplaceInstanceArray(int i);
    
    /**
     * Returns number of "replaceInstance" element
     */
    int sizeOfReplaceInstanceArray();
    
    /**
     * Sets array of all "replaceInstance" element
     */
    void setReplaceInstanceArray(long[] replaceInstanceArray);
    
    /**
     * Sets ith "replaceInstance" element
     */
    void setReplaceInstanceArray(int i, long replaceInstance);
    
    /**
     * Sets (as xml) array of all "replaceInstance" element
     */
    void xsetReplaceInstanceArray(org.apache.xmlbeans.XmlLong[] replaceInstanceArray);
    
    /**
     * Sets (as xml) ith "replaceInstance" element
     */
    void xsetReplaceInstanceArray(int i, org.apache.xmlbeans.XmlLong replaceInstance);
    
    /**
     * Inserts the value as the ith "replaceInstance" element
     */
    void insertReplaceInstance(int i, long replaceInstance);
    
    /**
     * Appends the value as the last "replaceInstance" element
     */
    void addReplaceInstance(long replaceInstance);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "replaceInstance" element
     */
    org.apache.xmlbeans.XmlLong insertNewReplaceInstance(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "replaceInstance" element
     */
    org.apache.xmlbeans.XmlLong addNewReplaceInstance();
    
    /**
     * Removes the ith "replaceInstance" element
     */
    void removeReplaceInstance(int i);
    
    /**
     * Gets a List of "restoreInstance" elements
     */
    java.util.List<org.apache.ode.bpel.pmapi.CommunicationType> getRestoreInstanceList();
    
    /**
     * Gets array of all "restoreInstance" elements
     * @deprecated
     */
    org.apache.ode.bpel.pmapi.CommunicationType[] getRestoreInstanceArray();
    
    /**
     * Gets ith "restoreInstance" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType getRestoreInstanceArray(int i);
    
    /**
     * Returns number of "restoreInstance" element
     */
    int sizeOfRestoreInstanceArray();
    
    /**
     * Sets array of all "restoreInstance" element
     */
    void setRestoreInstanceArray(org.apache.ode.bpel.pmapi.CommunicationType[] restoreInstanceArray);
    
    /**
     * Sets ith "restoreInstance" element
     */
    void setRestoreInstanceArray(int i, org.apache.ode.bpel.pmapi.CommunicationType restoreInstance);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "restoreInstance" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType insertNewRestoreInstance(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "restoreInstance" element
     */
    org.apache.ode.bpel.pmapi.CommunicationType addNewRestoreInstance();
    
    /**
     * Removes the ith "restoreInstance" element
     */
    void removeRestoreInstance(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.Replay newInstance() {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.Replay parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.Replay parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.Replay parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.Replay parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.Replay parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.Replay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
