/*
 * XML Type:  tProcessEvents
 * Namespace: http://www.apache.org/ode/schemas/dd/2007/03
 * Java type: org.apache.ode.bpel.dd.TProcessEvents
 *
 * Automatically generated - do not modify.
 */
package org.apache.ode.bpel.dd.impl;
/**
 * An XML tProcessEvents(@http://www.apache.org/ode/schemas/dd/2007/03).
 *
 * This is a complex type.
 */
public class TProcessEventsImpl extends org.apache.ode.bpel.dd.impl.TEnableEventListImpl implements org.apache.ode.bpel.dd.TProcessEvents
{
    
    public TProcessEventsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPEEVENTS$0 = 
        new javax.xml.namespace.QName("http://www.apache.org/ode/schemas/dd/2007/03", "scope-events");
    private static final javax.xml.namespace.QName GENERATE$2 = 
        new javax.xml.namespace.QName("", "generate");
    
    
    /**
     * Gets a List of "scope-events" elements
     */
    public java.util.List<org.apache.ode.bpel.dd.TScopeEvents> getScopeEventsList()
    {
        final class ScopeEventsList extends java.util.AbstractList<org.apache.ode.bpel.dd.TScopeEvents>
        {
            public org.apache.ode.bpel.dd.TScopeEvents get(int i)
                { return TProcessEventsImpl.this.getScopeEventsArray(i); }
            
            public org.apache.ode.bpel.dd.TScopeEvents set(int i, org.apache.ode.bpel.dd.TScopeEvents o)
            {
                org.apache.ode.bpel.dd.TScopeEvents old = TProcessEventsImpl.this.getScopeEventsArray(i);
                TProcessEventsImpl.this.setScopeEventsArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.ode.bpel.dd.TScopeEvents o)
                { TProcessEventsImpl.this.insertNewScopeEvents(i).set(o); }
            
            public org.apache.ode.bpel.dd.TScopeEvents remove(int i)
            {
                org.apache.ode.bpel.dd.TScopeEvents old = TProcessEventsImpl.this.getScopeEventsArray(i);
                TProcessEventsImpl.this.removeScopeEvents(i);
                return old;
            }
            
            public int size()
                { return TProcessEventsImpl.this.sizeOfScopeEventsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ScopeEventsList();
        }
    }
    
    /**
     * Gets array of all "scope-events" elements
     */
    public org.apache.ode.bpel.dd.TScopeEvents[] getScopeEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOPEEVENTS$0, targetList);
            org.apache.ode.bpel.dd.TScopeEvents[] result = new org.apache.ode.bpel.dd.TScopeEvents[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scope-events" element
     */
    public org.apache.ode.bpel.dd.TScopeEvents getScopeEventsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TScopeEvents target = null;
            target = (org.apache.ode.bpel.dd.TScopeEvents)get_store().find_element_user(SCOPEEVENTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scope-events" element
     */
    public int sizeOfScopeEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPEEVENTS$0);
        }
    }
    
    /**
     * Sets array of all "scope-events" element
     */
    public void setScopeEventsArray(org.apache.ode.bpel.dd.TScopeEvents[] scopeEventsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scopeEventsArray, SCOPEEVENTS$0);
        }
    }
    
    /**
     * Sets ith "scope-events" element
     */
    public void setScopeEventsArray(int i, org.apache.ode.bpel.dd.TScopeEvents scopeEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TScopeEvents target = null;
            target = (org.apache.ode.bpel.dd.TScopeEvents)get_store().find_element_user(SCOPEEVENTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scopeEvents);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scope-events" element
     */
    public org.apache.ode.bpel.dd.TScopeEvents insertNewScopeEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TScopeEvents target = null;
            target = (org.apache.ode.bpel.dd.TScopeEvents)get_store().insert_element_user(SCOPEEVENTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scope-events" element
     */
    public org.apache.ode.bpel.dd.TScopeEvents addNewScopeEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TScopeEvents target = null;
            target = (org.apache.ode.bpel.dd.TScopeEvents)get_store().add_element_user(SCOPEEVENTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "scope-events" element
     */
    public void removeScopeEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPEEVENTS$0, i);
        }
    }
    
    /**
     * Gets the "generate" attribute
     */
    public org.apache.ode.bpel.dd.TProcessEvents.Generate.Enum getGenerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATE$2);
            if (target == null)
            {
                return null;
            }
            return (org.apache.ode.bpel.dd.TProcessEvents.Generate.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "generate" attribute
     */
    public org.apache.ode.bpel.dd.TProcessEvents.Generate xgetGenerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TProcessEvents.Generate target = null;
            target = (org.apache.ode.bpel.dd.TProcessEvents.Generate)get_store().find_attribute_user(GENERATE$2);
            return target;
        }
    }
    
    /**
     * True if has "generate" attribute
     */
    public boolean isSetGenerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GENERATE$2) != null;
        }
    }
    
    /**
     * Sets the "generate" attribute
     */
    public void setGenerate(org.apache.ode.bpel.dd.TProcessEvents.Generate.Enum generate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENERATE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENERATE$2);
            }
            target.setEnumValue(generate);
        }
    }
    
    /**
     * Sets (as xml) the "generate" attribute
     */
    public void xsetGenerate(org.apache.ode.bpel.dd.TProcessEvents.Generate generate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.ode.bpel.dd.TProcessEvents.Generate target = null;
            target = (org.apache.ode.bpel.dd.TProcessEvents.Generate)get_store().find_attribute_user(GENERATE$2);
            if (target == null)
            {
                target = (org.apache.ode.bpel.dd.TProcessEvents.Generate)get_store().add_attribute_user(GENERATE$2);
            }
            target.set(generate);
        }
    }
    
    /**
     * Unsets the "generate" attribute
     */
    public void unsetGenerate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GENERATE$2);
        }
    }
    /**
     * An XML generate(@).
     *
     * This is an atomic type that is a restriction of org.apache.ode.bpel.dd.TProcessEvents$Generate.
     */
    public static class GenerateImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.apache.ode.bpel.dd.TProcessEvents.Generate
    {
        
        public GenerateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GenerateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
