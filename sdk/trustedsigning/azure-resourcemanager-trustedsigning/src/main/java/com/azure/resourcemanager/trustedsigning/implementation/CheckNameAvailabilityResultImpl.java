// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.implementation;

import com.azure.resourcemanager.trustedsigning.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.trustedsigning.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.trustedsigning.models.NameUnavailabilityReason;

public final class CheckNameAvailabilityResultImpl implements CheckNameAvailabilityResult {
    private CheckNameAvailabilityResultInner innerObject;

    private final com.azure.resourcemanager.trustedsigning.TrustedSigningManager serviceManager;

    CheckNameAvailabilityResultImpl(CheckNameAvailabilityResultInner innerObject,
        com.azure.resourcemanager.trustedsigning.TrustedSigningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public NameUnavailabilityReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.trustedsigning.TrustedSigningManager manager() {
        return this.serviceManager;
    }
}
