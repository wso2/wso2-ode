/*
 * XML Type:  tScopeRef
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TScopeRef
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tScopeRef(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TScopeRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TScopeRef
{
    
    public TScopeRefImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIID$0 = 
        new javax.xml.namespace.QName("", "siid");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName MODELID$4 = 
        new javax.xml.namespace.QName("", "modelId");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets the "siid" attribute
     */
    public java.lang.String getSiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "siid" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIID$0);
            return target;
        }
    }
    
    /**
     * Sets the "siid" attribute
     */
    public void setSiid(java.lang.String siid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIID$0);
            }
            target.setStringValue(siid);
        }
    }
    
    /**
     * Sets (as xml) the "siid" attribute
     */
    public void xsetSiid(org.apache.xmlbeans.XmlString siid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIID$0);
            }
            target.set(siid);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
            return get_store().find_attribute_user(NAME$2) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "modelId" attribute
     */
    public java.lang.String getModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "modelId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetModelId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$4);
            return target;
        }
    }
    
    /**
     * Sets the "modelId" attribute
     */
    public void setModelId(java.lang.String modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODELID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODELID$4);
            }
            target.setStringValue(modelId);
        }
    }
    
    /**
     * Sets (as xml) the "modelId" attribute
     */
    public void xsetModelId(org.apache.xmlbeans.XmlString modelId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MODELID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MODELID$4);
            }
            target.set(modelId);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public org.apache.ode.bpel.pmapi.TScopeStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
            if (target == null)
            {
                return null;
            }
            return (org.apache.ode.bpel.pmapi.TScopeStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public org.apache.ode.bpel.pmapi.TScopeStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeStatus)get_store().find_attribute_user(STATUS$6);
            return target;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(org.apache.ode.bpel.pmapi.TScopeStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$6);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(org.apache.ode.bpel.pmapi.TScopeStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeStatus)get_store().find_attribute_user(STATUS$6);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeStatus)get_store().add_attribute_user(STATUS$6);
            }
            target.set(status);
        }
    }
}
