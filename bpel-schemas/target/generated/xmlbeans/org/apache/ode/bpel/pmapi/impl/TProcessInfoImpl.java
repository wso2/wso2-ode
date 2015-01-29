/*
 * XML Type:  tProcessInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TProcessInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tProcessInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TProcessInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TProcessInfo
{
    
    public TProcessInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PID$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "pid");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "status");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "version");
    private static final javax.xml.namespace.QName DEFINITIONINFO$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "definition-info");
    private static final javax.xml.namespace.QName DEPLOYMENTINFO$8 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "deployment-info");
    private static final javax.xml.namespace.QName INSTANCESUMMARY$10 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instance-summary");
    private static final javax.xml.namespace.QName PROPERTIES$12 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "properties");
    private static final javax.xml.namespace.QName ENDPOINTS$14 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "endpoints");
    private static final javax.xml.namespace.QName DOCUMENTS$16 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "documents");
    
    
    /**
     * Gets the "pid" element
     */
    public java.lang.String getPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pid" element
     */
    public org.apache.xmlbeans.XmlString xgetPid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pid" element
     */
    public void setPid(java.lang.String pid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PID$0);
            }
            target.setStringValue(pid);
        }
    }
    
    /**
     * Sets (as xml) the "pid" element
     */
    public void xsetPid(org.apache.xmlbeans.XmlString pid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PID$0);
            }
            target.set(pid);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.apache.ode.bpel.pmapi.TProcessStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.ode.bpel.pmapi.TProcessStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.ode.bpel.pmapi.TProcessStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessStatus)get_store().find_element_user(STATUS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.apache.ode.bpel.pmapi.TProcessStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.ode.bpel.pmapi.TProcessStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessStatus)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TProcessStatus)get_store().add_element_user(STATUS$2);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public long getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public org.apache.xmlbeans.XmlLong xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(VERSION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(long version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
            }
            target.setLongValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlLong version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "definition-info" element
     */
    public org.apache.ode.bpel.pmapi.TDefinitionInfo getDefinitionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TDefinitionInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TDefinitionInfo)get_store().find_element_user(DEFINITIONINFO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definition-info" element
     */
    public void setDefinitionInfo(org.apache.ode.bpel.pmapi.TDefinitionInfo definitionInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TDefinitionInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TDefinitionInfo)get_store().find_element_user(DEFINITIONINFO$6, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TDefinitionInfo)get_store().add_element_user(DEFINITIONINFO$6);
            }
            target.set(definitionInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "definition-info" element
     */
    public org.apache.ode.bpel.pmapi.TDefinitionInfo addNewDefinitionInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TDefinitionInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TDefinitionInfo)get_store().add_element_user(DEFINITIONINFO$6);
            return target;
        }
    }
    
    /**
     * Gets the "deployment-info" element
     */
    public org.apache.ode.bpel.pmapi.TDeploymentInfo getDeploymentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TDeploymentInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TDeploymentInfo)get_store().find_element_user(DEPLOYMENTINFO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deployment-info" element
     */
    public void setDeploymentInfo(org.apache.ode.bpel.pmapi.TDeploymentInfo deploymentInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TDeploymentInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TDeploymentInfo)get_store().find_element_user(DEPLOYMENTINFO$8, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TDeploymentInfo)get_store().add_element_user(DEPLOYMENTINFO$8);
            }
            target.set(deploymentInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "deployment-info" element
     */
    public org.apache.ode.bpel.pmapi.TDeploymentInfo addNewDeploymentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TDeploymentInfo target = null;
            target = (org.apache.ode.bpel.pmapi.TDeploymentInfo)get_store().add_element_user(DEPLOYMENTINFO$8);
            return target;
        }
    }
    
    /**
     * Gets the "instance-summary" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceSummary getInstanceSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceSummary target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceSummary)get_store().find_element_user(INSTANCESUMMARY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "instance-summary" element
     */
    public boolean isSetInstanceSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANCESUMMARY$10) != 0;
        }
    }
    
    /**
     * Sets the "instance-summary" element
     */
    public void setInstanceSummary(org.apache.ode.bpel.pmapi.TInstanceSummary instanceSummary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceSummary target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceSummary)get_store().find_element_user(INSTANCESUMMARY$10, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TInstanceSummary)get_store().add_element_user(INSTANCESUMMARY$10);
            }
            target.set(instanceSummary);
        }
    }
    
    /**
     * Appends and returns a new empty "instance-summary" element
     */
    public org.apache.ode.bpel.pmapi.TInstanceSummary addNewInstanceSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TInstanceSummary target = null;
            target = (org.apache.ode.bpel.pmapi.TInstanceSummary)get_store().add_element_user(INSTANCESUMMARY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "instance-summary" element
     */
    public void unsetInstanceSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANCESUMMARY$10, 0);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public org.apache.ode.bpel.pmapi.TProcessProperties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessProperties target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessProperties)get_store().find_element_user(PROPERTIES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(org.apache.ode.bpel.pmapi.TProcessProperties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessProperties target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessProperties)get_store().find_element_user(PROPERTIES$12, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TProcessProperties)get_store().add_element_user(PROPERTIES$12);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public org.apache.ode.bpel.pmapi.TProcessProperties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessProperties target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessProperties)get_store().add_element_user(PROPERTIES$12);
            return target;
        }
    }
    
    /**
     * Gets the "endpoints" element
     */
    public org.apache.ode.bpel.pmapi.TEndpointReferences getEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEndpointReferences target = null;
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().find_element_user(ENDPOINTS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endpoints" element
     */
    public void setEndpoints(org.apache.ode.bpel.pmapi.TEndpointReferences endpoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEndpointReferences target = null;
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().find_element_user(ENDPOINTS$14, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().add_element_user(ENDPOINTS$14);
            }
            target.set(endpoints);
        }
    }
    
    /**
     * Appends and returns a new empty "endpoints" element
     */
    public org.apache.ode.bpel.pmapi.TEndpointReferences addNewEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TEndpointReferences target = null;
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().add_element_user(ENDPOINTS$14);
            return target;
        }
    }
    
    /**
     * Gets the "documents" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo.Documents getDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo.Documents target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo.Documents)get_store().find_element_user(DOCUMENTS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "documents" element
     */
    public void setDocuments(org.apache.ode.bpel.pmapi.TProcessInfo.Documents documents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo.Documents target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo.Documents)get_store().find_element_user(DOCUMENTS$16, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TProcessInfo.Documents)get_store().add_element_user(DOCUMENTS$16);
            }
            target.set(documents);
        }
    }
    
    /**
     * Appends and returns a new empty "documents" element
     */
    public org.apache.ode.bpel.pmapi.TProcessInfo.Documents addNewDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TProcessInfo.Documents target = null;
            target = (org.apache.ode.bpel.pmapi.TProcessInfo.Documents)get_store().add_element_user(DOCUMENTS$16);
            return target;
        }
    }
    /**
     * An XML documents(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class DocumentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TProcessInfo.Documents
    {
        
        public DocumentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCUMENT$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "document");
        
        
        /**
         * Gets a List of "document" elements
         */
        public java.util.List<org.apache.ode.bpel.pmapi.TDocumentInfo> getDocumentList()
        {
            final class DocumentList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TDocumentInfo>
            {
                public org.apache.ode.bpel.pmapi.TDocumentInfo get(int i)
                    { return DocumentsImpl.this.getDocumentArray(i); }
                
                public org.apache.ode.bpel.pmapi.TDocumentInfo set(int i, org.apache.ode.bpel.pmapi.TDocumentInfo o)
                {
                    org.apache.ode.bpel.pmapi.TDocumentInfo old = DocumentsImpl.this.getDocumentArray(i);
                    DocumentsImpl.this.setDocumentArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.pmapi.TDocumentInfo o)
                    { DocumentsImpl.this.insertNewDocument(i).set(o); }
                
                public org.apache.ode.bpel.pmapi.TDocumentInfo remove(int i)
                {
                    org.apache.ode.bpel.pmapi.TDocumentInfo old = DocumentsImpl.this.getDocumentArray(i);
                    DocumentsImpl.this.removeDocument(i);
                    return old;
                }
                
                public int size()
                    { return DocumentsImpl.this.sizeOfDocumentArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DocumentList();
            }
        }
        
        /**
         * Gets array of all "document" elements
         */
        public org.apache.ode.bpel.pmapi.TDocumentInfo[] getDocumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOCUMENT$0, targetList);
                org.apache.ode.bpel.pmapi.TDocumentInfo[] result = new org.apache.ode.bpel.pmapi.TDocumentInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "document" element
         */
        public org.apache.ode.bpel.pmapi.TDocumentInfo getDocumentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TDocumentInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TDocumentInfo)get_store().find_element_user(DOCUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "document" element
         */
        public int sizeOfDocumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCUMENT$0);
            }
        }
        
        /**
         * Sets array of all "document" element
         */
        public void setDocumentArray(org.apache.ode.bpel.pmapi.TDocumentInfo[] documentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(documentArray, DOCUMENT$0);
            }
        }
        
        /**
         * Sets ith "document" element
         */
        public void setDocumentArray(int i, org.apache.ode.bpel.pmapi.TDocumentInfo document)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TDocumentInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TDocumentInfo)get_store().find_element_user(DOCUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(document);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "document" element
         */
        public org.apache.ode.bpel.pmapi.TDocumentInfo insertNewDocument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TDocumentInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TDocumentInfo)get_store().insert_element_user(DOCUMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "document" element
         */
        public org.apache.ode.bpel.pmapi.TDocumentInfo addNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TDocumentInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TDocumentInfo)get_store().add_element_user(DOCUMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "document" element
         */
        public void removeDocument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCUMENT$0, i);
            }
        }
    }
}
