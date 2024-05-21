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
 * A limited order discrepancy occurs when there is a limited order, but all body parts and measurements that are needed
 * for a complete order are present in the document.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = LimitedOrderDiscrepancyInference.class,
    visible = true)
@JsonTypeName("limitedOrderDiscrepancy")
@Immutable
public final class LimitedOrderDiscrepancyInference extends RadiologyInsightsInference {

    /*
     * The kind property.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private RadiologyInsightsInferenceType kind = RadiologyInsightsInferenceType.LIMITED_ORDER_DISCREPANCY;

    /*
     * Order type : CPT ultrasound complete code for abdomen, retroperitoneal, pelvis or breast.
     */
    @Generated
    @JsonProperty(value = "orderType")
    private final FhirR4CodeableConcept orderType;

    /*
     * List of body parts found in the document : SNOMED CT codes.
     */
    @Generated
    @JsonProperty(value = "presentBodyParts")
    private List<FhirR4CodeableConcept> presentBodyParts;

    /*
     * List of body parts that are measured according to the document : SNOMED CT codes.
     */
    @Generated
    @JsonProperty(value = "presentBodyPartMeasurements")
    private List<FhirR4CodeableConcept> presentBodyPartMeasurements;

    /**
     * Creates an instance of LimitedOrderDiscrepancyInference class.
     *
     * @param orderType the orderType value to set.
     */
    @Generated
    @JsonCreator
    private LimitedOrderDiscrepancyInference(@JsonProperty(value = "orderType") FhirR4CodeableConcept orderType) {
        this.orderType = orderType;
    }

    /**
     * Get the kind property: The kind property.
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
     * Get the presentBodyParts property: List of body parts found in the document : SNOMED CT codes.
     *
     * @return the presentBodyParts value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getPresentBodyParts() {
        return this.presentBodyParts;
    }

    /**
     * Get the presentBodyPartMeasurements property: List of body parts that are measured according to the document :
     * SNOMED CT codes.
     *
     * @return the presentBodyPartMeasurements value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getPresentBodyPartMeasurements() {
        return this.presentBodyPartMeasurements;
    }
}
