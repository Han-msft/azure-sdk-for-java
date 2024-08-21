// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.resourcemanager.hdinsight.fluent.models.AsyncOperationResultInner;

/**
 * An immutable client-side representation of AsyncOperationResult.
 */
public interface AsyncOperationResult {
    /**
     * Gets the status property: The async operation state.
     * 
     * @return the status value.
     */
    AsyncOperationState status();

    /**
     * Gets the error property: The operation error information.
     * 
     * @return the error value.
     */
    Errors error();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.fluent.models.AsyncOperationResultInner object.
     * 
     * @return the inner object.
     */
    AsyncOperationResultInner innerModel();
}
