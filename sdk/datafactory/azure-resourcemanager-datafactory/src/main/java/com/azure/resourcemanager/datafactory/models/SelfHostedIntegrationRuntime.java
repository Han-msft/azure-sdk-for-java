// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Self-hosted integration runtime.
 */
@Fluent
public final class SelfHostedIntegrationRuntime extends IntegrationRuntime {
    /*
     * Type of integration runtime.
     */
    private IntegrationRuntimeType type = IntegrationRuntimeType.SELF_HOSTED;

    /*
     * When this property is not null, means this is a linked integration runtime. The property is used to access
     * original integration runtime.
     */
    private SelfHostedIntegrationRuntimeTypeProperties innerTypeProperties;

    /**
     * Creates an instance of SelfHostedIntegrationRuntime class.
     */
    public SelfHostedIntegrationRuntime() {
    }

    /**
     * Get the type property: Type of integration runtime.
     * 
     * @return the type value.
     */
    @Override
    public IntegrationRuntimeType type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: When this property is not null, means this is a linked integration runtime.
     * The property is used to access original integration runtime.
     * 
     * @return the innerTypeProperties value.
     */
    private SelfHostedIntegrationRuntimeTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SelfHostedIntegrationRuntime withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Get the linkedInfo property: The base definition of a linked integration runtime.
     * 
     * @return the linkedInfo value.
     */
    public LinkedIntegrationRuntimeType linkedInfo() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().linkedInfo();
    }

    /**
     * Set the linkedInfo property: The base definition of a linked integration runtime.
     * 
     * @param linkedInfo the linkedInfo value to set.
     * @return the SelfHostedIntegrationRuntime object itself.
     */
    public SelfHostedIntegrationRuntime withLinkedInfo(LinkedIntegrationRuntimeType linkedInfo) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SelfHostedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties().withLinkedInfo(linkedInfo);
        return this;
    }

    /**
     * Get the selfContainedInteractiveAuthoringEnabled property: An alternative option to ensure interactive authoring
     * function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
     * 
     * @return the selfContainedInteractiveAuthoringEnabled value.
     */
    public Boolean selfContainedInteractiveAuthoringEnabled() {
        return this.innerTypeProperties() == null
            ? null
            : this.innerTypeProperties().selfContainedInteractiveAuthoringEnabled();
    }

    /**
     * Set the selfContainedInteractiveAuthoringEnabled property: An alternative option to ensure interactive authoring
     * function when your self-hosted integration runtime is unable to establish a connection with Azure Relay.
     * 
     * @param selfContainedInteractiveAuthoringEnabled the selfContainedInteractiveAuthoringEnabled value to set.
     * @return the SelfHostedIntegrationRuntime object itself.
     */
    public SelfHostedIntegrationRuntime
        withSelfContainedInteractiveAuthoringEnabled(Boolean selfContainedInteractiveAuthoringEnabled) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SelfHostedIntegrationRuntimeTypeProperties();
        }
        this.innerTypeProperties()
            .withSelfContainedInteractiveAuthoringEnabled(selfContainedInteractiveAuthoringEnabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SelfHostedIntegrationRuntime from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SelfHostedIntegrationRuntime if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SelfHostedIntegrationRuntime.
     */
    public static SelfHostedIntegrationRuntime fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SelfHostedIntegrationRuntime deserializedSelfHostedIntegrationRuntime = new SelfHostedIntegrationRuntime();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedSelfHostedIntegrationRuntime.withDescription(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedSelfHostedIntegrationRuntime.type
                        = IntegrationRuntimeType.fromString(reader.getString());
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedSelfHostedIntegrationRuntime.innerTypeProperties
                        = SelfHostedIntegrationRuntimeTypeProperties.fromJson(reader);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedSelfHostedIntegrationRuntime.withAdditionalProperties(additionalProperties);

            return deserializedSelfHostedIntegrationRuntime;
        });
    }
}
