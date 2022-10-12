---
title: DownloadsApi
---
## DownloadsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getDownload**](DownloadsApi.html#getDownload) | Issues a redirect to a signed secure download URL for specified download |
{: class="table-striped"}

<a name="getDownload"></a>

# **getDownload**



> [UrlResponse](UrlResponse.html) getDownload(downloadId, contentDisposition, issueRedirect, redirectToAuth)

Issues a redirect to a signed secure download URL for specified download

this method will issue a redirect to the url to the content

Wraps GET /api/v2/downloads/{downloadId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.DownloadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

DownloadsApi apiInstance = new DownloadsApi();
String downloadId = "downloadId_example"; // String | Download ID
String contentDisposition = "contentDisposition_example"; // String | 
Boolean issueRedirect = true; // Boolean | 
Boolean redirectToAuth = true; // Boolean | 
try {
    UrlResponse result = apiInstance.getDownload(downloadId, contentDisposition, issueRedirect, redirectToAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DownloadsApi#getDownload");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **downloadId** | **String**| Download ID | 
| **contentDisposition** | **String**|  | [optional] 
| **issueRedirect** | **Boolean**|  | [optional] [default to true] 
| **redirectToAuth** | **Boolean**|  | [optional] [default to true] 
{: class="table-striped"}


### Return type

[**UrlResponse**](UrlResponse.html)

