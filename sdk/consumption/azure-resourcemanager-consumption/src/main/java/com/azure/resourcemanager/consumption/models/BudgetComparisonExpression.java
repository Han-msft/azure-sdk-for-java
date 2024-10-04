// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The comparison expression to be used in the budgets.
 */
@Fluent
public final class BudgetComparisonExpression implements JsonSerializable<BudgetComparisonExpression> {
    /*
     * The name of the column to use in comparison.
     */
    private String name;

    /*
     * The operator to use for comparison.
     */
    private BudgetOperatorType operator;

    /*
     * Array of values to use for comparison
     */
    private List<String> values;

    /**
     * Creates an instance of BudgetComparisonExpression class.
     */
    public BudgetComparisonExpression() {
    }

    /**
     * Get the name property: The name of the column to use in comparison.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the column to use in comparison.
     * 
     * @param name the name value to set.
     * @return the BudgetComparisonExpression object itself.
     */
    public BudgetComparisonExpression withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the operator property: The operator to use for comparison.
     * 
     * @return the operator value.
     */
    public BudgetOperatorType operator() {
        return this.operator;
    }

    /**
     * Set the operator property: The operator to use for comparison.
     * 
     * @param operator the operator value to set.
     * @return the BudgetComparisonExpression object itself.
     */
    public BudgetComparisonExpression withOperator(BudgetOperatorType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: Array of values to use for comparison.
     * 
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: Array of values to use for comparison.
     * 
     * @param values the values value to set.
     * @return the BudgetComparisonExpression object itself.
     */
    public BudgetComparisonExpression withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property name in model BudgetComparisonExpression"));
        }
        if (operator() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property operator in model BudgetComparisonExpression"));
        }
        if (values() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property values in model BudgetComparisonExpression"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BudgetComparisonExpression.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("operator", this.operator == null ? null : this.operator.toString());
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BudgetComparisonExpression from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BudgetComparisonExpression if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BudgetComparisonExpression.
     */
    public static BudgetComparisonExpression fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BudgetComparisonExpression deserializedBudgetComparisonExpression = new BudgetComparisonExpression();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedBudgetComparisonExpression.name = reader.getString();
                } else if ("operator".equals(fieldName)) {
                    deserializedBudgetComparisonExpression.operator = BudgetOperatorType.fromString(reader.getString());
                } else if ("values".equals(fieldName)) {
                    List<String> values = reader.readArray(reader1 -> reader1.getString());
                    deserializedBudgetComparisonExpression.values = values;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBudgetComparisonExpression;
        });
    }
}
