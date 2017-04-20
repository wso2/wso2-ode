/*
 * XML Type:  GetCommunicationResponse
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.GetCommunicationResponse
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML GetCommunicationResponse(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class GetCommunicationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.GetCommunicationResponse
{
    
    public GetCommunicationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTOREINSTANCE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "restoreInstance");
    
    
    /**
     * Gets a List of "restoreInstance" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.CommunicationType> getRestoreInstanceList()
    {
        final class RestoreInstanceList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.CommunicationType>
        {
            public org.apache.ode.bpel.pmapi.CommunicationType get(int i)
                { return GetCommunicationResponseImpl.this.getRestoreInstanceArray(i); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType set(int i, org.apache.ode.bpel.pmapi.CommunicationType o)
            {
                org.apache.ode.bpel.pmapi.CommunicationType old = GetCommunicationResponseImpl.this.getRestoreInstanceArray(i);
                GetCommunicationResponseImpl.this.setRestoreInstanceArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.CommunicationType o)
                { GetCommunicationResponseImpl.this.insertNewRestoreInstance(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType remove(int i)
            {
                org.apache.ode.bpel.pmapi.CommunicationType old = GetCommunicationResponseImpl.this.getRestoreInstanceArray(i);
                GetCommunicationResponseImpl.this.removeRestoreInstance(i);
                return old;
            }
            
            public int size()
                { return GetCommunicationResponseImpl.this.sizeOfRestoreInstanceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RestoreInstanceList();
        }
    }
    
    /**
     * Gets array of all "restoreInstance" elements
     */
    public org.apache.ode.bpel.pmapi.CommunicationType[] getRestoreInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESTOREINSTANCE$0, targetList);
            org.apache.ode.bpel.pmapi.CommunicationType[] result = new org.apache.ode.bpel.pmapi.CommunicationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "restoreInstance" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType getRestoreInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().find_element_user(RESTOREINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "restoreInstance" element
     */
    public int sizeOfRestoreInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTOREINSTANCE$0);
        }
    }
    
    /**
     * Sets array of all "restoreInstance" element
     */
    public void setRestoreInstanceArray(org.apache.ode.bpel.pmapi.CommunicationType[] restoreInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(restoreInstanceArray, RESTOREINSTANCE$0);
        }
    }
    
    /**
     * Sets ith "restoreInstance" element
     */
    public void setRestoreInstanceArray(int i, org.apache.ode.bpel.pmapi.CommunicationType restoreInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().find_element_user(RESTOREINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(restoreInstance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "restoreInstance" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType insertNewRestoreInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().insert_element_user(RESTOREINSTANCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "restoreInstance" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType addNewRestoreInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().add_element_user(RESTOREINSTANCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "restoreInstance" element
     */
    public void removeRestoreInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTOREINSTANCE$0, i);
        }
    }
}
