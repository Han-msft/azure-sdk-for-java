// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.implementation;

import com.azure.resourcemanager.fabric.fluent.models.OperationInner;
import com.azure.resourcemanager.fabric.models.ActionType;
import com.azure.resourcemanager.fabric.models.Operation;
import com.azure.resourcemanager.fabric.models.OperationDisplay;
import com.azure.resourcemanager.fabric.models.Origin;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.fabric.FabricManager serviceManager;

    OperationImpl(OperationInner innerObject, com.azure.resourcemanager.fabric.FabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public Origin origin() {
        return this.innerModel().origin();
    }

    public ActionType actionType() {
        return this.innerModel().actionType();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.fabric.FabricManager manager() {
        return this.serviceManager;
    }
}
