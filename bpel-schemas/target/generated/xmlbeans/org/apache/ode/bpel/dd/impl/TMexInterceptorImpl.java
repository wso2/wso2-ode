/*
 * XML Type:  tMexInterceptor
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TMexInterceptor
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tMexInterceptor(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TMexInterceptorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TMexInterceptor
{
    
    public TMexInterceptorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSNAME$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "class-name");
    
    
    /**
     * Gets the "class-name" element
     */
    public java.lang.String getClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "class-name" element
     */
    public org.apache.xmlbeans.XmlString xgetClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "class-name" element
     */
    public void setClassName(java.lang.String className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLASSNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLASSNAME$0);
            }
            target.setStringValue(className);
        }
    }
    
    /**
     * Sets (as xml) the "class-name" element
     */
    public void xsetClassName(org.apache.xmlbeans.XmlString className)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLASSNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLASSNAME$0);
            }
            target.set(className);
        }
    }
}
