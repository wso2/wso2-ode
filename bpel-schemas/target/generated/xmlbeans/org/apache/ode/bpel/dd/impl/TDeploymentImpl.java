/*
 * XML Type:  tDeployment
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TDeployment
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tDeployment(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TDeploymentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TDeployment
{
    
    public TDeploymentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESS$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "process");
    
    
    /**
     * Gets a List of "process" elements
     */
    public java.util.List<org.apache.ode.bpel.dd.TDeployment.Process> getProcessList()
    {
        final class ProcessList extends java.util.AbstractList<org.apache.ode.bpel.dd.TDeployment.Process>
        {
            public org.apache.ode.bpel.dd.TDeployment.Process get(int i)
                { return TDeploymentImpl.this.getProcessArray(i); }
            
            public org.apache.ode.bpel.dd.TDeployment.Process set(int i, org.apache.ode.bpel.dd.TDeployment.Process o)
            {
                org.apache.ode.bpel.dd.TDeployment.Process old = TDeploymentImpl.this.getProcessArray(i);
                TDeploymentImpl.this.setProcessArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.dd.TDeployment.Process o)
                { TDeploymentImpl.this.insertNewProcess(i).set(o); }
            
            public org.apache.ode.bpel.dd.TDeployment.Process remove(int i)
            {
                org.apache.ode.bpel.dd.TDeployment.Process old = TDeploymentImpl.this.getProcessArray(i);
                TDeploymentImpl.this.removeProcess(i);
                return old;
            }
            
            public int size()
                { return TDeploymentImpl.this.sizeOfProcessArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProcessList();
        }
    }
    
    /**
     * Gets array of all "process" elements
     */
    public org.apache.ode.bpel.dd.TDeployment.Process[] getProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESS$0, targetList);
            org.apache.ode.bpel.dd.TDeployment.Process[] result = new org.apache.ode.bpel.dd.TDeployment.Process[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "process" element
     */
    public org.apache.ode.bpel.dd.TDeployment.Process getProcessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TDeployment.Process target = null;
            target = (org.apache.ode.bpel.dd.TDeployment.Process)get_store().find_element_user(PROCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "process" element
     */
    public int sizeOfProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESS$0);
        }
    }
    
    /**
     * Sets array of all "process" element
     */
    public void setProcessArray(org.apache.ode.bpel.dd.TDeployment.Process[] processArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processArray, PROCESS$0);
        }
    }
    
    /**
     * Sets ith "process" element
     */
    public void setProcessArray(int i, org.apache.ode.bpel.dd.TDeployment.Process process)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TDeployment.Process target = null;
            target = (org.apache.ode.bpel.dd.TDeployment.Process)get_store().find_element_user(PROCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(process);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "process" element
     */
    public org.apache.ode.bpel.dd.TDeployment.Process insertNewProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TDeployment.Process target = null;
            target = (org.apache.ode.bpel.dd.TDeployment.Process)get_store().insert_element_user(PROCESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "process" element
     */
    public org.apache.ode.bpel.dd.TDeployment.Process addNewProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TDeployment.Process target = null;
            target = (org.apache.ode.bpel.dd.TDeployment.Process)get_store().add_element_user(PROCESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "process" element
     */
    public void removeProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESS$0, i);
        }
    }
    /**
     * An XML process(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is a complex type.
     */
    public static class ProcessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TDeployment.Process
    {
        
        public ProcessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACTIVE$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "active");
        private static final javax.xml.namespace.QName RETIRED$2 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "retired");
        private static final javax.xml.namespace.QName INMEMORY$4 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "in-memory");
        private static final javax.xml.namespace.QName PROPERTY$6 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "property");
        private static final javax.xml.namespace.QName PROCESSEVENTS$8 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "process-events");
        private static final javax.xml.namespace.QName PROVIDE$10 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "provide");
        private static final javax.xml.namespace.QName INVOKE$12 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "invoke");
        private static final javax.xml.namespace.QName MEXINTERCEPTORS$14 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "mex-interceptors");
        private static final javax.xml.namespace.QName TYPE$16 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "type");
        private static final javax.xml.namespace.QName CLEANUP$18 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "cleanup");
        private static final javax.xml.namespace.QName SCHEDULE$20 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "schedule");
        private static final javax.xml.namespace.QName BAMSERVERPROFILES$22 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "bamServerProfiles");
        private static final javax.xml.namespace.QName NAME$24 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName FILENAME$26 = 
            new javax.xml.namespace.QName("", "fileName");
        private static final javax.xml.namespace.QName BPEL11WSDLFILENAME$28 = 
            new javax.xml.namespace.QName("", "bpel11wsdlFileName");
        
        
        /**
         * Gets the "active" element
         */
        public boolean getActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "active" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "active" element
         */
        public boolean isSetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIVE$0) != 0;
            }
        }
        
        /**
         * Sets the "active" element
         */
        public void setActive(boolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVE$0);
                }
                target.setBooleanValue(active);
            }
        }
        
        /**
         * Sets (as xml) the "active" element
         */
        public void xsetActive(org.apache.xmlbeans.XmlBoolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTIVE$0);
                }
                target.set(active);
            }
        }
        
        /**
         * Unsets the "active" element
         */
        public void unsetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIVE$0, 0);
            }
        }
        
        /**
         * Gets the "retired" element
         */
        public boolean getRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETIRED$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "retired" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETIRED$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "retired" element
         */
        public boolean isSetRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETIRED$2) != 0;
            }
        }
        
        /**
         * Sets the "retired" element
         */
        public void setRetired(boolean retired)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETIRED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETIRED$2);
                }
                target.setBooleanValue(retired);
            }
        }
        
        /**
         * Sets (as xml) the "retired" element
         */
        public void xsetRetired(org.apache.xmlbeans.XmlBoolean retired)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETIRED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RETIRED$2);
                }
                target.set(retired);
            }
        }
        
        /**
         * Unsets the "retired" element
         */
        public void unsetRetired()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETIRED$2, 0);
            }
        }
        
        /**
         * Gets the "in-memory" element
         */
        public boolean getInMemory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INMEMORY$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "in-memory" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetInMemory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INMEMORY$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "in-memory" element
         */
        public boolean isSetInMemory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INMEMORY$4) != 0;
            }
        }
        
        /**
         * Sets the "in-memory" element
         */
        public void setInMemory(boolean inMemory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INMEMORY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INMEMORY$4);
                }
                target.setBooleanValue(inMemory);
            }
        }
        
        /**
         * Sets (as xml) the "in-memory" element
         */
        public void xsetInMemory(org.apache.xmlbeans.XmlBoolean inMemory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INMEMORY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INMEMORY$4);
                }
                target.set(inMemory);
            }
        }
        
        /**
         * Unsets the "in-memory" element
         */
        public void unsetInMemory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INMEMORY$4, 0);
            }
        }
        
        /**
         * Gets a List of "property" elements
         */
        public java.util.List<org.apache.ode.bpel.dd.TDeployment.Process.Property> getPropertyList()
        {
            final class PropertyList extends java.util.AbstractList<org.apache.ode.bpel.dd.TDeployment.Process.Property>
            {
                public org.apache.ode.bpel.dd.TDeployment.Process.Property get(int i)
                    { return ProcessImpl.this.getPropertyArray(i); }
                
                public org.apache.ode.bpel.dd.TDeployment.Process.Property set(int i, org.apache.ode.bpel.dd.TDeployment.Process.Property o)
                {
                    org.apache.ode.bpel.dd.TDeployment.Process.Property old = ProcessImpl.this.getPropertyArray(i);
                    ProcessImpl.this.setPropertyArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.dd.TDeployment.Process.Property o)
                    { ProcessImpl.this.insertNewProperty(i).set(o); }
                
                public org.apache.ode.bpel.dd.TDeployment.Process.Property remove(int i)
                {
                    org.apache.ode.bpel.dd.TDeployment.Process.Property old = ProcessImpl.this.getPropertyArray(i);
                    ProcessImpl.this.removeProperty(i);
                    return old;
                }
                
                public int size()
                    { return ProcessImpl.this.sizeOfPropertyArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PropertyList();
            }
        }
        
        /**
         * Gets array of all "property" elements
         */
        public org.apache.ode.bpel.dd.TDeployment.Process.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$6, targetList);
                org.apache.ode.bpel.dd.TDeployment.Process.Property[] result = new org.apache.ode.bpel.dd.TDeployment.Process.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "property" element
         */
        public org.apache.ode.bpel.dd.TDeployment.Process.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TDeployment.Process.Property target = null;
                target = (org.apache.ode.bpel.dd.TDeployment.Process.Property)get_store().find_element_user(PROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$6);
            }
        }
        
        /**
         * Sets array of all "property" element
         */
        public void setPropertyArray(org.apache.ode.bpel.dd.TDeployment.Process.Property[] propertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$6);
            }
        }
        
        /**
         * Sets ith "property" element
         */
        public void setPropertyArray(int i, org.apache.ode.bpel.dd.TDeployment.Process.Property property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TDeployment.Process.Property target = null;
                target = (org.apache.ode.bpel.dd.TDeployment.Process.Property)get_store().find_element_user(PROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(property);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        public org.apache.ode.bpel.dd.TDeployment.Process.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TDeployment.Process.Property target = null;
                target = (org.apache.ode.bpel.dd.TDeployment.Process.Property)get_store().insert_element_user(PROPERTY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        public org.apache.ode.bpel.dd.TDeployment.Process.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TDeployment.Process.Property target = null;
                target = (org.apache.ode.bpel.dd.TDeployment.Process.Property)get_store().add_element_user(PROPERTY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$6, i);
            }
        }
        
        /**
         * Gets the "process-events" element
         */
        public org.apache.ode.bpel.dd.TProcessEvents getProcessEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TProcessEvents target = null;
                target = (org.apache.ode.bpel.dd.TProcessEvents)get_store().find_element_user(PROCESSEVENTS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "process-events" element
         */
        public boolean isSetProcessEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROCESSEVENTS$8) != 0;
            }
        }
        
        /**
         * Sets the "process-events" element
         */
        public void setProcessEvents(org.apache.ode.bpel.dd.TProcessEvents processEvents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TProcessEvents target = null;
                target = (org.apache.ode.bpel.dd.TProcessEvents)get_store().find_element_user(PROCESSEVENTS$8, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.dd.TProcessEvents)get_store().add_element_user(PROCESSEVENTS$8);
                }
                target.set(processEvents);
            }
        }
        
        /**
         * Appends and returns a new empty "process-events" element
         */
        public org.apache.ode.bpel.dd.TProcessEvents addNewProcessEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TProcessEvents target = null;
                target = (org.apache.ode.bpel.dd.TProcessEvents)get_store().add_element_user(PROCESSEVENTS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "process-events" element
         */
        public void unsetProcessEvents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROCESSEVENTS$8, 0);
            }
        }
        
        /**
         * Gets a List of "provide" elements
         */
        public java.util.List<org.apache.ode.bpel.dd.TProvide> getProvideList()
        {
            final class ProvideList extends java.util.AbstractList<org.apache.ode.bpel.dd.TProvide>
            {
                public org.apache.ode.bpel.dd.TProvide get(int i)
                    { return ProcessImpl.this.getProvideArray(i); }
                
                public org.apache.ode.bpel.dd.TProvide set(int i, org.apache.ode.bpel.dd.TProvide o)
                {
                    org.apache.ode.bpel.dd.TProvide old = ProcessImpl.this.getProvideArray(i);
                    ProcessImpl.this.setProvideArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.dd.TProvide o)
                    { ProcessImpl.this.insertNewProvide(i).set(o); }
                
                public org.apache.ode.bpel.dd.TProvide remove(int i)
                {
                    org.apache.ode.bpel.dd.TProvide old = ProcessImpl.this.getProvideArray(i);
                    ProcessImpl.this.removeProvide(i);
                    return old;
                }
                
                public int size()
                    { return ProcessImpl.this.sizeOfProvideArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ProvideList();
            }
        }
        
        /**
         * Gets array of all "provide" elements
         */
        public org.apache.ode.bpel.dd.TProvide[] getProvideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROVIDE$10, targetList);
                org.apache.ode.bpel.dd.TProvide[] result = new org.apache.ode.bpel.dd.TProvide[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "provide" element
         */
        public org.apache.ode.bpel.dd.TProvide getProvideArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TProvide target = null;
                target = (org.apache.ode.bpel.dd.TProvide)get_store().find_element_user(PROVIDE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "provide" element
         */
        public int sizeOfProvideArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROVIDE$10);
            }
        }
        
        /**
         * Sets array of all "provide" element
         */
        public void setProvideArray(org.apache.ode.bpel.dd.TProvide[] provideArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(provideArray, PROVIDE$10);
            }
        }
        
        /**
         * Sets ith "provide" element
         */
        public void setProvideArray(int i, org.apache.ode.bpel.dd.TProvide provide)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TProvide target = null;
                target = (org.apache.ode.bpel.dd.TProvide)get_store().find_element_user(PROVIDE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(provide);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "provide" element
         */
        public org.apache.ode.bpel.dd.TProvide insertNewProvide(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TProvide target = null;
                target = (org.apache.ode.bpel.dd.TProvide)get_store().insert_element_user(PROVIDE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "provide" element
         */
        public org.apache.ode.bpel.dd.TProvide addNewProvide()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TProvide target = null;
                target = (org.apache.ode.bpel.dd.TProvide)get_store().add_element_user(PROVIDE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "provide" element
         */
        public void removeProvide(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROVIDE$10, i);
            }
        }
        
        /**
         * Gets a List of "invoke" elements
         */
        public java.util.List<org.apache.ode.bpel.dd.TInvoke> getInvokeList()
        {
            final class InvokeList extends java.util.AbstractList<org.apache.ode.bpel.dd.TInvoke>
            {
                public org.apache.ode.bpel.dd.TInvoke get(int i)
                    { return ProcessImpl.this.getInvokeArray(i); }
                
                public org.apache.ode.bpel.dd.TInvoke set(int i, org.apache.ode.bpel.dd.TInvoke o)
                {
                    org.apache.ode.bpel.dd.TInvoke old = ProcessImpl.this.getInvokeArray(i);
                    ProcessImpl.this.setInvokeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.dd.TInvoke o)
                    { ProcessImpl.this.insertNewInvoke(i).set(o); }
                
                public org.apache.ode.bpel.dd.TInvoke remove(int i)
                {
                    org.apache.ode.bpel.dd.TInvoke old = ProcessImpl.this.getInvokeArray(i);
                    ProcessImpl.this.removeInvoke(i);
                    return old;
                }
                
                public int size()
                    { return ProcessImpl.this.sizeOfInvokeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InvokeList();
            }
        }
        
        /**
         * Gets array of all "invoke" elements
         */
        public org.apache.ode.bpel.dd.TInvoke[] getInvokeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INVOKE$12, targetList);
                org.apache.ode.bpel.dd.TInvoke[] result = new org.apache.ode.bpel.dd.TInvoke[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "invoke" element
         */
        public org.apache.ode.bpel.dd.TInvoke getInvokeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TInvoke target = null;
                target = (org.apache.ode.bpel.dd.TInvoke)get_store().find_element_user(INVOKE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "invoke" element
         */
        public int sizeOfInvokeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INVOKE$12);
            }
        }
        
        /**
         * Sets array of all "invoke" element
         */
        public void setInvokeArray(org.apache.ode.bpel.dd.TInvoke[] invokeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(invokeArray, INVOKE$12);
            }
        }
        
        /**
         * Sets ith "invoke" element
         */
        public void setInvokeArray(int i, org.apache.ode.bpel.dd.TInvoke invoke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TInvoke target = null;
                target = (org.apache.ode.bpel.dd.TInvoke)get_store().find_element_user(INVOKE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(invoke);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "invoke" element
         */
        public org.apache.ode.bpel.dd.TInvoke insertNewInvoke(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TInvoke target = null;
                target = (org.apache.ode.bpel.dd.TInvoke)get_store().insert_element_user(INVOKE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "invoke" element
         */
        public org.apache.ode.bpel.dd.TInvoke addNewInvoke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TInvoke target = null;
                target = (org.apache.ode.bpel.dd.TInvoke)get_store().add_element_user(INVOKE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "invoke" element
         */
        public void removeInvoke(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INVOKE$12, i);
            }
        }
        
        /**
         * Gets the "mex-interceptors" element
         */
        public org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors getMexInterceptors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors target = null;
                target = (org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors)get_store().find_element_user(MEXINTERCEPTORS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "mex-interceptors" element
         */
        public boolean isSetMexInterceptors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEXINTERCEPTORS$14) != 0;
            }
        }
        
        /**
         * Sets the "mex-interceptors" element
         */
        public void setMexInterceptors(org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors mexInterceptors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors target = null;
                target = (org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors)get_store().find_element_user(MEXINTERCEPTORS$14, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors)get_store().add_element_user(MEXINTERCEPTORS$14);
                }
                target.set(mexInterceptors);
            }
        }
        
        /**
         * Appends and returns a new empty "mex-interceptors" element
         */
        public org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors addNewMexInterceptors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors target = null;
                target = (org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors)get_store().add_element_user(MEXINTERCEPTORS$14);
                return target;
            }
        }
        
        /**
         * Unsets the "mex-interceptors" element
         */
        public void unsetMexInterceptors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEXINTERCEPTORS$14, 0);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public javax.xml.namespace.QName getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public org.apache.xmlbeans.XmlQName xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TYPE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "type" element
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$16) != 0;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(javax.xml.namespace.QName type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$16);
                }
                target.setQNameValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlQName type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TYPE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(TYPE$16);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" element
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$16, 0);
            }
        }
        
        /**
         * Gets a List of "cleanup" elements
         */
        public java.util.List<org.apache.ode.bpel.dd.TCleanup> getCleanupList()
        {
            final class CleanupList extends java.util.AbstractList<org.apache.ode.bpel.dd.TCleanup>
            {
                public org.apache.ode.bpel.dd.TCleanup get(int i)
                    { return ProcessImpl.this.getCleanupArray(i); }
                
                public org.apache.ode.bpel.dd.TCleanup set(int i, org.apache.ode.bpel.dd.TCleanup o)
                {
                    org.apache.ode.bpel.dd.TCleanup old = ProcessImpl.this.getCleanupArray(i);
                    ProcessImpl.this.setCleanupArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.dd.TCleanup o)
                    { ProcessImpl.this.insertNewCleanup(i).set(o); }
                
                public org.apache.ode.bpel.dd.TCleanup remove(int i)
                {
                    org.apache.ode.bpel.dd.TCleanup old = ProcessImpl.this.getCleanupArray(i);
                    ProcessImpl.this.removeCleanup(i);
                    return old;
                }
                
                public int size()
                    { return ProcessImpl.this.sizeOfCleanupArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CleanupList();
            }
        }
        
        /**
         * Gets array of all "cleanup" elements
         */
        public org.apache.ode.bpel.dd.TCleanup[] getCleanupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLEANUP$18, targetList);
                org.apache.ode.bpel.dd.TCleanup[] result = new org.apache.ode.bpel.dd.TCleanup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "cleanup" element
         */
        public org.apache.ode.bpel.dd.TCleanup getCleanupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TCleanup target = null;
                target = (org.apache.ode.bpel.dd.TCleanup)get_store().find_element_user(CLEANUP$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "cleanup" element
         */
        public int sizeOfCleanupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLEANUP$18);
            }
        }
        
        /**
         * Sets array of all "cleanup" element
         */
        public void setCleanupArray(org.apache.ode.bpel.dd.TCleanup[] cleanupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(cleanupArray, CLEANUP$18);
            }
        }
        
        /**
         * Sets ith "cleanup" element
         */
        public void setCleanupArray(int i, org.apache.ode.bpel.dd.TCleanup cleanup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TCleanup target = null;
                target = (org.apache.ode.bpel.dd.TCleanup)get_store().find_element_user(CLEANUP$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cleanup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "cleanup" element
         */
        public org.apache.ode.bpel.dd.TCleanup insertNewCleanup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TCleanup target = null;
                target = (org.apache.ode.bpel.dd.TCleanup)get_store().insert_element_user(CLEANUP$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "cleanup" element
         */
        public org.apache.ode.bpel.dd.TCleanup addNewCleanup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TCleanup target = null;
                target = (org.apache.ode.bpel.dd.TCleanup)get_store().add_element_user(CLEANUP$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "cleanup" element
         */
        public void removeCleanup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLEANUP$18, i);
            }
        }
        
        /**
         * Gets a List of "schedule" elements
         */
        public java.util.List<org.apache.ode.bpel.dd.TSchedule> getScheduleList()
        {
            final class ScheduleList extends java.util.AbstractList<org.apache.ode.bpel.dd.TSchedule>
            {
                public org.apache.ode.bpel.dd.TSchedule get(int i)
                    { return ProcessImpl.this.getScheduleArray(i); }
                
                public org.apache.ode.bpel.dd.TSchedule set(int i, org.apache.ode.bpel.dd.TSchedule o)
                {
                    org.apache.ode.bpel.dd.TSchedule old = ProcessImpl.this.getScheduleArray(i);
                    ProcessImpl.this.setScheduleArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.dd.TSchedule o)
                    { ProcessImpl.this.insertNewSchedule(i).set(o); }
                
                public org.apache.ode.bpel.dd.TSchedule remove(int i)
                {
                    org.apache.ode.bpel.dd.TSchedule old = ProcessImpl.this.getScheduleArray(i);
                    ProcessImpl.this.removeSchedule(i);
                    return old;
                }
                
                public int size()
                    { return ProcessImpl.this.sizeOfScheduleArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ScheduleList();
            }
        }
        
        /**
         * Gets array of all "schedule" elements
         */
        public org.apache.ode.bpel.dd.TSchedule[] getScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCHEDULE$20, targetList);
                org.apache.ode.bpel.dd.TSchedule[] result = new org.apache.ode.bpel.dd.TSchedule[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "schedule" element
         */
        public org.apache.ode.bpel.dd.TSchedule getScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TSchedule target = null;
                target = (org.apache.ode.bpel.dd.TSchedule)get_store().find_element_user(SCHEDULE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "schedule" element
         */
        public int sizeOfScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCHEDULE$20);
            }
        }
        
        /**
         * Sets array of all "schedule" element
         */
        public void setScheduleArray(org.apache.ode.bpel.dd.TSchedule[] scheduleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(scheduleArray, SCHEDULE$20);
            }
        }
        
        /**
         * Sets ith "schedule" element
         */
        public void setScheduleArray(int i, org.apache.ode.bpel.dd.TSchedule schedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TSchedule target = null;
                target = (org.apache.ode.bpel.dd.TSchedule)get_store().find_element_user(SCHEDULE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(schedule);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "schedule" element
         */
        public org.apache.ode.bpel.dd.TSchedule insertNewSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TSchedule target = null;
                target = (org.apache.ode.bpel.dd.TSchedule)get_store().insert_element_user(SCHEDULE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "schedule" element
         */
        public org.apache.ode.bpel.dd.TSchedule addNewSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TSchedule target = null;
                target = (org.apache.ode.bpel.dd.TSchedule)get_store().add_element_user(SCHEDULE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "schedule" element
         */
        public void removeSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCHEDULE$20, i);
            }
        }
        
        /**
         * Gets the "bamServerProfiles" element
         */
        public org.apache.ode.bpel.dd.TBAMServerProfiles getBamServerProfiles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TBAMServerProfiles target = null;
                target = (org.apache.ode.bpel.dd.TBAMServerProfiles)get_store().find_element_user(BAMSERVERPROFILES$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "bamServerProfiles" element
         */
        public boolean isSetBamServerProfiles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BAMSERVERPROFILES$22) != 0;
            }
        }
        
        /**
         * Sets the "bamServerProfiles" element
         */
        public void setBamServerProfiles(org.apache.ode.bpel.dd.TBAMServerProfiles bamServerProfiles)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TBAMServerProfiles target = null;
                target = (org.apache.ode.bpel.dd.TBAMServerProfiles)get_store().find_element_user(BAMSERVERPROFILES$22, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.dd.TBAMServerProfiles)get_store().add_element_user(BAMSERVERPROFILES$22);
                }
                target.set(bamServerProfiles);
            }
        }
        
        /**
         * Appends and returns a new empty "bamServerProfiles" element
         */
        public org.apache.ode.bpel.dd.TBAMServerProfiles addNewBamServerProfiles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.dd.TBAMServerProfiles target = null;
                target = (org.apache.ode.bpel.dd.TBAMServerProfiles)get_store().add_element_user(BAMSERVERPROFILES$22);
                return target;
            }
        }
        
        /**
         * Unsets the "bamServerProfiles" element
         */
        public void unsetBamServerProfiles()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BAMSERVERPROFILES$22, 0);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public javax.xml.namespace.QName getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$24);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$24);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(javax.xml.namespace.QName name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$24);
                }
                target.setQNameValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlQName name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(NAME$24);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "fileName" attribute
         */
        public java.lang.String getFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$26);
                return target;
            }
        }
        
        /**
         * True if has "fileName" attribute
         */
        public boolean isSetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILENAME$26) != null;
            }
        }
        
        /**
         * Sets the "fileName" attribute
         */
        public void setFileName(java.lang.String fileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILENAME$26);
                }
                target.setStringValue(fileName);
            }
        }
        
        /**
         * Sets (as xml) the "fileName" attribute
         */
        public void xsetFileName(org.apache.xmlbeans.XmlString fileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILENAME$26);
                }
                target.set(fileName);
            }
        }
        
        /**
         * Unsets the "fileName" attribute
         */
        public void unsetFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILENAME$26);
            }
        }
        
        /**
         * Gets the "bpel11wsdlFileName" attribute
         */
        public java.lang.String getBpel11WsdlFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BPEL11WSDLFILENAME$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bpel11wsdlFileName" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBpel11WsdlFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BPEL11WSDLFILENAME$28);
                return target;
            }
        }
        
        /**
         * True if has "bpel11wsdlFileName" attribute
         */
        public boolean isSetBpel11WsdlFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BPEL11WSDLFILENAME$28) != null;
            }
        }
        
        /**
         * Sets the "bpel11wsdlFileName" attribute
         */
        public void setBpel11WsdlFileName(java.lang.String bpel11WsdlFileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BPEL11WSDLFILENAME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BPEL11WSDLFILENAME$28);
                }
                target.setStringValue(bpel11WsdlFileName);
            }
        }
        
        /**
         * Sets (as xml) the "bpel11wsdlFileName" attribute
         */
        public void xsetBpel11WsdlFileName(org.apache.xmlbeans.XmlString bpel11WsdlFileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BPEL11WSDLFILENAME$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BPEL11WSDLFILENAME$28);
                }
                target.set(bpel11WsdlFileName);
            }
        }
        
        /**
         * Unsets the "bpel11wsdlFileName" attribute
         */
        public void unsetBpel11WsdlFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BPEL11WSDLFILENAME$28);
            }
        }
        /**
         * An XML property(@http://www.apache.org/ode/schemas/dd/2007/03).
         *
         * This is a complex type.
         */
        public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TDeployment.Process.Property
        {
            
            public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("", "name");
            
            
            /**
             * Gets the "name" attribute
             */
            public javax.xml.namespace.QName getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getQNameValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlQName xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlQName target = null;
                    target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$0);
                    return target;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(javax.xml.namespace.QName name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                    }
                    target.setQNameValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlQName name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlQName target = null;
                    target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(NAME$0);
                    }
                    target.set(name);
                }
            }
        }
        /**
         * An XML mex-interceptors(@http://www.apache.org/ode/schemas/dd/2007/03).
         *
         * This is a complex type.
         */
        public static class MexInterceptorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TDeployment.Process.MexInterceptors
        {
            
            public MexInterceptorsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEXINTERCEPTOR$0 = 
                new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "mex-interceptor");
            
            
            /**
             * Gets a List of "mex-interceptor" elements
             */
            public java.util.List<org.apache.ode.bpel.dd.TMexInterceptor> getMexInterceptorList()
            {
                final class MexInterceptorList extends java.util.AbstractList<org.apache.ode.bpel.dd.TMexInterceptor>
                {
                    public org.apache.ode.bpel.dd.TMexInterceptor get(int i)
                        { return MexInterceptorsImpl.this.getMexInterceptorArray(i); }
                    
                    public org.apache.ode.bpel.dd.TMexInterceptor set(int i, org.apache.ode.bpel.dd.TMexInterceptor o)
                    {
                      org.apache.ode.bpel.dd.TMexInterceptor old = MexInterceptorsImpl.this.getMexInterceptorArray(i);
                      MexInterceptorsImpl.this.setMexInterceptorArray(i, o);
                      return old;
                    }
                    
                    public void add(int i, org.apache.ode.bpel.dd.TMexInterceptor o)
                        { MexInterceptorsImpl.this.insertNewMexInterceptor(i).set(o); }
                    
                    public org.apache.ode.bpel.dd.TMexInterceptor remove(int i)
                    {
                      org.apache.ode.bpel.dd.TMexInterceptor old = MexInterceptorsImpl.this.getMexInterceptorArray(i);
                      MexInterceptorsImpl.this.removeMexInterceptor(i);
                      return old;
                    }
                    
                    public int size()
                        { return MexInterceptorsImpl.this.sizeOfMexInterceptorArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new MexInterceptorList();
                }
            }
            
            /**
             * Gets array of all "mex-interceptor" elements
             */
            public org.apache.ode.bpel.dd.TMexInterceptor[] getMexInterceptorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEXINTERCEPTOR$0, targetList);
                    org.apache.ode.bpel.dd.TMexInterceptor[] result = new org.apache.ode.bpel.dd.TMexInterceptor[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "mex-interceptor" element
             */
            public org.apache.ode.bpel.dd.TMexInterceptor getMexInterceptorArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.dd.TMexInterceptor target = null;
                    target = (org.apache.ode.bpel.dd.TMexInterceptor)get_store().find_element_user(MEXINTERCEPTOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "mex-interceptor" element
             */
            public int sizeOfMexInterceptorArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEXINTERCEPTOR$0);
                }
            }
            
            /**
             * Sets array of all "mex-interceptor" element
             */
            public void setMexInterceptorArray(org.apache.ode.bpel.dd.TMexInterceptor[] mexInterceptorArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(mexInterceptorArray, MEXINTERCEPTOR$0);
                }
            }
            
            /**
             * Sets ith "mex-interceptor" element
             */
            public void setMexInterceptorArray(int i, org.apache.ode.bpel.dd.TMexInterceptor mexInterceptor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.dd.TMexInterceptor target = null;
                    target = (org.apache.ode.bpel.dd.TMexInterceptor)get_store().find_element_user(MEXINTERCEPTOR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(mexInterceptor);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "mex-interceptor" element
             */
            public org.apache.ode.bpel.dd.TMexInterceptor insertNewMexInterceptor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.dd.TMexInterceptor target = null;
                    target = (org.apache.ode.bpel.dd.TMexInterceptor)get_store().insert_element_user(MEXINTERCEPTOR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "mex-interceptor" element
             */
            public org.apache.ode.bpel.dd.TMexInterceptor addNewMexInterceptor()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.dd.TMexInterceptor target = null;
                    target = (org.apache.ode.bpel.dd.TMexInterceptor)get_store().add_element_user(MEXINTERCEPTOR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "mex-interceptor" element
             */
            public void removeMexInterceptor(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEXINTERCEPTOR$0, i);
                }
            }
        }
    }
}
