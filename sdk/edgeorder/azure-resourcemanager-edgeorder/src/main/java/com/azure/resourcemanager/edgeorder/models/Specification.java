// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifications of the configurations.
 */
@Immutable
public final class Specification implements JsonSerializable<Specification> {
    /*
     * Name of the specification
     */
    private String name;

    /*
     * Value of the specification
     */
    private String value;

    /**
     * Creates an instance of Specification class.
     */
    public Specification() {
    }

    /**
     * Get the name property: Name of the specification.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: Value of the specification.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Specification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Specification if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the Specification.
     */
    public static Specification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Specification deserializedSpecification = new Specification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedSpecification.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedSpecification.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSpecification;
        });
    }
}
