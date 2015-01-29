/*
 * XML Type:  tInvoke
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TInvoke
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tInvoke(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TInvokeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TInvoke
{
    
    public TInvokeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "service");
    private static final javax.xml.namespace.QName BINDING$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "binding");
    private static final javax.xml.namespace.QName FAILUREHANDLING$4 = 
        new javax.xml.namespace.QName("http://ode.apache.org/activityRecovery", "failureHandling");
    private static final javax.xml.namespace.QName PARTNERLINK$6 = 
        new javax.xml.namespace.QName("", "partnerLink");
    private static final javax.xml.namespace.QName USEPEER2PEER$8 = 
        new javax.xml.namespace.QName("", "usePeer2Peer");
    
    
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
     * Gets the "binding" element
     */
    public org.apache.ode.bpel.dd.TInvoke.Binding getBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TInvoke.Binding target = null;
            target = (org.apache.ode.bpel.dd.TInvoke.Binding)get_store().find_element_user(BINDING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "binding" element
     */
    public boolean isSetBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINDING$2) != 0;
        }
    }
    
    /**
     * Sets the "binding" element
     */
    public void setBinding(org.apache.ode.bpel.dd.TInvoke.Binding binding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TInvoke.Binding target = null;
            target = (org.apache.ode.bpel.dd.TInvoke.Binding)get_store().find_element_user(BINDING$2, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.dd.TInvoke.Binding)get_store().add_element_user(BINDING$2);
            }
            target.set(binding);
        }
    }
    
    /**
     * Appends and returns a new empty "binding" element
     */
    public org.apache.ode.bpel.dd.TInvoke.Binding addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TInvoke.Binding target = null;
            target = (org.apache.ode.bpel.dd.TInvoke.Binding)get_store().add_element_user(BINDING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "binding" element
     */
    public void unsetBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINDING$2, 0);
        }
    }
    
    /**
     * Gets the "failureHandling" element
     */
    public org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling getFailureHandling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling target = null;
            target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().find_element_user(FAILUREHANDLING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "failureHandling" element
     */
    public boolean isSetFailureHandling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILUREHANDLING$4) != 0;
        }
    }
    
    /**
     * Sets the "failureHandling" element
     */
    public void setFailureHandling(org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling failureHandling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling target = null;
            target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().find_element_user(FAILUREHANDLING$4, 0);
            if (target == null)
            {
                target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().add_element_user(FAILUREHANDLING$4);
            }
            target.set(failureHandling);
        }
    }
    
    /**
     * Appends and returns a new empty "failureHandling" element
     */
    public org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling addNewFailureHandling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling target = null;
            target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().add_element_user(FAILUREHANDLING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "failureHandling" element
     */
    public void unsetFailureHandling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILUREHANDLING$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERLINK$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERLINK$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERLINK$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTNERLINK$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERLINK$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARTNERLINK$6);
            }
            target.set(partnerLink);
        }
    }
    
    /**
     * Gets the "usePeer2Peer" attribute
     */
    public boolean getUsePeer2Peer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEPEER2PEER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEPEER2PEER$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "usePeer2Peer" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUsePeer2Peer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEPEER2PEER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(USEPEER2PEER$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "usePeer2Peer" attribute
     */
    public boolean isSetUsePeer2Peer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEPEER2PEER$8) != null;
        }
    }
    
    /**
     * Sets the "usePeer2Peer" attribute
     */
    public void setUsePeer2Peer(boolean usePeer2Peer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEPEER2PEER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEPEER2PEER$8);
            }
            target.setBooleanValue(usePeer2Peer);
        }
    }
    
    /**
     * Sets (as xml) the "usePeer2Peer" attribute
     */
    public void xsetUsePeer2Peer(org.apache.xmlbeans.XmlBoolean usePeer2Peer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEPEER2PEER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEPEER2PEER$8);
            }
            target.set(usePeer2Peer);
        }
    }
    
    /**
     * Unsets the "usePeer2Peer" attribute
     */
    public void unsetUsePeer2Peer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEPEER2PEER$8);
        }
    }
    /**
     * An XML binding(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is a complex type.
     */
    public static class BindingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TInvoke.Binding
    {
        
        public BindingImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
