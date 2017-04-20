/*
 * An XML document type.
 * Localname: mockQueryResponse
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.MockQueryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one mockQueryResponse(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class MockQueryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.MockQueryResponseDocument
{
    
    public MockQueryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOCKQUERYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "mockQueryResponse");
    
    
    /**
     * Gets the "mockQueryResponse" element
     */
    public org.apache.ode.bpel.pmapi.ResponseType getMockQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.ResponseType target = null;
            target = (org.apache.ode.bpel.pmapi.ResponseType)get_store().find_element_user(MOCKQUERYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mockQueryResponse" element
     */
    public void setMockQueryResponse(org.apache.ode.bpel.pmapi.ResponseType mockQueryResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.ResponseType target = null;
            target = (org.apache.ode.bpel.pmapi.ResponseType)get_store().find_element_user(MOCKQUERYRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.ResponseType)get_store().add_element_user(MOCKQUERYRESPONSE$0);
            }
            target.set(mockQueryResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "mockQueryResponse" element
     */
    public org.apache.ode.bpel.pmapi.ResponseType addNewMockQueryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.ResponseType target = null;
            target = (org.apache.ode.bpel.pmapi.ResponseType)get_store().add_element_user(MOCKQUERYRESPONSE$0);
            return target;
        }
    }
}
