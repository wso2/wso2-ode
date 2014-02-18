/*
 * Copyright (c) 2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ode.bpel.dao;

public interface AttachmentDAO {
    /**
     * Returns the in-cooperated message exchange DAO
     * @return in-cooperated message exchange DAO
     */
    public MessageExchangeDAO getMexDAO();

    /**
     * In-cooperating message exchange DAO
     * @param mexDAO message exchange DAO to be in-cooperated
     */
    public void setMexDAO(MessageExchangeDAO mexDAO);

    /**
     * Returns the unique id for the attachment DAO
     * @return unique id for the attachment DAO
     */
    public Long getId();

    /**
     * Set the unique attachment id
     * @param id unique attachment id
     */
    public void setId(Long id);
}
