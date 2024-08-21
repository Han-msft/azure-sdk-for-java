// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The settings that will be leveraged for SAP table source partitioning.
 */
@Fluent
public final class SapTablePartitionSettings implements JsonSerializable<SapTablePartitionSettings> {
    /*
     * The name of the column that will be used for proceeding range partitioning. Type: string (or Expression with
     * resultType string).
     */
    private Object partitionColumnName;

    /*
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning.
     * Type: string (or Expression with resultType string).
     */
    private Object partitionUpperBound;

    /*
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning.
     * Type: string (or Expression with resultType string).
     */
    private Object partitionLowerBound;

    /*
     * The maximum value of partitions the table will be split into. Type: integer (or Expression with resultType
     * string).
     */
    private Object maxPartitionsNumber;

    /**
     * Creates an instance of SapTablePartitionSettings class.
     */
    public SapTablePartitionSettings() {
    }

    /**
     * Get the partitionColumnName property: The name of the column that will be used for proceeding range partitioning.
     * Type: string (or Expression with resultType string).
     * 
     * @return the partitionColumnName value.
     */
    public Object partitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the partitionColumnName property: The name of the column that will be used for proceeding range partitioning.
     * Type: string (or Expression with resultType string).
     * 
     * @param partitionColumnName the partitionColumnName value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * Get the partitionUpperBound property: The maximum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionUpperBound value.
     */
    public Object partitionUpperBound() {
        return this.partitionUpperBound;
    }

    /**
     * Set the partitionUpperBound property: The maximum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionUpperBound the partitionUpperBound value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withPartitionUpperBound(Object partitionUpperBound) {
        this.partitionUpperBound = partitionUpperBound;
        return this;
    }

    /**
     * Get the partitionLowerBound property: The minimum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionLowerBound value.
     */
    public Object partitionLowerBound() {
        return this.partitionLowerBound;
    }

    /**
     * Set the partitionLowerBound property: The minimum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionLowerBound the partitionLowerBound value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withPartitionLowerBound(Object partitionLowerBound) {
        this.partitionLowerBound = partitionLowerBound;
        return this;
    }

    /**
     * Get the maxPartitionsNumber property: The maximum value of partitions the table will be split into. Type: integer
     * (or Expression with resultType string).
     * 
     * @return the maxPartitionsNumber value.
     */
    public Object maxPartitionsNumber() {
        return this.maxPartitionsNumber;
    }

    /**
     * Set the maxPartitionsNumber property: The maximum value of partitions the table will be split into. Type: integer
     * (or Expression with resultType string).
     * 
     * @param maxPartitionsNumber the maxPartitionsNumber value to set.
     * @return the SapTablePartitionSettings object itself.
     */
    public SapTablePartitionSettings withMaxPartitionsNumber(Object maxPartitionsNumber) {
        this.maxPartitionsNumber = maxPartitionsNumber;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("partitionColumnName", this.partitionColumnName);
        jsonWriter.writeUntypedField("partitionUpperBound", this.partitionUpperBound);
        jsonWriter.writeUntypedField("partitionLowerBound", this.partitionLowerBound);
        jsonWriter.writeUntypedField("maxPartitionsNumber", this.maxPartitionsNumber);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapTablePartitionSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapTablePartitionSettings if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SapTablePartitionSettings.
     */
    public static SapTablePartitionSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapTablePartitionSettings deserializedSapTablePartitionSettings = new SapTablePartitionSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("partitionColumnName".equals(fieldName)) {
                    deserializedSapTablePartitionSettings.partitionColumnName = reader.readUntyped();
                } else if ("partitionUpperBound".equals(fieldName)) {
                    deserializedSapTablePartitionSettings.partitionUpperBound = reader.readUntyped();
                } else if ("partitionLowerBound".equals(fieldName)) {
                    deserializedSapTablePartitionSettings.partitionLowerBound = reader.readUntyped();
                } else if ("maxPartitionsNumber".equals(fieldName)) {
                    deserializedSapTablePartitionSettings.maxPartitionsNumber = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSapTablePartitionSettings;
        });
    }
}
