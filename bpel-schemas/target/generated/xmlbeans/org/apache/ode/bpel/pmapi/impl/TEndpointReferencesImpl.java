/*
 * XML Type:  tEndpointReferences
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TEndpointReferences
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tEndpointReferences(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TEndpointReferencesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TEndpointReferences
{
    
    public TEndpointReferencesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTREF$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "endpoint-ref");
    
    
    /**
     * Gets a List of "endpoint-ref" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef> getEndpointRefList()
    {
        final class EndpointRefList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef>
        {
            public org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef get(int i)
                { return TEndpointReferencesImpl.this.getEndpointRefArray(i); }
            
            public org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef set(int i, org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef o)
            {
                org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef old = TEndpointReferencesImpl.this.getEndpointRefArray(i);
                TEndpointReferencesImpl.this.setEndpointRefArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef o)
                { TEndpointReferencesImpl.this.insertNewEndpointRef(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef remove(int i)
            {
                org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef old = TEndpointReferencesImpl.this.getEndpointRefArray(i);
                TEndpointReferencesImpl.this.removeEndpointRef(i);
                return old;
            }
            
            public int size()
                { return TEndpointReferencesImpl.this.sizeOfEndpointRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndpointRefList();
        }
    }
    
    /**
     * Gets array of all "endpoint-ref" elements
     */
    public org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef[] getEndpointRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENDPOINTREF$0, targetList);
            org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef[] result = new org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "endpoint-ref" element
     */
    public org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef getEndpointRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef target = null;
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef)get_store().find_element_user(ENDPOINTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "endpoint-ref" element
     */
    public int sizeOfEndpointRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINTREF$0);
        }
    }
    
    /**
     * Sets array of all "endpoint-ref" element
     */
    public void setEndpointRefArray(org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef[] endpointRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endpointRefArray, ENDPOINTREF$0);
        }
    }
    
    /**
     * Sets ith "endpoint-ref" element
     */
    public void setEndpointRefArray(int i, org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef endpointRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef target = null;
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef)get_store().find_element_user(ENDPOINTREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endpointRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endpoint-ref" element
     */
    public org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef insertNewEndpointRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef target = null;
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef)get_store().insert_element_user(ENDPOINTREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endpoint-ref" element
     */
    public org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef addNewEndpointRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef target = null;
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef)get_store().add_element_user(ENDPOINTREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "endpoint-ref" element
     */
    public void removeEndpointRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINTREF$0, i);
        }
    }
    /**
     * An XML endpoint-ref(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class EndpointRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TEndpointReferences.EndpointRef
    {
        
        public EndpointRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTNERLINK$0 = 
            new javax.xml.namespace.QName("", "partner-link");
        private static final javax.xml.namespace.QName PARTNERROLE$2 = 
            new javax.xml.namespace.QName("", "partner-role");
        
        
        /**
         * Gets the "partner-link" attribute
         */
        public java.lang.String getPartnerLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERLINK$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "partner-link" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPartnerLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERLINK$0);
                return target;
            }
        }
        
        /**
         * True if has "partner-link" attribute
         */
        public boolean isSetPartnerLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTNERLINK$0) != null;
            }
        }
        
        /**
         * Sets the "partner-link" attribute
         */
        public void setPartnerLink(java.lang.String partnerLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERLINK$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTNERLINK$0);
                }
                target.setStringValue(partnerLink);
            }
        }
        
        /**
         * Sets (as xml) the "partner-link" attribute
         */
        public void xsetPartnerLink(org.apache.xmlbeans.XmlString partnerLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERLINK$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARTNERLINK$0);
                }
                target.set(partnerLink);
            }
        }
        
        /**
         * Unsets the "partner-link" attribute
         */
        public void unsetPartnerLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTNERLINK$0);
            }
        }
        
        /**
         * Gets the "partner-role" attribute
         */
        public java.lang.String getPartnerRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERROLE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "partner-role" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPartnerRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERROLE$2);
                return target;
            }
        }
        
        /**
         * True if has "partner-role" attribute
         */
        public boolean isSetPartnerRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTNERROLE$2) != null;
            }
        }
        
        /**
         * Sets the "partner-role" attribute
         */
        public void setPartnerRole(java.lang.String partnerRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERROLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTNERROLE$2);
                }
                target.setStringValue(partnerRole);
            }
        }
        
        /**
         * Sets (as xml) the "partner-role" attribute
         */
        public void xsetPartnerRole(org.apache.xmlbeans.XmlString partnerRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARTNERROLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARTNERROLE$2);
                }
                target.set(partnerRole);
            }
        }
        
        /**
         * Unsets the "partner-role" attribute
         */
        public void unsetPartnerRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTNERROLE$2);
            }
        }
    }
}
