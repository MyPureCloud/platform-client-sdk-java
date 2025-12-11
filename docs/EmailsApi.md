# EmailsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteEmailsSettingsThreading**](EmailsApi#deleteEmailsSettingsThreading) | Reset email threading settings to default |
| [**getEmailsSettings**](EmailsApi#getEmailsSettings) | Get email Contact Center settings |
| [**getEmailsSettingsThreading**](EmailsApi#getEmailsSettingsThreading) | Get email threading settings |
| [**patchEmailsSettings**](EmailsApi#patchEmailsSettings) | Patch email Contact Center settings |
| [**patchEmailsSettingsThreading**](EmailsApi#patchEmailsSettingsThreading) | Patch email threading settings |
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
import com.mypurecloud.sdk.v2.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmailsApi apiInstance = new EmailsApi();
try {
    apiInstance.deleteEmailsSettingsThreading();
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#deleteEmailsSettingsThreading");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



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
import com.mypurecloud.sdk.v2.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmailsApi apiInstance = new EmailsApi();
try {
    EmailSettings result = apiInstance.getEmailsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getEmailsSettings");
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
import com.mypurecloud.sdk.v2.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmailsApi apiInstance = new EmailsApi();
try {
    EmailThreadingSettings result = apiInstance.getEmailsSettingsThreading();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getEmailsSettingsThreading");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EmailThreadingSettings**](EmailThreadingSettings)


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
import com.mypurecloud.sdk.v2.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmailsApi apiInstance = new EmailsApi();
EmailSettings body = new EmailSettings(); // EmailSettings | 
try {
    EmailSettings result = apiInstance.patchEmailsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#patchEmailsSettings");
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
import com.mypurecloud.sdk.v2.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

EmailsApi apiInstance = new EmailsApi();
EmailThreadingSettings body = new EmailThreadingSettings(); // EmailThreadingSettings | 
try {
    EmailThreadingSettings result = apiInstance.patchEmailsSettingsThreading(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#patchEmailsSettingsThreading");
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


_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
