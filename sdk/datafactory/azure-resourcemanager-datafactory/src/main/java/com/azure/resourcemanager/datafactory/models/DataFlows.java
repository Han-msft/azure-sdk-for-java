// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DataFlows. */
public interface DataFlows {
    /**
     * Gets a data flow.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    DataFlowResource get(String resourceGroupName, String factoryName, String dataFlowName);

    /**
     * Gets a data flow.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow along with {@link Response}.
     */
    Response<DataFlowResource> getWithResponse(
        String resourceGroupName, String factoryName, String dataFlowName, String ifNoneMatch, Context context);

    /**
     * Deletes a data flow.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String dataFlowName);

    /**
     * Deletes a data flow.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param dataFlowName The data flow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String dataFlowName, Context context);

    /**
     * Lists data flows.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources.
     */
    PagedIterable<DataFlowResource> listByFactory(String resourceGroupName, String factoryName);

    /**
     * Lists data flows.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources.
     */
    PagedIterable<DataFlowResource> listByFactory(String resourceGroupName, String factoryName, Context context);

    /**
     * Gets a data flow.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow along with {@link Response}.
     */
    DataFlowResource getById(String id);

    /**
     * Gets a data flow.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow along with {@link Response}.
     */
    Response<DataFlowResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Deletes a data flow.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a data flow.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DataFlowResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new DataFlowResource definition.
     */
    DataFlowResource.DefinitionStages.Blank define(String name);
}
