// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatusError;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatusExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatusValues;
import java.time.OffsetDateTime;

public final class OperationStatusImpl implements OperationStatus {
    private OperationStatusInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    OperationStatusImpl(OperationStatusInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationStatusValues status() {
        return this.innerModel().status();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public OperationStatusError error() {
        return this.innerModel().error();
    }

    public OperationStatusExtendedInfo properties() {
        return this.innerModel().properties();
    }

    public OperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
