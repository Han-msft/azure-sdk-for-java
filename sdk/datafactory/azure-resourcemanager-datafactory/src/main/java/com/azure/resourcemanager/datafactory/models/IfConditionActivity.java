// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.IfConditionActivityTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This activity evaluates a boolean expression and executes either the activities under the ifTrueActivities property
 * or the ifFalseActivities property depending on the result of the expression.
 */
@Fluent
public final class IfConditionActivity extends ControlActivity {
    /*
     * Type of activity.
     */
    private String type = "IfCondition";

    /*
     * IfCondition activity properties.
     */
    private IfConditionActivityTypeProperties innerTypeProperties = new IfConditionActivityTypeProperties();

    /**
     * Creates an instance of IfConditionActivity class.
     */
    public IfConditionActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: IfCondition activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private IfConditionActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IfConditionActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IfConditionActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IfConditionActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IfConditionActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IfConditionActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IfConditionActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the expression property: An expression that would evaluate to Boolean. This is used to determine the block of
     * activities (ifTrueActivities or ifFalseActivities) that will be executed.
     * 
     * @return the expression value.
     */
    public Expression expression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().expression();
    }

    /**
     * Set the expression property: An expression that would evaluate to Boolean. This is used to determine the block of
     * activities (ifTrueActivities or ifFalseActivities) that will be executed.
     * 
     * @param expression the expression value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withExpression(Expression expression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new IfConditionActivityTypeProperties();
        }
        this.innerTypeProperties().withExpression(expression);
        return this;
    }

    /**
     * Get the ifTrueActivities property: List of activities to execute if expression is evaluated to true. This is an
     * optional property and if not provided, the activity will exit without any action.
     * 
     * @return the ifTrueActivities value.
     */
    public List<Activity> ifTrueActivities() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().ifTrueActivities();
    }

    /**
     * Set the ifTrueActivities property: List of activities to execute if expression is evaluated to true. This is an
     * optional property and if not provided, the activity will exit without any action.
     * 
     * @param ifTrueActivities the ifTrueActivities value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withIfTrueActivities(List<Activity> ifTrueActivities) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new IfConditionActivityTypeProperties();
        }
        this.innerTypeProperties().withIfTrueActivities(ifTrueActivities);
        return this;
    }

    /**
     * Get the ifFalseActivities property: List of activities to execute if expression is evaluated to false. This is an
     * optional property and if not provided, the activity will exit without any action.
     * 
     * @return the ifFalseActivities value.
     */
    public List<Activity> ifFalseActivities() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().ifFalseActivities();
    }

    /**
     * Set the ifFalseActivities property: List of activities to execute if expression is evaluated to false. This is an
     * optional property and if not provided, the activity will exit without any action.
     * 
     * @param ifFalseActivities the ifFalseActivities value to set.
     * @return the IfConditionActivity object itself.
     */
    public IfConditionActivity withIfFalseActivities(List<Activity> ifFalseActivities) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new IfConditionActivityTypeProperties();
        }
        this.innerTypeProperties().withIfFalseActivities(ifFalseActivities);
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
                    "Missing required property innerTypeProperties in model IfConditionActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IfConditionActivity.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("state", state() == null ? null : state().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            onInactiveMarkAs() == null ? null : onInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", dependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", userProperties(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IfConditionActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IfConditionActivity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IfConditionActivity.
     */
    public static IfConditionActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IfConditionActivity deserializedIfConditionActivity = new IfConditionActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedIfConditionActivity.withName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedIfConditionActivity.withDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedIfConditionActivity.withState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedIfConditionActivity
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedIfConditionActivity.withDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedIfConditionActivity.withUserProperties(userProperties);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedIfConditionActivity.innerTypeProperties
                        = IfConditionActivityTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedIfConditionActivity.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedIfConditionActivity.withAdditionalProperties(additionalProperties);

            return deserializedIfConditionActivity;
        });
    }
}
