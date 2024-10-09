// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.resourcemanager.botservice.fluent.models.ListChannelWithKeysResponseInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of ListChannelWithKeysResponse.
 */
public interface ListChannelWithKeysResponse {
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
     * Gets the properties property: The set of properties specific to bot channel resource.
     * 
     * @return the properties value.
     */
    Channel properties();

    /**
     * Gets the sku property: Gets or sets the SKU of the resource.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the kind property: Required. Gets or sets the Kind of the resource.
     * 
     * @return the kind value.
     */
    Kind kind();

    /**
     * Gets the etag property: Entity Tag.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the zones property: Entity zones.
     * 
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the resource property: The set of properties specific to bot channel resource.
     * 
     * @return the resource value.
     */
    Channel resource();

    /**
     * Gets the setting property: Channel settings.
     * 
     * @return the setting value.
     */
    ChannelSettings setting();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the entityTag property: Entity tag of the resource.
     * 
     * @return the entityTag value.
     */
    String entityTag();

    /**
     * Gets the changedTime property: Changed time of the resource.
     * 
     * @return the changedTime value.
     */
    String changedTime();

    /**
     * Gets the inner com.azure.resourcemanager.botservice.fluent.models.ListChannelWithKeysResponseInner object.
     * 
     * @return the inner object.
     */
    ListChannelWithKeysResponseInner innerModel();
}
