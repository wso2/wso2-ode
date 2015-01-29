/*
 * XML Type:  tEnableEventList
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TEnableEventList
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tEnableEventList(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TEnableEventListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TEnableEventList
{
    
    public TEnableEventListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENABLEEVENT$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "enable-event");
    
    
    /**
     * Gets a List of "enable-event" elements
     */
    public java.util.List<java.lang.String> getEnableEventList()
    {
        final class EnableEventList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return TEnableEventListImpl.this.getEnableEventArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = TEnableEventListImpl.this.getEnableEventArray(i);
                TEnableEventListImpl.this.setEnableEventArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { TEnableEventListImpl.this.insertEnableEvent(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = TEnableEventListImpl.this.getEnableEventArray(i);
                TEnableEventListImpl.this.removeEnableEvent(i);
                return old;
            }
            
            public int size()
                { return TEnableEventListImpl.this.sizeOfEnableEventArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EnableEventList();
        }
    }
    
    /**
     * Gets array of all "enable-event" elements
     */
    public java.lang.String[] getEnableEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENABLEEVENT$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "enable-event" element
     */
    public java.lang.String getEnableEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLEEVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "enable-event" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetEnableEventList()
    {
        final class EnableEventList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return TEnableEventListImpl.this.xgetEnableEventArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = TEnableEventListImpl.this.xgetEnableEventArray(i);
                TEnableEventListImpl.this.xsetEnableEventArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { TEnableEventListImpl.this.insertNewEnableEvent(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = TEnableEventListImpl.this.xgetEnableEventArray(i);
                TEnableEventListImpl.this.removeEnableEvent(i);
                return old;
            }
            
            public int size()
                { return TEnableEventListImpl.this.sizeOfEnableEventArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EnableEventList();
        }
    }
    
    /**
     * Gets (as xml) array of all "enable-event" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetEnableEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENABLEEVENT$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "enable-event" element
     */
    public org.apache.xmlbeans.XmlString xgetEnableEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLEEVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "enable-event" element
     */
    public int sizeOfEnableEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLEEVENT$0);
        }
    }
    
    /**
     * Sets array of all "enable-event" element
     */
    public void setEnableEventArray(java.lang.String[] enableEventArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(enableEventArray, ENABLEEVENT$0);
        }
    }
    
    /**
     * Sets ith "enable-event" element
     */
    public void setEnableEventArray(int i, java.lang.String enableEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLEEVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(enableEvent);
        }
    }
    
    /**
     * Sets (as xml) array of all "enable-event" element
     */
    public void xsetEnableEventArray(org.apache.xmlbeans.XmlString[]enableEventArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(enableEventArray, ENABLEEVENT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "enable-event" element
     */
    public void xsetEnableEventArray(int i, org.apache.xmlbeans.XmlString enableEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENABLEEVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(enableEvent);
        }
    }
    
    /**
     * Inserts the value as the ith "enable-event" element
     */
    public void insertEnableEvent(int i, java.lang.String enableEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENABLEEVENT$0, i);
            target.setStringValue(enableEvent);
        }
    }
    
    /**
     * Appends the value as the last "enable-event" element
     */
    public void addEnableEvent(java.lang.String enableEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENABLEEVENT$0);
            target.setStringValue(enableEvent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "enable-event" element
     */
    public org.apache.xmlbeans.XmlString insertNewEnableEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ENABLEEVENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "enable-event" element
     */
    public org.apache.xmlbeans.XmlString addNewEnableEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENABLEEVENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "enable-event" element
     */
    public void removeEnableEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLEEVENT$0, i);
        }
    }
}
