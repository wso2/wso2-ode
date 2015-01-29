/*
 * XML Type:  tDeploymentInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TDeploymentInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tDeploymentInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TDeploymentInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TDeploymentInfo
{
    
    public TDeploymentInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "package");
    private static final javax.xml.namespace.QName DOCUMENT$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "document");
    private static final javax.xml.namespace.QName DEPLOYDATE$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "deploy-date");
    private static final javax.xml.namespace.QName DEPLOYER$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "deployer");
    
    
    /**
     * Gets the "package" element
     */
    public java.lang.String getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "package" element
     */
    public org.apache.xmlbeans.XmlString xgetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "package" element
     */
    public void setPackage(java.lang.String xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PACKAGE$0);
            }
            target.setStringValue(xpackage);
        }
    }
    
    /**
     * Sets (as xml) the "package" element
     */
    public void xsetPackage(org.apache.xmlbeans.XmlString xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PACKAGE$0);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Gets the "document" element
     */
    public java.lang.String getDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "document" element
     */
    public org.apache.xmlbeans.XmlString xgetDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "document" element
     */
    public void setDocument(java.lang.String document)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENT$2);
            }
            target.setStringValue(document);
        }
    }
    
    /**
     * Sets (as xml) the "document" element
     */
    public void xsetDocument(org.apache.xmlbeans.XmlString document)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENT$2);
            }
            target.set(document);
        }
    }
    
    /**
     * Gets the "deploy-date" element
     */
    public java.util.Calendar getDeployDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "deploy-date" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDeployDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DEPLOYDATE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "deploy-date" element
     */
    public void setDeployDate(java.util.Calendar deployDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPLOYDATE$4);
            }
            target.setCalendarValue(deployDate);
        }
    }
    
    /**
     * Sets (as xml) the "deploy-date" element
     */
    public void xsetDeployDate(org.apache.xmlbeans.XmlDateTime deployDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DEPLOYDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DEPLOYDATE$4);
            }
            target.set(deployDate);
        }
    }
    
    /**
     * Gets the "deployer" element
     */
    public java.lang.String getDeployer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deployer" element
     */
    public org.apache.xmlbeans.XmlString xgetDeployer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPLOYER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "deployer" element
     */
    public void setDeployer(java.lang.String deployer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPLOYER$6);
            }
            target.setStringValue(deployer);
        }
    }
    
    /**
     * Sets (as xml) the "deployer" element
     */
    public void xsetDeployer(org.apache.xmlbeans.XmlString deployer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPLOYER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPLOYER$6);
            }
            target.set(deployer);
        }
    }
}
