// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.MicrosoftAccessTableDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The Microsoft Access table dataset.
 */
@Fluent
public final class MicrosoftAccessTableDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "MicrosoftAccessTable";

    /*
     * Microsoft Access table dataset properties.
     */
    private MicrosoftAccessTableDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of MicrosoftAccessTableDataset class.
     */
    public MicrosoftAccessTableDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Microsoft Access table dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private MicrosoftAccessTableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftAccessTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftAccessTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftAccessTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftAccessTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftAccessTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftAccessTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftAccessTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the tableName property: The Microsoft Access table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableName();
    }

    /**
     * Set the tableName property: The Microsoft Access table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the MicrosoftAccessTableDataset object itself.
     */
    public MicrosoftAccessTableDataset withTableName(Object tableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new MicrosoftAccessTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTableName(tableName);
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
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", linkedServiceName());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeUntypedField("structure", structure());
        jsonWriter.writeUntypedField("schema", schema());
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", folder());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftAccessTableDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftAccessTableDataset if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MicrosoftAccessTableDataset.
     */
    public static MicrosoftAccessTableDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftAccessTableDataset deserializedMicrosoftAccessTableDataset = new MicrosoftAccessTableDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDataset
                        .withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedMicrosoftAccessTableDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedMicrosoftAccessTableDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedMicrosoftAccessTableDataset.innerTypeProperties
                        = MicrosoftAccessTableDatasetTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftAccessTableDataset.withAdditionalProperties(additionalProperties);

            return deserializedMicrosoftAccessTableDataset;
        });
    }
}
