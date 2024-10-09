// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.consumption.models.Amount;
import com.azure.resourcemanager.consumption.models.AmountWithExchangeRate;
import com.azure.resourcemanager.consumption.models.EventType;
import com.azure.resourcemanager.consumption.models.Reseller;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The event properties.
 */
@Fluent
public final class EventProperties implements JsonSerializable<EventProperties> {
    /*
     * The date of the event.
     */
    private OffsetDateTime transactionDate;

    /*
     * The description of the event.
     */
    private String description;

    /*
     * The amount of new credit or commitment for NewCredit or SettleCharges event.
     */
    private Amount newCredit;

    /*
     * The amount of balance adjustment. The property is not available for ConsumptionCommitment lots.
     */
    private Amount adjustments;

    /*
     * The amount of expired credit or commitment for NewCredit or SettleCharges event.
     */
    private Amount creditExpired;

    /*
     * The amount of charges for events of type SettleCharges and PendingEligibleCharges.
     */
    private Amount charges;

    /*
     * The balance after the event.
     */
    private Amount closedBalance;

    /*
     * Identifies the type of the event.
     */
    private EventType eventType;

    /*
     * The number which uniquely identifies the invoice on which the event was billed. This will be empty for unbilled
     * events.
     */
    private String invoiceNumber;

    /*
     * The ID that uniquely identifies the billing profile for which the event happened. The property is only available
     * for billing account of type MicrosoftCustomerAgreement.
     */
    private String billingProfileId;

    /*
     * The display name of the billing profile for which the event happened. The property is only available for billing
     * account of type MicrosoftCustomerAgreement.
     */
    private String billingProfileDisplayName;

    /*
     * The ID that uniquely identifies the lot for which the event happened.
     */
    private String lotId;

    /*
     * Identifies the source of the lot for which the event happened.
     */
    private String lotSource;

    /*
     * Amount of canceled credit.
     */
    private Amount canceledCredit;

    /*
     * The credit currency of the event.
     */
    private String creditCurrency;

    /*
     * The billing currency of the event.
     */
    private String billingCurrency;

    /*
     * The reseller of the event.
     */
    private Reseller reseller;

    /*
     * The amount of expired credit or commitment for NewCredit or SettleCharges event in billing currency.
     */
    private AmountWithExchangeRate creditExpiredInBillingCurrency;

    /*
     * The amount of new credit or commitment for NewCredit or SettleCharges event in billing currency.
     */
    private AmountWithExchangeRate newCreditInBillingCurrency;

    /*
     * The amount of balance adjustment in billing currency.
     */
    private AmountWithExchangeRate adjustmentsInBillingCurrency;

    /*
     * The amount of charges for events of type SettleCharges and PendingEligibleCharges in billing currency.
     */
    private AmountWithExchangeRate chargesInBillingCurrency;

    /*
     * The balance in billing currency after the event.
     */
    private AmountWithExchangeRate closedBalanceInBillingCurrency;

    /*
     * The eTag for the resource.
     */
    private String etag;

    /**
     * Creates an instance of EventProperties class.
     */
    public EventProperties() {
    }

    /**
     * Get the transactionDate property: The date of the event.
     * 
     * @return the transactionDate value.
     */
    public OffsetDateTime transactionDate() {
        return this.transactionDate;
    }

    /**
     * Get the description property: The description of the event.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the newCredit property: The amount of new credit or commitment for NewCredit or SettleCharges event.
     * 
     * @return the newCredit value.
     */
    public Amount newCredit() {
        return this.newCredit;
    }

    /**
     * Get the adjustments property: The amount of balance adjustment. The property is not available for
     * ConsumptionCommitment lots.
     * 
     * @return the adjustments value.
     */
    public Amount adjustments() {
        return this.adjustments;
    }

    /**
     * Get the creditExpired property: The amount of expired credit or commitment for NewCredit or SettleCharges event.
     * 
     * @return the creditExpired value.
     */
    public Amount creditExpired() {
        return this.creditExpired;
    }

    /**
     * Get the charges property: The amount of charges for events of type SettleCharges and PendingEligibleCharges.
     * 
     * @return the charges value.
     */
    public Amount charges() {
        return this.charges;
    }

