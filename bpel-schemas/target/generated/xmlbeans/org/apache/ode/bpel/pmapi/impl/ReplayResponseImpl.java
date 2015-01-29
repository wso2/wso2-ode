/*
 * XML Type:  ReplayResponse
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ReplayResponse
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML ReplayResponse(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class ReplayResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ReplayResponse
{
    
    public ReplayResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTOREDIID$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "restoredIID");
    
    
    /**
     * Gets a List of "restoredIID" elements
     */
    public java.util.List<java.lang.Long> getRestoredIIDList()
    {
        final class RestoredIIDList extends java.util.AbstractList<java.lang.Long>
        {
            public java.lang.Long get(int i)
                { return ReplayResponseImpl.this.getRestoredIIDArray(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = ReplayResponseImpl.this.getRestoredIIDArray(i);
                ReplayResponseImpl.this.setRestoredIIDArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { ReplayResponseImpl.this.insertRestoredIID(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = ReplayResponseImpl.this.getRestoredIIDArray(i);
                ReplayResponseImpl.this.removeRestoredIID(i);
                return old;
            }
            
            public int size()
                { return ReplayResponseImpl.this.sizeOfRestoredIIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RestoredIIDList();
        }
    }
    
    /**
     * Gets array of all "restoredIID" elements
     */
    public long[] getRestoredIIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESTOREDIID$0, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "restoredIID" element
     */
    public long getRestoredIIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTOREDIID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "restoredIID" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlLong> xgetRestoredIIDList()
    {
        final class RestoredIIDList extends java.util.AbstractList<org.apache.xmlbeans.XmlLong>
        {
            public org.apache.xmlbeans.XmlLong get(int i)
                { return ReplayResponseImpl.this.xgetRestoredIIDArray(i); }
            
            public org.apache.xmlbeans.XmlLong set(int i, org.apache.xmlbeans.XmlLong o)
            {
                org.apache.xmlbeans.XmlLong old = ReplayResponseImpl.this.xgetRestoredIIDArray(i);
                ReplayResponseImpl.this.xsetRestoredIIDArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlLong o)
                { ReplayResponseImpl.this.insertNewRestoredIID(i).set(o); }
            
            public org.apache.xmlbeans.XmlLong remove(int i)
            {
                org.apache.xmlbeans.XmlLong old = ReplayResponseImpl.this.xgetRestoredIIDArray(i);
                ReplayResponseImpl.this.removeRestoredIID(i);
                return old;
            }
            
            public int size()
                { return ReplayResponseImpl.this.sizeOfRestoredIIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RestoredIIDList();
        }
    }
    
    /**
     * Gets (as xml) array of all "restoredIID" elements
     */
    public org.apache.xmlbeans.XmlLong[] xgetRestoredIIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESTOREDIID$0, targetList);
            org.apache.xmlbeans.XmlLong[] result = new org.apache.xmlbeans.XmlLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "restoredIID" element
     */
    public org.apache.xmlbeans.XmlLong xgetRestoredIIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RESTOREDIID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlLong)target;
        }
    }
    
    /**
     * Returns number of "restoredIID" element
     */
    public int sizeOfRestoredIIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTOREDIID$0);
        }
    }
    
    /**
     * Sets array of all "restoredIID" element
     */
    public void setRestoredIIDArray(long[] restoredIIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(restoredIIDArray, RESTOREDIID$0);
        }
    }
    
    /**
     * Sets ith "restoredIID" element
     */
    public void setRestoredIIDArray(int i, long restoredIID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTOREDIID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(restoredIID);
        }
    }
    
    /**
     * Sets (as xml) array of all "restoredIID" element
     */
    public void xsetRestoredIIDArray(org.apache.xmlbeans.XmlLong[]restoredIIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(restoredIIDArray, RESTOREDIID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "restoredIID" element
     */
    public void xsetRestoredIIDArray(int i, org.apache.xmlbeans.XmlLong restoredIID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(RESTOREDIID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(restoredIID);
        }
    }
    
    /**
     * Inserts the value as the ith "restoredIID" element
     */
    public void insertRestoredIID(int i, long restoredIID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RESTOREDIID$0, i);
            target.setLongValue(restoredIID);
        }
    }
    
    /**
     * Appends the value as the last "restoredIID" element
     */
    public void addRestoredIID(long restoredIID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTOREDIID$0);
            target.setLongValue(restoredIID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "restoredIID" element
     */
    public org.apache.xmlbeans.XmlLong insertNewRestoredIID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(RESTOREDIID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "restoredIID" element
     */
    public org.apache.xmlbeans.XmlLong addNewRestoredIID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(RESTOREDIID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "restoredIID" element
     */
    public void removeRestoredIID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTOREDIID$0, i);
        }
    }
}
