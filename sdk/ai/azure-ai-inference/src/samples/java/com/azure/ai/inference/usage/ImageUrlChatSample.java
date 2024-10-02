// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.inference.usage;

import com.azure.ai.inference.ChatCompletionsClient;
import com.azure.ai.inference.ChatCompletionsClientBuilder;
import com.azure.ai.inference.models.ChatCompletionsOptions;
import com.azure.ai.inference.models.ChatCompletions;
import com.azure.ai.inference.models.ChatMessageContentItem;
import com.azure.ai.inference.models.ChatMessageTextContentItem;
import com.azure.ai.inference.models.ChatMessageImageContentItem;
import com.azure.ai.inference.models.ChatMessageImageUrl;
import com.azure.ai.inference.models.ChatRequestMessage;
import com.azure.ai.inference.models.ChatRequestSystemMessage;
import com.azure.ai.inference.models.ChatRequestUserMessage;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.Configuration;

import java.util.ArrayList;
import java.util.List;

public final class ImageUrlChatSample {

    private static final String TEST_URL =
        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Gfp-wisconsin-madison-the-nature-boardwalk.jpg/2560px-Gfp-wisconsin-madison-the-nature-boardwalk.jpg";

     /**
     * @param args Unused. Arguments to the program.
     */
    public static void main(String[] args) {
        String key = Configuration.getGlobalConfiguration().get("AZURE_API_KEY");
        String endpoint = Configuration.getGlobalConfiguration().get("MODEL_ENDPOINT");
        ChatCompletionsClient client = new ChatCompletionsClientBuilder()
            .credential(new AzureKeyCredential(key))
            .endpoint(endpoint)
            .buildClient();

        List<ChatMessageContentItem> contentItems = new ArrayList<>();
        contentItems.add(new ChatMessageTextContentItem("Describe the image."));
        contentItems.add(new ChatMessageImageContentItem(
            new ChatMessageImageUrl(TEST_URL)));

        List<ChatRequestMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatRequestSystemMessage("You are a helpful assistant."));
        chatMessages.add(ChatRequestUserMessage.fromContentItems(contentItems));

        ChatCompletions completions = client.complete(new ChatCompletionsOptions(chatMessages));

        System.out.printf("%s.%n", completions.getChoice().getMessage().getContent());
    }
}
