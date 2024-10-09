// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.marketplaceordering.fluent.models.AgreementTermsInner;
import com.azure.resourcemanager.marketplaceordering.fluent.models.OldAgreementTermsInner;
import com.azure.resourcemanager.marketplaceordering.fluent.models.OldAgreementTermsListInner;
import com.azure.resourcemanager.marketplaceordering.models.OfferType;

/**
 * An instance of this class provides access to all the operations defined in MarketplaceAgreementsClient.
 */
public interface MarketplaceAgreementsClient {
    /**
     * Get marketplace terms.
     * 
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace terms along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgreementTermsInner> getWithResponse(OfferType offerType, String publisherId, String offerId,
        String planId, Context context);

    /**
     * Get marketplace terms.
     * 
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace terms.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgreementTermsInner get(OfferType offerType, String publisherId, String offerId, String planId);

    /**
     * Save marketplace terms.
     * 
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param parameters Parameters supplied to the Create Marketplace Terms operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgreementTermsInner> createWithResponse(OfferType offerType, String publisherId, String offerId,
        String planId, AgreementTermsInner parameters, Context context);

    /**
     * Save marketplace terms.
     * 
     * @param offerType Offer Type, currently only virtualmachine type is supported.
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param parameters Parameters supplied to the Create Marketplace Terms operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgreementTermsInner create(OfferType offerType, String publisherId, String offerId, String planId,
        AgreementTermsInner parameters);

    /**
     * Sign marketplace terms.
     * 
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OldAgreementTermsInner> signWithResponse(String publisherId, String offerId, String planId,
        Context context);

    /**
     * Sign marketplace terms.
     * 
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OldAgreementTermsInner sign(String publisherId, String offerId, String planId);

    /**
     * Cancel marketplace terms.
     * 
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OldAgreementTermsInner> cancelWithResponse(String publisherId, String offerId, String planId,
        Context context);

    /**
     * Cancel marketplace terms.
     * 
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return terms properties for provided Publisher/Offer/Plan tuple.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OldAgreementTermsInner cancel(String publisherId, String offerId, String planId);

    /**
     * Get marketplace agreement.
     * 
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace agreement along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OldAgreementTermsInner> getAgreementWithResponse(String publisherId, String offerId, String planId,
        Context context);

    /**
     * Get marketplace agreement.
     * 
     * @param publisherId Publisher identifier string of image being deployed.
     * @param offerId Offer identifier string of image being deployed.
     * @param planId Plan identifier string of image being deployed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return marketplace agreement.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OldAgreementTermsInner getAgreement(String publisherId, String offerId, String planId);

    /**
     * List marketplace agreements in the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return agreement Terms definition list along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OldAgreementTermsListInner> listWithResponse(Context context);

    /**
     * List marketplace agreements in the subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return agreement Terms definition list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OldAgreementTermsListInner list();
}
