/*
 * XML Type:  ResponseType
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ResponseType
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML ResponseType(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class ResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ResponseType
{
    
    public ResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUT$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "out");
    private static final javax.xml.namespace.QName FAULT$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "fault");
    private static final javax.xml.namespace.QName FAILURE$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "failure");
    
    
    /**
     * Gets the "out" element
     */
    public org.apache.xmlbeans.XmlObject getOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "out" element
     */
    public boolean isSetOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUT$0) != 0;
        }
    }
    
    /**
     * Sets the "out" element
     */
    public void setOut(org.apache.xmlbeans.XmlObject out)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OUT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OUT$0);
            }
            target.set(out);
        }
    }
    
    /**
     * Appends and returns a new empty "out" element
     */
    public org.apache.xmlbeans.XmlObject addNewOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OUT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "out" element
     */
    public void unsetOut()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUT$0, 0);
        }
    }
    
    /**
     * Gets the "fault" element
     */
    public org.apache.ode.bpel.pmapi.FaultType getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.FaultType target = null;
            target = (org.apache.ode.bpel.pmapi.FaultType)get_store().find_element_user(FAULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fault" element
     */
    public boolean isSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULT$2) != 0;
        }
    }
    
    /**
     * Sets the "fault" element
     */
    public void setFault(org.apache.ode.bpel.pmapi.FaultType fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.FaultType target = null;
            target = (org.apache.ode.bpel.pmapi.FaultType)get_store().find_element_user(FAULT$2, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.FaultType)get_store().add_element_user(FAULT$2);
            }
            target.set(fault);
        }
    }
    
    /**
     * Appends and returns a new empty "fault" element
     */
    public org.apache.ode.bpel.pmapi.FaultType addNewFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.FaultType target = null;
            target = (org.apache.ode.bpel.pmapi.FaultType)get_store().add_element_user(FAULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fault" element
     */
    public void unsetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULT$2, 0);
        }
    }
    
    /**
     * Gets the "failure" element
     */
    public org.apache.ode.bpel.pmapi.FailureType getFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.FailureType target = null;
            target = (org.apache.ode.bpel.pmapi.FailureType)get_store().find_element_user(FAILURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "failure" element
     */
    public boolean isSetFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILURE$4) != 0;
        }
    }
    
    /**
     * Sets the "failure" element
     */
    public void setFailure(org.apache.ode.bpel.pmapi.FailureType failure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.FailureType target = null;
            target = (org.apache.ode.bpel.pmapi.FailureType)get_store().find_element_user(FAILURE$4, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.FailureType)get_store().add_element_user(FAILURE$4);
            }
            target.set(failure);
        }
    }
    
    /**
     * Appends and returns a new empty "failure" element
     */
    public org.apache.ode.bpel.pmapi.FailureType addNewFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.FailureType target = null;
            target = (org.apache.ode.bpel.pmapi.FailureType)get_store().add_element_user(FAILURE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "failure" element
     */
    public void unsetFailure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILURE$4, 0);
        }
    }
}
