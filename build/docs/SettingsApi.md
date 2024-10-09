# SettingsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#deleteUsersAgentuiAgentsAutoanswerAgentIdSettings) | Delete agent auto answer settings |
| [**getEmailsSettings**](SettingsApi#getEmailsSettings) | Get email Contact Center settings |
| [**getSettingsExecutiondata**](SettingsApi#getSettingsExecutiondata) | Get the execution history enabled setting. |
| [**getUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#getUsersAgentuiAgentsAutoanswerAgentIdSettings) | Get agent auto answer settings |
| [**patchEmailsSettings**](SettingsApi#patchEmailsSettings) | Patch email Contact Center settings |
| [**patchSettingsExecutiondata**](SettingsApi#patchSettingsExecutiondata) | Edit the execution history on off setting. |
| [**patchUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#patchUsersAgentuiAgentsAutoanswerAgentIdSettings) | Update agent auto answer settings |
| [**putUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#putUsersAgentuiAgentsAutoanswerAgentIdSettings) | Set agent auto answer settings |
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
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
try {
    apiInstance.deleteUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#deleteUsersAgentuiAgentsAutoanswerAgentIdSettings");
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


# **getEmailsSettings**


> [EmailSettings](EmailSettings) getEmailsSettings()

Get email Contact Center settings

Wraps GET /api/v2/emails/settings  

Requires ANY permissions: 

* conversation:settings:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
try {
    EmailSettings result = apiInstance.getEmailsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getEmailsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EmailSettings**](EmailSettings)


# **getSettingsExecutiondata**


> [ExecutionDataGlobalSettingsResponse](ExecutionDataGlobalSettingsResponse) getSettingsExecutiondata()

Get the execution history enabled setting.

Get the execution history enabled setting.

Wraps GET /api/v2/settings/executiondata  

Requires ANY permissions: 

* settings:executiondata:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
try {
    ExecutionDataGlobalSettingsResponse result = apiInstance.getSettingsExecutiondata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getSettingsExecutiondata");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ExecutionDataGlobalSettingsResponse**](ExecutionDataGlobalSettingsResponse)


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
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
try {
    AutoAnswerSettings result = apiInstance.getUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getUsersAgentuiAgentsAutoanswerAgentIdSettings");
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


# **patchEmailsSettings**


> [EmailSettings](EmailSettings) patchEmailsSettings(body)

Patch email Contact Center settings

Wraps PATCH /api/v2/emails/settings  

Requires ANY permissions: 

* conversation:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
EmailSettings body = new EmailSettings(); // EmailSettings | 
try {
    EmailSettings result = apiInstance.patchEmailsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#patchEmailsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EmailSettings**](EmailSettings)|  | [optional] 
{: class="table-striped"}


### Return type

[**EmailSettings**](EmailSettings)


# **patchSettingsExecutiondata**


> [ExecutionDataGlobalSettingsResponse](ExecutionDataGlobalSettingsResponse) patchSettingsExecutiondata(body)

Edit the execution history on off setting.

Edit the execution history on off setting.

Wraps PATCH /api/v2/settings/executiondata  

Requires ANY permissions: 

* settings:executiondata:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
ExecutionDataSettingsRequest body = new ExecutionDataSettingsRequest(); // ExecutionDataSettingsRequest | New Execution Data Setting
try {
    ExecutionDataGlobalSettingsResponse result = apiInstance.patchSettingsExecutiondata(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#patchSettingsExecutiondata");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExecutionDataSettingsRequest**](ExecutionDataSettingsRequest)| New Execution Data Setting | 
{: class="table-striped"}


### Return type

[**ExecutionDataGlobalSettingsResponse**](ExecutionDataGlobalSettingsResponse)


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
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
AutoAnswerSettings body = new AutoAnswerSettings(); // AutoAnswerSettings | AutoAnswerSettings
try {
    AutoAnswerSettings result = apiInstance.patchUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#patchUsersAgentuiAgentsAutoanswerAgentIdSettings");
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
import com.mypurecloud.sdk.v2.api.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

SettingsApi apiInstance = new SettingsApi();
String agentId = "agentId_example"; // String | The agent to apply the auto answer settings to
AutoAnswerSettings body = new AutoAnswerSettings(); // AutoAnswerSettings | AutoAnswerSettings
try {
    AutoAnswerSettings result = apiInstance.putUsersAgentuiAgentsAutoanswerAgentIdSettings(agentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#putUsersAgentuiAgentsAutoanswerAgentIdSettings");
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


_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
