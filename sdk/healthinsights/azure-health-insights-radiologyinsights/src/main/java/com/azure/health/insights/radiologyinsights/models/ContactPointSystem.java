// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Contact Point System
 * see https://www.hl7.org/fhir/R4/valueset-contact-point-system.html.
 */
public final class ContactPointSystem extends ExpandableStringEnum<ContactPointSystem> {

    /**
     * Phone.
     */
    @Generated
    public static final ContactPointSystem PHONE = fromString("phone");

    /**
     * Fax.
     */
    @Generated
    public static final ContactPointSystem FAX = fromString("fax");

    /**
     * Email.
     */
    @Generated
    public static final ContactPointSystem EMAIL = fromString("email");

    /**
     * Pager.
     */
    @Generated
    public static final ContactPointSystem PAGER = fromString("pager");

    /**
     * Url.
     */
    @Generated
    public static final ContactPointSystem URL = fromString("url");

    /**
     * Sms.
     */
    @Generated
    public static final ContactPointSystem SMS = fromString("sms");

    /**
     * Other.
     */
    @Generated
    public static final ContactPointSystem OTHER = fromString("other");

    /**
     * Creates a new instance of ContactPointSystem value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ContactPointSystem() {
    }

    /**
     * Creates or finds a ContactPointSystem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContactPointSystem.
     */
    @Generated
    public static ContactPointSystem fromString(String name) {
        return fromString(name, ContactPointSystem.class);
    }

    /**
     * Gets known ContactPointSystem values.
     *
     * @return known ContactPointSystem values.
     */
    @Generated
    public static Collection<ContactPointSystem> values() {
        return values(ContactPointSystem.class);
    }
}
