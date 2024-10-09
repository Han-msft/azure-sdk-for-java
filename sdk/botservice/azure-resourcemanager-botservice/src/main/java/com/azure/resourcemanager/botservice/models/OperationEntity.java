// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.resourcemanager.botservice.fluent.models.OperationEntityInner;

/**
 * An immutable client-side representation of OperationEntity.
 */
public interface OperationEntity {
    /**
     * Gets the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The operation supported by Bot Service Management.
     * 
     * @return the display value.
     */
    OperationDisplayInfo display();

    /**
     * Gets the origin property: The origin of the operation.
     * 
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the properties property: Additional properties.
     * 
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the inner com.azure.resourcemanager.botservice.fluent.models.OperationEntityInner object.
     * 
     * @return the inner object.
     */
    OperationEntityInner innerModel();
}
