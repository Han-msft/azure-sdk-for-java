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
 * Google Cloud Storage read settings.
 */
@Fluent
public final class GoogleCloudStorageReadSettings extends StoreReadSettings {
    /*
     * The read setting type.
     */
    private String type = "GoogleCloudStorageReadSettings";

    /*
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    private Object recursive;

    /*
     * Google Cloud Storage wildcardFolderPath. Type: string (or Expression with resultType string).
     */
    private Object wildcardFolderPath;

    /*
     * Google Cloud Storage wildcardFileName. Type: string (or Expression with resultType string).
     */
    private Object wildcardFileName;

    /*
     * The prefix filter for the Google Cloud Storage object name. Type: string (or Expression with resultType string).
     */
    private Object prefix;

    /*
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to
     * copy. Type: string (or Expression with resultType string).
     */
    private Object fileListPath;

    /*
     * Indicates whether to enable partition discovery. Type: boolean (or Expression with resultType boolean).
     */
    private Object enablePartitionDiscovery;

    /*
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     */
    private Object partitionRootPath;

    /*
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or
     * Expression with resultType boolean).
     */
    private Object deleteFilesAfterCompletion;

    /*
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeStart;

    /*
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     */
    private Object modifiedDatetimeEnd;

    /**
     * Creates an instance of GoogleCloudStorageReadSettings class.
     */
    public GoogleCloudStorageReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the recursive value.
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param recursive the recursive value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the wildcardFolderPath property: Google Cloud Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     * 
     * @return the wildcardFolderPath value.
     */
    public Object wildcardFolderPath() {
        return this.wildcardFolderPath;
    }

    /**
     * Set the wildcardFolderPath property: Google Cloud Storage wildcardFolderPath. Type: string (or Expression with
     * resultType string).
     * 
     * @param wildcardFolderPath the wildcardFolderPath value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withWildcardFolderPath(Object wildcardFolderPath) {
        this.wildcardFolderPath = wildcardFolderPath;
        return this;
    }

    /**
     * Get the wildcardFileName property: Google Cloud Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     * 
     * @return the wildcardFileName value.
     */
    public Object wildcardFileName() {
        return this.wildcardFileName;
    }

    /**
     * Set the wildcardFileName property: Google Cloud Storage wildcardFileName. Type: string (or Expression with
     * resultType string).
     * 
     * @param wildcardFileName the wildcardFileName value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withWildcardFileName(Object wildcardFileName) {
        this.wildcardFileName = wildcardFileName;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the Google Cloud Storage object name. Type: string (or Expression
     * with resultType string).
     * 
     * @return the prefix value.
     */
    public Object prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the Google Cloud Storage object name. Type: string (or Expression
     * with resultType string).
     * 
     * @param prefix the prefix value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @return the fileListPath value.
     */
    public Object fileListPath() {
        return this.fileListPath;
    }

    /**
     * Set the fileListPath property: Point to a text file that lists each file (relative path to the path configured in
     * the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     * @param fileListPath the fileListPath value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withFileListPath(Object fileListPath) {
        this.fileListPath = fileListPath;
        return this;
    }

    /**
     * Get the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enablePartitionDiscovery value.
     */
    public Object enablePartitionDiscovery() {
        return this.enablePartitionDiscovery;
    }

    /**
     * Set the enablePartitionDiscovery property: Indicates whether to enable partition discovery. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enablePartitionDiscovery the enablePartitionDiscovery value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withEnablePartitionDiscovery(Object enablePartitionDiscovery) {
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        return this;
    }

    /**
     * Get the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @return the partitionRootPath value.
     */
    public Object partitionRootPath() {
        return this.partitionRootPath;
    }

    /**
     * Set the partitionRootPath property: Specify the root path where partition discovery starts from. Type: string (or
     * Expression with resultType string).
     * 
     * @param partitionRootPath the partitionRootPath value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withPartitionRootPath(Object partitionRootPath) {
        this.partitionRootPath = partitionRootPath;
        return this;
    }

    /**
     * Get the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the deleteFilesAfterCompletion value.
     */
    public Object deleteFilesAfterCompletion() {
        return this.deleteFilesAfterCompletion;
    }

    /**
     * Set the deleteFilesAfterCompletion property: Indicates whether the source files need to be deleted after copy
     * completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param deleteFilesAfterCompletion the deleteFilesAfterCompletion value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withDeleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeStart value.
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @return the modifiedDatetimeEnd value.
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of file's modified datetime. Type: string (or Expression with
     * resultType string).
     * 
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the GoogleCloudStorageReadSettings object itself.
     */
    public GoogleCloudStorageReadSettings withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoogleCloudStorageReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoogleCloudStorageReadSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("recursive", this.recursive);
        jsonWriter.writeUntypedField("wildcardFolderPath", this.wildcardFolderPath);
        jsonWriter.writeUntypedField("wildcardFileName", this.wildcardFileName);
        jsonWriter.writeUntypedField("prefix", this.prefix);
        jsonWriter.writeUntypedField("fileListPath", this.fileListPath);
        jsonWriter.writeUntypedField("enablePartitionDiscovery", this.enablePartitionDiscovery);
        jsonWriter.writeUntypedField("partitionRootPath", this.partitionRootPath);
        jsonWriter.writeUntypedField("deleteFilesAfterCompletion", this.deleteFilesAfterCompletion);
        jsonWriter.writeUntypedField("modifiedDatetimeStart", this.modifiedDatetimeStart);
        jsonWriter.writeUntypedField("modifiedDatetimeEnd", this.modifiedDatetimeEnd);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GoogleCloudStorageReadSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GoogleCloudStorageReadSettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GoogleCloudStorageReadSettings.
     */
    public static GoogleCloudStorageReadSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GoogleCloudStorageReadSettings deserializedGoogleCloudStorageReadSettings
                = new GoogleCloudStorageReadSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.withDisableMetricsCollection(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.type = reader.getString();
                } else if ("recursive".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.recursive = reader.readUntyped();
                } else if ("wildcardFolderPath".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.wildcardFolderPath = reader.readUntyped();
                } else if ("wildcardFileName".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.wildcardFileName = reader.readUntyped();
                } else if ("prefix".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.prefix = reader.readUntyped();
                } else if ("fileListPath".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.fileListPath = reader.readUntyped();
                } else if ("enablePartitionDiscovery".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.enablePartitionDiscovery = reader.readUntyped();
                } else if ("partitionRootPath".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.partitionRootPath = reader.readUntyped();
                } else if ("deleteFilesAfterCompletion".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.deleteFilesAfterCompletion = reader.readUntyped();
                } else if ("modifiedDatetimeStart".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.modifiedDatetimeStart = reader.readUntyped();
                } else if ("modifiedDatetimeEnd".equals(fieldName)) {
                    deserializedGoogleCloudStorageReadSettings.modifiedDatetimeEnd = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedGoogleCloudStorageReadSettings.withAdditionalProperties(additionalProperties);

            return deserializedGoogleCloudStorageReadSettings;
        });
    }
}
