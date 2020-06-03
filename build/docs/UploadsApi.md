---
title: UploadsApi
---
## UploadsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postUploadsPublicassetsImages**](UploadsApi.html#postUploadsPublicassetsImages) | Creates presigned url for uploading a public asset image |
{: class="table-striped"}

<a name="postUploadsPublicassetsImages"></a>

# **postUploadsPublicassetsImages**



> [UploadUrlResponse](UploadUrlResponse.html) postUploadsPublicassetsImages(body)

Creates presigned url for uploading a public asset image



Wraps POST /api/v2/uploads/publicassets/images  

Requires ALL permissions: 

* uploads:publicasset:upload

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UploadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UploadsApi apiInstance = new UploadsApi();
UploadUrlRequest body = new UploadUrlRequest(); // UploadUrlRequest | query
try {
    UploadUrlResponse result = apiInstance.postUploadsPublicassetsImages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postUploadsPublicassetsImages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**UploadUrlRequest**](UploadUrlRequest.html)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse.html)

