/*
 * XML Type:  tCorrelationProperty
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TCorrelationProperty
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tCorrelationProperty(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is an atomic type that is a restriction of org.apache.ode.bpel.pmapi.TCorrelationProperty.
 */
public class TCorrelationPropertyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.apache.ode.bpel.pmapi.TCorrelationProperty
{
    
    public TCorrelationPropertyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TCorrelationPropertyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CSETID$0 = 
        new javax.xml.namespace.QName("", "csetid");
    private static final javax.xml.namespace.QName PROPERTYNAME$2 = 
        new javax.xml.namespace.QName("", "propertyName");
    
    
    /**
     * Gets the "csetid" attribute
     */
    public java.lang.String getCsetid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSETID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "csetid" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCsetid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSETID$0);
            return target;
        }
    }
    
    /**
     * Sets the "csetid" attribute
     */
    public void setCsetid(java.lang.String csetid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSETID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CSETID$0);
            }
            target.setStringValue(csetid);
        }
    }
    
    /**
     * Sets (as xml) the "csetid" attribute
     */
    public void xsetCsetid(org.apache.xmlbeans.XmlString csetid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSETID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CSETID$0);
            }
            target.set(csetid);
        }
    }
    
    /**
     * Gets the "propertyName" attribute
     */
    public javax.xml.namespace.QName getPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "propertyName" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTYNAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "propertyName" attribute
     */
    public void setPropertyName(javax.xml.namespace.QName propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTYNAME$2);
            }
            target.setQNameValue(propertyName);
        }
    }
    
    /**
     * Sets (as xml) the "propertyName" attribute
     */
    public void xsetPropertyName(org.apache.xmlbeans.XmlQName propertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROPERTYNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROPERTYNAME$2);
            }
            target.set(propertyName);
        }
    }
}
