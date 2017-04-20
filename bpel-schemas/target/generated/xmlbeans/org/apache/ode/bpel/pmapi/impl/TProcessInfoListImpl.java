/*
 * XML Type:  tProcessInfoList
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TProcessInfoList
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tProcessInfoList(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TProcessInfoListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TProcessInfoList
{
    
    public TProcessInfoListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-info");
    
    
    /**
     * Gets a List of "process-info" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.TProcessInfo> getProcessInfoList()
    {
        final class ProcessInfoList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TProcessInfo>
        {
            public org.apache.ode.bpel.pmapi.TProcessInfo get(int i)
                { return TProcessInfoListImpl.this.getProcessInfoArray(i); }
            
            public org.apache.ode.bpel.pmapi.TProcessInfo set(int i, org.apache.ode.bpel.pmapi.TProcessInfo o)
            {
                org.apache.ode.bpel.pmapi.TProcessInfo old = TProcessInfoListImpl.this.getProcessInfoArray(i);
                TProcessInfoListImpl.this.setProcessInfoArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.TProcessInfo o)
                { TProcessInfoListImpl.this.insertNewProcessInfo(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.TProcessInfo remove(int i)
            {
                org.apache.ode.bpel.pmapi.TProcessInfo old = TProcessInfoListImpl.this.getProcessInfoArray(i);
                TProcessInfoListImpl.this.removeProcessInfo(i);
                return old;
            }
            
            public int size()
                { return TProcessInfoListImpl.this.sizeOfProcessInfoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProcessInfoList();
        }
    }
    
    /**
     * Gets array of all "process-info" elements
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo[] getProcessInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSINFO$0, targetList);
            org.apache.ode.bpel.pmapi.TProcessInfo[] result = new org.apache.ode.bpel.pmapi.TProcessInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "process-info" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo getProcessInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().find_element_user(PROCESSINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "process-info" element
     */
    public int sizeOfProcessInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSINFO$0);
        }
    }
    
    /**
     * Sets array of all "process-info" element
     */
    public void setProcessInfoArray(org.apache.ode.bpel.pmapi.TProcessInfo[] processInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processInfoArray, PROCESSINFO$0);
        }
    }
    
    /**
     * Sets ith "process-info" element
     */
    public void setProcessInfoArray(int i, org.apache.ode.bpel.pmapi.TProcessInfo processInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().find_element_user(PROCESSINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "process-info" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo insertNewProcessInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().insert_element_user(PROCESSINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "process-info" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo addNewProcessInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().add_element_user(PROCESSINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "process-info" element
     */
    public void removeProcessInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSINFO$0, i);
        }
    }
}
