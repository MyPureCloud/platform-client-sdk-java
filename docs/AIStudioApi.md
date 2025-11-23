# AIStudioApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteConversationsSummariesSetting**](AIStudioApi#deleteConversationsSummariesSetting) | Delete a summary setting. |
| [**deleteGuideJobs**](AIStudioApi#deleteGuideJobs) | Start the deletion of a guide. |
| [**getConversationsSummariesSetting**](AIStudioApi#getConversationsSummariesSetting) | Receive a summary setting. |
| [**getConversationsSummariesSettings**](AIStudioApi#getConversationsSummariesSettings) | Get all summary settings. |
| [**getGuide**](AIStudioApi#getGuide) | Get guide. |
| [**getGuideJob**](AIStudioApi#getGuideJob) | Get the specified guide deletion job. |
| [**getGuideVersion**](AIStudioApi#getGuideVersion) | Get a guide version. |
| [**getGuideVersionJob**](AIStudioApi#getGuideVersionJob) | Get the status of the publishing job for this guide version. |
| [**getGuides**](AIStudioApi#getGuides) | Get all guides. |
| [**getGuidesJob**](AIStudioApi#getGuidesJob) | Get the status of the guide content generation job. |
| [**patchGuide**](AIStudioApi#patchGuide) | Update a guide. |
| [**patchGuideVersion**](AIStudioApi#patchGuideVersion) | Update a guide version. |
| [**postConversationsSummariesPreview**](AIStudioApi#postConversationsSummariesPreview) | Trigger summary preview event generation. |
| [**postConversationsSummariesSettings**](AIStudioApi#postConversationsSummariesSettings) | Create a summary setting. |
| [**postGuideVersionJobs**](AIStudioApi#postGuideVersionJobs) | Start the publishing of a guide version. |
| [**postGuideVersions**](AIStudioApi#postGuideVersions) | Create a guide version. |
| [**postGuides**](AIStudioApi#postGuides) | Create a guide. |
| [**postGuidesJobs**](AIStudioApi#postGuidesJobs) | Start a guide content generation job. |
| [**putConversationsSummariesSetting**](AIStudioApi#putConversationsSummariesSetting) | Update a summary setting. |
{: class="table-striped"}


# **deleteConversationsSummariesSetting**


> Void deleteConversationsSummariesSetting(summarySettingId)

Delete a summary setting.

Wraps DELETE /api/v2/conversations/summaries/settings/{summarySettingId}  

Requires ALL permissions: 

* aiStudio:summaryConfig:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String summarySettingId = "summarySettingId_example"; // String | Summary setting id
try {
    apiInstance.deleteConversationsSummariesSetting(summarySettingId);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#deleteConversationsSummariesSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **summarySettingId** | **String**| Summary setting id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteGuideJobs**


> [GuideJob](GuideJob) deleteGuideJobs(guideId)

Start the deletion of a guide.

deleteGuideJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps DELETE /api/v2/guides/{guideId}/jobs  

Requires ALL permissions: 

* aiStudio:guideJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
try {
    GuideJob result = apiInstance.deleteGuideJobs(guideId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#deleteGuideJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
{: class="table-striped"}


### Return type

[**GuideJob**](GuideJob)


# **getConversationsSummariesSetting**


> [SummarySetting](SummarySetting) getConversationsSummariesSetting(summarySettingId)

Receive a summary setting.

Wraps GET /api/v2/conversations/summaries/settings/{summarySettingId}  

Requires ALL permissions: 

* aiStudio:summaryConfig:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String summarySettingId = "summarySettingId_example"; // String | Summary setting id
try {
    SummarySetting result = apiInstance.getConversationsSummariesSetting(summarySettingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getConversationsSummariesSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **summarySettingId** | **String**| Summary setting id | 
{: class="table-striped"}


### Return type

[**SummarySetting**](SummarySetting)


# **getConversationsSummariesSettings**


> [SummarySettingEntityListing](SummarySettingEntityListing) getConversationsSummariesSettings(language, name, sortBy, sortOrder, pageNumber, pageSize)

Get all summary settings.

Wraps GET /api/v2/conversations/summaries/settings  

Requires ALL permissions: 

* aiStudio:summaryConfig:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String language = "language_example"; // String | Filter by matching language - case insensitive.
String name = "name_example"; // String | Filter by partially matching name - case insensitive.
String sortBy = "dateModified"; // String | Sort by. Default value dateModified.
String sortOrder = "desc"; // String | Sort Order. Default value desc.
Integer pageNumber = 1; // Integer | Page number.
Integer pageSize = 25; // Integer | Page size. The maximum page size is 100.
try {
    SummarySettingEntityListing result = apiInstance.getConversationsSummariesSettings(language, name, sortBy, sortOrder, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getConversationsSummariesSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **language** | **String**| Filter by matching language - case insensitive. | [optional] 
| **name** | **String**| Filter by partially matching name - case insensitive. | [optional] 
| **sortBy** | **String**| Sort by. Default value dateModified. | [optional] [default to dateModified]<br />**Values**: dateModified, name 
| **sortOrder** | **String**| Sort Order. Default value desc. | [optional] [default to desc]<br />**Values**: asc, desc 
| **pageNumber** | **Integer**| Page number. | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size. The maximum page size is 100. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**SummarySettingEntityListing**](SummarySettingEntityListing)


# **getGuide**


> [Guide](Guide) getGuide(guideId)

Get guide.

getGuide is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/guides/{guideId}  

Requires ALL permissions: 

* aiStudio:guide:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
try {
    Guide result = apiInstance.getGuide(guideId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getGuide");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
{: class="table-striped"}


### Return type

[**Guide**](Guide)


# **getGuideJob**


> [GuideJob](GuideJob) getGuideJob(guideId, jobId)

Get the specified guide deletion job.

getGuideJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/guides/{guideId}/jobs/{jobId}  

Requires ALL permissions: 

* aiStudio:guideJob:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
String jobId = "jobId_example"; // String | jobId
try {
    GuideJob result = apiInstance.getGuideJob(guideId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getGuideJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**GuideJob**](GuideJob)


# **getGuideVersion**


> [GuideVersion](GuideVersion) getGuideVersion(guideId, versionId)

Get a guide version.

getGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/guides/{guideId}/versions/{versionId}  

Requires ALL permissions: 

* aiStudio:guideVersion:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
String versionId = "versionId_example"; // String | Version ID
try {
    GuideVersion result = apiInstance.getGuideVersion(guideId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getGuideVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
| **versionId** | **String**| Version ID | 
{: class="table-striped"}


### Return type

[**GuideVersion**](GuideVersion)


# **getGuideVersionJob**


> [GuideVersionPublishJob](GuideVersionPublishJob) getGuideVersionJob(guideId, versionId, jobId)

Get the status of the publishing job for this guide version.

getGuideVersionJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/guides/{guideId}/versions/{versionId}/jobs/{jobId}  

Requires ALL permissions: 

* aiStudio:guideVersionJob:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
String versionId = "versionId_example"; // String | Version ID
String jobId = "jobId_example"; // String | jobId
try {
    GuideVersionPublishJob result = apiInstance.getGuideVersionJob(guideId, versionId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getGuideVersionJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
| **versionId** | **String**| Version ID | 
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**GuideVersionPublishJob**](GuideVersionPublishJob)


# **getGuides**


> [GuideEntityListing](GuideEntityListing) getGuides(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize)

Get all guides.

getGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/guides  

Requires ALL permissions: 

* aiStudio:guide:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String name = "name_example"; // String | Filter by matching name - case insensitive.
String nameContains = "nameContains_example"; // String | Filter by name contains - case insensitive.
String status = "status_example"; // String | Filter by status.
String sortBy = "dateModified"; // String | Sort by. Default value dateModified.
String sortOrder = "desc"; // String | Sort Order. Default value desc.
Integer pageNumber = 1; // Integer | Page number.
Integer pageSize = 25; // Integer | Page size. The maximum page size is 100.
try {
    GuideEntityListing result = apiInstance.getGuides(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getGuides");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Filter by matching name - case insensitive. | [optional] 
| **nameContains** | **String**| Filter by name contains - case insensitive. | [optional] 
| **status** | **String**| Filter by status. | [optional]<br />**Values**: Published, Draft 
| **sortBy** | **String**| Sort by. Default value dateModified. | [optional] [default to dateModified]<br />**Values**: dateModified, name, status 
| **sortOrder** | **String**| Sort Order. Default value desc. | [optional] [default to desc]<br />**Values**: asc, desc 
| **pageNumber** | **Integer**| Page number. | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size. The maximum page size is 100. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**GuideEntityListing**](GuideEntityListing)


# **getGuidesJob**


> [GuideContentGenerationJob](GuideContentGenerationJob) getGuidesJob(jobId)

Get the status of the guide content generation job.

getGuidesJob is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/guides/jobs/{jobId}  

Requires ALL permissions: 

* aiStudio:guideJob:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String jobId = "jobId_example"; // String | jobId
try {
    GuideContentGenerationJob result = apiInstance.getGuidesJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#getGuidesJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**GuideContentGenerationJob**](GuideContentGenerationJob)


# **patchGuide**


> [Guide](Guide) patchGuide(guideId, body)

Update a guide.

patchGuide is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/guides/{guideId}  

Requires ALL permissions: 

* aiStudio:guide:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
UpdateGuide body = new UpdateGuide(); // UpdateGuide | 
try {
    Guide result = apiInstance.patchGuide(guideId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#patchGuide");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
| **body** | [**UpdateGuide**](UpdateGuide)|  | 
{: class="table-striped"}


### Return type

[**Guide**](Guide)


# **patchGuideVersion**


> [GuideVersion](GuideVersion) patchGuideVersion(guideId, versionId, body)

Update a guide version.

patchGuideVersion is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/guides/{guideId}/versions/{versionId}  

Requires ALL permissions: 

* aiStudio:guideVersion:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
String versionId = "versionId_example"; // String | Version ID
UpdateGuideVersion body = new UpdateGuideVersion(); // UpdateGuideVersion | 
try {
    GuideVersion result = apiInstance.patchGuideVersion(guideId, versionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#patchGuideVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
| **versionId** | **String**| Version ID | 
| **body** | [**UpdateGuideVersion**](UpdateGuideVersion)|  | 
{: class="table-striped"}


### Return type

[**GuideVersion**](GuideVersion)


# **postConversationsSummariesPreview**


> Void postConversationsSummariesPreview(body)

Trigger summary preview event generation.

Wraps POST /api/v2/conversations/summaries/preview  

Requires ALL permissions: 

* aiStudio:summaryPreview:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
SummarySettingWithTranscript body = new SummarySettingWithTranscript(); // SummarySettingWithTranscript | 
try {
    apiInstance.postConversationsSummariesPreview(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#postConversationsSummariesPreview");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SummarySettingWithTranscript**](SummarySettingWithTranscript)|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postConversationsSummariesSettings**


> [SummarySetting](SummarySetting) postConversationsSummariesSettings(body)

Create a summary setting.

Wraps POST /api/v2/conversations/summaries/settings  

Requires ALL permissions: 

* aiStudio:summaryConfig:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
SummarySetting body = new SummarySetting(); // SummarySetting | 
try {
    SummarySetting result = apiInstance.postConversationsSummariesSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#postConversationsSummariesSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**SummarySetting**](SummarySetting)|  | 
{: class="table-striped"}


### Return type

[**SummarySetting**](SummarySetting)


# **postGuideVersionJobs**


> [GuideVersionPublishJob](GuideVersionPublishJob) postGuideVersionJobs(guideId, versionId, body)

Start the publishing of a guide version.

postGuideVersionJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/guides/{guideId}/versions/{versionId}/jobs  

Requires ALL permissions: 

* aiStudio:guideVersionJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
String versionId = "versionId_example"; // String | Version ID
GuideVersionPublishJobRequest body = new GuideVersionPublishJobRequest(); // GuideVersionPublishJobRequest | 
try {
    GuideVersionPublishJob result = apiInstance.postGuideVersionJobs(guideId, versionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#postGuideVersionJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
| **versionId** | **String**| Version ID | 
| **body** | [**GuideVersionPublishJobRequest**](GuideVersionPublishJobRequest)|  | 
{: class="table-striped"}


### Return type

[**GuideVersionPublishJob**](GuideVersionPublishJob)


# **postGuideVersions**


> [GuideVersion](GuideVersion) postGuideVersions(guideId, body)

Create a guide version.

postGuideVersions is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/guides/{guideId}/versions  

Requires ALL permissions: 

* aiStudio:guideVersion:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String guideId = "guideId_example"; // String | Guide ID
CreateGuideVersion body = new CreateGuideVersion(); // CreateGuideVersion | 
try {
    GuideVersion result = apiInstance.postGuideVersions(guideId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#postGuideVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **guideId** | **String**| Guide ID | 
| **body** | [**CreateGuideVersion**](CreateGuideVersion)|  | [optional] 
{: class="table-striped"}


### Return type

[**GuideVersion**](GuideVersion)


# **postGuides**


> [Guide](Guide) postGuides(body)

Create a guide.

postGuides is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/guides  

Requires ALL permissions: 

* aiStudio:guide:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
CreateGuide body = new CreateGuide(); // CreateGuide | 
try {
    Guide result = apiInstance.postGuides(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#postGuides");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateGuide**](CreateGuide)|  | 
{: class="table-striped"}


### Return type

[**Guide**](Guide)


# **postGuidesJobs**


> [GuideContentGenerationJob](GuideContentGenerationJob) postGuidesJobs(body)

Start a guide content generation job.

postGuidesJobs is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps POST /api/v2/guides/jobs  

Requires ALL permissions: 

* aiStudio:guideJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
GenerateGuideContentRequest body = new GenerateGuideContentRequest(); // GenerateGuideContentRequest | 
try {
    GuideContentGenerationJob result = apiInstance.postGuidesJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#postGuidesJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GenerateGuideContentRequest**](GenerateGuideContentRequest)|  | 
{: class="table-striped"}


### Return type

[**GuideContentGenerationJob**](GuideContentGenerationJob)


# **putConversationsSummariesSetting**


> [SummarySetting](SummarySetting) putConversationsSummariesSetting(summarySettingId, body)

Update a summary setting.

Wraps PUT /api/v2/conversations/summaries/settings/{summarySettingId}  

Requires ALL permissions: 

* aiStudio:summaryConfig:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AIStudioApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AIStudioApi apiInstance = new AIStudioApi();
String summarySettingId = "summarySettingId_example"; // String | Summary setting id
SummarySetting body = new SummarySetting(); // SummarySetting | 
try {
    SummarySetting result = apiInstance.putConversationsSummariesSetting(summarySettingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AIStudioApi#putConversationsSummariesSetting");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **summarySettingId** | **String**| Summary setting id | 
| **body** | [**SummarySetting**](SummarySetting)|  | 
{: class="table-striped"}


### Return type

[**SummarySetting**](SummarySetting)


_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
