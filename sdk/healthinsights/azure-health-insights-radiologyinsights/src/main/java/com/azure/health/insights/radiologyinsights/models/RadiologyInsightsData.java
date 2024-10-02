// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Contains the list of patients, and configuration data.
 */
@Fluent
public final class RadiologyInsightsData implements JsonSerializable<RadiologyInsightsData> {

    /*
     * The list of patients, including their clinical information and data.
     */
    @Generated
    private final List<PatientRecord> patients;

    /*
     * Configuration affecting the Radiology Insights model's inference.
     */
    @Generated
    private RadiologyInsightsModelConfiguration configuration;

    /**
     * Creates an instance of RadiologyInsightsData class.
     *
     * @param patients the patients value to set.
     */
    @Generated
    public RadiologyInsightsData(List<PatientRecord> patients) {
        this.patients = patients;
    }

    /**
     * Get the patients property: The list of patients, including their clinical information and data.
     *
     * @return the patients value.
     */
    @Generated
    public List<PatientRecord> getPatients() {
        return this.patients;
    }

    /**
     * Get the configuration property: Configuration affecting the Radiology Insights model's inference.
     *
     * @return the configuration value.
     */
    @Generated
    public RadiologyInsightsModelConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Configuration affecting the Radiology Insights model's inference.
     *
     * @param configuration the configuration value to set.
     * @return the RadiologyInsightsData object itself.
     */
    @Generated
    public RadiologyInsightsData setConfiguration(RadiologyInsightsModelConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("patients", this.patients, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("configuration", this.configuration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RadiologyInsightsData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RadiologyInsightsData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RadiologyInsightsData.
     */
    @Generated
    public static RadiologyInsightsData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<PatientRecord> patients = null;
            RadiologyInsightsModelConfiguration configuration = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("patients".equals(fieldName)) {
                    patients = reader.readArray(reader1 -> PatientRecord.fromJson(reader1));
                } else if ("configuration".equals(fieldName)) {
                    configuration = RadiologyInsightsModelConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            RadiologyInsightsData deserializedRadiologyInsightsData = new RadiologyInsightsData(patients);
            deserializedRadiologyInsightsData.configuration = configuration;
            return deserializedRadiologyInsightsData;
        });
    }
}
