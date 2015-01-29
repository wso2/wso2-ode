/*
 * XML Type:  tEventInfoList
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TEventInfoList
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tEventInfoList(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TEventInfoListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TEventInfoList
{
    
    public TEventInfoListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "event-info");
    
    
    /**
     * Gets a List of "event-info" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.TEventInfo> getEventInfoList()
    {
        final class EventInfoList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TEventInfo>
        {
            public org.apache.ode.bpel.pmapi.TEventInfo get(int i)
                { return TEventInfoListImpl.this.getEventInfoArray(i); }
            
            public org.apache.ode.bpel.pmapi.TEventInfo set(int i, org.apache.ode.bpel.pmapi.TEventInfo o)
            {
                org.apache.ode.bpel.pmapi.TEventInfo old = TEventInfoListImpl.this.getEventInfoArray(i);
                TEventInfoListImpl.this.setEventInfoArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.TEventInfo o)
                { TEventInfoListImpl.this.insertNewEventInfo(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.TEventInfo remove(int i)
            {
                org.apache.ode.bpel.pmapi.TEventInfo old = TEventInfoListImpl.this.getEventInfoArray(i);
                TEventInfoListImpl.this.removeEventInfo(i);
                return old;
            }
            
            public int size()
                { return TEventInfoListImpl.this.sizeOfEventInfoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EventInfoList();
        }
    }
    
    /**
     * Gets array of all "event-info" elements
     */
    public org.apache.ode.bpel.pmapi.TEventInfo[] getEventInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTINFO$0, targetList);
            org.apache.ode.bpel.pmapi.TEventInfo[] result = new org.apache.ode.bpel.pmapi.TEventInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "event-info" element
     */
    public org.apache.ode.bpel.pmapi.TEventInfo getEventInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().find_element_user(EVENTINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "event-info" element
     */
    public int sizeOfEventInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTINFO$0);
        }
    }
    
    /**
     * Sets array of all "event-info" element
     */
    public void setEventInfoArray(org.apache.ode.bpel.pmapi.TEventInfo[] eventInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventInfoArray, EVENTINFO$0);
        }
    }
    
    /**
     * Sets ith "event-info" element
     */
    public void setEventInfoArray(int i, org.apache.ode.bpel.pmapi.TEventInfo eventInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().find_element_user(EVENTINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "event-info" element
     */
    public org.apache.ode.bpel.pmapi.TEventInfo insertNewEventInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().insert_element_user(EVENTINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "event-info" element
     */
    public org.apache.ode.bpel.pmapi.TEventInfo addNewEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().add_element_user(EVENTINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "event-info" element
     */
    public void removeEventInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTINFO$0, i);
        }
    }
}