    /**
     * Get the closedBalance property: The balance after the event.
     * 
     * @return the closedBalance value.
     */
    public Amount closedBalance() {
        return this.closedBalance;
    }

    /**
     * Get the eventType property: Identifies the type of the event.
     * 
     * @return the eventType value.
     */
    public EventType eventType() {
        return this.eventType;
    }

    /**
     * Set the eventType property: Identifies the type of the event.
     * 
     * @param eventType the eventType value to set.
     * @return the EventProperties object itself.
     */
    public EventProperties withEventType(EventType eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the invoiceNumber property: The number which uniquely identifies the invoice on which the event was billed.
     * This will be empty for unbilled events.
     * 
     * @return the invoiceNumber value.
     */
    public String invoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Get the billingProfileId property: The ID that uniquely identifies the billing profile for which the event
     * happened. The property is only available for billing account of type MicrosoftCustomerAgreement.
     * 
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileDisplayName property: The display name of the billing profile for which the event happened.
     * The property is only available for billing account of type MicrosoftCustomerAgreement.
     * 
     * @return the billingProfileDisplayName value.
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get the lotId property: The ID that uniquely identifies the lot for which the event happened.
     * 
     * @return the lotId value.
     */
    public String lotId() {
        return this.lotId;
    }

    /**
     * Get the lotSource property: Identifies the source of the lot for which the event happened.
     * 
     * @return the lotSource value.
     */
    public String lotSource() {
        return this.lotSource;
    }

    /**
     * Get the canceledCredit property: Amount of canceled credit.
     * 
     * @return the canceledCredit value.
     */
    public Amount canceledCredit() {
        return this.canceledCredit;
    }

    /**
     * Get the creditCurrency property: The credit currency of the event.
     * 
     * @return the creditCurrency value.
     */
    public String creditCurrency() {
        return this.creditCurrency;
    }

    /**
     * Get the billingCurrency property: The billing currency of the event.
     * 
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.billingCurrency;
    }

    /**
     * Get the reseller property: The reseller of the event.
     * 
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.reseller;
    }

    /**
     * Get the creditExpiredInBillingCurrency property: The amount of expired credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     * 
     * @return the creditExpiredInBillingCurrency value.
     */
    public AmountWithExchangeRate creditExpiredInBillingCurrency() {
        return this.creditExpiredInBillingCurrency;
    }

    /**
     * Get the newCreditInBillingCurrency property: The amount of new credit or commitment for NewCredit or
     * SettleCharges event in billing currency.
     * 
     * @return the newCreditInBillingCurrency value.
     */
    public AmountWithExchangeRate newCreditInBillingCurrency() {
        return this.newCreditInBillingCurrency;
    }

    /**
     * Get the adjustmentsInBillingCurrency property: The amount of balance adjustment in billing currency.
     * 
     * @return the adjustmentsInBillingCurrency value.
     */
    public AmountWithExchangeRate adjustmentsInBillingCurrency() {
        return this.adjustmentsInBillingCurrency;
    }

    /**
     * Get the chargesInBillingCurrency property: The amount of charges for events of type SettleCharges and
     * PendingEligibleCharges in billing currency.
     * 
     * @return the chargesInBillingCurrency value.
     */
    public AmountWithExchangeRate chargesInBillingCurrency() {
        return this.chargesInBillingCurrency;
    }

    /**
     * Get the closedBalanceInBillingCurrency property: The balance in billing currency after the event.
     * 
     * @return the closedBalanceInBillingCurrency value.
     */
    public AmountWithExchangeRate closedBalanceInBillingCurrency() {
        return this.closedBalanceInBillingCurrency;
    }

    /**
     * Get the etag property: The eTag for the resource.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (newCredit() != null) {
            newCredit().validate();
        }
        if (adjustments() != null) {
            adjustments().validate();
        }
        if (creditExpired() != null) {
            creditExpired().validate();
        }
        if (charges() != null) {
            charges().validate();
        }
        if (closedBalance() != null) {
            closedBalance().validate();
        }
        if (canceledCredit() != null) {
            canceledCredit().validate();
        }
        if (reseller() != null) {
            reseller().validate();
        }
        if (creditExpiredInBillingCurrency() != null) {
            creditExpiredInBillingCurrency().validate();
        }
        if (newCreditInBillingCurrency() != null) {
            newCreditInBillingCurrency().validate();
        }
        if (adjustmentsInBillingCurrency() != null) {
            adjustmentsInBillingCurrency().validate();
        }
        if (chargesInBillingCurrency() != null) {
            chargesInBillingCurrency().validate();
        }
        if (closedBalanceInBillingCurrency() != null) {
            closedBalanceInBillingCurrency().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("eventType", this.eventType == null ? null : this.eventType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EventProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EventProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EventProperties.
     */
    public static EventProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EventProperties deserializedEventProperties = new EventProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("transactionDate".equals(fieldName)) {
                    deserializedEventProperties.transactionDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("description".equals(fieldName)) {
                    deserializedEventProperties.description = reader.getString();
                } else if ("newCredit".equals(fieldName)) {
                    deserializedEventProperties.newCredit = Amount.fromJson(reader);
                } else if ("adjustments".equals(fieldName)) {
                    deserializedEventProperties.adjustments = Amount.fromJson(reader);
                } else if ("creditExpired".equals(fieldName)) {
                    deserializedEventProperties.creditExpired = Amount.fromJson(reader);
                } else if ("charges".equals(fieldName)) {
                    deserializedEventProperties.charges = Amount.fromJson(reader);
                } else if ("closedBalance".equals(fieldName)) {
                    deserializedEventProperties.closedBalance = Amount.fromJson(reader);
                } else if ("eventType".equals(fieldName)) {
                    deserializedEventProperties.eventType = EventType.fromString(reader.getString());
                } else if ("invoiceNumber".equals(fieldName)) {
                    deserializedEventProperties.invoiceNumber = reader.getString();
                } else if ("billingProfileId".equals(fieldName)) {
                    deserializedEventProperties.billingProfileId = reader.getString();
                } else if ("billingProfileDisplayName".equals(fieldName)) {
                    deserializedEventProperties.billingProfileDisplayName = reader.getString();
                } else if ("lotId".equals(fieldName)) {
                    deserializedEventProperties.lotId = reader.getString();
                } else if ("lotSource".equals(fieldName)) {
                    deserializedEventProperties.lotSource = reader.getString();
                } else if ("canceledCredit".equals(fieldName)) {
                    deserializedEventProperties.canceledCredit = Amount.fromJson(reader);
                } else if ("creditCurrency".equals(fieldName)) {
                    deserializedEventProperties.creditCurrency = reader.getString();
                } else if ("billingCurrency".equals(fieldName)) {
                    deserializedEventProperties.billingCurrency = reader.getString();
                } else if ("reseller".equals(fieldName)) {
                    deserializedEventProperties.reseller = Reseller.fromJson(reader);
                } else if ("creditExpiredInBillingCurrency".equals(fieldName)) {
                    deserializedEventProperties.creditExpiredInBillingCurrency
                        = AmountWithExchangeRate.fromJson(reader);
                } else if ("newCreditInBillingCurrency".equals(fieldName)) {
                    deserializedEventProperties.newCreditInBillingCurrency = AmountWithExchangeRate.fromJson(reader);
                } else if ("adjustmentsInBillingCurrency".equals(fieldName)) {
                    deserializedEventProperties.adjustmentsInBillingCurrency = AmountWithExchangeRate.fromJson(reader);
                } else if ("chargesInBillingCurrency".equals(fieldName)) {
                    deserializedEventProperties.chargesInBillingCurrency = AmountWithExchangeRate.fromJson(reader);
                } else if ("closedBalanceInBillingCurrency".equals(fieldName)) {
                    deserializedEventProperties.closedBalanceInBillingCurrency
                        = AmountWithExchangeRate.fromJson(reader);
                } else if ("eTag".equals(fieldName)) {
                    deserializedEventProperties.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEventProperties;
        });
    }
}
