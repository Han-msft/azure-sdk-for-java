// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotcentral.models.AppTemplatesResult;
import org.junit.jupiter.api.Assertions;

public final class AppTemplatesResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AppTemplatesResult model = BinaryData.fromString(
            "{\"nextLink\":\"vmezy\",\"value\":[{\"manifestId\":\"mzsb\",\"manifestVersion\":\"oggigrxwburv\",\"name\":\"xjnspy\",\"title\":\"tko\",\"order\":71.57593,\"description\":\"uknvudwti\",\"industry\":\"bldngkpoc\",\"locations\":[{\"id\":\"yxoegukgjnp\",\"displayName\":\"cgygev\"},{\"id\":\"ntypmrbpizcdrqj\",\"displayName\":\"pyd\"},{\"id\":\"yhxdeoejzicwi\",\"displayName\":\"jttgzf\"}]},{\"manifestId\":\"shcbkhajdeyeamdp\",\"manifestVersion\":\"g\",\"name\":\"pbuxwgipwhon\",\"title\":\"kgshwa\",\"order\":99.16541,\"description\":\"zbinjeputtm\",\"industry\":\"wnuzoqftiyqzrnkc\",\"locations\":[{\"id\":\"lwh\",\"displayName\":\"sicohoqqnwvlry\"}]},{\"manifestId\":\"w\",\"manifestVersion\":\"eun\",\"name\":\"qhgyxzkonocukok\",\"title\":\"axuconuq\",\"order\":31.20104,\"description\":\"beypewrmjmw\",\"industry\":\"jektcxsenh\",\"locations\":[{\"id\":\"ffrzpwvlqdqgbiqy\",\"displayName\":\"hkaetcktvfc\"},{\"id\":\"fsnkymuctq\",\"displayName\":\"fbebrjcxer\"},{\"id\":\"wutttxfvjrbi\",\"displayName\":\"hxepcyvahfnlj\"},{\"id\":\"qxj\",\"displayName\":\"ujqgidok\"}]},{\"manifestId\":\"ljyoxgvcltb\",\"manifestVersion\":\"ncghkje\",\"name\":\"zhbijhtxfv\",\"title\":\"bfs\",\"order\":55.0169,\"description\":\"hmpvecx\",\"industry\":\"debfqkkrbmpukgri\",\"locations\":[{\"id\":\"lfbxzpuzycisp\",\"displayName\":\"zahmgkbrpyydhibn\"},{\"id\":\"qkpikadrgvtqagnb\",\"displayName\":\"nhijggmebfsi\"},{\"id\":\"butr\",\"displayName\":\"pnazzm\"}]}]}")
            .toObject(AppTemplatesResult.class);
        Assertions.assertEquals("vmezy", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AppTemplatesResult model = new AppTemplatesResult().withNextLink("vmezy");
        model = BinaryData.fromObject(model).toObject(AppTemplatesResult.class);
        Assertions.assertEquals("vmezy", model.nextLink());
    }
}
