// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.DataMaskingFunction;
import com.azure.resourcemanager.sql.models.DataMaskingRuleState;
import java.io.IOException;

/**
 * A database data masking rule.
 */
@Fluent
public final class DataMaskingRuleInner extends ProxyResource {
    /*
     * The location of the data masking rule.
     */
    private String location;

    /*
     * The kind of Data Masking Rule. Metadata, used for Azure portal.
     */
    private String kind;

    /*
     * Resource properties.
     */
    private DataMaskingRuleProperties innerProperties;

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
     * Creates an instance of DataMaskingRuleInner class.
     */
    public DataMaskingRuleInner() {
    }

    /**
     * Get the location property: The location of the data masking rule.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the kind property: The kind of Data Masking Rule. Metadata, used for Azure portal.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private DataMaskingRuleProperties innerProperties() {
        return this.innerProperties;
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
     * Get the id property: The rule Id.
     * 
     * @return the id value.
     */
    public String idPropertiesId() {
        return this.innerProperties() == null ? null : this.innerProperties().id();
    }

    /**
     * Get the ruleState property: The rule state. Used to delete a rule. To delete an existing rule, specify the
     * schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the rule
     * doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the provided value
     * of ruleState.
     * 
     * @return the ruleState value.
     */
    public DataMaskingRuleState ruleState() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleState();
    }

    /**
     * Set the ruleState property: The rule state. Used to delete a rule. To delete an existing rule, specify the
     * schemaName, tableName, columnName, maskingFunction, and specify ruleState as disabled. However, if the rule
     * doesn't already exist, the rule will be created with ruleState set to enabled, regardless of the provided value
     * of ruleState.
     * 
     * @param ruleState the ruleState value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withRuleState(DataMaskingRuleState ruleState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withRuleState(ruleState);
        return this;
    }

    /**
     * Get the schemaName property: The schema name on which the data masking rule is applied.
     * 
     * @return the schemaName value.
     */
    public String schemaName() {
        return this.innerProperties() == null ? null : this.innerProperties().schemaName();
    }

    /**
     * Set the schemaName property: The schema name on which the data masking rule is applied.
     * 
     * @param schemaName the schemaName value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withSchemaName(String schemaName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withSchemaName(schemaName);
        return this;
    }

    /**
     * Get the tableName property: The table name on which the data masking rule is applied.
     * 
     * @return the tableName value.
     */
    public String tableName() {
        return this.innerProperties() == null ? null : this.innerProperties().tableName();
    }

    /**
     * Set the tableName property: The table name on which the data masking rule is applied.
     * 
     * @param tableName the tableName value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withTableName(String tableName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the columnName property: The column name on which the data masking rule is applied.
     * 
     * @return the columnName value.
     */
    public String columnName() {
        return this.innerProperties() == null ? null : this.innerProperties().columnName();
    }

    /**
     * Set the columnName property: The column name on which the data masking rule is applied.
     * 
     * @param columnName the columnName value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withColumnName(String columnName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withColumnName(columnName);
        return this;
    }

    /**
     * Get the aliasName property: The alias name. This is a legacy parameter and is no longer used.
     * 
     * @return the aliasName value.
     */
    public String aliasName() {
        return this.innerProperties() == null ? null : this.innerProperties().aliasName();
    }

    /**
     * Set the aliasName property: The alias name. This is a legacy parameter and is no longer used.
     * 
     * @param aliasName the aliasName value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withAliasName(String aliasName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withAliasName(aliasName);
        return this;
    }

    /**
     * Get the maskingFunction property: The masking function that is used for the data masking rule.
     * 
     * @return the maskingFunction value.
     */
    public DataMaskingFunction maskingFunction() {
        return this.innerProperties() == null ? null : this.innerProperties().maskingFunction();
    }

    /**
     * Set the maskingFunction property: The masking function that is used for the data masking rule.
     * 
     * @param maskingFunction the maskingFunction value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withMaskingFunction(DataMaskingFunction maskingFunction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withMaskingFunction(maskingFunction);
        return this;
    }

    /**
     * Get the numberFrom property: The numberFrom property of the masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     * 
     * @return the numberFrom value.
     */
    public String numberFrom() {
        return this.innerProperties() == null ? null : this.innerProperties().numberFrom();
    }

    /**
     * Set the numberFrom property: The numberFrom property of the masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     * 
     * @param numberFrom the numberFrom value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withNumberFrom(String numberFrom) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withNumberFrom(numberFrom);
        return this;
    }

    /**
     * Get the numberTo property: The numberTo property of the data masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     * 
     * @return the numberTo value.
     */
    public String numberTo() {
        return this.innerProperties() == null ? null : this.innerProperties().numberTo();
    }

    /**
     * Set the numberTo property: The numberTo property of the data masking rule. Required if maskingFunction is set to
     * Number, otherwise this parameter will be ignored.
     * 
     * @param numberTo the numberTo value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withNumberTo(String numberTo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withNumberTo(numberTo);
        return this;
    }

    /**
     * Get the prefixSize property: If maskingFunction is set to Text, the number of characters to show unmasked in the
     * beginning of the string. Otherwise, this parameter will be ignored.
     * 
     * @return the prefixSize value.
     */
    public String prefixSize() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixSize();
    }

    /**
     * Set the prefixSize property: If maskingFunction is set to Text, the number of characters to show unmasked in the
     * beginning of the string. Otherwise, this parameter will be ignored.
     * 
     * @param prefixSize the prefixSize value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withPrefixSize(String prefixSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withPrefixSize(prefixSize);
        return this;
    }

    /**
     * Get the suffixSize property: If maskingFunction is set to Text, the number of characters to show unmasked at the
     * end of the string. Otherwise, this parameter will be ignored.
     * 
     * @return the suffixSize value.
     */
    public String suffixSize() {
        return this.innerProperties() == null ? null : this.innerProperties().suffixSize();
    }

    /**
     * Set the suffixSize property: If maskingFunction is set to Text, the number of characters to show unmasked at the
     * end of the string. Otherwise, this parameter will be ignored.
     * 
     * @param suffixSize the suffixSize value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withSuffixSize(String suffixSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withSuffixSize(suffixSize);
        return this;
    }

    /**
     * Get the replacementString property: If maskingFunction is set to Text, the character to use for masking the
     * unexposed part of the string. Otherwise, this parameter will be ignored.
     * 
     * @return the replacementString value.
     */
    public String replacementString() {
        return this.innerProperties() == null ? null : this.innerProperties().replacementString();
    }

    /**
     * Set the replacementString property: If maskingFunction is set to Text, the character to use for masking the
     * unexposed part of the string. Otherwise, this parameter will be ignored.
     * 
     * @param replacementString the replacementString value to set.
     * @return the DataMaskingRuleInner object itself.
     */
    public DataMaskingRuleInner withReplacementString(String replacementString) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingRuleProperties();
        }
        this.innerProperties().withReplacementString(replacementString);
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataMaskingRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataMaskingRuleInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataMaskingRuleInner.
     */
    public static DataMaskingRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataMaskingRuleInner deserializedDataMaskingRuleInner = new DataMaskingRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDataMaskingRuleInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDataMaskingRuleInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDataMaskingRuleInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDataMaskingRuleInner.location = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedDataMaskingRuleInner.kind = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedDataMaskingRuleInner.innerProperties = DataMaskingRuleProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataMaskingRuleInner;
        });
    }
}
