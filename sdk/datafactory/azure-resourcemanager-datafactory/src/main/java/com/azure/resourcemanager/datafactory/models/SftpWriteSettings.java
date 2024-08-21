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
import java.util.List;
import java.util.Map;

/**
 * Sftp write settings.
 */
@Fluent
public final class SftpWriteSettings extends StoreWriteSettings {
    /*
     * The write setting type.
     */
    private String type = "SftpWriteSettings";

    /*
     * Specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or
     * Expression with resultType string).
     */
    private Object operationTimeout;

    /*
     * Upload to temporary file(s) and rename. Disable this option if your SFTP server doesn't support rename operation.
     * Type: boolean (or Expression with resultType boolean).
     */
    private Object useTempFileRename;

    /**
     * Creates an instance of SftpWriteSettings class.
     */
    public SftpWriteSettings() {
    }

    /**
     * Get the type property: The write setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the operationTimeout property: Specifies the timeout for writing each chunk to SFTP server. Default value:
     * 01:00:00 (one hour). Type: string (or Expression with resultType string).
     * 
     * @return the operationTimeout value.
     */
    public Object operationTimeout() {
        return this.operationTimeout;
    }

    /**
     * Set the operationTimeout property: Specifies the timeout for writing each chunk to SFTP server. Default value:
     * 01:00:00 (one hour). Type: string (or Expression with resultType string).
     * 
     * @param operationTimeout the operationTimeout value to set.
     * @return the SftpWriteSettings object itself.
     */
    public SftpWriteSettings withOperationTimeout(Object operationTimeout) {
        this.operationTimeout = operationTimeout;
        return this;
    }

    /**
     * Get the useTempFileRename property: Upload to temporary file(s) and rename. Disable this option if your SFTP
     * server doesn't support rename operation. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the useTempFileRename value.
     */
    public Object useTempFileRename() {
        return this.useTempFileRename;
    }

    /**
     * Set the useTempFileRename property: Upload to temporary file(s) and rename. Disable this option if your SFTP
     * server doesn't support rename operation. Type: boolean (or Expression with resultType boolean).
     * 
     * @param useTempFileRename the useTempFileRename value to set.
     * @return the SftpWriteSettings object itself.
     */
    public SftpWriteSettings withUseTempFileRename(Object useTempFileRename) {
        this.useTempFileRename = useTempFileRename;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SftpWriteSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SftpWriteSettings withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SftpWriteSettings withCopyBehavior(Object copyBehavior) {
        super.withCopyBehavior(copyBehavior);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SftpWriteSettings withMetadata(List<MetadataItem> metadata) {
        super.withMetadata(metadata);
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
        jsonWriter.writeUntypedField("copyBehavior", copyBehavior());
        jsonWriter.writeArrayField("metadata", metadata(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeUntypedField("operationTimeout", this.operationTimeout);
        jsonWriter.writeUntypedField("useTempFileRename", this.useTempFileRename);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SftpWriteSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SftpWriteSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SftpWriteSettings.
     */
    public static SftpWriteSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SftpWriteSettings deserializedSftpWriteSettings = new SftpWriteSettings();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedSftpWriteSettings.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedSftpWriteSettings.withDisableMetricsCollection(reader.readUntyped());
                } else if ("copyBehavior".equals(fieldName)) {
                    deserializedSftpWriteSettings.withCopyBehavior(reader.readUntyped());
                } else if ("metadata".equals(fieldName)) {
                    List<MetadataItem> metadata = reader.readArray(reader1 -> MetadataItem.fromJson(reader1));
                    deserializedSftpWriteSettings.withMetadata(metadata);
                } else if ("type".equals(fieldName)) {
                    deserializedSftpWriteSettings.type = reader.getString();
                } else if ("operationTimeout".equals(fieldName)) {
                    deserializedSftpWriteSettings.operationTimeout = reader.readUntyped();
                } else if ("useTempFileRename".equals(fieldName)) {
                    deserializedSftpWriteSettings.useTempFileRename = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSftpWriteSettings.withAdditionalProperties(additionalProperties);

            return deserializedSftpWriteSettings;
        });
    }
}
