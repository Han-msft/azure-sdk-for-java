// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.EnvironmentVariableSetupTypeProperties;
import java.io.IOException;

/**
 * The custom setup of setting environment variable.
 */
@Fluent
public final class EnvironmentVariableSetup extends CustomSetupBase {
    /*
     * The type of custom setup.
     */
    private String type = "EnvironmentVariableSetup";

    /*
     * Add environment variable type properties.
     */
    private EnvironmentVariableSetupTypeProperties innerTypeProperties = new EnvironmentVariableSetupTypeProperties();

    /**
     * Creates an instance of EnvironmentVariableSetup class.
     */
    public EnvironmentVariableSetup() {
    }

    /**
     * Get the type property: The type of custom setup.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Add environment variable type properties.
     * 
     * @return the innerTypeProperties value.
     */
    private EnvironmentVariableSetupTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the variableName property: The name of the environment variable.
     * 
     * @return the variableName value.
     */
    public String variableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().variableName();
    }

    /**
     * Set the variableName property: The name of the environment variable.
     * 
     * @param variableName the variableName value to set.
     * @return the EnvironmentVariableSetup object itself.
     */
    public EnvironmentVariableSetup withVariableName(String variableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new EnvironmentVariableSetupTypeProperties();
        }
        this.innerTypeProperties().withVariableName(variableName);
        return this;
    }

    /**
     * Get the variableValue property: The value of the environment variable.
     * 
     * @return the variableValue value.
     */
    public String variableValue() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().variableValue();
    }

    /**
     * Set the variableValue property: The value of the environment variable.
     * 
     * @param variableValue the variableValue value to set.
     * @return the EnvironmentVariableSetup object itself.
     */
    public EnvironmentVariableSetup withVariableValue(String variableValue) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new EnvironmentVariableSetupTypeProperties();
        }
        this.innerTypeProperties().withVariableValue(variableValue);
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
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model EnvironmentVariableSetup"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentVariableSetup.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnvironmentVariableSetup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnvironmentVariableSetup if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the EnvironmentVariableSetup.
     */
    public static EnvironmentVariableSetup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnvironmentVariableSetup deserializedEnvironmentVariableSetup = new EnvironmentVariableSetup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("typeProperties".equals(fieldName)) {
                    deserializedEnvironmentVariableSetup.innerTypeProperties
                        = EnvironmentVariableSetupTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedEnvironmentVariableSetup.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnvironmentVariableSetup;
        });
    }
}
