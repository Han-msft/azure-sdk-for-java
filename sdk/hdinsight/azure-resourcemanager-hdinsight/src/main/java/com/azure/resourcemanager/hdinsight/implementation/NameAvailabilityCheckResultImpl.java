// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.fluent.models.NameAvailabilityCheckResultInner;
import com.azure.resourcemanager.hdinsight.models.NameAvailabilityCheckResult;

public final class NameAvailabilityCheckResultImpl implements NameAvailabilityCheckResult {
    private NameAvailabilityCheckResultInner innerObject;

    private final com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager;

    NameAvailabilityCheckResultImpl(NameAvailabilityCheckResultInner innerObject,
        com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public NameAvailabilityCheckResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hdinsight.HDInsightManager manager() {
        return this.serviceManager;
    }
}
