/*
 * XML Type:  tSchedules
 * Namespace: http://www.apache.org/ode/schemas/schedules/2009/05
 * Java type: org.apache.ode.bpel.schedules.TSchedules
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.schedules.impl;
/**
 * An XML tSchedules(@http://www.apache.org/ode/schemas/schedules/2009/05).
 *
 * This is a complex type.
 */
public class TSchedulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.schedules.TSchedules
{
    
    public TSchedulesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEDULE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/schedules/2009/05", "schedule");
    
    
    /**
     * Gets a List of "schedule" elements
     */
    public java.util.List<org.apache.ode.bpel.schedules.TSchedule> getScheduleList()
    {
        final class ScheduleList extends java.util.AbstractList<org.apache.ode.bpel.schedules.TSchedule>
        {
            public org.apache.ode.bpel.schedules.TSchedule get(int i)
                { return TSchedulesImpl.this.getScheduleArray(i); }
            
            public org.apache.ode.bpel.schedules.TSchedule set(int i, org.apache.ode.bpel.schedules.TSchedule o)
            {
                org.apache.ode.bpel.schedules.TSchedule old = TSchedulesImpl.this.getScheduleArray(i);
                TSchedulesImpl.this.setScheduleArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.schedules.TSchedule o)
                { TSchedulesImpl.this.insertNewSchedule(i).set(o); }
            
            public org.apache.ode.bpel.schedules.TSchedule remove(int i)
            {
                org.apache.ode.bpel.schedules.TSchedule old = TSchedulesImpl.this.getScheduleArray(i);
                TSchedulesImpl.this.removeSchedule(i);
                return old;
            }
            
            public int size()
                { return TSchedulesImpl.this.sizeOfScheduleArray(); }
            
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
    public org.apache.ode.bpel.schedules.TSchedule[] getScheduleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCHEDULE$0, targetList);
            org.apache.ode.bpel.schedules.TSchedule[] result = new org.apache.ode.bpel.schedules.TSchedule[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "schedule" element
     */
    public org.apache.ode.bpel.schedules.TSchedule getScheduleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.schedules.TSchedule target = null;
            target = (org.apache.ode.bpel.schedules.TSchedule)get_store().find_element_user(SCHEDULE$0, i);
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
            return get_store().count_elements(SCHEDULE$0);
        }
    }
    
    /**
     * Sets array of all "schedule" element
     */
    public void setScheduleArray(org.apache.ode.bpel.schedules.TSchedule[] scheduleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scheduleArray, SCHEDULE$0);
        }
    }
    
    /**
     * Sets ith "schedule" element
     */
    public void setScheduleArray(int i, org.apache.ode.bpel.schedules.TSchedule schedule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.schedules.TSchedule target = null;
            target = (org.apache.ode.bpel.schedules.TSchedule)get_store().find_element_user(SCHEDULE$0, i);
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
    public org.apache.ode.bpel.schedules.TSchedule insertNewSchedule(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.schedules.TSchedule target = null;
            target = (org.apache.ode.bpel.schedules.TSchedule)get_store().insert_element_user(SCHEDULE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schedule" element
     */
    public org.apache.ode.bpel.schedules.TSchedule addNewSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.schedules.TSchedule target = null;
            target = (org.apache.ode.bpel.schedules.TSchedule)get_store().add_element_user(SCHEDULE$0);
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
            get_store().remove_element(SCHEDULE$0, i);
        }
    }
}
