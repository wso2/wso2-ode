/*
 * XML Type:  CommunicationType
 * Namespace: http://www.apache.org/ode/pmapi/types/2006/08/02/
 * Java type: org.apache.ode.bpel.pmapi.CommunicationType
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.pmapi.impl;
/**
 * An XML CommunicationType(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
 *
 * This is a complex type.
 */
public class CommunicationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.CommunicationType
{
    
    public CommunicationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "processType");
    private static final javax.xml.namespace.QName ROLLBACKONFAULT$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "rollbackOnFault");
    private static final javax.xml.namespace.QName SERVICECONFIG$4 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "serviceConfig");
    private static final javax.xml.namespace.QName EXCHANGE$6 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "exchange");
    
    
    /**
     * Gets the "processType" element
     */
    public javax.xml.namespace.QName getProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "processType" element
     */
    public org.apache.xmlbeans.XmlQName xgetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "processType" element
     */
    public void setProcessType(javax.xml.namespace.QName processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSTYPE$0);
            }
            target.setQNameValue(processType);
        }
    }
    
    /**
     * Sets (as xml) the "processType" element
     */
    public void xsetProcessType(org.apache.xmlbeans.XmlQName processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(PROCESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(PROCESSTYPE$0);
            }
            target.set(processType);
        }
    }
    
    /**
     * Gets the "rollbackOnFault" element
     */
    public boolean getRollbackOnFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLLBACKONFAULT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "rollbackOnFault" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRollbackOnFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ROLLBACKONFAULT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "rollbackOnFault" element
     */
    public boolean isSetRollbackOnFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLLBACKONFAULT$2) != 0;
        }
    }
    
    /**
     * Sets the "rollbackOnFault" element
     */
    public void setRollbackOnFault(boolean rollbackOnFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLLBACKONFAULT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLLBACKONFAULT$2);
            }
            target.setBooleanValue(rollbackOnFault);
        }
    }
    
    /**
     * Sets (as xml) the "rollbackOnFault" element
     */
    public void xsetRollbackOnFault(org.apache.xmlbeans.XmlBoolean rollbackOnFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ROLLBACKONFAULT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ROLLBACKONFAULT$2);
            }
            target.set(rollbackOnFault);
        }
    }
    
    /**
     * Unsets the "rollbackOnFault" element
     */
    public void unsetRollbackOnFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLLBACKONFAULT$2, 0);
        }
    }
    
    /**
     * Gets a List of "serviceConfig" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig> getServiceConfigList()
    {
        final class ServiceConfigList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig>
        {
            public org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig get(int i)
                { return CommunicationTypeImpl.this.getServiceConfigArray(i); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig set(int i, org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig o)
            {
                org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig old = CommunicationTypeImpl.this.getServiceConfigArray(i);
                CommunicationTypeImpl.this.setServiceConfigArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig o)
                { CommunicationTypeImpl.this.insertNewServiceConfig(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig remove(int i)
            {
                org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig old = CommunicationTypeImpl.this.getServiceConfigArray(i);
                CommunicationTypeImpl.this.removeServiceConfig(i);
                return old;
            }
            
            public int size()
                { return CommunicationTypeImpl.this.sizeOfServiceConfigArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceConfigList();
        }
    }
    
    /**
     * Gets array of all "serviceConfig" elements
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig[] getServiceConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICECONFIG$4, targetList);
            org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig[] result = new org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serviceConfig" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig getServiceConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig)get_store().find_element_user(SERVICECONFIG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serviceConfig" element
     */
    public int sizeOfServiceConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECONFIG$4);
        }
    }
    
    /**
     * Sets array of all "serviceConfig" element
     */
    public void setServiceConfigArray(org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig[] serviceConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceConfigArray, SERVICECONFIG$4);
        }
    }
    
    /**
     * Sets ith "serviceConfig" element
     */
    public void setServiceConfigArray(int i, org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig serviceConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig)get_store().find_element_user(SERVICECONFIG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceConfig" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig insertNewServiceConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig)get_store().insert_element_user(SERVICECONFIG$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceConfig" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig addNewServiceConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig)get_store().add_element_user(SERVICECONFIG$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "serviceConfig" element
     */
    public void removeServiceConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECONFIG$4, i);
        }
    }
    
    /**
     * Gets a List of "exchange" elements
     */
    public java.util.List<org.apache.ode.bpel.pmapi.CommunicationType.Exchange> getExchangeList()
    {
        final class ExchangeList extends java.util.AbstractList<org.apache.ode.bpel.pmapi.CommunicationType.Exchange>
        {
            public org.apache.ode.bpel.pmapi.CommunicationType.Exchange get(int i)
                { return CommunicationTypeImpl.this.getExchangeArray(i); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType.Exchange set(int i, org.apache.ode.bpel.pmapi.CommunicationType.Exchange o)
            {
                org.apache.ode.bpel.pmapi.CommunicationType.Exchange old = CommunicationTypeImpl.this.getExchangeArray(i);
                CommunicationTypeImpl.this.setExchangeArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.pmapi.CommunicationType.Exchange o)
                { CommunicationTypeImpl.this.insertNewExchange(i).set(o); }
            
            public org.apache.ode.bpel.pmapi.CommunicationType.Exchange remove(int i)
            {
                org.apache.ode.bpel.pmapi.CommunicationType.Exchange old = CommunicationTypeImpl.this.getExchangeArray(i);
                CommunicationTypeImpl.this.removeExchange(i);
                return old;
            }
            
            public int size()
                { return CommunicationTypeImpl.this.sizeOfExchangeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExchangeList();
        }
    }
    
    /**
     * Gets array of all "exchange" elements
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.Exchange[] getExchangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXCHANGE$6, targetList);
            org.apache.ode.bpel.pmapi.CommunicationType.Exchange[] result = new org.apache.ode.bpel.pmapi.CommunicationType.Exchange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "exchange" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.Exchange getExchangeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.Exchange target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.Exchange)get_store().find_element_user(EXCHANGE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "exchange" element
     */
    public int sizeOfExchangeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCHANGE$6);
        }
    }
    
    /**
     * Sets array of all "exchange" element
     */
    public void setExchangeArray(org.apache.ode.bpel.pmapi.CommunicationType.Exchange[] exchangeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(exchangeArray, EXCHANGE$6);
        }
    }
    
    /**
     * Sets ith "exchange" element
     */
    public void setExchangeArray(int i, org.apache.ode.bpel.pmapi.CommunicationType.Exchange exchange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.Exchange target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.Exchange)get_store().find_element_user(EXCHANGE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exchange);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exchange" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.Exchange insertNewExchange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.Exchange target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.Exchange)get_store().insert_element_user(EXCHANGE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exchange" element
     */
    public org.apache.ode.bpel.pmapi.CommunicationType.Exchange addNewExchange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.pmapi.CommunicationType.Exchange target = null;
            target = (org.apache.ode.bpel.pmapi.CommunicationType.Exchange)get_store().add_element_user(EXCHANGE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "exchange" element
     */
    public void removeExchange(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCHANGE$6, i);
        }
    }
    /**
     * An XML serviceConfig(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class ServiceConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.CommunicationType.ServiceConfig
    {
        
        public ServiceConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "service");
        private static final javax.xml.namespace.QName REPLAYTYPE$2 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "replayType");
        
        
        /**
         * Gets the "service" element
         */
        public javax.xml.namespace.QName getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "service" element
         */
        public org.apache.xmlbeans.XmlQName xgetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SERVICE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(javax.xml.namespace.QName service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$0);
                }
                target.setQNameValue(service);
            }
        }
        
        /**
         * Sets (as xml) the "service" element
         */
        public void xsetService(org.apache.xmlbeans.XmlQName service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SERVICE$0);
                }
                target.set(service);
            }
        }
        
        /**
         * Gets the "replayType" element
         */
        public org.apache.ode.bpel.pmapi.ReplayType getReplayType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.ReplayType target = null;
                target = (org.apache.ode.bpel.pmapi.ReplayType)get_store().find_element_user(REPLAYTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "replayType" element
         */
        public void setReplayType(org.apache.ode.bpel.pmapi.ReplayType replayType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.ReplayType target = null;
                target = (org.apache.ode.bpel.pmapi.ReplayType)get_store().find_element_user(REPLAYTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.pmapi.ReplayType)get_store().add_element_user(REPLAYTYPE$2);
                }
                target.set(replayType);
            }
        }
        
        /**
         * Appends and returns a new empty "replayType" element
         */
        public org.apache.ode.bpel.pmapi.ReplayType addNewReplayType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.ReplayType target = null;
                target = (org.apache.ode.bpel.pmapi.ReplayType)get_store().add_element_user(REPLAYTYPE$2);
                return target;
            }
        }
    }
    /**
     * An XML exchange(@http://www.apache.org/ode/pmapi/types/2006/08/02/).
     *
     * This is a complex type.
     */
    public static class ExchangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.pmapi.CommunicationType.Exchange
    {
        
        public ExchangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "type");
        private static final javax.xml.namespace.QName CREATETIME$2 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "createTime");
        private static final javax.xml.namespace.QName SERVICE$4 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "service");
        private static final javax.xml.namespace.QName OPERATION$6 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "operation");
        private static final javax.xml.namespace.QName IN$8 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "in");
        private static final javax.xml.namespace.QName OUT$10 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "out");
        private static final javax.xml.namespace.QName FAULT$12 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "fault");
        private static final javax.xml.namespace.QName FAILURE$14 = 
            new javax.xml.namespace.QName("http://www.apache.org/ode/pmapi/types/2006/08/02/", "failure");
        
        
        /**
         * Gets the "type" element
         */
        public org.apache.ode.bpel.pmapi.ExchangeType.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.apache.ode.bpel.pmapi.ExchangeType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public org.apache.ode.bpel.pmapi.ExchangeType xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.ExchangeType target = null;
                target = (org.apache.ode.bpel.pmapi.ExchangeType)get_store().find_element_user(TYPE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(org.apache.ode.bpel.pmapi.ExchangeType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(org.apache.ode.bpel.pmapi.ExchangeType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.ExchangeType target = null;
                target = (org.apache.ode.bpel.pmapi.ExchangeType)get_store().find_element_user(TYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.pmapi.ExchangeType)get_store().add_element_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "createTime" element
         */
        public java.util.Calendar getCreateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATETIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "createTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATETIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "createTime" element
         */
        public void setCreateTime(java.util.Calendar createTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATETIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATETIME$2);
                }
                target.setCalendarValue(createTime);
            }
        }
        
        /**
         * Sets (as xml) the "createTime" element
         */
        public void xsetCreateTime(org.apache.xmlbeans.XmlDateTime createTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATETIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATETIME$2);
                }
                target.set(createTime);
            }
        }
        
        /**
         * Gets the "service" element
         */
        public javax.xml.namespace.QName getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "service" element
         */
        public org.apache.xmlbeans.XmlQName xgetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SERVICE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(javax.xml.namespace.QName service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICE$4);
                }
                target.setQNameValue(service);
            }
        }
        
        /**
         * Sets (as xml) the "service" element
         */
        public void xsetService(org.apache.xmlbeans.XmlQName service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SERVICE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SERVICE$4);
                }
                target.set(service);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$6, 0);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATION$6);
                }
                target.set(operation);
            }
        }
        
        /**
         * Gets the "in" element
         */
        public org.apache.xmlbeans.XmlObject getIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IN$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "in" element
         */
        public void setIn(org.apache.xmlbeans.XmlObject in)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IN$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IN$8);
                }
                target.set(in);
            }
        }
        
        /**
         * Appends and returns a new empty "in" element
         */
        public org.apache.xmlbeans.XmlObject addNewIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IN$8);
                return target;
            }
        }
        
        /**
         * Gets the "out" element
         */
        public org.apache.xmlbeans.XmlObject getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OUT$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "out" element
         */
        public boolean isSetOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUT$10) != 0;
            }
        }
        
        /**
         * Sets the "out" element
         */
        public void setOut(org.apache.xmlbeans.XmlObject out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OUT$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OUT$10);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public org.apache.xmlbeans.XmlObject addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OUT$10);
                return target;
            }
        }
        
        /**
         * Unsets the "out" element
         */
        public void unsetOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUT$10, 0);
            }
        }
        
        /**
         * Gets the "fault" element
         */
        public org.apache.ode.bpel.pmapi.FaultType getFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.FaultType target = null;
                target = (org.apache.ode.bpel.pmapi.FaultType)get_store().find_element_user(FAULT$12, 0);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().count_elements(FAULT$12) != 0;
            }
        }
        
        /**
         * Sets the "fault" element
         */
        public void setFault(org.apache.ode.bpel.pmapi.FaultType fault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.FaultType target = null;
                target = (org.apache.ode.bpel.pmapi.FaultType)get_store().find_element_user(FAULT$12, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.pmapi.FaultType)get_store().add_element_user(FAULT$12);
                }
                target.set(fault);
            }
        }
        
        /**
         * Appends and returns a new empty "fault" element
         */
        public org.apache.ode.bpel.pmapi.FaultType addNewFault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.FaultType target = null;
                target = (org.apache.ode.bpel.pmapi.FaultType)get_store().add_element_user(FAULT$12);
                return target;
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
                get_store().remove_element(FAULT$12, 0);
            }
        }
        
        /**
         * Gets the "failure" element
         */
        public org.apache.ode.bpel.pmapi.FailureType getFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.FailureType target = null;
                target = (org.apache.ode.bpel.pmapi.FailureType)get_store().find_element_user(FAILURE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "failure" element
         */
        public boolean isSetFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAILURE$14) != 0;
            }
        }
        
        /**
         * Sets the "failure" element
         */
        public void setFailure(org.apache.ode.bpel.pmapi.FailureType failure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.FailureType target = null;
                target = (org.apache.ode.bpel.pmapi.FailureType)get_store().find_element_user(FAILURE$14, 0);
                if (target == null)
                {
                    target = (org.apache.ode.bpel.pmapi.FailureType)get_store().add_element_user(FAILURE$14);
                }
                target.set(failure);
            }
        }
        
        /**
         * Appends and returns a new empty "failure" element
         */
        public org.apache.ode.bpel.pmapi.FailureType addNewFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.ode.bpel.pmapi.FailureType target = null;
                target = (org.apache.ode.bpel.pmapi.FailureType)get_store().add_element_user(FAILURE$14);
                return target;
            }
        }
        
        /**
         * Unsets the "failure" element
         */
        public void unsetFailure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAILURE$14, 0);
            }
        }
    }
}
