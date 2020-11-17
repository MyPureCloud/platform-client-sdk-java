---
title: KnowledgeApi
---
## KnowledgeApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteKnowledgeKnowledgebase**](KnowledgeApi.html#deleteKnowledgeKnowledgebase) | Delete knowledge base |
| [**deleteKnowledgeKnowledgebaseLanguageCategory**](KnowledgeApi.html#deleteKnowledgeKnowledgebaseLanguageCategory) | Delete category |
| [**deleteKnowledgeKnowledgebaseLanguageDocument**](KnowledgeApi.html#deleteKnowledgeKnowledgebaseLanguageDocument) | Delete document |
| [**getKnowledgeKnowledgebase**](KnowledgeApi.html#getKnowledgeKnowledgebase) | Get knowledge base |
| [**getKnowledgeKnowledgebaseLanguageCategories**](KnowledgeApi.html#getKnowledgeKnowledgebaseLanguageCategories) | Get categories |
| [**getKnowledgeKnowledgebaseLanguageCategory**](KnowledgeApi.html#getKnowledgeKnowledgebaseLanguageCategory) | Get category |
| [**getKnowledgeKnowledgebaseLanguageDocument**](KnowledgeApi.html#getKnowledgeKnowledgebaseLanguageDocument) | Get document |
| [**getKnowledgeKnowledgebaseLanguageDocuments**](KnowledgeApi.html#getKnowledgeKnowledgebaseLanguageDocuments) | Get documents |
| [**getKnowledgeKnowledgebaseLanguageTraining**](KnowledgeApi.html#getKnowledgeKnowledgebaseLanguageTraining) | Get training detail |
| [**getKnowledgeKnowledgebaseLanguageTrainings**](KnowledgeApi.html#getKnowledgeKnowledgebaseLanguageTrainings) | Get all trainings information for a knowledgebase |
| [**getKnowledgeKnowledgebases**](KnowledgeApi.html#getKnowledgeKnowledgebases) | Get knowledge bases |
| [**patchKnowledgeKnowledgebase**](KnowledgeApi.html#patchKnowledgeKnowledgebase) | Update knowledge base |
| [**patchKnowledgeKnowledgebaseLanguageCategory**](KnowledgeApi.html#patchKnowledgeKnowledgebaseLanguageCategory) | Update category |
| [**patchKnowledgeKnowledgebaseLanguageDocument**](KnowledgeApi.html#patchKnowledgeKnowledgebaseLanguageDocument) | Update document |
| [**patchKnowledgeKnowledgebaseLanguageDocuments**](KnowledgeApi.html#patchKnowledgeKnowledgebaseLanguageDocuments) | Update documents collection |
| [**postKnowledgeKnowledgebaseLanguageCategories**](KnowledgeApi.html#postKnowledgeKnowledgebaseLanguageCategories) | Create new category |
| [**postKnowledgeKnowledgebaseLanguageDocuments**](KnowledgeApi.html#postKnowledgeKnowledgebaseLanguageDocuments) | Create document |
| [**postKnowledgeKnowledgebaseLanguageTrainingPromote**](KnowledgeApi.html#postKnowledgeKnowledgebaseLanguageTrainingPromote) | Promote trained documents from draft state to active. |
| [**postKnowledgeKnowledgebaseLanguageTrainings**](KnowledgeApi.html#postKnowledgeKnowledgebaseLanguageTrainings) | Trigger training |
| [**postKnowledgeKnowledgebaseSearch**](KnowledgeApi.html#postKnowledgeKnowledgebaseSearch) | Search Documents |
| [**postKnowledgeKnowledgebases**](KnowledgeApi.html#postKnowledgeKnowledgebases) | Create new knowledge base |
{: class="table-striped"}

<a name="deleteKnowledgeKnowledgebase"></a>

# **deleteKnowledgeKnowledgebase**



> [KnowledgeBase](KnowledgeBase.html) deleteKnowledgeKnowledgebase(knowledgeBaseId)

Delete knowledge base



Wraps DELETE /api/v2/knowledge/knowledgebases/{knowledgeBaseId}  

Requires ALL permissions: 

* knowledge:knowledgebase:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
try {
    KnowledgeBase result = apiInstance.deleteKnowledgeKnowledgebase(knowledgeBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#deleteKnowledgeKnowledgebase");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
{: class="table-striped"}


### Return type

[**KnowledgeBase**](KnowledgeBase.html)

<a name="deleteKnowledgeKnowledgebaseLanguageCategory"></a>

# **deleteKnowledgeKnowledgebaseLanguageCategory**



> [KnowledgeCategory](KnowledgeCategory.html) deleteKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode)

Delete category



Wraps DELETE /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories/{categoryId}  

Requires ALL permissions: 

* knowledge:category:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String categoryId = "categoryId_example"; // String | Category ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeCategory result = apiInstance.deleteKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#deleteKnowledgeKnowledgebaseLanguageCategory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **String**| Category ID | 
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
{: class="table-striped"}


### Return type

[**KnowledgeCategory**](KnowledgeCategory.html)

<a name="deleteKnowledgeKnowledgebaseLanguageDocument"></a>

# **deleteKnowledgeKnowledgebaseLanguageDocument**



> [KnowledgeDocument](KnowledgeDocument.html) deleteKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode)

Delete document



Wraps DELETE /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/{documentId}  

Requires ALL permissions: 

* knowledge:document:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String documentId = "documentId_example"; // String | Document ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeDocument result = apiInstance.deleteKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#deleteKnowledgeKnowledgebaseLanguageDocument");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
{: class="table-striped"}


### Return type

[**KnowledgeDocument**](KnowledgeDocument.html)

<a name="getKnowledgeKnowledgebase"></a>

# **getKnowledgeKnowledgebase**



> [KnowledgeBase](KnowledgeBase.html) getKnowledgeKnowledgebase(knowledgeBaseId)

Get knowledge base



Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}  

Requires ALL permissions: 

* knowledge:knowledgebase:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
try {
    KnowledgeBase result = apiInstance.getKnowledgeKnowledgebase(knowledgeBaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebase");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
{: class="table-striped"}


### Return type

[**KnowledgeBase**](KnowledgeBase.html)

<a name="getKnowledgeKnowledgebaseLanguageCategories"></a>

# **getKnowledgeKnowledgebaseLanguageCategories**



> [CategoryListing](CategoryListing.html) getKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, before, after, limit, pageSize)

Get categories



Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories  

Requires ALL permissions: 

* knowledge:category:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
try {
    CategoryListing result = apiInstance.getKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, before, after, limit, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageCategories");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
{: class="table-striped"}


### Return type

[**CategoryListing**](CategoryListing.html)

<a name="getKnowledgeKnowledgebaseLanguageCategory"></a>

# **getKnowledgeKnowledgebaseLanguageCategory**



> [KnowledgeExtendedCategory](KnowledgeExtendedCategory.html) getKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode)

Get category



Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories/{categoryId}  

Requires ALL permissions: 

* knowledge:category:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String categoryId = "categoryId_example"; // String | Category ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeExtendedCategory result = apiInstance.getKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageCategory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **String**| Category ID | 
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
{: class="table-striped"}


### Return type

[**KnowledgeExtendedCategory**](KnowledgeExtendedCategory.html)

<a name="getKnowledgeKnowledgebaseLanguageDocument"></a>

# **getKnowledgeKnowledgebaseLanguageDocument**



> [KnowledgeDocument](KnowledgeDocument.html) getKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode)

Get document



Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/{documentId}  

Requires ALL permissions: 

* knowledge:document:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String documentId = "documentId_example"; // String | Document ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeDocument result = apiInstance.getKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageDocument");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
{: class="table-striped"}


### Return type

[**KnowledgeDocument**](KnowledgeDocument.html)

<a name="getKnowledgeKnowledgebaseLanguageDocuments"></a>

# **getKnowledgeKnowledgebaseLanguageDocuments**



> [DocumentListing](DocumentListing.html) getKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title)

Get documents



Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents  

Requires ALL permissions: 

* knowledge:document:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String categories = "categories_example"; // String | Filter by categories ids, comma separated values expected.
String title = "title_example"; // String | Filter by document title.
try {
    DocumentListing result = apiInstance.getKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageDocuments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **categories** | **String**| Filter by categories ids, comma separated values expected. | [optional] 
| **title** | **String**| Filter by document title. | [optional] 
{: class="table-striped"}


### Return type

[**DocumentListing**](DocumentListing.html)

<a name="getKnowledgeKnowledgebaseLanguageTraining"></a>

# **getKnowledgeKnowledgebaseLanguageTraining**



> [KnowledgeTraining](KnowledgeTraining.html) getKnowledgeKnowledgebaseLanguageTraining(knowledgeBaseId, languageCode, trainingId)

Get training detail



Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings/{trainingId}  

Requires ALL permissions: 

* knowledge:training:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String trainingId = "trainingId_example"; // String | Training ID
try {
    KnowledgeTraining result = apiInstance.getKnowledgeKnowledgebaseLanguageTraining(knowledgeBaseId, languageCode, trainingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageTraining");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **trainingId** | **String**| Training ID | 
{: class="table-striped"}


### Return type

[**KnowledgeTraining**](KnowledgeTraining.html)

<a name="getKnowledgeKnowledgebaseLanguageTrainings"></a>

# **getKnowledgeKnowledgebaseLanguageTrainings**



> [TrainingListing](TrainingListing.html) getKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState)

Get all trainings information for a knowledgebase



Wraps GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings  

Requires ALL permissions: 

* knowledge:training:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String knowledgeDocumentsState = "knowledgeDocumentsState_example"; // String | Return the training with the specified state of the trained documents.
try {
    TrainingListing result = apiInstance.getKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebaseLanguageTrainings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **knowledgeDocumentsState** | **String**| Return the training with the specified state of the trained documents. | [optional]<br />**Values**: Draft, Active, Discarded, Archived 
{: class="table-striped"}


### Return type

[**TrainingListing**](TrainingListing.html)

<a name="getKnowledgeKnowledgebases"></a>

# **getKnowledgeKnowledgebases**



> [KnowledgeBaseListing](KnowledgeBaseListing.html) getKnowledgeKnowledgebases(before, after, limit, pageSize, name)

Get knowledge bases



Wraps GET /api/v2/knowledge/knowledgebases  

Requires ALL permissions: 

* knowledge:knowledgebase:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String name = "name_example"; // String | Name of the KnowledgeBase to filter.
try {
    KnowledgeBaseListing result = apiInstance.getKnowledgeKnowledgebases(before, after, limit, pageSize, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#getKnowledgeKnowledgebases");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **name** | **String**| Name of the KnowledgeBase to filter. | [optional] 
{: class="table-striped"}


### Return type

[**KnowledgeBaseListing**](KnowledgeBaseListing.html)

<a name="patchKnowledgeKnowledgebase"></a>

# **patchKnowledgeKnowledgebase**



> [KnowledgeBase](KnowledgeBase.html) patchKnowledgeKnowledgebase(knowledgeBaseId, body)

Update knowledge base



Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}  

Requires ALL permissions: 

* knowledge:knowledgebase:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
KnowledgeBase body = new KnowledgeBase(); // KnowledgeBase | 
try {
    KnowledgeBase result = apiInstance.patchKnowledgeKnowledgebase(knowledgeBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebase");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **body** | [**KnowledgeBase**](KnowledgeBase.html)|  | 
{: class="table-striped"}


### Return type

[**KnowledgeBase**](KnowledgeBase.html)

<a name="patchKnowledgeKnowledgebaseLanguageCategory"></a>

# **patchKnowledgeKnowledgebaseLanguageCategory**



> [KnowledgeExtendedCategory](KnowledgeExtendedCategory.html) patchKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode, body)

Update category



Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories/{categoryId}  

Requires ALL permissions: 

* knowledge:category:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String categoryId = "categoryId_example"; // String | Category ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeCategoryRequest body = new KnowledgeCategoryRequest(); // KnowledgeCategoryRequest | 
try {
    KnowledgeExtendedCategory result = apiInstance.patchKnowledgeKnowledgebaseLanguageCategory(categoryId, knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebaseLanguageCategory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **String**| Category ID | 
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **body** | [**KnowledgeCategoryRequest**](KnowledgeCategoryRequest.html)|  | 
{: class="table-striped"}


### Return type

[**KnowledgeExtendedCategory**](KnowledgeExtendedCategory.html)

<a name="patchKnowledgeKnowledgebaseLanguageDocument"></a>

# **patchKnowledgeKnowledgebaseLanguageDocument**



> [KnowledgeDocument](KnowledgeDocument.html) patchKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode, body)

Update document



Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents/{documentId}  

Requires ALL permissions: 

* knowledge:document:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String documentId = "documentId_example"; // String | Document ID
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeDocumentRequest body = new KnowledgeDocumentRequest(); // KnowledgeDocumentRequest | 
try {
    KnowledgeDocument result = apiInstance.patchKnowledgeKnowledgebaseLanguageDocument(documentId, knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebaseLanguageDocument");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **documentId** | **String**| Document ID | 
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **body** | [**KnowledgeDocumentRequest**](KnowledgeDocumentRequest.html)|  | 
{: class="table-striped"}


### Return type

[**KnowledgeDocument**](KnowledgeDocument.html)

<a name="patchKnowledgeKnowledgebaseLanguageDocuments"></a>

# **patchKnowledgeKnowledgebaseLanguageDocuments**



> [DocumentListing](DocumentListing.html) patchKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body)

Update documents collection



Wraps PATCH /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents  

Requires ALL permissions: 

* knowledge:document:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
List<KnowledgeDocumentBulkRequest> body = Arrays.asList(new KnowledgeDocumentBulkRequest()); // List<KnowledgeDocumentBulkRequest> | 
try {
    DocumentListing result = apiInstance.patchKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#patchKnowledgeKnowledgebaseLanguageDocuments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **body** | [**List&lt;KnowledgeDocumentBulkRequest&gt;**](KnowledgeDocumentBulkRequest.html)|  | 
{: class="table-striped"}


### Return type

[**DocumentListing**](DocumentListing.html)

<a name="postKnowledgeKnowledgebaseLanguageCategories"></a>

# **postKnowledgeKnowledgebaseLanguageCategories**



> [KnowledgeExtendedCategory](KnowledgeExtendedCategory.html) postKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, body)

Create new category



Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories  

Requires ALL permissions: 

* knowledge:category:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeCategoryRequest body = new KnowledgeCategoryRequest(); // KnowledgeCategoryRequest | 
try {
    KnowledgeExtendedCategory result = apiInstance.postKnowledgeKnowledgebaseLanguageCategories(knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageCategories");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **body** | [**KnowledgeCategoryRequest**](KnowledgeCategoryRequest.html)|  | 
{: class="table-striped"}


### Return type

[**KnowledgeExtendedCategory**](KnowledgeExtendedCategory.html)

<a name="postKnowledgeKnowledgebaseLanguageDocuments"></a>

# **postKnowledgeKnowledgebaseLanguageDocuments**



> [KnowledgeDocument](KnowledgeDocument.html) postKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body)

Create document



Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents  

Requires ALL permissions: 

* knowledge:document:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
KnowledgeDocumentRequest body = new KnowledgeDocumentRequest(); // KnowledgeDocumentRequest | 
try {
    KnowledgeDocument result = apiInstance.postKnowledgeKnowledgebaseLanguageDocuments(knowledgeBaseId, languageCode, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageDocuments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **body** | [**KnowledgeDocumentRequest**](KnowledgeDocumentRequest.html)|  | 
{: class="table-striped"}


### Return type

[**KnowledgeDocument**](KnowledgeDocument.html)

<a name="postKnowledgeKnowledgebaseLanguageTrainingPromote"></a>

# **postKnowledgeKnowledgebaseLanguageTrainingPromote**



> [KnowledgeTraining](KnowledgeTraining.html) postKnowledgeKnowledgebaseLanguageTrainingPromote(knowledgeBaseId, languageCode, trainingId)

Promote trained documents from draft state to active.



Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings/{trainingId}/promote  

Requires ALL permissions: 

* knowledge:training:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
String trainingId = "trainingId_example"; // String | Training ID
try {
    KnowledgeTraining result = apiInstance.postKnowledgeKnowledgebaseLanguageTrainingPromote(knowledgeBaseId, languageCode, trainingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageTrainingPromote");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
| **trainingId** | **String**| Training ID | 
{: class="table-striped"}


### Return type

[**KnowledgeTraining**](KnowledgeTraining.html)

<a name="postKnowledgeKnowledgebaseLanguageTrainings"></a>

# **postKnowledgeKnowledgebaseLanguageTrainings**



> [KnowledgeTraining](KnowledgeTraining.html) postKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode)

Trigger training



Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings  

Requires ALL permissions: 

* knowledge:training:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
String languageCode = "en-US"; // String | Language code, format: iso2-LOCALE
try {
    KnowledgeTraining result = apiInstance.postKnowledgeKnowledgebaseLanguageTrainings(knowledgeBaseId, languageCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseLanguageTrainings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **languageCode** | **String**| Language code, format: iso2-LOCALE |<br />**Values**: en-US, de-DE 
{: class="table-striped"}


### Return type

[**KnowledgeTraining**](KnowledgeTraining.html)

<a name="postKnowledgeKnowledgebaseSearch"></a>

# **postKnowledgeKnowledgebaseSearch**



> [KnowledgeSearchResponse](KnowledgeSearchResponse.html) postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body)

Search Documents



Wraps POST /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/search  

Requires ALL permissions: 

* knowledge:knowledgebase:search

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
String knowledgeBaseId = "knowledgeBaseId_example"; // String | Knowledge base ID
KnowledgeSearchRequest body = new KnowledgeSearchRequest(); // KnowledgeSearchRequest | 
try {
    KnowledgeSearchResponse result = apiInstance.postKnowledgeKnowledgebaseSearch(knowledgeBaseId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebaseSearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeBaseId** | **String**| Knowledge base ID | 
| **body** | [**KnowledgeSearchRequest**](KnowledgeSearchRequest.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**KnowledgeSearchResponse**](KnowledgeSearchResponse.html)

<a name="postKnowledgeKnowledgebases"></a>

# **postKnowledgeKnowledgebases**



> [KnowledgeBase](KnowledgeBase.html) postKnowledgeKnowledgebases(body)

Create new knowledge base



Wraps POST /api/v2/knowledge/knowledgebases  

Requires ALL permissions: 

* knowledge:knowledgebase:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.KnowledgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

KnowledgeApi apiInstance = new KnowledgeApi();
KnowledgeBase body = new KnowledgeBase(); // KnowledgeBase | 
try {
    KnowledgeBase result = apiInstance.postKnowledgeKnowledgebases(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KnowledgeApi#postKnowledgeKnowledgebases");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**KnowledgeBase**](KnowledgeBase.html)|  | 
{: class="table-striped"}


### Return type

[**KnowledgeBase**](KnowledgeBase.html)

