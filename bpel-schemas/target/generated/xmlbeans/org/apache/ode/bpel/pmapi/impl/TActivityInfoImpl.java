/*
 * XML Type:  tActivityInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TActivityInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tActivityInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TActivityInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TActivityInfo
{
    
    public TActivityInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "type");
    private static final javax.xml.namespace.QName AIID$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "aiid");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "status");
    private static final javax.xml.namespace.QName SCOPE$8 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "scope");
    private static final javax.xml.namespace.QName DTENABLED$10 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "dt-enabled");
    private static final javax.xml.namespace.QName DTSTARTED$12 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "dt-started");
    private static final javax.xml.namespace.QName DTCOMPLETED$14 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "dt-completed");
    private static final javax.xml.namespace.QName FAILURE$16 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "failure");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "aiid" element
     */
    public java.lang.String getAiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "aiid" element
     */
    public org.apache.xmlbeans.XmlString xgetAiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "aiid" element
     */
    public void setAiid(java.lang.String aiid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIID$4);
            }
            target.setStringValue(aiid);
        }
    }
    
    /**
     * Sets (as xml) the "aiid" element
     */
    public void xsetAiid(org.apache.xmlbeans.XmlString aiid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIID$4);
            }
            target.set(aiid);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.apache.ode.bpel.pmapi.TActivityStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.ode.bpel.pmapi.TActivityStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.ode.bpel.pmapi.TActivityStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityStatus)get_store().find_element_user(STATUS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.apache.ode.bpel.pmapi.TActivityStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.ode.bpel.pmapi.TActivityStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityStatus)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TActivityStatus)get_store().add_element_user(STATUS$6);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public org.apache.ode.bpel.pmapi.TScopeRef getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(SCOPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scope" element
     */
    public boolean isSetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$8) != 0;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    public void setScope(org.apache.ode.bpel.pmapi.TScopeRef scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(SCOPE$8, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().add_element_user(SCOPE$8);
            }
            target.set(scope);
        }
    }
    
    /**
     * Appends and returns a new empty "scope" element
     */
    public org.apache.ode.bpel.pmapi.TScopeRef addNewScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().add_element_user(SCOPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "scope" element
     */
    public void unsetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$8, 0);
        }
    }
    
    /**
     * Gets the "dt-enabled" element
     */
    public java.util.Calendar getDtEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTENABLED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt-enabled" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTENABLED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "dt-enabled" element
     */
    public boolean isSetDtEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTENABLED$10) != 0;
        }
    }
    
    /**
     * Sets the "dt-enabled" element
     */
    public void setDtEnabled(java.util.Calendar dtEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTENABLED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTENABLED$10);
            }
            target.setCalendarValue(dtEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "dt-enabled" element
     */
    public void xsetDtEnabled(org.apache.xmlbeans.XmlDateTime dtEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTENABLED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTENABLED$10);
            }
            target.set(dtEnabled);
        }
    }
    
    /**
     * Unsets the "dt-enabled" element
     */
    public void unsetDtEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTENABLED$10, 0);
        }
    }
    
    /**
     * Gets the "dt-started" element
     */
    public java.util.Calendar getDtStarted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTSTARTED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt-started" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtStarted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTSTARTED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "dt-started" element
     */
    public boolean isSetDtStarted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTSTARTED$12) != 0;
        }
    }
    
    /**
     * Sets the "dt-started" element
     */
    public void setDtStarted(java.util.Calendar dtStarted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTSTARTED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTSTARTED$12);
            }
            target.setCalendarValue(dtStarted);
        }
    }
    
    /**
     * Sets (as xml) the "dt-started" element
     */
    public void xsetDtStarted(org.apache.xmlbeans.XmlDateTime dtStarted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTSTARTED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTSTARTED$12);
            }
            target.set(dtStarted);
        }
    }
    
    /**
     * Unsets the "dt-started" element
     */
    public void unsetDtStarted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTSTARTED$12, 0);
        }
    }
    
    /**
     * Gets the "dt-completed" element
     */
    public java.util.Calendar getDtCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTCOMPLETED$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt-completed" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTCOMPLETED$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "dt-completed" element
     */
    public boolean isSetDtCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTCOMPLETED$14) != 0;
        }
    }
    
    /**
     * Sets the "dt-completed" element
     */
    public void setDtCompleted(java.util.Calendar dtCompleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTCOMPLETED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTCOMPLETED$14);
            }
            target.setCalendarValue(dtCompleted);
        }
    }
    
    /**
     * Sets (as xml) the "dt-completed" element
     */
    public void xsetDtCompleted(org.apache.xmlbeans.XmlDateTime dtCompleted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTCOMPLETED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTCOMPLETED$14);
            }
            target.set(dtCompleted);
        }
    }
    
    /**
     * Unsets the "dt-completed" element
     */
    public void unsetDtCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTCOMPLETED$14, 0);
        }
    }
    
    /**
     * Gets the "failure" element
     */
    public org.apache.ode.bpel.pmapi.TFailureInfo getFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailureInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailureInfo)get_store().find_element_user(FAILURE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "failure" element
     */
    public boolean isSetFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILURE$16) != 0;
        }
    }
    
    /**
     * Sets the "failure" element
     */
    public void setFailure(org.apache.ode.bpel.pmapi.TFailureInfo failure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailureInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailureInfo)get_store().find_element_user(FAILURE$16, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TFailureInfo)get_store().add_element_user(FAILURE$16);
            }
            target.set(failure);
        }
    }
    
    /**
     * Appends and returns a new empty "failure" element
     */
    public org.apache.ode.bpel.pmapi.TFailureInfo addNewFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailureInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailureInfo)get_store().add_element_user(FAILURE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "failure" element
     */
    public void unsetFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILURE$16, 0);
        }
    }
}
