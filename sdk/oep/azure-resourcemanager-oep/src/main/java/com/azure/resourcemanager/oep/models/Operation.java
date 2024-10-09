// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oep.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * REST API Operation
 * 
 * Details of a REST API operation, returned from the Resource Provider Operations API.
 */
@Fluent
public final class Operation implements JsonSerializable<Operation> {
    /*
     * The name of the operation, as per Resource-Based Access Control (RBAC). Examples:
     * "Microsoft.Compute/virtualMachines/write", "Microsoft.Compute/virtualMachines/capture/action"
     */
    private String name;

    /*
     * Whether the operation applies to data-plane. This is "true" for data-plane operations and "false" for
     * ARM/control-plane operations.
     */
    private Boolean isDataAction;

    /*
     * Localized display information for this particular operation.
     */
    private OperationDisplay display;

    /*
     * The intended executor of the operation; as in Resource Based Access Control (RBAC) and audit logs UX. Default
     * value is "user,system"
     */
    private Origin origin;

    /*
     * Enum. Indicates the action type. "Internal" refers to actions that are for internal only APIs.
     */
    private ActionType actionType;

    /**
     * Creates an instance of Operation class.
     */
    public Operation() {
    }

    /**
     * Get the name property: The name of the operation, as per Resource-Based Access Control (RBAC). Examples:
     * "Microsoft.Compute/virtualMachines/write", "Microsoft.Compute/virtualMachines/capture/action".
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the isDataAction property: Whether the operation applies to data-plane. This is "true" for data-plane
     * operations and "false" for ARM/control-plane operations.
     * 
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Get the display property: Localized display information for this particular operation.
     * 
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Localized display information for this particular operation.
     * 
     * @param display the display value to set.
     * @return the Operation object itself.
     */
    public Operation withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation; as in Resource Based Access Control (RBAC) and
     * audit logs UX. Default value is "user,system".
     * 
     * @return the origin value.
     */
    public Origin origin() {
        return this.origin;
    }

    /**
     * Get the actionType property: Enum. Indicates the action type. "Internal" refers to actions that are for internal
     * only APIs.
     * 
     * @return the actionType value.
     */
    public ActionType actionType() {
        return this.actionType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("display", this.display);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Operation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Operation if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Operation.
     */
    public static Operation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Operation deserializedOperation = new Operation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOperation.name = reader.getString();
                } else if ("isDataAction".equals(fieldName)) {
                    deserializedOperation.isDataAction = reader.getNullable(JsonReader::getBoolean);
                } else if ("display".equals(fieldName)) {
                    deserializedOperation.display = OperationDisplay.fromJson(reader);
                } else if ("origin".equals(fieldName)) {
                    deserializedOperation.origin = Origin.fromString(reader.getString());
                } else if ("actionType".equals(fieldName)) {
                    deserializedOperation.actionType = ActionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperation;
        });
    }
}
