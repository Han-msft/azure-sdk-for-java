// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The base definition of a linked integration runtime.
 */
@Immutable
public class LinkedIntegrationRuntimeType implements JsonSerializable<LinkedIntegrationRuntimeType> {
    /*
     * The authorization type for integration runtime sharing.
     */
    private String authorizationType = "LinkedIntegrationRuntimeType";

    /**
     * Creates an instance of LinkedIntegrationRuntimeType class.
     */
    public LinkedIntegrationRuntimeType() {
    }

    /**
     * Get the authorizationType property: The authorization type for integration runtime sharing.
     * 
     * @return the authorizationType value.
     */
    public String authorizationType() {
        return this.authorizationType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("authorizationType", this.authorizationType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkedIntegrationRuntimeType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkedIntegrationRuntimeType if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinkedIntegrationRuntimeType.
     */
    public static LinkedIntegrationRuntimeType fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("authorizationType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Key".equals(discriminatorValue)) {
                    return LinkedIntegrationRuntimeKeyAuthorization.fromJson(readerToUse.reset());
                } else if ("RBAC".equals(discriminatorValue)) {
                    return LinkedIntegrationRuntimeRbacAuthorization.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static LinkedIntegrationRuntimeType fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkedIntegrationRuntimeType deserializedLinkedIntegrationRuntimeType = new LinkedIntegrationRuntimeType();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("authorizationType".equals(fieldName)) {
                    deserializedLinkedIntegrationRuntimeType.authorizationType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkedIntegrationRuntimeType;
        });
    }
}
