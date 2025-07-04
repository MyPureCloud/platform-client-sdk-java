# LogCaptureApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteDiagnosticsLogcaptureBrowserUser**](LogCaptureApi#deleteDiagnosticsLogcaptureBrowserUser) | Disable browser log capture for the user |
| [**getDiagnosticsLogcaptureBrowserEntriesDownloadJob**](LogCaptureApi#getDiagnosticsLogcaptureBrowserEntriesDownloadJob) | Gets status of async download execution |
| [**getDiagnosticsLogcaptureBrowserUser**](LogCaptureApi#getDiagnosticsLogcaptureBrowserUser) | Get log capture configuration for the user |
| [**getDiagnosticsLogcaptureBrowserUsers**](LogCaptureApi#getDiagnosticsLogcaptureBrowserUsers) | Get all log capture enabled users for an org |
| [**postDiagnosticsLogcaptureBrowserEntriesDownloadJobs**](LogCaptureApi#postDiagnosticsLogcaptureBrowserEntriesDownloadJobs) | Creates an async download execution |
| [**postDiagnosticsLogcaptureBrowserEntriesQuery**](LogCaptureApi#postDiagnosticsLogcaptureBrowserEntriesQuery) | Query collected log entries. It returns a limited amount of records, to get all records use download endpoint. |
| [**postDiagnosticsLogcaptureBrowserUser**](LogCaptureApi#postDiagnosticsLogcaptureBrowserUser) | Enable log capture for a user or update expiration |
{: class="table-striped"}


# **deleteDiagnosticsLogcaptureBrowserUser**


> Void deleteDiagnosticsLogcaptureBrowserUser(userId)

Disable browser log capture for the user

Wraps DELETE /api/v2/diagnostics/logcapture/browser/users/{userId}  

Requires ANY permissions: 

* troubleshooting:logCapture:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LogCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LogCaptureApi apiInstance = new LogCaptureApi();
String userId = "userId_example"; // String | The id of the user to disable browser log capture
try {
    apiInstance.deleteDiagnosticsLogcaptureBrowserUser(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling LogCaptureApi#deleteDiagnosticsLogcaptureBrowserUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The id of the user to disable browser log capture | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getDiagnosticsLogcaptureBrowserEntriesDownloadJob**


> [LogCaptureDownloadExecutionResponse](LogCaptureDownloadExecutionResponse) getDiagnosticsLogcaptureBrowserEntriesDownloadJob(jobId)

Gets status of async download execution

Wraps GET /api/v2/diagnostics/logcapture/browser/entries/download/jobs/{jobId}  

Requires ALL permissions: 

* troubleshooting:logCapture:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LogCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LogCaptureApi apiInstance = new LogCaptureApi();
String jobId = "jobId_example"; // String | Job ID
try {
    LogCaptureDownloadExecutionResponse result = apiInstance.getDiagnosticsLogcaptureBrowserEntriesDownloadJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogCaptureApi#getDiagnosticsLogcaptureBrowserEntriesDownloadJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| Job ID | 
{: class="table-striped"}


### Return type

[**LogCaptureDownloadExecutionResponse**](LogCaptureDownloadExecutionResponse)


# **getDiagnosticsLogcaptureBrowserUser**


> [LogCaptureUserConfigurationResponse](LogCaptureUserConfigurationResponse) getDiagnosticsLogcaptureBrowserUser(userId)

Get log capture configuration for the user

Wraps GET /api/v2/diagnostics/logcapture/browser/users/{userId}  

Requires ANY permissions: 

* troubleshooting:logCapture:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LogCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LogCaptureApi apiInstance = new LogCaptureApi();
String userId = "userId_example"; // String | The id of the user to get browser log capture configuration
try {
    LogCaptureUserConfigurationResponse result = apiInstance.getDiagnosticsLogcaptureBrowserUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogCaptureApi#getDiagnosticsLogcaptureBrowserUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The id of the user to get browser log capture configuration | 
{: class="table-striped"}


### Return type

[**LogCaptureUserConfigurationResponse**](LogCaptureUserConfigurationResponse)


# **getDiagnosticsLogcaptureBrowserUsers**


> [LogCaptureUserConfigurationListing](LogCaptureUserConfigurationListing) getDiagnosticsLogcaptureBrowserUsers(includeExpired)

Get all log capture enabled users for an org

Wraps GET /api/v2/diagnostics/logcapture/browser/users  

Requires ANY permissions: 

* troubleshooting:logCapture:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LogCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LogCaptureApi apiInstance = new LogCaptureApi();
Boolean includeExpired = false; // Boolean | Include expired users with log captures still available for search or download
try {
    LogCaptureUserConfigurationListing result = apiInstance.getDiagnosticsLogcaptureBrowserUsers(includeExpired);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogCaptureApi#getDiagnosticsLogcaptureBrowserUsers");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeExpired** | **Boolean**| Include expired users with log captures still available for search or download | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**LogCaptureUserConfigurationListing**](LogCaptureUserConfigurationListing)


# **postDiagnosticsLogcaptureBrowserEntriesDownloadJobs**


> [LogCaptureDownloadExecutionResponse](LogCaptureDownloadExecutionResponse) postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(body)

Creates an async download execution

Wraps POST /api/v2/diagnostics/logcapture/browser/entries/download/jobs  

Requires ANY permissions: 

* troubleshooting:logCapture:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LogCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LogCaptureApi apiInstance = new LogCaptureApi();
LogCaptureQueryRequest body = new LogCaptureQueryRequest(); // LogCaptureQueryRequest | 
try {
    LogCaptureDownloadExecutionResponse result = apiInstance.postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogCaptureApi#postDiagnosticsLogcaptureBrowserEntriesDownloadJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LogCaptureQueryRequest**](LogCaptureQueryRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**LogCaptureDownloadExecutionResponse**](LogCaptureDownloadExecutionResponse)


# **postDiagnosticsLogcaptureBrowserEntriesQuery**


> [LogCaptureQueryResponse](LogCaptureQueryResponse) postDiagnosticsLogcaptureBrowserEntriesQuery(after, pageSize, body)

Query collected log entries. It returns a limited amount of records, to get all records use download endpoint.

Wraps POST /api/v2/diagnostics/logcapture/browser/entries/query  

Requires ANY permissions: 

* troubleshooting:logCapture:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LogCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LogCaptureApi apiInstance = new LogCaptureApi();
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
LogCaptureQueryRequest body = new LogCaptureQueryRequest(); // LogCaptureQueryRequest | 
try {
    LogCaptureQueryResponse result = apiInstance.postDiagnosticsLogcaptureBrowserEntriesQuery(after, pageSize, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogCaptureApi#postDiagnosticsLogcaptureBrowserEntriesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **body** | [**LogCaptureQueryRequest**](LogCaptureQueryRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**LogCaptureQueryResponse**](LogCaptureQueryResponse)


# **postDiagnosticsLogcaptureBrowserUser**


> [LogCaptureUserConfiguration](LogCaptureUserConfiguration) postDiagnosticsLogcaptureBrowserUser(userId, body)

Enable log capture for a user or update expiration

Wraps POST /api/v2/diagnostics/logcapture/browser/users/{userId}  

Requires ANY permissions: 

* troubleshooting:logCapture:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LogCaptureApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LogCaptureApi apiInstance = new LogCaptureApi();
String userId = "userId_example"; // String | The id of the user to enable browser log capture
LogCaptureUserConfiguration body = new LogCaptureUserConfiguration(); // LogCaptureUserConfiguration | 
try {
    LogCaptureUserConfiguration result = apiInstance.postDiagnosticsLogcaptureBrowserUser(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogCaptureApi#postDiagnosticsLogcaptureBrowserUser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| The id of the user to enable browser log capture | 
| **body** | [**LogCaptureUserConfiguration**](LogCaptureUserConfiguration)|  | [optional] 
{: class="table-striped"}


### Return type

[**LogCaptureUserConfiguration**](LogCaptureUserConfiguration)


_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
