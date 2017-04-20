/*
 * An XML document type.
 * Localname: getCommunicationResponse
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.GetCommunicationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one getCommunicationResponse(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class GetCommunicationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.GetCommunicationResponseDocument
{
    
    public GetCommunicationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMUNICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "getCommunicationResponse");
    
    
    /**
     * Gets the "getCommunicationResponse" element
     */
    public org.apache.ode.bpel.pmapi.GetCommunicationResponse getGetCommunicationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.GetCommunicationResponse target = null;
            target = (org.apache.ode.bpel.pmapi.GetCommunicationResponse)get_store().find_element_user(GETCOMMUNICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCommunicationResponse" element
     */
    public void setGetCommunicationResponse(org.apache.ode.bpel.pmapi.GetCommunicationResponse getCommunicationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.GetCommunicationResponse target = null;
            target = (org.apache.ode.bpel.pmapi.GetCommunicationResponse)get_store().find_element_user(GETCOMMUNICATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.GetCommunicationResponse)get_store().add_element_user(GETCOMMUNICATIONRESPONSE$0);
            }
            target.set(getCommunicationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getCommunicationResponse" element
     */
    public org.apache.ode.bpel.pmapi.GetCommunicationResponse addNewGetCommunicationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.GetCommunicationResponse target = null;
            target = (org.apache.ode.bpel.pmapi.GetCommunicationResponse)get_store().add_element_user(GETCOMMUNICATIONRESPONSE$0);
            return target;
        }
    }
}
