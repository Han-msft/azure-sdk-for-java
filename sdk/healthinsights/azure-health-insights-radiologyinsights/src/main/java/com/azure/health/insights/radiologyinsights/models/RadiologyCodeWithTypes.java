// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Radiology code with types : used in imaging procedure recommendation for contrast and view.
 */
@Immutable
public final class RadiologyCodeWithTypes {

    /*
     * The SNOMED CT code indicates whether imaging was conducted with or without contrast in the case of contrast, and
     * in the case of views, it denotes the number of views.
     */
    @Generated
    @JsonProperty(value = "code")
    private final FhirR4CodeableConcept code;

    /*
     * The collection of types will indicate the contrast substance used in the case of contrast and, in the case of
     * views, it will specify the types of views, such as lateral and frontal, etc.
     */
    @Generated
    @JsonProperty(value = "types")
    private final List<FhirR4CodeableConcept> types;

    /**
     * Creates an instance of RadiologyCodeWithTypes class.
     *
     * @param code the code value to set.
     * @param types the types value to set.
     */
    @Generated
    @JsonCreator
    private RadiologyCodeWithTypes(@JsonProperty(value = "code") FhirR4CodeableConcept code,
        @JsonProperty(value = "types") List<FhirR4CodeableConcept> types) {
        this.code = code;
        this.types = types;
    }

    /**
     * Get the code property: The SNOMED CT code indicates whether imaging was conducted with or without contrast in the
     * case of contrast, and in the case of views, it denotes the number of views.
     *
     * @return the code value.
     */
    @Generated
    public FhirR4CodeableConcept getCode() {
        return this.code;
    }

    /**
     * Get the types property: The collection of types will indicate the contrast substance used in the case of contrast
     * and, in the case of views, it will specify the types of views, such as lateral and frontal, etc.
     *
     * @return the types value.
     */
    @Generated
    public List<FhirR4CodeableConcept> getTypes() {
        return this.types;
    }
}
