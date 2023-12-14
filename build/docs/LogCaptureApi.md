---
title: LogCaptureApi
---
## LogCaptureApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getDiagnosticsLogcaptureBrowserEntriesDownloadJob**](LogCaptureApi.html#getDiagnosticsLogcaptureBrowserEntriesDownloadJob) | Gets status of async download execution |
| [**postDiagnosticsLogcaptureBrowserEntriesDownloadJobs**](LogCaptureApi.html#postDiagnosticsLogcaptureBrowserEntriesDownloadJobs) | Creates an async download execution |
{: class="table-striped"}

<a name="getDiagnosticsLogcaptureBrowserEntriesDownloadJob"></a>

# **getDiagnosticsLogcaptureBrowserEntriesDownloadJob**



> [LogCaptureDownloadExecutionResponse](LogCaptureDownloadExecutionResponse.html) getDiagnosticsLogcaptureBrowserEntriesDownloadJob(jobId)

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

[**LogCaptureDownloadExecutionResponse**](LogCaptureDownloadExecutionResponse.html)

<a name="postDiagnosticsLogcaptureBrowserEntriesDownloadJobs"></a>

# **postDiagnosticsLogcaptureBrowserEntriesDownloadJobs**



> [LogCaptureDownloadExecutionResponse](LogCaptureDownloadExecutionResponse.html) postDiagnosticsLogcaptureBrowserEntriesDownloadJobs(body)

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
| **body** | [**LogCaptureQueryRequest**](LogCaptureQueryRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**LogCaptureDownloadExecutionResponse**](LogCaptureDownloadExecutionResponse.html)

