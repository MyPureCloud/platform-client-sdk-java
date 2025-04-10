# UploadsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getKnowledgeKnowledgebaseUploadsUrlsJob**](UploadsApi#getKnowledgeKnowledgebaseUploadsUrlsJob) | Get content upload from URL job status |
| [**postGamificationContestsUploadsPrizeimages**](UploadsApi#postGamificationContestsUploadsPrizeimages) | Generates pre-signed URL to upload a prize image for gamification contests |
| [**postIntegrationsActionDraftFunctionUpload**](UploadsApi#postIntegrationsActionDraftFunctionUpload) | Create upload presigned URL for draft function package file. |
| [**postKnowledgeDocumentuploads**](UploadsApi#postKnowledgeDocumentuploads) | Creates a presigned URL for uploading a knowledge import file with a set of documents |
| [**postKnowledgeKnowledgebaseUploadsUrlsJobs**](UploadsApi#postKnowledgeKnowledgebaseUploadsUrlsJobs) | Create content upload from URL job |
| [**postLanguageunderstandingMinerUploads**](UploadsApi#postLanguageunderstandingMinerUploads) | Creates a presigned URL for uploading a chat corpus which will be used for mining by intent miner |
| [**postUploadsLearningCoverart**](UploadsApi#postUploadsLearningCoverart) | Generates pre-signed URL to upload cover art for learning modules |
| [**postUploadsPublicassetsImages**](UploadsApi#postUploadsPublicassetsImages) | Creates presigned url for uploading a public asset image |
| [**postUploadsRecordings**](UploadsApi#postUploadsRecordings) | Creates presigned url for uploading a recording file |
| [**postUploadsWorkforcemanagementHistoricaldataCsv**](UploadsApi#postUploadsWorkforcemanagementHistoricaldataCsv) | Creates presigned url for uploading WFM historical data file. Requires data in csv format. |
{: class="table-striped"}


# **getKnowledgeKnowledgebaseUploadsUrlsJob**


> [GetUploadSourceUrlJobStatusResponse](GetUploadSourceUrlJobStatusResponse) getKnowledgeKnowledgebaseUploadsUrlsJob(knowledgeBaseId, jobId)

Get content upload from URL job status

Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/uploads/urls/jobs/{jobId}  

Requires ALL permissions: 

* knowledge:uploadSourceUrlJob:view

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
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String jobId = "jobId_example"; // String | Upload job ID
try {
    GetUploadSourceUrlJobStatusResponse result = apiInstance.getKnowledgeKnowledgebaseUploadsUrlsJob(knowledgeBaseId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#getKnowledgeKnowledgebaseUploadsUrlsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **jobId** | **String**| Upload job ID | 
{: class="table-striped"}


### Return type

[**GetUploadSourceUrlJobStatusResponse**](GetUploadSourceUrlJobStatusResponse)


# **postGamificationContestsUploadsPrizeimages**


> [UploadUrlResponse](UploadUrlResponse) postGamificationContestsUploadsPrizeimages(body)

Generates pre-signed URL to upload a prize image for gamification contests

Wraps POST /api/v2/gamification/contests/uploads/prizeimages  

Requires ALL permissions: 

* gamification:contestPrizeImage:upload

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
GamificationContestPrizeImageUploadUrlRequest body = new GamificationContestPrizeImageUploadUrlRequest(); // GamificationContestPrizeImageUploadUrlRequest | query
try {
    UploadUrlResponse result = apiInstance.postGamificationContestsUploadsPrizeimages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postGamificationContestsUploadsPrizeimages");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GamificationContestPrizeImageUploadUrlRequest**](GamificationContestPrizeImageUploadUrlRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postIntegrationsActionDraftFunctionUpload**


> [FunctionUploadResponse](FunctionUploadResponse) postIntegrationsActionDraftFunctionUpload(actionId, body)

Create upload presigned URL for draft function package file.

Wraps POST /api/v2/integrations/actions/{actionId}/draft/function/upload  

Requires ANY permissions: 

* integrations:actionFunction:edit

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
String actionId = "actionId_example"; // String | actionId
FunctionUploadRequest body = new FunctionUploadRequest(); // FunctionUploadRequest | Input used to request URL upload.
try {
    FunctionUploadResponse result = apiInstance.postIntegrationsActionDraftFunctionUpload(actionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postIntegrationsActionDraftFunctionUpload");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **actionId** | **String**| actionId | 
| **body** | [**FunctionUploadRequest**](FunctionUploadRequest)| Input used to request URL upload. | 
{: class="table-striped"}


### Return type

[**FunctionUploadResponse**](FunctionUploadResponse)


# **postKnowledgeDocumentuploads**


> [UploadUrlResponse](UploadUrlResponse) postKnowledgeDocumentuploads(body)

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
| **body** | [**UploadUrlRequest**](UploadUrlRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postKnowledgeKnowledgebaseUploadsUrlsJobs**


> [CreateUploadSourceUrlJobResponse](CreateUploadSourceUrlJobResponse) postKnowledgeKnowledgebaseUploadsUrlsJobs(knowledgeBaseId, body)

Create content upload from URL job

Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/uploads/urls/jobs  

Requires ALL permissions: 

* knowledge:uploadSourceUrlJob:add

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
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
CreateUploadSourceUrlJobRequest body = new CreateUploadSourceUrlJobRequest(); // CreateUploadSourceUrlJobRequest | uploadRequest
try {
    CreateUploadSourceUrlJobResponse result = apiInstance.postKnowledgeKnowledgebaseUploadsUrlsJobs(knowledgeBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postKnowledgeKnowledgebaseUploadsUrlsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **body** | [**CreateUploadSourceUrlJobRequest**](CreateUploadSourceUrlJobRequest)| uploadRequest | 
{: class="table-striped"}


### Return type

[**CreateUploadSourceUrlJobResponse**](CreateUploadSourceUrlJobResponse)


# **postLanguageunderstandingMinerUploads**


> [UploadUrlResponse](UploadUrlResponse) postLanguageunderstandingMinerUploads(minerId, body)

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
Object body = null; // Object | query
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
| **body** | **Object**| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postUploadsLearningCoverart**


> [UploadUrlResponse](UploadUrlResponse) postUploadsLearningCoverart(body)

Generates pre-signed URL to upload cover art for learning modules

Wraps POST /api/v2/uploads/learning/coverart  

Requires ALL permissions: 

* learning:coverart:upload

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
LearningCoverArtUploadUrlRequest body = new LearningCoverArtUploadUrlRequest(); // LearningCoverArtUploadUrlRequest | query
try {
    UploadUrlResponse result = apiInstance.postUploadsLearningCoverart(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UploadsApi#postUploadsLearningCoverart");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LearningCoverArtUploadUrlRequest**](LearningCoverArtUploadUrlRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postUploadsPublicassetsImages**


> [UploadUrlResponse](UploadUrlResponse) postUploadsPublicassetsImages(body)

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
| **body** | [**UploadUrlRequest**](UploadUrlRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postUploadsRecordings**


> [UploadUrlResponse](UploadUrlResponse) postUploadsRecordings(body)

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
| **body** | [**UploadUrlRequest**](UploadUrlRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


# **postUploadsWorkforcemanagementHistoricaldataCsv**


> [UploadUrlResponse](UploadUrlResponse) postUploadsWorkforcemanagementHistoricaldataCsv(body)

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
| **body** | [**UploadUrlRequest**](UploadUrlRequest)| query | 
{: class="table-striped"}


### Return type

[**UploadUrlResponse**](UploadUrlResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
