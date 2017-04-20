/*
 * XML Type:  tEventInfo
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.TEventInfo
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML tEventInfo(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class TEventInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.TEventInfo
{
    
    public TEventInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "type");
    private static final javax.xml.namespace.QName LINENUMBER$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "line-number");
    private static final javax.xml.namespace.QName TIMESTAMP$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "timestamp");
    private static final javax.xml.namespace.QName PROCESSID$8 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-id");
    private static final javax.xml.namespace.QName PROCESSTYPE$10 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "process-type");
    private static final javax.xml.namespace.QName INSTANCEID$12 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "instance-id");
    private static final javax.xml.namespace.QName SCOPEID$14 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "scope-id");
    private static final javax.xml.namespace.QName PARENTSCOPEID$16 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "parent-scope-id");
    private static final javax.xml.namespace.QName SCOPENAME$18 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "scope-name");
    private static final javax.xml.namespace.QName SCOPEDEFINITIONID$20 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "scope-definition-id");
    private static final javax.xml.namespace.QName ACTIVITYID$22 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-id");
    private static final javax.xml.namespace.QName ACTIVITYNAME$24 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-name");
    private static final javax.xml.namespace.QName ACTIVITYTYPE$26 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-type");
    private static final javax.xml.namespace.QName ACTIVITYDEFINITIONID$28 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-definition-id");
    private static final javax.xml.namespace.QName ACTIVITYFAILUREREASON$30 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-failure-reason");
    private static final javax.xml.namespace.QName ACTIVITYRECOVERYACTION$32 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "activity-recovery-action");
    private static final javax.xml.namespace.QName VARIABLENAME$34 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "variable-name");
    private static final javax.xml.namespace.QName NEWVALUE$36 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "new-value");
    private static final javax.xml.namespace.QName PORTTYPE$38 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "port-type");
    private static final javax.xml.namespace.QName OPERATION$40 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "operation");
    private static final javax.xml.namespace.QName CORRELATIONSET$42 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "correlation-set");
    private static final javax.xml.namespace.QName MEXID$44 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "mex-id");
    private static final javax.xml.namespace.QName CORRELATIONKEY$46 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "correlation-key");
    private static final javax.xml.namespace.QName EXPRESSION$48 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "expression");
    private static final javax.xml.namespace.QName FAULT$50 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "fault");
    private static final javax.xml.namespace.QName FAULTLINENUMBER$52 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "fault-line-number");
    private static final javax.xml.namespace.QName EXPLANATION$54 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "explanation");
    private static final javax.xml.namespace.QName RESULT$56 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "result");
    private static final javax.xml.namespace.QName ROOTSCOPEID$58 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "root-scope-id");
    private static final javax.xml.namespace.QName ROOTSCOPEDECLARATIONID$60 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "root-scope-declaration-id");
    private static final javax.xml.namespace.QName PARTNERLINKNAME$62 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "partner-link-name");
    private static final javax.xml.namespace.QName OLDSTATE$64 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "old-state");
    private static final javax.xml.namespace.QName NEWSTATE$66 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "new-state");
    private static final javax.xml.namespace.QName SUCCESS$68 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "success");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
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
     * Gets the "timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "timestamp" element
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$6);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "timestamp" element
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$6);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Gets the "process-id" element
     */
    public javax.xml.namespace.QName getProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "process-id" element
     */
    public org.apache.xmlbeans.XmlQName xgetProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "process-id" element
     */
    public boolean isSetProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSID$8) != 0;
        }
    }
    
    /**
     * Sets the "process-id" element
     */
    public void setProcessId(javax.xml.namespace.QName processId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSID$8);
            }
            target.setQNameValue(processId);
        }
    }
    
    /**
     * Sets (as xml) the "process-id" element
     */
    public void xsetProcessId(org.apache.xmlbeans.XmlQName processId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(PROCESSID$8);
            }
            target.set(processId);
        }
    }
    
    /**
     * Unsets the "process-id" element
     */
    public void unsetProcessId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSID$8, 0);
        }
    }
    
    /**
     * Gets the "process-type" element
     */
    public javax.xml.namespace.QName getProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "process-type" element
     */
    public org.apache.xmlbeans.XmlQName xgetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSTYPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "process-type" element
     */
    public boolean isSetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "process-type" element
     */
    public void setProcessType(javax.xml.namespace.QName processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSTYPE$10);
            }
            target.setQNameValue(processType);
        }
    }
    
    /**
     * Sets (as xml) the "process-type" element
     */
    public void xsetProcessType(org.apache.xmlbeans.XmlQName processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(PROCESSTYPE$10);
            }
            target.set(processType);
        }
    }
    
    /**
     * Unsets the "process-type" element
     */
    public void unsetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSTYPE$10, 0);
        }
    }
    
    /**
     * Gets the "instance-id" element
     */
    public long getInstanceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANCEID$12, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "instance-id" element
     */
    public org.apache.xmlbeans.XmlLong xgetInstanceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INSTANCEID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "instance-id" element
     */
    public boolean isSetInstanceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANCEID$12) != 0;
        }
    }
    
    /**
     * Sets the "instance-id" element
     */
    public void setInstanceId(long instanceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTANCEID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTANCEID$12);
            }
            target.setLongValue(instanceId);
        }
    }
    
    /**
     * Sets (as xml) the "instance-id" element
     */
    public void xsetInstanceId(org.apache.xmlbeans.XmlLong instanceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(INSTANCEID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(INSTANCEID$12);
            }
            target.set(instanceId);
        }
    }
    
    /**
     * Unsets the "instance-id" element
     */
    public void unsetInstanceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANCEID$12, 0);
        }
    }
    
    /**
     * Gets the "scope-id" element
     */
    public long getScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPEID$14, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope-id" element
     */
    public org.apache.xmlbeans.XmlLong xgetScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SCOPEID$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "scope-id" element
     */
    public boolean isSetScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPEID$14) != 0;
        }
    }
    
    /**
     * Sets the "scope-id" element
     */
    public void setScopeId(long scopeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPEID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPEID$14);
            }
            target.setLongValue(scopeId);
        }
    }
    
    /**
     * Sets (as xml) the "scope-id" element
     */
    public void xsetScopeId(org.apache.xmlbeans.XmlLong scopeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SCOPEID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SCOPEID$14);
            }
            target.set(scopeId);
        }
    }
    
    /**
     * Unsets the "scope-id" element
     */
    public void unsetScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPEID$14, 0);
        }
    }
    
    /**
     * Gets the "parent-scope-id" element
     */
    public long getParentScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTSCOPEID$16, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "parent-scope-id" element
     */
    public org.apache.xmlbeans.XmlLong xgetParentScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PARENTSCOPEID$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "parent-scope-id" element
     */
    public boolean isSetParentScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTSCOPEID$16) != 0;
        }
    }
    
    /**
     * Sets the "parent-scope-id" element
     */
    public void setParentScopeId(long parentScopeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTSCOPEID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTSCOPEID$16);
            }
            target.setLongValue(parentScopeId);
        }
    }
    
    /**
     * Sets (as xml) the "parent-scope-id" element
     */
    public void xsetParentScopeId(org.apache.xmlbeans.XmlLong parentScopeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PARENTSCOPEID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PARENTSCOPEID$16);
            }
            target.set(parentScopeId);
        }
    }
    
    /**
     * Unsets the "parent-scope-id" element
     */
    public void unsetParentScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTSCOPEID$16, 0);
        }
    }
    
    /**
     * Gets the "scope-name" element
     */
    public java.lang.String getScopeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPENAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope-name" element
     */
    public org.apache.xmlbeans.XmlString xgetScopeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPENAME$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "scope-name" element
     */
    public boolean isSetScopeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPENAME$18) != 0;
        }
    }
    
    /**
     * Sets the "scope-name" element
     */
    public void setScopeName(java.lang.String scopeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPENAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPENAME$18);
            }
            target.setStringValue(scopeName);
        }
    }
    
    /**
     * Sets (as xml) the "scope-name" element
     */
    public void xsetScopeName(org.apache.xmlbeans.XmlString scopeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPENAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPENAME$18);
            }
            target.set(scopeName);
        }
    }
    
    /**
     * Unsets the "scope-name" element
     */
    public void unsetScopeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPENAME$18, 0);
        }
    }
    
    /**
     * Gets the "scope-definition-id" element
     */
    public int getScopeDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPEDEFINITIONID$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope-definition-id" element
     */
    public org.apache.xmlbeans.XmlInt xgetScopeDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCOPEDEFINITIONID$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "scope-definition-id" element
     */
    public boolean isSetScopeDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPEDEFINITIONID$20) != 0;
        }
    }
    
    /**
     * Sets the "scope-definition-id" element
     */
    public void setScopeDefinitionId(int scopeDefinitionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPEDEFINITIONID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPEDEFINITIONID$20);
            }
            target.setIntValue(scopeDefinitionId);
        }
    }
    
    /**
     * Sets (as xml) the "scope-definition-id" element
     */
    public void xsetScopeDefinitionId(org.apache.xmlbeans.XmlInt scopeDefinitionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCOPEDEFINITIONID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SCOPEDEFINITIONID$20);
            }
            target.set(scopeDefinitionId);
        }
    }
    
    /**
     * Unsets the "scope-definition-id" element
     */
    public void unsetScopeDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPEDEFINITIONID$20, 0);
        }
    }
    
    /**
     * Gets the "activity-id" element
     */
    public long getActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$22, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "activity-id" element
     */
    public org.apache.xmlbeans.XmlLong xgetActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACTIVITYID$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "activity-id" element
     */
    public boolean isSetActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYID$22) != 0;
        }
    }
    
    /**
     * Sets the "activity-id" element
     */
    public void setActivityId(long activityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$22);
            }
            target.setLongValue(activityId);
        }
    }
    
    /**
     * Sets (as xml) the "activity-id" element
     */
    public void xsetActivityId(org.apache.xmlbeans.XmlLong activityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACTIVITYID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ACTIVITYID$22);
            }
            target.set(activityId);
        }
    }
    
    /**
     * Unsets the "activity-id" element
     */
    public void unsetActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYID$22, 0);
        }
    }
    
    /**
     * Gets the "activity-name" element
     */
    public java.lang.String getActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYNAME$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activity-name" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYNAME$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "activity-name" element
     */
    public boolean isSetActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYNAME$24) != 0;
        }
    }
    
    /**
     * Sets the "activity-name" element
     */
    public void setActivityName(java.lang.String activityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYNAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYNAME$24);
            }
            target.setStringValue(activityName);
        }
    }
    
    /**
     * Sets (as xml) the "activity-name" element
     */
    public void xsetActivityName(org.apache.xmlbeans.XmlString activityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYNAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYNAME$24);
            }
            target.set(activityName);
        }
    }
    
    /**
     * Unsets the "activity-name" element
     */
    public void unsetActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYNAME$24, 0);
        }
    }
    
    /**
     * Gets the "activity-type" element
     */
    public java.lang.String getActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTYPE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activity-type" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYTYPE$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "activity-type" element
     */
    public boolean isSetActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYTYPE$26) != 0;
        }
    }
    
    /**
     * Sets the "activity-type" element
     */
    public void setActivityType(java.lang.String activityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYTYPE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYTYPE$26);
            }
            target.setStringValue(activityType);
        }
    }
    
    /**
     * Sets (as xml) the "activity-type" element
     */
    public void xsetActivityType(org.apache.xmlbeans.XmlString activityType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYTYPE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYTYPE$26);
            }
            target.set(activityType);
        }
    }
    
    /**
     * Unsets the "activity-type" element
     */
    public void unsetActivityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYTYPE$26, 0);
        }
    }
    
    /**
     * Gets the "activity-definition-id" element
     */
    public int getActivityDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYDEFINITIONID$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "activity-definition-id" element
     */
    public org.apache.xmlbeans.XmlInt xgetActivityDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYDEFINITIONID$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "activity-definition-id" element
     */
    public boolean isSetActivityDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYDEFINITIONID$28) != 0;
        }
    }
    
    /**
     * Sets the "activity-definition-id" element
     */
    public void setActivityDefinitionId(int activityDefinitionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYDEFINITIONID$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYDEFINITIONID$28);
            }
            target.setIntValue(activityDefinitionId);
        }
    }
    
    /**
     * Sets (as xml) the "activity-definition-id" element
     */
    public void xsetActivityDefinitionId(org.apache.xmlbeans.XmlInt activityDefinitionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACTIVITYDEFINITIONID$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACTIVITYDEFINITIONID$28);
            }
            target.set(activityDefinitionId);
        }
    }
    
    /**
     * Unsets the "activity-definition-id" element
     */
    public void unsetActivityDefinitionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYDEFINITIONID$28, 0);
        }
    }
    
    /**
     * Gets the "activity-failure-reason" element
     */
    public java.lang.String getActivityFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYFAILUREREASON$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activity-failure-reason" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYFAILUREREASON$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "activity-failure-reason" element
     */
    public boolean isSetActivityFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYFAILUREREASON$30) != 0;
        }
    }
    
    /**
     * Sets the "activity-failure-reason" element
     */
    public void setActivityFailureReason(java.lang.String activityFailureReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYFAILUREREASON$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYFAILUREREASON$30);
            }
            target.setStringValue(activityFailureReason);
        }
    }
    
    /**
     * Sets (as xml) the "activity-failure-reason" element
     */
    public void xsetActivityFailureReason(org.apache.xmlbeans.XmlString activityFailureReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYFAILUREREASON$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYFAILUREREASON$30);
            }
            target.set(activityFailureReason);
        }
    }
    
    /**
     * Unsets the "activity-failure-reason" element
     */
    public void unsetActivityFailureReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYFAILUREREASON$30, 0);
        }
    }
    
    /**
     * Gets the "activity-recovery-action" element
     */
    public java.lang.String getActivityRecoveryAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYRECOVERYACTION$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activity-recovery-action" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityRecoveryAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYRECOVERYACTION$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "activity-recovery-action" element
     */
    public boolean isSetActivityRecoveryAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYRECOVERYACTION$32) != 0;
        }
    }
    
    /**
     * Sets the "activity-recovery-action" element
     */
    public void setActivityRecoveryAction(java.lang.String activityRecoveryAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYRECOVERYACTION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYRECOVERYACTION$32);
            }
            target.setStringValue(activityRecoveryAction);
        }
    }
    
    /**
     * Sets (as xml) the "activity-recovery-action" element
     */
    public void xsetActivityRecoveryAction(org.apache.xmlbeans.XmlString activityRecoveryAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYRECOVERYACTION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYRECOVERYACTION$32);
            }
            target.set(activityRecoveryAction);
        }
    }
    
    /**
     * Unsets the "activity-recovery-action" element
     */
    public void unsetActivityRecoveryAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYRECOVERYACTION$32, 0);
        }
    }
    
    /**
     * Gets the "variable-name" element
     */
    public java.lang.String getVariableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIABLENAME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "variable-name" element
     */
    public org.apache.xmlbeans.XmlString xgetVariableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIABLENAME$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "variable-name" element
     */
    public boolean isSetVariableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIABLENAME$34) != 0;
        }
    }
    
    /**
     * Sets the "variable-name" element
     */
    public void setVariableName(java.lang.String variableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIABLENAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIABLENAME$34);
            }
            target.setStringValue(variableName);
        }
    }
    
    /**
     * Sets (as xml) the "variable-name" element
     */
    public void xsetVariableName(org.apache.xmlbeans.XmlString variableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VARIABLENAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VARIABLENAME$34);
            }
            target.set(variableName);
        }
    }
    
    /**
     * Unsets the "variable-name" element
     */
    public void unsetVariableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIABLENAME$34, 0);
        }
    }
    
    /**
     * Gets the "new-value" element
     */
    public java.lang.String getNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWVALUE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "new-value" element
     */
    public org.apache.xmlbeans.XmlString xgetNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWVALUE$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "new-value" element
     */
    public boolean isSetNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWVALUE$36) != 0;
        }
    }
    
    /**
     * Sets the "new-value" element
     */
    public void setNewValue(java.lang.String newValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWVALUE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWVALUE$36);
            }
            target.setStringValue(newValue);
        }
    }
    
    /**
     * Sets (as xml) the "new-value" element
     */
    public void xsetNewValue(org.apache.xmlbeans.XmlString newValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWVALUE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWVALUE$36);
            }
            target.set(newValue);
        }
    }
    
    /**
     * Unsets the "new-value" element
     */
    public void unsetNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWVALUE$36, 0);
        }
    }
    
    /**
     * Gets the "port-type" element
     */
    public javax.xml.namespace.QName getPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTTYPE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "port-type" element
     */
    public org.apache.xmlbeans.XmlQName xgetPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PORTTYPE$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "port-type" element
     */
    public boolean isSetPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTTYPE$38) != 0;
        }
    }
    
    /**
     * Sets the "port-type" element
     */
    public void setPortType(javax.xml.namespace.QName portType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTTYPE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PORTTYPE$38);
            }
            target.setQNameValue(portType);
        }
    }
    
    /**
     * Sets (as xml) the "port-type" element
     */
    public void xsetPortType(org.apache.xmlbeans.XmlQName portType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PORTTYPE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(PORTTYPE$38);
            }
            target.set(portType);
        }
    }
    
    /**
     * Unsets the "port-type" element
     */
    public void unsetPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTTYPE$38, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$40, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "operation" element
     */
    public boolean isSetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$40) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$40);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATION$40);
            }
            target.set(operation);
        }
    }
    
    /**
     * Unsets the "operation" element
     */
    public void unsetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$40, 0);
        }
    }
    
    /**
     * Gets the "correlation-set" element
     */
    public java.lang.String getCorrelationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONSET$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlation-set" element
     */
    public org.apache.xmlbeans.XmlString xgetCorrelationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONSET$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "correlation-set" element
     */
    public boolean isSetCorrelationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONSET$42) != 0;
        }
    }
    
    /**
     * Sets the "correlation-set" element
     */
    public void setCorrelationSet(java.lang.String correlationSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONSET$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIONSET$42);
            }
            target.setStringValue(correlationSet);
        }
    }
    
    /**
     * Sets (as xml) the "correlation-set" element
     */
    public void xsetCorrelationSet(org.apache.xmlbeans.XmlString correlationSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONSET$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRELATIONSET$42);
            }
            target.set(correlationSet);
        }
    }
    
    /**
     * Unsets the "correlation-set" element
     */
    public void unsetCorrelationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONSET$42, 0);
        }
    }
    
    /**
     * Gets the "mex-id" element
     */
    public java.lang.String getMexId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEXID$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mex-id" element
     */
    public org.apache.xmlbeans.XmlString xgetMexId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEXID$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "mex-id" element
     */
    public boolean isSetMexId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEXID$44) != 0;
        }
    }
    
    /**
     * Sets the "mex-id" element
     */
    public void setMexId(java.lang.String mexId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEXID$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEXID$44);
            }
            target.setStringValue(mexId);
        }
    }
    
    /**
     * Sets (as xml) the "mex-id" element
     */
    public void xsetMexId(org.apache.xmlbeans.XmlString mexId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEXID$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEXID$44);
            }
            target.set(mexId);
        }
    }
    
    /**
     * Unsets the "mex-id" element
     */
    public void unsetMexId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEXID$44, 0);
        }
    }
    
    /**
     * Gets the "correlation-key" element
     */
    public java.lang.String getCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONKEY$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlation-key" element
     */
    public org.apache.xmlbeans.XmlString xgetCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONKEY$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "correlation-key" element
     */
    public boolean isSetCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONKEY$46) != 0;
        }
    }
    
    /**
     * Sets the "correlation-key" element
     */
    public void setCorrelationKey(java.lang.String correlationKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONKEY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIONKEY$46);
            }
            target.setStringValue(correlationKey);
        }
    }
    
    /**
     * Sets (as xml) the "correlation-key" element
     */
    public void xsetCorrelationKey(org.apache.xmlbeans.XmlString correlationKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONKEY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRELATIONKEY$46);
            }
            target.set(correlationKey);
        }
    }
    
    /**
     * Unsets the "correlation-key" element
     */
    public void unsetCorrelationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONKEY$46, 0);
        }
    }
    
    /**
     * Gets the "expression" element
     */
    public java.lang.String getExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSION$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expression" element
     */
    public org.apache.xmlbeans.XmlString xgetExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSION$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "expression" element
     */
    public boolean isSetExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPRESSION$48) != 0;
        }
    }
    
    /**
     * Sets the "expression" element
     */
    public void setExpression(java.lang.String expression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPRESSION$48);
            }
            target.setStringValue(expression);
        }
    }
    
    /**
     * Sets (as xml) the "expression" element
     */
    public void xsetExpression(org.apache.xmlbeans.XmlString expression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSION$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPRESSION$48);
            }
            target.set(expression);
        }
    }
    
    /**
     * Unsets the "expression" element
     */
    public void unsetExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPRESSION$48, 0);
        }
    }
    
    /**
     * Gets the "fault" element
     */
    public javax.xml.namespace.QName getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULT$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "fault" element
     */
    public org.apache.xmlbeans.XmlQName xgetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(FAULT$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "fault" element
     */
    public boolean isSetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULT$50) != 0;
        }
    }
    
    /**
     * Sets the "fault" element
     */
    public void setFault(javax.xml.namespace.QName fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULT$50);
            }
            target.setQNameValue(fault);
        }
    }
    
    /**
     * Sets (as xml) the "fault" element
     */
    public void xsetFault(org.apache.xmlbeans.XmlQName fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(FAULT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(FAULT$50);
            }
            target.set(fault);
        }
    }
    
    /**
     * Unsets the "fault" element
     */
    public void unsetFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULT$50, 0);
        }
    }
    
    /**
     * Gets the "fault-line-number" element
     */
    public int getFaultLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTLINENUMBER$52, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "fault-line-number" element
     */
    public org.apache.xmlbeans.XmlInt xgetFaultLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FAULTLINENUMBER$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "fault-line-number" element
     */
    public boolean isSetFaultLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAULTLINENUMBER$52) != 0;
        }
    }
    
    /**
     * Sets the "fault-line-number" element
     */
    public void setFaultLineNumber(int faultLineNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAULTLINENUMBER$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAULTLINENUMBER$52);
            }
            target.setIntValue(faultLineNumber);
        }
    }
    
    /**
     * Sets (as xml) the "fault-line-number" element
     */
    public void xsetFaultLineNumber(org.apache.xmlbeans.XmlInt faultLineNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FAULTLINENUMBER$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FAULTLINENUMBER$52);
            }
            target.set(faultLineNumber);
        }
    }
    
    /**
     * Unsets the "fault-line-number" element
     */
    public void unsetFaultLineNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAULTLINENUMBER$52, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$54, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "explanation" element
     */
    public boolean isSetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPLANATION$54) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLANATION$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPLANATION$54);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLANATION$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPLANATION$54);
            }
            target.set(explanation);
        }
    }
    
    /**
     * Unsets the "explanation" element
     */
    public void unsetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPLANATION$54, 0);
        }
    }
    
    /**
     * Gets the "result" element
     */
    public java.lang.String getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$56, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "result" element
     */
    public org.apache.xmlbeans.XmlString xgetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESULT$56, 0);
            return target;
        }
    }
    
    /**
     * True if has "result" element
     */
    public boolean isSetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$56) != 0;
        }
    }
    
    /**
     * Sets the "result" element
     */
    public void setResult(java.lang.String result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$56);
            }
            target.setStringValue(result);
        }
    }
    
    /**
     * Sets (as xml) the "result" element
     */
    public void xsetResult(org.apache.xmlbeans.XmlString result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESULT$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESULT$56);
            }
            target.set(result);
        }
    }
    
    /**
     * Unsets the "result" element
     */
    public void unsetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$56, 0);
        }
    }
    
    /**
     * Gets the "root-scope-id" element
     */
    public long getRootScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOTSCOPEID$58, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "root-scope-id" element
     */
    public org.apache.xmlbeans.XmlLong xgetRootScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ROOTSCOPEID$58, 0);
            return target;
        }
    }
    
    /**
     * True if has "root-scope-id" element
     */
    public boolean isSetRootScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOTSCOPEID$58) != 0;
        }
    }
    
    /**
     * Sets the "root-scope-id" element
     */
    public void setRootScopeId(long rootScopeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOTSCOPEID$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOTSCOPEID$58);
            }
            target.setLongValue(rootScopeId);
        }
    }
    
    /**
     * Sets (as xml) the "root-scope-id" element
     */
    public void xsetRootScopeId(org.apache.xmlbeans.XmlLong rootScopeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ROOTSCOPEID$58, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ROOTSCOPEID$58);
            }
            target.set(rootScopeId);
        }
    }
    
    /**
     * Unsets the "root-scope-id" element
     */
    public void unsetRootScopeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOTSCOPEID$58, 0);
        }
    }
    
    /**
     * Gets the "root-scope-declaration-id" element
     */
    public int getRootScopeDeclarationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOTSCOPEDECLARATIONID$60, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "root-scope-declaration-id" element
     */
    public org.apache.xmlbeans.XmlInt xgetRootScopeDeclarationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROOTSCOPEDECLARATIONID$60, 0);
            return target;
        }
    }
    
    /**
     * True if has "root-scope-declaration-id" element
     */
    public boolean isSetRootScopeDeclarationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOTSCOPEDECLARATIONID$60) != 0;
        }
    }
    
    /**
     * Sets the "root-scope-declaration-id" element
     */
    public void setRootScopeDeclarationId(int rootScopeDeclarationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROOTSCOPEDECLARATIONID$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROOTSCOPEDECLARATIONID$60);
            }
            target.setIntValue(rootScopeDeclarationId);
        }
    }
    
    /**
     * Sets (as xml) the "root-scope-declaration-id" element
     */
    public void xsetRootScopeDeclarationId(org.apache.xmlbeans.XmlInt rootScopeDeclarationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROOTSCOPEDECLARATIONID$60, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ROOTSCOPEDECLARATIONID$60);
            }
            target.set(rootScopeDeclarationId);
        }
    }
    
    /**
     * Unsets the "root-scope-declaration-id" element
     */
    public void unsetRootScopeDeclarationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOTSCOPEDECLARATIONID$60, 0);
        }
    }
    
    /**
     * Gets the "partner-link-name" element
     */
    public java.lang.String getPartnerLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERLINKNAME$62, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "partner-link-name" element
     */
    public org.apache.xmlbeans.XmlString xgetPartnerLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERLINKNAME$62, 0);
            return target;
        }
    }
    
    /**
     * True if has "partner-link-name" element
     */
    public boolean isSetPartnerLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERLINKNAME$62) != 0;
        }
    }
    
    /**
     * Sets the "partner-link-name" element
     */
    public void setPartnerLinkName(java.lang.String partnerLinkName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERLINKNAME$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERLINKNAME$62);
            }
            target.setStringValue(partnerLinkName);
        }
    }
    
    /**
     * Sets (as xml) the "partner-link-name" element
     */
    public void xsetPartnerLinkName(org.apache.xmlbeans.XmlString partnerLinkName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERLINKNAME$62, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERLINKNAME$62);
            }
            target.set(partnerLinkName);
        }
    }
    
    /**
     * Unsets the "partner-link-name" element
     */
    public void unsetPartnerLinkName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERLINKNAME$62, 0);
        }
    }
    
    /**
     * Gets the "old-state" element
     */
    public int getOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDSTATE$64, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "old-state" element
     */
    public org.apache.xmlbeans.XmlInt xgetOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OLDSTATE$64, 0);
            return target;
        }
    }
    
    /**
     * True if has "old-state" element
     */
    public boolean isSetOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OLDSTATE$64) != 0;
        }
    }
    
    /**
     * Sets the "old-state" element
     */
    public void setOldState(int oldState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLDSTATE$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLDSTATE$64);
            }
            target.setIntValue(oldState);
        }
    }
    
    /**
     * Sets (as xml) the "old-state" element
     */
    public void xsetOldState(org.apache.xmlbeans.XmlInt oldState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OLDSTATE$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OLDSTATE$64);
            }
            target.set(oldState);
        }
    }
    
    /**
     * Unsets the "old-state" element
     */
    public void unsetOldState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OLDSTATE$64, 0);
        }
    }
    
    /**
     * Gets the "new-state" element
     */
    public int getNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWSTATE$66, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "new-state" element
     */
    public org.apache.xmlbeans.XmlInt xgetNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NEWSTATE$66, 0);
            return target;
        }
    }
    
    /**
     * True if has "new-state" element
     */
    public boolean isSetNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWSTATE$66) != 0;
        }
    }
    
    /**
     * Sets the "new-state" element
     */
    public void setNewState(int newState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWSTATE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWSTATE$66);
            }
            target.setIntValue(newState);
        }
    }
    
    /**
     * Sets (as xml) the "new-state" element
     */
    public void xsetNewState(org.apache.xmlbeans.XmlInt newState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NEWSTATE$66, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NEWSTATE$66);
            }
            target.set(newState);
        }
    }
    
    /**
     * Unsets the "new-state" element
     */
    public void unsetNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWSTATE$66, 0);
        }
    }
    
    /**
     * Gets the "success" element
     */
    public boolean getSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESS$68, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "success" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUCCESS$68, 0);
            return target;
        }
    }
    
    /**
     * True if has "success" element
     */
    public boolean isSetSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUCCESS$68) != 0;
        }
    }
    
    /**
     * Sets the "success" element
     */
    public void setSuccess(boolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESS$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUCCESS$68);
            }
            target.setBooleanValue(success);
        }
    }
    
    /**
     * Sets (as xml) the "success" element
     */
    public void xsetSuccess(org.apache.xmlbeans.XmlBoolean success)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUCCESS$68, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUCCESS$68);
            }
            target.set(success);
        }
    }
    
    /**
     * Unsets the "success" element
     */
    public void unsetSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUCCESS$68, 0);
        }
    }
}
