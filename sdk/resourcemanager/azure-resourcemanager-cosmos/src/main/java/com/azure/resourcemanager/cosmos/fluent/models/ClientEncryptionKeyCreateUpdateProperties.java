// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.ClientEncryptionKeyResource;
import java.io.IOException;

/**
 * Properties to create and update ClientEncryptionKey.
 */
@Fluent
public final class ClientEncryptionKeyCreateUpdateProperties
    implements JsonSerializable<ClientEncryptionKeyCreateUpdateProperties> {
    /*
     * The standard JSON format of a ClientEncryptionKey
     */
    private ClientEncryptionKeyResource resource;

    /**
     * Creates an instance of ClientEncryptionKeyCreateUpdateProperties class.
     */
    public ClientEncryptionKeyCreateUpdateProperties() {
    }

    /**
     * Get the resource property: The standard JSON format of a ClientEncryptionKey.
     * 
     * @return the resource value.
     */
    public ClientEncryptionKeyResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a ClientEncryptionKey.
     * 
     * @param resource the resource value to set.
     * @return the ClientEncryptionKeyCreateUpdateProperties object itself.
     */
    public ClientEncryptionKeyCreateUpdateProperties withResource(ClientEncryptionKeyResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property resource in model ClientEncryptionKeyCreateUpdateProperties"));
        } else {
            resource().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClientEncryptionKeyCreateUpdateProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("resource", this.resource);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClientEncryptionKeyCreateUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClientEncryptionKeyCreateUpdateProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClientEncryptionKeyCreateUpdateProperties.
     */
    public static ClientEncryptionKeyCreateUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClientEncryptionKeyCreateUpdateProperties deserializedClientEncryptionKeyCreateUpdateProperties
                = new ClientEncryptionKeyCreateUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resource".equals(fieldName)) {
                    deserializedClientEncryptionKeyCreateUpdateProperties.resource
                        = ClientEncryptionKeyResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClientEncryptionKeyCreateUpdateProperties;
        });
    }
}
