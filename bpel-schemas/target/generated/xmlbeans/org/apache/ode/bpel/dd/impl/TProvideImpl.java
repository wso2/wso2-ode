/*
 * XML Type:  tProvide
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TProvide
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tProvide(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TProvideImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TProvide
{
    
    public TProvideImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "service");
    private static final javax.xml.namespace.QName ENABLESHARING$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "enableSharing");
    private static final javax.xml.namespace.QName PARTNERLINK$4 = 
        new javax.xml.namespace.QName("", "partnerLink");
    private static final javax.xml.namespace.QName CORRELATIONFILTER$6 = 
        new javax.xml.namespace.QName("", "correlationFilter");
    
    
    /**
     * Gets the "service" element
     */
    public org.apache.ode.bpel.dd.TService getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TService target = null;
            target = (org.apache.ode.bpel.dd.TService)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service" element
     */
    public void setService(org.apache.ode.bpel.dd.TService service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TService target = null;
            target = (org.apache.ode.bpel.dd.TService)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.dd.TService)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "service" element
     */
    public org.apache.ode.bpel.dd.TService addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TService target = null;
            target = (org.apache.ode.bpel.dd.TService)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
    
    /**
     * Gets the "enableSharing" element
     */
    public org.apache.ode.bpel.dd.TEnableSharing getEnableSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TEnableSharing target = null;
            target = (org.apache.ode.bpel.dd.TEnableSharing)get_store().find_element_user(ENABLESHARING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "enableSharing" element
     */
    public boolean isSetEnableSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLESHARING$2) != 0;
        }
    }
    
    /**
     * Sets the "enableSharing" element
     */
    public void setEnableSharing(org.apache.ode.bpel.dd.TEnableSharing enableSharing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TEnableSharing target = null;
            target = (org.apache.ode.bpel.dd.TEnableSharing)get_store().find_element_user(ENABLESHARING$2, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.dd.TEnableSharing)get_store().add_element_user(ENABLESHARING$2);
            }
            target.set(enableSharing);
        }
    }
    
    /**
     * Appends and returns a new empty "enableSharing" element
     */
    public org.apache.ode.bpel.dd.TEnableSharing addNewEnableSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TEnableSharing target = null;
            target = (org.apache.ode.bpel.dd.TEnableSharing)get_store().add_element_user(ENABLESHARING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "enableSharing" element
     */
    public void unsetEnableSharing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLESHARING$2, 0);
        }
    }
    
    /**
     * Gets the "partnerLink" attribute
     */
    public java.lang.String getPartnerLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERLINK$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "partnerLink" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPartnerLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERLINK$4);
            return target;
        }
    }
    
    /**
     * Sets the "partnerLink" attribute
     */
    public void setPartnerLink(java.lang.String partnerLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERLINK$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTNERLINK$4);
            }
            target.setStringValue(partnerLink);
        }
    }
    
    /**
     * Sets (as xml) the "partnerLink" attribute
     */
    public void xsetPartnerLink(org.apache.xmlbeans.XmlString partnerLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERLINK$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARTNERLINK$4);
            }
            target.set(partnerLink);
        }
    }
    
    /**
     * Gets the "correlationFilter" attribute
     */
    public javax.xml.namespace.QName getCorrelationFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONFILTER$6);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlationFilter" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCorrelationFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONFILTER$6);
            return target;
        }
    }
    
    /**
     * True if has "correlationFilter" attribute
     */
    public boolean isSetCorrelationFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CORRELATIONFILTER$6) != null;
        }
    }
    
    /**
     * Sets the "correlationFilter" attribute
     */
    public void setCorrelationFilter(javax.xml.namespace.QName correlationFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONFILTER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CORRELATIONFILTER$6);
            }
            target.setQNameValue(correlationFilter);
        }
    }
    
    /**
     * Sets (as xml) the "correlationFilter" attribute
     */
    public void xsetCorrelationFilter(org.apache.xmlbeans.XmlQName correlationFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONFILTER$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CORRELATIONFILTER$6);
            }
            target.set(correlationFilter);
        }
    }
    
    /**
     * Unsets the "correlationFilter" attribute
     */
    public void unsetCorrelationFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CORRELATIONFILTER$6);
        }
    }
}
