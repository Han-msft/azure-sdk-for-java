// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Network Rule Set Properties of this IoT Central application.
 */
@Fluent
public final class NetworkRuleSets implements JsonSerializable<NetworkRuleSets> {
    /*
     * Whether these rules apply for device connectivity to IoT Hub and Device Provisioning service associated with this
     * application.
     */
    private Boolean applyToDevices;

    /*
     * Whether these rules apply for connectivity via IoT Central web portal and APIs.
     */
    private Boolean applyToIoTCentral;

    /*
     * The default network action to apply.
     */
    private NetworkAction defaultAction;

    /*
     * List of IP rules.
     */
    private List<NetworkRuleSetIpRule> ipRules;

    /**
     * Creates an instance of NetworkRuleSets class.
     */
    public NetworkRuleSets() {
    }

    /**
     * Get the applyToDevices property: Whether these rules apply for device connectivity to IoT Hub and Device
     * Provisioning service associated with this application.
     * 
     * @return the applyToDevices value.
     */
    public Boolean applyToDevices() {
        return this.applyToDevices;
    }

    /**
     * Set the applyToDevices property: Whether these rules apply for device connectivity to IoT Hub and Device
     * Provisioning service associated with this application.
     * 
     * @param applyToDevices the applyToDevices value to set.
     * @return the NetworkRuleSets object itself.
     */
    public NetworkRuleSets withApplyToDevices(Boolean applyToDevices) {
        this.applyToDevices = applyToDevices;
        return this;
    }

    /**
     * Get the applyToIoTCentral property: Whether these rules apply for connectivity via IoT Central web portal and
     * APIs.
     * 
     * @return the applyToIoTCentral value.
     */
    public Boolean applyToIoTCentral() {
        return this.applyToIoTCentral;
    }

    /**
     * Set the applyToIoTCentral property: Whether these rules apply for connectivity via IoT Central web portal and
     * APIs.
     * 
     * @param applyToIoTCentral the applyToIoTCentral value to set.
     * @return the NetworkRuleSets object itself.
     */
    public NetworkRuleSets withApplyToIoTCentral(Boolean applyToIoTCentral) {
        this.applyToIoTCentral = applyToIoTCentral;
        return this;
    }

    /**
     * Get the defaultAction property: The default network action to apply.
     * 
     * @return the defaultAction value.
     */
    public NetworkAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: The default network action to apply.
     * 
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSets object itself.
     */
    public NetworkRuleSets withDefaultAction(NetworkAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the ipRules property: List of IP rules.
     * 
     * @return the ipRules value.
     */
    public List<NetworkRuleSetIpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IP rules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSets object itself.
     */
    public NetworkRuleSets withIpRules(List<NetworkRuleSetIpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("applyToDevices", this.applyToDevices);
        jsonWriter.writeBooleanField("applyToIoTCentral", this.applyToIoTCentral);
        jsonWriter.writeStringField("defaultAction", this.defaultAction == null ? null : this.defaultAction.toString());
        jsonWriter.writeArrayField("ipRules", this.ipRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkRuleSets from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkRuleSets if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkRuleSets.
     */
    public static NetworkRuleSets fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkRuleSets deserializedNetworkRuleSets = new NetworkRuleSets();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applyToDevices".equals(fieldName)) {
                    deserializedNetworkRuleSets.applyToDevices = reader.getNullable(JsonReader::getBoolean);
                } else if ("applyToIoTCentral".equals(fieldName)) {
                    deserializedNetworkRuleSets.applyToIoTCentral = reader.getNullable(JsonReader::getBoolean);
                } else if ("defaultAction".equals(fieldName)) {
                    deserializedNetworkRuleSets.defaultAction = NetworkAction.fromString(reader.getString());
                } else if ("ipRules".equals(fieldName)) {
                    List<NetworkRuleSetIpRule> ipRules
                        = reader.readArray(reader1 -> NetworkRuleSetIpRule.fromJson(reader1));
                    deserializedNetworkRuleSets.ipRules = ipRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkRuleSets;
        });
    }
}
