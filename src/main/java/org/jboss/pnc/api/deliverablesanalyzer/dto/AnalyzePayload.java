/*
 * Copyright (C) 2019 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.pnc.api.deliverablesanalyzer.dto;

import java.util.List;

import lombok.ToString;
import org.jboss.pnc.api.dto.Request;

/**
 * Request specification of the analyze endpoint
 *
 * @author Jakub Bartecek &lt;jbartece@redhat.com&gt;
 */
@ToString
public class AnalyzePayload {
    private List<String> urls;

    private String config;

    private Request callback;

    private Request heartbeat;

    public AnalyzePayload(List<String> urls, String config, Request callback, Request heartbeat) {
        this.urls = urls;
        this.config = config;
        this.callback = callback;
        this.heartbeat = heartbeat;
    }

    public List<String> getUrls() {
        return urls;
    }

    public String getConfig() {
        return config;
    }

    public Request getCallback() {
        return callback;
    }

    public Request getHeartbeat() {
        return heartbeat;
    }
}
