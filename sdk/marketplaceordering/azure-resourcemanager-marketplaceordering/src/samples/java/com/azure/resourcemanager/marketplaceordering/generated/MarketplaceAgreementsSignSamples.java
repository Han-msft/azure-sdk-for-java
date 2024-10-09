// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.generated;

/**
 * Samples for MarketplaceAgreements Sign.
 */
public final class MarketplaceAgreementsSignSamples {
    /*
     * x-ms-original-file:
     * specification/marketplaceordering/resource-manager/Microsoft.MarketplaceOrdering/stable/2021-01-01/examples/
     * SignMarketplaceTerms.json
     */
    /**
     * Sample code: SetMarketplaceTerms.
     * 
     * @param manager Entry point to MarketplaceOrderingManager.
     */
    public static void
        setMarketplaceTerms(com.azure.resourcemanager.marketplaceordering.MarketplaceOrderingManager manager) {
        manager.marketplaceAgreements().signWithResponse("pubid", "offid", "planid", com.azure.core.util.Context.NONE);
    }
}
