// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonRdsForSqlServerSource;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;

public final class AmazonRdsForSqlServerSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonRdsForSqlServerSource model = BinaryData.fromString(
            "{\"type\":\"AmazonRdsForSqlServerSource\",\"sqlReaderQuery\":\"databsxhivncuela\",\"sqlReaderStoredProcedureName\":\"dataxc\",\"storedProcedureParameters\":\"datartlnzdk\",\"isolationLevel\":\"datafeavz\",\"produceAdditionalTypes\":\"datammzisljxphwy\",\"partitionOption\":\"datamcpfrakucgjreoac\",\"partitionSettings\":{\"partitionColumnName\":\"datab\",\"partitionUpperBound\":\"datazxkdzmtkmnyu\",\"partitionLowerBound\":\"dataemrclsxgpkyetmt\"},\"queryTimeout\":\"dataihixisdvy\",\"additionalColumns\":\"datakeqg\",\"sourceRetryCount\":\"datajsbtosiwcve\",\"sourceRetryWait\":\"dataehbw\",\"maxConcurrentConnections\":\"dataoc\",\"disableMetricsCollection\":\"datazlfhhwdajfth\",\"\":{\"on\":\"datauomj\",\"qsniobehxxb\":\"datafq\"}}")
            .toObject(AmazonRdsForSqlServerSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonRdsForSqlServerSource model = new AmazonRdsForSqlServerSource().withSourceRetryCount("datajsbtosiwcve")
            .withSourceRetryWait("dataehbw")
            .withMaxConcurrentConnections("dataoc")
            .withDisableMetricsCollection("datazlfhhwdajfth")
            .withQueryTimeout("dataihixisdvy")
            .withAdditionalColumns("datakeqg")
            .withSqlReaderQuery("databsxhivncuela")
            .withSqlReaderStoredProcedureName("dataxc")
            .withStoredProcedureParameters("datartlnzdk")
            .withIsolationLevel("datafeavz")
            .withProduceAdditionalTypes("datammzisljxphwy")
            .withPartitionOption("datamcpfrakucgjreoac")
            .withPartitionSettings(new SqlPartitionSettings().withPartitionColumnName("datab")
                .withPartitionUpperBound("datazxkdzmtkmnyu")
                .withPartitionLowerBound("dataemrclsxgpkyetmt"));
        model = BinaryData.fromObject(model).toObject(AmazonRdsForSqlServerSource.class);
    }
}
