# AgentAssistantsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAssistant**](AgentAssistantsApi#deleteAssistant) | Delete an assistant. |
| [**deleteAssistantQueue**](AgentAssistantsApi#deleteAssistantQueue) | Disassociate a queue from an assistant. |
| [**deleteAssistantQueues**](AgentAssistantsApi#deleteAssistantQueues) | Disassociate the queues from an assistant for the given assistant ID and queue IDs. |
| [**getAssistant**](AgentAssistantsApi#getAssistant) | Get an assistant. |
| [**getAssistantQueue**](AgentAssistantsApi#getAssistantQueue) | Get queue Information for an assistant. |
| [**getAssistantQueues**](AgentAssistantsApi#getAssistantQueues) | Get all the queues associated with an assistant. |
| [**getAssistants**](AgentAssistantsApi#getAssistants) | Get all assistants. |
| [**getAssistantsQueues**](AgentAssistantsApi#getAssistantsQueues) | Get all queues assigned to any assistant. |
| [**patchAssistant**](AgentAssistantsApi#patchAssistant) | Update an assistant. |
| [**patchAssistantQueues**](AgentAssistantsApi#patchAssistantQueues) | Update Queues for an Assistant. |
| [**postAssistantQueueUsersBulkAdd**](AgentAssistantsApi#postAssistantQueueUsersBulkAdd) | Bulk add users to assistant-queue (requires manual assignment mode). |
| [**postAssistantQueueUsersBulkRemove**](AgentAssistantsApi#postAssistantQueueUsersBulkRemove) | Bulk remove users from assistant-queue (requires manual assignment mode). |
| [**postAssistantQueueUsersQuery**](AgentAssistantsApi#postAssistantQueueUsersQuery) | Query for users in the assistant-queue (requires manual assignment mode). |
| [**postAssistants**](AgentAssistantsApi#postAssistants) | Create an Assistant. |
| [**putAssistantQueue**](AgentAssistantsApi#putAssistantQueue) | Create a queue assistant association. |
{: class="table-striped"}


# **deleteAssistant**


> Void deleteAssistant(assistantId)

Delete an assistant.

Wraps DELETE /api/v2/assistants/{assistantId}  

Requires ALL permissions: 

* assistants:assistant:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
try {
    apiInstance.deleteAssistant(assistantId);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#deleteAssistant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAssistantQueue**


> Void deleteAssistantQueue(assistantId, queueId)

Disassociate a queue from an assistant.

Wraps DELETE /api/v2/assistants/{assistantId}/queues/{queueId}  

Requires ALL permissions: 

* assistants:queue:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String queueId = "queueId_example"; // String | Queue ID
try {
    apiInstance.deleteAssistantQueue(assistantId, queueId);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#deleteAssistantQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **queueId** | **String**| Queue ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteAssistantQueues**


> Void deleteAssistantQueues(assistantId, queueIds)

Disassociate the queues from an assistant for the given assistant ID and queue IDs.

Wraps DELETE /api/v2/assistants/{assistantId}/queues  

Requires ALL permissions: 

* assistants:queue:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String queueIds = "queueIds_example"; // String | Comma-separated identifiers of the queues that need to be deleted.
try {
    apiInstance.deleteAssistantQueues(assistantId, queueIds);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#deleteAssistantQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **queueIds** | **String**| Comma-separated identifiers of the queues that need to be deleted. | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **getAssistant**


> [Assistant](Assistant) getAssistant(assistantId, expand)

Get an assistant.

Wraps GET /api/v2/assistants/{assistantId}  

Requires ALL permissions: 

* assistants:assistant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String expand = "expand_example"; // String | Which fields, if any, to expand.
try {
    Assistant result = apiInstance.getAssistant(assistantId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#getAssistant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **expand** | **String**| Which fields, if any, to expand. | [optional]<br />**Values**: copilot 
{: class="table-striped"}


### Return type

[**Assistant**](Assistant)


# **getAssistantQueue**


> [AssistantQueue](AssistantQueue) getAssistantQueue(assistantId, queueId, expand)

Get queue Information for an assistant.

Wraps GET /api/v2/assistants/{assistantId}/queues/{queueId}  

Requires ALL permissions: 

* assistants:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String queueId = "queueId_example"; // String | Queue ID
String expand = "expand_example"; // String | Which fields, if any, to expand.
try {
    AssistantQueue result = apiInstance.getAssistantQueue(assistantId, queueId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#getAssistantQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **queueId** | **String**| Queue ID | 
| **expand** | **String**| Which fields, if any, to expand. | [optional]<br />**Values**: assistant 
{: class="table-striped"}


### Return type

[**AssistantQueue**](AssistantQueue)


# **getAssistantQueues**


> [AssistantQueueListing](AssistantQueueListing) getAssistantQueues(assistantId, before, after, pageSize, expand)

Get all the queues associated with an assistant.

Wraps GET /api/v2/assistants/{assistantId}/queues  

Requires ALL permissions: 

* assistants:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String expand = "expand_example"; // String | Which fields, if any, to expand.
try {
    AssistantQueueListing result = apiInstance.getAssistantQueues(assistantId, before, after, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#getAssistantQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **expand** | **String**| Which fields, if any, to expand. | [optional]<br />**Values**: assistant 
{: class="table-striped"}


### Return type

[**AssistantQueueListing**](AssistantQueueListing)


# **getAssistants**


> [AssistantListing](AssistantListing) getAssistants(before, after, limit, pageSize, name, expand)

Get all assistants.

Wraps GET /api/v2/assistants  

Requires ALL permissions: 

* assistants:assistant:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String limit = "limit_example"; // String | Number of entities to return. Maximum of 200. Deprecated in favour of pageSize
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String name = "name_example"; // String | Return the assistant by the given name.
String expand = "expand_example"; // String | Which fields, if any, to expand
try {
    AssistantListing result = apiInstance.getAssistants(before, after, limit, pageSize, name, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#getAssistants");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **limit** | **String**| Number of entities to return. Maximum of 200. Deprecated in favour of pageSize | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **name** | **String**| Return the assistant by the given name. | [optional] 
| **expand** | **String**| Which fields, if any, to expand | [optional]<br />**Values**: copilot 
{: class="table-striped"}


### Return type

[**AssistantListing**](AssistantListing)


# **getAssistantsQueues**


> [AssistantQueueListing](AssistantQueueListing) getAssistantsQueues(before, after, pageSize, queueIds, expand)

Get all queues assigned to any assistant.

Wraps GET /api/v2/assistants/queues  

Requires ALL permissions: 

* assistants:queue:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String before = "before_example"; // String | The cursor that points to the start of the set of entities that has been returned.
String after = "after_example"; // String | The cursor that points to the end of the set of entities that has been returned.
String pageSize = "pageSize_example"; // String | Number of entities to return. Maximum of 200.
String queueIds = "queueIds_example"; // String | Comma-separated identifiers of the queues that need to be retrieved.
String expand = "expand_example"; // String | Which fields, if any, to expand.
try {
    AssistantQueueListing result = apiInstance.getAssistantsQueues(before, after, pageSize, queueIds, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#getAssistantsQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **before** | **String**| The cursor that points to the start of the set of entities that has been returned. | [optional] 
| **after** | **String**| The cursor that points to the end of the set of entities that has been returned. | [optional] 
| **pageSize** | **String**| Number of entities to return. Maximum of 200. | [optional] 
| **queueIds** | **String**| Comma-separated identifiers of the queues that need to be retrieved. | [optional] 
| **expand** | **String**| Which fields, if any, to expand. | [optional]<br />**Values**: assistant 
{: class="table-striped"}


### Return type

[**AssistantQueueListing**](AssistantQueueListing)


# **patchAssistant**


> [Assistant](Assistant) patchAssistant(assistantId, body)

Update an assistant.

Wraps PATCH /api/v2/assistants/{assistantId}  

Requires ALL permissions: 

* assistants:assistant:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
Assistant body = new Assistant(); // Assistant | 
try {
    Assistant result = apiInstance.patchAssistant(assistantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#patchAssistant");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **body** | [**Assistant**](Assistant)|  | 
{: class="table-striped"}


### Return type

[**Assistant**](Assistant)


# **patchAssistantQueues**


> [AssistantQueueListing](AssistantQueueListing) patchAssistantQueues(assistantId, body)

Update Queues for an Assistant.

Wraps PATCH /api/v2/assistants/{assistantId}/queues  

Requires ALL permissions: 

* assistants:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
List<AssistantQueue> body = Arrays.asList(new AssistantQueue()); // List<AssistantQueue> | 
try {
    AssistantQueueListing result = apiInstance.patchAssistantQueues(assistantId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#patchAssistantQueues");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **body** | [**List&lt;AssistantQueue&gt;**](AssistantQueue)|  | 
{: class="table-striped"}


### Return type

[**AssistantQueueListing**](AssistantQueueListing)


# **postAssistantQueueUsersBulkAdd**


> [BulkResponse](BulkResponse) postAssistantQueueUsersBulkAdd(assistantId, queueId, body)

Bulk add users to assistant-queue (requires manual assignment mode).

Wraps POST /api/v2/assistants/{assistantId}/queues/{queueId}/users/bulk/add  

Requires ANY permissions: 

* assistants:queueUserAssignment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String queueId = "queueId_example"; // String | Queue ID
AssistantQueueUsersBulkAddRequest body = new AssistantQueueUsersBulkAddRequest(); // AssistantQueueUsersBulkAddRequest | 
try {
    BulkResponse result = apiInstance.postAssistantQueueUsersBulkAdd(assistantId, queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#postAssistantQueueUsersBulkAdd");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **queueId** | **String**| Queue ID | 
| **body** | [**AssistantQueueUsersBulkAddRequest**](AssistantQueueUsersBulkAddRequest)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse)


# **postAssistantQueueUsersBulkRemove**


> [BulkResponse](BulkResponse) postAssistantQueueUsersBulkRemove(assistantId, queueId, body)

Bulk remove users from assistant-queue (requires manual assignment mode).

Wraps POST /api/v2/assistants/{assistantId}/queues/{queueId}/users/bulk/remove  

Requires ANY permissions: 

* assistants:queueUserAssignment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String queueId = "queueId_example"; // String | Queue ID
AssistantQueueUsersBulkRemoveRequest body = new AssistantQueueUsersBulkRemoveRequest(); // AssistantQueueUsersBulkRemoveRequest | 
try {
    BulkResponse result = apiInstance.postAssistantQueueUsersBulkRemove(assistantId, queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#postAssistantQueueUsersBulkRemove");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **queueId** | **String**| Queue ID | 
| **body** | [**AssistantQueueUsersBulkRemoveRequest**](AssistantQueueUsersBulkRemoveRequest)|  | 
{: class="table-striped"}


### Return type

[**BulkResponse**](BulkResponse)


# **postAssistantQueueUsersQuery**


> [AssistantQueueUsersQueryResponse](AssistantQueueUsersQueryResponse) postAssistantQueueUsersQuery(assistantId, queueId, body, expand)

Query for users in the assistant-queue (requires manual assignment mode).

Wraps POST /api/v2/assistants/{assistantId}/queues/{queueId}/users/query  

Requires ANY permissions: 

* assistants:queueUserAssignment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String queueId = "queueId_example"; // String | Queue ID
AssistantQueueUsersQueryRequest body = new AssistantQueueUsersQueryRequest(); // AssistantQueueUsersQueryRequest | 
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand with.
try {
    AssistantQueueUsersQueryResponse result = apiInstance.postAssistantQueueUsersQuery(assistantId, queueId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#postAssistantQueueUsersQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **queueId** | **String**| Queue ID | 
| **body** | [**AssistantQueueUsersQueryRequest**](AssistantQueueUsersQueryRequest)|  | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand with. | [optional]<br />**Values**: assistant, copilot 
{: class="table-striped"}


### Return type

[**AssistantQueueUsersQueryResponse**](AssistantQueueUsersQueryResponse)


# **postAssistants**


> [Assistant](Assistant) postAssistants(body)

Create an Assistant.

Wraps POST /api/v2/assistants  

Requires ALL permissions: 

* assistants:assistant:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
Assistant body = new Assistant(); // Assistant | 
try {
    Assistant result = apiInstance.postAssistants(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#postAssistants");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Assistant**](Assistant)|  | 
{: class="table-striped"}


### Return type

[**Assistant**](Assistant)


# **putAssistantQueue**


> [AssistantQueue](AssistantQueue) putAssistantQueue(assistantId, queueId, body)

Create a queue assistant association.

Wraps PUT /api/v2/assistants/{assistantId}/queues/{queueId}  

Requires ALL permissions: 

* assistants:queue:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentAssistantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentAssistantsApi apiInstance = new AgentAssistantsApi();
String assistantId = "assistantId_example"; // String | Assistant ID
String queueId = "queueId_example"; // String | Queue ID
AssistantQueue body = new AssistantQueue(); // AssistantQueue | 
try {
    AssistantQueue result = apiInstance.putAssistantQueue(assistantId, queueId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentAssistantsApi#putAssistantQueue");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assistantId** | **String**| Assistant ID | 
| **queueId** | **String**| Queue ID | 
| **body** | [**AssistantQueue**](AssistantQueue)|  | 
{: class="table-striped"}


### Return type

[**AssistantQueue**](AssistantQueue)


_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
