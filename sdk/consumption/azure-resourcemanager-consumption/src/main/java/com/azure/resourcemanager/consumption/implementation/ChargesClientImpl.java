// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.consumption.fluent.ChargesClient;
import com.azure.resourcemanager.consumption.fluent.models.ChargesListResultInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ChargesClient.
 */
public final class ChargesClientImpl implements ChargesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ChargesService service;

    /**
     * The service client containing this operation class.
     */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of ChargesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ChargesClientImpl(ConsumptionManagementClientImpl client) {
        this.service = RestProxy.create(ChargesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientCharges to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    public interface ChargesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/{scope}/providers/Microsoft.Consumption/charges")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ChargesListResultInner>> list(@HostParam("$host") String endpoint,
            @PathParam(value = "scope", encoded = true) String scope, @QueryParam("api-version") String apiVersion,
            @QueryParam("startDate") String startDate, @QueryParam("endDate") String endDate,
            @QueryParam("$filter") String filter, @QueryParam("$apply") String apply,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Lists the charges based for the defined scope.
     * 
     * @param scope The scope associated with charges operations. This includes
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope. For department and enrollment accounts, you can also add billing period to the scope
     * using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to specify billing period at
     * department scope use
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     * Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     * billingAccount scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     * for invoiceSection scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * @param startDate Start date.
     * @param endDate End date.
     * @param filter May be used to filter charges by properties/usageEnd (Utc time), properties/usageStart (Utc time).
     * The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param apply May be used to group charges for billingAccount scope by properties/billingProfileId,
     * properties/invoiceSectionId, properties/customerId (specific for Partner Led), or for billingProfile scope by
     * properties/invoiceSectionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing charge summary along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ChargesListResultInner>> listWithResponseAsync(String scope, String startDate, String endDate,
        String filter, String apply) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), scope, this.client.getApiVersion(),
                startDate, endDate, filter, apply, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists the charges based for the defined scope.
     * 
     * @param scope The scope associated with charges operations. This includes
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope. For department and enrollment accounts, you can also add billing period to the scope
     * using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to specify billing period at
     * department scope use
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     * Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     * billingAccount scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     * for invoiceSection scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * @param startDate Start date.
     * @param endDate End date.
     * @param filter May be used to filter charges by properties/usageEnd (Utc time), properties/usageStart (Utc time).
     * The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param apply May be used to group charges for billingAccount scope by properties/billingProfileId,
     * properties/invoiceSectionId, properties/customerId (specific for Partner Led), or for billingProfile scope by
     * properties/invoiceSectionId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing charge summary along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ChargesListResultInner>> listWithResponseAsync(String scope, String startDate, String endDate,
        String filter, String apply, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), scope, this.client.getApiVersion(), startDate, endDate, filter,
            apply, accept, context);
    }

    /**
     * Lists the charges based for the defined scope.
     * 
     * @param scope The scope associated with charges operations. This includes
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope. For department and enrollment accounts, you can also add billing period to the scope
     * using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to specify billing period at
     * department scope use
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     * Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     * billingAccount scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     * for invoiceSection scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing charge summary on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ChargesListResultInner> listAsync(String scope) {
        final String startDate = null;
        final String endDate = null;
        final String filter = null;
        final String apply = null;
        return listWithResponseAsync(scope, startDate, endDate, filter, apply)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Lists the charges based for the defined scope.
     * 
     * @param scope The scope associated with charges operations. This includes
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope. For department and enrollment accounts, you can also add billing period to the scope
     * using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to specify billing period at
     * department scope use
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     * Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     * billingAccount scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     * for invoiceSection scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * @param startDate Start date.
     * @param endDate End date.
     * @param filter May be used to filter charges by properties/usageEnd (Utc time), properties/usageStart (Utc time).
     * The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param apply May be used to group charges for billingAccount scope by properties/billingProfileId,
     * properties/invoiceSectionId, properties/customerId (specific for Partner Led), or for billingProfile scope by
     * properties/invoiceSectionId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing charge summary along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ChargesListResultInner> listWithResponse(String scope, String startDate, String endDate,
        String filter, String apply, Context context) {
        return listWithResponseAsync(scope, startDate, endDate, filter, apply, context).block();
    }

    /**
     * Lists the charges based for the defined scope.
     * 
     * @param scope The scope associated with charges operations. This includes
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     * scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope. For department and enrollment accounts, you can also add billing period to the scope
     * using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to specify billing period at
     * department scope use
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     * Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for
     * billingAccount scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * billingProfile scope,
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     * for invoiceSection scope, and
     * '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing charge summary.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ChargesListResultInner list(String scope) {
        final String startDate = null;
        final String endDate = null;
        final String filter = null;
        final String apply = null;
        return listWithResponse(scope, startDate, endDate, filter, apply, Context.NONE).getValue();
    }
}
