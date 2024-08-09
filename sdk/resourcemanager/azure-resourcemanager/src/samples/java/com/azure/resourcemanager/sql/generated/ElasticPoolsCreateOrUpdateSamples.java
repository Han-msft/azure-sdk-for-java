// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.fluent.models.ElasticPoolInner;
import com.azure.resourcemanager.sql.models.ElasticPoolPerDatabaseSettings;
import com.azure.resourcemanager.sql.models.Sku;

/**
 * Samples for ElasticPools CreateOrUpdate.
 */
public final class ElasticPoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ElasticPoolCreateOrUpdateMax.json
     */
    /**
     * Sample code: Create or update elastic pool with all parameter.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateElasticPoolWithAllParameter(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .createOrUpdate("sqlcrudtest-2369", "sqlcrudtest-8069", "sqlcrudtest-8102",
                new ElasticPoolInner().withLocation("Japan East")
                    .withSku(new Sku().withName("GP_Gen4_2").withTier("GeneralPurpose").withCapacity(2))
                    .withPerDatabaseSettings(
                        new ElasticPoolPerDatabaseSettings().withMinCapacity(0.25D).withMaxCapacity(2.0D)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * HyperscaleElasticPoolCreateOrUpdateSetHighAvailabilityReplicaCount.json
     */
    /**
     * Sample code: Create or update Hyperscale elastic pool with high availability replica count parameter.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateHyperscaleElasticPoolWithHighAvailabilityReplicaCountParameter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .createOrUpdate("sqlcrudtest-2369", "sqlcrudtest-8069", "sqlcrudtest-8102",
                new ElasticPoolInner().withLocation("Japan East")
                    .withSku(new Sku().withName("HS_Gen5_4"))
                    .withHighAvailabilityReplicaCount(2),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * ElasticPoolCreateOrUpdateSetMaintenanceConfiguration.json
     */
    /**
     * Sample code: Create or update elastic pool with maintenance configuration parameter.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateElasticPoolWithMaintenanceConfigurationParameter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .createOrUpdate("sqlcrudtest-2369", "sqlcrudtest-8069", "sqlcrudtest-8102", new ElasticPoolInner()
                .withLocation("Japan East")
                .withMaintenanceConfigurationId(
                    "/subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_JapanEast_1"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ElasticPoolCreateOrUpdateMin.json
     */
    /**
     * Sample code: Create or update elastic pool with minimum parameters.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        createOrUpdateElasticPoolWithMinimumParameters(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getElasticPools()
            .createOrUpdate("sqlcrudtest-2369", "sqlcrudtest-8069", "sqlcrudtest-8102",
                new ElasticPoolInner().withLocation("Japan East"), com.azure.core.util.Context.NONE);
    }
}
