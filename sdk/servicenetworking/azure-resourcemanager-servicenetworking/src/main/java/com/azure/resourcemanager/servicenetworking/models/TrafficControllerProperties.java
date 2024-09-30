// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Traffic Controller Properties.
 */
@Fluent
public final class TrafficControllerProperties implements JsonSerializable<TrafficControllerProperties> {
    /*
     * Configuration Endpoints.
     */
    private List<String> configurationEndpoints;

    /*
     * Frontends References List
     */
    private List<ResourceId> frontends;

    /*
     * Associations References List
     */
    private List<ResourceId> associations;

    /*
     * Security Policies References List
     */
    private List<ResourceId> securityPolicies;

    /*
     * Security Policy Configuration
     */
    private SecurityPolicyConfigurations securityPolicyConfigurations;

    /*
     * The status of the last operation.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of TrafficControllerProperties class.
     */
    public TrafficControllerProperties() {
    }

    /**
     * Get the configurationEndpoints property: Configuration Endpoints.
     * 
     * @return the configurationEndpoints value.
     */
    public List<String> configurationEndpoints() {
        return this.configurationEndpoints;
    }

    /**
     * Get the frontends property: Frontends References List.
     * 
     * @return the frontends value.
     */
    public List<ResourceId> frontends() {
        return this.frontends;
    }

    /**
     * Get the associations property: Associations References List.
     * 
     * @return the associations value.
     */
    public List<ResourceId> associations() {
        return this.associations;
    }

    /**
     * Get the securityPolicies property: Security Policies References List.
     * 
     * @return the securityPolicies value.
     */
    public List<ResourceId> securityPolicies() {
        return this.securityPolicies;
    }

    /**
     * Get the securityPolicyConfigurations property: Security Policy Configuration.
     * 
     * @return the securityPolicyConfigurations value.
     */
    public SecurityPolicyConfigurations securityPolicyConfigurations() {
        return this.securityPolicyConfigurations;
    }

    /**
     * Set the securityPolicyConfigurations property: Security Policy Configuration.
     * 
     * @param securityPolicyConfigurations the securityPolicyConfigurations value to set.
     * @return the TrafficControllerProperties object itself.
     */
    public TrafficControllerProperties
        withSecurityPolicyConfigurations(SecurityPolicyConfigurations securityPolicyConfigurations) {
        this.securityPolicyConfigurations = securityPolicyConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontends() != null) {
            frontends().forEach(e -> e.validate());
        }
        if (associations() != null) {
            associations().forEach(e -> e.validate());
        }
        if (securityPolicies() != null) {
            securityPolicies().forEach(e -> e.validate());
        }
        if (securityPolicyConfigurations() != null) {
            securityPolicyConfigurations().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("securityPolicyConfigurations", this.securityPolicyConfigurations);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrafficControllerProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrafficControllerProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrafficControllerProperties.
     */
    public static TrafficControllerProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrafficControllerProperties deserializedTrafficControllerProperties = new TrafficControllerProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("configurationEndpoints".equals(fieldName)) {
                    List<String> configurationEndpoints = reader.readArray(reader1 -> reader1.getString());
                    deserializedTrafficControllerProperties.configurationEndpoints = configurationEndpoints;
                } else if ("frontends".equals(fieldName)) {
                    List<ResourceId> frontends = reader.readArray(reader1 -> ResourceId.fromJson(reader1));
                    deserializedTrafficControllerProperties.frontends = frontends;
                } else if ("associations".equals(fieldName)) {
                    List<ResourceId> associations = reader.readArray(reader1 -> ResourceId.fromJson(reader1));
                    deserializedTrafficControllerProperties.associations = associations;
                } else if ("securityPolicies".equals(fieldName)) {
                    List<ResourceId> securityPolicies = reader.readArray(reader1 -> ResourceId.fromJson(reader1));
                    deserializedTrafficControllerProperties.securityPolicies = securityPolicies;
                } else if ("securityPolicyConfigurations".equals(fieldName)) {
                    deserializedTrafficControllerProperties.securityPolicyConfigurations
                        = SecurityPolicyConfigurations.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedTrafficControllerProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrafficControllerProperties;
        });
    }
}
