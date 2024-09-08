---
title: AgentAssistantsApi
---
## AgentAssistantsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAssistant**](AgentAssistantsApi.html#deleteAssistant) | Delete an assistant. |
| [**deleteAssistantQueue**](AgentAssistantsApi.html#deleteAssistantQueue) | Disassociate a queue from an assistant. |
| [**deleteAssistantQueues**](AgentAssistantsApi.html#deleteAssistantQueues) | Disassociate the queues from an assistant for the given assistant ID and queue IDs. |
| [**getAssistant**](AgentAssistantsApi.html#getAssistant) | Get an assistant. |
| [**getAssistantQueue**](AgentAssistantsApi.html#getAssistantQueue) | Get queue Information for an assistant. |
| [**getAssistantQueues**](AgentAssistantsApi.html#getAssistantQueues) | Get all the queues associated with an assistant. |
| [**getAssistants**](AgentAssistantsApi.html#getAssistants) | Get all assistants. |
| [**getAssistantsQueues**](AgentAssistantsApi.html#getAssistantsQueues) | Get all queues assigned to any assistant. |
| [**patchAssistant**](AgentAssistantsApi.html#patchAssistant) | Update an assistant. |
| [**patchAssistantQueues**](AgentAssistantsApi.html#patchAssistantQueues) | Update Queues for an Assistant. |
| [**postAssistants**](AgentAssistantsApi.html#postAssistants) | Create an Assistant. |
| [**putAssistantQueue**](AgentAssistantsApi.html#putAssistantQueue) | Create a queue assistant association. |
{: class="table-striped"}

<a name="deleteAssistant"></a>

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

<a name="deleteAssistantQueue"></a>

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

<a name="deleteAssistantQueues"></a>

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

<a name="getAssistant"></a>

# **getAssistant**



> [Assistant](Assistant.html) getAssistant(assistantId, expand)

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

[**Assistant**](Assistant.html)

<a name="getAssistantQueue"></a>

# **getAssistantQueue**



> [AssistantQueue](AssistantQueue.html) getAssistantQueue(assistantId, queueId, expand)

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

[**AssistantQueue**](AssistantQueue.html)

<a name="getAssistantQueues"></a>

# **getAssistantQueues**



> [AssistantQueueListing](AssistantQueueListing.html) getAssistantQueues(assistantId, before, after, pageSize, expand)

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

[**AssistantQueueListing**](AssistantQueueListing.html)

<a name="getAssistants"></a>

# **getAssistants**



> [AssistantListing](AssistantListing.html) getAssistants(before, after, limit, pageSize, name)

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
try {
    AssistantListing result = apiInstance.getAssistants(before, after, limit, pageSize, name);
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
{: class="table-striped"}


### Return type

[**AssistantListing**](AssistantListing.html)

<a name="getAssistantsQueues"></a>

# **getAssistantsQueues**



> [AssistantQueueListing](AssistantQueueListing.html) getAssistantsQueues(before, after, pageSize, queueIds, expand)

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

[**AssistantQueueListing**](AssistantQueueListing.html)

<a name="patchAssistant"></a>

# **patchAssistant**



> [Assistant](Assistant.html) patchAssistant(assistantId, body)

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
| **body** | [**Assistant**](Assistant.html)|  | 
{: class="table-striped"}


### Return type

[**Assistant**](Assistant.html)

<a name="patchAssistantQueues"></a>

# **patchAssistantQueues**



> [AssistantQueueListing](AssistantQueueListing.html) patchAssistantQueues(assistantId, body)

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
| **body** | [**List&lt;AssistantQueue&gt;**](AssistantQueue.html)|  | 
{: class="table-striped"}


### Return type

[**AssistantQueueListing**](AssistantQueueListing.html)

<a name="postAssistants"></a>

# **postAssistants**



> [Assistant](Assistant.html) postAssistants(body)

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
| **body** | [**Assistant**](Assistant.html)|  | 
{: class="table-striped"}


### Return type

[**Assistant**](Assistant.html)

<a name="putAssistantQueue"></a>

# **putAssistantQueue**



> [AssistantQueue](AssistantQueue.html) putAssistantQueue(assistantId, queueId, body)

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
| **body** | [**AssistantQueue**](AssistantQueue.html)|  | 
{: class="table-striped"}


### Return type

[**AssistantQueue**](AssistantQueue.html)

