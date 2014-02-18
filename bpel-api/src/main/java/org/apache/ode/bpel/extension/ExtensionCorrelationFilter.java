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
package org.apache.ode.bpel.extension;

import org.w3c.dom.Element;

/**
 * Interface for the Correlation Filter
 */
public interface ExtensionCorrelationFilter {
    /**
     * Get namespace of the filter
     * @return Namespace of the filter
     */
    String getNamespaceURI();

    /**
     * Register correlation filter with a name
     * TODO this method can be removed. registering can be done externally since the class that
     * should be resistered is the class of this object (hmm this is not discriptive enough .. i know :))
     */
    void registerExtensionCorrelationFilter();

    /**
     * Get Correaltion filter instance
     * @param localName name of the filter
     * @return ExtensionCorrelationFilter
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    ExtensionCorrelationFilter getExtensionCorrelationFilterInstance(String localName)
            throws InstantiationException, IllegalAccessException;

    /**
     * Compute correlation values
     * @param body Soap body
     * @param header Soap header
     * @return Correlation values
     */
    String[] computeCorrelationValues(Element body, Element header);

    /**
     * Get the name of the filter
     * @return Name
     */
    String getName();
}
