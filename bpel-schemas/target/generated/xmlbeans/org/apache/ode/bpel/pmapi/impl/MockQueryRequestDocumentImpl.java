/*
 * An XML document type.
 * Localname: mockQueryRequest
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.MockQueryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * A document containing one mockQueryRequest(@http://www.apache.org/ode/pmapi/types/2006/08/02/) element.
 *
 * This is a complex type.
 */
public class MockQueryRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.MockQueryRequestDocument
{
    
    public MockQueryRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOCKQUERYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "mockQueryRequest");
    
    
    /**
     * Gets the "mockQueryRequest" element
     */
    public org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest getMockQueryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest target = null;
            target = (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest)get_store().find_element_user(MOCKQUERYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mockQueryRequest" element
     */
    public void setMockQueryRequest(org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest mockQueryRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest target = null;
            target = (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest)get_store().find_element_user(MOCKQUERYREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest)get_store().add_element_user(MOCKQUERYREQUEST$0);
            }
            target.set(mockQueryRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "mockQueryRequest" element
     */
    public org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest addNewMockQueryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest target = null;
            target = (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest)get_store().add_element_user(MOCKQUERYREQUEST$0);
            return target;
        }
    }
    /**
     * An XML mockQueryRequest(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class MockQueryRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest
    {
        
        public MockQueryRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREATETIME$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "createTime");
        private static final javax.xml.namespace.QName SERVICE$2 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "service");
        private static final javax.xml.namespace.QName OPERATION$4 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "operation");
        private static final javax.xml.namespace.QName IN$6 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "in");
        private static final javax.xml.namespace.QName PATTERN$8 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "pattern");
        
        
        /**
         * Gets the "createTime" element
         */
        public java.util.Calendar getCreateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATETIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "createTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATETIME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "createTime" element
         */
        public void setCreateTime(java.util.Calendar createTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATETIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATETIME$0);
                }
                target.setCalendarValue(createTime);
            }
        }
        
        /**
         * Sets (as xml) the "createTime" element
         */
        public void xsetCreateTime(org.apache.xmlbeans.XmlDateTime createTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATETIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATETIME$0);
                }
                target.set(createTime);
            }
        }
        
        /**
         * Gets the "service" element
         */
        public javax.xml.namespace.QName getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "service" element
         */
        public org.apache.xmlbeans.XmlQName xgetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SERVICE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(javax.xml.namespace.QName service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$2);
                }
                target.setQNameValue(service);
            }
        }
        
        /**
         * Sets (as xml) the "service" element
         */
        public void xsetService(org.apache.xmlbeans.XmlQName service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SERVICE$2);
                }
                target.set(service);
            }
        }
        
        /**
         * Gets the "operation" element
         */
        public java.lang.String getOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "operation" element
         */
        public org.apache.xmlbeans.XmlString xgetOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "operation" element
         */
        public void setOperation(java.lang.String operation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$4);
                }
                target.setStringValue(operation);
            }
        }
        
        /**
         * Sets (as xml) the "operation" element
         */
        public void xsetOperation(org.apache.xmlbeans.XmlString operation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATION$4);
                }
                target.set(operation);
            }
        }
        
        /**
         * Gets the "in" element
         */
        public org.apache.xmlbeans.XmlObject getIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IN$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "in" element
         */
        public void setIn(org.apache.xmlbeans.XmlObject in)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IN$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IN$6);
                }
                target.set(in);
            }
        }
        
        /**
         * Appends and returns a new empty "in" element
         */
        public org.apache.xmlbeans.XmlObject addNewIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IN$6);
                return target;
            }
        }
        
        /**
         * Gets the "pattern" element
         */
        public org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern.Enum getPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATTERN$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "pattern" element
         */
        public org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern xgetPattern()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern target = null;
                target = (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern)get_store().find_element_user(PATTERN$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "pattern" element
         */
        public void setPattern(org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern.Enum pattern)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATTERN$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATTERN$8);
                }
                target.setEnumValue(pattern);
            }
        }
        
        /**
         * Sets (as xml) the "pattern" element
         */
        public void xsetPattern(org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern pattern)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern target = null;
                target = (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern)get_store().find_element_user(PATTERN$8, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern)get_store().add_element_user(PATTERN$8);
                }
                target.set(pattern);
            }
        }
        /**
         * An XML pattern(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
         *
         * This is an atomic type that is a restriction of org.apache.ode.bpel.pmapi.MockQueryRequestDocument$MockQueryRequest$Pattern.
         */
        public static class PatternImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.ode.bpel.pmapi.MockQueryRequestDocument.MockQueryRequest.Pattern
        {
            
            public PatternImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PatternImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
