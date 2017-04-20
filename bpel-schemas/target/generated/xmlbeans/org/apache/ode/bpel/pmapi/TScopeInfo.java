/*
 * XML Type:  tScopeInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TScopeInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi;


/**
 * An XML tScopeInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public interface TScopeInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TScopeInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tscopeinfoef3ftype");
    
    /**
     * Gets the "siid" element
     */
    java.lang.String getSiid();
    
    /**
     * Gets (as xml) the "siid" element
     */
    org.apache.xmlbeans.XmlString xgetSiid();
    
    /**
     * Sets the "siid" element
     */
    void setSiid(java.lang.String siid);
    
    /**
     * Sets (as xml) the "siid" element
     */
    void xsetSiid(org.apache.xmlbeans.XmlString siid);
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "status" element
     */
    org.apache.ode.bpel.pmapi.TScopeStatus.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    org.apache.ode.bpel.pmapi.TScopeStatus xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.apache.ode.bpel.pmapi.TScopeStatus.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(org.apache.ode.bpel.pmapi.TScopeStatus status);
    
    /**
     * Gets the "parent-scope-ref" element
     */
    org.apache.ode.bpel.pmapi.TScopeRef getParentScopeRef();
    
    /**
     * True if has "parent-scope-ref" element
     */
    boolean isSetParentScopeRef();
    
    /**
     * Sets the "parent-scope-ref" element
     */
    void setParentScopeRef(org.apache.ode.bpel.pmapi.TScopeRef parentScopeRef);
    
    /**
     * Appends and returns a new empty "parent-scope-ref" element
     */
    org.apache.ode.bpel.pmapi.TScopeRef addNewParentScopeRef();
    
    /**
     * Unsets the "parent-scope-ref" element
     */
    void unsetParentScopeRef();
    
    /**
     * Gets the "children" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.Children getChildren();
    
    /**
     * True if has "children" element
     */
    boolean isSetChildren();
    
    /**
     * Sets the "children" element
     */
    void setChildren(org.apache.ode.bpel.pmapi.TScopeInfo.Children children);
    
    /**
     * Appends and returns a new empty "children" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.Children addNewChildren();
    
    /**
     * Unsets the "children" element
     */
    void unsetChildren();
    
    /**
     * Gets the "activities" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.Activities getActivities();
    
    /**
     * True if has "activities" element
     */
    boolean isSetActivities();
    
    /**
     * Sets the "activities" element
     */
    void setActivities(org.apache.ode.bpel.pmapi.TScopeInfo.Activities activities);
    
    /**
     * Appends and returns a new empty "activities" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.Activities addNewActivities();
    
    /**
     * Unsets the "activities" element
     */
    void unsetActivities();
    
    /**
     * Gets the "variables" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.Variables getVariables();
    
    /**
     * True if has "variables" element
     */
    boolean isSetVariables();
    
    /**
     * Sets the "variables" element
     */
    void setVariables(org.apache.ode.bpel.pmapi.TScopeInfo.Variables variables);
    
    /**
     * Appends and returns a new empty "variables" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.Variables addNewVariables();
    
    /**
     * Unsets the "variables" element
     */
    void unsetVariables();
    
    /**
     * Gets the "correlation-sets" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets getCorrelationSets();
    
    /**
     * True if has "correlation-sets" element
     */
    boolean isSetCorrelationSets();
    
    /**
     * Sets the "correlation-sets" element
     */
    void setCorrelationSets(org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets correlationSets);
    
    /**
     * Appends and returns a new empty "correlation-sets" element
     */
    org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets addNewCorrelationSets();
    
    /**
     * Unsets the "correlation-sets" element
     */
    void unsetCorrelationSets();
    
    /**
     * Gets the "endpoints" element
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences getEndpoints();
    
    /**
     * Sets the "endpoints" element
     */
    void setEndpoints(org.apache.ode.bpel.pmapi.TEndpointReferences endpoints);
    
    /**
     * Appends and returns a new empty "endpoints" element
     */
    org.apache.ode.bpel.pmapi.TEndpointReferences addNewEndpoints();
    
    /**
     * An XML children(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface Children extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Children.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("children3944elemtype");
        
        /**
         * Gets a List of "child-ref" elements
         */
        java.util.List<org.apache.ode.bpel.pmapi.TScopeRef> getChildRefList();
        
        /**
         * Gets array of all "child-ref" elements
         * @deprecated
         */
        org.apache.ode.bpel.pmapi.TScopeRef[] getChildRefArray();
        
        /**
         * Gets ith "child-ref" element
         */
        org.apache.ode.bpel.pmapi.TScopeRef getChildRefArray(int i);
        
        /**
         * Returns number of "child-ref" element
         */
        int sizeOfChildRefArray();
        
        /**
         * Sets array of all "child-ref" element
         */
        void setChildRefArray(org.apache.ode.bpel.pmapi.TScopeRef[] childRefArray);
        
        /**
         * Sets ith "child-ref" element
         */
        void setChildRefArray(int i, org.apache.ode.bpel.pmapi.TScopeRef childRef);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "child-ref" element
         */
        org.apache.ode.bpel.pmapi.TScopeRef insertNewChildRef(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "child-ref" element
         */
        org.apache.ode.bpel.pmapi.TScopeRef addNewChildRef();
        
        /**
         * Removes the ith "child-ref" element
         */
        void removeChildRef(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TScopeInfo.Children newInstance() {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.Children) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TScopeInfo.Children newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.Children) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML activities(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface Activities extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Activities.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("activitiesdb96elemtype");
        
        /**
         * Gets a List of "activity-info" elements
         */
        java.util.List<org.apache.ode.bpel.pmapi.TActivityInfo> getActivityInfoList();
        
        /**
         * Gets array of all "activity-info" elements
         * @deprecated
         */
        org.apache.ode.bpel.pmapi.TActivityInfo[] getActivityInfoArray();
        
        /**
         * Gets ith "activity-info" element
         */
        org.apache.ode.bpel.pmapi.TActivityInfo getActivityInfoArray(int i);
        
        /**
         * Returns number of "activity-info" element
         */
        int sizeOfActivityInfoArray();
        
        /**
         * Sets array of all "activity-info" element
         */
        void setActivityInfoArray(org.apache.ode.bpel.pmapi.TActivityInfo[] activityInfoArray);
        
        /**
         * Sets ith "activity-info" element
         */
        void setActivityInfoArray(int i, org.apache.ode.bpel.pmapi.TActivityInfo activityInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "activity-info" element
         */
        org.apache.ode.bpel.pmapi.TActivityInfo insertNewActivityInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "activity-info" element
         */
        org.apache.ode.bpel.pmapi.TActivityInfo addNewActivityInfo();
        
        /**
         * Removes the ith "activity-info" element
         */
        void removeActivityInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TScopeInfo.Activities newInstance() {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.Activities) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TScopeInfo.Activities newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.Activities) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML variables(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface Variables extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Variables.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("variablesdefcelemtype");
        
        /**
         * Gets a List of "variable-ref" elements
         */
        java.util.List<org.apache.ode.bpel.pmapi.TVariableRef> getVariableRefList();
        
        /**
         * Gets array of all "variable-ref" elements
         * @deprecated
         */
        org.apache.ode.bpel.pmapi.TVariableRef[] getVariableRefArray();
        
        /**
         * Gets ith "variable-ref" element
         */
        org.apache.ode.bpel.pmapi.TVariableRef getVariableRefArray(int i);
        
        /**
         * Returns number of "variable-ref" element
         */
        int sizeOfVariableRefArray();
        
        /**
         * Sets array of all "variable-ref" element
         */
        void setVariableRefArray(org.apache.ode.bpel.pmapi.TVariableRef[] variableRefArray);
        
        /**
         * Sets ith "variable-ref" element
         */
        void setVariableRefArray(int i, org.apache.ode.bpel.pmapi.TVariableRef variableRef);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "variable-ref" element
         */
        org.apache.ode.bpel.pmapi.TVariableRef insertNewVariableRef(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "variable-ref" element
         */
        org.apache.ode.bpel.pmapi.TVariableRef addNewVariableRef();
        
        /**
         * Removes the ith "variable-ref" element
         */
        void removeVariableRef(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TScopeInfo.Variables newInstance() {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.Variables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TScopeInfo.Variables newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.Variables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML correlation-sets(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public interface CorrelationSets extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CorrelationSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("correlationsets2de7elemtype");
        
        /**
         * Gets a List of "correlation-set" elements
         */
        java.util.List<org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet> getCorrelationSetList();
        
        /**
         * Gets array of all "correlation-set" elements
         * @deprecated
         */
        org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet[] getCorrelationSetArray();
        
        /**
         * Gets ith "correlation-set" element
         */
        org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet getCorrelationSetArray(int i);
        
        /**
         * Returns number of "correlation-set" element
         */
        int sizeOfCorrelationSetArray();
        
        /**
         * Sets array of all "correlation-set" element
         */
        void setCorrelationSetArray(org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet[] correlationSetArray);
        
        /**
         * Sets ith "correlation-set" element
         */
        void setCorrelationSetArray(int i, org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet correlationSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "correlation-set" element
         */
        org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet insertNewCorrelationSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "correlation-set" element
         */
        org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet addNewCorrelationSet();
        
        /**
         * Removes the ith "correlation-set" element
         */
        void removeCorrelationSet(int i);
        
        /**
         * An XML correlation-set(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
         *
         * This is a complex type.
         */
        public interface CorrelationSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CorrelationSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("correlationset252aelemtype");
            
            /**
             * Gets a List of "correlation-property" elements
             */
            java.util.List<org.apache.ode.bpel.pmapi.TCorrelationProperty> getCorrelationPropertyList();
            
            /**
             * Gets array of all "correlation-property" elements
             * @deprecated
             */
            org.apache.ode.bpel.pmapi.TCorrelationProperty[] getCorrelationPropertyArray();
            
            /**
             * Gets ith "correlation-property" element
             */
            org.apache.ode.bpel.pmapi.TCorrelationProperty getCorrelationPropertyArray(int i);
            
            /**
             * Returns number of "correlation-property" element
             */
            int sizeOfCorrelationPropertyArray();
            
            /**
             * Sets array of all "correlation-property" element
             */
            void setCorrelationPropertyArray(org.apache.ode.bpel.pmapi.TCorrelationProperty[] correlationPropertyArray);
            
            /**
             * Sets ith "correlation-property" element
             */
            void setCorrelationPropertyArray(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty correlationProperty);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "correlation-property" element
             */
            org.apache.ode.bpel.pmapi.TCorrelationProperty insertNewCorrelationProperty(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "correlation-property" element
             */
            org.apache.ode.bpel.pmapi.TCorrelationProperty addNewCorrelationProperty();
            
            /**
             * Removes the ith "correlation-property" element
             */
            void removeCorrelationProperty(int i);
            
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
             * Gets the "csetid" attribute
             */
            java.lang.String getCsetid();
            
            /**
             * Gets (as xml) the "csetid" attribute
             */
            org.apache.xmlbeans.XmlString xgetCsetid();
            
            /**
             * Sets the "csetid" attribute
             */
            void setCsetid(java.lang.String csetid);
            
            /**
             * Sets (as xml) the "csetid" attribute
             */
            void xsetCsetid(org.apache.xmlbeans.XmlString csetid);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet newInstance() {
                  return (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets newInstance() {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.pmapi.TScopeInfo newInstance() {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.pmapi.TScopeInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.pmapi.TScopeInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
