// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.implementation;

import com.azure.resourcemanager.fluidrelay.fluent.models.OperationResultInner;
import com.azure.resourcemanager.fluidrelay.models.OperationDisplay;
import com.azure.resourcemanager.fluidrelay.models.OperationResult;

public final class OperationResultImpl implements OperationResult {
    private OperationResultInner innerObject;

    private final com.azure.resourcemanager.fluidrelay.FluidRelayManager serviceManager;

    OperationResultImpl(OperationResultInner innerObject,
        com.azure.resourcemanager.fluidrelay.FluidRelayManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.fluidrelay.FluidRelayManager manager() {
        return this.serviceManager;
    }
}
