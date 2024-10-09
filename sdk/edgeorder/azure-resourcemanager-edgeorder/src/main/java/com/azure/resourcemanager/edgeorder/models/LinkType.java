// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of link.
 */
public final class LinkType extends ExpandableStringEnum<LinkType> {
    /**
     * Static value Generic for LinkType.
     */
    public static final LinkType GENERIC = fromString("Generic");

    /**
     * Static value TermsAndConditions for LinkType.
     */
    public static final LinkType TERMS_AND_CONDITIONS = fromString("TermsAndConditions");

    /**
     * Static value Specification for LinkType.
     */
    public static final LinkType SPECIFICATION = fromString("Specification");

    /**
     * Static value Documentation for LinkType.
     */
    public static final LinkType DOCUMENTATION = fromString("Documentation");

    /**
     * Static value KnowMore for LinkType.
     */
    public static final LinkType KNOW_MORE = fromString("KnowMore");

    /**
     * Static value SignUp for LinkType.
     */
    public static final LinkType SIGN_UP = fromString("SignUp");

    /**
     * Creates a new instance of LinkType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LinkType() {
    }

    /**
     * Creates or finds a LinkType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LinkType.
     */
    public static LinkType fromString(String name) {
        return fromString(name, LinkType.class);
    }

    /**
     * Gets known LinkType values.
     * 
     * @return known LinkType values.
     */
    public static Collection<LinkType> values() {
        return values(LinkType.class);
    }
}
