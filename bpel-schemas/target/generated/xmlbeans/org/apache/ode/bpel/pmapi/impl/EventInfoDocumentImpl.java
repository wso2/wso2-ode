/*
 * An XML document type.
 * Localname: event-info
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.EventInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one event-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class EventInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.EventInfoDocument
{
    
    public EventInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "event-info");
    
    
    /**
     * Gets the "event-info" element
     */
    public org.apache.ode.bpel.pmapi.TEventInfo getEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().find_element_user(EVENTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "event-info" element
     */
    public void setEventInfo(org.apache.ode.bpel.pmapi.TEventInfo eventInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().find_element_user(EVENTINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().add_element_user(EVENTINFO$0);
            }
            target.set(eventInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "event-info" element
     */
    public org.apache.ode.bpel.pmapi.TEventInfo addNewEventInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfo)get_store().add_element_user(EVENTINFO$0);
            return target;
        }
    }
}
