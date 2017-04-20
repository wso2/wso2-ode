/*
 * XML Type:  ReplayType
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.ReplayType
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML ReplayType(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class ReplayTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.ReplayType
{
    
    public ReplayTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOCK$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "mock");
    private static final javax.xml.namespace.QName MOCKQUERY$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "mockQuery");
    private static final javax.xml.namespace.QName LIVE$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "live");
    
    
    /**
     * Gets the "mock" element
     */
    public org.apache.xmlbeans.XmlAnySimpleType getMock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_element_user(MOCK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mock" element
     */
    public boolean isSetMock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOCK$0) != 0;
        }
    }
    
    /**
     * Sets the "mock" element
     */
    public void setMock(org.apache.xmlbeans.XmlAnySimpleType mock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_element_user(MOCK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_element_user(MOCK$0);
            }
            target.set(mock);
        }
    }
    
    /**
     * Appends and returns a new empty "mock" element
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewMock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_element_user(MOCK$0);
            return target;
        }
    }
    
    /**
     * Unsets the "mock" element
     */
    public void unsetMock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOCK$0, 0);
        }
    }
    
    /**
     * Gets the "mockQuery" element
     */
    public java.lang.String getMockQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOCKQUERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mockQuery" element
     */
    public org.apache.xmlbeans.XmlString xgetMockQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOCKQUERY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "mockQuery" element
     */
    public boolean isSetMockQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOCKQUERY$2) != 0;
        }
    }
    
    /**
     * Sets the "mockQuery" element
     */
    public void setMockQuery(java.lang.String mockQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOCKQUERY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOCKQUERY$2);
            }
            target.setStringValue(mockQuery);
        }
    }
    
    /**
     * Sets (as xml) the "mockQuery" element
     */
    public void xsetMockQuery(org.apache.xmlbeans.XmlString mockQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MOCKQUERY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MOCKQUERY$2);
            }
            target.set(mockQuery);
        }
    }
    
    /**
     * Unsets the "mockQuery" element
     */
    public void unsetMockQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOCKQUERY$2, 0);
        }
    }
    
    /**
     * Gets the "live" element
     */
    public org.apache.xmlbeans.XmlAnySimpleType getLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_element_user(LIVE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "live" element
     */
    public boolean isSetLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIVE$4) != 0;
        }
    }
    
    /**
     * Sets the "live" element
     */
    public void setLive(org.apache.xmlbeans.XmlAnySimpleType live)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_element_user(LIVE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_element_user(LIVE$4);
            }
            target.set(live);
        }
    }
    
    /**
     * Appends and returns a new empty "live" element
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_element_user(LIVE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "live" element
     */
    public void unsetLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIVE$4, 0);
        }
    }
}
