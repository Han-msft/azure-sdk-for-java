// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.consumption.fluent.AggregatedCostsClient;
import com.azure.resourcemanager.consumption.fluent.BalancesClient;
import com.azure.resourcemanager.consumption.fluent.BudgetsClient;
import com.azure.resourcemanager.consumption.fluent.ChargesClient;
import com.azure.resourcemanager.consumption.fluent.ConsumptionManagementClient;
import com.azure.resourcemanager.consumption.fluent.CreditsClient;
import com.azure.resourcemanager.consumption.fluent.EventsOperationsClient;
import com.azure.resourcemanager.consumption.fluent.LotsOperationsClient;
import com.azure.resourcemanager.consumption.fluent.MarketplacesClient;
import com.azure.resourcemanager.consumption.fluent.OperationsClient;
import com.azure.resourcemanager.consumption.fluent.PriceSheetsClient;
import com.azure.resourcemanager.consumption.fluent.ReservationRecommendationDetailsClient;
import com.azure.resourcemanager.consumption.fluent.ReservationRecommendationsClient;
import com.azure.resourcemanager.consumption.fluent.ReservationTransactionsClient;
import com.azure.resourcemanager.consumption.fluent.ReservationsDetailsClient;
import com.azure.resourcemanager.consumption.fluent.ReservationsSummariesClient;
import com.azure.resourcemanager.consumption.fluent.TagsClient;
import com.azure.resourcemanager.consumption.fluent.UsageDetailsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the ConsumptionManagementClientImpl type.
 */
@ServiceClient(builder = ConsumptionManagementClientBuilder.class)
public final class ConsumptionManagementClientImpl implements ConsumptionManagementClient {
    /**
     * Azure Subscription ID.
     */
    private final String subscriptionId;

    /**
     * Gets Azure Subscription ID.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * server parameter.
     */
    private final String endpoint;

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Api Version.
     */
    private final String apiVersion;

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The default poll interval for long-running operation.
     */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /**
     * The UsageDetailsClient object to access its operations.
     */
    private final UsageDetailsClient usageDetails;

    /**
     * Gets the UsageDetailsClient object to access its operations.
     * 
     * @return the UsageDetailsClient object.
     */
    public UsageDetailsClient getUsageDetails() {
        return this.usageDetails;
    }

    /**
     * The MarketplacesClient object to access its operations.
     */
    private final MarketplacesClient marketplaces;

    /**
     * Gets the MarketplacesClient object to access its operations.
     * 
     * @return the MarketplacesClient object.
     */
    public MarketplacesClient getMarketplaces() {
        return this.marketplaces;
    }

    /**
     * The BudgetsClient object to access its operations.
     */
    private final BudgetsClient budgets;

    /**
     * Gets the BudgetsClient object to access its operations.
     * 
     * @return the BudgetsClient object.
     */
    public BudgetsClient getBudgets() {
        return this.budgets;
    }

    /**
     * The TagsClient object to access its operations.
     */
    private final TagsClient tags;

    /**
     * Gets the TagsClient object to access its operations.
     * 
     * @return the TagsClient object.
     */
    public TagsClient getTags() {
        return this.tags;
    }

    /**
     * The ChargesClient object to access its operations.
     */
    private final ChargesClient charges;

    /**
     * Gets the ChargesClient object to access its operations.
     * 
     * @return the ChargesClient object.
     */
    public ChargesClient getCharges() {
        return this.charges;
    }

    /**
     * The BalancesClient object to access its operations.
     */
    private final BalancesClient balances;

    /**
     * Gets the BalancesClient object to access its operations.
     * 
     * @return the BalancesClient object.
     */
    public BalancesClient getBalances() {
        return this.balances;
    }

    /**
     * The ReservationsSummariesClient object to access its operations.
     */
    private final ReservationsSummariesClient reservationsSummaries;

    /**
     * Gets the ReservationsSummariesClient object to access its operations.
     * 
     * @return the ReservationsSummariesClient object.
     */
    public ReservationsSummariesClient getReservationsSummaries() {
        return this.reservationsSummaries;
    }

    /**
     * The ReservationsDetailsClient object to access its operations.
     */
    private final ReservationsDetailsClient reservationsDetails;

    /**
     * Gets the ReservationsDetailsClient object to access its operations.
     * 
     * @return the ReservationsDetailsClient object.
     */
    public ReservationsDetailsClient getReservationsDetails() {
        return this.reservationsDetails;
    }

    /**
     * The ReservationRecommendationsClient object to access its operations.
     */
    private final ReservationRecommendationsClient reservationRecommendations;

