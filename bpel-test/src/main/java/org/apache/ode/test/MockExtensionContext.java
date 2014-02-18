package org.apache.ode.test;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.apache.ode.bpel.common.FaultException;
import org.apache.ode.bpel.runtime.extension.ExtensionContext;
import org.apache.ode.bpel.runtime.PartnerLinkInstance;
import org.apache.ode.bpel.runtime.BpelRuntimeContext;
import org.apache.ode.bpel.runtime.channels.TerminationChannel;
import org.apache.ode.bpel.runtime.channels.ParentScopeChannel;
import org.apache.ode.bpel.o.*;
import org.apache.ode.utils.DOMUtils;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.net.URI;

/**
 * Very simple mock implementation of the ExtensionContext interface.
 *
 * @author Tammo van Lessen (University of Stuttgart)
 */
public class MockExtensionContext implements ExtensionContext {
	private Map<String, Node> variables = new HashMap<String, Node>();
	public boolean completed;
	public boolean faulted;
	public FaultException fault;
	public URI duDir;
	public List<String> msgs = new ArrayList<String>();

	public Map<String, Node> getVariables() {
		return variables;
	}

	public Long getProcessId() {
		return 4711L;
	}

	public Node readVariable(String variableName) throws FaultException {
		System.out.println("Reading " + variableName);
		return variables.get(variableName);
	}

	public void writeVariable(String variableName, Node value)
			throws FaultException {
		variables.put(variableName, value);
		System.out.println("Storing in " + variableName + ": " + DOMUtils.domToString(value));
	}

	public boolean isVariableVisible(String varName) {
		return variables.containsKey(varName);
	}

	public String getActivityName() {
		return "mockActivity";
	}

	public OActivity getOActivity() {
		throw new UnsupportedOperationException("This method is not available in this mock implementation.");
	}

	public Map<String, OScope.Variable> getVisibleVariables()
		throws FaultException {
		throw new UnsupportedOperationException("This method is not available in this mock implementation.");
	}

	public boolean isLinkActive(OLink olink) throws FaultException {
		throw new UnsupportedOperationException("This method is not available in this mock implementation.");
	}

	public String readMessageProperty(OScope.Variable variable, OProcess.OProperty property)
		throws FaultException {
		throw new UnsupportedOperationException("This method is not available in this mock implementation.");
	}

	public Node readVariable(OScope.Variable variable) throws FaultException {
		throw new UnsupportedOperationException("This method is not available in this mock implementation.");
	}

	public void writeVariable(OScope.Variable variable, Node value) throws FaultException {
		throw new UnsupportedOperationException("This method is not available in this mock implementation.");
	}

	public void complete(String cid) {
		this.completed = true;
	}

	public void completeWithFault(String cid, Throwable t) {
		this.completed = true;
		this.faulted = true;
	}

	public void completeWithFault(String cid, FaultException fault) {
		this.completed = true;
		this.faulted = true;
		this.fault = fault;
	}

	public BpelRuntimeContext getInternalInstance() {
		throw new UnsupportedOperationException("This method is not available in this mock implementation.");
	}

    /**
     * Get the partner link
     *
     * @param partnerLinkName name of the partner link
     * @return PartnerLinkInstance
     * @throws org.apache.ode.bpel.common.FaultException
     *
     */
    public PartnerLinkInstance getPartnerLinkInstance(String partnerLinkName) throws FaultException {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    /**
     * Check whether the partner link is visible in the current scope or not
     *
     * @param partnerLinkName name of the partner link
     * @return true if the partner link is visible
     */
    public boolean isPartnerLinkVisible(String partnerLinkName) {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    /**
     * Get the partner link
     *
     * @param partnerLink
     * @return PartnerLinkInstance
     * @throws org.apache.ode.bpel.common.FaultException
     *
     */
    public PartnerLinkInstance getPartnerLinkInstance(OPartnerLink partnerLink) throws FaultException {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    /**
     * Get the Process Model
     *
     * @return ProcessModel
     */
    public OProcess getProcessModel() {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    /**
     * Set correlation values in order to find a route
     *
     * @param values values
     */
    public void setCorrelationValues(String[] values) {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    public String[] getCorrelationValues() {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    /**
     * Set Correlator value
     * This should be set in LongRunning extensions in-order to receive the response
     *
     * @param correlatorId partnerlink.operation
     */
    public void setCorrelatorId(String correlatorId) {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    public String getCorrelatorId() {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    public Node getPartData(Element element, String variable) {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    public TerminationChannel getTerminationChannel() {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    public ParentScopeChannel getParentScopeChannel() {
        throw new UnsupportedOperationException("This method is not available in this mock implementation.");
    }

    public URI getDUDir() {
		return duDir;
	}

	public void printToConsole(String msg) {
		System.out.println(msg);
		msgs.add(msg);
	}
}

