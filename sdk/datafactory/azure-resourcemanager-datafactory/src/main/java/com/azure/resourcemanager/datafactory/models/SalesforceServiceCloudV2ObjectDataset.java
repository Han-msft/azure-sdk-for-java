// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.SalesforceServiceCloudV2ObjectDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The Salesforce Service Cloud V2 object dataset.
 */
@Fluent
public final class SalesforceServiceCloudV2ObjectDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "SalesforceServiceCloudV2Object";

    /*
     * Salesforce Service Cloud V2 object dataset properties.
     */
    private SalesforceServiceCloudV2ObjectDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of SalesforceServiceCloudV2ObjectDataset class.
     */
    public SalesforceServiceCloudV2ObjectDataset() {
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
     * Get the innerTypeProperties property: Salesforce Service Cloud V2 object dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SalesforceServiceCloudV2ObjectDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the objectApiName property: The Salesforce Service Cloud V2 object API name. Type: string (or Expression with
     * resultType string).
     * 
     * @return the objectApiName value.
     */
    public Object objectApiName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().objectApiName();
    }

    /**
     * Set the objectApiName property: The Salesforce Service Cloud V2 object API name. Type: string (or Expression with
     * resultType string).
     * 
     * @param objectApiName the objectApiName value to set.
     * @return the SalesforceServiceCloudV2ObjectDataset object itself.
     */
    public SalesforceServiceCloudV2ObjectDataset withObjectApiName(Object objectApiName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2ObjectDatasetTypeProperties();
        }
        this.innerTypeProperties().withObjectApiName(objectApiName);
        return this;
    }

    /**
     * Get the reportId property: The Salesforce Service Cloud V2 reportId. Type: string (or Expression with resultType
     * string).
     * 
     * @return the reportId value.
     */
    public Object reportId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().reportId();
    }

    /**
     * Set the reportId property: The Salesforce Service Cloud V2 reportId. Type: string (or Expression with resultType
     * string).
     * 
     * @param reportId the reportId value to set.
     * @return the SalesforceServiceCloudV2ObjectDataset object itself.
     */
    public SalesforceServiceCloudV2ObjectDataset withReportId(Object reportId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2ObjectDatasetTypeProperties();
        }
        this.innerTypeProperties().withReportId(reportId);
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
     * Reads an instance of SalesforceServiceCloudV2ObjectDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SalesforceServiceCloudV2ObjectDataset if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SalesforceServiceCloudV2ObjectDataset.
     */
    public static SalesforceServiceCloudV2ObjectDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SalesforceServiceCloudV2ObjectDataset deserializedSalesforceServiceCloudV2ObjectDataset
                = new SalesforceServiceCloudV2ObjectDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset
                        .withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedSalesforceServiceCloudV2ObjectDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedSalesforceServiceCloudV2ObjectDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedSalesforceServiceCloudV2ObjectDataset.innerTypeProperties
                        = SalesforceServiceCloudV2ObjectDatasetTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSalesforceServiceCloudV2ObjectDataset.withAdditionalProperties(additionalProperties);

            return deserializedSalesforceServiceCloudV2ObjectDataset;
        });
    }
}
