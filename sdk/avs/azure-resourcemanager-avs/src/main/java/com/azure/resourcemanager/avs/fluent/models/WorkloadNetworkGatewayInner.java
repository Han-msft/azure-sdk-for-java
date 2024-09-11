// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.WorkloadNetworkProvisioningState;
import java.io.IOException;

/**
 * NSX Gateway.
 */
@Fluent
public final class WorkloadNetworkGatewayInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private WorkloadNetworkGatewayProperties innerProperties;

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
     * Creates an instance of WorkloadNetworkGatewayInner class.
     */
    public WorkloadNetworkGatewayInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private WorkloadNetworkGatewayProperties innerProperties() {
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
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public WorkloadNetworkProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the displayName property: Display name of the DHCP entity.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name of the DHCP entity.
     * 
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkGatewayInner object itself.
     */
    public WorkloadNetworkGatewayInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadNetworkGatewayProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the path property: NSX Gateway Path.
     * 
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadNetworkGatewayInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadNetworkGatewayInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WorkloadNetworkGatewayInner.
     */
    public static WorkloadNetworkGatewayInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadNetworkGatewayInner deserializedWorkloadNetworkGatewayInner = new WorkloadNetworkGatewayInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayInner.innerProperties
                        = WorkloadNetworkGatewayProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedWorkloadNetworkGatewayInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadNetworkGatewayInner;
        });
    }
}
