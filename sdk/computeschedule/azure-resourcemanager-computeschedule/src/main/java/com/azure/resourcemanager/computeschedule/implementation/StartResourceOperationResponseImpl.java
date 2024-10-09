// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.implementation;

import com.azure.resourcemanager.computeschedule.fluent.models.StartResourceOperationResponseInner;
import com.azure.resourcemanager.computeschedule.models.ResourceOperation;
import com.azure.resourcemanager.computeschedule.models.StartResourceOperationResponse;
import java.util.Collections;
import java.util.List;

public final class StartResourceOperationResponseImpl implements StartResourceOperationResponse {
    private StartResourceOperationResponseInner innerObject;

    private final com.azure.resourcemanager.computeschedule.ComputeScheduleManager serviceManager;

    StartResourceOperationResponseImpl(StartResourceOperationResponseInner innerObject,
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String description() {
        return this.innerModel().description();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public List<ResourceOperation> results() {
        List<ResourceOperation> inner = this.innerModel().results();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StartResourceOperationResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager() {
        return this.serviceManager;
    }
}
