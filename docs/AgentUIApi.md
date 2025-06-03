# AgentUIApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteUsersAgentuiAgentsAutoanswerAgentIdSettings**](AgentUIApi#deleteUsersAgentuiAgentsAutoanswerAgentIdSettings) | Delete agent auto answer settings |
| [**getUsersAgentuiAgentsAutoanswerAgentIdSettings**](AgentUIApi#getUsersAgentuiAgentsAutoanswerAgentIdSettings) | Get agent auto answer settings |
| [**patchUsersAgentuiAgentsAutoanswerAgentIdSettings**](AgentUIApi#patchUsersAgentuiAgentsAutoanswerAgentIdSettings) | Update agent auto answer settings |
| [**putUsersAgentuiAgentsAutoanswerAgentIdSettings**](AgentUIApi#putUsersAgentuiAgentsAutoanswerAgentIdSettings) | Set agent auto answer settings |
{: class="table-striped"}


# **deleteUsersAgentuiAgentsAutoanswerAgentIdSettings**


> Void deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId)

Delete agent auto answer settings

Wraps DELETE /api/v2/users/agentui/agents/autoanswer/{agentId}/settings  

Requires ANY permissions: 

* agentUI:agents:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentUIApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentUIApi apiInstance = new AgentUIApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
try {
    apiInstance.deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentUIApi#deleteUsersAgentuiAgentsAutoanswerAgentIdSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| The agent to apply the auto answer settings to | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getUsersAgentuiAgentsAutoanswerAgentIdSettings**


> [AutoAnswerSettings](AutoAnswerSettings) getUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId)

Get agent auto answer settings

Wraps GET /api/v2/users/agentui/agents/autoanswer/{agentId}/settings  

Requires ANY permissions: 

* agentUI:agents:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentUIApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentUIApi apiInstance = new AgentUIApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
try {
    AutoAnswerSettings result = apiInstance.getUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentUIApi#getUsersAgentuiAgentsAutoanswerAgentIdSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| The agent to apply the auto answer settings to | 
{: class="table-striped"}


### Return type

[**AutoAnswerSettings**](AutoAnswerSettings)


# **patchUsersAgentuiAgentsAutoanswerAgentIdSettings**


> [AutoAnswerSettings](AutoAnswerSettings) patchUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId, body)

Update agent auto answer settings

Wraps PATCH /api/v2/users/agentui/agents/autoanswer/{agentId}/settings  

Requires ANY permissions: 

* agentUI:agents:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentUIApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentUIApi apiInstance = new AgentUIApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
AutoAnswerSettings body = new AutoAnswerSettings(); // AutoAnswerSettings | AutoAnswerSettings
try {
    AutoAnswerSettings result = apiInstance.patchUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentUIApi#patchUsersAgentuiAgentsAutoanswerAgentIdSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| The agent to apply the auto answer settings to | 
| **body** | [**AutoAnswerSettings**](AutoAnswerSettings)| AutoAnswerSettings | 
{: class="table-striped"}


### Return type

[**AutoAnswerSettings**](AutoAnswerSettings)


# **putUsersAgentuiAgentsAutoanswerAgentIdSettings**


> [AutoAnswerSettings](AutoAnswerSettings) putUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId, body)

Set agent auto answer settings

Wraps PUT /api/v2/users/agentui/agents/autoanswer/{agentId}/settings  

Requires ANY permissions: 

* agentUI:agents:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.AgentUIApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

AgentUIApi apiInstance = new AgentUIApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
AutoAnswerSettings body = new AutoAnswerSettings(); // AutoAnswerSettings | AutoAnswerSettings
try {
    AutoAnswerSettings result = apiInstance.putUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentUIApi#putUsersAgentuiAgentsAutoanswerAgentIdSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **String**| The agent to apply the auto answer settings to | 
| **body** | [**AutoAnswerSettings**](AutoAnswerSettings)| AutoAnswerSettings | 
{: class="table-striped"}


### Return type

[**AutoAnswerSettings**](AutoAnswerSettings)


_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
