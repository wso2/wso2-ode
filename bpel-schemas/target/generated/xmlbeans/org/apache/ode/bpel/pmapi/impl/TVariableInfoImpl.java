/*
 * XML Type:  tVariableInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TVariableInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tVariableInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TVariableInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TVariableInfo
{
    
    public TVariableInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELF$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "self");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "value");
    
    
    /**
     * Gets the "self" element
     */
    public org.apache.ode.bpel.pmapi.TVariableRef getSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableRef target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().find_element_user(SELF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "self" element
     */
    public void setSelf(org.apache.ode.bpel.pmapi.TVariableRef self)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableRef target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().find_element_user(SELF$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().add_element_user(SELF$0);
            }
            target.set(self);
        }
    }
    
    /**
     * Appends and returns a new empty "self" element
     */
    public org.apache.ode.bpel.pmapi.TVariableRef addNewSelf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableRef target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().add_element_user(SELF$0);
            return target;
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.apache.ode.bpel.pmapi.TVariableInfo.Value getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableInfo.Value target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableInfo.Value)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.apache.ode.bpel.pmapi.TVariableInfo.Value value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableInfo.Value target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableInfo.Value)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TVariableInfo.Value)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.apache.ode.bpel.pmapi.TVariableInfo.Value addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableInfo.Value target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableInfo.Value)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$2, 0);
        }
    }
    /**
     * An XML value(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class ValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TVariableInfo.Value
    {
        
        public ValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
