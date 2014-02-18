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

package org.apache.ode.dao.jpa;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ode.bpel.dao.AttachmentDAO;
import org.apache.ode.bpel.dao.MessageExchangeDAO;

import javax.persistence.*;

//CREATE TABLE TASK_ATTACHMENT (ATTACHMENT_ID BIGINT NOT NULL, MESSAGE_EXCHANGE_ID VARCHAR(255), PRIMARY KEY (ATTACHMENT_ID));
@Entity
@Table(name="TASK_ATTACHMENT")
public class AttachmentDAOImpl implements AttachmentDAO {
    /**
     * Class Logger
     */
    private static Log log = LogFactory.getLog(AttachmentDAOImpl.class);

    @Id
    @Column(name="ATTACHMENT_ID")
    private Long id;

    @ManyToOne @Column(name="MESSAGE_EXCHANGE_ID")
    private MessageExchangeDAOImpl mexDAO;

    public MessageExchangeDAO getMexDAO() {
        return mexDAO;
    }

    public void setMexDAO(MessageExchangeDAO mexDAO) {
        this.mexDAO = (MessageExchangeDAOImpl) mexDAO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
