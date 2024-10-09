// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

import com.azure.resourcemanager.servicelinker.models.AzureResource;
import com.azure.resourcemanager.servicelinker.models.CreateOrUpdateDryrunParameters;
import com.azure.resourcemanager.servicelinker.models.SecretAuthInfo;
import com.azure.resourcemanager.servicelinker.models.ValueSecretInfo;

/**
 * Samples for Connector CreateDryrun.
 */
public final class ConnectorCreateDryrunSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2024-07-01-preview/examples/
     * ConnectorDryrunCreate.json
     */
    /**
     * Sample code: ConnectorDryrunCreate.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void connectorDryrunCreate(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.connectors()
            .define("dryrunName")
            .withExistingLocation("00000000-0000-0000-0000-000000000000", "test-rg", "westus")
            .withParameters(new CreateOrUpdateDryrunParameters().withTargetService(new AzureResource().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.DocumentDb/databaseAccounts/test-acc/mongodbDatabases/test-db"))
                .withAuthInfo(
                    new SecretAuthInfo().withName("name").withSecretInfo(new ValueSecretInfo().withValue("secret"))))
            .create();
    }
}
