// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ChildResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.SecurityUserGroupItem;
import java.io.IOException;
import java.util.List;

/**
 * Defines the security user rule collection.
 */
@Fluent
public final class SecurityUserRuleCollectionInner extends ChildResource {
    /*
     * Indicates the properties for the network manager security user rule collection.
     */
    private SecurityUserRuleCollectionPropertiesFormat innerProperties;

    /*
     * The system metadata related to this resource.
     */
    private SystemData systemData;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SecurityUserRuleCollectionInner class.
     */
    public SecurityUserRuleCollectionInner() {
    }

    /**
     * Get the innerProperties property: Indicates the properties for the network manager security user rule collection.
     * 
     * @return the innerProperties value.
     */
    private SecurityUserRuleCollectionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    @Override
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the description property: A description of the security user rule collection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description of the security user rule collection.
     * 
     * @param description the description value to set.
     * @return the SecurityUserRuleCollectionInner object itself.
     */
    public SecurityUserRuleCollectionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityUserRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the appliesToGroups property: Groups for configuration.
     * 
     * @return the appliesToGroups value.
     */
    public List<SecurityUserGroupItem> appliesToGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().appliesToGroups();
    }

    /**
     * Set the appliesToGroups property: Groups for configuration.
     * 
     * @param appliesToGroups the appliesToGroups value to set.
     * @return the SecurityUserRuleCollectionInner object itself.
     */
    public SecurityUserRuleCollectionInner withAppliesToGroups(List<SecurityUserGroupItem> appliesToGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityUserRuleCollectionPropertiesFormat();
        }
        this.innerProperties().withAppliesToGroups(appliesToGroups);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityUserRuleCollectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityUserRuleCollectionInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SecurityUserRuleCollectionInner.
     */
    public static SecurityUserRuleCollectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecurityUserRuleCollectionInner deserializedSecurityUserRuleCollectionInner
                = new SecurityUserRuleCollectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSecurityUserRuleCollectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSecurityUserRuleCollectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSecurityUserRuleCollectionInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedSecurityUserRuleCollectionInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSecurityUserRuleCollectionInner.innerProperties
                        = SecurityUserRuleCollectionPropertiesFormat.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSecurityUserRuleCollectionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecurityUserRuleCollectionInner;
        });
    }
}
