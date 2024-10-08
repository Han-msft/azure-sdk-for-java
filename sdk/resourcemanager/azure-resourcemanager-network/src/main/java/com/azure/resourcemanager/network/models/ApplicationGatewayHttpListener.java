// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayHttpListenerPropertiesFormat;
import java.io.IOException;
import java.util.List;

/**
 * Http listener of an application gateway.
 */
@Fluent
public final class ApplicationGatewayHttpListener extends SubResource {
    /*
     * Properties of the application gateway HTTP listener.
     */
    private ApplicationGatewayHttpListenerPropertiesFormat innerProperties;

    /*
     * Name of the HTTP listener that is unique within an Application Gateway.
     */
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /*
     * Type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ApplicationGatewayHttpListener class.
     */
    public ApplicationGatewayHttpListener() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway HTTP listener.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayHttpListenerPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the HTTP listener that is unique within an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the HTTP listener that is unique within an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayHttpListener withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     * 
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendIpConfiguration();
    }

    /**
     * Set the frontendIpConfiguration property: Frontend IP configuration resource of an application gateway.
     * 
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withFrontendIpConfiguration(frontendIpConfiguration);
        return this;
    }

    /**
     * Get the frontendPort property: Frontend port resource of an application gateway.
     * 
     * @return the frontendPort value.
     */
    public SubResource frontendPort() {
        return this.innerProperties() == null ? null : this.innerProperties().frontendPort();
    }

    /**
     * Set the frontendPort property: Frontend port resource of an application gateway.
     * 
     * @param frontendPort the frontendPort value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFrontendPort(SubResource frontendPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withFrontendPort(frontendPort);
        return this;
    }

    /**
     * Get the protocol property: Protocol of the HTTP listener.
     * 
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: Protocol of the HTTP listener.
     * 
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withProtocol(ApplicationGatewayProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the hostname property: Host name of HTTP listener.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: Host name of HTTP listener.
     * 
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the sslCertificate property: SSL certificate resource of an application gateway.
     * 
     * @return the sslCertificate value.
     */
    public SubResource sslCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().sslCertificate();
    }

    /**
     * Set the sslCertificate property: SSL certificate resource of an application gateway.
     * 
     * @param sslCertificate the sslCertificate value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withSslCertificate(SubResource sslCertificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withSslCertificate(sslCertificate);
        return this;
    }

    /**
     * Get the sslProfile property: SSL profile resource of the application gateway.
     * 
     * @return the sslProfile value.
     */
    public SubResource sslProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().sslProfile();
    }

    /**
     * Set the sslProfile property: SSL profile resource of the application gateway.
     * 
     * @param sslProfile the sslProfile value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withSslProfile(SubResource sslProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withSslProfile(sslProfile);
        return this;
    }

    /**
     * Get the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     * 
     * @return the requireServerNameIndication value.
     */
    public Boolean requireServerNameIndication() {
        return this.innerProperties() == null ? null : this.innerProperties().requireServerNameIndication();
    }

    /**
     * Set the requireServerNameIndication property: Applicable only if protocol is https. Enables SNI for
     * multi-hosting.
     * 
     * @param requireServerNameIndication the requireServerNameIndication value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withRequireServerNameIndication(Boolean requireServerNameIndication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withRequireServerNameIndication(requireServerNameIndication);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the HTTP listener resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     * 
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().customErrorConfigurations();
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations of the HTTP listener.
     * 
     * @param customErrorConfigurations the customErrorConfigurations value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener
        withCustomErrorConfigurations(List<ApplicationGatewayCustomError> customErrorConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withCustomErrorConfigurations(customErrorConfigurations);
        return this;
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     * 
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallPolicy();
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     * 
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withFirewallPolicy(SubResource firewallPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withFirewallPolicy(firewallPolicy);
        return this;
    }

    /**
     * Get the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     * 
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.innerProperties() == null ? null : this.innerProperties().hostNames();
    }

    /**
     * Set the hostNames property: List of Host names for HTTP Listener that allows special wildcard characters as well.
     * 
     * @param hostNames the hostNames value to set.
     * @return the ApplicationGatewayHttpListener object itself.
     */
    public ApplicationGatewayHttpListener withHostNames(List<String> hostNames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayHttpListenerPropertiesFormat();
        }
        this.innerProperties().withHostNames(hostNames);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayHttpListener from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayHttpListener if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayHttpListener.
     */
    public static ApplicationGatewayHttpListener fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayHttpListener deserializedApplicationGatewayHttpListener
                = new ApplicationGatewayHttpListener();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListener.withId(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListener.innerProperties
                        = ApplicationGatewayHttpListenerPropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListener.name = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListener.etag = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedApplicationGatewayHttpListener.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayHttpListener;
        });
    }
}
