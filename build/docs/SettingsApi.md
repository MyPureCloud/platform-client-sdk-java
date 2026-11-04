# SettingsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteEmailsSettingsThreading**](SettingsApi#deleteEmailsSettingsThreading) | Reset email threading settings to default |
| [**deleteExternalcontactsSettings**](SettingsApi#deleteExternalcontactsSettings) | Delete settings |
| [**deleteUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#deleteUsersAgentuiAgentsAutoanswerAgentIdSettings) | Delete agent auto answer settings |
| [**getEmailsSettings**](SettingsApi#getEmailsSettings) | Get email Contact Center settings |
| [**getEmailsSettingsThreading**](SettingsApi#getEmailsSettingsThreading) | Get email threading settings |
| [**getExternalcontactsSettings**](SettingsApi#getExternalcontactsSettings) | Get settings |
| [**getSearchSettings**](SettingsApi#getSearchSettings) | Get the organization's search settings |
| [**getSettingsExecutiondata**](SettingsApi#getSettingsExecutiondata) | Get the execution history enabled setting. |
| [**getUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#getUsersAgentuiAgentsAutoanswerAgentIdSettings) | Get agent auto answer settings |
| [**patchEmailsSettings**](SettingsApi#patchEmailsSettings) | Patch email Contact Center settings |
| [**patchEmailsSettingsThreading**](SettingsApi#patchEmailsSettingsThreading) | Patch email threading settings |
| [**patchSearchSettings**](SettingsApi#patchSearchSettings) | Patch the organization's search settings |
| [**patchSearchSettingsContentsearch**](SettingsApi#patchSearchSettingsContentsearch) | Patch the organization's content search settings |
| [**patchSettingsExecutiondata**](SettingsApi#patchSettingsExecutiondata) | Edit the execution history on off setting. |
| [**patchUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#patchUsersAgentuiAgentsAutoanswerAgentIdSettings) | Update agent auto answer settings |
| [**putExternalcontactsSettings**](SettingsApi#putExternalcontactsSettings) | Set settings |
| [**putUsersAgentuiAgentsAutoanswerAgentIdSettings**](SettingsApi#putUsersAgentuiAgentsAutoanswerAgentIdSettings) | Set agent auto answer settings |
{: class="table-striped"}


# **deleteEmailsSettingsThreading**


> Void deleteEmailsSettingsThreading()

Reset email threading settings to default

Wraps DELETE /api/v2/emails/settings/threading  

Requires ANY permissions: 

* conversation:emailThreadingSettings:edit

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
    apiInstance.deleteEmailsSettingsThreading();
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#deleteEmailsSettingsThreading");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)


# **deleteExternalcontactsSettings**


> [UpdatedSettingsResponse](UpdatedSettingsResponse) deleteExternalcontactsSettings()

Delete settings

Wraps DELETE /api/v2/externalcontacts/settings  

Requires ANY permissions: 

* externalContacts:settings:delete

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
    UpdatedSettingsResponse result = apiInstance.deleteExternalcontactsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#deleteExternalcontactsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**UpdatedSettingsResponse**](UpdatedSettingsResponse)


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


# **getEmailsSettingsThreading**


> [EmailThreadingSettings](EmailThreadingSettings) getEmailsSettingsThreading()

Get email threading settings

Wraps GET /api/v2/emails/settings/threading  

Requires ANY permissions: 

* conversation:emailThreadingSettings:view

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
    EmailThreadingSettings result = apiInstance.getEmailsSettingsThreading();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getEmailsSettingsThreading");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EmailThreadingSettings**](EmailThreadingSettings)


# **getExternalcontactsSettings**


> [ExternalContactsSettings](ExternalContactsSettings) getExternalcontactsSettings()

Get settings

Wraps GET /api/v2/externalcontacts/settings  

Requires ANY permissions: 

* externalContacts:settings:view

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
    ExternalContactsSettings result = apiInstance.getExternalcontactsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getExternalcontactsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ExternalContactsSettings**](ExternalContactsSettings)


# **getSearchSettings**


> [OrgSettings](OrgSettings) getSearchSettings()

Get the organization's search settings

getSearchSettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps GET /api/v2/search/settings  

Requires ANY permissions: 

* directory:organization:admin
* analytics:transcriptsearchsetting:view

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
    OrgSettings result = apiInstance.getSearchSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#getSearchSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OrgSettings**](OrgSettings)


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


# **patchEmailsSettingsThreading**


> [EmailThreadingSettings](EmailThreadingSettings) patchEmailsSettingsThreading(body)

Patch email threading settings

Wraps PATCH /api/v2/emails/settings/threading  

Requires ANY permissions: 

* conversation:emailThreadingSettings:edit

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
EmailThreadingSettings body = new EmailThreadingSettings(); // EmailThreadingSettings | 
try {
    EmailThreadingSettings result = apiInstance.patchEmailsSettingsThreading(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#patchEmailsSettingsThreading");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**EmailThreadingSettings**](EmailThreadingSettings)|  | [optional] 
{: class="table-striped"}


### Return type

[**EmailThreadingSettings**](EmailThreadingSettings)


# **patchSearchSettings**


> [OrgSettings](OrgSettings) patchSearchSettings(body)

Patch the organization's search settings

patchSearchSettings is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/search/settings  

Requires ANY permissions: 

* directory:organization:admin

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
OrgSettings body = new OrgSettings(); // OrgSettings | Search Settings
try {
    OrgSettings result = apiInstance.patchSearchSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#patchSearchSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OrgSettings**](OrgSettings)| Search Settings | 
{: class="table-striped"}


### Return type

[**OrgSettings**](OrgSettings)


# **patchSearchSettingsContentsearch**


> [ContentSearchSetting](ContentSearchSetting) patchSearchSettingsContentsearch(body)

Patch the organization's content search settings

patchSearchSettingsContentsearch is a preview method and is subject to both breaking and non-breaking changes at any time without notice

Wraps PATCH /api/v2/search/settings/contentsearch  

Requires ANY permissions: 

* analytics:transcriptsearchsetting:edit

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
ContentSearchSetting body = new ContentSearchSetting(); // ContentSearchSetting | Content search setting
try {
    ContentSearchSetting result = apiInstance.patchSearchSettingsContentsearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#patchSearchSettingsContentsearch");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ContentSearchSetting**](ContentSearchSetting)| Content search setting | 
{: class="table-striped"}


### Return type

[**ContentSearchSetting**](ContentSearchSetting)


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


# **putExternalcontactsSettings**


> [UpdatedSettingsResponse](UpdatedSettingsResponse) putExternalcontactsSettings(body)

Set settings

Wraps PUT /api/v2/externalcontacts/settings  

Requires ANY permissions: 

* externalContacts:settings:edit

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
ExternalContactsSettings body = new ExternalContactsSettings(); // ExternalContactsSettings | 
try {
    UpdatedSettingsResponse result = apiInstance.putExternalcontactsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#putExternalcontactsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ExternalContactsSettings**](ExternalContactsSettings)|  | [optional] 
{: class="table-striped"}


### Return type

[**UpdatedSettingsResponse**](UpdatedSettingsResponse)


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


_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
