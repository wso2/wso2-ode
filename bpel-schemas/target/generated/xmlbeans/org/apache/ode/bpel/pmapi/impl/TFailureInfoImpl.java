/*
 * XML Type:  tFailureInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TFailureInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tFailureInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TFailureInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TFailureInfo
{
    
    public TFailureInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DTFAILURE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "dt-failure");
    private static final javax.xml.namespace.QName RETRIES$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "retries");
    private static final javax.xml.namespace.QName REASON$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "reason");
    private static final javax.xml.namespace.QName ACTIONS$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "actions");
    
    
    /**
     * Gets the "dt-failure" element
     */
    public java.util.Calendar getDtFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTFAILURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt-failure" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTFAILURE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dt-failure" element
     */
    public void setDtFailure(java.util.Calendar dtFailure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTFAILURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTFAILURE$0);
            }
            target.setCalendarValue(dtFailure);
        }
    }
    
    /**
     * Sets (as xml) the "dt-failure" element
     */
    public void xsetDtFailure(org.apache.xmlbeans.XmlDateTime dtFailure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTFAILURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTFAILURE$0);
            }
            target.set(dtFailure);
        }
    }
    
    /**
     * Gets the "retries" element
     */
    public int getRetries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRIES$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "retries" element
     */
    public org.apache.xmlbeans.XmlInt xgetRetries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRIES$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "retries" element
     */
    public void setRetries(int retries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRIES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRIES$2);
            }
            target.setIntValue(retries);
        }
    }
    
    /**
     * Sets (as xml) the "retries" element
     */
    public void xsetRetries(org.apache.xmlbeans.XmlInt retries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRIES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RETRIES$2);
            }
            target.set(retries);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public java.lang.String getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reason" element
     */
    public org.apache.xmlbeans.XmlString xgetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(java.lang.String reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$4);
            }
            target.setStringValue(reason);
        }
    }
    
    /**
     * Sets (as xml) the "reason" element
     */
    public void xsetReason(org.apache.xmlbeans.XmlString reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$4);
            }
            target.set(reason);
        }
    }
    
    /**
     * Gets the "actions" element
     */
    public java.lang.String getActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actions" element
     */
    public org.apache.xmlbeans.XmlString xgetActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIONS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "actions" element
     */
    public void setActions(java.lang.String actions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIONS$6);
            }
            target.setStringValue(actions);
        }
    }
    
    /**
     * Sets (as xml) the "actions" element
     */
    public void xsetActions(org.apache.xmlbeans.XmlString actions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIONS$6);
            }
            target.set(actions);
        }
    }
}
