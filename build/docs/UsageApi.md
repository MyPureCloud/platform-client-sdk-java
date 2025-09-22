# UsageApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getOauthClientUsageQueryResult**](UsageApi#getOauthClientUsageQueryResult) | Get the results of a usage query |
| [**getOauthClientUsageSummary**](UsageApi#getOauthClientUsageSummary) | Get a summary of OAuth client API usage |
| [**getUsageAggregatesQueryJob**](UsageApi#getUsageAggregatesQueryJob) | Get the status and results of the usage query |
| [**getUsageClientClientIdAggregatesQueryJob**](UsageApi#getUsageClientClientIdAggregatesQueryJob) | Get the status and results of the usage query |
| [**getUsageQueryExecutionIdResults**](UsageApi#getUsageQueryExecutionIdResults) | Get the results of a usage query |
| [**getUsageSimplesearchExecutionIdResults**](UsageApi#getUsageSimplesearchExecutionIdResults) | Get the results of a usage search. Number of records to be returned is limited to 20,000 results. |
| [**postOauthClientUsageQuery**](UsageApi#postOauthClientUsageQuery) | Query for OAuth client API usage |
| [**postUsageAggregatesQueryJobs**](UsageApi#postUsageAggregatesQueryJobs) | Query your organization's public api usage. |
| [**postUsageClientClientIdAggregatesQueryJobs**](UsageApi#postUsageClientClientIdAggregatesQueryJobs) | Query your client's public api usage. |
| [**postUsageQuery**](UsageApi#postUsageQuery) | Query organization API Usage -  |
| [**postUsageSimplesearch**](UsageApi#postUsageSimplesearch) | Search organization API Usage |
{: class="table-striped"}


# **getOauthClientUsageQueryResult**


> [ApiUsageQueryResult](ApiUsageQueryResult) getOauthClientUsageQueryResult(executionId, clientId)

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

[**ApiUsageQueryResult**](ApiUsageQueryResult)


# **getOauthClientUsageSummary**


> [UsageExecutionResult](UsageExecutionResult) getOauthClientUsageSummary(clientId, days)

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

[**UsageExecutionResult**](UsageExecutionResult)


# **getUsageAggregatesQueryJob**


> [OrganizationPublicApiUsageResultsResponse](OrganizationPublicApiUsageResultsResponse) getUsageAggregatesQueryJob(jobId, pageSize, after)

Get the status and results of the usage query

Wraps GET /api/v2/usage/aggregates/query/jobs/{jobId}  

Requires ANY permissions: 

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
String jobId = "jobId_example"; // String | jobId
Integer pageSize = 100; // Integer | Page size of the results. Max is 1000.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
try {
    OrganizationPublicApiUsageResultsResponse result = apiInstance.getUsageAggregatesQueryJob(jobId, pageSize, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getUsageAggregatesQueryJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **pageSize** | **Integer**| Page size of the results. Max is 1000. | [optional] [default to 100] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
{: class="table-striped"}


### Return type

[**OrganizationPublicApiUsageResultsResponse**](OrganizationPublicApiUsageResultsResponse)


# **getUsageClientClientIdAggregatesQueryJob**


> [ClientPublicApiUsageResultsResponse](ClientPublicApiUsageResultsResponse) getUsageClientClientIdAggregatesQueryJob(clientId, jobId, pageSize, after)

Get the status and results of the usage query

Wraps GET /api/v2/usage/client/{clientId}/aggregates/query/jobs/{jobId}  

Requires ANY permissions: 

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
String clientId = "clientId_example"; // String | clientId
String jobId = "jobId_example"; // String | jobId
Integer pageSize = 100; // Integer | Page size of the results. Max is 1000.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
try {
    ClientPublicApiUsageResultsResponse result = apiInstance.getUsageClientClientIdAggregatesQueryJob(clientId, jobId, pageSize, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#getUsageClientClientIdAggregatesQueryJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| clientId | 
| **jobId** | **String**| jobId | 
| **pageSize** | **Integer**| Page size of the results. Max is 1000. | [optional] [default to 100] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
{: class="table-striped"}


### Return type

[**ClientPublicApiUsageResultsResponse**](ClientPublicApiUsageResultsResponse)


# **getUsageQueryExecutionIdResults**


> [ApiUsageQueryResult](ApiUsageQueryResult) getUsageQueryExecutionIdResults(executionId)

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

[**ApiUsageQueryResult**](ApiUsageQueryResult)


# **getUsageSimplesearchExecutionIdResults**


> [ApiUsageQueryResult](ApiUsageQueryResult) getUsageSimplesearchExecutionIdResults(executionId, after, pageSize)

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

[**ApiUsageQueryResult**](ApiUsageQueryResult)


# **postOauthClientUsageQuery**


> [UsageExecutionResult](UsageExecutionResult) postOauthClientUsageQuery(clientId, body)

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
| **body** | [**ApiUsageClientQuery**](ApiUsageClientQuery)| Query | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult)


# **postUsageAggregatesQueryJobs**


> [OrganizationUsageQueryResponse](OrganizationUsageQueryResponse) postUsageAggregatesQueryJobs(body)

Query your organization's public api usage.

After calling this method, you will need to save the queryExecutionId from the response and use it in a call to the results endpoint to get the results

Wraps POST /api/v2/usage/aggregates/query/jobs  

Requires ANY permissions: 

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
OrganizationPublicApiUsageQueryRequest body = new OrganizationPublicApiUsageQueryRequest(); // OrganizationPublicApiUsageQueryRequest | Query
try {
    OrganizationUsageQueryResponse result = apiInstance.postUsageAggregatesQueryJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#postUsageAggregatesQueryJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OrganizationPublicApiUsageQueryRequest**](OrganizationPublicApiUsageQueryRequest)| Query | 
{: class="table-striped"}


### Return type

[**OrganizationUsageQueryResponse**](OrganizationUsageQueryResponse)


# **postUsageClientClientIdAggregatesQueryJobs**


> [ClientUsageQueryResponse](ClientUsageQueryResponse) postUsageClientClientIdAggregatesQueryJobs(clientId, body)

Query your client's public api usage.

After calling this method, you will need to save the queryExecutionId from the response and use it in a call to the results endpoint to get the results

Wraps POST /api/v2/usage/client/{clientId}/aggregates/query/jobs  

Requires ANY permissions: 

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
String clientId = "clientId_example"; // String | clientId
ClientPublicApiUsageQueryRequest body = new ClientPublicApiUsageQueryRequest(); // ClientPublicApiUsageQueryRequest | Query
try {
    ClientUsageQueryResponse result = apiInstance.postUsageClientClientIdAggregatesQueryJobs(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageApi#postUsageClientClientIdAggregatesQueryJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| clientId | 
| **body** | [**ClientPublicApiUsageQueryRequest**](ClientPublicApiUsageQueryRequest)| Query | 
{: class="table-striped"}


### Return type

[**ClientUsageQueryResponse**](ClientUsageQueryResponse)


# **postUsageQuery**


> [UsageExecutionResult](UsageExecutionResult) postUsageQuery(body)

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
| **body** | [**ApiUsageOrganizationQuery**](ApiUsageOrganizationQuery)| Query | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult)


# **postUsageSimplesearch**


> [UsageExecutionResult](UsageExecutionResult) postUsageSimplesearch(body)

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
| **body** | [**ApiUsageSimpleSearch**](ApiUsageSimpleSearch)| SimpleSearch | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult)


_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
