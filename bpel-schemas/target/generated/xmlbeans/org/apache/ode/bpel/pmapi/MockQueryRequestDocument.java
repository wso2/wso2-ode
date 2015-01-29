/*
 * An XML document type.
 * Localname: mockQueryRequest
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.MockQueryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * A document containing one mockQueryRequest(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public interface MockQueryRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MockQueryRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("mockqueryrequest4012doctype");
    
    /**
     * Gets the "mockQueryRequest" element
     */
    org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest getMockQueryRequest();
    
    /**
     * Sets the "mockQueryRequest" element
     */
    void setMockQueryRequest(org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest mockQueryRequest);
    
    /**
     * Appends and returns a new empty "mockQueryRequest" element
     */
    org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest addNewMockQueryRequest();
    
    /**
     * An XML mockQueryRequest(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface MockQueryRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MockQueryRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("mockqueryrequest2c45elemtype");
        
        /**
         * Gets the "createTime" element
         */
        java.util.Calendar getCreateTime();
        
        /**
         * Gets (as xml) the "createTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCreateTime();
        
        /**
         * Sets the "createTime" element
         */
        void setCreateTime(java.util.Calendar createTime);
        
        /**
         * Sets (as xml) the "createTime" element
         */
        void xsetCreateTime(org.apache.xmlbeans.XmlDateTime createTime);
        
        /**
         * Gets the "service" element
         */
        javax.xml.namespace.QName getService();
        
        /**
         * Gets (as xml) the "service" element
         */
        org.apache.xmlbeans.XmlQName xgetService();
        
        /**
         * Sets the "service" element
         */
        void setService(javax.xml.namespace.QName service);
        
        /**
         * Sets (as xml) the "service" element
         */
        void xsetService(org.apache.xmlbeans.XmlQName service);
        
        /**
         * Gets the "operation" element
         */
        java.lang.String getOperation();
        
        /**
         * Gets (as xml) the "operation" element
         */
        org.apache.xmlbeans.XmlString xgetOperation();
        
        /**
         * Sets the "operation" element
         */
        void setOperation(java.lang.String operation);
        
        /**
         * Sets (as xml) the "operation" element
         */
        void xsetOperation(org.apache.xmlbeans.XmlString operation);
        
        /**
         * Gets the "in" element
         */
        org.apache.xmlbeans.XmlObject getIn();
        
        /**
         * Sets the "in" element
         */
        void setIn(org.apache.xmlbeans.XmlObject in);
        
        /**
         * Appends and returns a new empty "in" element
         */
        org.apache.xmlbeans.XmlObject addNewIn();
        
        /**
         * Gets the "pattern" element
         */
        org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern.Enum getPattern();
        
        /**
         * Gets (as xml) the "pattern" element
         */
        org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern xgetPattern();
        
        /**
         * Sets the "pattern" element
         */
        void setPattern(org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern.Enum pattern);
        
        /**
         * Sets (as xml) the "pattern" element
         */
        void xsetPattern(org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern pattern);
        
        /**
         * An XML pattern(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
         *
         * This is an atomic type that is a restriction of org.apache.ode.bpel.pmapi.MockQueryRequestDocument$MockQueryRequest$Pattern.
         */
        public interface Pattern extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pattern.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("patterna041elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum IN_ONLY = Enum.forString("IN_ONLY");
            static final Enum IN_OUT = Enum.forString("IN_OUT");
            
            static final int INT_IN_ONLY = Enum.INT_IN_ONLY;
            static final int INT_IN_OUT = Enum.INT_IN_OUT;
            
            /**
             * Enumeration value class for org.apache.ode.bpel.pmapi.MockQueryRequestDocument$MockQueryRequest$Pattern.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_IN_ONLY
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
                
                static final int INT_IN_ONLY = 1;
                static final int INT_IN_OUT = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("IN_ONLY", INT_IN_ONLY),
                      new Enum("IN_OUT", INT_IN_OUT),
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
                public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern newValue(java.lang.Object obj) {
                  return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern) type.newValue( obj ); }
                
                public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern newInstance() {
                  return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest newInstance() {
              return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument newInstance() {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.MockQueryRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
