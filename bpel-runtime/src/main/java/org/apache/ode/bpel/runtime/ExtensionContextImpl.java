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
package org.apache.ode.bpel.runtime;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ode.bpel.common.FaultException;
import org.apache.ode.bpel.evt.ScopeEvent;
import org.apache.ode.bpel.evt.VariableModificationEvent;
import org.apache.ode.bpel.o.*;
import org.apache.ode.bpel.runtime.channels.FaultData;
import org.apache.ode.bpel.runtime.channels.ParentScopeChannel;
import org.apache.ode.bpel.runtime.channels.TerminationChannel;
import org.apache.ode.bpel.runtime.extension.ExtensionContext;
import org.apache.ode.utils.Namespaces;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tammo van Lessen (University of Stuttgart)
 */
public class ExtensionContextImpl implements ExtensionContext {
	private static final Log __log = LogFactory.getLog(ExtensionContextImpl.class);

	private BpelRuntimeContext _context;
	private ScopeFrame _scopeFrame;
	private ActivityInfo _activityInfo;

	private boolean hasCompleted = false;

    private String[] _correlationValues;
    private String _correlatorId;

    private static final long serialVersionUID = -89894857418738011L;

    public ExtensionContextImpl(ActivityInfo activityInfo, ScopeFrame scopeFrame, BpelRuntimeContext context) {
		_activityInfo = activityInfo;
		_context = context;
		_scopeFrame = scopeFrame;
	}

    public void setBpelRuntimeContext(BpelRuntimeContext context) {
        this._context = context;
    }

	public Long getProcessId() {
		return _context.getPid();
	}

	public Map<String, OScope.Variable> getVisibleVariables() throws FaultException {
		Map<String, OScope.Variable> visVars = new HashMap<String, OScope.Variable>();

        OActivity current = _scopeFrame.oscope;
        while (current != null) {
            if (current instanceof OScope) {
                for (String varName : ((OScope)current).variables.keySet()) {
                	if (!visVars.containsKey(varName)) {
                		visVars.put(varName, ((OScope)current).variables.get(varName));
                	}
                }
            }
            current = current.getParent();
        }

		return visVars;
	}

	public String readMessageProperty(OScope.Variable variable, OProcess.OProperty property)
			throws FaultException {
		VariableInstance vi = _scopeFrame.resolve(variable);
		return _context.readProperty(vi, property);
	}

	public Node readVariable(OScope.Variable variable)
			throws FaultException {
		VariableInstance vi = _scopeFrame.resolve(variable);
		return _context.fetchVariableData(vi, _scopeFrame, true);
	}

	public void writeVariable(String variableName, Node value)
			throws FaultException {
		OScope.Variable var = getVisibleVariable(variableName);
		if (var == null) {
			throw new RuntimeException("Variable '" + variableName + "' not visible.");
		}
		writeVariable(var, value);
	}

	public Node readVariable(String variableName) throws FaultException {
		OScope.Variable var = getVisibleVariable(variableName);
		if (var == null) {
			throw new RuntimeException("Variable '" + variableName + "' not visible.");
		}

		return readVariable(var);
	}

	public void writeVariable(OScope.Variable variable, Node value)
			throws FaultException {
		VariableInstance vi = _scopeFrame.resolve(variable);
		//_context.commitChanges(vi, _scopeFrame, value);
		_context.initializeVariable(vi, _scopeFrame, value);
        VariableModificationEvent vme = new VariableModificationEvent(variable.name);
        vme.setNewValue(value);
        sendEvent(vme);
	}

	public OScope.Variable getVisibleVariable(String varName) {
    	return _scopeFrame.oscope.getVisibleVariable(varName);
    }

	public boolean isVariableVisible(String varName) {
		return _scopeFrame.oscope.getVisibleVariable(varName) != null;
	}

	public String getActivityName() {
		return _activityInfo.o.name;
	}

	public OActivity getOActivity() {
		return _activityInfo.o;
	}

