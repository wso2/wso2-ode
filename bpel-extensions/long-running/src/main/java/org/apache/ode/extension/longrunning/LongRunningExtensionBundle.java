package org.apache.ode.extension.longrunning;

import org.apache.ode.bpel.runtime.extension.AbstractExtensionBundle;

public class LongRunningExtensionBundle extends AbstractExtensionBundle {

    public static String NS = "http://ode.apache.org/extension/longrunning";

    /**
     * Returns the extension namespace this bundle provides implementations for.
     *
     * @return String
     */
    public String getNamespaceURI() {
        return NS;  
    }

    /**
     * Register extension operations.
     */
    public void registerExtensionActivities() {
        registerExtensionOperation("longRunning", LongRunningExtensionOperation.class);
    }
}
