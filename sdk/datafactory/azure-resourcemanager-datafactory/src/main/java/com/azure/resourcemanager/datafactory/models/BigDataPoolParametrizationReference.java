// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Big data pool reference type.
 */
@Fluent
public final class BigDataPoolParametrizationReference
    implements JsonSerializable<BigDataPoolParametrizationReference> {
    /*
     * Big data pool reference type.
     */
    private BigDataPoolReferenceType type;

    /*
     * Reference big data pool name. Type: string (or Expression with resultType string).
     */
    private Object referenceName;

    /**
     * Creates an instance of BigDataPoolParametrizationReference class.
     */
    public BigDataPoolParametrizationReference() {
    }

    /**
     * Get the type property: Big data pool reference type.
     * 
     * @return the type value.
     */
    public BigDataPoolReferenceType type() {
        return this.type;
    }

    /**
     * Set the type property: Big data pool reference type.
     * 
     * @param type the type value to set.
     * @return the BigDataPoolParametrizationReference object itself.
     */
    public BigDataPoolParametrizationReference withType(BigDataPoolReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference big data pool name. Type: string (or Expression with resultType
     * string).
     * 
     * @return the referenceName value.
     */
    public Object referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference big data pool name. Type: string (or Expression with resultType
     * string).
     * 
     * @param referenceName the referenceName value to set.
     * @return the BigDataPoolParametrizationReference object itself.
     */
    public BigDataPoolParametrizationReference withReferenceName(Object referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property type in model BigDataPoolParametrizationReference"));
        }
        if (referenceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property referenceName in model BigDataPoolParametrizationReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BigDataPoolParametrizationReference.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeUntypedField("referenceName", this.referenceName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BigDataPoolParametrizationReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BigDataPoolParametrizationReference if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BigDataPoolParametrizationReference.
     */
    public static BigDataPoolParametrizationReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BigDataPoolParametrizationReference deserializedBigDataPoolParametrizationReference
                = new BigDataPoolParametrizationReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedBigDataPoolParametrizationReference.type
                        = BigDataPoolReferenceType.fromString(reader.getString());
                } else if ("referenceName".equals(fieldName)) {
                    deserializedBigDataPoolParametrizationReference.referenceName = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBigDataPoolParametrizationReference;
        });
    }
}
