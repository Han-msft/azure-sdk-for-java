// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters for an activating an application package.
 */
@Fluent
public final class ActivateApplicationPackageParameters
    implements JsonSerializable<ActivateApplicationPackageParameters> {
    /*
     * The format of the application package binary file.
     */
    private String format;

    /**
     * Creates an instance of ActivateApplicationPackageParameters class.
     */
    public ActivateApplicationPackageParameters() {
    }

    /**
     * Get the format property: The format of the application package binary file.
     * 
     * @return the format value.
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format property: The format of the application package binary file.
     * 
     * @param format the format value to set.
     * @return the ActivateApplicationPackageParameters object itself.
     */
    public ActivateApplicationPackageParameters withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (format() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property format in model ActivateApplicationPackageParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActivateApplicationPackageParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("format", this.format);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActivateApplicationPackageParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActivateApplicationPackageParameters if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ActivateApplicationPackageParameters.
     */
    public static ActivateApplicationPackageParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActivateApplicationPackageParameters deserializedActivateApplicationPackageParameters
                = new ActivateApplicationPackageParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("format".equals(fieldName)) {
                    deserializedActivateApplicationPackageParameters.format = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActivateApplicationPackageParameters;
        });
    }
}
