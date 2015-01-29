/*
 * XML Type:  tFaultInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TFaultInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tFaultInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TFaultInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TFaultInfo
{
    
    public TFaultInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "name");
    private static final javax.xml.namespace.QName EXPLANATION$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "explanation");
    private static final javax.xml.namespace.QName LINENUMBER$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "line-number");
    private static final javax.xml.namespace.QName AIID$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "aiid");
    private static final javax.xml.namespace.QName DATA$8 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "data");
    
    
    /**
     * Gets the "name" element
     */
    public javax.xml.namespace.QName getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlQName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(javax.xml.namespace.QName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setQNameValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlQName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "explanation" element
     */
    public java.lang.String getExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "explanation" element
     */
    public org.apache.xmlbeans.XmlString xgetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "explanation" element
     */
    public void setExplanation(java.lang.String explanation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPLANATION$2);
            }
            target.setStringValue(explanation);
        }
    }
    
    /**
     * Sets (as xml) the "explanation" element
     */
    public void xsetExplanation(org.apache.xmlbeans.XmlString explanation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPLANATION$2);
            }
            target.set(explanation);
        }
    }
    
    /**
     * Gets the "line-number" element
     */
    public int getLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINENUMBER$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "line-number" element
     */
    public org.apache.xmlbeans.XmlInt xgetLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LINENUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "line-number" element
     */
    public void setLineNumber(int lineNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINENUMBER$4);
            }
            target.setIntValue(lineNumber);
        }
    }
    
    /**
     * Sets (as xml) the "line-number" element
     */
    public void xsetLineNumber(org.apache.xmlbeans.XmlInt lineNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LINENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LINENUMBER$4);
            }
            target.set(lineNumber);
        }
    }
    
    /**
     * Gets the "aiid" element
     */
    public int getAiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIID$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "aiid" element
     */
    public org.apache.xmlbeans.XmlInt xgetAiid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AIID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "aiid" element
     */
    public void setAiid(int aiid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIID$6);
            }
            target.setIntValue(aiid);
        }
    }
    
    /**
     * Sets (as xml) the "aiid" element
     */
    public void xsetAiid(org.apache.xmlbeans.XmlInt aiid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AIID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(AIID$6);
            }
            target.set(aiid);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public org.apache.ode.bpel.pmapi.TFaultInfo.Data getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFaultInfo.Data target = null;
            target = (org.apache.ode.bpel.pmapi.TFaultInfo.Data)get_store().find_element_user(DATA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$8) != 0;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(org.apache.ode.bpel.pmapi.TFaultInfo.Data data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFaultInfo.Data target = null;
            target = (org.apache.ode.bpel.pmapi.TFaultInfo.Data)get_store().find_element_user(DATA$8, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.pmapi.TFaultInfo.Data)get_store().add_element_user(DATA$8);
            }
            target.set(data);
        }
    }
    
    /**
     * Appends and returns a new empty "data" element
     */
    public org.apache.ode.bpel.pmapi.TFaultInfo.Data addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.TFaultInfo.Data target = null;
            target = (org.apache.ode.bpel.pmapi.TFaultInfo.Data)get_store().add_element_user(DATA$8);
            return target;
        }
    }
    
    /**
     * Unsets the "data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$8, 0);
        }
    }
    /**
     * An XML data(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TFaultInfo.Data
    {
        
        public DataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
