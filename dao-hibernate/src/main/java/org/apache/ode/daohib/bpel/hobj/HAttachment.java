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

package org.apache.ode.daohib.bpel.hobj;

/**
 * Row representation of a Attachment.
 * @hibernate.class table="TASK_ATTACHMENT"
 */
public class HAttachment extends HObject{

    private HMessageExchange _messageExchange;

    private Long attachmentId;

    public Long getAttachmentId() {
        return attachmentId;
    }

    /**
     *
     * @hibernate.property column="ATTACHMENT_ID" type="long"
     */
    public void setAttachmentId(Long attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * @hibernate.many-to-one
     *    column="MESSAGE_EXCHANGE_ID" foreign-key="none"
     */
    public HMessageExchange getMessageExchange() {
        return _messageExchange;
    }


    public void setMessageExchange(HMessageExchange messageExchange) {
        this._messageExchange = messageExchange;
    }
}
