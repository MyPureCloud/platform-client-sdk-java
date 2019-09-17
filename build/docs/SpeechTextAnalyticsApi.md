---
title: SpeechTextAnalyticsApi
---
## SpeechTextAnalyticsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getConversationTranscriptproperty**](SpeechTextAnalyticsApi.html#getConversationTranscriptproperty) | Get the pre-signed S3 URL for the transcript of a specific communication of a conversation |
{: class="table-striped"}

<a name="getConversationTranscriptproperty"></a>

# **getConversationTranscriptproperty**



> [TranscriptProperty](TranscriptProperty.html) getConversationTranscriptproperty(conversationId, communicationId)

Get the pre-signed S3 URL for the transcript of a specific communication of a conversation



Wraps GET /api/v2/conversations/{conversationId}/transcriptproperties/{communicationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SpeechTextAnalyticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SpeechTextAnalyticsApi apiInstance = new SpeechTextAnalyticsApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String communicationId = "communicationId_example"; // String | Communication ID
try {
    TranscriptProperty result = apiInstance.getConversationTranscriptproperty(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getConversationTranscriptproperty");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **communicationId** | **String**| Communication ID | 
{: class="table-striped"}


### Return type

[**TranscriptProperty**](TranscriptProperty.html)

