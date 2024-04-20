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
| [**getUsageSimplesearchExecutionIdResults**](UsageApi.html#getUsageSimplesearchExecutionIdResults) | Get the results of a usage search. Number of records to be returned is limited to 20,000 results. |
| [**postOauthClientUsageQuery**](UsageApi.html#postOauthClientUsageQuery) | Query for OAuth client API usage |
| [**postUsageQuery**](UsageApi.html#postUsageQuery) | Query organization API Usage -  |
| [**postUsageSimplesearch**](UsageApi.html#postUsageSimplesearch) | Search organization API Usage |
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

<a name="getUsageSimplesearchExecutionIdResults"></a>

# **getUsageSimplesearchExecutionIdResults**



> [ApiUsageQueryResult](ApiUsageQueryResult.html) getUsageSimplesearchExecutionIdResults(executionId, after, pageSize)

Get the results of a usage search. Number of records to be returned is limited to 20,000 results.

Wraps GET /api/v2/usage/simplesearch/{executionId}/results  

Requires ANY permissions: 

* oauth:client:view
* usage:simpleSearch:view

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
String executionId = "executionId_example"; // String | ID of the search execution
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned
Integer pageSize = 56; // Integer | The max number of entities to be returned per request. Maximum page size of 1000
try {
    ApiUsageQueryResult result = apiInstance.getUsageSimplesearchExecutionIdResults(executionId, after, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getUsageSimplesearchExecutionIdResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **executionId** | **String**| ID of the search execution | 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned | [optional] 
| **pageSize** | **Integer**| The max number of entities to be returned per request. Maximum page size of 1000 | [optional] 
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
ApiUsageClientQuery body = new ApiUsageClientQuery(); // ApiUsageClientQuery | Query
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
| **body** | [**ApiUsageClientQuery**](ApiUsageClientQuery.html)| Query | 
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
ApiUsageOrganizationQuery body = new ApiUsageOrganizationQuery(); // ApiUsageOrganizationQuery | Query
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
| **body** | [**ApiUsageOrganizationQuery**](ApiUsageOrganizationQuery.html)| Query | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult.html)

<a name="postUsageSimplesearch"></a>

# **postUsageSimplesearch**



> [UsageExecutionResult](UsageExecutionResult.html) postUsageSimplesearch(body)

Search organization API Usage

After calling this method, you will then need to poll for the query results based on the returned execution Id. The number of records is limited to 20,000 results

Wraps POST /api/v2/usage/simplesearch  

Requires ANY permissions: 

* oauth:client:view
* usage:simpleSearch:view

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
ApiUsageSimpleSearch body = new ApiUsageSimpleSearch(); // ApiUsageSimpleSearch | SimpleSearch
try {
    UsageExecutionResult result = apiInstance.postUsageSimplesearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#postUsageSimplesearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ApiUsageSimpleSearch**](ApiUsageSimpleSearch.html)| SimpleSearch | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult.html)

