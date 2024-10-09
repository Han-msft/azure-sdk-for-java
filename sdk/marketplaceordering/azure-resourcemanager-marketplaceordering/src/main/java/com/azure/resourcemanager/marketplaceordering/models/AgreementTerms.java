// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.marketplaceordering.fluent.models.AgreementTermsInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of AgreementTerms.
 */
public interface AgreementTerms {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the publisher property: Publisher identifier string of image being deployed.
     * 
     * @return the publisher value.
     */
    String publisher();

    /**
     * Gets the product property: Offer identifier string of image being deployed.
     * 
     * @return the product value.
     */
    String product();

    /**
     * Gets the plan property: Plan identifier string of image being deployed.
     * 
     * @return the plan value.
     */
    String plan();

    /**
     * Gets the licenseTextLink property: Link to HTML with Microsoft and Publisher terms.
     * 
     * @return the licenseTextLink value.
     */
    String licenseTextLink();

    /**
     * Gets the privacyPolicyLink property: Link to the privacy policy of the publisher.
     * 
     * @return the privacyPolicyLink value.
     */
    String privacyPolicyLink();

    /**
     * Gets the marketplaceTermsLink property: Link to HTML with Azure Marketplace terms.
     * 
     * @return the marketplaceTermsLink value.
     */
    String marketplaceTermsLink();

    /**
     * Gets the retrieveDatetime property: Date and time in UTC of when the terms were accepted. This is empty if
     * Accepted is false.
     * 
     * @return the retrieveDatetime value.
     */
    OffsetDateTime retrieveDatetime();

    /**
     * Gets the signature property: Terms signature.
     * 
     * @return the signature value.
     */
    String signature();

    /**
     * Gets the accepted property: If any version of the terms have been accepted, otherwise false.
     * 
     * @return the accepted value.
     */
    Boolean accepted();

    /**
     * Gets the inner com.azure.resourcemanager.marketplaceordering.fluent.models.AgreementTermsInner object.
     * 
     * @return the inner object.
     */
    AgreementTermsInner innerModel();
}
