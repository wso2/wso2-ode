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

package org.apache.ode.bpel.engine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ILock;

import java.util.concurrent.TimeUnit;

/**
 * Instance lock manager implementation with Hazelcast
 * provides lock and unlock functionality using Hazelcast distributed lock
 */
public class HazelcastInstanceLockManager extends AbstractInstanceLockManager{
    private static final Log __log = LogFactory.getLog(HazelcastInstanceLockManager.class);

    private HazelcastInstance hz;

    public HazelcastInstanceLockManager(
            HazelcastInstance hz) {
        this.hz = hz;
    }


    public void lock(Long iid, int time, TimeUnit tu) throws InterruptedException,
            AbstractInstanceLockManager.TimeoutException {
        if (iid == null) {
            if(__log.isDebugEnabled()) {
                __log.debug(" Instance Id null at lock[]");
            }
            return;
        }

        String thrd = Thread.currentThread().toString();

        if(__log.isDebugEnabled()) {
            __log.debug(thrd + ": lock(iid=" + iid + ", time=" + time + tu + ")");
        }

        ILock lock = hz.getLock(iid.toString());

        if (!lock.tryLock(time, tu)) {

            if(__log.isDebugEnabled()) {
                __log.debug(thrd + ": lock(iid=" + iid + ", " +
                        "time=" + time + tu + ")-->TIMEOUT");
            }
            throw new AbstractInstanceLockManager.TimeoutException();
        }

    }

    public void unlock(Long iid) {
        if (iid == null) {
            if(__log.isDebugEnabled()) {
                __log.debug(" unlock, instance id is null");
            }
            return;
        }

        String thrd = Thread.currentThread().toString();

        ILock lock = hz.getLock(iid.toString());
        lock.unlock();

        if(__log.isDebugEnabled()) {
            __log.debug(thrd + " unlock(iid=" + iid + ")");
        }
    }

}
