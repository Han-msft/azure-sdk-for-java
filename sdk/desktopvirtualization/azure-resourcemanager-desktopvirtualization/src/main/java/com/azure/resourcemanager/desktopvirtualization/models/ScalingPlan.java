// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of ScalingPlan.
 */
public interface ScalingPlan {
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
     * Gets the managedBy property: The fully qualified resource ID of the resource that manages this resource.
     * Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment
     * will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * Gets the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type. E.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
     * validate and persist this value.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the etag property: The etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal etag convention. Entity tags are used for comparing two or more entities from
     * the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24),
     * If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the identity property: The identity property.
     * 
     * @return the identity value.
     */
    ResourceModelWithAllowedPropertySetIdentity identity();

    /**
     * Gets the sku property: The sku property.
     * 
     * @return the sku value.
     */
    ResourceModelWithAllowedPropertySetSku sku();

    /**
     * Gets the plan property: The plan property.
     * 
     * @return the plan value.
     */
    ResourceModelWithAllowedPropertySetPlan plan();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the objectId property: ObjectId of scaling plan. (internal use).
     * 
     * @return the objectId value.
     */
    String objectId();

    /**
     * Gets the description property: Description of scaling plan.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the friendlyName property: User friendly name of scaling plan.
     * 
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * Gets the timeZone property: Timezone of the scaling plan.
     * 
     * @return the timeZone value.
     */
    String timeZone();

    /**
     * Gets the hostPoolType property: HostPool type for desktop.
     * 
     * @return the hostPoolType value.
     */
    ScalingHostPoolType hostPoolType();

    /**
     * Gets the exclusionTag property: Exclusion tag for scaling plan.
     * 
     * @return the exclusionTag value.
     */
    String exclusionTag();

    /**
     * Gets the schedules property: List of ScalingPlanPooledSchedule definitions.
     * 
     * @return the schedules value.
     */
    List<ScalingSchedule> schedules();

    /**
     * Gets the hostPoolReferences property: List of ScalingHostPoolReference definitions.
     * 
     * @return the hostPoolReferences value.
     */
    List<ScalingHostPoolReference> hostPoolReferences();

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
     * Gets the inner com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanInner object.
     * 
     * @return the inner object.
     */
    ScalingPlanInner innerModel();

    /**
     * The entirety of the ScalingPlan definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithTimeZone, DefinitionStages.WithCreate {
    }

    /**
     * The ScalingPlan definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ScalingPlan definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithTimeZone withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify timeZone.
         */
        interface WithTimeZone {
            /**
             * Specifies the timeZone property: Timezone of the scaling plan..
             * 
             * @param timeZone Timezone of the scaling plan.
             * @return the next definition stage.
             */
            WithCreate withTimeZone(String timeZone);
        }

        /**
         * The stage of the ScalingPlan definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithManagedBy, DefinitionStages.WithKind,
            DefinitionStages.WithIdentity, DefinitionStages.WithSku, DefinitionStages.WithPlan,
            DefinitionStages.WithDescription, DefinitionStages.WithFriendlyName, DefinitionStages.WithHostPoolType,
            DefinitionStages.WithExclusionTag, DefinitionStages.WithSchedules, DefinitionStages.WithHostPoolReferences {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ScalingPlan create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ScalingPlan create(Context context);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify tags.
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
         * The stage of the ScalingPlan definition allowing to specify managedBy.
         */
        interface WithManagedBy {
            /**
             * Specifies the managedBy property: The fully qualified resource ID of the resource that manages this
             * resource. Indicates if this resource is managed by another Azure resource. If this is present, complete
             * mode deployment will not delete the resource if it is removed from the template since it is managed by
             * another resource..
             * 
             * @param managedBy The fully qualified resource ID of the resource that manages this resource. Indicates if
             * this resource is managed by another Azure resource. If this is present, complete mode deployment will not
             * delete the resource if it is removed from the template since it is managed by another resource.
             * @return the next definition stage.
             */
            WithCreate withManagedBy(String managedBy);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify kind.
         */
        interface WithKind {
            /**
             * Specifies the kind property: Metadata used by portal/tooling/etc to render different UX experiences for
             * resources of the same type. E.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the
             * resource provider must validate and persist this value..
             * 
             * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the
             * same type. E.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
             * validate and persist this value.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             * 
             * @param identity The identity property.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ResourceModelWithAllowedPropertySetIdentity identity);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: The sku property..
             * 
             * @param sku The sku property.
             * @return the next definition stage.
             */
            WithCreate withSku(ResourceModelWithAllowedPropertySetSku sku);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify plan.
         */
        interface WithPlan {
            /**
             * Specifies the plan property: The plan property..
             * 
             * @param plan The plan property.
             * @return the next definition stage.
             */
            WithCreate withPlan(ResourceModelWithAllowedPropertySetPlan plan);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Description of scaling plan..
             * 
             * @param description Description of scaling plan.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify friendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: User friendly name of scaling plan..
             * 
             * @param friendlyName User friendly name of scaling plan.
             * @return the next definition stage.
             */
            WithCreate withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify hostPoolType.
         */
        interface WithHostPoolType {
            /**
             * Specifies the hostPoolType property: HostPool type for desktop..
             * 
             * @param hostPoolType HostPool type for desktop.
             * @return the next definition stage.
             */
            WithCreate withHostPoolType(ScalingHostPoolType hostPoolType);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify exclusionTag.
         */
        interface WithExclusionTag {
            /**
             * Specifies the exclusionTag property: Exclusion tag for scaling plan..
             * 
             * @param exclusionTag Exclusion tag for scaling plan.
             * @return the next definition stage.
             */
            WithCreate withExclusionTag(String exclusionTag);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify schedules.
         */
        interface WithSchedules {
            /**
             * Specifies the schedules property: List of ScalingPlanPooledSchedule definitions..
             * 
             * @param schedules List of ScalingPlanPooledSchedule definitions.
             * @return the next definition stage.
             */
            WithCreate withSchedules(List<ScalingSchedule> schedules);
        }

        /**
         * The stage of the ScalingPlan definition allowing to specify hostPoolReferences.
         */
        interface WithHostPoolReferences {
            /**
             * Specifies the hostPoolReferences property: List of ScalingHostPoolReference definitions..
             * 
             * @param hostPoolReferences List of ScalingHostPoolReference definitions.
             * @return the next definition stage.
             */
            WithCreate withHostPoolReferences(List<ScalingHostPoolReference> hostPoolReferences);
        }
    }

    /**
     * Begins update for the ScalingPlan resource.
     * 
     * @return the stage of resource update.
     */
    ScalingPlan.Update update();

    /**
     * The template for ScalingPlan update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithDescription, UpdateStages.WithFriendlyName,
        UpdateStages.WithTimeZone, UpdateStages.WithExclusionTag, UpdateStages.WithSchedules,
        UpdateStages.WithHostPoolReferences {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ScalingPlan apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ScalingPlan apply(Context context);
    }

    /**
     * The ScalingPlan update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ScalingPlan update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: tags to be updated.
             * 
             * @param tags tags to be updated.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ScalingPlan update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Description of scaling plan..
             * 
             * @param description Description of scaling plan.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the ScalingPlan update allowing to specify friendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies the friendlyName property: User friendly name of scaling plan..
             * 
             * @param friendlyName User friendly name of scaling plan.
             * @return the next definition stage.
             */
            Update withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the ScalingPlan update allowing to specify timeZone.
         */
        interface WithTimeZone {
            /**
             * Specifies the timeZone property: Timezone of the scaling plan..
             * 
             * @param timeZone Timezone of the scaling plan.
             * @return the next definition stage.
             */
            Update withTimeZone(String timeZone);
        }

        /**
         * The stage of the ScalingPlan update allowing to specify exclusionTag.
         */
        interface WithExclusionTag {
            /**
             * Specifies the exclusionTag property: Exclusion tag for scaling plan..
             * 
             * @param exclusionTag Exclusion tag for scaling plan.
             * @return the next definition stage.
             */
            Update withExclusionTag(String exclusionTag);
        }

        /**
         * The stage of the ScalingPlan update allowing to specify schedules.
         */
        interface WithSchedules {
            /**
             * Specifies the schedules property: List of ScalingSchedule definitions..
             * 
             * @param schedules List of ScalingSchedule definitions.
             * @return the next definition stage.
             */
            Update withSchedules(List<ScalingSchedule> schedules);
        }

        /**
         * The stage of the ScalingPlan update allowing to specify hostPoolReferences.
         */
        interface WithHostPoolReferences {
            /**
             * Specifies the hostPoolReferences property: List of ScalingHostPoolReference definitions..
             * 
             * @param hostPoolReferences List of ScalingHostPoolReference definitions.
             * @return the next definition stage.
             */
            Update withHostPoolReferences(List<ScalingHostPoolReference> hostPoolReferences);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ScalingPlan refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ScalingPlan refresh(Context context);
}
