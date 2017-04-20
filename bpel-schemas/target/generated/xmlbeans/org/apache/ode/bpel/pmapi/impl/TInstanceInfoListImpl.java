/*
 * XML Type:  tInstanceInfoList
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TInstanceInfoList
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tInstanceInfoList(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TInstanceInfoListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TInstanceInfoList
{
    
    public TInstanceInfoListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANCEINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instance-info");
    
    
    /**
     * Gets a List of "instance-info" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.TInstanceInfo> getInstanceInfoList()
    {
        final class InstanceInfoList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TInstanceInfo>
        {
            public org.apache.ode.bpel.pmapi.TInstanceInfo get(int i)
                { return TInstanceInfoListImpl.this.getInstanceInfoArray(i); }
            
            public org.apache.ode.bpel.pmapi.TInstanceInfo set(int i, org.apache.ode.bpel.pmapi.TInstanceInfo o)
            {
                org.apache.ode.bpel.pmapi.TInstanceInfo old = TInstanceInfoListImpl.this.getInstanceInfoArray(i);
                TInstanceInfoListImpl.this.setInstanceInfoArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.TInstanceInfo o)
                { TInstanceInfoListImpl.this.insertNewInstanceInfo(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.TInstanceInfo remove(int i)
            {
                org.apache.ode.bpel.pmapi.TInstanceInfo old = TInstanceInfoListImpl.this.getInstanceInfoArray(i);
                TInstanceInfoListImpl.this.removeInstanceInfo(i);
                return old;
            }
            
            public int size()
                { return TInstanceInfoListImpl.this.sizeOfInstanceInfoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InstanceInfoList();
        }
    }
    
    /**
     * Gets array of all "instance-info" elements
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo[] getInstanceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTANCEINFO$0, targetList);
            org.apache.ode.bpel.pmapi.TInstanceInfo[] result = new org.apache.ode.bpel.pmapi.TInstanceInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "instance-info" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo getInstanceInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().find_element_user(INSTANCEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "instance-info" element
     */
    public int sizeOfInstanceInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANCEINFO$0);
        }
    }
    
    /**
     * Sets array of all "instance-info" element
     */
    public void setInstanceInfoArray(org.apache.ode.bpel.pmapi.TInstanceInfo[] instanceInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(instanceInfoArray, INSTANCEINFO$0);
        }
    }
    
    /**
     * Sets ith "instance-info" element
     */
    public void setInstanceInfoArray(int i, org.apache.ode.bpel.pmapi.TInstanceInfo instanceInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().find_element_user(INSTANCEINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instanceInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instance-info" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo insertNewInstanceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().insert_element_user(INSTANCEINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instance-info" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo addNewInstanceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().add_element_user(INSTANCEINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "instance-info" element
     */
    public void removeInstanceInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANCEINFO$0, i);
        }
    }
}
