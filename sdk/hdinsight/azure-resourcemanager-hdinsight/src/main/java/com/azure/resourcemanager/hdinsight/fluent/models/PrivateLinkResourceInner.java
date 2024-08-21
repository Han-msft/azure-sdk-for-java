// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A private link resource.
 */
@Fluent
public final class PrivateLinkResourceInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private PrivateLinkResourceProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of PrivateLinkResourceInner class.
     */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private PrivateLinkResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * Get the groupId property: The private link resource group id.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     * 
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredMembers();
    }

    /**
     * Get the requiredZoneNames property: The private link resource Private link DNS zone name.
     * 
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.innerProperties() == null ? null : this.innerProperties().requiredZoneNames();
    }

    /**
     * Set the requiredZoneNames property: The private link resource Private link DNS zone name.
     * 
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredZoneNames(List<String> requiredZoneNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateLinkResourceProperties();
        }
        this.innerProperties().withRequiredZoneNames(requiredZoneNames);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
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
     * Reads an instance of PrivateLinkResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceInner.
     */
    public static PrivateLinkResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceInner deserializedPrivateLinkResourceInner = new PrivateLinkResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.innerProperties
                        = PrivateLinkResourceProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPrivateLinkResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceInner;
        });
    }
}
