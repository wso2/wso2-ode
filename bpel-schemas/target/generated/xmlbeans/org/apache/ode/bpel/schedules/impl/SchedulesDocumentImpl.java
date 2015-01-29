/*
 * An XML document type.
 * Localname: schedules
 * Namespace: http://www.apache.org/ode/schemas/schedules/2009/05
 * Java type: org.apache.ode.bpel.schedules.SchedulesDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.schedules.impl;
/**
 * A document containing one schedules(@http://www.apache.org/ode/schemas/schedules/2009/05) element.
 *
 * This is a complex type.
 */
public class SchedulesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.schedules.SchedulesDocument
{
    
    public SchedulesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEDULES$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/schedules/2009/05", "schedules");
    
    
    /**
     * Gets the "schedules" element
     */
    public org.apache.ode.bpel.schedules.TSchedules getSchedules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.schedules.TSchedules target = null;
            target = (org.apache.ode.bpel.schedules.TSchedules)get_store().find_element_user(SCHEDULES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "schedules" element
     */
    public void setSchedules(org.apache.ode.bpel.schedules.TSchedules schedules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.schedules.TSchedules target = null;
            target = (org.apache.ode.bpel.schedules.TSchedules)get_store().find_element_user(SCHEDULES$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.schedules.TSchedules)get_store().add_element_user(SCHEDULES$0);
            }
            target.set(schedules);
        }
    }
    
    /**
     * Appends and returns a new empty "schedules" element
     */
    public org.apache.ode.bpel.schedules.TSchedules addNewSchedules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.schedules.TSchedules target = null;
            target = (org.apache.ode.bpel.schedules.TSchedules)get_store().add_element_user(SCHEDULES$0);
            return target;
        }
    }
}