	public void sendEvent(ScopeEvent event) {
        if (event.getLineNo() == -1 && _activityInfo.o.debugInfo != null) {
        	event.setLineNo(_activityInfo.o.debugInfo.startLine);
        }
        _scopeFrame.fillEventInfo(event);
        _context.sendEvent(event);
	}

	public void complete(String cid) {
		if (!hasCompleted) {
			_context.completeExtensionActivity(cid, null);
			hasCompleted = true;
		} else {
			if (__log.isWarnEnabled()) {
				__log.warn("Activity '" + _activityInfo.o.name + "' has already been completed.");
			}
		}
	}

	public void completeWithFault(String cid, Throwable t) {
		if (!hasCompleted) {
			StringWriter sw = new StringWriter();
			t.printStackTrace(new PrintWriter(sw));
			FaultData fault = new FaultData(new QName(Namespaces.WSBPEL2_0_FINAL_EXEC, "subLanguageExecutionFault"),
                    _activityInfo.o, sw.getBuffer().toString());
			_context.completeExtensionActivity(cid, fault);
			hasCompleted = true;
		} else {
			if (__log.isWarnEnabled()) {
				__log.warn("Activity '" + _activityInfo.o.name + "' has already been completed.");
			}
		}
	}

	public void completeWithFault(String cid, FaultException ex) {
		if (!hasCompleted) {
			FaultData fault = new FaultData(ex.getQName(), _activityInfo.o, ex.getMessage());
			_context.completeExtensionActivity(cid, fault);
			hasCompleted = true;
		} else {
			if (__log.isWarnEnabled()) {
				__log.warn("Activity '" + _activityInfo.o.name + "' has already been completed.");
			}
		}

	}

	public BpelRuntimeContext getInternalInstance() {
		return _context;
	}

	public URI getDUDir() {
		return _context.getBaseResourceURI();
	}

	public void printToConsole(String msg) {
		LogFactory.getLog("org.apache.ode.extension.Console").info(msg);
	}

    public PartnerLinkInstance getPartnerLinkInstance(String partnerLinkName) throws FaultException {
		OPartnerLink plink = getVisiblePartnerLink(partnerLinkName);
		if (plink == null) {
			throw new RuntimeException("PartnerLink '" + partnerLinkName + "' not visible.");
		}

		return getPartnerLinkInstance(plink);
	}

    public OPartnerLink getVisiblePartnerLink(String partnerLinkName) {
    	return _scopeFrame.oscope.getVisiblePartnerLink(partnerLinkName);
    }

	public boolean isPartnerLinkVisible(String partnerLinkName) {
		return _scopeFrame.oscope.getVisiblePartnerLink(partnerLinkName) != null;
	}

    public PartnerLinkInstance getPartnerLinkInstance(OPartnerLink partnerLink) throws FaultException {
		return _scopeFrame.resolve(partnerLink);
	}

    public OProcess getProcessModel() {
        return _context.getProcessModel();
    }

    /**
     * Set correlation values in order to find a route
     *
     * @param values values
     */
    public void setCorrelationValues(String[] values) {
        this._correlationValues = values;
    }

    public String[] getCorrelationValues() {
        return _correlationValues;
    }

    public String getCorrelatorId() {
        return _correlatorId;
    }

    public void setCorrelatorId(String correlatorId) {
        this._correlatorId = correlatorId;
    }

    public Node getPartData(Element element, String variable) {
        OScope.Variable var = getVisibleVariable(variable);
        OMessageVarType varType = null;
        if (var.type instanceof OMessageVarType) {
            varType = (OMessageVarType) var.type;
        }

        OMessageVarType.Part part = null;
        if (varType != null && varType.parts.size() > 0) {
            part = (OMessageVarType.Part) (varType.parts.values().toArray()[0]);
        }
        if (part == null) {
            return null;
        }
        return _context.getPartData(element, part);
    }

    public TerminationChannel getTerminationChannel() {
        return _activityInfo.self;
    }

    public ParentScopeChannel getParentScopeChannel() {
        return _activityInfo.parent;
    }

    public ScopeFrame getScopeFrame(){
        return _scopeFrame;
    }
}
