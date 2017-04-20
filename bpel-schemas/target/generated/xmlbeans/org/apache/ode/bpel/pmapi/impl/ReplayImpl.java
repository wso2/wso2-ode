/*
 * XML Type:  Replay
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.Replay
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML Replay(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class ReplayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.Replay
{
    
    public ReplayImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPGRADEINSTANCE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "upgradeInstance");
    private static final javax.xml.namespace.QName REPLACEINSTANCE$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "replaceInstance");
    private static final javax.xml.namespace.QName RESTOREINSTANCE$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "restoreInstance");
    
    
    /**
     * Gets a List of "upgradeInstance" elements
     */
    public java.util.List<java.lang.Long> getUpgradeInstanceList()
    {
        final class UpgradeInstanceList extends java.util.AbstractList<java.lang.Long>
        {
            public java.lang.Long get(int i)
                { return ReplayImpl.this.getUpgradeInstanceArray(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = ReplayImpl.this.getUpgradeInstanceArray(i);
                ReplayImpl.this.setUpgradeInstanceArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { ReplayImpl.this.insertUpgradeInstance(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = ReplayImpl.this.getUpgradeInstanceArray(i);
                ReplayImpl.this.removeUpgradeInstance(i);
                return old;
            }
            
            public int size()
                { return ReplayImpl.this.sizeOfUpgradeInstanceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UpgradeInstanceList();
        }
    }
    
    /**
     * Gets array of all "upgradeInstance" elements
     */
    public long[] getUpgradeInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPGRADEINSTANCE$0, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "upgradeInstance" element
     */
    public long getUpgradeInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPGRADEINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "upgradeInstance" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlLong> xgetUpgradeInstanceList()
    {
        final class UpgradeInstanceList extends java.util.AbstractList<org.apache.xmlbeans.XmlLong>
        {
            public org.apache.xmlbeans.XmlLong get(int i)
                { return ReplayImpl.this.xgetUpgradeInstanceArray(i); }
            
            public org.apache.xmlbeans.XmlLong set(int i, org.apache.xmlbeans.XmlLong o)
            {
                org.apache.xmlbeans.XmlLong old = ReplayImpl.this.xgetUpgradeInstanceArray(i);
                ReplayImpl.this.xsetUpgradeInstanceArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlLong o)
                { ReplayImpl.this.insertNewUpgradeInstance(i).set(o); }
            
            public org.apache.xmlbeans.XmlLong remove(int i)
            {
                org.apache.xmlbeans.XmlLong old = ReplayImpl.this.xgetUpgradeInstanceArray(i);
                ReplayImpl.this.removeUpgradeInstance(i);
                return old;
            }
            
            public int size()
                { return ReplayImpl.this.sizeOfUpgradeInstanceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UpgradeInstanceList();
        }
    }
    
    /**
     * Gets (as xml) array of all "upgradeInstance" elements
     */
    public org.apache.xmlbeans.XmlLong[] xgetUpgradeInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPGRADEINSTANCE$0, targetList);
            org.apache.xmlbeans.XmlLong[] result = new org.apache.xmlbeans.XmlLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "upgradeInstance" element
     */
    public org.apache.xmlbeans.XmlLong xgetUpgradeInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UPGRADEINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlLong)target;
        }
    }
    
    /**
     * Returns number of "upgradeInstance" element
     */
    public int sizeOfUpgradeInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPGRADEINSTANCE$0);
        }
    }
    
    /**
     * Sets array of all "upgradeInstance" element
     */
    public void setUpgradeInstanceArray(long[] upgradeInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(upgradeInstanceArray, UPGRADEINSTANCE$0);
        }
    }
    
    /**
     * Sets ith "upgradeInstance" element
     */
    public void setUpgradeInstanceArray(int i, long upgradeInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPGRADEINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(upgradeInstance);
        }
    }
    
    /**
     * Sets (as xml) array of all "upgradeInstance" element
     */
    public void xsetUpgradeInstanceArray(org.apache.xmlbeans.XmlLong[]upgradeInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(upgradeInstanceArray, UPGRADEINSTANCE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "upgradeInstance" element
     */
    public void xsetUpgradeInstanceArray(int i, org.apache.xmlbeans.XmlLong upgradeInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(UPGRADEINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(upgradeInstance);
        }
    }
    
    /**
     * Inserts the value as the ith "upgradeInstance" element
     */
    public void insertUpgradeInstance(int i, long upgradeInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UPGRADEINSTANCE$0, i);
            target.setLongValue(upgradeInstance);
        }
    }
    
    /**
     * Appends the value as the last "upgradeInstance" element
     */
    public void addUpgradeInstance(long upgradeInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPGRADEINSTANCE$0);
            target.setLongValue(upgradeInstance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "upgradeInstance" element
     */
    public org.apache.xmlbeans.XmlLong insertNewUpgradeInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(UPGRADEINSTANCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "upgradeInstance" element
     */
    public org.apache.xmlbeans.XmlLong addNewUpgradeInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(UPGRADEINSTANCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "upgradeInstance" element
     */
    public void removeUpgradeInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPGRADEINSTANCE$0, i);
        }
    }
    
    /**
     * Gets a List of "replaceInstance" elements
     */
    public java.util.List<java.lang.Long> getReplaceInstanceList()
    {
        final class ReplaceInstanceList extends java.util.AbstractList<java.lang.Long>
        {
            public java.lang.Long get(int i)
                { return ReplayImpl.this.getReplaceInstanceArray(i); }
            
            public java.lang.Long set(int i, java.lang.Long o)
            {
                java.lang.Long old = ReplayImpl.this.getReplaceInstanceArray(i);
                ReplayImpl.this.setReplaceInstanceArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.Long o)
                { ReplayImpl.this.insertReplaceInstance(i, o); }
            
            public java.lang.Long remove(int i)
            {
                java.lang.Long old = ReplayImpl.this.getReplaceInstanceArray(i);
                ReplayImpl.this.removeReplaceInstance(i);
                return old;
            }
            
            public int size()
                { return ReplayImpl.this.sizeOfReplaceInstanceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReplaceInstanceList();
        }
    }
    
    /**
     * Gets array of all "replaceInstance" elements
     */
    public long[] getReplaceInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPLACEINSTANCE$2, targetList);
            long[] result = new long[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getLongValue();
            return result;
        }
    }
    
    /**
     * Gets ith "replaceInstance" element
     */
    public long getReplaceInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEINSTANCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "replaceInstance" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlLong> xgetReplaceInstanceList()
    {
        final class ReplaceInstanceList extends java.util.AbstractList<org.apache.xmlbeans.XmlLong>
        {
            public org.apache.xmlbeans.XmlLong get(int i)
                { return ReplayImpl.this.xgetReplaceInstanceArray(i); }
            
            public org.apache.xmlbeans.XmlLong set(int i, org.apache.xmlbeans.XmlLong o)
            {
                org.apache.xmlbeans.XmlLong old = ReplayImpl.this.xgetReplaceInstanceArray(i);
                ReplayImpl.this.xsetReplaceInstanceArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlLong o)
                { ReplayImpl.this.insertNewReplaceInstance(i).set(o); }
            
            public org.apache.xmlbeans.XmlLong remove(int i)
            {
                org.apache.xmlbeans.XmlLong old = ReplayImpl.this.xgetReplaceInstanceArray(i);
                ReplayImpl.this.removeReplaceInstance(i);
                return old;
            }
            
            public int size()
                { return ReplayImpl.this.sizeOfReplaceInstanceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReplaceInstanceList();
        }
    }
    
    /**
     * Gets (as xml) array of all "replaceInstance" elements
     */
    public org.apache.xmlbeans.XmlLong[] xgetReplaceInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPLACEINSTANCE$2, targetList);
            org.apache.xmlbeans.XmlLong[] result = new org.apache.xmlbeans.XmlLong[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "replaceInstance" element
     */
    public org.apache.xmlbeans.XmlLong xgetReplaceInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(REPLACEINSTANCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlLong)target;
        }
    }
    
    /**
     * Returns number of "replaceInstance" element
     */
    public int sizeOfReplaceInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLACEINSTANCE$2);
        }
    }
    
    /**
     * Sets array of all "replaceInstance" element
     */
    public void setReplaceInstanceArray(long[] replaceInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(replaceInstanceArray, REPLACEINSTANCE$2);
        }
    }
    
    /**
     * Sets ith "replaceInstance" element
     */
    public void setReplaceInstanceArray(int i, long replaceInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACEINSTANCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(replaceInstance);
        }
    }
    
    /**
     * Sets (as xml) array of all "replaceInstance" element
     */
    public void xsetReplaceInstanceArray(org.apache.xmlbeans.XmlLong[]replaceInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(replaceInstanceArray, REPLACEINSTANCE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "replaceInstance" element
     */
    public void xsetReplaceInstanceArray(int i, org.apache.xmlbeans.XmlLong replaceInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(REPLACEINSTANCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(replaceInstance);
        }
    }
    
    /**
     * Inserts the value as the ith "replaceInstance" element
     */
    public void insertReplaceInstance(int i, long replaceInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REPLACEINSTANCE$2, i);
            target.setLongValue(replaceInstance);
        }
    }
    
    /**
     * Appends the value as the last "replaceInstance" element
     */
    public void addReplaceInstance(long replaceInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLACEINSTANCE$2);
            target.setLongValue(replaceInstance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "replaceInstance" element
     */
    public org.apache.xmlbeans.XmlLong insertNewReplaceInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(REPLACEINSTANCE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "replaceInstance" element
     */
    public org.apache.xmlbeans.XmlLong addNewReplaceInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(REPLACEINSTANCE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "replaceInstance" element
     */
    public void removeReplaceInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLACEINSTANCE$2, i);
        }
    }
    
    /**
     * Gets a List of "restoreInstance" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.CommunicationType> getRestoreInstanceList()
    {
        final class RestoreInstanceList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.CommunicationType>
        {
            public org.apache.ode.bpel.pmapi.CommunicationType get(int i)
                { return ReplayImpl.this.getRestoreInstanceArray(i); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType set(int i, org.apache.ode.bpel.pmapi.CommunicationType o)
            {
                org.apache.ode.bpel.pmapi.CommunicationType old = ReplayImpl.this.getRestoreInstanceArray(i);
                ReplayImpl.this.setRestoreInstanceArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.CommunicationType o)
                { ReplayImpl.this.insertNewRestoreInstance(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType remove(int i)
            {
                org.apache.ode.bpel.pmapi.CommunicationType old = ReplayImpl.this.getRestoreInstanceArray(i);
                ReplayImpl.this.removeRestoreInstance(i);
                return old;
            }
            
            public int size()
                { return ReplayImpl.this.sizeOfRestoreInstanceArray(); }
            
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
            get_store().find_all_element_users(RESTOREINSTANCE$4, targetList);
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
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().find_element_user(RESTOREINSTANCE$4, i);
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
            return get_store().count_elements(RESTOREINSTANCE$4);
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
            arraySetterHelper(restoreInstanceArray, RESTOREINSTANCE$4);
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
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().find_element_user(RESTOREINSTANCE$4, i);
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
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().insert_element_user(RESTOREINSTANCE$4, i);
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
            target = (org.apache.ode.bpel.pmapi.CommunicationType)get_store().add_element_user(RESTOREINSTANCE$4);
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
            get_store().remove_element(RESTOREINSTANCE$4, i);
        }
    }
}
