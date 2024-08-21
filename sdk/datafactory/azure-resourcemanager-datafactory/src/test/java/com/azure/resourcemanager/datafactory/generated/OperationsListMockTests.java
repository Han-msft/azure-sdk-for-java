// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.Operation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"lshwaadczwmnfavl\",\"origin\":\"sklsakkihxpofv\",\"display\":{\"description\":\"eaxor\",\"provider\":\"zbdvawbtgvqtegk\",\"resource\":\"ecl\",\"operation\":\"scdoqocdrjguhsjl\"},\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"whbsejuuboy\",\"displayName\":\"qyjtollugz\",\"blobDuration\":\"zikk\"},{\"name\":\"bdaudsvdb\",\"displayName\":\"lmutwm\",\"blobDuration\":\"fbsz\"}],\"metricSpecifications\":[{\"name\":\"s\",\"displayName\":\"rdmbebxmkwokl\",\"displayDescription\":\"cenngutitjwvv\",\"unit\":\"pdshkbfweezzr\",\"aggregationType\":\"ytq\",\"enableRegionalMdmAccount\":\"bxgofiphl\",\"sourceMdmAccount\":\"zdphidhkigslczk\",\"sourceMdmNamespace\":\"bz\",\"availabilities\":[{},{}],\"dimensions\":[{}]}]}}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Operation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("lshwaadczwmnfavl", response.iterator().next().name());
        Assertions.assertEquals("sklsakkihxpofv", response.iterator().next().origin());
        Assertions.assertEquals("eaxor", response.iterator().next().display().description());
        Assertions.assertEquals("zbdvawbtgvqtegk", response.iterator().next().display().provider());
        Assertions.assertEquals("ecl", response.iterator().next().display().resource());
        Assertions.assertEquals("scdoqocdrjguhsjl", response.iterator().next().display().operation());
        Assertions.assertEquals("whbsejuuboy",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("qyjtollugz",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).displayName());
        Assertions.assertEquals("zikk",
            response.iterator().next().serviceSpecification().logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("s",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("rdmbebxmkwokl",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions.assertEquals("cenngutitjwvv",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("pdshkbfweezzr",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("ytq",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("bxgofiphl",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("zdphidhkigslczk",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("bz",
            response.iterator().next().serviceSpecification().metricSpecifications().get(0).sourceMdmNamespace());
    }
}
