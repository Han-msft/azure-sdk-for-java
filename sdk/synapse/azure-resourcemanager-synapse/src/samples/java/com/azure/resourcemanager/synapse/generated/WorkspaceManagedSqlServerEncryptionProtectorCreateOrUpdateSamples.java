// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.models.EncryptionProtector;
import com.azure.resourcemanager.synapse.models.EncryptionProtectorName;
import com.azure.resourcemanager.synapse.models.ServerKeyType;

/** Samples for WorkspaceManagedSqlServerEncryptionProtector CreateOrUpdate. */
public final class WorkspaceManagedSqlServerEncryptionProtectorCreateOrUpdateSamples {
    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Update the encryption protector to key vault.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void updateTheEncryptionProtectorToKeyVault(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        EncryptionProtector resource =
            manager
                .workspaceManagedSqlServerEncryptionProtectors()
                .getWithResponse("wsg-7398", "testWorkspace", EncryptionProtectorName.CURRENT, Context.NONE)
                .getValue();
        resource
            .update()
            .withServerKeyName("someVault_someKey_01234567890123456789012345678901")
            .withServerKeyType(ServerKeyType.AZURE_KEY_VAULT)
            .apply();
    }

    /*
     * x-ms-original-file: null
     */
    /**
     * Sample code: Update the encryption protector to service managed.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void updateTheEncryptionProtectorToServiceManaged(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        EncryptionProtector resource =
            manager
                .workspaceManagedSqlServerEncryptionProtectors()
                .getWithResponse("wsg-7398", "testWorkspace", EncryptionProtectorName.CURRENT, Context.NONE)
                .getValue();
        resource.update().withServerKeyName("ServiceManaged").withServerKeyType(ServerKeyType.SERVICE_MANAGED).apply();
    }
}
