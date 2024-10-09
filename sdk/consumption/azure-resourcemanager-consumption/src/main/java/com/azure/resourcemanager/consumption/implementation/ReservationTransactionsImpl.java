// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.ReservationTransactionsClient;
import com.azure.resourcemanager.consumption.fluent.models.ModernReservationTransactionInner;
import com.azure.resourcemanager.consumption.fluent.models.ReservationTransactionInner;
import com.azure.resourcemanager.consumption.models.ModernReservationTransaction;
import com.azure.resourcemanager.consumption.models.ReservationTransaction;
import com.azure.resourcemanager.consumption.models.ReservationTransactions;

public final class ReservationTransactionsImpl implements ReservationTransactions {
    private static final ClientLogger LOGGER = new ClientLogger(ReservationTransactionsImpl.class);

    private final ReservationTransactionsClient innerClient;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    public ReservationTransactionsImpl(ReservationTransactionsClient innerClient,
        com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReservationTransaction> list(String billingAccountId) {
        PagedIterable<ReservationTransactionInner> inner = this.serviceClient().list(billingAccountId);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationTransactionImpl(inner1, this.manager()));
    }

    public PagedIterable<ReservationTransaction> list(String billingAccountId, String filter, Context context) {
        PagedIterable<ReservationTransactionInner> inner = this.serviceClient().list(billingAccountId, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ReservationTransactionImpl(inner1, this.manager()));
    }

    public PagedIterable<ModernReservationTransaction> listByBillingProfile(String billingAccountId,
        String billingProfileId) {
        PagedIterable<ModernReservationTransactionInner> inner
            = this.serviceClient().listByBillingProfile(billingAccountId, billingProfileId);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ModernReservationTransactionImpl(inner1, this.manager()));
    }

    public PagedIterable<ModernReservationTransaction> listByBillingProfile(String billingAccountId,
        String billingProfileId, String filter, Context context) {
        PagedIterable<ModernReservationTransactionInner> inner
            = this.serviceClient().listByBillingProfile(billingAccountId, billingProfileId, filter, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ModernReservationTransactionImpl(inner1, this.manager()));
    }

    private ReservationTransactionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
