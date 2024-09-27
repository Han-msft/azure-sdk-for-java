// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.trustedsigning.fluent.models.CertificateProfileInner;

/**
 * An immutable client-side representation of CertificateProfile.
 */
public interface CertificateProfile {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    CertificateProfileProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.trustedsigning.fluent.models.CertificateProfileInner object.
     * 
     * @return the inner object.
     */
    CertificateProfileInner innerModel();

    /**
     * The entirety of the CertificateProfile definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The CertificateProfile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the CertificateProfile definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the CertificateProfile definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName Trusted Signing account name.
             * @return the next definition stage.
             */
            WithCreate withExistingCodeSigningAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the CertificateProfile definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            CertificateProfile create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CertificateProfile create(Context context);
        }

        /**
         * The stage of the CertificateProfile definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(CertificateProfileProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    CertificateProfile refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CertificateProfile refresh(Context context);

    /**
     * Revoke a certificate under a certificate profile.
     * 
     * @param body Parameters to revoke the certificate profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> revokeCertificateWithResponse(RevokeCertificate body, Context context);

    /**
     * Revoke a certificate under a certificate profile.
     * 
     * @param body Parameters to revoke the certificate profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revokeCertificate(RevokeCertificate body);
}
