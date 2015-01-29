/*
 * XML Type:  tCleanup
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TCleanup
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tCleanup(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TCleanupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.apache.ode.bpel.dd.TCleanup
{
    
    public TCleanupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "category");
    private static final javax.xml.namespace.QName FILTER$2 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "filter");
    private static final javax.xml.namespace.QName ON$4 = 
        new javax.xml.namespace.QName("", "on");
    
    
    /**
     * Gets a List of "category" elements
     */
    public java.util.List<org.apache.ode.bpel.dd.TCleanup.Category.Enum> getCategoryList()
    {
        final class CategoryList extends java.util.AbstractList<org.apache.ode.bpel.dd.TCleanup.Category.Enum>
        {
            public org.apache.ode.bpel.dd.TCleanup.Category.Enum get(int i)
                { return TCleanupImpl.this.getCategoryArray(i); }
            
            public org.apache.ode.bpel.dd.TCleanup.Category.Enum set(int i, org.apache.ode.bpel.dd.TCleanup.Category.Enum o)
            {
                org.apache.ode.bpel.dd.TCleanup.Category.Enum old = TCleanupImpl.this.getCategoryArray(i);
                TCleanupImpl.this.setCategoryArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.dd.TCleanup.Category.Enum o)
                { TCleanupImpl.this.insertCategory(i, o); }
            
            public org.apache.ode.bpel.dd.TCleanup.Category.Enum remove(int i)
            {
                org.apache.ode.bpel.dd.TCleanup.Category.Enum old = TCleanupImpl.this.getCategoryArray(i);
                TCleanupImpl.this.removeCategory(i);
                return old;
            }
            
            public int size()
                { return TCleanupImpl.this.sizeOfCategoryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryList();
        }
    }
    
    /**
     * Gets array of all "category" elements
     */
    public org.apache.ode.bpel.dd.TCleanup.Category.Enum[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$0, targetList);
            org.apache.ode.bpel.dd.TCleanup.Category.Enum[] result = new org.apache.ode.bpel.dd.TCleanup.Category.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (org.apache.ode.bpel.dd.TCleanup.Category.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "category" element
     */
    public org.apache.ode.bpel.dd.TCleanup.Category.Enum getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.ode.bpel.dd.TCleanup.Category.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "category" elements
     */
    public java.util.List<org.apache.ode.bpel.dd.TCleanup.Category> xgetCategoryList()
    {
        final class CategoryList extends java.util.AbstractList<org.apache.ode.bpel.dd.TCleanup.Category>
        {
            public org.apache.ode.bpel.dd.TCleanup.Category get(int i)
                { return TCleanupImpl.this.xgetCategoryArray(i); }
            
            public org.apache.ode.bpel.dd.TCleanup.Category set(int i, org.apache.ode.bpel.dd.TCleanup.Category o)
            {
                org.apache.ode.bpel.dd.TCleanup.Category old = TCleanupImpl.this.xgetCategoryArray(i);
                TCleanupImpl.this.xsetCategoryArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.dd.TCleanup.Category o)
                { TCleanupImpl.this.insertNewCategory(i).set(o); }
            
            public org.apache.ode.bpel.dd.TCleanup.Category remove(int i)
            {
                org.apache.ode.bpel.dd.TCleanup.Category old = TCleanupImpl.this.xgetCategoryArray(i);
                TCleanupImpl.this.removeCategory(i);
                return old;
            }
            
            public int size()
                { return TCleanupImpl.this.sizeOfCategoryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryList();
        }
    }
    
    /**
     * Gets (as xml) array of all "category" elements
     */
    public org.apache.ode.bpel.dd.TCleanup.Category[] xgetCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$0, targetList);
            org.apache.ode.bpel.dd.TCleanup.Category[] result = new org.apache.ode.bpel.dd.TCleanup.Category[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "category" element
     */
    public org.apache.ode.bpel.dd.TCleanup.Category xgetCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TCleanup.Category target = null;
            target = (org.apache.ode.bpel.dd.TCleanup.Category)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.ode.bpel.dd.TCleanup.Category)target;
        }
    }
    
    /**
     * Returns number of "category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$0);
        }
    }
    
    /**
     * Sets array of all "category" element
     */
    public void setCategoryArray(org.apache.ode.bpel.dd.TCleanup.Category.Enum[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$0);
        }
    }
    
    /**
     * Sets ith "category" element
     */
    public void setCategoryArray(int i, org.apache.ode.bpel.dd.TCleanup.Category.Enum category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(category);
        }
    }
    
    /**
     * Sets (as xml) array of all "category" element
     */
    public void xsetCategoryArray(org.apache.ode.bpel.dd.TCleanup.Category[]categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "category" element
     */
    public void xsetCategoryArray(int i, org.apache.ode.bpel.dd.TCleanup.Category category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TCleanup.Category target = null;
            target = (org.apache.ode.bpel.dd.TCleanup.Category)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts the value as the ith "category" element
     */
    public void insertCategory(int i, org.apache.ode.bpel.dd.TCleanup.Category.Enum category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORY$0, i);
            target.setEnumValue(category);
        }
    }
    
    /**
     * Appends the value as the last "category" element
     */
    public void addCategory(org.apache.ode.bpel.dd.TCleanup.Category.Enum category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$0);
            target.setEnumValue(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    public org.apache.ode.bpel.dd.TCleanup.Category insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TCleanup.Category target = null;
            target = (org.apache.ode.bpel.dd.TCleanup.Category)get_store().insert_element_user(CATEGORY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    public org.apache.ode.bpel.dd.TCleanup.Category addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TCleanup.Category target = null;
            target = (org.apache.ode.bpel.dd.TCleanup.Category)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$0, i);
        }
    }
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<java.lang.String> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return TCleanupImpl.this.getFilterArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = TCleanupImpl.this.getFilterArray(i);
                TCleanupImpl.this.setFilterArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { TCleanupImpl.this.insertFilter(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = TCleanupImpl.this.getFilterArray(i);
                TCleanupImpl.this.removeFilter(i);
                return old;
            }
            
            public int size()
                { return TCleanupImpl.this.sizeOfFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterList();
        }
    }
    
    /**
     * Gets array of all "filter" elements
     */
    public java.lang.String[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public java.lang.String getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "filter" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFilterList()
    {
        final class FilterList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return TCleanupImpl.this.xgetFilterArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = TCleanupImpl.this.xgetFilterArray(i);
                TCleanupImpl.this.xsetFilterArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { TCleanupImpl.this.insertNewFilter(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = TCleanupImpl.this.xgetFilterArray(i);
                TCleanupImpl.this.removeFilter(i);
                return old;
            }
            
            public int size()
                { return TCleanupImpl.this.sizeOfFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterList();
        }
    }
    
    /**
     * Gets (as xml) array of all "filter" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILTER$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "filter" element
     */
    public org.apache.xmlbeans.XmlString xgetFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$2);
        }
    }
    
    /**
     * Sets array of all "filter" element
     */
    public void setFilterArray(java.lang.String[] filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$2);
        }
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, java.lang.String filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(filter);
        }
    }
    
    /**
     * Sets (as xml) array of all "filter" element
     */
    public void xsetFilterArray(org.apache.xmlbeans.XmlString[]filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$2);
        }
    }
    
    /**
     * Sets (as xml) ith "filter" element
     */
    public void xsetFilterArray(int i, org.apache.xmlbeans.XmlString filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts the value as the ith "filter" element
     */
    public void insertFilter(int i, java.lang.String filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FILTER$2, i);
            target.setStringValue(filter);
        }
    }
    
    /**
     * Appends the value as the last "filter" element
     */
    public void addFilter(java.lang.String filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTER$2);
            target.setStringValue(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public org.apache.xmlbeans.XmlString insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FILTER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public org.apache.xmlbeans.XmlString addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILTER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$2, i);
        }
    }
    
    /**
     * Gets the "on" attribute
     */
    public org.apache.ode.bpel.dd.TCleanup.On.Enum getOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$4);
            if (target == null)
            {
                return null;
            }
            return (org.apache.ode.bpel.dd.TCleanup.On.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "on" attribute
     */
    public org.apache.ode.bpel.dd.TCleanup.On xgetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TCleanup.On target = null;
            target = (org.apache.ode.bpel.dd.TCleanup.On)get_store().find_attribute_user(ON$4);
            return target;
        }
    }
    
    /**
     * True if has "on" attribute
     */
    public boolean isSetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ON$4) != null;
        }
    }
    
    /**
     * Sets the "on" attribute
     */
    public void setOn(org.apache.ode.bpel.dd.TCleanup.On.Enum on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ON$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ON$4);
            }
            target.setEnumValue(on);
        }
    }
    
    /**
     * Sets (as xml) the "on" attribute
     */
    public void xsetOn(org.apache.ode.bpel.dd.TCleanup.On on)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TCleanup.On target = null;
            target = (org.apache.ode.bpel.dd.TCleanup.On)get_store().find_attribute_user(ON$4);
            if (target == null)
            {
                target = (org.apache.ode.bpel.dd.TCleanup.On)get_store().add_attribute_user(ON$4);
            }
            target.set(on);
        }
    }
    
    /**
     * Unsets the "on" attribute
     */
    public void unsetOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ON$4);
        }
    }
    /**
     * An XML category(@http://www.apache.org/ode/schemas/dd/2007/03).
     *
     * This is an atomic type that is a restriction of org.apache.ode.bpel.dd.TCleanup$Category.
     */
    public static class CategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.ode.bpel.dd.TCleanup.Category
    {
        
        public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML on(@).
     *
     * This is an atomic type that is a restriction of org.apache.ode.bpel.dd.TCleanup$On.
     */
    public static class OnImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.ode.bpel.dd.TCleanup.On
    {
        
        public OnImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OnImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
