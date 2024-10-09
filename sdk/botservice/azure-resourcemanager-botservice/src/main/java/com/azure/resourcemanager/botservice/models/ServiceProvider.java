// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Service Provider Definition.
 */
@Fluent
public final class ServiceProvider implements JsonSerializable<ServiceProvider> {
    /*
     * The Properties of a Service Provider Object
     */
    private ServiceProviderProperties properties;

    /**
     * Creates an instance of ServiceProvider class.
     */
    public ServiceProvider() {
    }

    /**
     * Get the properties property: The Properties of a Service Provider Object.
     * 
     * @return the properties value.
     */
    public ServiceProviderProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The Properties of a Service Provider Object.
     * 
     * @param properties the properties value to set.
     * @return the ServiceProvider object itself.
     */
    public ServiceProvider withProperties(ServiceProviderProperties properties) {
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
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceProvider from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceProvider if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceProvider.
     */
    public static ServiceProvider fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceProvider deserializedServiceProvider = new ServiceProvider();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedServiceProvider.properties = ServiceProviderProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceProvider;
        });
    }
}
