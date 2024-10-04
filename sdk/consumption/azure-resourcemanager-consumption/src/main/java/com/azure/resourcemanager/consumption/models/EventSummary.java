// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.resourcemanager.consumption.fluent.models.EventSummaryInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of EventSummary.
 */
public interface EventSummary {
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
     * Gets the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the transactionDate property: The date of the event.
     * 
     * @return the transactionDate value.
     */
    OffsetDateTime transactionDate();

    /**
     * Gets the description property: The description of the event.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the newCredit property: The amount of new credit or commitment for NewCredit or SettleCharges event.
     * 
     * @return the newCredit value.
     */
    Amount newCredit();

    /**
     * Gets the adjustments property: The amount of balance adjustment. The property is not available for
     * ConsumptionCommitment lots.
     * 
     * @return the adjustments value.
     */
    Amount adjustments();

    /**
     * Gets the creditExpired property: The amount of expired credit or commitment for NewCredit or SettleCharges event.
     * 
     * @return the creditExpired value.
     */
    Amount creditExpired();

    /**
     * Gets the charges property: The amount of charges for events of type SettleCharges and PendingEligibleCharges.
     * 
     * @return the charges value.
     */
    Amount charges();

    /**
     * Gets the closedBalance property: The balance after the event.
     * 
     * @return the closedBalance value.
     */
    Amount closedBalance();

    /**
     * Gets the eventType property: Identifies the type of the event.
     * 
     * @return the eventType value.
     */
    EventType eventType();

    /**
     * Gets the invoiceNumber property: The number which uniquely identifies the invoice on which the event was billed.
     * This will be empty for unbilled events.
     * 
     * @return the invoiceNumber value.
     */
    String invoiceNumber();

    /**
     * Gets the billingProfileId property: The ID that uniquely identifies the billing profile for which the event
     * happened. The property is only available for billing account of type MicrosoftCustomerAgreement.
     * 
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * Gets the billingProfileDisplayName property: The display name of the billing profile for which the event
     * happened. The property is only available for billing account of type MicrosoftCustomerAgreement.
     * 
     * @return the billingProfileDisplayName value.
     */
    String billingProfileDisplayName();

    /**
     * Gets the lotId property: The ID that uniquely identifies the lot for which the event happened.
     * 
     * @return the lotId value.
     */
    String lotId();

    /**
     * Gets the lotSource property: Identifies the source of the lot for which the event happened.
     * 
     * @return the lotSource value.
     */
    String lotSource();

    /**
     * Gets the canceledCredit property: Amount of canceled credit.
     * 
     * @return the canceledCredit value.
     */
    Amount canceledCredit();

    /**
     * Gets the creditCurrency property: The credit currency of the event.
     * 
     * @return the creditCurrency value.
     */
    String creditCurrency();

    /**
     * Gets the billingCurrency property: The billing currency of the event.
     * 
     * @return the billingCurrency value.
     */
    String billingCurrency();

    /**
     * Gets the reseller property: The reseller of the event.
     * 
     * @return the reseller value.
     */
    Reseller reseller();

    /**
     * Gets the creditExpiredInBillingCurrency property: The amount of expired credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     * 
     * @return the creditExpiredInBillingCurrency value.
     */
    AmountWithExchangeRate creditExpiredInBillingCurrency();

    /**
     * Gets the newCreditInBillingCurrency property: The amount of new credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     * 
     * @return the newCreditInBillingCurrency value.
     */
    AmountWithExchangeRate newCreditInBillingCurrency();

    /**
     * Gets the adjustmentsInBillingCurrency property: The amount of balance adjustment in billing currency.
     * 
     * @return the adjustmentsInBillingCurrency value.
     */
    AmountWithExchangeRate adjustmentsInBillingCurrency();

    /**
     * Gets the chargesInBillingCurrency property: The amount of charges for events of type SettleCharges and
     * PendingEligibleCharges in billing currency.
     * 
     * @return the chargesInBillingCurrency value.
     */
    AmountWithExchangeRate chargesInBillingCurrency();

    /**
     * Gets the closedBalanceInBillingCurrency property: The balance in billing currency after the event.
     * 
     * @return the closedBalanceInBillingCurrency value.
     */
    AmountWithExchangeRate closedBalanceInBillingCurrency();

    /**
     * Gets the etagPropertiesEtag property: The eTag for the resource.
     * 
     * @return the etagPropertiesEtag value.
     */
    String etagPropertiesEtag();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.fluent.models.EventSummaryInner object.
     * 
     * @return the inner object.
     */
    EventSummaryInner innerModel();
}
