/*
 * An XML document type.
 * Localname: activity-ext-info
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ActivityExtInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one activity-ext-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class ActivityExtInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ActivityExtInfoDocument
{
    
    public ActivityExtInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYEXTINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-ext-info");
    
    
    /**
     * Gets the "activity-ext-info" element
     */
    public org.apache.ode.bpel.pmapi.TActivityExtInfo getActivityExtInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityExtInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().find_element_user(ACTIVITYEXTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity-ext-info" element
     */
    public void setActivityExtInfo(org.apache.ode.bpel.pmapi.TActivityExtInfo activityExtInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityExtInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().find_element_user(ACTIVITYEXTINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().add_element_user(ACTIVITYEXTINFO$0);
            }
            target.set(activityExtInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "activity-ext-info" element
     */
    public org.apache.ode.bpel.pmapi.TActivityExtInfo addNewActivityExtInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivityExtInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TActivityExtInfo)get_store().add_element_user(ACTIVITYEXTINFO$0);
            return target;
        }
    }
}
