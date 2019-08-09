---
title: SpeechTextAnalyticsApi
---
## SpeechTextAnalyticsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getSpeechandtextanalyticsProgram**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsProgram) | Get a Speech &amp; Text Analytics program by id |
| [**getSpeechandtextanalyticsTopic**](SpeechTextAnalyticsApi.html#getSpeechandtextanalyticsTopic) | Get a Speech &amp; Text Analytics topic by id |
| [**postSpeechandtextanalyticsTopics**](SpeechTextAnalyticsApi.html#postSpeechandtextanalyticsTopics) | Create new Speech &amp; Text Analytics topic |
{: class="table-striped"}

<a name="getSpeechandtextanalyticsProgram"></a>

# **getSpeechandtextanalyticsProgram**



> [Program](Program.html) getSpeechandtextanalyticsProgram(programId)

Get a Speech &amp; Text Analytics program by id



Wraps GET /api/v2/speechandtextanalytics/programs/{programId}  

Requires ANY permissions: 

* speechAndTextAnalytics:program:view

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
String programId = "programId_example"; // String | The id of the topic to get
try {
    Program result = apiInstance.getSpeechandtextanalyticsProgram(programId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsProgram");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **programId** | **String**| The id of the topic to get | 
{: class="table-striped"}


### Return type

[**Program**](Program.html)

<a name="getSpeechandtextanalyticsTopic"></a>

# **getSpeechandtextanalyticsTopic**



> [Topic](Topic.html) getSpeechandtextanalyticsTopic(topicId)

Get a Speech &amp; Text Analytics topic by id



Wraps GET /api/v2/speechandtextanalytics/topics/{topicId}  

Requires ANY permissions: 

* speechAndTextAnalytics:topic:view

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
String topicId = "topicId_example"; // String | The id of the topic to get
try {
    Topic result = apiInstance.getSpeechandtextanalyticsTopic(topicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#getSpeechandtextanalyticsTopic");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **topicId** | **String**| The id of the topic to get | 
{: class="table-striped"}


### Return type

[**Topic**](Topic.html)

<a name="postSpeechandtextanalyticsTopics"></a>

# **postSpeechandtextanalyticsTopics**



> [Topic](Topic.html) postSpeechandtextanalyticsTopics(body)

Create new Speech &amp; Text Analytics topic



Wraps POST /api/v2/speechandtextanalytics/topics  

Requires ANY permissions: 

* speechAndTextAnalytics:topic:add

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
CreateTopicRequest body = new CreateTopicRequest(); // CreateTopicRequest | The topic to create
try {
    Topic result = apiInstance.postSpeechandtextanalyticsTopics(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechTextAnalyticsApi#postSpeechandtextanalyticsTopics");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateTopicRequest**](CreateTopicRequest.html)| The topic to create | 
{: class="table-striped"}


### Return type

[**Topic**](Topic.html)

