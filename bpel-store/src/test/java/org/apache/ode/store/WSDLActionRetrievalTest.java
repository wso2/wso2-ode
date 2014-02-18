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

package org.apache.ode.store;

import junit.framework.TestCase;
import org.apache.ode.bpel.compiler.wsdl.Definition4BPEL;

import javax.wsdl.Operation;
import javax.wsdl.PortType;
import javax.xml.namespace.QName;
import java.io.File;

/**
 * Test case for WSDL action retrieval
 */
public class WSDLActionRetrievalTest extends TestCase {
    DeploymentUnitDir du;

    /**
     * Test some complicated xsd/wsdl loading.
     */
    public void setUp() throws Exception {
        File dir = new File(getClass().getResource("/wsdlActionTest/deploy.xml").toURI().getPath()).getParentFile();
        du = new DeploymentUnitDir(dir);
    }

    public void testWSDLAction() {
        String action = null;
        DocumentRegistry dr = du.getDocRegistry();
        Definition4BPEL helloService = dr.getDefinition(
                new QName("http://ode/bpel/unit-test.wsdl", "HelloService"));
        PortType helloPortType = helloService.getDefinition().getPortType(
                new QName("http://ode/bpel/unit-test.wsdl", "HelloPortType"));
        Operation hello = helloPortType.getOperation("hello", null, null);
        Object actionQName = hello.getInput().getExtensionAttribute(new
                QName("http://www.w3.org/2006/05/addressing/wsdl", "Action"));
        if (actionQName != null && actionQName instanceof String) {
            action = ((String) actionQName);
        }

        assertEquals("http://ode/bpel/unit-test.wsdl/HelloPortType/hello/TestIn", action);
    }

}
