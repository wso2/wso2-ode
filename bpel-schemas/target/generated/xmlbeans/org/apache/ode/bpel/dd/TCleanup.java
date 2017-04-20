/*
 * XML Type:  tCleanup
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TCleanup
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd;


/**
 * An XML tCleanup(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public interface TCleanup extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCleanup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tcleanup0223type");
    
    /**
     * Gets a List of "category" elements
     */
    java.util.List<org.apache.ode.bpel.dd.TCleanup.Category.Enum> getCategoryList();
    
    /**
     * Gets array of all "category" elements
     * @deprecated
     */
    org.apache.ode.bpel.dd.TCleanup.Category.Enum[] getCategoryArray();
    
    /**
     * Gets ith "category" element
     */
    org.apache.ode.bpel.dd.TCleanup.Category.Enum getCategoryArray(int i);
    
    /**
     * Gets (as xml) a List of "category" elements
     */
    java.util.List<org.apache.ode.bpel.dd.TCleanup.Category> xgetCategoryList();
    
    /**
     * Gets (as xml) array of all "category" elements
     * @deprecated
     */
    org.apache.ode.bpel.dd.TCleanup.Category[] xgetCategoryArray();
    
    /**
     * Gets (as xml) ith "category" element
     */
    org.apache.ode.bpel.dd.TCleanup.Category xgetCategoryArray(int i);
    
    /**
     * Returns number of "category" element
     */
    int sizeOfCategoryArray();
    
    /**
     * Sets array of all "category" element
     */
    void setCategoryArray(org.apache.ode.bpel.dd.TCleanup.Category.Enum[] categoryArray);
    
    /**
     * Sets ith "category" element
     */
    void setCategoryArray(int i, org.apache.ode.bpel.dd.TCleanup.Category.Enum category);
    
    /**
     * Sets (as xml) array of all "category" element
     */
    void xsetCategoryArray(org.apache.ode.bpel.dd.TCleanup.Category[] categoryArray);
    
    /**
     * Sets (as xml) ith "category" element
     */
    void xsetCategoryArray(int i, org.apache.ode.bpel.dd.TCleanup.Category category);
    
    /**
     * Inserts the value as the ith "category" element
     */
    void insertCategory(int i, org.apache.ode.bpel.dd.TCleanup.Category.Enum category);
    
    /**
     * Appends the value as the last "category" element
     */
    void addCategory(org.apache.ode.bpel.dd.TCleanup.Category.Enum category);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    org.apache.ode.bpel.dd.TCleanup.Category insertNewCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    org.apache.ode.bpel.dd.TCleanup.Category addNewCategory();
    
    /**
     * Removes the ith "category" element
     */
    void removeCategory(int i);
    
    /**
     * Gets a List of "filter" elements
     */
    java.util.List<java.lang.String> getFilterList();
    
    /**
     * Gets array of all "filter" elements
     * @deprecated
     */
    java.lang.String[] getFilterArray();
    
    /**
     * Gets ith "filter" element
     */
    java.lang.String getFilterArray(int i);
    
    /**
     * Gets (as xml) a List of "filter" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetFilterList();
    
    /**
     * Gets (as xml) array of all "filter" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetFilterArray();
    
    /**
     * Gets (as xml) ith "filter" element
     */
    org.apache.xmlbeans.XmlString xgetFilterArray(int i);
    
    /**
     * Returns number of "filter" element
     */
    int sizeOfFilterArray();
    
    /**
     * Sets array of all "filter" element
     */
    void setFilterArray(java.lang.String[] filterArray);
    
    /**
     * Sets ith "filter" element
     */
    void setFilterArray(int i, java.lang.String filter);
    
    /**
     * Sets (as xml) array of all "filter" element
     */
    void xsetFilterArray(org.apache.xmlbeans.XmlString[] filterArray);
    
    /**
     * Sets (as xml) ith "filter" element
     */
    void xsetFilterArray(int i, org.apache.xmlbeans.XmlString filter);
    
    /**
     * Inserts the value as the ith "filter" element
     */
    void insertFilter(int i, java.lang.String filter);
    
    /**
     * Appends the value as the last "filter" element
     */
    void addFilter(java.lang.String filter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    org.apache.xmlbeans.XmlString insertNewFilter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    org.apache.xmlbeans.XmlString addNewFilter();
    
    /**
     * Removes the ith "filter" element
     */
    void removeFilter(int i);
    
    /**
     * Gets the "on" attribute
     */
    org.apache.ode.bpel.dd.TCleanup.On.Enum getOn();
    
    /**
     * Gets (as xml) the "on" attribute
     */
    org.apache.ode.bpel.dd.TCleanup.On xgetOn();
    
    /**
     * True if has "on" attribute
     */
    boolean isSetOn();
    
    /**
     * Sets the "on" attribute
     */
    void setOn(org.apache.ode.bpel.dd.TCleanup.On.Enum on);
    
    /**
     * Sets (as xml) the "on" attribute
     */
    void xsetOn(org.apache.ode.bpel.dd.TCleanup.On on);
    
    /**
     * Unsets the "on" attribute
     */
    void unsetOn();
    
    /**
     * An XML category(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is an atomic type that is a restriction of org.apache.ode.bpel.dd.TCleanup$Category.
     */
    public interface Category extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Category.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("category19bdelemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INSTANCE = Enum.forString("instance");
        static final Enum VARIABLES = Enum.forString("variables");
        static final Enum MESSAGES = Enum.forString("messages");
        static final Enum CORRELATIONS = Enum.forString("correlations");
        static final Enum EVENTS = Enum.forString("events");
        static final Enum ALL = Enum.forString("all");
        
        static final int INT_INSTANCE = Enum.INT_INSTANCE;
        static final int INT_VARIABLES = Enum.INT_VARIABLES;
        static final int INT_MESSAGES = Enum.INT_MESSAGES;
        static final int INT_CORRELATIONS = Enum.INT_CORRELATIONS;
        static final int INT_EVENTS = Enum.INT_EVENTS;
        static final int INT_ALL = Enum.INT_ALL;
        
        /**
         * Enumeration value class for org.apache.ode.bpel.dd.TCleanup$Category.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INSTANCE
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
            
            static final int INT_INSTANCE = 1;
            static final int INT_VARIABLES = 2;
            static final int INT_MESSAGES = 3;
            static final int INT_CORRELATIONS = 4;
            static final int INT_EVENTS = 5;
            static final int INT_ALL = 6;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("instance", INT_INSTANCE),
                    new Enum("variables", INT_VARIABLES),
                    new Enum("messages", INT_MESSAGES),
                    new Enum("correlations", INT_CORRELATIONS),
                    new Enum("events", INT_EVENTS),
                    new Enum("all", INT_ALL),
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
            public static org.apache.ode.bpel.dd.TCleanup.Category newValue(java.lang.Object obj) {
              return (org.apache.ode.bpel.dd.TCleanup.Category) type.newValue( obj ); }
            
            public static org.apache.ode.bpel.dd.TCleanup.Category newInstance() {
              return (org.apache.ode.bpel.dd.TCleanup.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.dd.TCleanup.Category newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.dd.TCleanup.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML on(@).
     *
     * This is an atomic type that is a restriction of org.apache.ode.bpel.dd.TCleanup$On.
     */
    public interface On extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(On.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("on7822attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum SUCCESS = Enum.forString("success");
        static final Enum FAILURE = Enum.forString("failure");
        static final Enum ALWAYS = Enum.forString("always");
        
        static final int INT_SUCCESS = Enum.INT_SUCCESS;
        static final int INT_FAILURE = Enum.INT_FAILURE;
        static final int INT_ALWAYS = Enum.INT_ALWAYS;
        
        /**
         * Enumeration value class for org.apache.ode.bpel.dd.TCleanup$On.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SUCCESS
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
            
            static final int INT_SUCCESS = 1;
            static final int INT_FAILURE = 2;
            static final int INT_ALWAYS = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("success", INT_SUCCESS),
                    new Enum("failure", INT_FAILURE),
                    new Enum("always", INT_ALWAYS),
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
            public static org.apache.ode.bpel.dd.TCleanup.On newValue(java.lang.Object obj) {
              return (org.apache.ode.bpel.dd.TCleanup.On) type.newValue( obj ); }
            
            public static org.apache.ode.bpel.dd.TCleanup.On newInstance() {
              return (org.apache.ode.bpel.dd.TCleanup.On) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.dd.TCleanup.On newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.dd.TCleanup.On) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.dd.TCleanup newInstance() {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.dd.TCleanup parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.dd.TCleanup parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.dd.TCleanup parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TCleanup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TCleanup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TCleanup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
