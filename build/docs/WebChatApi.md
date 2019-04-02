---
title: WebChatApi
---
## WebChatApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteWebchatDeployment**](WebChatApi.html#deleteWebchatDeployment) | Delete a WebChat deployment |
| [**deleteWebchatSettings**](WebChatApi.html#deleteWebchatSettings) | Remove WebChat deployment settings |
| [**getWebchatDeployment**](WebChatApi.html#getWebchatDeployment) | Get a WebChat deployment |
| [**getWebchatDeployments**](WebChatApi.html#getWebchatDeployments) | List WebChat deployments |
| [**getWebchatSettings**](WebChatApi.html#getWebchatSettings) | Get WebChat deployment settings |
| [**postWebchatDeployments**](WebChatApi.html#postWebchatDeployments) | Create WebChat deployment |
| [**putWebchatDeployment**](WebChatApi.html#putWebchatDeployment) | Update a WebChat deployment |
| [**putWebchatSettings**](WebChatApi.html#putWebchatSettings) | Update WebChat deployment settings |
{: class="table-striped"}

<a name="deleteWebchatDeployment"></a>

# **deleteWebchatDeployment**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> Void deleteWebchatDeployment(deploymentId)

Delete a WebChat deployment



Wraps DELETE /api/v2/webchat/deployments/{deploymentId}  

Requires ANY permissions: 

* webchat:deployment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
String deploymentId = "deploymentId_example"; // String | Deployment Id
try {
    apiInstance.deleteWebchatDeployment(deploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#deleteWebchatDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| Deployment Id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteWebchatSettings"></a>

# **deleteWebchatSettings**



> Void deleteWebchatSettings()

Remove WebChat deployment settings



Wraps DELETE /api/v2/webchat/settings  

Requires ANY permissions: 

* webchat:deployment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
try {
    apiInstance.deleteWebchatSettings();
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#deleteWebchatSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="getWebchatDeployment"></a>

# **getWebchatDeployment**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeployment](WebChatDeployment.html) getWebchatDeployment(deploymentId)

Get a WebChat deployment



Wraps GET /api/v2/webchat/deployments/{deploymentId}  

Requires ANY permissions: 

* webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
String deploymentId = "deploymentId_example"; // String | Deployment Id
try {
    WebChatDeployment result = apiInstance.getWebchatDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| Deployment Id | 
{: class="table-striped"}


### Return type

[**WebChatDeployment**](WebChatDeployment.html)

<a name="getWebchatDeployments"></a>

# **getWebchatDeployments**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeploymentEntityListing](WebChatDeploymentEntityListing.html) getWebchatDeployments()

List WebChat deployments



Wraps GET /api/v2/webchat/deployments  

Requires ANY permissions: 

* webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
try {
    WebChatDeploymentEntityListing result = apiInstance.getWebchatDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatDeployments");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**WebChatDeploymentEntityListing**](WebChatDeploymentEntityListing.html)

<a name="getWebchatSettings"></a>

# **getWebchatSettings**



> [WebChatSettings](WebChatSettings.html) getWebchatSettings()

Get WebChat deployment settings



Wraps GET /api/v2/webchat/settings  

Requires ANY permissions: 

* webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
try {
    WebChatSettings result = apiInstance.getWebchatSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#getWebchatSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**WebChatSettings**](WebChatSettings.html)

<a name="postWebchatDeployments"></a>

# **postWebchatDeployments**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeployment](WebChatDeployment.html) postWebchatDeployments(body)

Create WebChat deployment



Wraps POST /api/v2/webchat/deployments  

Requires ANY permissions: 

* webchat:deployment:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
WebChatDeployment body = new WebChatDeployment(); // WebChatDeployment | Deployment
try {
    WebChatDeployment result = apiInstance.postWebchatDeployments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#postWebchatDeployments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WebChatDeployment**](WebChatDeployment.html)| Deployment | 
{: class="table-striped"}


### Return type

[**WebChatDeployment**](WebChatDeployment.html)

<a name="putWebchatDeployment"></a>

# **putWebchatDeployment**

<span style="background-color: #f0ad4e;display: inline-block;padding: 7px;font-weight: bold;line-height: 1;color: #ffffff;text-align: center;white-space: nowrap;vertical-align: baseline;border-radius: .25em;margin: 10px 0;">DEPRECATED</span>

> [WebChatDeployment](WebChatDeployment.html) putWebchatDeployment(deploymentId, body)

Update a WebChat deployment



Wraps PUT /api/v2/webchat/deployments/{deploymentId}  

Requires ANY permissions: 

* webchat:deployment:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
String deploymentId = "deploymentId_example"; // String | Deployment Id
WebChatDeployment body = new WebChatDeployment(); // WebChatDeployment | Deployment
try {
    WebChatDeployment result = apiInstance.putWebchatDeployment(deploymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#putWebchatDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| Deployment Id | 
| **body** | [**WebChatDeployment**](WebChatDeployment.html)| Deployment | 
{: class="table-striped"}


### Return type

[**WebChatDeployment**](WebChatDeployment.html)

<a name="putWebchatSettings"></a>

# **putWebchatSettings**



> [WebChatSettings](WebChatSettings.html) putWebchatSettings(body)

Update WebChat deployment settings



Wraps PUT /api/v2/webchat/settings  

Requires ANY permissions: 

* webchat:deployment:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebChatApi apiInstance = new WebChatApi();
WebChatSettings body = new WebChatSettings(); // WebChatSettings | webChatSettings
try {
    WebChatSettings result = apiInstance.putWebchatSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebChatApi#putWebchatSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WebChatSettings**](WebChatSettings.html)| webChatSettings | 
{: class="table-striped"}


### Return type

[**WebChatSettings**](WebChatSettings.html)

