/*
 * XML Type:  tSchedule
 * Namespace: http://www.apache.org/ode/schemas/schedules/2009/05
 * Java type: org.apache.ode.bpel.schedules.TSchedule
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.schedules.impl;
/**
 * An XML tSchedule(@http://www.apache.org/ode/schemas/schedules/2009/05).
 *
 * This is a complex type.
 */
public class TScheduleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.schedules.TSchedule
{
    
    public TScheduleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLEANUP$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/schedules/2009/05", "cleanup");
    private static final javax.xml.namespace.QName WHEN$2 = 
        new javax.xml.namespace.QName("", "when");
    
    
    /**
     * Gets a List of "cleanup" elements
     */
    public java.util.List<org.apache.ode.bpel.dd.TCleanup> getCleanupList()
    {
        final class CleanupList extends java.util.AbstractList<org.apache.ode.bpel.dd.TCleanup>
        {
            public org.apache.ode.bpel.dd.TCleanup get(int i)
                { return TScheduleImpl.this.getCleanupArray(i); }
            
            public org.apache.ode.bpel.dd.TCleanup set(int i, org.apache.ode.bpel.dd.TCleanup o)
            {
                org.apache.ode.bpel.dd.TCleanup old = TScheduleImpl.this.getCleanupArray(i);
                TScheduleImpl.this.setCleanupArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.dd.TCleanup o)
                { TScheduleImpl.this.insertNewCleanup(i).set(o); }
            
            public org.apache.ode.bpel.dd.TCleanup remove(int i)
            {
                org.apache.ode.bpel.dd.TCleanup old = TScheduleImpl.this.getCleanupArray(i);
                TScheduleImpl.this.removeCleanup(i);
                return old;
            }
            
            public int size()
                { return TScheduleImpl.this.sizeOfCleanupArray(); }
            
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
            get_store().find_all_element_users(CLEANUP$0, targetList);
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
            target = (org.apache.ode.bpel.dd.TCleanup)get_store().find_element_user(CLEANUP$0, i);
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
            return get_store().count_elements(CLEANUP$0);
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
            arraySetterHelper(cleanupArray, CLEANUP$0);
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
            target = (org.apache.ode.bpel.dd.TCleanup)get_store().find_element_user(CLEANUP$0, i);
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
            target = (org.apache.ode.bpel.dd.TCleanup)get_store().insert_element_user(CLEANUP$0, i);
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
            target = (org.apache.ode.bpel.dd.TCleanup)get_store().add_element_user(CLEANUP$0);
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
            get_store().remove_element(CLEANUP$0, i);
        }
    }
    
    /**
     * Gets the "when" attribute
     */
    public java.lang.String getWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WHEN$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "when" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWhen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WHEN$2);
            return target;
        }
    }
    
    /**
     * Sets the "when" attribute
     */
    public void setWhen(java.lang.String when)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WHEN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WHEN$2);
            }
            target.setStringValue(when);
        }
    }
    
    /**
     * Sets (as xml) the "when" attribute
     */
    public void xsetWhen(org.apache.xmlbeans.XmlString when)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WHEN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WHEN$2);
            }
            target.set(when);
        }
    }
}
