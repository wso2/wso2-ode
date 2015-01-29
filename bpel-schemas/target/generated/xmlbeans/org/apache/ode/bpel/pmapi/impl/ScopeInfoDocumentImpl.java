/*
 * An XML document type.
 * Localname: scope-info
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ScopeInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one scope-info(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class ScopeInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ScopeInfoDocument
{
    
    public ScopeInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPEINFO$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "scope-info");
    
    
    /**
     * Gets the "scope-info" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo getScopeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo)get_store().find_element_user(SCOPEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scope-info" element
     */
    public void setScopeInfo(org.apache.ode.bpel.pmapi.TScopeInfo scopeInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo)get_store().find_element_user(SCOPEINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeInfo)get_store().add_element_user(SCOPEINFO$0);
            }
            target.set(scopeInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "scope-info" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo addNewScopeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo)get_store().add_element_user(SCOPEINFO$0);
            return target;
        }
    }
}
