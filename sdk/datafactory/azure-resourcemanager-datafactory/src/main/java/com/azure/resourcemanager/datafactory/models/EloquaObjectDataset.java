// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.GenericDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Eloqua server dataset.
 */
@Fluent
public final class EloquaObjectDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "EloquaObject";

    /*
     * Properties specific to this dataset type.
     */
    private GenericDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of EloquaObjectDataset class.
     */
    public EloquaObjectDataset() {
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
     * Get the innerTypeProperties property: Properties specific to this dataset type.
     * 
     * @return the innerTypeProperties value.
     */
    private GenericDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EloquaObjectDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EloquaObjectDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EloquaObjectDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EloquaObjectDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EloquaObjectDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EloquaObjectDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EloquaObjectDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the tableName property: The table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableName();
    }

    /**
     * Set the tableName property: The table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the EloquaObjectDataset object itself.
     */
    public EloquaObjectDataset withTableName(Object tableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new GenericDatasetTypeProperties();
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
     * Reads an instance of EloquaObjectDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EloquaObjectDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EloquaObjectDataset.
     */
    public static EloquaObjectDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EloquaObjectDataset deserializedEloquaObjectDataset = new EloquaObjectDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedEloquaObjectDataset.withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedEloquaObjectDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedEloquaObjectDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedEloquaObjectDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedEloquaObjectDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedEloquaObjectDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedEloquaObjectDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedEloquaObjectDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedEloquaObjectDataset.innerTypeProperties = GenericDatasetTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedEloquaObjectDataset.withAdditionalProperties(additionalProperties);

            return deserializedEloquaObjectDataset;
        });
    }
}
