// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Known values codes that can be used to indicate the class of encounter (TODO://Based on FHIR value set--http://....).
 */
public final class EncounterClass extends ExpandableStringEnum<EncounterClass> {

    /**
     * A patient encounter where a patient is admitted by a hospital or equivalent facility, assigned to a location
     * where patients generally stay at least overnight and provided with room, board, and continuous nursing service.
     */
    @Generated
    public static final EncounterClass IN_PATIENT = fromString("inpatient");

    /**
     * The term ambulatory usually implies that the patient has come to the location and is not assigned to a bed.
     * Sometimes referred to as an outpatient encounter.
     */
    @Generated
    public static final EncounterClass AMBULATORY = fromString("ambulatory");

    /**
     * An encounter where the patient usually will start in different encounter, such as one in the emergency department
     * but then transition to this type of encounter because they require a significant period of treatment and
     * monitoring to determine whether or not their condition warrants an inpatient admission or discharge.
     */
    @Generated
    public static final EncounterClass OBSERVATION = fromString("observation");

    /**
     * A patient encounter that takes place at a dedicated healthcare service delivery location where the patient
     * receives immediate evaluation and treatment, provided until the patient can be discharged or responsibility for
     * the patient's care is transferred elsewhere (for example, the patient could be admitted as an inpatient or
     * transferred to another facility.
     */
    @Generated
    public static final EncounterClass EMERGENCY = fromString("emergency");

    /**
     * A patient encounter where the patient is not physically present for the encounter, such as in a telehealth
     * encounter, phone call, or electronic communication.
     */
    @Generated
    public static final EncounterClass VIRTUAL = fromString("virtual");

    /**
     * Healthcare encounter that takes place in the residence of the patient or a designee.
     */
    @Generated
    public static final EncounterClass HEALTH_HOME = fromString("healthHome");

    /**
     * Creates a new instance of EncounterClass value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public EncounterClass() {
    }

    /**
     * Creates or finds a EncounterClass from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EncounterClass.
     */
    @Generated
    public static EncounterClass fromString(String name) {
        return fromString(name, EncounterClass.class);
    }

    /**
     * Gets known EncounterClass values.
     *
     * @return known EncounterClass values.
     */
    @Generated
    public static Collection<EncounterClass> values() {
        return values(EncounterClass.class);
    }
}
