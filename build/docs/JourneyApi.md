---
title: JourneyApi
---
## JourneyApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getJourneySessionEvents**](JourneyApi.html#getJourneySessionEvents) | Retrieve all events for a given session. |
{: class="table-striped"}

<a name="getJourneySessionEvents"></a>

# **getJourneySessionEvents**



> [EventListing](EventListing.html) getJourneySessionEvents(sessionId, before, after, limit)

Retrieve all events for a given session.



Wraps GET /api/v2/journey/sessions/{sessionId}/events  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.JourneyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

JourneyApi apiInstance = new JourneyApi();
String sessionId = "sessionId_example"; // String | System-generated UUID that represents the session the event is a part of.
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200.
try {
    EventListing result = apiInstance.getJourneySessionEvents(sessionId, before, after, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JourneyApi#getJourneySessionEvents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sessionId** | **String**| System-generated UUID that represents the session the event is a part of. | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**EventListing**](EventListing.html)

