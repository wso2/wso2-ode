/*
 * An XML document type.
 * Localname: instance-info
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.InstanceInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one instance-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class InstanceInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.InstanceInfoDocument
{
    
    public InstanceInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANCEINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instance-info");
    
    
    /**
     * Gets the "instance-info" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo getInstanceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().find_element_user(INSTANCEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "instance-info" element
     */
    public void setInstanceInfo(org.apache.ode.bpel.pmapi.TInstanceInfo instanceInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().find_element_user(INSTANCEINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().add_element_user(INSTANCEINFO$0);
            }
            target.set(instanceInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "instance-info" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceInfo addNewInstanceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceInfo)get_store().add_element_user(INSTANCEINFO$0);
            return target;
        }
    }
}
