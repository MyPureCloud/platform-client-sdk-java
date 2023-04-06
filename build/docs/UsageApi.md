---
title: UsageApi
---
## UsageApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getOauthClientUsageQueryResult**](UsageApi.html#getOauthClientUsageQueryResult) | Get the results of a usage query |
| [**getOauthClientUsageSummary**](UsageApi.html#getOauthClientUsageSummary) | Get a summary of OAuth client API usage |
| [**getUsageQueryExecutionIdResults**](UsageApi.html#getUsageQueryExecutionIdResults) | Get the results of a usage query |
| [**postOauthClientUsageQuery**](UsageApi.html#postOauthClientUsageQuery) | Query for OAuth client API usage |
| [**postUsageQuery**](UsageApi.html#postUsageQuery) | Query organization API Usage -  |
{: class="table-striped"}

<a name="getOauthClientUsageQueryResult"></a>

# **getOauthClientUsageQueryResult**



> [ApiUsageQueryResult](ApiUsageQueryResult.html) getOauthClientUsageQueryResult(executionId, clientId)

Get the results of a usage query

Wraps GET /api/v2/oauth/clients/{clientId}/usage/query/results/{executionId}  

Requires ANY permissions: 

* oauth:client:view
* usage:client:view

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
String clientId = "clientId_example"; // String | Client ID
try {
    ApiUsageQueryResult result = apiInstance.getOauthClientUsageQueryResult(executionId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getOauthClientUsageQueryResult");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **executionId** | **String**| ID of the query execution | 
| **clientId** | **String**| Client ID | 
{: class="table-striped"}


### Return type

[**ApiUsageQueryResult**](ApiUsageQueryResult.html)

<a name="getOauthClientUsageSummary"></a>

# **getOauthClientUsageSummary**



> [UsageExecutionResult](UsageExecutionResult.html) getOauthClientUsageSummary(clientId, days)

Get a summary of OAuth client API usage

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps GET /api/v2/oauth/clients/{clientId}/usage/summary  

Requires ANY permissions: 

* oauth:client:view
* usage:client:view

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
String clientId = "clientId_example"; // String | Client ID
String days = "7"; // String | Previous number of days to query
try {
    UsageExecutionResult result = apiInstance.getOauthClientUsageSummary(clientId, days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getOauthClientUsageSummary");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
| **days** | **String**| Previous number of days to query | [optional] [default to 7] 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult.html)

<a name="getUsageQueryExecutionIdResults"></a>

# **getUsageQueryExecutionIdResults**



> [ApiUsageQueryResult](ApiUsageQueryResult.html) getUsageQueryExecutionIdResults(executionId)

Get the results of a usage query

Wraps GET /api/v2/usage/query/{executionId}/results  

Requires ANY permissions: 

* oauth:client:view
* usage:organization:view

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

<a name="postOauthClientUsageQuery"></a>

# **postOauthClientUsageQuery**



> [UsageExecutionResult](UsageExecutionResult.html) postOauthClientUsageQuery(clientId, body)

Query for OAuth client API usage

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps POST /api/v2/oauth/clients/{clientId}/usage/query  

Requires ANY permissions: 

* oauth:client:view
* usage:client:view

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
String clientId = "clientId_example"; // String | Client ID
ApiUsageQuery body = new ApiUsageQuery(); // ApiUsageQuery | Query
try {
    UsageExecutionResult result = apiInstance.postOauthClientUsageQuery(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#postOauthClientUsageQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
| **body** | [**ApiUsageQuery**](ApiUsageQuery.html)| Query | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult.html)

<a name="postUsageQuery"></a>

# **postUsageQuery**



> [UsageExecutionResult](UsageExecutionResult.html) postUsageQuery(body)

Query organization API Usage - 

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps POST /api/v2/usage/query  

Requires ANY permissions: 

* oauth:client:view
* usage:organization:view

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

