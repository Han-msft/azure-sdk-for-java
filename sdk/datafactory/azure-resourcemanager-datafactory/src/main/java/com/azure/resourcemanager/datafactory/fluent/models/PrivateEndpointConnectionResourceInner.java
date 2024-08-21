// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.RemotePrivateEndpointConnection;
import java.io.IOException;

/**
 * Private Endpoint Connection ARM resource.
 */
@Fluent
public final class PrivateEndpointConnectionResourceInner extends SubResource {
    /*
     * Core resource properties
     */
    private RemotePrivateEndpointConnection properties;

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
     * Creates an instance of PrivateEndpointConnectionResourceInner class.
     */
    public PrivateEndpointConnectionResourceInner() {
    }

    /**
     * Get the properties property: Core resource properties.
     * 
     * @return the properties value.
     */
    public RemotePrivateEndpointConnection properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Core resource properties.
     * 
     * @param properties the properties value to set.
     * @return the PrivateEndpointConnectionResourceInner object itself.
     */
    public PrivateEndpointConnectionResourceInner withProperties(RemotePrivateEndpointConnection properties) {
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
    public PrivateEndpointConnectionResourceInner withId(String id) {
        super.withId(id);
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
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionResourceInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionResourceInner.
     */
    public static PrivateEndpointConnectionResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionResourceInner deserializedPrivateEndpointConnectionResourceInner
                = new PrivateEndpointConnectionResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionResourceInner.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionResourceInner.properties
                        = RemotePrivateEndpointConnection.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionResourceInner.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionResourceInner.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionResourceInner;
        });
    }
}
