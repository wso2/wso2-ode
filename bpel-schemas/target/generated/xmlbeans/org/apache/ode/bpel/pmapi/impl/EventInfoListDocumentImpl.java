/*
 * An XML document type.
 * Localname: event-info-list
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.EventInfoListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one event-info-list(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class EventInfoListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.EventInfoListDocument
{
    
    public EventInfoListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTINFOLIST$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "event-info-list");
    
    
    /**
     * Gets the "event-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TEventInfoList getEventInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfoList)get_store().find_element_user(EVENTINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "event-info-list" element
     */
    public void setEventInfoList(org.apache.ode.bpel.pmapi.TEventInfoList eventInfoList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfoList)get_store().find_element_user(EVENTINFOLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TEventInfoList)get_store().add_element_user(EVENTINFOLIST$0);
            }
            target.set(eventInfoList);
        }
    }
    
    /**
     * Appends and returns a new empty "event-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TEventInfoList addNewEventInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEventInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TEventInfoList)get_store().add_element_user(EVENTINFOLIST$0);
            return target;
        }
    }
}
