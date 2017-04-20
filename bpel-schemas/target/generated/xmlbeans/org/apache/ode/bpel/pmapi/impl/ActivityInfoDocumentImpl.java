/*
 * An XML document type.
 * Localname: activity-info
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ActivityInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one activity-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class ActivityInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ActivityInfoDocument
{
    
    public ActivityInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-info");
    
    
    /**
     * Gets the "activity-info" element
     */
    public org.apache.ode.bpel.pmapi.TActivityInfo getActivityInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().find_element_user(ACTIVITYINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity-info" element
     */
    public void setActivityInfo(org.apache.ode.bpel.pmapi.TActivityInfo activityInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().find_element_user(ACTIVITYINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().add_element_user(ACTIVITYINFO$0);
            }
            target.set(activityInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "activity-info" element
     */
    public org.apache.ode.bpel.pmapi.TActivityInfo addNewActivityInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().add_element_user(ACTIVITYINFO$0);
            return target;
        }
    }
}
