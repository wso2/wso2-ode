/*
 * An XML document type.
 * Localname: process-info-list
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ProcessInfoListDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one process-info-list(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class ProcessInfoListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ProcessInfoListDocument
{
    
    public ProcessInfoListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSINFOLIST$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-info-list");
    
    
    /**
     * Gets the "process-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfoList getProcessInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfoList)get_store().find_element_user(PROCESSINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "process-info-list" element
     */
    public void setProcessInfoList(org.apache.ode.bpel.pmapi.TProcessInfoList processInfoList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfoList)get_store().find_element_user(PROCESSINFOLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TProcessInfoList)get_store().add_element_user(PROCESSINFOLIST$0);
            }
            target.set(processInfoList);
        }
    }
    
    /**
     * Appends and returns a new empty "process-info-list" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfoList addNewProcessInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfoList target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfoList)get_store().add_element_user(PROCESSINFOLIST$0);
            return target;
        }
    }
}
