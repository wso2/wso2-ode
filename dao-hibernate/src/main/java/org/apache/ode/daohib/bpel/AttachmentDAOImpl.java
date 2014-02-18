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

package org.apache.ode.daohib.bpel;

import org.apache.ode.bpel.dao.AttachmentDAO;
import org.apache.ode.bpel.dao.MessageExchangeDAO;
import org.apache.ode.daohib.SessionManager;
import org.apache.ode.daohib.bpel.hobj.HAttachment;
import org.apache.ode.daohib.bpel.hobj.HMessageExchange;
import org.apache.ode.daohib.bpel.hobj.HObject;



/**
 * H
 */
public class AttachmentDAOImpl extends  HibernateDao implements AttachmentDAO {

    HAttachment _self;


    protected AttachmentDAOImpl(SessionManager sessionManager, HAttachment hobj) {
        super(sessionManager, hobj);
        _self = hobj;
    }

    public MessageExchangeDAO getMexDAO() {
       return new MessageExchangeDaoImpl(_sm, _self.getMessageExchange());
    }

    public void setMexDAO(MessageExchangeDAO mexDAO) {
        if(mexDAO != null && _self != null) {
            _self.setMessageExchange((HMessageExchange)((MessageExchangeDaoImpl)mexDAO).getHibernateObj());
        }
    }

    public Long getId() {
        return _self.getAttachmentId();
    }

    public void setId(Long id) {
        _self.setAttachmentId(id);
    }
}
