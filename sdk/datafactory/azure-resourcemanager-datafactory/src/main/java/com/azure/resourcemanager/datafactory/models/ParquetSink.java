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
 * A copy activity Parquet sink.
 */
@Fluent
public final class ParquetSink extends CopySink {
    /*
     * Copy sink type.
     */
    private String type = "ParquetSink";

    /*
     * Parquet store settings.
     */
    private StoreWriteSettings storeSettings;

    /*
     * Parquet format settings.
     */
    private ParquetWriteSettings formatSettings;

    /**
     * Creates an instance of ParquetSink class.
     */
    public ParquetSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the storeSettings property: Parquet store settings.
     * 
     * @return the storeSettings value.
     */
    public StoreWriteSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Parquet store settings.
     * 
     * @param storeSettings the storeSettings value to set.
     * @return the ParquetSink object itself.
     */
    public ParquetSink withStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Parquet format settings.
     * 
     * @return the formatSettings value.
     */
    public ParquetWriteSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Parquet format settings.
     * 
     * @param formatSettings the formatSettings value to set.
     * @return the ParquetSink object itself.
     */
    public ParquetSink withFormatSettings(ParquetWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParquetSink withDisableMetricsCollection(Object disableMetricsCollection) {
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
        jsonWriter.writeUntypedField("writeBatchSize", writeBatchSize());
        jsonWriter.writeUntypedField("writeBatchTimeout", writeBatchTimeout());
        jsonWriter.writeUntypedField("sinkRetryCount", sinkRetryCount());
        jsonWriter.writeUntypedField("sinkRetryWait", sinkRetryWait());
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
     * Reads an instance of ParquetSink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParquetSink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ParquetSink.
     */
    public static ParquetSink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParquetSink deserializedParquetSink = new ParquetSink();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("writeBatchSize".equals(fieldName)) {
                    deserializedParquetSink.withWriteBatchSize(reader.readUntyped());
                } else if ("writeBatchTimeout".equals(fieldName)) {
                    deserializedParquetSink.withWriteBatchTimeout(reader.readUntyped());
                } else if ("sinkRetryCount".equals(fieldName)) {
                    deserializedParquetSink.withSinkRetryCount(reader.readUntyped());
                } else if ("sinkRetryWait".equals(fieldName)) {
                    deserializedParquetSink.withSinkRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedParquetSink.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedParquetSink.withDisableMetricsCollection(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedParquetSink.type = reader.getString();
                } else if ("storeSettings".equals(fieldName)) {
                    deserializedParquetSink.storeSettings = StoreWriteSettings.fromJson(reader);
                } else if ("formatSettings".equals(fieldName)) {
                    deserializedParquetSink.formatSettings = ParquetWriteSettings.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedParquetSink.withAdditionalProperties(additionalProperties);

            return deserializedParquetSink;
        });
    }
}
