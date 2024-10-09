// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.botservice.fluent.models.HostSettingsResponseInner;

/**
 * An instance of this class provides access to all the operations defined in HostSettingsClient.
 */
public interface HostSettingsClient {
    /**
     * Get per subscription settings needed to host bot in compute resource such as Azure App Service.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return per subscription settings needed to host bot in compute resource such as Azure App Service along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HostSettingsResponseInner> getWithResponse(Context context);

    /**
     * Get per subscription settings needed to host bot in compute resource such as Azure App Service.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return per subscription settings needed to host bot in compute resource such as Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HostSettingsResponseInner get();
}
