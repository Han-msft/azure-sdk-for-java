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
 * A copy activity Oracle source.
 */
@Fluent
public final class OracleSource extends CopySource {
    /*
     * Copy source type.
     */
    private String type = "OracleSource";

    /*
     * Oracle reader query. Type: string (or Expression with resultType string).
     */
    private Object oracleReaderQuery;

    /*
     * Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    private Object queryTimeout;

    /*
     * The partition mechanism that will be used for Oracle read in parallel. Possible values include: "None",
     * "PhysicalPartitionsOfTable", "DynamicRange".
     */
    private Object partitionOption;

    /*
     * The settings that will be leveraged for Oracle source partitioning.
     */
    private OraclePartitionSettings partitionSettings;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or
     * Expression with resultType array of objects).
     */
    private Object additionalColumns;

    /**
     * Creates an instance of OracleSource class.
     */
    public OracleSource() {
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
     * Get the oracleReaderQuery property: Oracle reader query. Type: string (or Expression with resultType string).
     * 
     * @return the oracleReaderQuery value.
     */
    public Object oracleReaderQuery() {
        return this.oracleReaderQuery;
    }

    /**
     * Set the oracleReaderQuery property: Oracle reader query. Type: string (or Expression with resultType string).
     * 
     * @param oracleReaderQuery the oracleReaderQuery value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource withOracleReaderQuery(Object oracleReaderQuery) {
        this.oracleReaderQuery = oracleReaderQuery;
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the queryTimeout value.
     */
    public Object queryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param queryTimeout the queryTimeout value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource withQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for Oracle read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     * @return the partitionOption value.
     */
    public Object partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for Oracle read in parallel. Possible
     * values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     * @param partitionOption the partitionOption value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource withPartitionOption(Object partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for Oracle source partitioning.
     * 
     * @return the partitionSettings value.
     */
    public OraclePartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for Oracle source partitioning.
     * 
     * @param partitionSettings the partitionSettings value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource withPartitionSettings(OraclePartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @return the additionalColumns value.
     */
    public Object additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @param additionalColumns the additionalColumns value to set.
     * @return the OracleSource object itself.
     */
    public OracleSource withAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OracleSource withDisableMetricsCollection(Object disableMetricsCollection) {
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
        if (partitionSettings() != null) {
            partitionSettings().validate();
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
        jsonWriter.writeUntypedField("oracleReaderQuery", this.oracleReaderQuery);
        jsonWriter.writeUntypedField("queryTimeout", this.queryTimeout);
        jsonWriter.writeUntypedField("partitionOption", this.partitionOption);
        jsonWriter.writeJsonField("partitionSettings", this.partitionSettings);
        jsonWriter.writeUntypedField("additionalColumns", this.additionalColumns);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OracleSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OracleSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OracleSource.
     */
    public static OracleSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OracleSource deserializedOracleSource = new OracleSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedOracleSource.withSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedOracleSource.withSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedOracleSource.withMaxConcurrentConnections(reader.readUntyped());
                } else if ("disableMetricsCollection".equals(fieldName)) {
                    deserializedOracleSource.withDisableMetricsCollection(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedOracleSource.type = reader.getString();
                } else if ("oracleReaderQuery".equals(fieldName)) {
                    deserializedOracleSource.oracleReaderQuery = reader.readUntyped();
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedOracleSource.queryTimeout = reader.readUntyped();
                } else if ("partitionOption".equals(fieldName)) {
                    deserializedOracleSource.partitionOption = reader.readUntyped();
                } else if ("partitionSettings".equals(fieldName)) {
                    deserializedOracleSource.partitionSettings = OraclePartitionSettings.fromJson(reader);
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedOracleSource.additionalColumns = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedOracleSource.withAdditionalProperties(additionalProperties);

            return deserializedOracleSource;
        });
    }
}
