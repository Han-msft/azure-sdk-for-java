// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of ReservationRecommendations.
 */
public interface ReservationRecommendations {
    /**
     * List of recommendations for purchasing reserved instances.
     * 
     * @param resourceScope The scope associated with reservation recommendations operations. This includes
     * '/subscriptions/{subscriptionId}/' for subscription scope,
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationRecommendation> list(String resourceScope);

    /**
     * List of recommendations for purchasing reserved instances.
     * 
     * @param resourceScope The scope associated with reservation recommendations operations. This includes
     * '/subscriptions/{subscriptionId}/' for subscription scope,
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope.
     * @param filter May be used to filter reservationRecommendations by: properties/scope with allowed values
     * ['Single', 'Shared'] and default value 'Single'; properties/resourceType with allowed values ['VirtualMachines',
     * 'SQLDatabases', 'PostgreSQL', 'ManagedDisk', 'MySQL', 'RedHat', 'MariaDB', 'RedisCache', 'CosmosDB',
     * 'SqlDataWarehouse', 'SUSELinux', 'AppService', 'BlockBlob', 'AzureDataExplorer', 'VMwareCloudSimple'] and default
     * value 'VirtualMachines'; and properties/lookBackPeriod with allowed values ['Last7Days', 'Last30Days',
     * 'Last60Days'] and default value 'Last7Days'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ReservationRecommendation> list(String resourceScope, String filter, Context context);
}
