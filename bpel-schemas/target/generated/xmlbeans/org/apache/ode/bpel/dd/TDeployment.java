/*
 * XML Type:  tDeployment
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TDeployment
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd;


/**
 * An XML tDeployment(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public interface TDeployment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TDeployment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("tdeploymentb82ctype");
    
    /**
     * Gets a List of "process" elements
     */
    java.util.List<org.apache.ode.bpel.dd.TDeployment.Process> getProcessList();
    
    /**
     * Gets array of all "process" elements
     * @deprecated
     */
    org.apache.ode.bpel.dd.TDeployment.Process[] getProcessArray();
    
    /**
     * Gets ith "process" element
     */
    org.apache.ode.bpel.dd.TDeployment.Process getProcessArray(int i);
    
    /**
     * Returns number of "process" element
     */
    int sizeOfProcessArray();
    
    /**
     * Sets array of all "process" element
     */
    void setProcessArray(org.apache.ode.bpel.dd.TDeployment.Process[] processArray);
    
    /**
     * Sets ith "process" element
     */
    void setProcessArray(int i, org.apache.ode.bpel.dd.TDeployment.Process process);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "process" element
     */
    org.apache.ode.bpel.dd.TDeployment.Process insertNewProcess(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "process" element
     */
    org.apache.ode.bpel.dd.TDeployment.Process addNewProcess();
    
    /**
     * Removes the ith "process" element
     */
    void removeProcess(int i);
    
    /**
     * An XML process(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is a complex type.
     */
    public interface Process extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Process.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("processb871elemtype");
        
        /**
         * Gets the "active" element
         */
        boolean getActive();
        
        /**
         * Gets (as xml) the "active" element
         */
        org.apache.xmlbeans.XmlBoolean xgetActive();
        
        /**
         * True if has "active" element
         */
        boolean isSetActive();
        
        /**
         * Sets the "active" element
         */
        void setActive(boolean active);
        
        /**
         * Sets (as xml) the "active" element
         */
        void xsetActive(org.apache.xmlbeans.XmlBoolean active);
        
        /**
         * Unsets the "active" element
         */
        void unsetActive();
        
        /**
         * Gets the "retired" element
         */
        boolean getRetired();
        
        /**
         * Gets (as xml) the "retired" element
         */
        org.apache.xmlbeans.XmlBoolean xgetRetired();
        
        /**
         * True if has "retired" element
         */
        boolean isSetRetired();
        
        /**
         * Sets the "retired" element
         */
        void setRetired(boolean retired);
        
        /**
         * Sets (as xml) the "retired" element
         */
        void xsetRetired(org.apache.xmlbeans.XmlBoolean retired);
        
        /**
         * Unsets the "retired" element
         */
        void unsetRetired();
        
        /**
         * Gets the "in-memory" element
         */
        boolean getInMemory();
        
        /**
         * Gets (as xml) the "in-memory" element
         */
        org.apache.xmlbeans.XmlBoolean xgetInMemory();
        
        /**
         * True if has "in-memory" element
         */
        boolean isSetInMemory();
        
        /**
         * Sets the "in-memory" element
         */
        void setInMemory(boolean inMemory);
        
        /**
         * Sets (as xml) the "in-memory" element
         */
        void xsetInMemory(org.apache.xmlbeans.XmlBoolean inMemory);
        
        /**
         * Unsets the "in-memory" element
         */
        void unsetInMemory();
        
        /**
         * Gets a List of "property" elements
         */
        java.util.List<org.apache.ode.bpel.dd.TDeployment.Process.Property> getPropertyList();
        
        /**
         * Gets array of all "property" elements
         * @deprecated
         */
        org.apache.ode.bpel.dd.TDeployment.Process.Property[] getPropertyArray();
        
        /**
         * Gets ith "property" element
         */
        org.apache.ode.bpel.dd.TDeployment.Process.Property getPropertyArray(int i);
        
        /**
         * Returns number of "property" element
         */
        int sizeOfPropertyArray();
        
        /**
         * Sets array of all "property" element
         */
        void setPropertyArray(org.apache.ode.bpel.dd.TDeployment.Process.Property[] propertyArray);
        
        /**
         * Sets ith "property" element
         */
        void setPropertyArray(int i, org.apache.ode.bpel.dd.TDeployment.Process.Property property);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        org.apache.ode.bpel.dd.TDeployment.Process.Property insertNewProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        org.apache.ode.bpel.dd.TDeployment.Process.Property addNewProperty();
        
        /**
         * Removes the ith "property" element
         */
        void removeProperty(int i);
        
        /**
         * Gets the "process-events" element
         */
        org.apache.ode.bpel.dd.TProcessEvents getProcessEvents();
        
        /**
         * True if has "process-events" element
         */
        boolean isSetProcessEvents();
        
        /**
         * Sets the "process-events" element
         */
        void setProcessEvents(org.apache.ode.bpel.dd.TProcessEvents processEvents);
        
        /**
         * Appends and returns a new empty "process-events" element
         */
        org.apache.ode.bpel.dd.TProcessEvents addNewProcessEvents();
        
        /**
         * Unsets the "process-events" element
         */
        void unsetProcessEvents();
        
        /**
         * Gets a List of "provide" elements
         */
        java.util.List<org.apache.ode.bpel.dd.TProvide> getProvideList();
        
        /**
         * Gets array of all "provide" elements
         * @deprecated
         */
        org.apache.ode.bpel.dd.TProvide[] getProvideArray();
        
        /**
         * Gets ith "provide" element
         */
        org.apache.ode.bpel.dd.TProvide getProvideArray(int i);
        
        /**
         * Returns number of "provide" element
         */
        int sizeOfProvideArray();
        
        /**
         * Sets array of all "provide" element
         */
        void setProvideArray(org.apache.ode.bpel.dd.TProvide[] provideArray);
        
        /**
         * Sets ith "provide" element
         */
        void setProvideArray(int i, org.apache.ode.bpel.dd.TProvide provide);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "provide" element
         */
        org.apache.ode.bpel.dd.TProvide insertNewProvide(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "provide" element
         */
        org.apache.ode.bpel.dd.TProvide addNewProvide();
        
        /**
         * Removes the ith "provide" element
         */
        void removeProvide(int i);
        
        /**
         * Gets a List of "invoke" elements
         */
        java.util.List<org.apache.ode.bpel.dd.TInvoke> getInvokeList();
        
        /**
         * Gets array of all "invoke" elements
         * @deprecated
         */
        org.apache.ode.bpel.dd.TInvoke[] getInvokeArray();
        
        /**
         * Gets ith "invoke" element
         */
        org.apache.ode.bpel.dd.TInvoke getInvokeArray(int i);
        
        /**
         * Returns number of "invoke" element
         */
        int sizeOfInvokeArray();
        
        /**
         * Sets array of all "invoke" element
         */
        void setInvokeArray(org.apache.ode.bpel.dd.TInvoke[] invokeArray);
        
        /**
         * Sets ith "invoke" element
         */
        void setInvokeArray(int i, org.apache.ode.bpel.dd.TInvoke invoke);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "invoke" element
         */
        org.apache.ode.bpel.dd.TInvoke insertNewInvoke(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "invoke" element
         */
        org.apache.ode.bpel.dd.TInvoke addNewInvoke();
        
        /**
         * Removes the ith "invoke" element
         */
        void removeInvoke(int i);
        
        /**
         * Gets the "mex-interceptors" element
         */
        org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors getMexInterceptors();
        
        /**
         * True if has "mex-interceptors" element
         */
        boolean isSetMexInterceptors();
        
        /**
         * Sets the "mex-interceptors" element
         */
        void setMexInterceptors(org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors mexInterceptors);
        
        /**
         * Appends and returns a new empty "mex-interceptors" element
         */
        org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors addNewMexInterceptors();
        
        /**
         * Unsets the "mex-interceptors" element
         */
        void unsetMexInterceptors();
        
        /**
         * Gets the "type" element
         */
        javax.xml.namespace.QName getType();
        
        /**
         * Gets (as xml) the "type" element
         */
        org.apache.xmlbeans.XmlQName xgetType();
        
        /**
         * True if has "type" element
         */
        boolean isSetType();
        
        /**
         * Sets the "type" element
         */
        void setType(javax.xml.namespace.QName type);
        
        /**
         * Sets (as xml) the "type" element
         */
        void xsetType(org.apache.xmlbeans.XmlQName type);
        
        /**
         * Unsets the "type" element
         */
        void unsetType();
        
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
         * Gets a List of "schedule" elements
         */
        java.util.List<org.apache.ode.bpel.dd.TSchedule> getScheduleList();
        
        /**
         * Gets array of all "schedule" elements
         * @deprecated
         */
        org.apache.ode.bpel.dd.TSchedule[] getScheduleArray();
        
        /**
         * Gets ith "schedule" element
         */
        org.apache.ode.bpel.dd.TSchedule getScheduleArray(int i);
        
        /**
         * Returns number of "schedule" element
         */
        int sizeOfScheduleArray();
        
        /**
         * Sets array of all "schedule" element
         */
        void setScheduleArray(org.apache.ode.bpel.dd.TSchedule[] scheduleArray);
        
        /**
         * Sets ith "schedule" element
         */
        void setScheduleArray(int i, org.apache.ode.bpel.dd.TSchedule schedule);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "schedule" element
         */
        org.apache.ode.bpel.dd.TSchedule insertNewSchedule(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "schedule" element
         */
        org.apache.ode.bpel.dd.TSchedule addNewSchedule();
        
        /**
         * Removes the ith "schedule" element
         */
        void removeSchedule(int i);
        
        /**
         * Gets the "bamServerProfiles" element
         */
        org.apache.ode.bpel.dd.TBAMServerProfiles getBamServerProfiles();
        
        /**
         * True if has "bamServerProfiles" element
         */
        boolean isSetBamServerProfiles();
        
        /**
         * Sets the "bamServerProfiles" element
         */
        void setBamServerProfiles(org.apache.ode.bpel.dd.TBAMServerProfiles bamServerProfiles);
        
        /**
         * Appends and returns a new empty "bamServerProfiles" element
         */
        org.apache.ode.bpel.dd.TBAMServerProfiles addNewBamServerProfiles();
        
        /**
         * Unsets the "bamServerProfiles" element
         */
        void unsetBamServerProfiles();
        
        /**
         * Gets the "name" attribute
         */
        javax.xml.namespace.QName getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlQName xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(javax.xml.namespace.QName name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlQName name);
        
        /**
         * Gets the "fileName" attribute
         */
        java.lang.String getFileName();
        
        /**
         * Gets (as xml) the "fileName" attribute
         */
        org.apache.xmlbeans.XmlString xgetFileName();
        
        /**
         * True if has "fileName" attribute
         */
        boolean isSetFileName();
        
        /**
         * Sets the "fileName" attribute
         */
        void setFileName(java.lang.String fileName);
        
        /**
         * Sets (as xml) the "fileName" attribute
         */
        void xsetFileName(org.apache.xmlbeans.XmlString fileName);
        
        /**
         * Unsets the "fileName" attribute
         */
        void unsetFileName();
        
        /**
         * Gets the "bpel11wsdlFileName" attribute
         */
        java.lang.String getBpel11WsdlFileName();
        
        /**
         * Gets (as xml) the "bpel11wsdlFileName" attribute
         */
        org.apache.xmlbeans.XmlString xgetBpel11WsdlFileName();
        
        /**
         * True if has "bpel11wsdlFileName" attribute
         */
        boolean isSetBpel11WsdlFileName();
        
        /**
         * Sets the "bpel11wsdlFileName" attribute
         */
        void setBpel11WsdlFileName(java.lang.String bpel11WsdlFileName);
        
        /**
         * Sets (as xml) the "bpel11wsdlFileName" attribute
         */
        void xsetBpel11WsdlFileName(org.apache.xmlbeans.XmlString bpel11WsdlFileName);
        
        /**
         * Unsets the "bpel11wsdlFileName" attribute
         */
        void unsetBpel11WsdlFileName();
        
        /**
         * An XML property(@http://www.apache.org/ode/schemas/dd/2007/03).
         *
         * This is a complex type.
         */
        public interface Property extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("property50a0elemtype");
            
            /**
             * Gets the "name" attribute
             */
            javax.xml.namespace.QName getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlQName xgetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(javax.xml.namespace.QName name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(org.apache.xmlbeans.XmlQName name);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.apache.ode.bpel.dd.TDeployment.Process.Property newInstance() {
                  return (org.apache.ode.bpel.dd.TDeployment.Process.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.apache.ode.bpel.dd.TDeployment.Process.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.apache.ode.bpel.dd.TDeployment.Process.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mex-interceptors(@http://www.apache.org/ode/schemas/dd/2007/03).
         *
         * This is a complex type.
         */
        public interface MexInterceptors extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MexInterceptors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF2239578B6CD4A4C372986FE916CB4E0").resolveHandle("mexinterceptors2c7aelemtype");
            
            /**
             * Gets a List of "mex-interceptor" elements
             */
            java.util.List<org.apache.ode.bpel.dd.TMexInterceptor> getMexInterceptorList();
            
            /**
             * Gets array of all "mex-interceptor" elements
             * @deprecated
             */
            org.apache.ode.bpel.dd.TMexInterceptor[] getMexInterceptorArray();
            
            /**
             * Gets ith "mex-interceptor" element
             */
            org.apache.ode.bpel.dd.TMexInterceptor getMexInterceptorArray(int i);
            
            /**
             * Returns number of "mex-interceptor" element
             */
            int sizeOfMexInterceptorArray();
            
            /**
             * Sets array of all "mex-interceptor" element
             */
            void setMexInterceptorArray(org.apache.ode.bpel.dd.TMexInterceptor[] mexInterceptorArray);
            
            /**
             * Sets ith "mex-interceptor" element
             */
            void setMexInterceptorArray(int i, org.apache.ode.bpel.dd.TMexInterceptor mexInterceptor);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "mex-interceptor" element
             */
            org.apache.ode.bpel.dd.TMexInterceptor insertNewMexInterceptor(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "mex-interceptor" element
             */
            org.apache.ode.bpel.dd.TMexInterceptor addNewMexInterceptor();
            
            /**
             * Removes the ith "mex-interceptor" element
             */
            void removeMexInterceptor(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors newInstance() {
                  return (org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.apache.ode.bpel.dd.TDeployment.Process newInstance() {
              return (org.apache.ode.bpel.dd.TDeployment.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.apache.ode.bpel.dd.TDeployment.Process newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.apache.ode.bpel.dd.TDeployment.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.apache.ode.bpel.dd.TDeployment newInstance() {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.apache.ode.bpel.dd.TDeployment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.apache.ode.bpel.dd.TDeployment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.apache.ode.bpel.dd.TDeployment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TDeployment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.ode.bpel.dd.TDeployment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.apache.ode.bpel.dd.TDeployment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
