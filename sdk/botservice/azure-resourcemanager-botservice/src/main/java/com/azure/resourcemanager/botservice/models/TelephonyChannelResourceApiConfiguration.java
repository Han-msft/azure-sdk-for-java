// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A resource Api configuration for the Telephony channel.
 */
@Fluent
public final class TelephonyChannelResourceApiConfiguration
    implements JsonSerializable<TelephonyChannelResourceApiConfiguration> {
    /*
     * The id of config.
     */
    private String id;

    /*
     * The provider name.
     */
    private String providerName;

    /*
     * The cognitive service subscription key.
     */
    private String cognitiveServiceSubscriptionKey;

    /*
     * The cognitive service region.
     */
    private String cognitiveServiceRegion;

    /*
     * The cognitive service resourceId.
     */
    private String cognitiveServiceResourceId;

    /*
     * The default locale.
     */
    private String defaultLocale;

    /**
     * Creates an instance of TelephonyChannelResourceApiConfiguration class.
     */
    public TelephonyChannelResourceApiConfiguration() {
    }

    /**
     * Get the id property: The id of config.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of config.
     * 
     * @param id the id value to set.
     * @return the TelephonyChannelResourceApiConfiguration object itself.
     */
    public TelephonyChannelResourceApiConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the providerName property: The provider name.
     * 
     * @return the providerName value.
     */
    public String providerName() {
        return this.providerName;
    }

    /**
     * Set the providerName property: The provider name.
     * 
     * @param providerName the providerName value to set.
     * @return the TelephonyChannelResourceApiConfiguration object itself.
     */
    public TelephonyChannelResourceApiConfiguration withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * Get the cognitiveServiceSubscriptionKey property: The cognitive service subscription key.
     * 
     * @return the cognitiveServiceSubscriptionKey value.
     */
    public String cognitiveServiceSubscriptionKey() {
        return this.cognitiveServiceSubscriptionKey;
    }

    /**
     * Set the cognitiveServiceSubscriptionKey property: The cognitive service subscription key.
     * 
     * @param cognitiveServiceSubscriptionKey the cognitiveServiceSubscriptionKey value to set.
     * @return the TelephonyChannelResourceApiConfiguration object itself.
     */
    public TelephonyChannelResourceApiConfiguration
        withCognitiveServiceSubscriptionKey(String cognitiveServiceSubscriptionKey) {
        this.cognitiveServiceSubscriptionKey = cognitiveServiceSubscriptionKey;
        return this;
    }

    /**
     * Get the cognitiveServiceRegion property: The cognitive service region.
     * 
     * @return the cognitiveServiceRegion value.
     */
    public String cognitiveServiceRegion() {
        return this.cognitiveServiceRegion;
    }

    /**
     * Set the cognitiveServiceRegion property: The cognitive service region.
     * 
     * @param cognitiveServiceRegion the cognitiveServiceRegion value to set.
     * @return the TelephonyChannelResourceApiConfiguration object itself.
     */
    public TelephonyChannelResourceApiConfiguration withCognitiveServiceRegion(String cognitiveServiceRegion) {
        this.cognitiveServiceRegion = cognitiveServiceRegion;
        return this;
    }

    /**
     * Get the cognitiveServiceResourceId property: The cognitive service resourceId.
     * 
     * @return the cognitiveServiceResourceId value.
     */
    public String cognitiveServiceResourceId() {
        return this.cognitiveServiceResourceId;
    }

    /**
     * Set the cognitiveServiceResourceId property: The cognitive service resourceId.
     * 
     * @param cognitiveServiceResourceId the cognitiveServiceResourceId value to set.
     * @return the TelephonyChannelResourceApiConfiguration object itself.
     */
    public TelephonyChannelResourceApiConfiguration withCognitiveServiceResourceId(String cognitiveServiceResourceId) {
        this.cognitiveServiceResourceId = cognitiveServiceResourceId;
        return this;
    }

    /**
     * Get the defaultLocale property: The default locale.
     * 
     * @return the defaultLocale value.
     */
    public String defaultLocale() {
        return this.defaultLocale;
    }

    /**
     * Set the defaultLocale property: The default locale.
     * 
     * @param defaultLocale the defaultLocale value to set.
     * @return the TelephonyChannelResourceApiConfiguration object itself.
     */
    public TelephonyChannelResourceApiConfiguration withDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("providerName", this.providerName);
        jsonWriter.writeStringField("cognitiveServiceSubscriptionKey", this.cognitiveServiceSubscriptionKey);
        jsonWriter.writeStringField("cognitiveServiceRegion", this.cognitiveServiceRegion);
        jsonWriter.writeStringField("cognitiveServiceResourceId", this.cognitiveServiceResourceId);
        jsonWriter.writeStringField("defaultLocale", this.defaultLocale);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TelephonyChannelResourceApiConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TelephonyChannelResourceApiConfiguration if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TelephonyChannelResourceApiConfiguration.
     */
    public static TelephonyChannelResourceApiConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TelephonyChannelResourceApiConfiguration deserializedTelephonyChannelResourceApiConfiguration
                = new TelephonyChannelResourceApiConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTelephonyChannelResourceApiConfiguration.id = reader.getString();
                } else if ("providerName".equals(fieldName)) {
                    deserializedTelephonyChannelResourceApiConfiguration.providerName = reader.getString();
                } else if ("cognitiveServiceSubscriptionKey".equals(fieldName)) {
                    deserializedTelephonyChannelResourceApiConfiguration.cognitiveServiceSubscriptionKey
                        = reader.getString();
                } else if ("cognitiveServiceRegion".equals(fieldName)) {
                    deserializedTelephonyChannelResourceApiConfiguration.cognitiveServiceRegion = reader.getString();
                } else if ("cognitiveServiceResourceId".equals(fieldName)) {
                    deserializedTelephonyChannelResourceApiConfiguration.cognitiveServiceResourceId
                        = reader.getString();
                } else if ("defaultLocale".equals(fieldName)) {
                    deserializedTelephonyChannelResourceApiConfiguration.defaultLocale = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTelephonyChannelResourceApiConfiguration;
        });
    }
}
