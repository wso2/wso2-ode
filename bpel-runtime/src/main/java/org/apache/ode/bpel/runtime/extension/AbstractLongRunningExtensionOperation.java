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

import org.w3c.dom.Element;
import org.apache.ode.bpel.common.FaultException;
import org.apache.ode.bpel.runtime.*;
import org.apache.ode.bpel.runtime.channels.PickResponseChannel;
import org.apache.ode.bpel.runtime.channels.PickResponseChannelListener;
import org.apache.ode.bpel.runtime.channels.TerminationChannelListener;
import org.apache.ode.bpel.extension.ExtensionOperation;
import org.apache.ode.jacob.vpu.JacobVPU;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class AbstractLongRunningExtensionOperation extends BpelJacobRunnable implements ExtensionOperation {

    private static final long serialVersionUID = -82372987878838011L;

    protected static Log _log = LogFactory.getLog(AbstractLongRunningExtensionOperation.class);
    protected ExtensionContext _extensionContext;
    protected String _cid;
    protected Element _element;

    public void setExtensionContext(ExtensionContext extensionContext) {
        this._extensionContext = extensionContext;
    }

    public void setCid(String cid) {
        this._cid = cid;
    }

    public void setElement(Element tempElement) {
        this._element = tempElement;
    }


    /**
     * Implementation of the extension.
     * i.e: Calling an external service which causes to send back a response in an indefinite time.
     * Corelation values should be set within this method.
     *
     * @param context ExtensionContext
     * @param cid     cid
     * @param element ExtensionActivity
     * @throws org.apache.ode.bpel.common.FaultException
     *          If an error occurs
     */
    public abstract void runAsync(ExtensionContext context, String cid, Element element)
            throws FaultException;

    /**
     * Extension should be registered with correlation values, notification id in order to find
     * a route for the response message
     * TODO we may remove this method by introducing another method to set correlatorID. so this
     * can be done by this class itself by calling _extensionContext.getInternalInstance().registerForExtensionNotification();
     *
     * @param notificationChannelId Channel id
     */
    public void registerForNotification(String notificationChannelId) {
        _extensionContext.getInternalInstance().registerForExtensionNotification(notificationChannelId,
                _extensionContext.getCorrelationValues(), _extensionContext.getCorrelatorId());
    }

    /**
     * Called when the response for the above service is received
     *
     * @param mexId MessageExchange id
     */
    public abstract void onRequestReceived(String mexId) throws FaultException;

    public void updateExtensionContext(BpelRuntimeContext context) {
        ((ExtensionContextImpl) _extensionContext).setBpelRuntimeContext(context);
    }

    public void run() {
        PickResponseChannel pickResponseChannel = (PickResponseChannel) JacobVPU.activeJacobThread().newChannel(PickResponseChannel.class, getClass().getSimpleName(), null);
        try {
            runAsync(_extensionContext, _cid, _element);
        } catch (FaultException fe) {
            _log.error("Error occurred in the BPEL extension activity ", fe);
            _extensionContext.completeWithFault(_cid, fe);
            return;
        }
        JacobVPU.activeJacobThread().instance(new WAITING(pickResponseChannel, _extensionContext.getCorrelationValues()));
    }

    private class WAITING extends BpelJacobRunnable {
        private static final long serialVersionUID = 211L;

        private PickResponseChannel _pickResponseChannel;
        private String[] _correlationValues;

        private AbstractLongRunningExtensionOperation _temp;

        private WAITING(PickResponseChannel pickResponseChannel, String[] correlationValues) {
            this._pickResponseChannel = pickResponseChannel;
            this._correlationValues = correlationValues;
            registerForNotification(_pickResponseChannel.export());
        }

        public void run() {
            object(false, new PickResponseChannelListener(_pickResponseChannel) {
                private static final long serialVersionUID = -8237296827418738011L;

                public void onRequestRcvd(int selectorIdx, String mexId) {
                    updateExtensionContext(getBpelRuntimeContext());
                    try {
                        onRequestReceived(mexId);
                    } catch (FaultException fe) {
                        _log.error("Error occurred in the BPEL extension activity, " +
                                "while receiving the response from the external party", fe);
                        _extensionContext.completeWithFault(_cid, fe);
                    }
                }

                public void onTimeout() {
                    //ignore
                }

                public void onCancel() {
                    _extensionContext.getParentScopeChannel().completed(null, CompensationHandler.emptySet());
                }

            }.or(new TerminationChannelListener(_extensionContext.getTerminationChannel()) {
                private static final long serialVersionUID = 4399496341785922396L;

                public void terminate() {
                    getBpelRuntimeContext().cancel(_pickResponseChannel);
                    instance(WAITING.this);
                }
            }
            )
            );
        }
    }

    /*
   This method is not invoked anymore, since we invoke jacob's run method
    */
    public void run(Object context, String cid, Element element) throws FaultException {
    }
}
