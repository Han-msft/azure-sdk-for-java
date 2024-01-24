// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionContainerResourceInner;
import java.util.Map;

/**
 * An immutable client-side representation of ProtectionContainerResource.
 */
public interface ProtectionContainerResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: ProtectionContainerResource properties.
     * 
     * @return the properties value.
     */
    ProtectionContainer properties();

    /**
     * Gets the etag property: Optional ETag.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionContainerResourceInner
     * object.
     * 
     * @return the inner object.
     */
    ProtectionContainerResourceInner innerModel();

    /**
     * The entirety of the ProtectionContainerResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ProtectionContainerResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ProtectionContainerResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the ProtectionContainerResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /**
         * The stage of the ProtectionContainerResource definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies vaultName, resourceGroupName, fabricName.
             * 
             * @param vaultName The name of the recovery services vault.
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param fabricName Fabric name associated with the container.
             * @return the next definition stage.
             */
            WithCreate withExistingBackupFabric(String vaultName, String resourceGroupName, String fabricName);
        }

        /**
         * The stage of the ProtectionContainerResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithProperties, DefinitionStages.WithEtag {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ProtectionContainerResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProtectionContainerResource create(Context context);
        }

        /**
         * The stage of the ProtectionContainerResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ProtectionContainerResource definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: ProtectionContainerResource properties.
             * 
             * @param properties ProtectionContainerResource properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(ProtectionContainer properties);
        }

        /**
         * The stage of the ProtectionContainerResource definition allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: Optional ETag..
             * 
             * @param etag Optional ETag.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
    }

    /**
     * Begins update for the ProtectionContainerResource resource.
     * 
     * @return the stage of resource update.
     */
    ProtectionContainerResource.Update update();

    /**
     * The template for ProtectionContainerResource update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties, UpdateStages.WithEtag {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ProtectionContainerResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ProtectionContainerResource apply(Context context);
    }

    /**
     * The ProtectionContainerResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ProtectionContainerResource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ProtectionContainerResource update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: ProtectionContainerResource properties.
             * 
             * @param properties ProtectionContainerResource properties.
             * @return the next definition stage.
             */
            Update withProperties(ProtectionContainer properties);
        }

        /**
         * The stage of the ProtectionContainerResource update allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: Optional ETag..
             * 
             * @param etag Optional ETag.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ProtectionContainerResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProtectionContainerResource refresh(Context context);

    /**
     * Inquires all the protectable items under the given container.
     * 
     * This is an async operation and the results should be tracked using location header or Azure-async-url.
     * 
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> inquireWithResponse(String filter, Context context);

    /**
     * Inquires all the protectable items under the given container.
     * 
     * This is an async operation and the results should be tracked using location header or Azure-async-url.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void inquire();
}
