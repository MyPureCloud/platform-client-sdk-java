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
| [**deleteLanguageunderstandingMiner**](LanguageUnderstandingApi.html#deleteLanguageunderstandingMiner) | Delete a miner. |
| [**deleteLanguageunderstandingMinerDraft**](LanguageUnderstandingApi.html#deleteLanguageunderstandingMinerDraft) | Delete a draft |
| [**getLanguageunderstandingDomain**](LanguageUnderstandingApi.html#getLanguageunderstandingDomain) | Find an NLU Domain. |
| [**getLanguageunderstandingDomainFeedback**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainFeedback) | Get all feedback in the given NLU Domain Version. |
| [**getLanguageunderstandingDomainFeedbackFeedbackId**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainFeedbackFeedbackId) | Find a Feedback |
| [**getLanguageunderstandingDomainVersion**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainVersion) | Find an NLU Domain Version. |
| [**getLanguageunderstandingDomainVersionReport**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainVersionReport) | Retrieved quality report for the specified NLU Domain Version |
| [**getLanguageunderstandingDomainVersions**](LanguageUnderstandingApi.html#getLanguageunderstandingDomainVersions) | Get all NLU Domain Versions for a given Domain. |
| [**getLanguageunderstandingDomains**](LanguageUnderstandingApi.html#getLanguageunderstandingDomains) | Get all NLU Domains. |
| [**getLanguageunderstandingMiner**](LanguageUnderstandingApi.html#getLanguageunderstandingMiner) | Get information about a miner. |
| [**getLanguageunderstandingMinerDraft**](LanguageUnderstandingApi.html#getLanguageunderstandingMinerDraft) | Get information about a draft. |
| [**getLanguageunderstandingMinerDrafts**](LanguageUnderstandingApi.html#getLanguageunderstandingMinerDrafts) | Retrieve the list of drafts created. |
| [**getLanguageunderstandingMinerIntent**](LanguageUnderstandingApi.html#getLanguageunderstandingMinerIntent) | Get information about a mined intent |
| [**getLanguageunderstandingMinerIntents**](LanguageUnderstandingApi.html#getLanguageunderstandingMinerIntents) | Retrieve a list of mined intents. |
| [**getLanguageunderstandingMiners**](LanguageUnderstandingApi.html#getLanguageunderstandingMiners) | Retrieve the list of miners created. |
| [**patchLanguageunderstandingDomain**](LanguageUnderstandingApi.html#patchLanguageunderstandingDomain) | Update an NLU Domain. |
| [**patchLanguageunderstandingMinerDraft**](LanguageUnderstandingApi.html#patchLanguageunderstandingMinerDraft) | Save information for the draft. Either topic draft or intent draft should be sent. |
| [**postLanguageunderstandingDomainFeedback**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainFeedback) | Create feedback for the NLU Domain Version. |
| [**postLanguageunderstandingDomainVersionDetect**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersionDetect) | Detect intent, entities, etc. in the submitted text using the specified NLU domain version. |
| [**postLanguageunderstandingDomainVersionPublish**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersionPublish) | Publish the draft NLU Domain Version. |
| [**postLanguageunderstandingDomainVersionTrain**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersionTrain) | Train the draft NLU Domain Version. |
| [**postLanguageunderstandingDomainVersions**](LanguageUnderstandingApi.html#postLanguageunderstandingDomainVersions) | Create an NLU Domain Version. |
| [**postLanguageunderstandingDomains**](LanguageUnderstandingApi.html#postLanguageunderstandingDomains) | Create an NLU Domain. |
| [**postLanguageunderstandingMinerDrafts**](LanguageUnderstandingApi.html#postLanguageunderstandingMinerDrafts) | Create a new draft resource. |
| [**postLanguageunderstandingMinerExecute**](LanguageUnderstandingApi.html#postLanguageunderstandingMinerExecute) | Start the mining process. Specify date range pair with mediaType, queueIds, participantType for mining data from Genesys Cloud. Specify only uploadKey for mining through an external file. |
| [**postLanguageunderstandingMiners**](LanguageUnderstandingApi.html#postLanguageunderstandingMiners) | Create a unique miner. |
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

<a name="deleteLanguageunderstandingMiner"></a>

# **deleteLanguageunderstandingMiner**



> Void deleteLanguageunderstandingMiner(minerId)

Delete a miner.



Wraps DELETE /api/v2/languageunderstanding/miners/{minerId}  

Requires ALL permissions: 

* languageUnderstanding:miner:delete

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
String minerId = "minerId_example"; // String | Miner ID
try {
    apiInstance.deleteLanguageunderstandingMiner(minerId);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#deleteLanguageunderstandingMiner");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteLanguageunderstandingMinerDraft"></a>

# **deleteLanguageunderstandingMinerDraft**



> Void deleteLanguageunderstandingMinerDraft(minerId, draftId)

Delete a draft



Wraps DELETE /api/v2/languageunderstanding/miners/{minerId}/drafts/{draftId}  

Requires ALL permissions: 

* languageUnderstanding:draft:delete

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
String minerId = "minerId_example"; // String | Miner ID
String draftId = "draftId_example"; // String | Draft ID
try {
    apiInstance.deleteLanguageunderstandingMinerDraft(minerId, draftId);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#deleteLanguageunderstandingMinerDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **draftId** | **String**| Draft ID | 
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



> [NluFeedbackListing](NluFeedbackListing.html) getLanguageunderstandingDomainFeedback(domainId, intentName, assessment, dateStart, dateEnd, includeDeleted, pageNumber, pageSize, enableCursorPagination, after, fields)

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
Boolean enableCursorPagination = false; // Boolean | Enable Cursor Pagination
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned. This is considered only when enableCursorPagination=true
List<String> fields = Arrays.asList("fields_example"); // List<String> | Fields and properties to get, comma-separated
try {
    NluFeedbackListing result = apiInstance.getLanguageunderstandingDomainFeedback(domainId, intentName, assessment, dateStart, dateEnd, includeDeleted, pageNumber, pageSize, enableCursorPagination, after, fields);
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
| **assessment** | **String**| The top assessment to retrieve feedback for. | [optional]<br />**Values**: Incorrect, Correct, Unknown, Disabled 
| **dateStart** | **LocalDate**| Begin of time window as ISO-8601 date. | [optional] 
| **dateEnd** | **LocalDate**| End of time window as ISO-8601 date. | [optional] 
| **includeDeleted** | **Boolean**| Whether to include soft-deleted items in the result. | [optional] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **enableCursorPagination** | **Boolean**| Enable Cursor Pagination | [optional] [default to false] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. This is considered only when enableCursorPagination=true | [optional] 
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

<a name="getLanguageunderstandingMiner"></a>

# **getLanguageunderstandingMiner**



> [Miner](Miner.html) getLanguageunderstandingMiner(minerId)

Get information about a miner.



Wraps GET /api/v2/languageunderstanding/miners/{minerId}  

Requires ALL permissions: 

* languageUnderstanding:miner:view

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
String minerId = "minerId_example"; // String | Miner ID
try {
    Miner result = apiInstance.getLanguageunderstandingMiner(minerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingMiner");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
{: class="table-striped"}


### Return type

[**Miner**](Miner.html)

<a name="getLanguageunderstandingMinerDraft"></a>

# **getLanguageunderstandingMinerDraft**



> [Draft](Draft.html) getLanguageunderstandingMinerDraft(minerId, draftId)

Get information about a draft.



Wraps GET /api/v2/languageunderstanding/miners/{minerId}/drafts/{draftId}  

Requires ALL permissions: 

* languageUnderstanding:draft:view

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
String minerId = "minerId_example"; // String | Miner ID
String draftId = "draftId_example"; // String | Draft ID
try {
    Draft result = apiInstance.getLanguageunderstandingMinerDraft(minerId, draftId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingMinerDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **draftId** | **String**| Draft ID | 
{: class="table-striped"}


### Return type

[**Draft**](Draft.html)

<a name="getLanguageunderstandingMinerDrafts"></a>

# **getLanguageunderstandingMinerDrafts**



> [DraftListing](DraftListing.html) getLanguageunderstandingMinerDrafts(minerId)

Retrieve the list of drafts created.



Wraps GET /api/v2/languageunderstanding/miners/{minerId}/drafts  

Requires ALL permissions: 

* languageUnderstanding:draft:view

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
String minerId = "minerId_example"; // String | Miner ID
try {
    DraftListing result = apiInstance.getLanguageunderstandingMinerDrafts(minerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingMinerDrafts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
{: class="table-striped"}


### Return type

[**DraftListing**](DraftListing.html)

<a name="getLanguageunderstandingMinerIntent"></a>

# **getLanguageunderstandingMinerIntent**



> [MinerIntent](MinerIntent.html) getLanguageunderstandingMinerIntent(minerId, intentId, expand)

Get information about a mined intent



Wraps GET /api/v2/languageunderstanding/miners/{minerId}/intents/{intentId}  

Requires ALL permissions: 

* languageUnderstanding:minerIntent:view

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
String minerId = "minerId_example"; // String | Miner ID
String intentId = "intentId_example"; // String | The ID of the intent to be retrieved.
String expand = "expand_example"; // String | Option to fetch utterances
try {
    MinerIntent result = apiInstance.getLanguageunderstandingMinerIntent(minerId, intentId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingMinerIntent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **intentId** | **String**| The ID of the intent to be retrieved. | 
| **expand** | **String**| Option to fetch utterances | [optional]<br />**Values**: phrases, utterances 
{: class="table-striped"}


### Return type

[**MinerIntent**](MinerIntent.html)

<a name="getLanguageunderstandingMinerIntents"></a>

# **getLanguageunderstandingMinerIntents**



> [MinedIntentsListing](MinedIntentsListing.html) getLanguageunderstandingMinerIntents(minerId, expand)

Retrieve a list of mined intents.



Wraps GET /api/v2/languageunderstanding/miners/{minerId}/intents  

Requires ALL permissions: 

* languageUnderstanding:minerIntent:view

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
String minerId = "minerId_example"; // String | Miner ID
String expand = "expand_example"; // String | Option to fetch utterances.
try {
    MinedIntentsListing result = apiInstance.getLanguageunderstandingMinerIntents(minerId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingMinerIntents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **expand** | **String**| Option to fetch utterances. | [optional]<br />**Values**: phrases, utterances 
{: class="table-striped"}


### Return type

[**MinedIntentsListing**](MinedIntentsListing.html)

<a name="getLanguageunderstandingMiners"></a>

# **getLanguageunderstandingMiners**



> [MinerListing](MinerListing.html) getLanguageunderstandingMiners()

Retrieve the list of miners created.



Wraps GET /api/v2/languageunderstanding/miners  

Requires ALL permissions: 

* languageUnderstanding:miner:view

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
try {
    MinerListing result = apiInstance.getLanguageunderstandingMiners();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#getLanguageunderstandingMiners");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**MinerListing**](MinerListing.html)

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

<a name="patchLanguageunderstandingMinerDraft"></a>

# **patchLanguageunderstandingMinerDraft**



> [Draft](Draft.html) patchLanguageunderstandingMinerDraft(minerId, draftId, body)

Save information for the draft. Either topic draft or intent draft should be sent.



Wraps PATCH /api/v2/languageunderstanding/miners/{minerId}/drafts/{draftId}  

Requires ALL permissions: 

* languageUnderstanding:draft:edit

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
String minerId = "minerId_example"; // String | Miner ID
String draftId = "draftId_example"; // String | Draft ID
DraftRequest body = new DraftRequest(); // DraftRequest | 
try {
    Draft result = apiInstance.patchLanguageunderstandingMinerDraft(minerId, draftId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#patchLanguageunderstandingMinerDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **draftId** | **String**| Draft ID | 
| **body** | [**DraftRequest**](DraftRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**Draft**](Draft.html)

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

<a name="postLanguageunderstandingMinerDrafts"></a>

# **postLanguageunderstandingMinerDrafts**



> [Draft](Draft.html) postLanguageunderstandingMinerDrafts(minerId, body)

Create a new draft resource.



Wraps POST /api/v2/languageunderstanding/miners/{minerId}/drafts  

Requires ALL permissions: 

* languageUnderstanding:draft:add

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
String minerId = "minerId_example"; // String | Miner ID
Draft body = new Draft(); // Draft | Details for creating draft resource
try {
    Draft result = apiInstance.postLanguageunderstandingMinerDrafts(minerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingMinerDrafts");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **body** | [**Draft**](Draft.html)| Details for creating draft resource | 
{: class="table-striped"}


### Return type

[**Draft**](Draft.html)

<a name="postLanguageunderstandingMinerExecute"></a>

# **postLanguageunderstandingMinerExecute**



> [Miner](Miner.html) postLanguageunderstandingMinerExecute(minerId, body)

Start the mining process. Specify date range pair with mediaType, queueIds, participantType for mining data from Genesys Cloud. Specify only uploadKey for mining through an external file.



Wraps POST /api/v2/languageunderstanding/miners/{minerId}/execute  

Requires ALL permissions: 

* languageUnderstanding:miner:execute

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
String minerId = "minerId_example"; // String | Miner ID
MinerExecuteRequest body = new MinerExecuteRequest(); // MinerExecuteRequest | 
try {
    Miner result = apiInstance.postLanguageunderstandingMinerExecute(minerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingMinerExecute");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **minerId** | **String**| Miner ID | 
| **body** | [**MinerExecuteRequest**](MinerExecuteRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**Miner**](Miner.html)

<a name="postLanguageunderstandingMiners"></a>

# **postLanguageunderstandingMiners**



> [Miner](Miner.html) postLanguageunderstandingMiners(body)

Create a unique miner.



Wraps POST /api/v2/languageunderstanding/miners  

Requires ALL permissions: 

* languageUnderstanding:miner:add

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
Miner body = new Miner(); // Miner | Details for creating a new miner resource.
try {
    Miner result = apiInstance.postLanguageunderstandingMiners(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguageUnderstandingApi#postLanguageunderstandingMiners");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Miner**](Miner.html)| Details for creating a new miner resource. | 
{: class="table-striped"}


### Return type

[**Miner**](Miner.html)

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

