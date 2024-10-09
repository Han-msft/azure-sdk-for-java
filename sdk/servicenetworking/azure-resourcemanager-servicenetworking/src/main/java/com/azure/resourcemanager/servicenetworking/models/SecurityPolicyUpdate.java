// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The type used for update operations of the SecurityPolicy.
 */
@Fluent
public final class SecurityPolicyUpdate implements JsonSerializable<SecurityPolicyUpdate> {
    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /*
     * The resource-specific properties for this resource.
     */
    private SecurityPolicyUpdateProperties properties;

    /**
     * Creates an instance of SecurityPolicyUpdate class.
     */
    public SecurityPolicyUpdate() {
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the SecurityPolicyUpdate object itself.
     */
    public SecurityPolicyUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public SecurityPolicyUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the SecurityPolicyUpdate object itself.
     */
    public SecurityPolicyUpdate withProperties(SecurityPolicyUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityPolicyUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityPolicyUpdate if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecurityPolicyUpdate.
     */
    public static SecurityPolicyUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecurityPolicyUpdate deserializedSecurityPolicyUpdate = new SecurityPolicyUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedSecurityPolicyUpdate.tags = tags;
                } else if ("properties".equals(fieldName)) {
                    deserializedSecurityPolicyUpdate.properties = SecurityPolicyUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecurityPolicyUpdate;
        });
    }
}
