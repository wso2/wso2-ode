/*
 * An XML document type.
 * Localname: activity-ext-info-list
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ActivityExtInfoListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one activity-ext-info-list(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class ActivityExtInfoListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ActivityExtInfoListDocument
{
    
    public ActivityExtInfoListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYEXTINFOLIST$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-ext-info-list");
    
    
    /**
     * Gets the "activity-ext-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TActivitytExtInfoList getActivityExtInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivitytExtInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TActivitytExtInfoList)get_store().find_element_user(ACTIVITYEXTINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "activity-ext-info-list" element
     */
    public void setActivityExtInfoList(org.apache.ode.bpel.pmapi.TActivitytExtInfoList activityExtInfoList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivitytExtInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TActivitytExtInfoList)get_store().find_element_user(ACTIVITYEXTINFOLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TActivitytExtInfoList)get_store().add_element_user(ACTIVITYEXTINFOLIST$0);
            }
            target.set(activityExtInfoList);
        }
    }
    
    /**
     * Appends and returns a new empty "activity-ext-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TActivitytExtInfoList addNewActivityExtInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TActivitytExtInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TActivitytExtInfoList)get_store().add_element_user(ACTIVITYEXTINFOLIST$0);
            return target;
        }
    }
}
