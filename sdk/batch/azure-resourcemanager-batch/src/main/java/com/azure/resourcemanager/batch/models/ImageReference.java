// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A reference to an Azure Virtual Machines Marketplace image or the Azure Image resource of a custom Virtual Machine.
 * To get the list of all imageReferences verified by Azure Batch, see the 'List supported node agent SKUs' operation.
 */
@Fluent
public final class ImageReference implements JsonSerializable<ImageReference> {
    /*
     * For example, Canonical or MicrosoftWindowsServer.
     */
    private String publisher;

    /*
     * For example, UbuntuServer or WindowsServer.
     */
    private String offer;

    /*
     * For example, 18.04-LTS or 2022-datacenter.
     */
    private String sku;

    /*
     * A value of 'latest' can be specified to select the latest version of an image. If omitted, the default is
     * 'latest'.
     */
    private String version;

    /*
     * This property is mutually exclusive with other properties. The Azure Compute Gallery Image must have replicas in
     * the same region as the Azure Batch account. For information about the firewall settings for the Batch node agent
     * to communicate with the Batch service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     */
    private String id;

    /*
     * This property is mutually exclusive with other properties and can be fetched from shared gallery image GET call.
     */
    private String sharedGalleryImageId;

    /*
     * This property is mutually exclusive with other properties and can be fetched from community gallery image GET
     * call.
     */
    private String communityGalleryImageId;

    /**
     * Creates an instance of ImageReference class.
     */
    public ImageReference() {
    }

    /**
     * Get the publisher property: For example, Canonical or MicrosoftWindowsServer.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: For example, Canonical or MicrosoftWindowsServer.
     * 
     * @param publisher the publisher value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: For example, UbuntuServer or WindowsServer.
     * 
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: For example, UbuntuServer or WindowsServer.
     * 
     * @param offer the offer value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: For example, 18.04-LTS or 2022-datacenter.
     * 
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: For example, 18.04-LTS or 2022-datacenter.
     * 
     * @param sku the sku value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the version property: A value of 'latest' can be specified to select the latest version of an image. If
     * omitted, the default is 'latest'.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: A value of 'latest' can be specified to select the latest version of an image. If
     * omitted, the default is 'latest'.
     * 
     * @param version the version value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the id property: This property is mutually exclusive with other properties. The Azure Compute Gallery Image
     * must have replicas in the same region as the Azure Batch account. For information about the firewall settings for
     * the Batch node agent to communicate with the Batch service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: This property is mutually exclusive with other properties. The Azure Compute Gallery Image
     * must have replicas in the same region as the Azure Batch account. For information about the firewall settings for
     * the Batch node agent to communicate with the Batch service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     * 
     * @param id the id value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the sharedGalleryImageId property: This property is mutually exclusive with other properties and can be
     * fetched from shared gallery image GET call.
     * 
     * @return the sharedGalleryImageId value.
     */
    public String sharedGalleryImageId() {
        return this.sharedGalleryImageId;
    }

    /**
     * Set the sharedGalleryImageId property: This property is mutually exclusive with other properties and can be
     * fetched from shared gallery image GET call.
     * 
     * @param sharedGalleryImageId the sharedGalleryImageId value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withSharedGalleryImageId(String sharedGalleryImageId) {
        this.sharedGalleryImageId = sharedGalleryImageId;
        return this;
    }

    /**
     * Get the communityGalleryImageId property: This property is mutually exclusive with other properties and can be
     * fetched from community gallery image GET call.
     * 
     * @return the communityGalleryImageId value.
     */
    public String communityGalleryImageId() {
        return this.communityGalleryImageId;
    }

    /**
     * Set the communityGalleryImageId property: This property is mutually exclusive with other properties and can be
     * fetched from community gallery image GET call.
     * 
     * @param communityGalleryImageId the communityGalleryImageId value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withCommunityGalleryImageId(String communityGalleryImageId) {
        this.communityGalleryImageId = communityGalleryImageId;
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
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("offer", this.offer);
        jsonWriter.writeStringField("sku", this.sku);
        jsonWriter.writeStringField("version", this.version);
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("sharedGalleryImageId", this.sharedGalleryImageId);
        jsonWriter.writeStringField("communityGalleryImageId", this.communityGalleryImageId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageReference if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageReference.
     */
    public static ImageReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageReference deserializedImageReference = new ImageReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("publisher".equals(fieldName)) {
                    deserializedImageReference.publisher = reader.getString();
                } else if ("offer".equals(fieldName)) {
                    deserializedImageReference.offer = reader.getString();
                } else if ("sku".equals(fieldName)) {
                    deserializedImageReference.sku = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedImageReference.version = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedImageReference.id = reader.getString();
                } else if ("sharedGalleryImageId".equals(fieldName)) {
                    deserializedImageReference.sharedGalleryImageId = reader.getString();
                } else if ("communityGalleryImageId".equals(fieldName)) {
                    deserializedImageReference.communityGalleryImageId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageReference;
        });
    }
}
