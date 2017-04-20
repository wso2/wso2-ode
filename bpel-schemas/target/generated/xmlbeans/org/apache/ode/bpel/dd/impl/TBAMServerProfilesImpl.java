/*
 * XML Type:  tBAMServerProfiles
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TBAMServerProfiles
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tBAMServerProfiles(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TBAMServerProfilesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TBAMServerProfiles
{
    
    public TBAMServerProfilesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROFILE$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "profile");
    
    
    /**
     * Gets a List of "profile" elements
     */
    public java.util.List<org.apache.ode.bpel.dd.TBAMServerProfiles.Profile> getProfileList()
    {
        final class ProfileList extends java.util.AbstractList<org.apache.ode.bpel.dd.TBAMServerProfiles.Profile>
        {
            public org.apache.ode.bpel.dd.TBAMServerProfiles.Profile get(int i)
                { return TBAMServerProfilesImpl.this.getProfileArray(i); }
            
            public org.apache.ode.bpel.dd.TBAMServerProfiles.Profile set(int i, org.apache.ode.bpel.dd.TBAMServerProfiles.Profile o)
            {
                org.apache.ode.bpel.dd.TBAMServerProfiles.Profile old = TBAMServerProfilesImpl.this.getProfileArray(i);
                TBAMServerProfilesImpl.this.setProfileArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.dd.TBAMServerProfiles.Profile o)
                { TBAMServerProfilesImpl.this.insertNewProfile(i).set(o); }
            
            public org.apache.ode.bpel.dd.TBAMServerProfiles.Profile remove(int i)
            {
                org.apache.ode.bpel.dd.TBAMServerProfiles.Profile old = TBAMServerProfilesImpl.this.getProfileArray(i);
                TBAMServerProfilesImpl.this.removeProfile(i);
                return old;
            }
            
            public int size()
                { return TBAMServerProfilesImpl.this.sizeOfProfileArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProfileList();
        }
    }
    
    /**
     * Gets array of all "profile" elements
     */
    public org.apache.ode.bpel.dd.TBAMServerProfiles.Profile[] getProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROFILE$0, targetList);
            org.apache.ode.bpel.dd.TBAMServerProfiles.Profile[] result = new org.apache.ode.bpel.dd.TBAMServerProfiles.Profile[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "profile" element
     */
    public org.apache.ode.bpel.dd.TBAMServerProfiles.Profile getProfileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TBAMServerProfiles.Profile target = null;
            target = (org.apache.ode.bpel.dd.TBAMServerProfiles.Profile)get_store().find_element_user(PROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "profile" element
     */
    public int sizeOfProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFILE$0);
        }
    }
    
    /**
     * Sets array of all "profile" element
     */
    public void setProfileArray(org.apache.ode.bpel.dd.TBAMServerProfiles.Profile[] profileArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(profileArray, PROFILE$0);
        }
    }
    
    /**
     * Sets ith "profile" element
     */
    public void setProfileArray(int i, org.apache.ode.bpel.dd.TBAMServerProfiles.Profile profile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TBAMServerProfiles.Profile target = null;
            target = (org.apache.ode.bpel.dd.TBAMServerProfiles.Profile)get_store().find_element_user(PROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(profile);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "profile" element
     */
    public org.apache.ode.bpel.dd.TBAMServerProfiles.Profile insertNewProfile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TBAMServerProfiles.Profile target = null;
            target = (org.apache.ode.bpel.dd.TBAMServerProfiles.Profile)get_store().insert_element_user(PROFILE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "profile" element
     */
    public org.apache.ode.bpel.dd.TBAMServerProfiles.Profile addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TBAMServerProfiles.Profile target = null;
            target = (org.apache.ode.bpel.dd.TBAMServerProfiles.Profile)get_store().add_element_user(PROFILE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "profile" element
     */
    public void removeProfile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFILE$0, i);
        }
    }
    /**
     * An XML profile(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is a complex type.
     */
    public static class ProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TBAMServerProfiles.Profile
    {
        
        public ProfileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName LOCATION$2 = 
            new javax.xml.namespace.QName("", "location");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$2);
                return target;
            }
        }
        
        /**
         * Sets the "location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$2);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$2);
                }
                target.set(location);
            }
        }
    }
}
