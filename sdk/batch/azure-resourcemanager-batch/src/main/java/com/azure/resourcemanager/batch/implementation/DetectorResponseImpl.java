// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.resourcemanager.batch.fluent.models.DetectorResponseInner;
import com.azure.resourcemanager.batch.models.DetectorResponse;
import java.util.Collections;
import java.util.Map;

public final class DetectorResponseImpl implements DetectorResponse {
    private DetectorResponseInner innerObject;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    DetectorResponseImpl(DetectorResponseInner innerObject,
        com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String value() {
        return this.innerModel().value();
    }

    public DetectorResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }
}
