# VirtualAgentsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteAgenticVirtualagentJobs**](VirtualAgentsApi#deleteAgenticVirtualagentJobs) | Start the deletion of a virtualAgent. |
| [**getAgenticVirtualagent**](VirtualAgentsApi#getAgenticVirtualagent) | Get virtual agent. |
| [**getAgenticVirtualagentJob**](VirtualAgentsApi#getAgenticVirtualagentJob) | Get a virtualAgent job. |
| [**getAgenticVirtualagents**](VirtualAgentsApi#getAgenticVirtualagents) | Get all virtual agents. |
| [**patchAgenticVirtualagent**](VirtualAgentsApi#patchAgenticVirtualagent) | Update a virtual agent. |
| [**postAgenticVirtualagentVersionJobs**](VirtualAgentsApi#postAgenticVirtualagentVersionJobs) | Start the publishing of a virtual agent version. |
| [**postAgenticVirtualagents**](VirtualAgentsApi#postAgenticVirtualagents) | Create a virtual agent. |
{: class="table-striped"}


# **deleteAgenticVirtualagentJobs**


> [AgenticVirtualAgentJob](AgenticVirtualAgentJob) deleteAgenticVirtualagentJobs(virtualAgentId)

Start the deletion of a virtualAgent.

Wraps DELETE /api/v2/agentic/virtualagents/{virtualAgentId}/jobs  

Requires ALL permissions: 

* agentic:virtualAgentJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VirtualAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VirtualAgentsApi apiInstance = new VirtualAgentsApi();
String virtualAgentId = "virtualAgentId_example"; // String | Virtual Agent ID
try {
    AgenticVirtualAgentJob result = apiInstance.deleteAgenticVirtualagentJobs(virtualAgentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAgentsApi#deleteAgenticVirtualagentJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **virtualAgentId** | **String**| Virtual Agent ID | 
{: class="table-striped"}


### Return type

[**AgenticVirtualAgentJob**](AgenticVirtualAgentJob)


# **getAgenticVirtualagent**


> [AgenticVirtualAgent](AgenticVirtualAgent) getAgenticVirtualagent(virtualAgentId)

Get virtual agent.

Wraps GET /api/v2/agentic/virtualagents/{virtualAgentId}  

Requires ALL permissions: 

* agentic:virtualAgent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VirtualAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VirtualAgentsApi apiInstance = new VirtualAgentsApi();
String virtualAgentId = "virtualAgentId_example"; // String | Virtual Agent ID
try {
    AgenticVirtualAgent result = apiInstance.getAgenticVirtualagent(virtualAgentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAgentsApi#getAgenticVirtualagent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **virtualAgentId** | **String**| Virtual Agent ID | 
{: class="table-striped"}


### Return type

[**AgenticVirtualAgent**](AgenticVirtualAgent)


# **getAgenticVirtualagentJob**


> [AgenticVirtualAgentJob](AgenticVirtualAgentJob) getAgenticVirtualagentJob(virtualAgentId, jobId)

Get a virtualAgent job.

Wraps GET /api/v2/agentic/virtualagents/{virtualAgentId}/jobs/{jobId}  

Requires ALL permissions: 

* agentic:virtualAgentJob:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VirtualAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VirtualAgentsApi apiInstance = new VirtualAgentsApi();
String virtualAgentId = "virtualAgentId_example"; // String | Virtual Agent ID
String jobId = "jobId_example"; // String | jobId
try {
    AgenticVirtualAgentJob result = apiInstance.getAgenticVirtualagentJob(virtualAgentId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAgentsApi#getAgenticVirtualagentJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **virtualAgentId** | **String**| Virtual Agent ID | 
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**AgenticVirtualAgentJob**](AgenticVirtualAgentJob)


# **getAgenticVirtualagents**


> [AgenticVirtualAgentEntityListing](AgenticVirtualAgentEntityListing) getAgenticVirtualagents(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize)

Get all virtual agents.

Wraps GET /api/v2/agentic/virtualagents  

Requires ALL permissions: 

* agentic:virtualAgent:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VirtualAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VirtualAgentsApi apiInstance = new VirtualAgentsApi();
String name = "name_example"; // String | Filter by matching name - case insensitive.
String nameContains = "nameContains_example"; // String | Filter by name contains - case insensitive.
String status = "status_example"; // String | Filter by status.
String sortBy = "dateModified"; // String | Sort by. Default value dateModified.
String sortOrder = "desc"; // String | Sort Order. Default value desc.
Integer pageNumber = 1; // Integer | Page number.
Integer pageSize = 25; // Integer | Page size. The maximum page size is 100.
try {
    AgenticVirtualAgentEntityListing result = apiInstance.getAgenticVirtualagents(name, nameContains, status, sortBy, sortOrder, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAgentsApi#getAgenticVirtualagents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **String**| Filter by matching name - case insensitive. | [optional] 
| **nameContains** | **String**| Filter by name contains - case insensitive. | [optional] 
| **status** | **String**| Filter by status. | [optional]<br />**Values**: Draft, Published 
| **sortBy** | **String**| Sort by. Default value dateModified. | [optional] [default to dateModified]<br />**Values**: dateModified, name, status 
| **sortOrder** | **String**| Sort Order. Default value desc. | [optional] [default to desc]<br />**Values**: asc, desc 
| **pageNumber** | **Integer**| Page number. | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size. The maximum page size is 100. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**AgenticVirtualAgentEntityListing**](AgenticVirtualAgentEntityListing)


# **patchAgenticVirtualagent**


> [AgenticVirtualAgent](AgenticVirtualAgent) patchAgenticVirtualagent(virtualAgentId, body)

Update a virtual agent.

Wraps PATCH /api/v2/agentic/virtualagents/{virtualAgentId}  

Requires ALL permissions: 

* agentic:virtualAgent:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VirtualAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VirtualAgentsApi apiInstance = new VirtualAgentsApi();
String virtualAgentId = "virtualAgentId_example"; // String | Virtual Agent ID
UpdateAgenticVirtualAgent body = new UpdateAgenticVirtualAgent(); // UpdateAgenticVirtualAgent | 
try {
    AgenticVirtualAgent result = apiInstance.patchAgenticVirtualagent(virtualAgentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAgentsApi#patchAgenticVirtualagent");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **virtualAgentId** | **String**| Virtual Agent ID | 
| **body** | [**UpdateAgenticVirtualAgent**](UpdateAgenticVirtualAgent)|  | 
{: class="table-striped"}


### Return type

[**AgenticVirtualAgent**](AgenticVirtualAgent)


# **postAgenticVirtualagentVersionJobs**


> [AgenticVirtualAgentVersionPublishJob](AgenticVirtualAgentVersionPublishJob) postAgenticVirtualagentVersionJobs(virtualAgentId, versionId, body)

Start the publishing of a virtual agent version.

Wraps POST /api/v2/agentic/virtualagents/{virtualAgentId}/versions/{versionId}/jobs  

Requires ALL permissions: 

* agentic:virtualAgentVersionJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VirtualAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VirtualAgentsApi apiInstance = new VirtualAgentsApi();
String virtualAgentId = "virtualAgentId_example"; // String | Virtual Agent ID
String versionId = "versionId_example"; // String | Version ID
AgenticVirtualAgentVersionPublishJobRequest body = new AgenticVirtualAgentVersionPublishJobRequest(); // AgenticVirtualAgentVersionPublishJobRequest | 
try {
    AgenticVirtualAgentVersionPublishJob result = apiInstance.postAgenticVirtualagentVersionJobs(virtualAgentId, versionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAgentsApi#postAgenticVirtualagentVersionJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **virtualAgentId** | **String**| Virtual Agent ID | 
| **versionId** | **String**| Version ID | 
| **body** | [**AgenticVirtualAgentVersionPublishJobRequest**](AgenticVirtualAgentVersionPublishJobRequest)|  | 
{: class="table-striped"}


### Return type

[**AgenticVirtualAgentVersionPublishJob**](AgenticVirtualAgentVersionPublishJob)


# **postAgenticVirtualagents**


> [AgenticVirtualAgent](AgenticVirtualAgent) postAgenticVirtualagents(body)

Create a virtual agent.

Wraps POST /api/v2/agentic/virtualagents  

Requires ALL permissions: 

* agentic:virtualAgent:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.VirtualAgentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

VirtualAgentsApi apiInstance = new VirtualAgentsApi();
CreateAgenticVirtualAgent body = new CreateAgenticVirtualAgent(); // CreateAgenticVirtualAgent | 
try {
    AgenticVirtualAgent result = apiInstance.postAgenticVirtualagents(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualAgentsApi#postAgenticVirtualagents");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateAgenticVirtualAgent**](CreateAgenticVirtualAgent)|  | 
{: class="table-striped"}


### Return type

[**AgenticVirtualAgent**](AgenticVirtualAgent)


_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
