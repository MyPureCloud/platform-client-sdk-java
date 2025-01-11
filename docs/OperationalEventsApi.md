# OperationalEventsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getUsageEventsDefinition**](OperationalEventsApi#getUsageEventsDefinition) | Get an operational event definition by its id |
| [**getUsageEventsDefinitions**](OperationalEventsApi#getUsageEventsDefinitions) | Get all operational event definitions |
| [**postUsageEventsAggregatesQuery**](OperationalEventsApi#postUsageEventsAggregatesQuery) | Get aggregates for operational events in a timeframe. |
| [**postUsageEventsQuery**](OperationalEventsApi#postUsageEventsQuery) | Query operational events in a timeframe. |
{: class="table-striped"}


# **getUsageEventsDefinition**


> [EventDefinition](EventDefinition) getUsageEventsDefinition(eventDefinitionId)

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

[**EventDefinition**](EventDefinition)


# **getUsageEventsDefinitions**


> [EventDefinitionListing](EventDefinitionListing) getUsageEventsDefinitions()

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

[**EventDefinitionListing**](EventDefinitionListing)


# **postUsageEventsAggregatesQuery**


> [EventAggregatesResponse](EventAggregatesResponse) postUsageEventsAggregatesQuery(body)

Get aggregates for operational events in a timeframe.

Wraps POST /api/v2/usage/events/aggregates/query  

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
EventAggregatesQueryRequest body = new EventAggregatesQueryRequest(); // EventAggregatesQueryRequest | 
try {
    EventAggregatesResponse result = apiInstance.postUsageEventsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationalEventsApi#postUsageEventsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EventAggregatesQueryRequest**](EventAggregatesQueryRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**EventAggregatesResponse**](EventAggregatesResponse)


# **postUsageEventsQuery**


> [EventQueryResponse](EventQueryResponse) postUsageEventsQuery(before, after, pageSize, body)

Query operational events in a timeframe.

Wraps POST /api/v2/usage/events/query  

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
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
EventQueryRequest body = new EventQueryRequest(); // EventQueryRequest | 
try {
    EventQueryResponse result = apiInstance.postUsageEventsQuery(before, after, pageSize, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationalEventsApi#postUsageEventsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **body** | [**EventQueryRequest**](EventQueryRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**EventQueryResponse**](EventQueryResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
