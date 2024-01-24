// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/**
 * Samples for DeletedProtectionContainers List.
 */
public final class DeletedProtectionContainersListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2023-06-01/examples/
     * AzureStorage/SoftDeletedContainers_List.json
     */
    /**
     * Sample code: List Backup Protection Containers.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void listBackupProtectionContainers(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.deletedProtectionContainers().list("testRg", "testVault", "backupManagementType eq 'AzureWorkload'",
            com.azure.core.util.Context.NONE);
    }
}
