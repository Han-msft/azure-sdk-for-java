// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.iotcentral.fluent.models.AppProperties;
import com.azure.resourcemanager.iotcentral.fluent.models.PrivateEndpointConnectionInner;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The description of the IoT Central application.
 */
@Fluent
public final class AppPatch implements JsonSerializable<AppPatch> {
    /*
     * Instance tags
     */
    private Map<String, String> tags;

    /*
     * A valid instance SKU.
     */
    private AppSkuInfo sku;

    /*
     * The common properties of an IoT Central application.
     */
    private AppProperties innerProperties;

    /*
     * The managed identities for the IoT Central application.
     */
    private SystemAssignedServiceIdentity identity;

    /**
     * Creates an instance of AppPatch class.
     */
    public AppPatch() {
    }

    /**
     * Get the tags property: Instance tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Instance tags.
     * 
     * @param tags the tags value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: A valid instance SKU.
     * 
     * @return the sku value.
     */
    public AppSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set the sku property: A valid instance SKU.
     * 
     * @param sku the sku value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withSku(AppSkuInfo sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: The common properties of an IoT Central application.
     * 
     * @return the innerProperties value.
     */
    private AppProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The managed identities for the IoT Central application.
     * 
     * @return the identity value.
     */
    public SystemAssignedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identities for the IoT Central application.
     * 
     * @param identity the identity value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withIdentity(SystemAssignedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the applicationId property: The ID of the application.
     * 
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationId();
    }

    /**
     * Get the displayName property: The display name of the application.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the application.
     * 
     * @param displayName the displayName value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the subdomain property: The subdomain of the application.
     * 
     * @return the subdomain value.
     */
    public String subdomain() {
        return this.innerProperties() == null ? null : this.innerProperties().subdomain();
    }

    /**
     * Set the subdomain property: The subdomain of the application.
     * 
     * @param subdomain the subdomain value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withSubdomain(String subdomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withSubdomain(subdomain);
        return this;
    }

    /**
     * Get the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     * 
     * @return the template value.
     */
    public String template() {
        return this.innerProperties() == null ? null : this.innerProperties().template();
    }

    /**
     * Set the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     * 
     * @param template the template value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withTemplate(String template) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withTemplate(template);
        return this;
    }

    /**
     * Get the state property: The current state of the application.
     * 
     * @return the state value.
     */
    public AppState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from the public network are allowed.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from the public network are allowed.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the networkRuleSets property: Network Rule Set Properties of this IoT Central application.
     * 
     * @return the networkRuleSets value.
     */
    public NetworkRuleSets networkRuleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRuleSets();
    }

    /**
     * Set the networkRuleSets property: Network Rule Set Properties of this IoT Central application.
     * 
     * @param networkRuleSets the networkRuleSets value to set.
     * @return the AppPatch object itself.
     */
    public AppPatch withNetworkRuleSets(NetworkRuleSets networkRuleSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withNetworkRuleSets(networkRuleSets);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections created on this IoT Central
     * application.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AppPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AppPatch if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the AppPatch.
     */
    public static AppPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AppPatch deserializedAppPatch = new AppPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedAppPatch.tags = tags;
                } else if ("sku".equals(fieldName)) {
                    deserializedAppPatch.sku = AppSkuInfo.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedAppPatch.innerProperties = AppProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedAppPatch.identity = SystemAssignedServiceIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAppPatch;
        });
    }
}
