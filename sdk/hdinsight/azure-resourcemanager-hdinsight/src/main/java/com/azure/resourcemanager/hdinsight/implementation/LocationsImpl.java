// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.fluent.LocationsClient;
import com.azure.resourcemanager.hdinsight.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.BillingResponseListResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.CapabilitiesResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.ClusterCreateValidationResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.NameAvailabilityCheckResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.UsagesListResultInner;
import com.azure.resourcemanager.hdinsight.models.AsyncOperationResult;
import com.azure.resourcemanager.hdinsight.models.BillingResponseListResult;
import com.azure.resourcemanager.hdinsight.models.CapabilitiesResult;
import com.azure.resourcemanager.hdinsight.models.ClusterCreateRequestValidationParameters;
import com.azure.resourcemanager.hdinsight.models.ClusterCreateValidationResult;
import com.azure.resourcemanager.hdinsight.models.Locations;
import com.azure.resourcemanager.hdinsight.models.NameAvailabilityCheckRequestParameters;
import com.azure.resourcemanager.hdinsight.models.NameAvailabilityCheckResult;
import com.azure.resourcemanager.hdinsight.models.UsagesListResult;

public final class LocationsImpl implements Locations {
    private static final ClientLogger LOGGER = new ClientLogger(LocationsImpl.class);

    private final LocationsClient innerClient;

    private final com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager;

    public LocationsImpl(LocationsClient innerClient,
        com.azure.resourcemanager.hdinsight.HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CapabilitiesResult> getCapabilitiesWithResponse(String location, Context context) {
        Response<CapabilitiesResultInner> inner = this.serviceClient().getCapabilitiesWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CapabilitiesResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CapabilitiesResult getCapabilities(String location) {
        CapabilitiesResultInner inner = this.serviceClient().getCapabilities(location);
        if (inner != null) {
            return new CapabilitiesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UsagesListResult> listUsagesWithResponse(String location, Context context) {
        Response<UsagesListResultInner> inner = this.serviceClient().listUsagesWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new UsagesListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UsagesListResult listUsages(String location) {
        UsagesListResultInner inner = this.serviceClient().listUsages(location);
        if (inner != null) {
            return new UsagesListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BillingResponseListResult> listBillingSpecsWithResponse(String location, Context context) {
        Response<BillingResponseListResultInner> inner
            = this.serviceClient().listBillingSpecsWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new BillingResponseListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingResponseListResult listBillingSpecs(String location) {
        BillingResponseListResultInner inner = this.serviceClient().listBillingSpecs(location);
        if (inner != null) {
            return new BillingResponseListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AsyncOperationResult> getAzureAsyncOperationStatusWithResponse(String location, String operationId,
        Context context) {
        Response<AsyncOperationResultInner> inner
            = this.serviceClient().getAzureAsyncOperationStatusWithResponse(location, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AsyncOperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AsyncOperationResult getAzureAsyncOperationStatus(String location, String operationId) {
        AsyncOperationResultInner inner = this.serviceClient().getAzureAsyncOperationStatus(location, operationId);
        if (inner != null) {
            return new AsyncOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NameAvailabilityCheckResult> checkNameAvailabilityWithResponse(String location,
        NameAvailabilityCheckRequestParameters parameters, Context context) {
        Response<NameAvailabilityCheckResultInner> inner
            = this.serviceClient().checkNameAvailabilityWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NameAvailabilityCheckResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NameAvailabilityCheckResult checkNameAvailability(String location,
        NameAvailabilityCheckRequestParameters parameters) {
        NameAvailabilityCheckResultInner inner = this.serviceClient().checkNameAvailability(location, parameters);
        if (inner != null) {
            return new NameAvailabilityCheckResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterCreateValidationResult> validateClusterCreateRequestWithResponse(String location,
        ClusterCreateRequestValidationParameters parameters, Context context) {
        Response<ClusterCreateValidationResultInner> inner
            = this.serviceClient().validateClusterCreateRequestWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ClusterCreateValidationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterCreateValidationResult validateClusterCreateRequest(String location,
        ClusterCreateRequestValidationParameters parameters) {
        ClusterCreateValidationResultInner inner
            = this.serviceClient().validateClusterCreateRequest(location, parameters);
        if (inner != null) {
            return new ClusterCreateValidationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private LocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hdinsight.HDInsightManager manager() {
        return this.serviceManager;
    }
}
