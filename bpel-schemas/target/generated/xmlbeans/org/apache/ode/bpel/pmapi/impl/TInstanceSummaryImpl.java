/*
 * XML Type:  tInstanceSummary
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TInstanceSummary
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tInstanceSummary(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TInstanceSummaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TInstanceSummary
{
    
    public TInstanceSummaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANCES$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instances");
    private static final javax.xml.namespace.QName FAILURES$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "failures");
    
    
    /**
     * Gets a List of "instances" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.TInstanceSummary.Instances> getInstancesList()
    {
        final class InstancesList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TInstanceSummary.Instances>
        {
            public org.apache.ode.bpel.pmapi.TInstanceSummary.Instances get(int i)
                { return TInstanceSummaryImpl.this.getInstancesArray(i); }
            
            public org.apache.ode.bpel.pmapi.TInstanceSummary.Instances set(int i, org.apache.ode.bpel.pmapi.TInstanceSummary.Instances o)
            {
                org.apache.ode.bpel.pmapi.TInstanceSummary.Instances old = TInstanceSummaryImpl.this.getInstancesArray(i);
                TInstanceSummaryImpl.this.setInstancesArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.TInstanceSummary.Instances o)
                { TInstanceSummaryImpl.this.insertNewInstances(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.TInstanceSummary.Instances remove(int i)
            {
                org.apache.ode.bpel.pmapi.TInstanceSummary.Instances old = TInstanceSummaryImpl.this.getInstancesArray(i);
                TInstanceSummaryImpl.this.removeInstances(i);
                return old;
            }
            
            public int size()
                { return TInstanceSummaryImpl.this.sizeOfInstancesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InstancesList();
        }
    }
    
    /**
     * Gets array of all "instances" elements
     */
    public org.apache.ode.bpel.pmapi.TInstanceSummary.Instances[] getInstancesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTANCES$0, targetList);
            org.apache.ode.bpel.pmapi.TInstanceSummary.Instances[] result = new org.apache.ode.bpel.pmapi.TInstanceSummary.Instances[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "instances" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceSummary.Instances getInstancesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceSummary.Instances target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceSummary.Instances)get_store().find_element_user(INSTANCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "instances" element
     */
    public int sizeOfInstancesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANCES$0);
        }
    }
    
    /**
     * Sets array of all "instances" element
     */
    public void setInstancesArray(org.apache.ode.bpel.pmapi.TInstanceSummary.Instances[] instancesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(instancesArray, INSTANCES$0);
        }
    }
    
    /**
     * Sets ith "instances" element
     */
    public void setInstancesArray(int i, org.apache.ode.bpel.pmapi.TInstanceSummary.Instances instances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceSummary.Instances target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceSummary.Instances)get_store().find_element_user(INSTANCES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instances);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instances" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceSummary.Instances insertNewInstances(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceSummary.Instances target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceSummary.Instances)get_store().insert_element_user(INSTANCES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instances" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceSummary.Instances addNewInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceSummary.Instances target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceSummary.Instances)get_store().add_element_user(INSTANCES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "instances" element
     */
    public void removeInstances(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANCES$0, i);
        }
    }
    
    /**
     * Gets the "failures" element
     */
    public org.apache.ode.bpel.pmapi.TFailuresInfo getFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailuresInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().find_element_user(FAILURES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "failures" element
     */
    public boolean isSetFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILURES$2) != 0;
        }
    }
    
    /**
     * Sets the "failures" element
     */
    public void setFailures(org.apache.ode.bpel.pmapi.TFailuresInfo failures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailuresInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().find_element_user(FAILURES$2, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().add_element_user(FAILURES$2);
            }
            target.set(failures);
        }
    }
    
    /**
     * Appends and returns a new empty "failures" element
     */
    public org.apache.ode.bpel.pmapi.TFailuresInfo addNewFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailuresInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().add_element_user(FAILURES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "failures" element
     */
    public void unsetFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILURES$2, 0);
        }
    }
    /**
     * An XML instances(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class InstancesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TInstanceSummary.Instances
    {
        
        public InstancesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATE$0 = 
            new javax.xml.namespace.QName("", "state");
        private static final javax.xml.namespace.QName COUNT$2 = 
            new javax.xml.namespace.QName("", "count");
        
        
        /**
         * Gets the "state" attribute
         */
        public org.apache.ode.bpel.pmapi.TInstanceStatus.Enum getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$0);
                if (target == null)
                {
                    return null;
                }
                return (org.apache.ode.bpel.pmapi.TInstanceStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" attribute
         */
        public org.apache.ode.bpel.pmapi.TInstanceStatus xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TInstanceStatus target = null;
                target = (org.apache.ode.bpel.pmapi.TInstanceStatus)get_store().find_attribute_user(STATE$0);
                return target;
            }
        }
        
        /**
         * Sets the "state" attribute
         */
        public void setState(org.apache.ode.bpel.pmapi.TInstanceStatus.Enum state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATE$0);
                }
                target.setEnumValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" attribute
         */
        public void xsetState(org.apache.ode.bpel.pmapi.TInstanceStatus state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TInstanceStatus target = null;
                target = (org.apache.ode.bpel.pmapi.TInstanceStatus)get_store().find_attribute_user(STATE$0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.pmapi.TInstanceStatus)get_store().add_attribute_user(STATE$0);
                }
                target.set(state);
            }
        }
        
        /**
         * Gets the "count" attribute
         */
        public int getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "count" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COUNT$2);
                return target;
            }
        }
        
        /**
         * Sets the "count" attribute
         */
        public void setCount(int count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
                }
                target.setIntValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "count" attribute
         */
        public void xsetCount(org.apache.xmlbeans.XmlInt count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(COUNT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(COUNT$2);
                }
                target.set(count);
            }
        }
    }
}
