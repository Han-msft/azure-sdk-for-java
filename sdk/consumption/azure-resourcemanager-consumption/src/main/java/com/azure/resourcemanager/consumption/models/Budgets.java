// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Budgets.
 */
public interface Budgets {
    /**
     * Lists all budgets for the defined scope.
     * 
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     * subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     * Management Group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * invoiceSection scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing budgets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Budget> list(String scope);

    /**
     * Lists all budgets for the defined scope.
     * 
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     * subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     * Management Group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * invoiceSection scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing budgets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Budget> list(String scope, Context context);

    /**
     * Gets the budget for the scope by budget name.
     * 
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     * subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     * Management Group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * invoiceSection scope.
     * @param budgetName Budget Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the budget for the scope by budget name along with {@link Response}.
     */
    Response<Budget> getWithResponse(String scope, String budgetName, Context context);

    /**
     * Gets the budget for the scope by budget name.
     * 
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     * subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     * Management Group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * invoiceSection scope.
     * @param budgetName Budget Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the budget for the scope by budget name.
     */
    Budget get(String scope, String budgetName);

    /**
     * The operation to delete a budget.
     * 
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     * subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     * Management Group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * invoiceSection scope.
     * @param budgetName Budget Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String scope, String budgetName, Context context);

    /**
     * The operation to delete a budget.
     * 
     * @param scope The scope associated with budget operations. This includes '/subscriptions/{subscriptionId}/' for
     * subscription scope, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     * for EnrollmentAccount scope, '/providers/Microsoft.Management/managementGroups/{managementGroupId}' for
     * Management Group scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * invoiceSection scope.
     * @param budgetName Budget Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String scope, String budgetName);

    /**
     * Gets the budget for the scope by budget name.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the budget for the scope by budget name along with {@link Response}.
     */
    Budget getById(String id);

    /**
     * Gets the budget for the scope by budget name.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the budget for the scope by budget name along with {@link Response}.
     */
    Response<Budget> getByIdWithResponse(String id, Context context);

    /**
     * The operation to delete a budget.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete a budget.
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
     * Begins definition for a new Budget resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Budget definition.
     */
    Budget.DefinitionStages.Blank define(String name);
}
