// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of DataProductsCatalogs.
 */
public interface DataProductsCatalogs {
    /**
     * List data catalog by subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DataProductsCatalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataProductsCatalog> list();

    /**
     * List data catalog by subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DataProductsCatalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataProductsCatalog> list(Context context);

    /**
     * List data catalog by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DataProductsCatalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataProductsCatalog> listByResourceGroup(String resourceGroupName);

    /**
     * List data catalog by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a DataProductsCatalog list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DataProductsCatalog> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve data type resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data catalog resource along with {@link Response}.
     */
    Response<DataProductsCatalog> getByResourceGroupWithResponse(String resourceGroupName, Context context);

    /**
     * Retrieve data type resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data catalog resource.
     */
    DataProductsCatalog getByResourceGroup(String resourceGroupName);
}
