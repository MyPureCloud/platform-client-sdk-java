---
title: UsageApi
---
## UsageApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getUsageQueryExecutionIdResults**](UsageApi.html#getUsageQueryExecutionIdResults) | Get the results of a usage query |
| [**postUsageQuery**](UsageApi.html#postUsageQuery) | Query organization API Usage -  |
{: class="table-striped"}

<a name="getUsageQueryExecutionIdResults"></a>

# **getUsageQueryExecutionIdResults**



> [ApiUsageQueryResult](ApiUsageQueryResult.html) getUsageQueryExecutionIdResults(executionId)

Get the results of a usage query

Wraps GET /api/v2/usage/query/{executionId}/results  

Requires ANY permissions: 

* oauth:client:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsageApi apiInstance = new UsageApi();
String executionId = "executionId_example"; // String | ID of the query execution
try {
    ApiUsageQueryResult result = apiInstance.getUsageQueryExecutionIdResults(executionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getUsageQueryExecutionIdResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **executionId** | **String**| ID of the query execution | 
{: class="table-striped"}


### Return type

[**ApiUsageQueryResult**](ApiUsageQueryResult.html)

<a name="postUsageQuery"></a>

# **postUsageQuery**



> [UsageExecutionResult](UsageExecutionResult.html) postUsageQuery(body)

Query organization API Usage - 

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps POST /api/v2/usage/query  

Requires ANY permissions: 

* oauth:client:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UsageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UsageApi apiInstance = new UsageApi();
ApiUsageQuery body = new ApiUsageQuery(); // ApiUsageQuery | Query
try {
    UsageExecutionResult result = apiInstance.postUsageQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#postUsageQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ApiUsageQuery**](ApiUsageQuery.html)| Query | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult.html)

