# IntentsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteIntentsCategory**](IntentsApi#deleteIntentsCategory) | Delete category for categoryId |
| [**deleteIntentsCustomerintent**](IntentsApi#deleteIntentsCustomerintent) | Delete customer intent for customerIntentId |
| [**getIntentsAssignmentsExternalcontact**](IntentsApi#getIntentsAssignmentsExternalcontact) | Get customer intent assignments for externalContactId |
| [**getIntentsCategories**](IntentsApi#getIntentsCategories) | Get categories |
| [**getIntentsCategory**](IntentsApi#getIntentsCategory) | Get category for categoryId |
| [**getIntentsCustomerintent**](IntentsApi#getIntentsCustomerintent) | Get customer intent for customerIntentId |
| [**getIntentsCustomerintentSourceintents**](IntentsApi#getIntentsCustomerintentSourceintents) | Get source intents mapped to a customer intent |
| [**getIntentsCustomerintents**](IntentsApi#getIntentsCustomerintents) | Get customer intents |
| [**getIntentsSourceintents**](IntentsApi#getIntentsSourceintents) | Get all mapped source intents by type. If no type selected default is type Segment |
| [**patchIntentsCategory**](IntentsApi#patchIntentsCategory) | Patch category for categoryId |
| [**patchIntentsCustomerintent**](IntentsApi#patchIntentsCustomerintent) | Patch customer intent for customerIntentId |
| [**postIntentsAssignmentsExternalcontactCustomerintentAssignment**](IntentsApi#postIntentsAssignmentsExternalcontactCustomerintentAssignment) | Create customer intent assignment for external contact |
| [**postIntentsCategories**](IntentsApi#postIntentsCategories) | Create category |
| [**postIntentsCustomerintentSourceintentsBulkAdd**](IntentsApi#postIntentsCustomerintentSourceintentsBulkAdd) | Bulk add source intents to a customer intent |
| [**postIntentsCustomerintentSourceintentsBulkRemove**](IntentsApi#postIntentsCustomerintentSourceintentsBulkRemove) | Bulk remove source intents mapped to a customer intent |
| [**postIntentsCustomerintents**](IntentsApi#postIntentsCustomerintents) | Create customer intents |
{: class="table-striped"}


# **deleteIntentsCategory**


> Void deleteIntentsCategory(categoryId)

Delete category for categoryId

Wraps DELETE /api/v2/intents/categories/{categoryId}  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String categoryId = "categoryId_example"; // String | Category id
try {
    apiInstance.deleteIntentsCategory(categoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#deleteIntentsCategory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **String**| Category id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteIntentsCustomerintent**


> Void deleteIntentsCustomerintent(customerIntentId)

Delete customer intent for customerIntentId

Wraps DELETE /api/v2/intents/customerintents/{customerIntentId}  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String customerIntentId = "customerIntentId_example"; // String | Customer Intent id
try {
    apiInstance.deleteIntentsCustomerintent(customerIntentId);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#deleteIntentsCustomerintent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerIntentId** | **String**| Customer Intent id | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getIntentsAssignmentsExternalcontact**


> [CustomerIntentAssignmentListing](CustomerIntentAssignmentListing) getIntentsAssignmentsExternalcontact(externalContactId, pageSize, pageNumber)

Get customer intent assignments for externalContactId

Wraps GET /api/v2/intents/assignments/externalcontacts/{externalContactId}  

Requires ANY permissions: 

* externalContacts:customerIntentAssignments:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String externalContactId = "externalContactId_example"; // String | External Contact id
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
try {
    CustomerIntentAssignmentListing result = apiInstance.getIntentsAssignmentsExternalcontact(externalContactId, pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#getIntentsAssignmentsExternalcontact");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalContactId** | **String**| External Contact id | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**CustomerIntentAssignmentListing**](CustomerIntentAssignmentListing)


# **getIntentsCategories**


> [IntentsCategoryListing](IntentsCategoryListing) getIntentsCategories(pageSize, pageNumber, queryValue)

Get categories

Wraps GET /api/v2/intents/categories  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String queryValue = "queryValue_example"; // String | Search query value to filter results by
try {
    IntentsCategoryListing result = apiInstance.getIntentsCategories(pageSize, pageNumber, queryValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#getIntentsCategories");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **queryValue** | **String**| Search query value to filter results by | [optional] 
{: class="table-striped"}


### Return type

[**IntentsCategoryListing**](IntentsCategoryListing)


# **getIntentsCategory**


> [IntentsCategory](IntentsCategory) getIntentsCategory(categoryId)

Get category for categoryId

Wraps GET /api/v2/intents/categories/{categoryId}  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String categoryId = "categoryId_example"; // String | Category id
try {
    IntentsCategory result = apiInstance.getIntentsCategory(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#getIntentsCategory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **String**| Category id | 
{: class="table-striped"}


### Return type

[**IntentsCategory**](IntentsCategory)


# **getIntentsCustomerintent**


> [CustomerIntentResponse](CustomerIntentResponse) getIntentsCustomerintent(customerIntentId)

Get customer intent for customerIntentId

Wraps GET /api/v2/intents/customerintents/{customerIntentId}  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String customerIntentId = "customerIntentId_example"; // String | Customer Intent id
try {
    CustomerIntentResponse result = apiInstance.getIntentsCustomerintent(customerIntentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#getIntentsCustomerintent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerIntentId** | **String**| Customer Intent id | 
{: class="table-striped"}


### Return type

[**CustomerIntentResponse**](CustomerIntentResponse)


# **getIntentsCustomerintentSourceintents**


> [CustomerSourceIntentListing](CustomerSourceIntentListing) getIntentsCustomerintentSourceintents(customerIntentId, pageSize, pageNumber, queryValue)

Get source intents mapped to a customer intent

Wraps GET /api/v2/intents/customerintents/{customerIntentId}/sourceintents  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String customerIntentId = "customerIntentId_example"; // String | Customer Intent id
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String queryValue = "queryValue_example"; // String | Search query value to filter results by
try {
    CustomerSourceIntentListing result = apiInstance.getIntentsCustomerintentSourceintents(customerIntentId, pageSize, pageNumber, queryValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#getIntentsCustomerintentSourceintents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerIntentId** | **String**| Customer Intent id | 
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **queryValue** | **String**| Search query value to filter results by | [optional] 
{: class="table-striped"}


### Return type

[**CustomerSourceIntentListing**](CustomerSourceIntentListing)


# **getIntentsCustomerintents**


> [CustomerIntentListing](CustomerIntentListing) getIntentsCustomerintents(pageSize, pageNumber, queryValue, categoryId)

Get customer intents

Wraps GET /api/v2/intents/customerintents  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String queryValue = "queryValue_example"; // String | Search query value to filter results by
String categoryId = "categoryId_example"; // String | CategoryId to filter query by
try {
    CustomerIntentListing result = apiInstance.getIntentsCustomerintents(pageSize, pageNumber, queryValue, categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#getIntentsCustomerintents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **queryValue** | **String**| Search query value to filter results by | [optional] 
| **categoryId** | **String**| CategoryId to filter query by | [optional] 
{: class="table-striped"}


### Return type

[**CustomerIntentListing**](CustomerIntentListing)


# **getIntentsSourceintents**


> [CustomerSourceIntentListing](CustomerSourceIntentListing) getIntentsSourceintents(pageSize, pageNumber, type, sourceId)

Get all mapped source intents by type. If no type selected default is type Segment

Wraps GET /api/v2/intents/sourceintents  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String type = "type_example"; // String | Source Type to query by. If none selected default response will be for type Segment.
String sourceId = "sourceId_example"; // String | Source Id to query by. Only required for sourceType: Copilot, Bot, Digitalbot
try {
    CustomerSourceIntentListing result = apiInstance.getIntentsSourceintents(pageSize, pageNumber, type, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#getIntentsSourceintents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **type** | **String**| Source Type to query by. If none selected default response will be for type Segment. | [optional]<br />**Values**: Bot, Copilot, Digitalbot, Segment, Topic, Unknown 
| **sourceId** | **String**| Source Id to query by. Only required for sourceType: Copilot, Bot, Digitalbot | [optional] 
{: class="table-striped"}


### Return type

[**CustomerSourceIntentListing**](CustomerSourceIntentListing)


# **patchIntentsCategory**


> [IntentsCategory](IntentsCategory) patchIntentsCategory(categoryId, body)

Patch category for categoryId

Wraps PATCH /api/v2/intents/categories/{categoryId}  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String categoryId = "categoryId_example"; // String | Category id
IntentsCategoryPatch body = new IntentsCategoryPatch(); // IntentsCategoryPatch | category
try {
    IntentsCategory result = apiInstance.patchIntentsCategory(categoryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#patchIntentsCategory");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **String**| Category id | 
| **body** | [**IntentsCategoryPatch**](IntentsCategoryPatch)| category | 
{: class="table-striped"}


### Return type

[**IntentsCategory**](IntentsCategory)


# **patchIntentsCustomerintent**


> [CustomerIntentResponse](CustomerIntentResponse) patchIntentsCustomerintent(customerIntentId, body)

Patch customer intent for customerIntentId

Wraps PATCH /api/v2/intents/customerintents/{customerIntentId}  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String customerIntentId = "customerIntentId_example"; // String | Customer Intent id
CustomerIntentPatch body = new CustomerIntentPatch(); // CustomerIntentPatch | Customer intent
try {
    CustomerIntentResponse result = apiInstance.patchIntentsCustomerintent(customerIntentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#patchIntentsCustomerintent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerIntentId** | **String**| Customer Intent id | 
| **body** | [**CustomerIntentPatch**](CustomerIntentPatch)| Customer intent | 
{: class="table-striped"}


### Return type

[**CustomerIntentResponse**](CustomerIntentResponse)


# **postIntentsAssignmentsExternalcontactCustomerintentAssignment**


> [CustomerIntentAssignmentResponse](CustomerIntentAssignmentResponse) postIntentsAssignmentsExternalcontactCustomerintentAssignment(externalContactId, customerIntentId, body)

Create customer intent assignment for external contact

Wraps POST /api/v2/intents/assignments/externalcontacts/{externalContactId}/customerintents/{customerIntentId}/assignment  

Requires ANY permissions: 

* externalContacts:customerIntentAssignments:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String externalContactId = "externalContactId_example"; // String | External Contact id
String customerIntentId = "customerIntentId_example"; // String | Customer Intent id
CustomerIntentAssignmentRequest body = new CustomerIntentAssignmentRequest(); // CustomerIntentAssignmentRequest | Customer intent assignment
try {
    CustomerIntentAssignmentResponse result = apiInstance.postIntentsAssignmentsExternalcontactCustomerintentAssignment(externalContactId, customerIntentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#postIntentsAssignmentsExternalcontactCustomerintentAssignment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalContactId** | **String**| External Contact id | 
| **customerIntentId** | **String**| Customer Intent id | 
| **body** | [**CustomerIntentAssignmentRequest**](CustomerIntentAssignmentRequest)| Customer intent assignment | 
{: class="table-striped"}


### Return type

[**CustomerIntentAssignmentResponse**](CustomerIntentAssignmentResponse)


# **postIntentsCategories**


> [IntentsCategory](IntentsCategory) postIntentsCategories(body)

Create category

Wraps POST /api/v2/intents/categories  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
IntentsCategory body = new IntentsCategory(); // IntentsCategory | category
try {
    IntentsCategory result = apiInstance.postIntentsCategories(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#postIntentsCategories");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IntentsCategory**](IntentsCategory)| category | 
{: class="table-striped"}


### Return type

[**IntentsCategory**](IntentsCategory)


# **postIntentsCustomerintentSourceintentsBulkAdd**


> [BulkSourceIntentsResponse](BulkSourceIntentsResponse) postIntentsCustomerintentSourceintentsBulkAdd(customerIntentId, body)

Bulk add source intents to a customer intent

Wraps POST /api/v2/intents/customerintents/{customerIntentId}/sourceintents/bulk/add  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String customerIntentId = "customerIntentId_example"; // String | Customer Intent id
BulkAddSourceIntentsRequest body = new BulkAddSourceIntentsRequest(); // BulkAddSourceIntentsRequest | Source intents to be added
try {
    BulkSourceIntentsResponse result = apiInstance.postIntentsCustomerintentSourceintentsBulkAdd(customerIntentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#postIntentsCustomerintentSourceintentsBulkAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerIntentId** | **String**| Customer Intent id | 
| **body** | [**BulkAddSourceIntentsRequest**](BulkAddSourceIntentsRequest)| Source intents to be added | 
{: class="table-striped"}


### Return type

[**BulkSourceIntentsResponse**](BulkSourceIntentsResponse)


# **postIntentsCustomerintentSourceintentsBulkRemove**


> [BulkSourceIntentsResponse](BulkSourceIntentsResponse) postIntentsCustomerintentSourceintentsBulkRemove(customerIntentId, body)

Bulk remove source intents mapped to a customer intent

Wraps POST /api/v2/intents/customerintents/{customerIntentId}/sourceintents/bulk/remove  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
String customerIntentId = "customerIntentId_example"; // String | Customer Intent id
BulkRemoveSourceIntentsRequest body = new BulkRemoveSourceIntentsRequest(); // BulkRemoveSourceIntentsRequest | Source intents to be removed
try {
    BulkSourceIntentsResponse result = apiInstance.postIntentsCustomerintentSourceintentsBulkRemove(customerIntentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#postIntentsCustomerintentSourceintentsBulkRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerIntentId** | **String**| Customer Intent id | 
| **body** | [**BulkRemoveSourceIntentsRequest**](BulkRemoveSourceIntentsRequest)| Source intents to be removed | 
{: class="table-striped"}


### Return type

[**BulkSourceIntentsResponse**](BulkSourceIntentsResponse)


# **postIntentsCustomerintents**


> [CustomerIntentResponse](CustomerIntentResponse) postIntentsCustomerintents(body)

Create customer intents

Wraps POST /api/v2/intents/customerintents  

Requires ANY permissions: 

* externalContacts:customerIntentTaxonomy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.IntentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

IntentsApi apiInstance = new IntentsApi();
CustomerIntent body = new CustomerIntent(); // CustomerIntent | Customer intent
try {
    CustomerIntentResponse result = apiInstance.postIntentsCustomerintents(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntentsApi#postIntentsCustomerintents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CustomerIntent**](CustomerIntent)| Customer intent | 
{: class="table-striped"}


### Return type

[**CustomerIntentResponse**](CustomerIntentResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
