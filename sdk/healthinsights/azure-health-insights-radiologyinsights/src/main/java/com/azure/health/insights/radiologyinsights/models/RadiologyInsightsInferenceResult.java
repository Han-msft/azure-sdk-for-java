// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The inference results for the Radiology Insights request. If field 'status' has value 'succeeded', then field
 * 'result' will contain an instance of RadiologyInsightsInferenceResult.
 */
@Immutable
public final class RadiologyInsightsInferenceResult implements JsonSerializable<RadiologyInsightsInferenceResult> {

    /*
     * Results for the patients given in the request.
     */
    @Generated
    private final List<RadiologyInsightsPatientResult> patientResults;

    /*
     * The version of the model used for inference, expressed as the model date.
     */
    @Generated
    private final String modelVersion;

    /**
     * Creates an instance of RadiologyInsightsInferenceResult class.
     *
     * @param patientResults the patientResults value to set.
     * @param modelVersion the modelVersion value to set.
     */
    @Generated
    private RadiologyInsightsInferenceResult(List<RadiologyInsightsPatientResult> patientResults, String modelVersion) {
        this.patientResults = patientResults;
        this.modelVersion = modelVersion;
    }

    /**
     * Get the patientResults property: Results for the patients given in the request.
     *
     * @return the patientResults value.
     */
    @Generated
    public List<RadiologyInsightsPatientResult> getPatientResults() {
        return this.patientResults;
    }

    /**
     * Get the modelVersion property: The version of the model used for inference, expressed as the model date.
     *
     * @return the modelVersion value.
     */
    @Generated
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("patientResults", this.patientResults,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("modelVersion", this.modelVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RadiologyInsightsInferenceResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RadiologyInsightsInferenceResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RadiologyInsightsInferenceResult.
     */
    @Generated
    public static RadiologyInsightsInferenceResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<RadiologyInsightsPatientResult> patientResults = null;
            String modelVersion = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("patientResults".equals(fieldName)) {
                    patientResults = reader.readArray(reader1 -> RadiologyInsightsPatientResult.fromJson(reader1));
                } else if ("modelVersion".equals(fieldName)) {
                    modelVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new RadiologyInsightsInferenceResult(patientResults, modelVersion);
        });
    }
}
