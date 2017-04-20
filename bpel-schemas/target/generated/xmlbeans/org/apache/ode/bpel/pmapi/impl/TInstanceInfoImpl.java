/*
 * XML Type:  tInstanceInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TInstanceInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tInstanceInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TInstanceInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TInstanceInfo
{
    
    public TInstanceInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IID$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "iid");
    private static final javax.xml.namespace.QName PID$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "pid");
    private static final javax.xml.namespace.QName PROCESSNAME$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-name");
    private static final javax.xml.namespace.QName ROOTSCOPE$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "root-scope");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "status");
    private static final javax.xml.namespace.QName DTSTARTED$10 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "dt-started");
    private static final javax.xml.namespace.QName DTLASTACTIVE$12 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "dt-last-active");
    private static final javax.xml.namespace.QName DTERRORSINCE$14 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "dt-error-since");
    private static final javax.xml.namespace.QName CORRELATIONPROPERTIES$16 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "correlation-properties");
    private static final javax.xml.namespace.QName EVENTINFO$18 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "event-info");
    private static final javax.xml.namespace.QName FAULTINFO$20 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "fault-info");
    private static final javax.xml.namespace.QName FAILURES$22 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "failures");
    
    
    /**
     * Gets the "iid" element
     */
    public java.lang.String getIid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iid" element
     */
    public org.apache.xmlbeans.XmlString xgetIid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "iid" element
     */
    public void setIid(java.lang.String iid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IID$0);
            }
            target.setStringValue(iid);
        }
    }
    
    /**
     * Sets (as xml) the "iid" element
     */
    public void xsetIid(org.apache.xmlbeans.XmlString iid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IID$0);
            }
            target.set(iid);
        }
    }
    
    /**
     * Gets the "pid" element
     */
    public java.lang.String getPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pid" element
     */
    public org.apache.xmlbeans.XmlString xgetPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pid" element
     */
    public void setPid(java.lang.String pid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PID$2);
            }
            target.setStringValue(pid);
        }
    }
    
    /**
     * Sets (as xml) the "pid" element
     */
    public void xsetPid(org.apache.xmlbeans.XmlString pid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PID$2);
            }
            target.set(pid);
        }
    }
    
    /**
     * Gets the "process-name" element
     */
    public javax.xml.namespace.QName getProcessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "process-name" element
     */
    public org.apache.xmlbeans.XmlQName xgetProcessName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "process-name" element
     */
    public void setProcessName(javax.xml.namespace.QName processName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSNAME$4);
            }
            target.setQNameValue(processName);
        }
    }
    
    /**
     * Sets (as xml) the "process-name" element
     */
    public void xsetProcessName(org.apache.xmlbeans.XmlQName processName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(PROCESSNAME$4);
            }
            target.set(processName);
        }
    }
    
    /**
     * Gets the "root-scope" element
     */
    public org.apache.ode.bpel.pmapi.TScopeRef getRootScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(ROOTSCOPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "root-scope" element
     */
    public boolean isSetRootScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOTSCOPE$6) != 0;
        }
    }
    
    /**
     * Sets the "root-scope" element
     */
    public void setRootScope(org.apache.ode.bpel.pmapi.TScopeRef rootScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(ROOTSCOPE$6, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().add_element_user(ROOTSCOPE$6);
            }
            target.set(rootScope);
        }
    }
    
    /**
     * Appends and returns a new empty "root-scope" element
     */
    public org.apache.ode.bpel.pmapi.TScopeRef addNewRootScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().add_element_user(ROOTSCOPE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "root-scope" element
     */
    public void unsetRootScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOTSCOPE$6, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.ode.bpel.pmapi.TInstanceStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceStatus)get_store().find_element_user(STATUS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.apache.ode.bpel.pmapi.TInstanceStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$8);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.ode.bpel.pmapi.TInstanceStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceStatus)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TInstanceStatus)get_store().add_element_user(STATUS$8);
            }
            target.set(status);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTSTARTED$10, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTSTARTED$10, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTSTARTED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTSTARTED$10);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTSTARTED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTSTARTED$10);
            }
            target.set(dtStarted);
        }
    }
    
    /**
     * Gets the "dt-last-active" element
     */
    public java.util.Calendar getDtLastActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTLASTACTIVE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt-last-active" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtLastActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTLASTACTIVE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dt-last-active" element
     */
    public void setDtLastActive(java.util.Calendar dtLastActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTLASTACTIVE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTLASTACTIVE$12);
            }
            target.setCalendarValue(dtLastActive);
        }
    }
    
    /**
     * Sets (as xml) the "dt-last-active" element
     */
    public void xsetDtLastActive(org.apache.xmlbeans.XmlDateTime dtLastActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTLASTACTIVE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTLASTACTIVE$12);
            }
            target.set(dtLastActive);
        }
    }
    
    /**
     * Gets the "dt-error-since" element
     */
    public java.util.Calendar getDtErrorSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTERRORSINCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dt-error-since" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDtErrorSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTERRORSINCE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "dt-error-since" element
     */
    public boolean isSetDtErrorSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DTERRORSINCE$14) != 0;
        }
    }
    
    /**
     * Sets the "dt-error-since" element
     */
    public void setDtErrorSince(java.util.Calendar dtErrorSince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DTERRORSINCE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DTERRORSINCE$14);
            }
            target.setCalendarValue(dtErrorSince);
        }
    }
    
    /**
     * Sets (as xml) the "dt-error-since" element
     */
    public void xsetDtErrorSince(org.apache.xmlbeans.XmlDateTime dtErrorSince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DTERRORSINCE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DTERRORSINCE$14);
            }
            target.set(dtErrorSince);
        }
    }
    
    /**
     * Unsets the "dt-error-since" element
     */
    public void unsetDtErrorSince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DTERRORSINCE$14, 0);
        }
    }
    
    /**
     * Gets the "correlation-properties" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties getCorrelationProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties)get_store().find_element_user(CORRELATIONPROPERTIES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "correlation-properties" element
     */
    public boolean isSetCorrelationProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONPROPERTIES$16) != 0;
        }
    }
    
    /**
     * Sets the "correlation-properties" element
     */
    public void setCorrelationProperties(org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties correlationProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties)get_store().find_element_user(CORRELATIONPROPERTIES$16, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties)get_store().add_element_user(CORRELATIONPROPERTIES$16);
            }
            target.set(correlationProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "correlation-properties" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties addNewCorrelationProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties)get_store().add_element_user(CORRELATIONPROPERTIES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "correlation-properties" element
     */
    public void unsetCorrelationProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONPROPERTIES$16, 0);
        }
    }
    
    /**
     * Gets the "event-info" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo getEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo)get_store().find_element_user(EVENTINFO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "event-info" element
     */
    public boolean isSetEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTINFO$18) != 0;
        }
    }
    
    /**
     * Sets the "event-info" element
     */
    public void setEventInfo(org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo eventInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo)get_store().find_element_user(EVENTINFO$18, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo)get_store().add_element_user(EVENTINFO$18);
            }
            target.set(eventInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "event-info" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo addNewEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo)get_store().add_element_user(EVENTINFO$18);
            return target;
        }
    }
    
    /**
     * Unsets the "event-info" element
     */
    public void unsetEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTINFO$18, 0);
        }
    }
    
    /**
     * Gets the "fault-info" element
     */
    public org.apache.ode.bpel.pmapi.TFaultInfo getFaultInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFaultInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFaultInfo)get_store().find_element_user(FAULTINFO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fault-info" element
     */
    public boolean isSetFaultInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULTINFO$20) != 0;
        }
    }
    
    /**
     * Sets the "fault-info" element
     */
    public void setFaultInfo(org.apache.ode.bpel.pmapi.TFaultInfo faultInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFaultInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFaultInfo)get_store().find_element_user(FAULTINFO$20, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TFaultInfo)get_store().add_element_user(FAULTINFO$20);
            }
            target.set(faultInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "fault-info" element
     */
    public org.apache.ode.bpel.pmapi.TFaultInfo addNewFaultInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFaultInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFaultInfo)get_store().add_element_user(FAULTINFO$20);
            return target;
        }
    }
    
    /**
     * Unsets the "fault-info" element
     */
    public void unsetFaultInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULTINFO$20, 0);
        }
    }
    
    /**
     * Gets the "failures" element
     */
    public org.apache.ode.bpel.pmapi.TFailuresInfo getFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailuresInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().find_element_user(FAILURES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "failures" element
     */
    public boolean isSetFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILURES$22) != 0;
        }
    }
    
    /**
     * Sets the "failures" element
     */
    public void setFailures(org.apache.ode.bpel.pmapi.TFailuresInfo failures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailuresInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().find_element_user(FAILURES$22, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().add_element_user(FAILURES$22);
            }
            target.set(failures);
        }
    }
    
    /**
     * Appends and returns a new empty "failures" element
     */
    public org.apache.ode.bpel.pmapi.TFailuresInfo addNewFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFailuresInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TFailuresInfo)get_store().add_element_user(FAILURES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "failures" element
     */
    public void unsetFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILURES$22, 0);
        }
    }
    /**
     * An XML correlation-properties(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class CorrelationPropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TInstanceInfo.CorrelationProperties
    {
        
        public CorrelationPropertiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CORRELATIONPROPERTY$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "correlation-property");
        
        
        /**
         * Gets a List of "correlation-property" elements
         */
        public java.util.List<org.apache.ode.bpel.pmapi.TCorrelationProperty> getCorrelationPropertyList()
        {
            final class CorrelationPropertyList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TCorrelationProperty>
            {
                public org.apache.ode.bpel.pmapi.TCorrelationProperty get(int i)
                    { return CorrelationPropertiesImpl.this.getCorrelationPropertyArray(i); }
                
                public org.apache.ode.bpel.pmapi.TCorrelationProperty set(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty o)
                {
                    org.apache.ode.bpel.pmapi.TCorrelationProperty old = CorrelationPropertiesImpl.this.getCorrelationPropertyArray(i);
                    CorrelationPropertiesImpl.this.setCorrelationPropertyArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty o)
                    { CorrelationPropertiesImpl.this.insertNewCorrelationProperty(i).set(o); }
                
                public org.apache.ode.bpel.pmapi.TCorrelationProperty remove(int i)
                {
                    org.apache.ode.bpel.pmapi.TCorrelationProperty old = CorrelationPropertiesImpl.this.getCorrelationPropertyArray(i);
                    CorrelationPropertiesImpl.this.removeCorrelationProperty(i);
                    return old;
                }
                
                public int size()
                    { return CorrelationPropertiesImpl.this.sizeOfCorrelationPropertyArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CorrelationPropertyList();
            }
        }
        
        /**
         * Gets array of all "correlation-property" elements
         */
        public org.apache.ode.bpel.pmapi.TCorrelationProperty[] getCorrelationPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CORRELATIONPROPERTY$0, targetList);
                org.apache.ode.bpel.pmapi.TCorrelationProperty[] result = new org.apache.ode.bpel.pmapi.TCorrelationProperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "correlation-property" element
         */
        public org.apache.ode.bpel.pmapi.TCorrelationProperty getCorrelationPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().find_element_user(CORRELATIONPROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "correlation-property" element
         */
        public int sizeOfCorrelationPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CORRELATIONPROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "correlation-property" element
         */
        public void setCorrelationPropertyArray(org.apache.ode.bpel.pmapi.TCorrelationProperty[] correlationPropertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(correlationPropertyArray, CORRELATIONPROPERTY$0);
            }
        }
        
        /**
         * Sets ith "correlation-property" element
         */
        public void setCorrelationPropertyArray(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty correlationProperty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().find_element_user(CORRELATIONPROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(correlationProperty);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "correlation-property" element
         */
        public org.apache.ode.bpel.pmapi.TCorrelationProperty insertNewCorrelationProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().insert_element_user(CORRELATIONPROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "correlation-property" element
         */
        public org.apache.ode.bpel.pmapi.TCorrelationProperty addNewCorrelationProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().add_element_user(CORRELATIONPROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "correlation-property" element
         */
        public void removeCorrelationProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CORRELATIONPROPERTY$0, i);
            }
        }
    }
    /**
     * An XML event-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class EventInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TInstanceInfo.EventInfo
    {
        
        public EventInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNT$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "count");
        private static final javax.xml.namespace.QName FIRSTDTIME$2 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "first-dtime");
        private static final javax.xml.namespace.QName LASTDTIME$4 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "last-dtime");
        
        
        /**
         * Gets the "count" element
         */
        public int getCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "count" element
         */
        public org.apache.xmlbeans.XmlInt xgetCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "count" element
         */
        public void setCount(int count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$0);
                }
                target.setIntValue(count);
            }
        }
        
        /**
         * Sets (as xml) the "count" element
         */
        public void xsetCount(org.apache.xmlbeans.XmlInt count)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COUNT$0);
                }
                target.set(count);
            }
        }
        
        /**
         * Gets the "first-dtime" element
         */
        public java.util.Calendar getFirstDtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTDTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "first-dtime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetFirstDtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FIRSTDTIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "first-dtime" element
         */
        public void setFirstDtime(java.util.Calendar firstDtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTDTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTDTIME$2);
                }
                target.setCalendarValue(firstDtime);
            }
        }
        
        /**
         * Sets (as xml) the "first-dtime" element
         */
        public void xsetFirstDtime(org.apache.xmlbeans.XmlDateTime firstDtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FIRSTDTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FIRSTDTIME$2);
                }
                target.set(firstDtime);
            }
        }
        
        /**
         * Gets the "last-dtime" element
         */
        public java.util.Calendar getLastDtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTDTIME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "last-dtime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetLastDtime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTDTIME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "last-dtime" element
         */
        public void setLastDtime(java.util.Calendar lastDtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTDTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTDTIME$4);
                }
                target.setCalendarValue(lastDtime);
            }
        }
        
        /**
         * Sets (as xml) the "last-dtime" element
         */
        public void xsetLastDtime(org.apache.xmlbeans.XmlDateTime lastDtime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTDTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTDTIME$4);
                }
                target.set(lastDtime);
            }
        }
    }
}
