// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Radiology procedures are the specific imaging studies or examinations ordered for the patient, extracted from the
 * document information and text.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = RadiologyProcedureInference.class,
    visible = true)
@JsonTypeName("radiologyProcedure")
@Immutable
public final class RadiologyProcedureInference extends RadiologyInsightsInference {

    /*
     * Discriminator property for RadiologyInsightsInference.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private RadiologyInsightsInferenceType kind = RadiologyInsightsInferenceType.RADIOLOGY_PROCEDURE;

    /*
     * LOINC codes for the procedure.
     */
    @Generated
    @JsonProperty(value = "procedureCodes")
    private List<FhirR4CodeableConcept> procedureCodes;

    /*
     * Imaging procedures.
     */
    @Generated
    @JsonProperty(value = "imagingProcedures")
    private final List<ImagingProcedure> imagingProcedures;

    /*
     * Ordered procedure information from the document information or text.
     */
    @Generated
    @JsonProperty(value = "orderedProcedure")
    private final OrderedProcedure orderedProcedure;

    /**
     * Creates an instance of RadiologyProcedureInference class.
     *
     * @param imagingProcedures the imagingProcedures value to set.
     * @param orderedProcedure the orderedProcedure value to set.
     */
    @Generated
    @JsonCreator
    private RadiologyProcedureInference(
        @JsonProperty(value = "imagingProcedures") List<ImagingProcedure> imagingProcedures,
        @JsonProperty(value = "orderedProcedure") OrderedProcedure orderedProcedure) {
        this.imagingProcedures = imagingProcedures;
        this.orderedProcedure = orderedProcedure;
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
     * Get the procedureCodes property: LOINC codes for the procedure.
     *
     * @return the procedureCodes value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getProcedureCodes() {
        return this.procedureCodes;
    }

    /**
     * Get the imagingProcedures property: Imaging procedures.
     *
     * @return the imagingProcedures value.
     */
    @Generated
    public List<ImagingProcedure> getImagingProcedures() {
        return this.imagingProcedures;
    }

    /**
     * Get the orderedProcedure property: Ordered procedure information from the document information or text.
     *
     * @return the orderedProcedure value.
     */
    @Generated
    public OrderedProcedure getOrderedProcedure() {
        return this.orderedProcedure;
    }
}
