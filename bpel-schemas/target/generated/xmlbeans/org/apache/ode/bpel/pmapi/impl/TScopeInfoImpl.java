/*
 * XML Type:  tScopeInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TScopeInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tScopeInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TScopeInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TScopeInfo
{
    
    public TScopeInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIID$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "siid");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "name");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "status");
    private static final javax.xml.namespace.QName PARENTSCOPEREF$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "parent-scope-ref");
    private static final javax.xml.namespace.QName CHILDREN$8 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "children");
    private static final javax.xml.namespace.QName ACTIVITIES$10 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activities");
    private static final javax.xml.namespace.QName VARIABLES$12 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "variables");
    private static final javax.xml.namespace.QName CORRELATIONSETS$14 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "correlation-sets");
    private static final javax.xml.namespace.QName ENDPOINTS$16 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "endpoints");
    
    
    /**
     * Gets the "siid" element
     */
    public java.lang.String getSiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "siid" element
     */
    public org.apache.xmlbeans.XmlString xgetSiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "siid" element
     */
    public void setSiid(java.lang.String siid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIID$0);
            }
            target.setStringValue(siid);
        }
    }
    
    /**
     * Sets (as xml) the "siid" element
     */
    public void xsetSiid(org.apache.xmlbeans.XmlString siid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIID$0);
            }
            target.set(siid);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.apache.ode.bpel.pmapi.TScopeStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return (org.apache.ode.bpel.pmapi.TScopeStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.ode.bpel.pmapi.TScopeStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeStatus)get_store().find_element_user(STATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.apache.ode.bpel.pmapi.TScopeStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$4);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.ode.bpel.pmapi.TScopeStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeStatus target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeStatus)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeStatus)get_store().add_element_user(STATUS$4);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "parent-scope-ref" element
     */
    public org.apache.ode.bpel.pmapi.TScopeRef getParentScopeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(PARENTSCOPEREF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parent-scope-ref" element
     */
    public boolean isSetParentScopeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTSCOPEREF$6) != 0;
        }
    }
    
    /**
     * Sets the "parent-scope-ref" element
     */
    public void setParentScopeRef(org.apache.ode.bpel.pmapi.TScopeRef parentScopeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(PARENTSCOPEREF$6, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().add_element_user(PARENTSCOPEREF$6);
            }
            target.set(parentScopeRef);
        }
    }
    
    /**
     * Appends and returns a new empty "parent-scope-ref" element
     */
    public org.apache.ode.bpel.pmapi.TScopeRef addNewParentScopeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeRef target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().add_element_user(PARENTSCOPEREF$6);
            return target;
        }
    }
    
    /**
     * Unsets the "parent-scope-ref" element
     */
    public void unsetParentScopeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTSCOPEREF$6, 0);
        }
    }
    
    /**
     * Gets the "children" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.Children getChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Children target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Children)get_store().find_element_user(CHILDREN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "children" element
     */
    public boolean isSetChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDREN$8) != 0;
        }
    }
    
    /**
     * Sets the "children" element
     */
    public void setChildren(org.apache.ode.bpel.pmapi.TScopeInfo.Children children)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Children target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Children)get_store().find_element_user(CHILDREN$8, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.Children)get_store().add_element_user(CHILDREN$8);
            }
            target.set(children);
        }
    }
    
    /**
     * Appends and returns a new empty "children" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.Children addNewChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Children target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Children)get_store().add_element_user(CHILDREN$8);
            return target;
        }
    }
    
    /**
     * Unsets the "children" element
     */
    public void unsetChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDREN$8, 0);
        }
    }
    
    /**
     * Gets the "activities" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.Activities getActivities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Activities target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Activities)get_store().find_element_user(ACTIVITIES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "activities" element
     */
    public boolean isSetActivities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITIES$10) != 0;
        }
    }
    
    /**
     * Sets the "activities" element
     */
    public void setActivities(org.apache.ode.bpel.pmapi.TScopeInfo.Activities activities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Activities target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Activities)get_store().find_element_user(ACTIVITIES$10, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.Activities)get_store().add_element_user(ACTIVITIES$10);
            }
            target.set(activities);
        }
    }
    
    /**
     * Appends and returns a new empty "activities" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.Activities addNewActivities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Activities target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Activities)get_store().add_element_user(ACTIVITIES$10);
            return target;
        }
    }
    
    /**
     * Unsets the "activities" element
     */
    public void unsetActivities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITIES$10, 0);
        }
    }
    
    /**
     * Gets the "variables" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.Variables getVariables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Variables target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Variables)get_store().find_element_user(VARIABLES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "variables" element
     */
    public boolean isSetVariables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIABLES$12) != 0;
        }
    }
    
    /**
     * Sets the "variables" element
     */
    public void setVariables(org.apache.ode.bpel.pmapi.TScopeInfo.Variables variables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Variables target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Variables)get_store().find_element_user(VARIABLES$12, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.Variables)get_store().add_element_user(VARIABLES$12);
            }
            target.set(variables);
        }
    }
    
    /**
     * Appends and returns a new empty "variables" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.Variables addNewVariables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.Variables target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.Variables)get_store().add_element_user(VARIABLES$12);
            return target;
        }
    }
    
    /**
     * Unsets the "variables" element
     */
    public void unsetVariables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIABLES$12, 0);
        }
    }
    
    /**
     * Gets the "correlation-sets" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets getCorrelationSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets)get_store().find_element_user(CORRELATIONSETS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "correlation-sets" element
     */
    public boolean isSetCorrelationSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONSETS$14) != 0;
        }
    }
    
    /**
     * Sets the "correlation-sets" element
     */
    public void setCorrelationSets(org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets correlationSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets)get_store().find_element_user(CORRELATIONSETS$14, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets)get_store().add_element_user(CORRELATIONSETS$14);
            }
            target.set(correlationSets);
        }
    }
    
    /**
     * Appends and returns a new empty "correlation-sets" element
     */
    public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets addNewCorrelationSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets target = null;
            target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets)get_store().add_element_user(CORRELATIONSETS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "correlation-sets" element
     */
    public void unsetCorrelationSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONSETS$14, 0);
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
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().find_element_user(ENDPOINTS$16, 0);
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
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().find_element_user(ENDPOINTS$16, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().add_element_user(ENDPOINTS$16);
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
            target = (org.apache.ode.bpel.pmapi.TEndpointReferences)get_store().add_element_user(ENDPOINTS$16);
            return target;
        }
    }
    /**
     * An XML children(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class ChildrenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TScopeInfo.Children
    {
        
        public ChildrenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHILDREF$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "child-ref");
        
        
        /**
         * Gets a List of "child-ref" elements
         */
        public java.util.List<org.apache.ode.bpel.pmapi.TScopeRef> getChildRefList()
        {
            final class ChildRefList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TScopeRef>
            {
                public org.apache.ode.bpel.pmapi.TScopeRef get(int i)
                    { return ChildrenImpl.this.getChildRefArray(i); }
                
                public org.apache.ode.bpel.pmapi.TScopeRef set(int i, org.apache.ode.bpel.pmapi.TScopeRef o)
                {
                    org.apache.ode.bpel.pmapi.TScopeRef old = ChildrenImpl.this.getChildRefArray(i);
                    ChildrenImpl.this.setChildRefArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.pmapi.TScopeRef o)
                    { ChildrenImpl.this.insertNewChildRef(i).set(o); }
                
                public org.apache.ode.bpel.pmapi.TScopeRef remove(int i)
                {
                    org.apache.ode.bpel.pmapi.TScopeRef old = ChildrenImpl.this.getChildRefArray(i);
                    ChildrenImpl.this.removeChildRef(i);
                    return old;
                }
                
                public int size()
                    { return ChildrenImpl.this.sizeOfChildRefArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ChildRefList();
            }
        }
        
        /**
         * Gets array of all "child-ref" elements
         */
        public org.apache.ode.bpel.pmapi.TScopeRef[] getChildRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHILDREF$0, targetList);
                org.apache.ode.bpel.pmapi.TScopeRef[] result = new org.apache.ode.bpel.pmapi.TScopeRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "child-ref" element
         */
        public org.apache.ode.bpel.pmapi.TScopeRef getChildRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeRef target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(CHILDREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "child-ref" element
         */
        public int sizeOfChildRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHILDREF$0);
            }
        }
        
        /**
         * Sets array of all "child-ref" element
         */
        public void setChildRefArray(org.apache.ode.bpel.pmapi.TScopeRef[] childRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(childRefArray, CHILDREF$0);
            }
        }
        
        /**
         * Sets ith "child-ref" element
         */
        public void setChildRefArray(int i, org.apache.ode.bpel.pmapi.TScopeRef childRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeRef target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().find_element_user(CHILDREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(childRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "child-ref" element
         */
        public org.apache.ode.bpel.pmapi.TScopeRef insertNewChildRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeRef target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().insert_element_user(CHILDREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "child-ref" element
         */
        public org.apache.ode.bpel.pmapi.TScopeRef addNewChildRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeRef target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeRef)get_store().add_element_user(CHILDREF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "child-ref" element
         */
        public void removeChildRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHILDREF$0, i);
            }
        }
    }
    /**
     * An XML activities(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class ActivitiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TScopeInfo.Activities
    {
        
        public ActivitiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACTIVITYINFO$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-info");
        
        
        /**
         * Gets a List of "activity-info" elements
         */
        public java.util.List<org.apache.ode.bpel.pmapi.TActivityInfo> getActivityInfoList()
        {
            final class ActivityInfoList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TActivityInfo>
            {
                public org.apache.ode.bpel.pmapi.TActivityInfo get(int i)
                    { return ActivitiesImpl.this.getActivityInfoArray(i); }
                
                public org.apache.ode.bpel.pmapi.TActivityInfo set(int i, org.apache.ode.bpel.pmapi.TActivityInfo o)
                {
                    org.apache.ode.bpel.pmapi.TActivityInfo old = ActivitiesImpl.this.getActivityInfoArray(i);
                    ActivitiesImpl.this.setActivityInfoArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.pmapi.TActivityInfo o)
                    { ActivitiesImpl.this.insertNewActivityInfo(i).set(o); }
                
                public org.apache.ode.bpel.pmapi.TActivityInfo remove(int i)
                {
                    org.apache.ode.bpel.pmapi.TActivityInfo old = ActivitiesImpl.this.getActivityInfoArray(i);
                    ActivitiesImpl.this.removeActivityInfo(i);
                    return old;
                }
                
                public int size()
                    { return ActivitiesImpl.this.sizeOfActivityInfoArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ActivityInfoList();
            }
        }
        
        /**
         * Gets array of all "activity-info" elements
         */
        public org.apache.ode.bpel.pmapi.TActivityInfo[] getActivityInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACTIVITYINFO$0, targetList);
                org.apache.ode.bpel.pmapi.TActivityInfo[] result = new org.apache.ode.bpel.pmapi.TActivityInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "activity-info" element
         */
        public org.apache.ode.bpel.pmapi.TActivityInfo getActivityInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TActivityInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().find_element_user(ACTIVITYINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "activity-info" element
         */
        public int sizeOfActivityInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIVITYINFO$0);
            }
        }
        
        /**
         * Sets array of all "activity-info" element
         */
        public void setActivityInfoArray(org.apache.ode.bpel.pmapi.TActivityInfo[] activityInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(activityInfoArray, ACTIVITYINFO$0);
            }
        }
        
        /**
         * Sets ith "activity-info" element
         */
        public void setActivityInfoArray(int i, org.apache.ode.bpel.pmapi.TActivityInfo activityInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TActivityInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().find_element_user(ACTIVITYINFO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(activityInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "activity-info" element
         */
        public org.apache.ode.bpel.pmapi.TActivityInfo insertNewActivityInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TActivityInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().insert_element_user(ACTIVITYINFO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "activity-info" element
         */
        public org.apache.ode.bpel.pmapi.TActivityInfo addNewActivityInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TActivityInfo target = null;
                target = (org.apache.ode.bpel.pmapi.TActivityInfo)get_store().add_element_user(ACTIVITYINFO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "activity-info" element
         */
        public void removeActivityInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIVITYINFO$0, i);
            }
        }
    }
    /**
     * An XML variables(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class VariablesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TScopeInfo.Variables
    {
        
        public VariablesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VARIABLEREF$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "variable-ref");
        
        
        /**
         * Gets a List of "variable-ref" elements
         */
        public java.util.List<org.apache.ode.bpel.pmapi.TVariableRef> getVariableRefList()
        {
            final class VariableRefList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TVariableRef>
            {
                public org.apache.ode.bpel.pmapi.TVariableRef get(int i)
                    { return VariablesImpl.this.getVariableRefArray(i); }
                
                public org.apache.ode.bpel.pmapi.TVariableRef set(int i, org.apache.ode.bpel.pmapi.TVariableRef o)
                {
                    org.apache.ode.bpel.pmapi.TVariableRef old = VariablesImpl.this.getVariableRefArray(i);
                    VariablesImpl.this.setVariableRefArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.pmapi.TVariableRef o)
                    { VariablesImpl.this.insertNewVariableRef(i).set(o); }
                
                public org.apache.ode.bpel.pmapi.TVariableRef remove(int i)
                {
                    org.apache.ode.bpel.pmapi.TVariableRef old = VariablesImpl.this.getVariableRefArray(i);
                    VariablesImpl.this.removeVariableRef(i);
                    return old;
                }
                
                public int size()
                    { return VariablesImpl.this.sizeOfVariableRefArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new VariableRefList();
            }
        }
        
        /**
         * Gets array of all "variable-ref" elements
         */
        public org.apache.ode.bpel.pmapi.TVariableRef[] getVariableRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VARIABLEREF$0, targetList);
                org.apache.ode.bpel.pmapi.TVariableRef[] result = new org.apache.ode.bpel.pmapi.TVariableRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "variable-ref" element
         */
        public org.apache.ode.bpel.pmapi.TVariableRef getVariableRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TVariableRef target = null;
                target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().find_element_user(VARIABLEREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "variable-ref" element
         */
        public int sizeOfVariableRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VARIABLEREF$0);
            }
        }
        
        /**
         * Sets array of all "variable-ref" element
         */
        public void setVariableRefArray(org.apache.ode.bpel.pmapi.TVariableRef[] variableRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(variableRefArray, VARIABLEREF$0);
            }
        }
        
        /**
         * Sets ith "variable-ref" element
         */
        public void setVariableRefArray(int i, org.apache.ode.bpel.pmapi.TVariableRef variableRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TVariableRef target = null;
                target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().find_element_user(VARIABLEREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(variableRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "variable-ref" element
         */
        public org.apache.ode.bpel.pmapi.TVariableRef insertNewVariableRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TVariableRef target = null;
                target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().insert_element_user(VARIABLEREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "variable-ref" element
         */
        public org.apache.ode.bpel.pmapi.TVariableRef addNewVariableRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TVariableRef target = null;
                target = (org.apache.ode.bpel.pmapi.TVariableRef)get_store().add_element_user(VARIABLEREF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "variable-ref" element
         */
        public void removeVariableRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VARIABLEREF$0, i);
            }
        }
    }
    /**
     * An XML correlation-sets(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class CorrelationSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets
    {
        
        public CorrelationSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CORRELATIONSET$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "correlation-set");
        
        
        /**
         * Gets a List of "correlation-set" elements
         */
        public java.util.List<org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet> getCorrelationSetList()
        {
            final class CorrelationSetList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet>
            {
                public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet get(int i)
                    { return CorrelationSetsImpl.this.getCorrelationSetArray(i); }
                
                public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet set(int i, org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet o)
                {
                    org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet old = CorrelationSetsImpl.this.getCorrelationSetArray(i);
                    CorrelationSetsImpl.this.setCorrelationSetArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet o)
                    { CorrelationSetsImpl.this.insertNewCorrelationSet(i).set(o); }
                
                public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet remove(int i)
                {
                    org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet old = CorrelationSetsImpl.this.getCorrelationSetArray(i);
                    CorrelationSetsImpl.this.removeCorrelationSet(i);
                    return old;
                }
                
                public int size()
                    { return CorrelationSetsImpl.this.sizeOfCorrelationSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CorrelationSetList();
            }
        }
        
        /**
         * Gets array of all "correlation-set" elements
         */
        public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet[] getCorrelationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CORRELATIONSET$0, targetList);
                org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet[] result = new org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "correlation-set" element
         */
        public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet getCorrelationSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet)get_store().find_element_user(CORRELATIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "correlation-set" element
         */
        public int sizeOfCorrelationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CORRELATIONSET$0);
            }
        }
        
        /**
         * Sets array of all "correlation-set" element
         */
        public void setCorrelationSetArray(org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet[] correlationSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(correlationSetArray, CORRELATIONSET$0);
            }
        }
        
        /**
         * Sets ith "correlation-set" element
         */
        public void setCorrelationSetArray(int i, org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet correlationSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet)get_store().find_element_user(CORRELATIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(correlationSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "correlation-set" element
         */
        public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet insertNewCorrelationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet)get_store().insert_element_user(CORRELATIONSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "correlation-set" element
         */
        public org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet addNewCorrelationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet target = null;
                target = (org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet)get_store().add_element_user(CORRELATIONSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "correlation-set" element
         */
        public void removeCorrelationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CORRELATIONSET$0, i);
            }
        }
        /**
         * An XML correlation-set(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
         *
         * This is a complex type.
         */
        public static class CorrelationSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TScopeInfo.CorrelationSets.CorrelationSet
        {
            
            public CorrelationSetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CORRELATIONPROPERTY$0 = 
                new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "correlation-property");
            private static final javax.xml.namespace.QName NAME$2 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName CSETID$4 = 
                new javax.xml.namespace.QName("", "csetid");
            
            
            /**
             * Gets a List of "correlation-property" elements
             */
            public java.util.List<org.apache.ode.bpel.pmapi.TCorrelationProperty> getCorrelationPropertyList()
            {
                final class CorrelationPropertyList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.TCorrelationProperty>
                {
                    public org.apache.ode.bpel.pmapi.TCorrelationProperty get(int i)
                        { return CorrelationSetImpl.this.getCorrelationPropertyArray(i); }
                    
                    public org.apache.ode.bpel.pmapi.TCorrelationProperty set(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty o)
                    {
                      org.apache.ode.bpel.pmapi.TCorrelationProperty old = CorrelationSetImpl.this.getCorrelationPropertyArray(i);
                      CorrelationSetImpl.this.setCorrelationPropertyArray(i, o);
                      return old;
                    }
                    
                    public void add(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty o)
                        { CorrelationSetImpl.this.insertNewCorrelationProperty(i).set(o); }
                    
                    public org.apache.ode.bpel.pmapi.TCorrelationProperty remove(int i)
                    {
                      org.apache.ode.bpel.pmapi.TCorrelationProperty old = CorrelationSetImpl.this.getCorrelationPropertyArray(i);
                      CorrelationSetImpl.this.removeCorrelationProperty(i);
                      return old;
                    }
                    
                    public int size()
                        { return CorrelationSetImpl.this.sizeOfCorrelationPropertyArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new CorrelationPropertyList();
                }
            }
            
            /**
             * Gets array of all "correlation-property" elements
             */
            public org.apache.ode.bpel.pmapi.TCorrelationProperty[] getCorrelationPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CORRELATIONPROPERTY$0, targetList);
                    org.apache.ode.bpel.pmapi.TCorrelationProperty[] result = new org.apache.ode.bpel.pmapi.TCorrelationProperty[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "correlation-property" element
             */
            public org.apache.ode.bpel.pmapi.TCorrelationProperty getCorrelationPropertyArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                    target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().find_element_user(CORRELATIONPROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "correlation-property" element
             */
            public int sizeOfCorrelationPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CORRELATIONPROPERTY$0);
                }
            }
            
            /**
             * Sets array of all "correlation-property" element
             */
            public void setCorrelationPropertyArray(org.apache.ode.bpel.pmapi.TCorrelationProperty[] correlationPropertyArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(correlationPropertyArray, CORRELATIONPROPERTY$0);
                }
            }
            
            /**
             * Sets ith "correlation-property" element
             */
            public void setCorrelationPropertyArray(int i, org.apache.ode.bpel.pmapi.TCorrelationProperty correlationProperty)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                    target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().find_element_user(CORRELATIONPROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(correlationProperty);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "correlation-property" element
             */
            public org.apache.ode.bpel.pmapi.TCorrelationProperty insertNewCorrelationProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                    target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().insert_element_user(CORRELATIONPROPERTY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "correlation-property" element
             */
            public org.apache.ode.bpel.pmapi.TCorrelationProperty addNewCorrelationProperty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.ode.bpel.pmapi.TCorrelationProperty target = null;
                    target = (org.apache.ode.bpel.pmapi.TCorrelationProperty)get_store().add_element_user(CORRELATIONPROPERTY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "correlation-property" element
             */
            public void removeCorrelationProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CORRELATIONPROPERTY$0, i);
                }
            }
            
            /**
             * Gets the "name" attribute
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                    return target;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Gets the "csetid" attribute
             */
            public java.lang.String getCsetid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSETID$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "csetid" attribute
             */
            public org.apache.xmlbeans.XmlString xgetCsetid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSETID$4);
                    return target;
                }
            }
            
            /**
             * Sets the "csetid" attribute
             */
            public void setCsetid(java.lang.String csetid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CSETID$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CSETID$4);
                    }
                    target.setStringValue(csetid);
                }
            }
            
            /**
             * Sets (as xml) the "csetid" attribute
             */
            public void xsetCsetid(org.apache.xmlbeans.XmlString csetid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CSETID$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CSETID$4);
                    }
                    target.set(csetid);
                }
            }
        }
    }
}
