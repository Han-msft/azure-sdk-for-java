// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.models.RetentionPolicyParameters;
import com.azure.resourcemanager.network.models.TrafficAnalyticsProperties;
import java.io.IOException;

/**
 * Information on the configuration of flow log and traffic analytics (optional) .
 */
@Fluent
public final class FlowLogInformationInner implements JsonSerializable<FlowLogInformationInner> {
    /*
     * The ID of the resource to configure for flow log and traffic analytics (optional) .
     */
    private String targetResourceId;

    /*
     * Properties of the flow log.
     */
    private FlowLogProperties innerProperties = new FlowLogProperties();

    /*
     * Parameters that define the configuration of traffic analytics.
     */
    private TrafficAnalyticsProperties flowAnalyticsConfiguration;

    /*
     * FlowLog resource Managed Identity
     */
    private ManagedServiceIdentity identity;

    /**
     * Creates an instance of FlowLogInformationInner class.
     */
    public FlowLogInformationInner() {
    }

    /**
     * Get the targetResourceId property: The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the flow log.
     * 
     * @return the innerProperties value.
     */
    private FlowLogProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     * 
     * @return the flowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration;
    }

    /**
     * Set the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     * 
     * @param flowAnalyticsConfiguration the flowAnalyticsConfiguration value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner
        withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration) {
        this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
        return this;
    }

    /**
     * Get the identity property: FlowLog resource Managed Identity.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: FlowLog resource Managed Identity.
     * 
     * @param identity the identity value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the storageId property: ID of the storage account which is used to store the flow log.
     * 
     * @return the storageId value.
     */
    public String storageId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageId();
    }

    /**
     * Set the storageId property: ID of the storage account which is used to store the flow log.
     * 
     * @param storageId the storageId value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withStorageId(String storageId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withStorageId(storageId);
        return this;
    }

    /**
     * Get the enabledFilteringCriteria property: Optional field to filter network traffic logs based on SrcIP, SrcPort,
     * DstIP, DstPort, Protocol, Encryption, Direction and Action. If not specified, all network traffic will be logged.
     * 
     * @return the enabledFilteringCriteria value.
     */
    public String enabledFilteringCriteria() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledFilteringCriteria();
    }

    /**
     * Set the enabledFilteringCriteria property: Optional field to filter network traffic logs based on SrcIP, SrcPort,
     * DstIP, DstPort, Protocol, Encryption, Direction and Action. If not specified, all network traffic will be logged.
     * 
     * @param enabledFilteringCriteria the enabledFilteringCriteria value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withEnabledFilteringCriteria(String enabledFilteringCriteria) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withEnabledFilteringCriteria(enabledFilteringCriteria);
        return this;
    }

    /**
     * Get the enabled property: Flag to enable/disable flow logging.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.innerProperties() == null ? false : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Flag to enable/disable flow logging.
     * 
     * @param enabled the enabled value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withEnabled(boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the retentionPolicy property: Parameters that define the retention policy for flow log.
     * 
     * @return the retentionPolicy value.
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionPolicy();
    }

    /**
     * Set the retentionPolicy property: Parameters that define the retention policy for flow log.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withRetentionPolicy(retentionPolicy);
        return this;
    }

    /**
     * Get the format property: Parameters that define the flow log format.
     * 
     * @return the format value.
     */
    public FlowLogFormatParameters format() {
        return this.innerProperties() == null ? null : this.innerProperties().format();
    }

    /**
     * Set the format property: Parameters that define the flow log format.
     * 
     * @param format the format value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withFormat(FlowLogFormatParameters format) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withFormat(format);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetResourceId in model FlowLogInformationInner"));
        }
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model FlowLogInformationInner"));
        } else {
            innerProperties().validate();
        }
        if (flowAnalyticsConfiguration() != null) {
            flowAnalyticsConfiguration().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FlowLogInformationInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetResourceId", this.targetResourceId);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("flowAnalyticsConfiguration", this.flowAnalyticsConfiguration);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FlowLogInformationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FlowLogInformationInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FlowLogInformationInner.
     */
    public static FlowLogInformationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FlowLogInformationInner deserializedFlowLogInformationInner = new FlowLogInformationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetResourceId".equals(fieldName)) {
                    deserializedFlowLogInformationInner.targetResourceId = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedFlowLogInformationInner.innerProperties = FlowLogProperties.fromJson(reader);
                } else if ("flowAnalyticsConfiguration".equals(fieldName)) {
                    deserializedFlowLogInformationInner.flowAnalyticsConfiguration
                        = TrafficAnalyticsProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedFlowLogInformationInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFlowLogInformationInner;
        });
    }
}
