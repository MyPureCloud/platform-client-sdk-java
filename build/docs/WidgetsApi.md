---
title: WidgetsApi
---
## WidgetsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteWidgetsDeployment**](WidgetsApi.html#deleteWidgetsDeployment) | Delete a Widget deployment |
| [**getWidgetsDeployment**](WidgetsApi.html#getWidgetsDeployment) | Get a Widget deployment |
| [**getWidgetsDeployments**](WidgetsApi.html#getWidgetsDeployments) | List Widget deployments |
| [**postWidgetsDeployments**](WidgetsApi.html#postWidgetsDeployments) | Create Widget deployment |
| [**putWidgetsDeployment**](WidgetsApi.html#putWidgetsDeployment) | Update a Widget deployment |
{: class="table-striped"}

<a name="deleteWidgetsDeployment"></a>

# **deleteWidgetsDeployment**



> Void deleteWidgetsDeployment(deploymentId)

Delete a Widget deployment

Wraps DELETE /api/v2/widgets/deployments/{deploymentId}  

Requires ANY permissions: 

* widgets:deployment:delete
* webchat:deployment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WidgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WidgetsApi apiInstance = new WidgetsApi();
String deploymentId = "deploymentId_example"; // String | Widget Config Id
try {
    apiInstance.deleteWidgetsDeployment(deploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#deleteWidgetsDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| Widget Config Id | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getWidgetsDeployment"></a>

# **getWidgetsDeployment**



> [WidgetDeployment](WidgetDeployment.html) getWidgetsDeployment(deploymentId)

Get a Widget deployment

Wraps GET /api/v2/widgets/deployments/{deploymentId}  

Requires ANY permissions: 

* widgets:deployment:view
* webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WidgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WidgetsApi apiInstance = new WidgetsApi();
String deploymentId = "deploymentId_example"; // String | Widget Config Id
try {
    WidgetDeployment result = apiInstance.getWidgetsDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetsDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| Widget Config Id | 
{: class="table-striped"}


### Return type

[**WidgetDeployment**](WidgetDeployment.html)

<a name="getWidgetsDeployments"></a>

# **getWidgetsDeployments**



> [WidgetDeploymentEntityListing](WidgetDeploymentEntityListing.html) getWidgetsDeployments()

List Widget deployments

Wraps GET /api/v2/widgets/deployments  

Requires ANY permissions: 

* widgets:deployment:view
* webchat:deployment:read

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WidgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WidgetsApi apiInstance = new WidgetsApi();
try {
    WidgetDeploymentEntityListing result = apiInstance.getWidgetsDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#getWidgetsDeployments");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**WidgetDeploymentEntityListing**](WidgetDeploymentEntityListing.html)

<a name="postWidgetsDeployments"></a>

# **postWidgetsDeployments**



> [WidgetDeployment](WidgetDeployment.html) postWidgetsDeployments(body)

Create Widget deployment

Wraps POST /api/v2/widgets/deployments  

Requires ANY permissions: 

* widgets:deployment:add
* webchat:deployment:create

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WidgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WidgetsApi apiInstance = new WidgetsApi();
WidgetDeployment body = new WidgetDeployment(); // WidgetDeployment | Deployment
try {
    WidgetDeployment result = apiInstance.postWidgetsDeployments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#postWidgetsDeployments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WidgetDeployment**](WidgetDeployment.html)| Deployment | 
{: class="table-striped"}


### Return type

[**WidgetDeployment**](WidgetDeployment.html)

<a name="putWidgetsDeployment"></a>

# **putWidgetsDeployment**



> [WidgetDeployment](WidgetDeployment.html) putWidgetsDeployment(deploymentId, body)

Update a Widget deployment

Wraps PUT /api/v2/widgets/deployments/{deploymentId}  

Requires ANY permissions: 

* widgets:deployment:edit
* webchat:deployment:update

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WidgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WidgetsApi apiInstance = new WidgetsApi();
String deploymentId = "deploymentId_example"; // String | Widget Config Id
WidgetDeployment body = new WidgetDeployment(); // WidgetDeployment | Deployment
try {
    WidgetDeployment result = apiInstance.putWidgetsDeployment(deploymentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WidgetsApi#putWidgetsDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| Widget Config Id | 
| **body** | [**WidgetDeployment**](WidgetDeployment.html)| Deployment | 
{: class="table-striped"}


### Return type

[**WidgetDeployment**](WidgetDeployment.html)

