/*
 * XML Type:  GetCommunication
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.GetCommunication
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML GetCommunication(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class GetCommunicationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.GetCommunication
{
    
    public GetCommunicationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IID$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "iid");
    
    
    /**
     * Gets a List of "iid" elements
     */
    public java.util.List<java.lang.Long> getIidList()
    {
        final class IidList extends java.util.AbstractList<java.lang.Long>
        {
            public java.lang.Long get(int i)
                { return GetCommunicationImpl.this.getIidArray(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = GetCommunicationImpl.this.getIidArray(i);
                GetCommunicationImpl.this.setIidArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { GetCommunicationImpl.this.insertIid(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = GetCommunicationImpl.this.getIidArray(i);
                GetCommunicationImpl.this.removeIid(i);
                return old;
            }
            
            public int size()
                { return GetCommunicationImpl.this.sizeOfIidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IidList();
        }
    }
    
    /**
     * Gets array of all "iid" elements
     */
    public long[] getIidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IID$0, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "iid" element
     */
    public long getIidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "iid" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlLong> xgetIidList()
    {
        final class IidList extends java.util.AbstractList<org.apache.xmlbeans.XmlLong>
        {
            public org.apache.xmlbeans.XmlLong get(int i)
                { return GetCommunicationImpl.this.xgetIidArray(i); }
            
            public org.apache.xmlbeans.XmlLong set(int i, org.apache.xmlbeans.XmlLong o)
            {
                org.apache.xmlbeans.XmlLong old = GetCommunicationImpl.this.xgetIidArray(i);
                GetCommunicationImpl.this.xsetIidArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlLong o)
                { GetCommunicationImpl.this.insertNewIid(i).set(o); }
            
            public org.apache.xmlbeans.XmlLong remove(int i)
            {
                org.apache.xmlbeans.XmlLong old = GetCommunicationImpl.this.xgetIidArray(i);
                GetCommunicationImpl.this.removeIid(i);
                return old;
            }
            
            public int size()
                { return GetCommunicationImpl.this.sizeOfIidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IidList();
        }
    }
    
    /**
     * Gets (as xml) array of all "iid" elements
     */
    public org.apache.xmlbeans.XmlLong[] xgetIidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IID$0, targetList);
            org.apache.xmlbeans.XmlLong[] result = new org.apache.xmlbeans.XmlLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "iid" element
     */
    public org.apache.xmlbeans.XmlLong xgetIidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlLong)target;
        }
    }
    
    /**
     * Returns number of "iid" element
     */
    public int sizeOfIidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IID$0);
        }
    }
    
    /**
     * Sets array of all "iid" element
     */
    public void setIidArray(long[] iidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iidArray, IID$0);
        }
    }
    
    /**
     * Sets ith "iid" element
     */
    public void setIidArray(int i, long iid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(iid);
        }
    }
    
    /**
     * Sets (as xml) array of all "iid" element
     */
    public void xsetIidArray(org.apache.xmlbeans.XmlLong[]iidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iidArray, IID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "iid" element
     */
    public void xsetIidArray(int i, org.apache.xmlbeans.XmlLong iid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(IID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iid);
        }
    }
    
    /**
     * Inserts the value as the ith "iid" element
     */
    public void insertIid(int i, long iid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(IID$0, i);
            target.setLongValue(iid);
        }
    }
    
    /**
     * Appends the value as the last "iid" element
     */
    public void addIid(long iid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IID$0);
            target.setLongValue(iid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "iid" element
     */
    public org.apache.xmlbeans.XmlLong insertNewIid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(IID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "iid" element
     */
    public org.apache.xmlbeans.XmlLong addNewIid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(IID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "iid" element
     */
    public void removeIid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IID$0, i);
        }
    }
}
