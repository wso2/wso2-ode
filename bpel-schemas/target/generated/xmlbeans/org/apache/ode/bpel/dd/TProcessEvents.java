/*
 * XML Type:  tProcessEvents
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TProcessEvents
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd;


/**
 * An XML tProcessEvents(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public interface TProcessEvents extends org.apache.ode.bpel.dd.TEnableEventList
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TProcessEvents.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tprocessevents869ftype");
    
    /**
     * Gets a List of "scope-events" elements
     */
    java.util.List<org.apache.ode.bpel.dd.TScopeEvents> getScopeEventsList();
    
    /**
     * Gets array of all "scope-events" elements
     * @deprecated
     */
    org.apache.ode.bpel.dd.TScopeEvents[] getScopeEventsArray();
    
    /**
     * Gets ith "scope-events" element
     */
    org.apache.ode.bpel.dd.TScopeEvents getScopeEventsArray(int i);
    
    /**
     * Returns number of "scope-events" element
     */
    int sizeOfScopeEventsArray();
    
    /**
     * Sets array of all "scope-events" element
     */
    void setScopeEventsArray(org.apache.ode.bpel.dd.TScopeEvents[] scopeEventsArray);
    
    /**
     * Sets ith "scope-events" element
     */
    void setScopeEventsArray(int i, org.apache.ode.bpel.dd.TScopeEvents scopeEvents);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scope-events" element
     */
    org.apache.ode.bpel.dd.TScopeEvents insertNewScopeEvents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scope-events" element
     */
    org.apache.ode.bpel.dd.TScopeEvents addNewScopeEvents();
    
    /**
     * Removes the ith "scope-events" element
     */
    void removeScopeEvents(int i);
    
    /**
     * Gets the "generate" attribute
     */
    org.apache.ode.bpel.dd.TProcessEvents.Generate.Enum getGenerate();
    
    /**
     * Gets (as xml) the "generate" attribute
     */
    org.apache.ode.bpel.dd.TProcessEvents.Generate xgetGenerate();
    
    /**
     * True if has "generate" attribute
     */
    boolean isSetGenerate();
    
    /**
     * Sets the "generate" attribute
     */
    void setGenerate(org.apache.ode.bpel.dd.TProcessEvents.Generate.Enum generate);
    
    /**
     * Sets (as xml) the "generate" attribute
     */
    void xsetGenerate(org.apache.ode.bpel.dd.TProcessEvents.Generate generate);
    
    /**
     * Unsets the "generate" attribute
     */
    void unsetGenerate();
    
    /**
     * An XML generate(@).
     *
     * This is an atomic type that is a restriction of org.apache.ode.bpel.dd.TProcessEvents$Generate.
     */
    public interface Generate extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Generate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("generate0174attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ALL = Enum.forString("all");
        static final Enum NONE = Enum.forString("none");
        
        static final int INT_ALL = Enum.INT_ALL;
        static final int INT_NONE = Enum.INT_NONE;
        
        /**
         * Enumeration value class for org.apache.ode.bpel.dd.TProcessEvents$Generate.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ALL
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_ALL = 1;
            static final int INT_NONE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("all", INT_ALL),
                    new Enum("none", INT_NONE),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.dd.TProcessEvents.Generate newValue(java.lang.Object obj) {
              return (org.apache.ode.bpel.dd.TProcessEvents.Generate) type.newValue( obj ); }
            
            public static org.apache.ode.bpel.dd.TProcessEvents.Generate newInstance() {
              return (org.apache.ode.bpel.dd.TProcessEvents.Generate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.dd.TProcessEvents.Generate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.dd.TProcessEvents.Generate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.dd.TProcessEvents newInstance() {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.dd.TProcessEvents parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TProcessEvents parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TProcessEvents parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TProcessEvents) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
