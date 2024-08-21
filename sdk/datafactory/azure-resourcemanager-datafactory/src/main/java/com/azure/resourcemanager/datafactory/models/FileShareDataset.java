// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.FileShareDatasetTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * An on-premises file system dataset.
 */
@Fluent
public final class FileShareDataset extends Dataset {
    /*
     * Type of dataset.
     */
    private String type = "FileShare";

    /*
     * On-premises file system dataset properties.
     */
    private FileShareDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of FileShareDataset class.
     */
    public FileShareDataset() {
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
     * Get the innerTypeProperties property: On-premises file system dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private FileShareDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileShareDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileShareDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileShareDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileShareDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileShareDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileShareDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileShareDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the folderPath property: The path of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @return the folderPath value.
     */
    public Object folderPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().folderPath();
    }

    /**
     * Set the folderPath property: The path of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @param folderPath the folderPath value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFolderPath(Object folderPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the fileName property: The name of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @return the fileName value.
     */
    public Object fileName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileName();
    }

    /**
     * Set the fileName property: The name of the on-premises file system. Type: string (or Expression with resultType
     * string).
     * 
     * @param fileName the fileName value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFileName(Object fileName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().modifiedDatetimeStart();
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withModifiedDatetimeStart(modifiedDatetimeStart);
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().modifiedDatetimeEnd();
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withModifiedDatetimeEnd(modifiedDatetimeEnd);
        return this;
    }

    /**
     * Get the format property: The format of the files.
     * 
     * @return the format value.
     */
    public DatasetStorageFormat format() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().format();
    }

    /**
     * Set the format property: The format of the files.
     * 
     * @param format the format value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFormat(DatasetStorageFormat format) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFormat(format);
        return this;
    }

    /**
     * Get the fileFilter property: Specify a filter to be used to select a subset of files in the folderPath rather
     * than all files. Type: string (or Expression with resultType string).
     * 
     * @return the fileFilter value.
     */
    public Object fileFilter() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileFilter();
    }

    /**
     * Set the fileFilter property: Specify a filter to be used to select a subset of files in the folderPath rather
     * than all files. Type: string (or Expression with resultType string).
     * 
     * @param fileFilter the fileFilter value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withFileFilter(Object fileFilter) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
        }
        this.innerTypeProperties().withFileFilter(fileFilter);
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the file system.
     * 
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compression();
    }

    /**
     * Set the compression property: The data compression method used for the file system.
     * 
     * @param compression the compression value to set.
     * @return the FileShareDataset object itself.
     */
    public FileShareDataset withCompression(DatasetCompression compression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileShareDatasetTypeProperties();
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
     * Reads an instance of FileShareDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FileShareDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FileShareDataset.
     */
    public static FileShareDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FileShareDataset deserializedFileShareDataset = new FileShareDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedFileShareDataset.withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedFileShareDataset.withDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedFileShareDataset.withStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedFileShareDataset.withSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedFileShareDataset.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedFileShareDataset.withAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedFileShareDataset.withFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedFileShareDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedFileShareDataset.innerTypeProperties = FileShareDatasetTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedFileShareDataset.withAdditionalProperties(additionalProperties);

            return deserializedFileShareDataset;
        });
    }
}
