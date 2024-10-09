// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The endpoint configuration for a pool.
 */
@Fluent
public final class PoolEndpointConfiguration implements JsonSerializable<PoolEndpointConfiguration> {
    /*
     * The maximum number of inbound NAT pools per Batch pool is 5. If the maximum number of inbound NAT pools is
     * exceeded the request fails with HTTP status code 400. This cannot be specified if the IPAddressProvisioningType
     * is NoPublicIPAddresses.
     */
    private List<InboundNatPool> inboundNatPools;

    /**
     * Creates an instance of PoolEndpointConfiguration class.
     */
    public PoolEndpointConfiguration() {
    }

    /**
     * Get the inboundNatPools property: The maximum number of inbound NAT pools per Batch pool is 5. If the maximum
     * number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if
     * the IPAddressProvisioningType is NoPublicIPAddresses.
     * 
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools property: The maximum number of inbound NAT pools per Batch pool is 5. If the maximum
     * number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if
     * the IPAddressProvisioningType is NoPublicIPAddresses.
     * 
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the PoolEndpointConfiguration object itself.
     */
    public PoolEndpointConfiguration withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundNatPools() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property inboundNatPools in model PoolEndpointConfiguration"));
        } else {
            inboundNatPools().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PoolEndpointConfiguration.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("inboundNatPools", this.inboundNatPools,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PoolEndpointConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PoolEndpointConfiguration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PoolEndpointConfiguration.
     */
    public static PoolEndpointConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PoolEndpointConfiguration deserializedPoolEndpointConfiguration = new PoolEndpointConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("inboundNatPools".equals(fieldName)) {
                    List<InboundNatPool> inboundNatPools
                        = reader.readArray(reader1 -> InboundNatPool.fromJson(reader1));
                    deserializedPoolEndpointConfiguration.inboundNatPools = inboundNatPools;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPoolEndpointConfiguration;
        });
    }
}
