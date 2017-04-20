/*
 * XML Type:  tActivitytExtInfoList
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TActivitytExtInfoList
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tActivitytExtInfoList(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TActivitytExtInfoListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TActivitytExtInfoList
{
    
    public TActivitytExtInfoListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYEXTINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-ext-info");
    
    
    /**
     * Gets a List of "activity-ext-info" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.TActivityExtInfo> getActivityExtInfoList()
    {
        final class ActivityExtInfoList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TActivityExtInfo>
        {
            public org.apache.ode.bpel.pmapi.TActivityExtInfo get(int i)
                { return TActivitytExtInfoListImpl.this.getActivityExtInfoArray(i); }
            
            public org.apache.ode.bpel.pmapi.TActivityExtInfo set(int i, org.apache.ode.bpel.pmapi.TActivityExtInfo o)
            {
                org.apache.ode.bpel.pmapi.TActivityExtInfo old = TActivitytExtInfoListImpl.this.getActivityExtInfoArray(i);
                TActivitytExtInfoListImpl.this.setActivityExtInfoArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.TActivityExtInfo o)
                { TActivitytExtInfoListImpl.this.insertNewActivityExtInfo(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.TActivityExtInfo remove(int i)
            {
                org.apache.ode.bpel.pmapi.TActivityExtInfo old = TActivitytExtInfoListImpl.this.getActivityExtInfoArray(i);
                TActivitytExtInfoListImpl.this.removeActivityExtInfo(i);
                return old;
            }
            
            public int size()
                { return TActivitytExtInfoListImpl.this.sizeOfActivityExtInfoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ActivityExtInfoList();
        }
    }
    
    /**
     * Gets array of all "activity-ext-info" elements
     */
    public org.apache.ode.bpel.pmapi.TActivityExtInfo[] getActivityExtInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYEXTINFO$0, targetList);
            org.apache.ode.bpel.pmapi.TActivityExtInfo[] result = new org.apache.ode.bpel.pmapi.TActivityExtInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activity-ext-info" element
     */
    public org.apache.ode.bpel.pmapi.TActivityExtInfo getActivityExtInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityExtInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().find_element_user(ACTIVITYEXTINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activity-ext-info" element
     */
    public int sizeOfActivityExtInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYEXTINFO$0);
        }
    }
    
    /**
     * Sets array of all "activity-ext-info" element
     */
    public void setActivityExtInfoArray(org.apache.ode.bpel.pmapi.TActivityExtInfo[] activityExtInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityExtInfoArray, ACTIVITYEXTINFO$0);
        }
    }
    
    /**
     * Sets ith "activity-ext-info" element
     */
    public void setActivityExtInfoArray(int i, org.apache.ode.bpel.pmapi.TActivityExtInfo activityExtInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityExtInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().find_element_user(ACTIVITYEXTINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityExtInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activity-ext-info" element
     */
    public org.apache.ode.bpel.pmapi.TActivityExtInfo insertNewActivityExtInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityExtInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().insert_element_user(ACTIVITYEXTINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activity-ext-info" element
     */
    public org.apache.ode.bpel.pmapi.TActivityExtInfo addNewActivityExtInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityExtInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().add_element_user(ACTIVITYEXTINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "activity-ext-info" element
     */
    public void removeActivityExtInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYEXTINFO$0, i);
        }
    }
}
