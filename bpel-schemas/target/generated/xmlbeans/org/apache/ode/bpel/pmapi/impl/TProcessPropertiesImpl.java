/*
 * XML Type:  tProcessProperties
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TProcessProperties
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tProcessProperties(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TProcessPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TProcessProperties
{
    
    public TProcessPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "property");
    
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.TProcessProperties.Property> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TProcessProperties.Property>
        {
            public org.apache.ode.bpel.pmapi.TProcessProperties.Property get(int i)
                { return TProcessPropertiesImpl.this.getPropertyArray(i); }
            
            public org.apache.ode.bpel.pmapi.TProcessProperties.Property set(int i, org.apache.ode.bpel.pmapi.TProcessProperties.Property o)
            {
                org.apache.ode.bpel.pmapi.TProcessProperties.Property old = TProcessPropertiesImpl.this.getPropertyArray(i);
                TProcessPropertiesImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.TProcessProperties.Property o)
                { TProcessPropertiesImpl.this.insertNewProperty(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.TProcessProperties.Property remove(int i)
            {
                org.apache.ode.bpel.pmapi.TProcessProperties.Property old = TProcessPropertiesImpl.this.getPropertyArray(i);
                TProcessPropertiesImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return TProcessPropertiesImpl.this.sizeOfPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PropertyList();
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.apache.ode.bpel.pmapi.TProcessProperties.Property[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$0, targetList);
            org.apache.ode.bpel.pmapi.TProcessProperties.Property[] result = new org.apache.ode.bpel.pmapi.TProcessProperties.Property[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.apache.ode.bpel.pmapi.TProcessProperties.Property getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessProperties.Property target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessProperties.Property)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(org.apache.ode.bpel.pmapi.TProcessProperties.Property[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$0);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.apache.ode.bpel.pmapi.TProcessProperties.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessProperties.Property target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessProperties.Property)get_store().find_element_user(PROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.apache.ode.bpel.pmapi.TProcessProperties.Property insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessProperties.Property target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessProperties.Property)get_store().insert_element_user(PROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.apache.ode.bpel.pmapi.TProcessProperties.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessProperties.Property target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessProperties.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$0, i);
        }
    }
    /**
     * An XML property(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TProcessProperties.Property
    {
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "name" attribute
         */
        public javax.xml.namespace.QName getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(javax.xml.namespace.QName name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setQNameValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlQName name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
    }
}
