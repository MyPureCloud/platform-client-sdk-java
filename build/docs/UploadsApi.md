---
title: UploadsApi
---
## UploadsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postKnowledgeDocumentuploads**](UploadsApi.html#postKnowledgeDocumentuploads) | Creates a presigned URL for uploading a knowledge import file with a set of documents |
| [**postLanguageunderstandingMinerUploads**](UploadsApi.html#postLanguageunderstandingMinerUploads) | Creates a presigned URL for uploading a chat corpus which will be used for mining by intent miner |
| [**postUploadsPublicassetsImages**](UploadsApi.html#postUploadsPublicassetsImages) | Creates presigned url for uploading a public asset image |
| [**postUploadsRecordings**](UploadsApi.html#postUploadsRecordings) | Creates presigned url for uploading a recording file |
| [**postUploadsWorkforcemanagementHistoricaldataCsv**](UploadsApi.html#postUploadsWorkforcemanagementHistoricaldataCsv) | Creates presigned url for uploading WFM historical data file. Requires data in csv format. |
{: class="table-striped"}

<a name="postKnowledgeDocumentuploads"></a>

# **postKnowledgeDocumentuploads**



> [UploadUrlResponse](UploadUrlResponse.html) postKnowledgeDocumentuploads(body)

Creates a presigned URL for uploading a knowledge import file with a set of documents



Wraps POST /api/v2/knowledge/documentuploads  

Requires ALL permissions: 

* knowledge:document:upload

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
    UploadUrlResponse result = apiInstance.postKnowledgeDocumentuploads(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postKnowledgeDocumentuploads");
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

<a name="postLanguageunderstandingMinerUploads"></a>

# **postLanguageunderstandingMinerUploads**



> [UploadUrlResponse](UploadUrlResponse.html) postLanguageunderstandingMinerUploads(minerId, body)

Creates a presigned URL for uploading a chat corpus which will be used for mining by intent miner



Wraps POST /api/v2/languageunderstanding/miners/{minerId}/uploads  

Requires ALL permissions: 

* languageUnderstanding:miner:upload

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
String minerId = "minerId_example"; // String | Miner ID
Empty body = new Empty(); // Empty | query
try {
    UploadUrlResponse result = apiInstance.postLanguageunderstandingMinerUploads(minerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postLanguageunderstandingMinerUploads");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **body** | [**Empty**](Empty.html)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse.html)

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

<a name="postUploadsRecordings"></a>

# **postUploadsRecordings**



> [UploadUrlResponse](UploadUrlResponse.html) postUploadsRecordings(body)

Creates presigned url for uploading a recording file



Wraps POST /api/v2/uploads/recordings  

Requires ALL permissions: 

* recording:recording:upload

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
    UploadUrlResponse result = apiInstance.postUploadsRecordings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postUploadsRecordings");
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

<a name="postUploadsWorkforcemanagementHistoricaldataCsv"></a>

# **postUploadsWorkforcemanagementHistoricaldataCsv**



> [UploadUrlResponse](UploadUrlResponse.html) postUploadsWorkforcemanagementHistoricaldataCsv(body)

Creates presigned url for uploading WFM historical data file. Requires data in csv format.



Wraps POST /api/v2/uploads/workforcemanagement/historicaldata/csv  

Requires ALL permissions: 

* wfm:historicalData:upload

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
    UploadUrlResponse result = apiInstance.postUploadsWorkforcemanagementHistoricaldataCsv(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postUploadsWorkforcemanagementHistoricaldataCsv");
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

