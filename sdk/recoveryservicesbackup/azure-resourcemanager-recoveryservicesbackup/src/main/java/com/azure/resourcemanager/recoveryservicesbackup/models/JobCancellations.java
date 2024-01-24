// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of JobCancellations.
 */
public interface JobCancellations {
    /**
     * Cancels a job. This is an asynchronous operation. To know the status of the cancellation, call
     * GetCancelOperationResult API.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param jobName Name of the job to cancel.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> triggerWithResponse(String vaultName, String resourceGroupName, String jobName, Context context);

    /**
     * Cancels a job. This is an asynchronous operation. To know the status of the cancellation, call
     * GetCancelOperationResult API.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param jobName Name of the job to cancel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void trigger(String vaultName, String resourceGroupName, String jobName);
}
