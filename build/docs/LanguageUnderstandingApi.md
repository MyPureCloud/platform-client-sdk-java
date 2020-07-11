---
title: LanguageUnderstandingApi
---
## LanguageUnderstandingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteLanguageunderstandingDomain**](LanguageUnderstandingApi.html#deleteLanguageunderstandingDomain) | Delete an NLU Domain. |
| [**deleteLanguageunderstandingDomainFeedbackFeedbackId**](LanguageUnderstandingApi.html#deleteLanguageunderstandingDomainFeedbackFeedbackId) | Delete the feedback on the NLU Domain Version. |
| [**deleteLanguageunderstandingDomainVersion**](LanguageUnderstandingApi.html#deleteLanguageunderstandingDomainVersion) | Delete an NLU Domain Version |
| [**getLanguageunderstandingDomain**](LanguageUnderstandingApi.html#getLanguageunderstandingDomain) | Find an NLU Domain. |
| [**getLanguageunderstandingDomainFeedback**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainFeedback) | Get all feedback in the given NLU Domain Version. |
| [**getLanguageunderstandingDomainFeedbackFeedbackId**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainFeedbackFeedbackId) | Find a Feedback |
| [**getLanguageunderstandingDomainVersion**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainVersion) | Find an NLU Domain Version. |
| [**getLanguageunderstandingDomainVersionReport**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainVersionReport) | Retrieved quality report for the specified NLU Domain Version |
| [**getLanguageunderstandingDomainVersions**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainVersions) | Get all NLU Domain Versions for a given Domain. |
| [**getLanguageunderstandingDomains**](LanguageUnderstandingApi.html#getLanguageunderstandingDomains) | Get all NLU Domains. |
| [**patchLanguageunderstandingDomain**](LanguageUnderstandingApi.html#patchLanguageunderstandingDomain) | Update an NLU Domain. |
| [**postLanguageunderstandingDomainFeedback**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainFeedback) | Create feedback for the NLU Domain Version. |
| [**postLanguageunderstandingDomainVersionDetect**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersionDetect) | Detect intent, entities, etc. in the submitted text using the specified NLU domain version. |
| [**postLanguageunderstandingDomainVersionPublish**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersionPublish) | Publish the draft NLU Domain Version. |
| [**postLanguageunderstandingDomainVersionTrain**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersionTrain) | Train the draft NLU Domain Version. |
| [**postLanguageunderstandingDomainVersions**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersions) | Create an NLU Domain Version. |
| [**postLanguageunderstandingDomains**](LanguageUnderstandingApi.html#postLanguageunderstandingDomains) | Create an NLU Domain. |
| [**putLanguageunderstandingDomainVersion**](LanguageUnderstandingApi.html#putLanguageunderstandingDomainVersion) | Update an NLU Domain Version. |
{: class="table-striped"}

<a name="deleteLanguageunderstandingDomain"></a>

# **deleteLanguageunderstandingDomain**



> Void deleteLanguageunderstandingDomain(domainId)

Delete an NLU Domain.



Wraps DELETE /api/v2/languageunderstanding/domains/{domainId}  

Requires ANY permissions: 

* languageUnderstanding:nluDomain:delete
* dialog:bot:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
try {
    apiInstance.deleteLanguageunderstandingDomain(domainId);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#deleteLanguageunderstandingDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteLanguageunderstandingDomainFeedbackFeedbackId"></a>

# **deleteLanguageunderstandingDomainFeedbackFeedbackId**



> Void deleteLanguageunderstandingDomainFeedbackFeedbackId(domainId, feedbackId)

Delete the feedback on the NLU Domain Version.



Wraps DELETE /api/v2/languageunderstanding/domains/{domainId}/feedback/{feedbackId}  

Requires ANY permissions: 

* languageUnderstanding:feedback:delete
* dialog:bot:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String feedbackId = "feedbackId_example"; // String | ID of the Feedback
try {
    apiInstance.deleteLanguageunderstandingDomainFeedbackFeedbackId(domainId, feedbackId);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#deleteLanguageunderstandingDomainFeedbackFeedbackId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **feedbackId** | **String**| ID of the Feedback | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteLanguageunderstandingDomainVersion"></a>

# **deleteLanguageunderstandingDomainVersion**



> Void deleteLanguageunderstandingDomainVersion(domainId, domainVersionId)

Delete an NLU Domain Version



Wraps DELETE /api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:delete
* dialog:botVersion:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String domainVersionId = "domainVersionId_example"; // String | ID of the NLU domain version.
try {
    apiInstance.deleteLanguageunderstandingDomainVersion(domainId, domainVersionId);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#deleteLanguageunderstandingDomainVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **domainVersionId** | **String**| ID of the NLU domain version. | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getLanguageunderstandingDomain"></a>

# **getLanguageunderstandingDomain**



> [NluDomain](NluDomain.html) getLanguageunderstandingDomain(domainId)

Find an NLU Domain.



Wraps GET /api/v2/languageunderstanding/domains/{domainId}  

Requires ANY permissions: 

* languageUnderstanding:nluDomain:view
* dialog:bot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
try {
    NluDomain result = apiInstance.getLanguageunderstandingDomain(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
{: class="table-striped"}


### Return type

[**NluDomain**](NluDomain.html)

<a name="getLanguageunderstandingDomainFeedback"></a>

# **getLanguageunderstandingDomainFeedback**



> [NluFeedbackListing](NluFeedbackListing.html) getLanguageunderstandingDomainFeedback(domainId, intentName, assessment, dateStart, dateEnd, includeDeleted, pageNumber, pageSize, fields)

Get all feedback in the given NLU Domain Version.



Wraps GET /api/v2/languageunderstanding/domains/{domainId}/feedback  

Requires ANY permissions: 

* languageUnderstanding:feedback:view
* dialog:bot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String intentName = "intentName_example"; // String | The top intent name to retrieve feedback for.
String assessment = "assessment_example"; // String | The top assessment to retrieve feedback for.
LocalDate dateStart = new LocalDate(); // LocalDate | Begin of time window as ISO-8601 date.
LocalDate dateEnd = new LocalDate(); // LocalDate | End of time window as ISO-8601 date.
Boolean includeDeleted = true; // Boolean | Whether to include soft-deleted items in the result.
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> fields = Arrays.asList("fields_example"); // List<String> | Fields and properties to get, comma-separated
try {
    NluFeedbackListing result = apiInstance.getLanguageunderstandingDomainFeedback(domainId, intentName, assessment, dateStart, dateEnd, includeDeleted, pageNumber, pageSize, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingDomainFeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **intentName** | **String**| The top intent name to retrieve feedback for. | [optional] 
| **assessment** | **String**| The top assessment to retrieve feedback for. | [optional]<br />**Values**: Incorrect, Correct, Unknown 
| **dateStart** | **LocalDate**| Begin of time window as ISO-8601 date. | [optional] 
| **dateEnd** | **LocalDate**| End of time window as ISO-8601 date. | [optional] 
| **includeDeleted** | **Boolean**| Whether to include soft-deleted items in the result. | [optional] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **fields** | [**List&lt;String&gt;**](String.html)| Fields and properties to get, comma-separated | [optional]<br />**Values**: version, dateCreated, text, intents 
{: class="table-striped"}


### Return type

[**NluFeedbackListing**](NluFeedbackListing.html)

<a name="getLanguageunderstandingDomainFeedbackFeedbackId"></a>

# **getLanguageunderstandingDomainFeedbackFeedbackId**



> [NluFeedbackResponse](NluFeedbackResponse.html) getLanguageunderstandingDomainFeedbackFeedbackId(domainId, feedbackId, fields)

Find a Feedback



Wraps GET /api/v2/languageunderstanding/domains/{domainId}/feedback/{feedbackId}  

Requires ANY permissions: 

* languageUnderstanding:feedback:view
* dialog:bot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String feedbackId = "feedbackId_example"; // String | ID of the Feedback
List<String> fields = Arrays.asList("fields_example"); // List<String> | Fields and properties to get, comma-separated
try {
    NluFeedbackResponse result = apiInstance.getLanguageunderstandingDomainFeedbackFeedbackId(domainId, feedbackId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingDomainFeedbackFeedbackId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **feedbackId** | **String**| ID of the Feedback | 
| **fields** | [**List&lt;String&gt;**](String.html)| Fields and properties to get, comma-separated | [optional]<br />**Values**: version, dateCreated, text, intents 
{: class="table-striped"}


### Return type

[**NluFeedbackResponse**](NluFeedbackResponse.html)

<a name="getLanguageunderstandingDomainVersion"></a>

# **getLanguageunderstandingDomainVersion**



> [NluDomainVersion](NluDomainVersion.html) getLanguageunderstandingDomainVersion(domainId, domainVersionId, includeUtterances)

Find an NLU Domain Version.



Wraps GET /api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:view
* dialog:botVersion:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String domainVersionId = "domainVersionId_example"; // String | ID of the NLU domain version.
Boolean includeUtterances = true; // Boolean | Whether utterances for intent definition should be included when marshalling response.
try {
    NluDomainVersion result = apiInstance.getLanguageunderstandingDomainVersion(domainId, domainVersionId, includeUtterances);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingDomainVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **domainVersionId** | **String**| ID of the NLU domain version. | 
| **includeUtterances** | **Boolean**| Whether utterances for intent definition should be included when marshalling response. | [optional] 
{: class="table-striped"}


### Return type

[**NluDomainVersion**](NluDomainVersion.html)

<a name="getLanguageunderstandingDomainVersionReport"></a>

# **getLanguageunderstandingDomainVersionReport**



> [NluDomainVersionQualityReport](NluDomainVersionQualityReport.html) getLanguageunderstandingDomainVersionReport(domainId, domainVersionId)

Retrieved quality report for the specified NLU Domain Version



Wraps GET /api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}/report  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:view
* dialog:botVersion:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String domainVersionId = "domainVersionId_example"; // String | ID of the NLU domain version.
try {
    NluDomainVersionQualityReport result = apiInstance.getLanguageunderstandingDomainVersionReport(domainId, domainVersionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingDomainVersionReport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **domainVersionId** | **String**| ID of the NLU domain version. | 
{: class="table-striped"}


### Return type

[**NluDomainVersionQualityReport**](NluDomainVersionQualityReport.html)

<a name="getLanguageunderstandingDomainVersions"></a>

# **getLanguageunderstandingDomainVersions**



> [NluDomainVersionListing](NluDomainVersionListing.html) getLanguageunderstandingDomainVersions(domainId, includeUtterances, pageNumber, pageSize)

Get all NLU Domain Versions for a given Domain.



Wraps GET /api/v2/languageunderstanding/domains/{domainId}/versions  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:view
* dialog:botVersion:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
Boolean includeUtterances = true; // Boolean | Whether utterances for intent definition should be included when marshalling response.
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    NluDomainVersionListing result = apiInstance.getLanguageunderstandingDomainVersions(domainId, includeUtterances, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingDomainVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **includeUtterances** | **Boolean**| Whether utterances for intent definition should be included when marshalling response. | [optional] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**NluDomainVersionListing**](NluDomainVersionListing.html)

<a name="getLanguageunderstandingDomains"></a>

# **getLanguageunderstandingDomains**



> [NluDomainListing](NluDomainListing.html) getLanguageunderstandingDomains(pageNumber, pageSize)

Get all NLU Domains.



Wraps GET /api/v2/languageunderstanding/domains  

Requires ANY permissions: 

* languageUnderstanding:nluDomain:view
* dialog:bot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    NluDomainListing result = apiInstance.getLanguageunderstandingDomains(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingDomains");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**NluDomainListing**](NluDomainListing.html)

<a name="patchLanguageunderstandingDomain"></a>

# **patchLanguageunderstandingDomain**



> [NluDomain](NluDomain.html) patchLanguageunderstandingDomain(domainId, body)

Update an NLU Domain.



Wraps PATCH /api/v2/languageunderstanding/domains/{domainId}  

Requires ANY permissions: 

* languageUnderstanding:nluDomain:edit
* dialog:bot:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
NluDomain body = new NluDomain(); // NluDomain | The updated NLU Domain.
try {
    NluDomain result = apiInstance.patchLanguageunderstandingDomain(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#patchLanguageunderstandingDomain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **body** | [**NluDomain**](NluDomain.html)| The updated NLU Domain. | 
{: class="table-striped"}


### Return type

[**NluDomain**](NluDomain.html)

<a name="postLanguageunderstandingDomainFeedback"></a>

# **postLanguageunderstandingDomainFeedback**



> [NluFeedbackResponse](NluFeedbackResponse.html) postLanguageunderstandingDomainFeedback(domainId, body)

Create feedback for the NLU Domain Version.



Wraps POST /api/v2/languageunderstanding/domains/{domainId}/feedback  

Requires ANY permissions: 

* languageUnderstanding:feedback:add
* dialog:bot:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
NluFeedbackRequest body = new NluFeedbackRequest(); // NluFeedbackRequest | The Feedback to create.
try {
    NluFeedbackResponse result = apiInstance.postLanguageunderstandingDomainFeedback(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingDomainFeedback");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **body** | [**NluFeedbackRequest**](NluFeedbackRequest.html)| The Feedback to create. | 
{: class="table-striped"}


### Return type

[**NluFeedbackResponse**](NluFeedbackResponse.html)

<a name="postLanguageunderstandingDomainVersionDetect"></a>

# **postLanguageunderstandingDomainVersionDetect**



> [NluDetectionResponse](NluDetectionResponse.html) postLanguageunderstandingDomainVersionDetect(domainId, domainVersionId, body)

Detect intent, entities, etc. in the submitted text using the specified NLU domain version.



Wraps POST /api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}/detect  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:view
* dialog:botVersion:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String domainVersionId = "domainVersionId_example"; // String | ID of the NLU domain version.
NluDetectionRequest body = new NluDetectionRequest(); // NluDetectionRequest | The input data to perform detection on.
try {
    NluDetectionResponse result = apiInstance.postLanguageunderstandingDomainVersionDetect(domainId, domainVersionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingDomainVersionDetect");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **domainVersionId** | **String**| ID of the NLU domain version. | 
| **body** | [**NluDetectionRequest**](NluDetectionRequest.html)| The input data to perform detection on. | 
{: class="table-striped"}


### Return type

[**NluDetectionResponse**](NluDetectionResponse.html)

<a name="postLanguageunderstandingDomainVersionPublish"></a>

# **postLanguageunderstandingDomainVersionPublish**



> [NluDomainVersion](NluDomainVersion.html) postLanguageunderstandingDomainVersionPublish(domainId, domainVersionId)

Publish the draft NLU Domain Version.



Wraps POST /api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}/publish  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:add
* dialog:botVersion:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String domainVersionId = "domainVersionId_example"; // String | ID of the NLU domain version.
try {
    NluDomainVersion result = apiInstance.postLanguageunderstandingDomainVersionPublish(domainId, domainVersionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingDomainVersionPublish");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **domainVersionId** | **String**| ID of the NLU domain version. | 
{: class="table-striped"}


### Return type

[**NluDomainVersion**](NluDomainVersion.html)

<a name="postLanguageunderstandingDomainVersionTrain"></a>

# **postLanguageunderstandingDomainVersionTrain**



> [NluDomainVersionTrainingResponse](NluDomainVersionTrainingResponse.html) postLanguageunderstandingDomainVersionTrain(domainId, domainVersionId)

Train the draft NLU Domain Version.



Wraps POST /api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}/train  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:edit
* dialog:botVersion:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String domainVersionId = "domainVersionId_example"; // String | ID of the NLU domain version.
try {
    NluDomainVersionTrainingResponse result = apiInstance.postLanguageunderstandingDomainVersionTrain(domainId, domainVersionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingDomainVersionTrain");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **domainVersionId** | **String**| ID of the NLU domain version. | 
{: class="table-striped"}


### Return type

[**NluDomainVersionTrainingResponse**](NluDomainVersionTrainingResponse.html)

<a name="postLanguageunderstandingDomainVersions"></a>

# **postLanguageunderstandingDomainVersions**



> [NluDomainVersion](NluDomainVersion.html) postLanguageunderstandingDomainVersions(domainId, body)

Create an NLU Domain Version.



Wraps POST /api/v2/languageunderstanding/domains/{domainId}/versions  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:add
* dialog:botVersion:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
NluDomainVersion body = new NluDomainVersion(); // NluDomainVersion | The NLU Domain Version to create.
try {
    NluDomainVersion result = apiInstance.postLanguageunderstandingDomainVersions(domainId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingDomainVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **body** | [**NluDomainVersion**](NluDomainVersion.html)| The NLU Domain Version to create. | 
{: class="table-striped"}


### Return type

[**NluDomainVersion**](NluDomainVersion.html)

<a name="postLanguageunderstandingDomains"></a>

# **postLanguageunderstandingDomains**



> [NluDomain](NluDomain.html) postLanguageunderstandingDomains(body)

Create an NLU Domain.



Wraps POST /api/v2/languageunderstanding/domains  

Requires ANY permissions: 

* languageUnderstanding:nluDomain:add
* dialog:bot:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
NluDomain body = new NluDomain(); // NluDomain | The NLU Domain to create.
try {
    NluDomain result = apiInstance.postLanguageunderstandingDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingDomains");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**NluDomain**](NluDomain.html)| The NLU Domain to create. | 
{: class="table-striped"}


### Return type

[**NluDomain**](NluDomain.html)

<a name="putLanguageunderstandingDomainVersion"></a>

# **putLanguageunderstandingDomainVersion**



> [NluDomainVersion](NluDomainVersion.html) putLanguageunderstandingDomainVersion(domainId, domainVersionId, body)

Update an NLU Domain Version.



Wraps PUT /api/v2/languageunderstanding/domains/{domainId}/versions/{domainVersionId}  

Requires ANY permissions: 

* languageUnderstanding:nluDomainVersion:edit
* dialog:botVersion:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.LanguageUnderstandingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

LanguageUnderstandingApi apiInstance = new LanguageUnderstandingApi();
String domainId = "domainId_example"; // String | ID of the NLU domain.
String domainVersionId = "domainVersionId_example"; // String | ID of the NLU domain version.
NluDomainVersion body = new NluDomainVersion(); // NluDomainVersion | The updated NLU Domain Version.
try {
    NluDomainVersion result = apiInstance.putLanguageunderstandingDomainVersion(domainId, domainVersionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#putLanguageunderstandingDomainVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **domainId** | **String**| ID of the NLU domain. | 
| **domainVersionId** | **String**| ID of the NLU domain version. | 
| **body** | [**NluDomainVersion**](NluDomainVersion.html)| The updated NLU Domain Version. | 
{: class="table-striped"}


### Return type

[**NluDomainVersion**](NluDomainVersion.html)

