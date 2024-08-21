// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.SapHanaTableDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * SAP HANA Table properties.
 */
@Fluent
public final class SapHanaTableDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "SapHanaTable";

    /*
     * SAP HANA Table properties.
     */
    private SapHanaTableDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of SapHanaTableDataset class.
     */
    public SapHanaTableDataset() {
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
     * Get the innerTypeProperties property: SAP HANA Table properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SapHanaTableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapHanaTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the schema property: The schema name of SAP HANA. Type: string (or Expression with resultType string).
     * 
     * @return the schema value.
     */
    public Object schemaTypePropertiesSchema() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().schema();
    }

    /**
     * Set the schema property: The schema name of SAP HANA. Type: string (or Expression with resultType string).
     * 
     * @param schema the schema value to set.
     * @return the SapHanaTableDataset object itself.
     */
    public SapHanaTableDataset withSchemaTypePropertiesSchema(Object schema) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapHanaTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the table property: The table name of SAP HANA. Type: string (or Expression with resultType string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The table name of SAP HANA. Type: string (or Expression with resultType string).
     * 
     * @param table the table value to set.
     * @return the SapHanaTableDataset object itself.
     */
    public SapHanaTableDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapHanaTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTable(table);
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
     * Reads an instance of SapHanaTableDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapHanaTableDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SapHanaTableDataset.
     */
    public static SapHanaTableDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapHanaTableDataset deserializedSapHanaTableDataset = new SapHanaTableDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedSapHanaTableDataset.withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedSapHanaTableDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedSapHanaTableDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedSapHanaTableDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedSapHanaTableDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSapHanaTableDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedSapHanaTableDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedSapHanaTableDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedSapHanaTableDataset.innerTypeProperties
                        = SapHanaTableDatasetTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSapHanaTableDataset.withAdditionalProperties(additionalProperties);

            return deserializedSapHanaTableDataset;
        });
    }
}
