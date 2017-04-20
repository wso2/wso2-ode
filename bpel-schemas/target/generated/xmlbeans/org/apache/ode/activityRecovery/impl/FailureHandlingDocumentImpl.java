/*
 * An XML document type.
 * Localname: failureHandling
 * Namespace: http://ode.apache.org/activityRecovery
 * Java type: org.apache.ode.activityRecovery.FailureHandlingDocument
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.activityRecovery.impl;
/**
 * A document containing one failureHandling(@http://ode.apache.org/activityRecovery) element.
 *
 * This is a complex type.
 */
public class FailureHandlingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.activityRecovery.FailureHandlingDocument
{
    
    public FailureHandlingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAILUREHANDLING$0 = 
        new javax.xml.namespace.QName("http://ode.apache.org/activityRecovery", "failureHandling");
    
    
    /**
     * Gets the "failureHandling" element
     */
    public org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling getFailureHandling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling target = null;
            target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().find_element_user(FAILUREHANDLING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "failureHandling" element
     */
    public void setFailureHandling(org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling failureHandling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling target = null;
            target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().find_element_user(FAILUREHANDLING$0, 0);
            if (target == null)
            {
                target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().add_element_user(FAILUREHANDLING$0);
            }
            target.set(failureHandling);
        }
    }
    
    /**
     * Appends and returns a new empty "failureHandling" element
     */
    public org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling addNewFailureHandling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling target = null;
            target = (org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling)get_store().add_element_user(FAILUREHANDLING$0);
            return target;
        }
    }
    /**
     * An XML failureHandling(@http://ode.apache.org/activityRecovery).
     *
     * This is a complex type.
     */
    public static class FailureHandlingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.activityRecovery.FailureHandlingDocument.FailureHandling
    {
        
        public FailureHandlingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETRYFOR$0 = 
            new javax.xml.namespace.QName("http://ode.apache.org/activityRecovery", "retryFor");
        private static final javax.xml.namespace.QName RETRYDELAY$2 = 
            new javax.xml.namespace.QName("http://ode.apache.org/activityRecovery", "retryDelay");
        private static final javax.xml.namespace.QName FAULTONFAILURE$4 = 
            new javax.xml.namespace.QName("http://ode.apache.org/activityRecovery", "faultOnFailure");
        
        
        /**
         * Gets the "retryFor" element
         */
        public int getRetryFor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYFOR$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "retryFor" element
         */
        public org.apache.xmlbeans.XmlInt xgetRetryFor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRYFOR$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "retryFor" element
         */
        public boolean isSetRetryFor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETRYFOR$0) != 0;
            }
        }
        
        /**
         * Sets the "retryFor" element
         */
        public void setRetryFor(int retryFor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYFOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRYFOR$0);
                }
                target.setIntValue(retryFor);
            }
        }
        
        /**
         * Sets (as xml) the "retryFor" element
         */
        public void xsetRetryFor(org.apache.xmlbeans.XmlInt retryFor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRYFOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RETRYFOR$0);
                }
                target.set(retryFor);
            }
        }
        
        /**
         * Unsets the "retryFor" element
         */
        public void unsetRetryFor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETRYFOR$0, 0);
            }
        }
        
        /**
         * Gets the "retryDelay" element
         */
        public int getRetryDelay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYDELAY$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "retryDelay" element
         */
        public org.apache.xmlbeans.XmlInt xgetRetryDelay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRYDELAY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "retryDelay" element
         */
        public boolean isSetRetryDelay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETRYDELAY$2) != 0;
            }
        }
        
        /**
         * Sets the "retryDelay" element
         */
        public void setRetryDelay(int retryDelay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRYDELAY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRYDELAY$2);
                }
                target.setIntValue(retryDelay);
            }
        }
        
        /**
         * Sets (as xml) the "retryDelay" element
         */
        public void xsetRetryDelay(org.apache.xmlbeans.XmlInt retryDelay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETRYDELAY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RETRYDELAY$2);
                }
                target.set(retryDelay);
            }
        }
        
        /**
         * Unsets the "retryDelay" element
         */
        public void unsetRetryDelay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETRYDELAY$2, 0);
            }
        }
        
        /**
         * Gets the "faultOnFailure" element
         */
        public boolean getFaultOnFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTONFAILURE$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "faultOnFailure" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetFaultOnFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FAULTONFAILURE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "faultOnFailure" element
         */
        public boolean isSetFaultOnFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAULTONFAILURE$4) != 0;
            }
        }
        
        /**
         * Sets the "faultOnFailure" element
         */
        public void setFaultOnFailure(boolean faultOnFailure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTONFAILURE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTONFAILURE$4);
                }
                target.setBooleanValue(faultOnFailure);
            }
        }
        
        /**
         * Sets (as xml) the "faultOnFailure" element
         */
        public void xsetFaultOnFailure(org.apache.xmlbeans.XmlBoolean faultOnFailure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FAULTONFAILURE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FAULTONFAILURE$4);
                }
                target.set(faultOnFailure);
            }
        }
        
        /**
         * Unsets the "faultOnFailure" element
         */
        public void unsetFaultOnFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAULTONFAILURE$4, 0);
            }
        }
    }
}
