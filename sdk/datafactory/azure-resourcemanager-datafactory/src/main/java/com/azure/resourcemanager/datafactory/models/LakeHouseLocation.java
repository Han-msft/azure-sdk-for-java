// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The location of Microsoft Fabric LakeHouse Files dataset.
 */
@Fluent
public final class LakeHouseLocation extends DatasetLocation {
    /*
     * Type of dataset storage location.
     */
    private String type = "LakeHouseLocation";

    /**
     * Creates an instance of LakeHouseLocation class.
     */
    public LakeHouseLocation() {
    }

    /**
     * Get the type property: Type of dataset storage location.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseLocation withFolderPath(Object folderPath) {
        super.withFolderPath(folderPath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LakeHouseLocation withFileName(Object fileName) {
        super.withFileName(fileName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("folderPath", folderPath());
        jsonWriter.writeUntypedField("fileName", fileName());
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LakeHouseLocation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LakeHouseLocation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LakeHouseLocation.
     */
    public static LakeHouseLocation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LakeHouseLocation deserializedLakeHouseLocation = new LakeHouseLocation();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("folderPath".equals(fieldName)) {
                    deserializedLakeHouseLocation.withFolderPath(reader.readUntyped());
                } else if ("fileName".equals(fieldName)) {
                    deserializedLakeHouseLocation.withFileName(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedLakeHouseLocation.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedLakeHouseLocation.withAdditionalProperties(additionalProperties);

            return deserializedLakeHouseLocation;
        });
    }
}
