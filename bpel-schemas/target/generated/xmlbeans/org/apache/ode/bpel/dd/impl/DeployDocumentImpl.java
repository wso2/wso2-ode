/*
 * An XML document type.
 * Localname: deploy
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.DeployDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * A document containing one deploy(@http://www.apache.org/ode/schemas/dd/2007/03) element.
 *
 * This is a complex type.
 */
public class DeployDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.DeployDocument
{
    
    public DeployDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPLOY$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "deploy");
    
    
    /**
     * Gets the "deploy" element
     */
    public org.apache.ode.bpel.dd.TDeployment getDeploy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TDeployment target = null;
            target = (org.apache.ode.bpel.dd.TDeployment)get_store().find_element_user(DEPLOY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deploy" element
     */
    public void setDeploy(org.apache.ode.bpel.dd.TDeployment deploy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TDeployment target = null;
            target = (org.apache.ode.bpel.dd.TDeployment)get_store().find_element_user(DEPLOY$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.bpel.dd.TDeployment)get_store().add_element_user(DEPLOY$0);
            }
            target.set(deploy);
        }
    }
    
    /**
     * Appends and returns a new empty "deploy" element
     */
    public org.apache.ode.bpel.dd.TDeployment addNewDeploy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TDeployment target = null;
            target = (org.apache.ode.bpel.dd.TDeployment)get_store().add_element_user(DEPLOY$0);
            return target;
        }
    }
}
