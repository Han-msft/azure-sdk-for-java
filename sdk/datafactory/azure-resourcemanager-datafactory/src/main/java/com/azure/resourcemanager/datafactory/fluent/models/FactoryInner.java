// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.EncryptionConfiguration;
import com.azure.resourcemanager.datafactory.models.FactoryIdentity;
import com.azure.resourcemanager.datafactory.models.FactoryRepoConfiguration;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import com.azure.resourcemanager.datafactory.models.PublicNetworkAccess;
import com.azure.resourcemanager.datafactory.models.PurviewConfiguration;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Factory resource type.
 */
@Fluent
public final class FactoryInner extends Resource {
    /*
     * Managed service identity of the factory.
     */
    private FactoryIdentity identity;

    /*
     * Properties of the factory.
     */
    private FactoryProperties innerProperties;

    /*
     * Etag identifies change in the resource.
     */
    private String etag;

    /*
     * Factory resource type.
     */
    private Map<String, Object> additionalProperties;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of FactoryInner class.
     */
    public FactoryInner() {
    }

    /**
     * Get the identity property: Managed service identity of the factory.
     * 
     * @return the identity value.
     */
    public FactoryIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity of the factory.
     * 
     * @param identity the identity value to set.
     * @return the FactoryInner object itself.
     */
    public FactoryInner withIdentity(FactoryIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the factory.
     * 
     * @return the innerProperties value.
     */
    private FactoryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Etag identifies change in the resource.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the additionalProperties property: Factory resource type.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Factory resource type.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the FactoryInner object itself.
     */
    public FactoryInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public FactoryInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FactoryInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Factory provisioning state, example Succeeded.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the createTime property: Time the factory was created in ISO8601 format.
     * 
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createTime();
    }

    /**
     * Get the version property: Version of the factory.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the purviewConfiguration property: Purview information of the factory.
     * 
     * @return the purviewConfiguration value.
     */
    public PurviewConfiguration purviewConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().purviewConfiguration();
    }

    /**
     * Set the purviewConfiguration property: Purview information of the factory.
     * 
     * @param purviewConfiguration the purviewConfiguration value to set.
     * @return the FactoryInner object itself.
     */
    public FactoryInner withPurviewConfiguration(PurviewConfiguration purviewConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FactoryProperties();
        }
        this.innerProperties().withPurviewConfiguration(purviewConfiguration);
        return this;
    }

    /**
     * Get the repoConfiguration property: Git repo information of the factory.
     * 
     * @return the repoConfiguration value.
     */
    public FactoryRepoConfiguration repoConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().repoConfiguration();
    }

    /**
     * Set the repoConfiguration property: Git repo information of the factory.
     * 
     * @param repoConfiguration the repoConfiguration value to set.
     * @return the FactoryInner object itself.
     */
    public FactoryInner withRepoConfiguration(FactoryRepoConfiguration repoConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FactoryProperties();
        }
        this.innerProperties().withRepoConfiguration(repoConfiguration);
        return this;
    }

    /**
     * Get the globalParameters property: List of parameters for factory.
     * 
     * @return the globalParameters value.
     */
    public Map<String, GlobalParameterSpecification> globalParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().globalParameters();
    }

    /**
     * Set the globalParameters property: List of parameters for factory.
     * 
     * @param globalParameters the globalParameters value to set.
     * @return the FactoryInner object itself.
     */
    public FactoryInner withGlobalParameters(Map<String, GlobalParameterSpecification> globalParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FactoryProperties();
        }
        this.innerProperties().withGlobalParameters(globalParameters);
        return this;
    }

    /**
     * Get the encryption property: Properties to enable Customer Managed Key for the factory.
     * 
     * @return the encryption value.
     */
    public EncryptionConfiguration encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Properties to enable Customer Managed Key for the factory.
     * 
     * @param encryption the encryption value to set.
     * @return the FactoryInner object itself.
     */
    public FactoryInner withEncryption(EncryptionConfiguration encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FactoryProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for the data factory.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for the data factory.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the FactoryInner object itself.
     */
    public FactoryInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FactoryProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FactoryInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FactoryInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FactoryInner.
     */
    public static FactoryInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FactoryInner deserializedFactoryInner = new FactoryInner();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFactoryInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFactoryInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFactoryInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedFactoryInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedFactoryInner.withTags(tags);
                } else if ("identity".equals(fieldName)) {
                    deserializedFactoryInner.identity = FactoryIdentity.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedFactoryInner.innerProperties = FactoryProperties.fromJson(reader);
                } else if ("eTag".equals(fieldName)) {
                    deserializedFactoryInner.etag = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedFactoryInner.additionalProperties = additionalProperties;

            return deserializedFactoryInner;
        });
    }
}
