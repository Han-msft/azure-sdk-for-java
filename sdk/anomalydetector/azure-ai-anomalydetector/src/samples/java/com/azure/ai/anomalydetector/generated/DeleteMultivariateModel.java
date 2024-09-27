// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.anomalydetector.generated;

import com.azure.ai.anomalydetector.AnomalyDetectorClientBuilder;
import com.azure.ai.anomalydetector.MultivariateClient;
import com.azure.core.credential.KeyCredential;
import com.azure.core.util.Configuration;

public class DeleteMultivariateModel {
    public static void main(String[] args) {
        MultivariateClient multivariateClient = new AnomalyDetectorClientBuilder()
            .credential(new KeyCredential(Configuration.getGlobalConfiguration().get("API_KEY")))
            .endpoint("{Endpoint}")
            .buildMultivariateClient();
        // BEGIN:com.azure.ai.anomalydetector.generated.multivariatedeletemultivariatemodel.deletemultivariatemodel
        multivariateClient.deleteMultivariateModel("45aad126-aafd-11ea-b8fb-d89ef3400c5f");
        // END:com.azure.ai.anomalydetector.generated.multivariatedeletemultivariatemodel.deletemultivariatemodel
    }
}
