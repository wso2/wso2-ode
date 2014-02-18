/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ode.bpel.runtime.extension;

import org.apache.ode.bpel.common.FaultException;
import org.apache.ode.bpel.evar.ExternalVariableModuleException;
import org.apache.ode.bpel.o.OScope;
import org.apache.ode.bpel.o.OProcess;
import org.apache.ode.bpel.o.OActivity;
import org.apache.ode.bpel.o.OPartnerLink;
import org.apache.ode.bpel.runtime.PartnerLinkInstance;
import org.apache.ode.bpel.runtime.BpelRuntimeContext;
import org.apache.ode.bpel.runtime.channels.TerminationChannel;
import org.apache.ode.bpel.runtime.channels.ParentScopeChannel;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.net.URI;
import java.util.Map;
import java.io.Serializable;

/**
 * Context for executing extension activities or extension assign operations.
 * Implementations of the {@link org.apache.ode.bpel.extension.ExtensionOperation} class
 * use this interface to access BPEL variables, property sets and link status.
 *
 * All <code>ExtensionOperation</code> implementations must complete with
 * <code>complete()</code>, <code>completeWithFault(...)</code>.
 *
 * @author Tammo van Lessen (University of Stuttgart)
 */
public interface ExtensionContext extends Serializable {

	/**
	 * Returns a list of variables visible in the current scope.
	 *
	 * @return an unmodifiable list of visible variables.
	 * @throws org.apache.ode.bpel.common.FaultException FaultException
	 */
	Map<String, OScope.Variable> getVisibleVariables() throws FaultException;

	/**
	 * Returns whether a variable is visible in the current scope or not.
	 *
	 * @param variableName name of the variable.
	 * @return true if the variable is visible.
	 */
	boolean isVariableVisible(String variableName);

	/**
     * Read the value of a BPEL variable.
     *
     * @param variable
     *          variable to read
     * @return the value of the variable, wrapped in a <code>Node</code>
     * @throws org.apache.ode.bpel.common.FaultException FaultException
     */
    Node readVariable(OScope.Variable variable) throws FaultException;

	/**
     * Read the value of a BPEL variable.
     *
     * @param variableName
     *          variable to read
     * @return the value of the variable, wrapped in a <code>Node</code>
     * @throws org.apache.ode.bpel.common.FaultException FaultException
     */
    Node readVariable(String variableName) throws FaultException;

    /**
     * Write the value into a BPEL variable.
     *
     * @param variable
     *          variable to write
     * @param value
     *          the value to be stored into the variable
     * @throws org.apache.ode.bpel.common.FaultException FaultException
     * @throws org.apache.ode.bpel.evar.ExternalVariableModuleException ExternalVariableModuleException
     */
    void writeVariable(OScope.Variable variable, Node value) throws FaultException, ExternalVariableModuleException;

    /**
     * Write the value into a BPEL variable.
     *
     * @param variableName
     *          variable to write
     * @param value
     *          the value to be stored into the variable
     * @throws org.apache.ode.bpel.common.FaultException FaultException
     * @throws org.apache.ode.bpel.evar.ExternalVariableModuleException ExternalVariableModuleException
     */
    void writeVariable(String variableName, Node value) throws FaultException;

    /**
     * Read the value of a BPEL property.
     *
     * @param variable
     *          variable containing property
     * @param property
     *          property to read
     * @return value of the property
     * @throws org.apache.ode.bpel.common.FaultException FaultException
     */
    String readMessageProperty(OScope.Variable variable, OProcess.OProperty property)
            throws FaultException;

    /**
     * Reads the current process instance id.
     * @return instance id
     */
    Long getProcessId();

    /**
     * Returns the name of the invoking activity.
     * @return activity name
     */
    String getActivityName();

    /**
     * Returns the location of the deployment bundle of the executed process.
     * @return URI of the deployment bundle.
     */
    URI getDUDir();

	/**
	 * Allows printing debug output to the console. Output will be redirected
	 * to the logger associated with <code>org.apache.ode.extension.Console</code>.
	 * The target log level is INFO.
     * @param msg Message
     */
    void printToConsole(String msg);

    /**
     * Marks the currently executed activity as successfully completed.
     * @param cid id
     */
    void complete(String cid);

    /**
     * Marks the currently executed activity as faulted.
     * @param cid id
     * @param t an exception to be reported as the fault cause.
     */
    void completeWithFault(String cid, Throwable t);

    /**
     * Marks the currently executed activity as faulted.
     * @param cid id
     * @param fault a fault.
     */
    void completeWithFault(String cid, FaultException fault);

    /*
     * Low-level-methods
     */

    /**
     * Returns the OActivity object.
     * @return OActivity
     */
    OActivity getOActivity();

    /**
     * Returns ODE's internal runtime instance.
     * @return OdeInternalInstance
     */
    BpelRuntimeContext getInternalInstance();

    /**
     * Get the partner link
     * @param partnerLinkName name of the partner link
     * @return PartnerLinkInstance
     * @throws FaultException FaultException
     */
    public PartnerLinkInstance getPartnerLinkInstance(String partnerLinkName) throws FaultException;

    /**
     * Check whether the partner link is visible in the current scope or not
     * @param partnerLinkName name of the partner link
     * @return true if the partner link is visible
     */
    public boolean isPartnerLinkVisible(String partnerLinkName);

    /**
     * Get the partner link
     * @param partnerLink partnerLink
     * @return PartnerLinkInstance
     * @throws FaultException FaultException
     */
    public PartnerLinkInstance getPartnerLinkInstance(OPartnerLink partnerLink) throws FaultException;

    /**
     * Get the Process Model
     * @return ProcessModel
     */
    public OProcess getProcessModel();

    /**
     * Set correlation values in order to find a route
     * This should be set in LongRunning extensions in-order to receive the response
     * @param values values
     */
    public void setCorrelationValues(String[] values);

    public String[] getCorrelationValues();

    /**
     * Set Correlator value
     * This should be set in LongRunning extensions in-order to receive the response
     * @param correlatorId partnerlink.operation
     */
    public void setCorrelatorId(String correlatorId);

    public String getCorrelatorId();

    public Node getPartData(Element element, String variable);

    public TerminationChannel getTerminationChannel();

    public ParentScopeChannel getParentScopeChannel();
}