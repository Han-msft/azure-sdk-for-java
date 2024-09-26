// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.resourcemanager.mongocluster.models.AdministratorProperties;
import com.azure.resourcemanager.mongocluster.models.ComputeProperties;
import com.azure.resourcemanager.mongocluster.models.CreateMode;
import com.azure.resourcemanager.mongocluster.models.HighAvailabilityMode;
import com.azure.resourcemanager.mongocluster.models.HighAvailabilityProperties;
import com.azure.resourcemanager.mongocluster.models.MongoClusterProperties;
import com.azure.resourcemanager.mongocluster.models.MongoClusterReplicaParameters;
import com.azure.resourcemanager.mongocluster.models.MongoClusterRestoreParameters;
import com.azure.resourcemanager.mongocluster.models.ShardingProperties;
import com.azure.resourcemanager.mongocluster.models.StorageProperties;
import java.time.OffsetDateTime;

/**
 * Samples for MongoClusters CreateOrUpdate.
 */
public final class MongoClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2024-07-01/MongoClusters_CreateGeoReplica.json
     */
    /**
     * Sample code: Creates a replica Mongo Cluster resource from a source resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void createsAReplicaMongoClusterResourceFromASourceResource(
        com.azure.resourcemanager.mongocluster.MongoClusterManager manager) {
        manager.mongoClusters()
            .define("myReplicaMongoCluster")
            .withRegion("centralus")
            .withExistingResourceGroup("TestResourceGroup")
            .withProperties(new MongoClusterProperties().withCreateMode(CreateMode.GEO_REPLICA)
                .withReplicaParameters(new MongoClusterReplicaParameters().withSourceResourceId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DocumentDB/mongoClusters/mySourceMongoCluster")
                    .withSourceLocation("eastus")))
            .create();
    }

    /*
     * x-ms-original-file: 2024-07-01/MongoClusters_CreatePITR.json
     */
    /**
     * Sample code: Creates a Mongo Cluster resource from a point in time restore.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void createsAMongoClusterResourceFromAPointInTimeRestore(
        com.azure.resourcemanager.mongocluster.MongoClusterManager manager) {
        manager.mongoClusters()
            .define("myMongoCluster")
            .withRegion("westus2")
            .withExistingResourceGroup("TestResourceGroup")
            .withProperties(new MongoClusterProperties().withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
                .withRestoreParameters(new MongoClusterRestoreParameters()
                    .withPointInTimeUTC(OffsetDateTime.parse("2023-01-13T20:07:35Z"))
                    .withSourceResourceId(
                        "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DocumentDB/mongoClusters/myOtherMongoCluster")))
            .create();
    }

    /*
     * x-ms-original-file: 2024-07-01/MongoClusters_Create.json
     */
    /**
     * Sample code: Creates a new Mongo Cluster resource.
     * 
     * @param manager Entry point to MongoClusterManager.
     */
    public static void
        createsANewMongoClusterResource(com.azure.resourcemanager.mongocluster.MongoClusterManager manager) {
        manager.mongoClusters()
            .define("myMongoCluster")
            .withRegion("westus2")
            .withExistingResourceGroup("TestResourceGroup")
            .withProperties(new MongoClusterProperties()
                .withAdministrator(
                    new AdministratorProperties().withUserName("mongoAdmin").withPassword("fakeTokenPlaceholder"))
                .withServerVersion("5.0")
                .withHighAvailability(new HighAvailabilityProperties().withTargetMode(HighAvailabilityMode.SAME_ZONE))
                .withStorage(new StorageProperties().withSizeGb(128L))
                .withSharding(new ShardingProperties().withShardCount(1))
                .withCompute(new ComputeProperties().withTier("M30")))
            .create();
    }
}
