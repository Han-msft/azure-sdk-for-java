// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of LotsOperations.
 */
public interface LotsOperations {
    /**
     * Lists all Azure credits for a billing account or a billing profile. The API is only supported for Microsoft
     * Customer Agreements (MCA) billing accounts.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing lot summary as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LotSummary> listByBillingProfile(String billingAccountId, String billingProfileId);

    /**
     * Lists all Azure credits for a billing account or a billing profile. The API is only supported for Microsoft
     * Customer Agreements (MCA) billing accounts.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing lot summary as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LotSummary> listByBillingProfile(String billingAccountId, String billingProfileId, Context context);

    /**
     * Lists all Microsoft Azure consumption commitments for a billing account. The API is only supported for Microsoft
     * Customer Agreements (MCA) and Direct Enterprise Agreement (EA) billing accounts.
     * 
     * @param billingAccountId BillingAccount ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing lot summary as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LotSummary> listByBillingAccount(String billingAccountId);

    /**
     * Lists all Microsoft Azure consumption commitments for a billing account. The API is only supported for Microsoft
     * Customer Agreements (MCA) and Direct Enterprise Agreement (EA) billing accounts.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param filter May be used to filter the lots by Status, Source etc. The filter supports 'eq', 'lt', 'gt', 'le',
     * 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where
     * key and value is separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing lot summary as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LotSummary> listByBillingAccount(String billingAccountId, String filter, Context context);

    /**
     * Lists all Azure credits for a customer. The API is only supported for Microsoft Partner Agreements (MPA) billing
     * accounts.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param customerId Customer ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing lot summary as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LotSummary> listByCustomer(String billingAccountId, String customerId);

    /**
     * Lists all Azure credits for a customer. The API is only supported for Microsoft Partner Agreements (MPA) billing
     * accounts.
     * 
     * @param billingAccountId BillingAccount ID.
     * @param customerId Customer ID.
     * @param filter May be used to filter the lots by Status, Source etc. The filter supports 'eq', 'lt', 'gt', 'le',
     * 'ge', and 'and'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing lot summary as paginated response with {@link PagedIterable}.
     */
    PagedIterable<LotSummary> listByCustomer(String billingAccountId, String customerId, String filter,
        Context context);
}
