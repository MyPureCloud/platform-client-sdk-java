---
title: ScreenRecordingApi
---
## ScreenRecordingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postScreenrecordingToken**](ScreenRecordingApi.html#postScreenrecordingToken) | Sign identifying information for screen recording |
{: class="table-striped"}

<a name="postScreenrecordingToken"></a>

# **postScreenrecordingToken**



> [SignedData](SignedData.html) postScreenrecordingToken(body)

Sign identifying information for screen recording

Wraps POST /api/v2/screenrecording/token  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.ScreenRecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

ScreenRecordingApi apiInstance = new ScreenRecordingApi();
ScreenRecordingUserAuthenticatedInfo body = new ScreenRecordingUserAuthenticatedInfo(); // ScreenRecordingUserAuthenticatedInfo | 
try {
    SignedData result = apiInstance.postScreenrecordingToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScreenRecordingApi#postScreenrecordingToken");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScreenRecordingUserAuthenticatedInfo**](ScreenRecordingUserAuthenticatedInfo.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**SignedData**](SignedData.html)

