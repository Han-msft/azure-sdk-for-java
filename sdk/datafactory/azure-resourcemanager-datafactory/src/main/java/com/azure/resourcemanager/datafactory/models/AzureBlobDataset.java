// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.AzureBlobDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The Azure Blob storage.
 */
@Fluent
public final class AzureBlobDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "AzureBlob";

    /*
     * Azure Blob dataset properties.
     */
    private AzureBlobDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of AzureBlobDataset class.
     */
    public AzureBlobDataset() {
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
     * Get the innerTypeProperties property: Azure Blob dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureBlobDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the folderPath property: The path of the Azure Blob storage. Type: string (or Expression with resultType
     * string).
     * 
     * @return the folderPath value.
     */
    public Object folderPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().folderPath();
    }

    /**
     * Set the folderPath property: The path of the Azure Blob storage. Type: string (or Expression with resultType
     * string).
     * 
     * @param folderPath the folderPath value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withFolderPath(Object folderPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobDatasetTypeProperties();
        }
        this.innerTypeProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the tableRootLocation property: The root of blob path. Type: string (or Expression with resultType string).
     * 
     * @return the tableRootLocation value.
     */
    public Object tableRootLocation() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableRootLocation();
    }

    /**
     * Set the tableRootLocation property: The root of blob path. Type: string (or Expression with resultType string).
     * 
     * @param tableRootLocation the tableRootLocation value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withTableRootLocation(Object tableRootLocation) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobDatasetTypeProperties();
        }
        this.innerTypeProperties().withTableRootLocation(tableRootLocation);
        return this;
    }

    /**
     * Get the fileName property: The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     * @return the fileName value.
     */
    public Object fileName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileName();
    }

    /**
     * Set the fileName property: The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     * @param fileName the fileName value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withFileName(Object fileName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobDatasetTypeProperties();
        }
        this.innerTypeProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().modifiedDatetimeStart();
    }

    /**
     * Set the modifiedDatetimeStart property: The start of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobDatasetTypeProperties();
        }
        this.innerTypeProperties().withModifiedDatetimeStart(modifiedDatetimeStart);
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of Azure Blob's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().modifiedDatetimeEnd();
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of Azure Blob's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobDatasetTypeProperties();
        }
        this.innerTypeProperties().withModifiedDatetimeEnd(modifiedDatetimeEnd);
        return this;
    }

    /**
     * Get the format property: The format of the Azure Blob storage.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat format() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().format();
    }

    /**
     * Set the format property: The format of the Azure Blob storage.
     * 
     * @param format the format value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withFormat(DatasetStorageFormat format) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobDatasetTypeProperties();
        }
        this.innerTypeProperties().withFormat(format);
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the blob storage.
     * 
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compression();
    }

    /**
     * Set the compression property: The data compression method used for the blob storage.
     * 
     * @param compression the compression value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withCompression(DatasetCompression compression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobDatasetTypeProperties();
        }
        this.innerTypeProperties().withCompression(compression);
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
     * Reads an instance of AzureBlobDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureBlobDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureBlobDataset.
     */
    public static AzureBlobDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureBlobDataset deserializedAzureBlobDataset = new AzureBlobDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedAzureBlobDataset.withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureBlobDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedAzureBlobDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedAzureBlobDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureBlobDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureBlobDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedAzureBlobDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedAzureBlobDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedAzureBlobDataset.innerTypeProperties = AzureBlobDatasetTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureBlobDataset.withAdditionalProperties(additionalProperties);

            return deserializedAzureBlobDataset;
        });
    }
}
