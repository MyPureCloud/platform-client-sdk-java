---
title: SpeechTextAnalyticsApi
---
## SpeechTextAnalyticsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getSpeechandtextanalyticsConversation**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsConversation) | Get Speech and Text Analytics for a specific conversation |
| [**getSpeechandtextanalyticsConversationCommunicationTranscripturl**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsConversationCommunicationTranscripturl) | Get the pre-signed S3 URL for the transcript of a specific communication of a conversation |
| [**getSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsSettings) | Get Speech And Text Analytics Settings |
| [**patchSpeechandtextanalyticsSettings**](SpeechTextAnalyticsApi.html#patchSpeechandtextanalyticsSettings) | Patch Speech And Text Analytics Settings |
| [**postSpeechandtextanalyticsTranscriptsSearch**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsTranscriptsSearch) | Search resources. |
{: class="table-striped"}

<a name="getSpeechandtextanalyticsConversation"></a>

# **getSpeechandtextanalyticsConversation**



> [ConversationMetrics](ConversationMetrics.html) getSpeechandtextanalyticsConversation(conversationId)

Get Speech and Text Analytics for a specific conversation



Wraps GET /api/v2/speechandtextanalytics/conversations/{conversationId}  

Requires ANY permissions: 

* recording:recording:view

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
String conversationId = "conversationId_example"; // String | Conversation Id
try {
    ConversationMetrics result = apiInstance.getSpeechandtextanalyticsConversation(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsConversation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation Id | 
{: class="table-striped"}


### Return type

[**ConversationMetrics**](ConversationMetrics.html)

<a name="getSpeechandtextanalyticsConversationCommunicationTranscripturl"></a>

# **getSpeechandtextanalyticsConversationCommunicationTranscripturl**



> [TranscriptUrl](TranscriptUrl.html) getSpeechandtextanalyticsConversationCommunicationTranscripturl(conversationId, communicationId)

Get the pre-signed S3 URL for the transcript of a specific communication of a conversation



Wraps GET /api/v2/speechandtextanalytics/conversations/{conversationId}/communications/{communicationId}/transcripturl  

Requires ANY permissions: 

* recording:recording:view

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
    TranscriptUrl result = apiInstance.getSpeechandtextanalyticsConversationCommunicationTranscripturl(conversationId, communicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsConversationCommunicationTranscripturl");
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

[**TranscriptUrl**](TranscriptUrl.html)

<a name="getSpeechandtextanalyticsSettings"></a>

# **getSpeechandtextanalyticsSettings**



> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.html) getSpeechandtextanalyticsSettings()

Get Speech And Text Analytics Settings



Wraps GET /api/v2/speechandtextanalytics/settings  

Requires ALL permissions: 

* speechAndTextAnalytics:settings:view

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
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.getSpeechandtextanalyticsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.html)

<a name="patchSpeechandtextanalyticsSettings"></a>

# **patchSpeechandtextanalyticsSettings**



> [SpeechTextAnalyticsSettingsResponse](SpeechTextAnalyticsSettingsResponse.html) patchSpeechandtextanalyticsSettings(body)

Patch Speech And Text Analytics Settings



Wraps PATCH /api/v2/speechandtextanalytics/settings  

Requires ALL permissions: 

* speechAndTextAnalytics:settings:edit

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
SpeechTextAnalyticsSettingsRequest body = new SpeechTextAnalyticsSettingsRequest(); // SpeechTextAnalyticsSettingsRequest | Speech And Text Analytics Settings
try {
    SpeechTextAnalyticsSettingsResponse result = apiInstance.patchSpeechandtextanalyticsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#patchSpeechandtextanalyticsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SpeechTextAnalyticsSettingsRequest**](SpeechTextAnalyticsSettingsRequest.html)| Speech And Text Analytics Settings | 
{: class="table-striped"}


### Return type

[**SpeechTextAnalyticsSettingsResponse**](SpeechTextAnalyticsSettingsResponse.html)

<a name="postSpeechandtextanalyticsTranscriptsSearch"></a>

# **postSpeechandtextanalyticsTranscriptsSearch**



> [JsonSearchResponse](JsonSearchResponse.html) postSpeechandtextanalyticsTranscriptsSearch(body)

Search resources.



Wraps POST /api/v2/speechandtextanalytics/transcripts/search  

Requires ANY permissions: 

* analytics:conversationDetail:view
* recording:recording:view

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
TranscriptSearchRequest body = new TranscriptSearchRequest(); // TranscriptSearchRequest | Search request options
try {
    JsonSearchResponse result = apiInstance.postSpeechandtextanalyticsTranscriptsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTranscriptsSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**TranscriptSearchRequest**](TranscriptSearchRequest.html)| Search request options | 
{: class="table-striped"}


### Return type

[**JsonSearchResponse**](JsonSearchResponse.html)

