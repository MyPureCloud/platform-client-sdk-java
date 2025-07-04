# AuditApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getAuditsQueryRealtimeServicemapping**](AuditApi#getAuditsQueryRealtimeServicemapping) | Get service mapping information used in realtime audits. |
| [**getAuditsQueryServicemapping**](AuditApi#getAuditsQueryServicemapping) | Get service mapping information used in audits. |
| [**getAuditsQueryTransactionId**](AuditApi#getAuditsQueryTransactionId) | Get status of audit query execution |
| [**getAuditsQueryTransactionIdResults**](AuditApi#getAuditsQueryTransactionIdResults) | Get results of audit query |
| [**postAuditsQuery**](AuditApi#postAuditsQuery) | Create audit query execution |
| [**postAuditsQueryRealtime**](AuditApi#postAuditsQueryRealtime) | This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits. |
| [**postAuditsQueryRealtimeRelated**](AuditApi#postAuditsQueryRealtimeRelated) | Often a single action results in multiple audits. The endpoint retrieves all audits created by the same action as the given audit id. |
{: class="table-striped"}


# **getAuditsQueryRealtimeServicemapping**


> [AuditQueryServiceMapping](AuditQueryServiceMapping) getAuditsQueryRealtimeServicemapping()

Get service mapping information used in realtime audits.

Wraps GET /api/v2/audits/query/realtime/servicemapping  

Requires ALL permissions: 

* audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
try {
    AuditQueryServiceMapping result = apiInstance.getAuditsQueryRealtimeServicemapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryRealtimeServicemapping");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AuditQueryServiceMapping**](AuditQueryServiceMapping)


# **getAuditsQueryServicemapping**


> [AuditQueryServiceMapping](AuditQueryServiceMapping) getAuditsQueryServicemapping()

Get service mapping information used in audits.

Wraps GET /api/v2/audits/query/servicemapping  

Requires ALL permissions: 

* audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
try {
    AuditQueryServiceMapping result = apiInstance.getAuditsQueryServicemapping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryServicemapping");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**AuditQueryServiceMapping**](AuditQueryServiceMapping)


# **getAuditsQueryTransactionId**


> [AuditQueryExecutionStatusResponse](AuditQueryExecutionStatusResponse) getAuditsQueryTransactionId(transactionId)

Get status of audit query execution

Wraps GET /api/v2/audits/query/{transactionId}  

Requires ALL permissions: 

* audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
String transactionId = "transactionId_example"; // String | Transaction ID
try {
    AuditQueryExecutionStatusResponse result = apiInstance.getAuditsQueryTransactionId(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryTransactionId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **String**| Transaction ID | 
{: class="table-striped"}


### Return type

[**AuditQueryExecutionStatusResponse**](AuditQueryExecutionStatusResponse)


# **getAuditsQueryTransactionIdResults**


> [AuditQueryExecutionResultsResponse](AuditQueryExecutionResultsResponse) getAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand, allowRedirect)

Get results of audit query

Wraps GET /api/v2/audits/query/{transactionId}/results  

Requires ALL permissions: 

* audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
String transactionId = "transactionId_example"; // String | Transaction ID
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 25; // Integer | Indicates maximum number of results in response. Default page size is 25 results. The maximum page size is 500.
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
Boolean allowRedirect = true; // Boolean | Result sets with large amounts of data will respond with a download url
try {
    AuditQueryExecutionResultsResponse result = apiInstance.getAuditsQueryTransactionIdResults(transactionId, cursor, pageSize, expand, allowRedirect);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditsQueryTransactionIdResults");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **String**| Transaction ID | 
| **cursor** | **String**| Indicates where to resume query results (not required for first page) | [optional] 
| **pageSize** | **Integer**| Indicates maximum number of results in response. Default page size is 25 results. The maximum page size is 500. | [optional] [default to 25] 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: user 
| **allowRedirect** | **Boolean**| Result sets with large amounts of data will respond with a download url | [optional] 
{: class="table-striped"}


### Return type

[**AuditQueryExecutionResultsResponse**](AuditQueryExecutionResultsResponse)


# **postAuditsQuery**


> [AuditQueryExecutionStatusResponse](AuditQueryExecutionStatusResponse) postAuditsQuery(body)

Create audit query execution

Use /api/v2/audits/query/servicemapping endpoint for a list of valid values

Wraps POST /api/v2/audits/query  

Requires ALL permissions: 

* audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
AuditQueryRequest body = new AuditQueryRequest(); // AuditQueryRequest | query
try {
    AuditQueryExecutionStatusResponse result = apiInstance.postAuditsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#postAuditsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AuditQueryRequest**](AuditQueryRequest)| query | 
{: class="table-striped"}


### Return type

[**AuditQueryExecutionStatusResponse**](AuditQueryExecutionStatusResponse)


# **postAuditsQueryRealtime**


> [AuditRealtimeQueryResultsResponse](AuditRealtimeQueryResultsResponse) postAuditsQueryRealtime(body, expand)

This endpoint will only retrieve 14 days worth of audits for certain services. Please use /query to get a full list and older audits.

Use /api/v2/audits/query/realtime/servicemapping endpoint for a list of valid values

Wraps POST /api/v2/audits/query/realtime  

Requires ALL permissions: 

* audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
AuditRealtimeQueryRequest body = new AuditRealtimeQueryRequest(); // AuditRealtimeQueryRequest | query
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    AuditRealtimeQueryResultsResponse result = apiInstance.postAuditsQueryRealtime(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#postAuditsQueryRealtime");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AuditRealtimeQueryRequest**](AuditRealtimeQueryRequest)| query | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: user 
{: class="table-striped"}


### Return type

[**AuditRealtimeQueryResultsResponse**](AuditRealtimeQueryResultsResponse)


# **postAuditsQueryRealtimeRelated**


> [AuditRealtimeRelatedResultsResponse](AuditRealtimeRelatedResultsResponse) postAuditsQueryRealtimeRelated(body, expand)

Often a single action results in multiple audits. The endpoint retrieves all audits created by the same action as the given audit id.

Wraps POST /api/v2/audits/query/realtime/related  

Requires ALL permissions: 

* audits:audit:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AuditApi apiInstance = new AuditApi();
AuditRealtimeRelatedRequest body = new AuditRealtimeRelatedRequest(); // AuditRealtimeRelatedRequest | query
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand
try {
    AuditRealtimeRelatedResultsResponse result = apiInstance.postAuditsQueryRealtimeRelated(body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#postAuditsQueryRealtimeRelated");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AuditRealtimeRelatedRequest**](AuditRealtimeRelatedRequest)| query | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand | [optional]<br />**Values**: user 
{: class="table-striped"}


### Return type

[**AuditRealtimeRelatedResultsResponse**](AuditRealtimeRelatedResultsResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
