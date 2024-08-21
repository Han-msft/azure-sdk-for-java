// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntime;
import java.io.IOException;

/**
 * Integration runtime resource type.
 */
@Fluent
public final class IntegrationRuntimeResourceInner extends SubResource {
    /*
     * Integration runtime properties.
     */
    private IntegrationRuntime properties;

    /*
     * The resource name.
     */
    private String name;

    /*
     * The resource type.
     */
    private String type;

    /*
     * Etag identifies change in the resource.
     */
    private String etag;

    /**
     * Creates an instance of IntegrationRuntimeResourceInner class.
     */
    public IntegrationRuntimeResourceInner() {
    }

    /**
     * Get the properties property: Integration runtime properties.
     * 
     * @return the properties value.
     */
    public IntegrationRuntime properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Integration runtime properties.
     * 
     * @param properties the properties value to set.
     * @return the IntegrationRuntimeResourceInner object itself.
     */
    public IntegrationRuntimeResourceInner withProperties(IntegrationRuntime properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the name property: The resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: Etag identifies change in the resource.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IntegrationRuntimeResourceInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model IntegrationRuntimeResourceInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IntegrationRuntimeResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationRuntimeResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationRuntimeResourceInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IntegrationRuntimeResourceInner.
     */
    public static IntegrationRuntimeResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationRuntimeResourceInner deserializedIntegrationRuntimeResourceInner
                = new IntegrationRuntimeResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedIntegrationRuntimeResourceInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedIntegrationRuntimeResourceInner.properties = IntegrationRuntime.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedIntegrationRuntimeResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedIntegrationRuntimeResourceInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedIntegrationRuntimeResourceInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationRuntimeResourceInner;
        });
    }
}
