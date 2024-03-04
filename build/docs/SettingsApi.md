---
title: SettingsApi
---
## SettingsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getEmailsSettings**](SettingsApi.html#getEmailsSettings) | Get email Contact Center settings |
| [**getSettingsExecutiondata**](SettingsApi.html#getSettingsExecutiondata) | Get the execution history enabled setting. |
| [**patchEmailsSettings**](SettingsApi.html#patchEmailsSettings) | Patch email Contact Center settings |
| [**patchSettingsExecutiondata**](SettingsApi.html#patchSettingsExecutiondata) | Edit the execution history on off setting. |
{: class="table-striped"}

<a name="getEmailsSettings"></a>

# **getEmailsSettings**



> [EmailSettings](EmailSettings.html) getEmailsSettings()

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

[**EmailSettings**](EmailSettings.html)

<a name="getSettingsExecutiondata"></a>

# **getSettingsExecutiondata**



> [ExecutionDataGlobalSettingsResponse](ExecutionDataGlobalSettingsResponse.html) getSettingsExecutiondata()

Get the execution history enabled setting.

Get the execution history enabled setting.

getSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice

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

[**ExecutionDataGlobalSettingsResponse**](ExecutionDataGlobalSettingsResponse.html)

<a name="patchEmailsSettings"></a>

# **patchEmailsSettings**



> [EmailSettings](EmailSettings.html) patchEmailsSettings(body)

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
| **body** | [**EmailSettings**](EmailSettings.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**EmailSettings**](EmailSettings.html)

<a name="patchSettingsExecutiondata"></a>

# **patchSettingsExecutiondata**



> [ExecutionDataGlobalSettingsResponse](ExecutionDataGlobalSettingsResponse.html) patchSettingsExecutiondata(body)

Edit the execution history on off setting.

Edit the execution history on off setting.

patchSettingsExecutiondata is a preview method and is subject to both breaking and non-breaking changes at any time without notice

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
| **body** | [**ExecutionDataSettingsRequest**](ExecutionDataSettingsRequest.html)| New Execution Data Setting | 
{: class="table-striped"}


### Return type

[**ExecutionDataGlobalSettingsResponse**](ExecutionDataGlobalSettingsResponse.html)

