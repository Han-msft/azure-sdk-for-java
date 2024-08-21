// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The exposure control response.
 */
@Immutable
public final class ExposureControlResponseInner implements JsonSerializable<ExposureControlResponseInner> {
    /*
     * The feature name.
     */
    private String featureName;

    /*
     * The feature value.
     */
    private String value;

    /**
     * Creates an instance of ExposureControlResponseInner class.
     */
    public ExposureControlResponseInner() {
    }

    /**
     * Get the featureName property: The feature name.
     * 
     * @return the featureName value.
     */
    public String featureName() {
        return this.featureName;
    }

    /**
     * Get the value property: The feature value.
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
     * Reads an instance of ExposureControlResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExposureControlResponseInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExposureControlResponseInner.
     */
    public static ExposureControlResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExposureControlResponseInner deserializedExposureControlResponseInner = new ExposureControlResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("featureName".equals(fieldName)) {
                    deserializedExposureControlResponseInner.featureName = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedExposureControlResponseInner.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExposureControlResponseInner;
        });
    }
}
