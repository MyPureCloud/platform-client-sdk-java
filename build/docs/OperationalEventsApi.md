---
title: OperationalEventsApi
---
## OperationalEventsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getUsageEventsDefinition**](OperationalEventsApi.html#getUsageEventsDefinition) | Get an operational event definition by its id |
| [**getUsageEventsDefinitions**](OperationalEventsApi.html#getUsageEventsDefinitions) | Get all operational event definitions |
{: class="table-striped"}

<a name="getUsageEventsDefinition"></a>

# **getUsageEventsDefinition**



> [EventDefinition](EventDefinition.html) getUsageEventsDefinition(eventDefinitionId)

Get an operational event definition by its id

Wraps GET /api/v2/usage/events/definitions/{eventDefinitionId}  

Requires ALL permissions: 

* usage:events:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OperationalEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OperationalEventsApi apiInstance = new OperationalEventsApi();
String eventDefinitionId = "eventDefinitionId_example"; // String | EventDefinition id
try {
    EventDefinition result = apiInstance.getUsageEventsDefinition(eventDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationalEventsApi#getUsageEventsDefinition");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventDefinitionId** | **String**| EventDefinition id | 
{: class="table-striped"}


### Return type

[**EventDefinition**](EventDefinition.html)

<a name="getUsageEventsDefinitions"></a>

# **getUsageEventsDefinitions**



> [EventDefinitionListing](EventDefinitionListing.html) getUsageEventsDefinitions()

Get all operational event definitions

Wraps GET /api/v2/usage/events/definitions  

Requires ALL permissions: 

* usage:events:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OperationalEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OperationalEventsApi apiInstance = new OperationalEventsApi();
try {
    EventDefinitionListing result = apiInstance.getUsageEventsDefinitions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationalEventsApi#getUsageEventsDefinitions");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EventDefinitionListing**](EventDefinitionListing.html)

