// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.ResourceReference;
import java.io.IOException;

/**
 * A custom domain.
 */
@Fluent
public final class CustomDomainInner extends ProxyResource {
    /*
     * Properties of a custom domain.
     */
    private CustomDomainProperties innerProperties = new CustomDomainProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of CustomDomainInner class.
     */
    public CustomDomainInner() {
    }

    /**
     * Get the innerProperties property: Properties of a custom domain.
     * 
     * @return the innerProperties value.
     */
    private CustomDomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the domainName property: The custom domain name.
     * 
     * @return the domainName value.
     */
    public String domainName() {
        return this.innerProperties() == null ? null : this.innerProperties().domainName();
    }

    /**
     * Set the domainName property: The custom domain name.
     * 
     * @param domainName the domainName value to set.
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withDomainName(String domainName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomDomainProperties();
        }
        this.innerProperties().withDomainName(domainName);
        return this;
    }

    /**
     * Get the customCertificate property: Reference to a resource.
     * 
     * @return the customCertificate value.
     */
    public ResourceReference customCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().customCertificate();
    }

    /**
     * Set the customCertificate property: Reference to a resource.
     * 
     * @param customCertificate the customCertificate value to set.
     * @return the CustomDomainInner object itself.
     */
    public CustomDomainInner withCustomCertificate(ResourceReference customCertificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomDomainProperties();
        }
        this.innerProperties().withCustomCertificate(customCertificate);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model CustomDomainInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomainInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomainInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomainInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomDomainInner.
     */
    public static CustomDomainInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomainInner deserializedCustomDomainInner = new CustomDomainInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCustomDomainInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedCustomDomainInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCustomDomainInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedCustomDomainInner.innerProperties = CustomDomainProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedCustomDomainInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomainInner;
        });
    }
}
