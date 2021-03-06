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
package org.apache.ode.bpel.compiler;

import org.apache.ode.utils.msg.MessageBundle;
import org.apache.ode.utils.DOMUtils;
import org.apache.ode.utils.SerializableElement;
import org.apache.ode.bpel.compiler.bom.Activity;
import org.apache.ode.bpel.compiler.bom.ExtensionActivity;
import org.apache.ode.bpel.compiler.bom.CompositeActivity;
import org.apache.ode.bpel.compiler.api.CompilationException;
import org.apache.ode.bpel.extension.ExtensionValidator;
import org.apache.ode.bpel.o.OActivity;
import org.apache.ode.bpel.o.OExtensionActivity;
import org.w3c.dom.Element;

/**
 * Generates code for <code>&lt;extensionActivity&gt;</code> activities.
 */
public class ExtensionActivtityGenerator extends DefaultActivityGenerator {

    private static final ExtensionActivityGeneratorMessages __cmsgs =
        MessageBundle.getMessages(ExtensionActivityGeneratorMessages.class);

    public void compile(OActivity output, Activity srcx) {
        ExtensionActivity src = (ExtensionActivity) srcx;
        OExtensionActivity oactivity = (OExtensionActivity) output;
        Element child = src.getFirstExtensibilityElement();
        try {
	        if (child == null) {
	        	throw new CompilationException(__cmsgs.errMissingExtensionActivityElement());
	        }
			if (!_context.isExtensionDeclared(child.getNamespaceURI())) {
				throw new CompilationException(__cmsgs.errUndeclaredExtensionActivity().setSource(src));
			}
	        ExtensionValidator validator = _context.getExtensionValidator(DOMUtils.getElementQName(child));
	        if (validator != null) {
	        	validator.validate(_context, src);
	        }
	        oactivity.extensionName = DOMUtils.getElementQName(child);
			oactivity.nestedElement = new SerializableElement(child);
	        compileChildren(oactivity, src);

        } catch (CompilationException e) {
        	_context.recoveredFromError(src, e);
		}
    }

    public OActivity newInstance(Activity src) {
        return new OExtensionActivity(_context.getOProcess(), _context.getCurrent());
    }

    protected void compileChildren(OExtensionActivity dest, CompositeActivity src) {
        for (Activity child : src.getActivities()) {
            try {
                OActivity compiledChild = _context.compile(child);
                dest.children.add(compiledChild);
            }
            catch (CompilationException ce) {
                _context.recoveredFromError(child, ce);
            }
        }
    }
}
