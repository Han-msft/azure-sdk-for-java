// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoDBResources GetMongoRoleDefinition.
 */
public final class MongoDBResourcesGetMongoRoleDefinitionSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2024-05-15/examples/
     * CosmosDBMongoDBRoleDefinitionGet.json
     */
    /**
     * Sample code: CosmosDBMongoRoleDefinitionGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoRoleDefinitionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .getMongoRoleDefinitionWithResponse("myMongoRoleDefinitionId", "myResourceGroupName", "myAccountName",
                com.azure.core.util.Context.NONE);
    }
}
