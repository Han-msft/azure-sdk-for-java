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
 * A copy activity Binary source.
 */
@Fluent
public final class BinarySource extends CopySource {
    /*
     * Copy source type.
     */
    private String type = "BinarySource";

    /*
     * Binary store settings.
     */
    private StoreReadSettings storeSettings;

    /*
     * Binary format settings.
     */
    private BinaryReadSettings formatSettings;

    /**
     * Creates an instance of BinarySource class.
     */
    public BinarySource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the storeSettings property: Binary store settings.
     * 
     * @return the storeSettings value.
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Binary store settings.
     * 
     * @param storeSettings the storeSettings value to set.
     * @return the BinarySource object itself.
     */
    public BinarySource withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Binary format settings.
     * 
     * @return the formatSettings value.
     */
    public BinaryReadSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Binary format settings.
     * 
     * @param formatSettings the formatSettings value to set.
     * @return the BinarySource object itself.
     */
    public BinarySource withFormatSettings(BinaryReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinarySource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinarySource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinarySource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BinarySource withDisableMetricsCollection(Object disableMetricsCollection) {
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
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("sourceRetryCount", sourceRetryCount());
        jsonWriter.writeUntypedField("sourceRetryWait", sourceRetryWait());
        jsonWriter.writeUntypedField("maxConcurrentConnections", maxConcurrentConnections());
        jsonWriter.writeUntypedField("disableMetricsCollection", disableMetricsCollection());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("storeSettings", this.storeSettings);
        jsonWriter.writeJsonField("formatSettings", this.formatSettings);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BinarySource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BinarySource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BinarySource.
     */
    public static BinarySource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BinarySource deserializedBinarySource = new BinarySource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedBinarySource.withSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedBinarySource.withSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedBinarySource.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedBinarySource.withDisableMetricsCollection(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedBinarySource.type = reader.getString();
                } else if ("storeSettings".equals(fieldName)) {
                    deserializedBinarySource.storeSettings = StoreReadSettings.fromJson(reader);
                } else if ("formatSettings".equals(fieldName)) {
                    deserializedBinarySource.formatSettings = BinaryReadSettings.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedBinarySource.withAdditionalProperties(additionalProperties);

            return deserializedBinarySource;
        });
    }
}
