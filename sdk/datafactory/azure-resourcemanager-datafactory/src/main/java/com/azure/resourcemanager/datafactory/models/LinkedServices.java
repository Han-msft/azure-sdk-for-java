// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of LinkedServices. */
public interface LinkedServices {
    /**
     * Lists linked services.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of linked service resources.
     */
    PagedIterable<LinkedServiceResource> listByFactory(String resourceGroupName, String factoryName);

    /**
     * Lists linked services.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of linked service resources.
     */
    PagedIterable<LinkedServiceResource> listByFactory(String resourceGroupName, String factoryName, Context context);

    /**
     * Gets a linked service.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param linkedServiceName The linked service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service.
     */
    LinkedServiceResource get(String resourceGroupName, String factoryName, String linkedServiceName);

    /**
     * Gets a linked service.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param linkedServiceName The linked service name.
     * @param ifNoneMatch ETag of the linked service entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service along with {@link Response}.
     */
    Response<LinkedServiceResource> getWithResponse(
        String resourceGroupName, String factoryName, String linkedServiceName, String ifNoneMatch, Context context);

    /**
     * Deletes a linked service.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param linkedServiceName The linked service name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String linkedServiceName);

    /**
     * Deletes a linked service.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param linkedServiceName The linked service name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String linkedServiceName, Context context);

    /**
     * Gets a linked service.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service along with {@link Response}.
     */
    LinkedServiceResource getById(String id);

    /**
     * Gets a linked service.
     *
     * @param id the resource ID.
     * @param ifNoneMatch ETag of the linked service entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a linked service along with {@link Response}.
     */
    Response<LinkedServiceResource> getByIdWithResponse(String id, String ifNoneMatch, Context context);

    /**
     * Deletes a linked service.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a linked service.
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
     * Begins definition for a new LinkedServiceResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new LinkedServiceResource definition.
     */
    LinkedServiceResource.DefinitionStages.Blank define(String name);
}
