// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A complete order discrepancy is shown when one or more body parts and/or measurements that should be in the document
 * (because there is a complete order) are not present.
 */
@Immutable
public final class CompleteOrderDiscrepancyInference extends RadiologyInsightsInference {

    /*
     * Discriminator property for RadiologyInsightsInference.
     */
    @Generated
    private RadiologyInsightsInferenceType kind = RadiologyInsightsInferenceType.COMPLETE_ORDER_DISCREPANCY;

    /*
     * Order type : CPT ultrasound complete code for abdomen, retroperitoneal, pelvis or breast.
     */
    @Generated
    private final FhirR4CodeableConcept orderType;

    /*
     * List of missing body parts required by a complete order : SNOMED CT codes.
     */
    @Generated
    private List<FhirR4CodeableConcept> missingBodyParts;

    /*
     * List of missing body parts that require measurement by a complete order : SNOMED CT codes.
     */
    @Generated
    private List<FhirR4CodeableConcept> missingBodyPartMeasurements;

    /**
     * Creates an instance of CompleteOrderDiscrepancyInference class.
     *
     * @param orderType the orderType value to set.
     */
    @Generated
    private CompleteOrderDiscrepancyInference(FhirR4CodeableConcept orderType) {
        this.orderType = orderType;
    }

    /**
     * Get the kind property: Discriminator property for RadiologyInsightsInference.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public RadiologyInsightsInferenceType getKind() {
        return this.kind;
    }

    /**
     * Get the orderType property: Order type : CPT ultrasound complete code for abdomen, retroperitoneal, pelvis or
     * breast.
     *
     * @return the orderType value.
     */
    @Generated
    public FhirR4CodeableConcept getOrderType() {
        return this.orderType;
    }

    /**
     * Get the missingBodyParts property: List of missing body parts required by a complete order : SNOMED CT codes.
     *
     * @return the missingBodyParts value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getMissingBodyParts() {
        return this.missingBodyParts;
    }

    /**
     * Get the missingBodyPartMeasurements property: List of missing body parts that require measurement by a complete
     * order : SNOMED CT codes.
     *
     * @return the missingBodyPartMeasurements value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getMissingBodyPartMeasurements() {
        return this.missingBodyPartMeasurements;
    }

    /*
     * Additional Content defined by implementations
     */
    @Generated
    private List<FhirR4Extension> extension;

    /**
     * Get the extension property: Additional Content defined by implementations.
     *
     * @return the extension value.
     */
    @Generated
    @Override
    public List<FhirR4Extension> getExtension() {
        return this.extension;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("extension", getExtension(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("orderType", this.orderType);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeArrayField("missingBodyParts", this.missingBodyParts,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("missingBodyPartMeasurements", this.missingBodyPartMeasurements,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CompleteOrderDiscrepancyInference from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CompleteOrderDiscrepancyInference if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CompleteOrderDiscrepancyInference.
     */
    @Generated
    public static CompleteOrderDiscrepancyInference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<FhirR4Extension> extension = null;
            FhirR4CodeableConcept orderType = null;
            RadiologyInsightsInferenceType kind = RadiologyInsightsInferenceType.COMPLETE_ORDER_DISCREPANCY;
            List<FhirR4CodeableConcept> missingBodyParts = null;
            List<FhirR4CodeableConcept> missingBodyPartMeasurements = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("extension".equals(fieldName)) {
                    extension = reader.readArray(reader1 -> FhirR4Extension.fromJson(reader1));
                } else if ("orderType".equals(fieldName)) {
                    orderType = FhirR4CodeableConcept.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    kind = RadiologyInsightsInferenceType.fromString(reader.getString());
                } else if ("missingBodyParts".equals(fieldName)) {
                    missingBodyParts = reader.readArray(reader1 -> FhirR4CodeableConcept.fromJson(reader1));
                } else if ("missingBodyPartMeasurements".equals(fieldName)) {
                    missingBodyPartMeasurements = reader.readArray(reader1 -> FhirR4CodeableConcept.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            CompleteOrderDiscrepancyInference deserializedCompleteOrderDiscrepancyInference
                = new CompleteOrderDiscrepancyInference(orderType);
            deserializedCompleteOrderDiscrepancyInference.extension = extension;
            deserializedCompleteOrderDiscrepancyInference.kind = kind;
            deserializedCompleteOrderDiscrepancyInference.missingBodyParts = missingBodyParts;
            deserializedCompleteOrderDiscrepancyInference.missingBodyPartMeasurements = missingBodyPartMeasurements;
            return deserializedCompleteOrderDiscrepancyInference;
        });
    }
}
