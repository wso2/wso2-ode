/*
 * An XML document type.
 * Localname: process-info
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ProcessInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one process-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class ProcessInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ProcessInfoDocument
{
    
    public ProcessInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-info");
    
    
    /**
     * Gets the "process-info" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo getProcessInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().find_element_user(PROCESSINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "process-info" element
     */
    public void setProcessInfo(org.apache.ode.bpel.pmapi.TProcessInfo processInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().find_element_user(PROCESSINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().add_element_user(PROCESSINFO$0);
            }
            target.set(processInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "process-info" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo addNewProcessInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo)get_store().add_element_user(PROCESSINFO$0);
            return target;
        }
    }
}