    /**
     * Gets the ReservationRecommendationsClient object to access its operations.
     * 
     * @return the ReservationRecommendationsClient object.
     */
    public ReservationRecommendationsClient getReservationRecommendations() {
        return this.reservationRecommendations;
    }

    /**
     * The ReservationRecommendationDetailsClient object to access its operations.
     */
    private final ReservationRecommendationDetailsClient reservationRecommendationDetails;

    /**
     * Gets the ReservationRecommendationDetailsClient object to access its operations.
     * 
     * @return the ReservationRecommendationDetailsClient object.
     */
    public ReservationRecommendationDetailsClient getReservationRecommendationDetails() {
        return this.reservationRecommendationDetails;
    }

    /**
     * The ReservationTransactionsClient object to access its operations.
     */
    private final ReservationTransactionsClient reservationTransactions;

    /**
     * Gets the ReservationTransactionsClient object to access its operations.
     * 
     * @return the ReservationTransactionsClient object.
     */
    public ReservationTransactionsClient getReservationTransactions() {
        return this.reservationTransactions;
    }

    /**
     * The PriceSheetsClient object to access its operations.
     */
    private final PriceSheetsClient priceSheets;

    /**
     * Gets the PriceSheetsClient object to access its operations.
     * 
     * @return the PriceSheetsClient object.
     */
    public PriceSheetsClient getPriceSheets() {
        return this.priceSheets;
    }

    /**
     * The OperationsClient object to access its operations.
     */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * The AggregatedCostsClient object to access its operations.
     */
    private final AggregatedCostsClient aggregatedCosts;

    /**
     * Gets the AggregatedCostsClient object to access its operations.
     * 
     * @return the AggregatedCostsClient object.
     */
    public AggregatedCostsClient getAggregatedCosts() {
        return this.aggregatedCosts;
    }

    /**
     * The EventsOperationsClient object to access its operations.
     */
    private final EventsOperationsClient eventsOperations;

    /**
     * Gets the EventsOperationsClient object to access its operations.
     * 
     * @return the EventsOperationsClient object.
     */
    public EventsOperationsClient getEventsOperations() {
        return this.eventsOperations;
    }

    /**
     * The LotsOperationsClient object to access its operations.
     */
    private final LotsOperationsClient lotsOperations;

    /**
     * Gets the LotsOperationsClient object to access its operations.
     * 
     * @return the LotsOperationsClient object.
     */
    public LotsOperationsClient getLotsOperations() {
        return this.lotsOperations;
    }

    /**
     * The CreditsClient object to access its operations.
     */
    private final CreditsClient credits;

    /**
     * Gets the CreditsClient object to access its operations.
     * 
     * @return the CreditsClient object.
     */
    public CreditsClient getCredits() {
        return this.credits;
    }

    /**
     * Initializes an instance of ConsumptionManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId Azure Subscription ID.
     * @param endpoint server parameter.
     */
    ConsumptionManagementClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter,
        Duration defaultPollInterval, AzureEnvironment environment, String subscriptionId, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2021-10-01";
        this.usageDetails = new UsageDetailsClientImpl(this);
        this.marketplaces = new MarketplacesClientImpl(this);
        this.budgets = new BudgetsClientImpl(this);
        this.tags = new TagsClientImpl(this);
        this.charges = new ChargesClientImpl(this);
        this.balances = new BalancesClientImpl(this);
        this.reservationsSummaries = new ReservationsSummariesClientImpl(this);
        this.reservationsDetails = new ReservationsDetailsClientImpl(this);
        this.reservationRecommendations = new ReservationRecommendationsClientImpl(this);
        this.reservationRecommendationDetails = new ReservationRecommendationDetailsClientImpl(this);
        this.reservationTransactions = new ReservationTransactionsClientImpl(this);
        this.priceSheets = new PriceSheetsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.aggregatedCosts = new AggregatedCostsClientImpl(this);
        this.eventsOperations = new EventsOperationsClientImpl(this);
        this.lotsOperations = new LotsOperationsClientImpl(this);
        this.credits = new CreditsClientImpl(this);
    }

    /**
     * Gets default client context.
     * 
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     * 
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     * 
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline, Type pollResultType, Type finalResultType, Context context) {
        return PollerFactory.create(serializerAdapter, httpPipeline, pollResultType, finalResultType,
            defaultPollInterval, activationResponse, context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     * 
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse = new HttpResponseImpl(lroError.getResponseStatusCode(), lroError.getResponseHeaders(),
                    lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError = this.getSerializerAdapter()
                            .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(HttpHeaderName.fromString(s));
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConsumptionManagementClientImpl.class);
}
