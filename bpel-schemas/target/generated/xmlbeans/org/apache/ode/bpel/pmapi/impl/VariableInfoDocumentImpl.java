/*
 * An XML document type.
 * Localname: variable-info
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.VariableInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one variable-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class VariableInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.VariableInfoDocument
{
    
    public VariableInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARIABLEINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "variable-info");
    
    
    /**
     * Gets the "variable-info" element
     */
    public org.apache.ode.bpel.pmapi.TVariableInfo getVariableInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableInfo)get_store().find_element_user(VARIABLEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "variable-info" element
     */
    public void setVariableInfo(org.apache.ode.bpel.pmapi.TVariableInfo variableInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableInfo)get_store().find_element_user(VARIABLEINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TVariableInfo)get_store().add_element_user(VARIABLEINFO$0);
            }
            target.set(variableInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "variable-info" element
     */
    public org.apache.ode.bpel.pmapi.TVariableInfo addNewVariableInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TVariableInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TVariableInfo)get_store().add_element_user(VARIABLEINFO$0);
            return target;
        }
    }
}
