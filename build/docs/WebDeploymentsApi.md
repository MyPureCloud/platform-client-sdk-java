---
title: WebDeploymentsApi
---
## WebDeploymentsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteWebdeploymentsConfiguration**](WebDeploymentsApi.html#deleteWebdeploymentsConfiguration) | Delete all versions of a configuration |
| [**deleteWebdeploymentsDeployment**](WebDeploymentsApi.html#deleteWebdeploymentsDeployment) | Delete a deployment |
| [**getWebdeploymentsConfigurationVersion**](WebDeploymentsApi.html#getWebdeploymentsConfigurationVersion) | Get a configuration version |
| [**getWebdeploymentsConfigurationVersions**](WebDeploymentsApi.html#getWebdeploymentsConfigurationVersions) | Get the versions of a configuration |
| [**getWebdeploymentsConfigurationVersionsDraft**](WebDeploymentsApi.html#getWebdeploymentsConfigurationVersionsDraft) | Get the configuration draft |
| [**getWebdeploymentsConfigurations**](WebDeploymentsApi.html#getWebdeploymentsConfigurations) | View configuration drafts |
| [**getWebdeploymentsDeployment**](WebDeploymentsApi.html#getWebdeploymentsDeployment) | Get a deployment |
| [**getWebdeploymentsDeploymentConfigurations**](WebDeploymentsApi.html#getWebdeploymentsDeploymentConfigurations) | Get active configuration for a given deployment |
| [**getWebdeploymentsDeployments**](WebDeploymentsApi.html#getWebdeploymentsDeployments) | Get deployments |
| [**postWebdeploymentsConfigurationVersionsDraftPublish**](WebDeploymentsApi.html#postWebdeploymentsConfigurationVersionsDraftPublish) | Publish the configuration draft and create a new version |
| [**postWebdeploymentsConfigurations**](WebDeploymentsApi.html#postWebdeploymentsConfigurations) | Create a configuration draft |
| [**postWebdeploymentsDeployments**](WebDeploymentsApi.html#postWebdeploymentsDeployments) | Create a deployment |
| [**putWebdeploymentsConfigurationVersionsDraft**](WebDeploymentsApi.html#putWebdeploymentsConfigurationVersionsDraft) | Update the configuration draft |
| [**putWebdeploymentsDeployment**](WebDeploymentsApi.html#putWebdeploymentsDeployment) | Update a deployment |
{: class="table-striped"}

<a name="deleteWebdeploymentsConfiguration"></a>

# **deleteWebdeploymentsConfiguration**



> Void deleteWebdeploymentsConfiguration(configurationId)

Delete all versions of a configuration

Wraps DELETE /api/v2/webdeployments/configurations/{configurationId}  

Requires ALL permissions: 

* webDeployments:configuration:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    apiInstance.deleteWebdeploymentsConfiguration(configurationId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#deleteWebdeploymentsConfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationId** | **String**| The configuration version ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteWebdeploymentsDeployment"></a>

# **deleteWebdeploymentsDeployment**



> Void deleteWebdeploymentsDeployment(deploymentId)

Delete a deployment

Wraps DELETE /api/v2/webdeployments/deployments/{deploymentId}  

Requires ALL permissions: 

* webDeployments:deployment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | The deployment ID
try {
    apiInstance.deleteWebdeploymentsDeployment(deploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#deleteWebdeploymentsDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The deployment ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getWebdeploymentsConfigurationVersion"></a>

# **getWebdeploymentsConfigurationVersion**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.html) getWebdeploymentsConfigurationVersion(configurationId, versionId)

Get a configuration version

Wraps GET /api/v2/webdeployments/configurations/{configurationId}/versions/{versionId}  

Requires ALL permissions: 

* webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
String versionId = "versionId_example"; // String | The version of the configuration to get
try {
    WebDeploymentConfigurationVersion result = apiInstance.getWebdeploymentsConfigurationVersion(configurationId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurationVersion");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationId** | **String**| The configuration version ID | 
| **versionId** | **String**| The version of the configuration to get | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.html)

<a name="getWebdeploymentsConfigurationVersions"></a>

# **getWebdeploymentsConfigurationVersions**



> [WebDeploymentConfigurationVersionEntityListing](WebDeploymentConfigurationVersionEntityListing.html) getWebdeploymentsConfigurationVersions(configurationId)

Get the versions of a configuration

This returns the 50 most recent versions for this configuration

Wraps GET /api/v2/webdeployments/configurations/{configurationId}/versions  

Requires ALL permissions: 

* webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    WebDeploymentConfigurationVersionEntityListing result = apiInstance.getWebdeploymentsConfigurationVersions(configurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurationVersions");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationId** | **String**| The configuration version ID | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersionEntityListing**](WebDeploymentConfigurationVersionEntityListing.html)

<a name="getWebdeploymentsConfigurationVersionsDraft"></a>

# **getWebdeploymentsConfigurationVersionsDraft**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.html) getWebdeploymentsConfigurationVersionsDraft(configurationId)

Get the configuration draft

Wraps GET /api/v2/webdeployments/configurations/{configurationId}/versions/draft  

Requires ALL permissions: 

* webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    WebDeploymentConfigurationVersion result = apiInstance.getWebdeploymentsConfigurationVersionsDraft(configurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurationVersionsDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationId** | **String**| The configuration version ID | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.html)

<a name="getWebdeploymentsConfigurations"></a>

# **getWebdeploymentsConfigurations**



> [WebDeploymentConfigurationVersionEntityListing](WebDeploymentConfigurationVersionEntityListing.html) getWebdeploymentsConfigurations(showOnlyPublished)

View configuration drafts

Wraps GET /api/v2/webdeployments/configurations  

Requires ALL permissions: 

* webDeployments:configuration:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
Boolean showOnlyPublished = false; // Boolean | Get only configuration drafts with published versions
try {
    WebDeploymentConfigurationVersionEntityListing result = apiInstance.getWebdeploymentsConfigurations(showOnlyPublished);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsConfigurations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **showOnlyPublished** | **Boolean**| Get only configuration drafts with published versions | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersionEntityListing**](WebDeploymentConfigurationVersionEntityListing.html)

<a name="getWebdeploymentsDeployment"></a>

# **getWebdeploymentsDeployment**



> [WebDeployment](WebDeployment.html) getWebdeploymentsDeployment(deploymentId)

Get a deployment

Wraps GET /api/v2/webdeployments/deployments/{deploymentId}  

Requires ALL permissions: 

* webDeployments:deployment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | The deployment ID
try {
    WebDeployment result = apiInstance.getWebdeploymentsDeployment(deploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The deployment ID | 
{: class="table-striped"}


### Return type

[**WebDeployment**](WebDeployment.html)

<a name="getWebdeploymentsDeploymentConfigurations"></a>

# **getWebdeploymentsDeploymentConfigurations**



> [WebDeploymentActiveConfigurationOnDeployment](WebDeploymentActiveConfigurationOnDeployment.html) getWebdeploymentsDeploymentConfigurations(deploymentId, type)

Get active configuration for a given deployment

Wraps GET /api/v2/webdeployments/deployments/{deploymentId}/configurations  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | The deployment ID
String type = "type_example"; // String | Get active configuration on a deployment
try {
    WebDeploymentActiveConfigurationOnDeployment result = apiInstance.getWebdeploymentsDeploymentConfigurations(deploymentId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsDeploymentConfigurations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The deployment ID | 
| **type** | **String**| Get active configuration on a deployment | [optional] 
{: class="table-striped"}


### Return type

[**WebDeploymentActiveConfigurationOnDeployment**](WebDeploymentActiveConfigurationOnDeployment.html)

<a name="getWebdeploymentsDeployments"></a>

# **getWebdeploymentsDeployments**



> [WebDeploymentEntityListing](WebDeploymentEntityListing.html) getWebdeploymentsDeployments()

Get deployments

Wraps GET /api/v2/webdeployments/deployments  

Requires ALL permissions: 

* webDeployments:deployment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
try {
    WebDeploymentEntityListing result = apiInstance.getWebdeploymentsDeployments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsDeployments");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**WebDeploymentEntityListing**](WebDeploymentEntityListing.html)

<a name="postWebdeploymentsConfigurationVersionsDraftPublish"></a>

# **postWebdeploymentsConfigurationVersionsDraftPublish**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.html) postWebdeploymentsConfigurationVersionsDraftPublish(configurationId)

Publish the configuration draft and create a new version

Wraps POST /api/v2/webdeployments/configurations/{configurationId}/versions/draft/publish  

Requires ALL permissions: 

* webDeployments:configuration:edit
* webDeployments:configuration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
try {
    WebDeploymentConfigurationVersion result = apiInstance.postWebdeploymentsConfigurationVersionsDraftPublish(configurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsConfigurationVersionsDraftPublish");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationId** | **String**| The configuration version ID | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.html)

<a name="postWebdeploymentsConfigurations"></a>

# **postWebdeploymentsConfigurations**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.html) postWebdeploymentsConfigurations(configurationVersion)

Create a configuration draft

Wraps POST /api/v2/webdeployments/configurations  

Requires ALL permissions: 

* webDeployments:configuration:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
WebDeploymentConfigurationVersion configurationVersion = new WebDeploymentConfigurationVersion(); // WebDeploymentConfigurationVersion | 
try {
    WebDeploymentConfigurationVersion result = apiInstance.postWebdeploymentsConfigurations(configurationVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsConfigurations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationVersion** | [**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.html)|  | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.html)

<a name="postWebdeploymentsDeployments"></a>

# **postWebdeploymentsDeployments**



> [WebDeployment](WebDeployment.html) postWebdeploymentsDeployments(deployment)

Create a deployment

Wraps POST /api/v2/webdeployments/deployments  

Requires ALL permissions: 

* webDeployments:deployment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
WebDeployment deployment = new WebDeployment(); // WebDeployment | 
try {
    WebDeployment result = apiInstance.postWebdeploymentsDeployments(deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsDeployments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deployment** | [**WebDeployment**](WebDeployment.html)|  | 
{: class="table-striped"}


### Return type

[**WebDeployment**](WebDeployment.html)

<a name="putWebdeploymentsConfigurationVersionsDraft"></a>

# **putWebdeploymentsConfigurationVersionsDraft**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion.html) putWebdeploymentsConfigurationVersionsDraft(configurationId, configurationVersion)

Update the configuration draft

Wraps PUT /api/v2/webdeployments/configurations/{configurationId}/versions/draft  

Requires ALL permissions: 

* webDeployments:configuration:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String configurationId = "configurationId_example"; // String | The configuration version ID
WebDeploymentConfigurationVersion configurationVersion = new WebDeploymentConfigurationVersion(); // WebDeploymentConfigurationVersion | 
try {
    WebDeploymentConfigurationVersion result = apiInstance.putWebdeploymentsConfigurationVersionsDraft(configurationId, configurationVersion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#putWebdeploymentsConfigurationVersionsDraft");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configurationId** | **String**| The configuration version ID | 
| **configurationVersion** | [**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.html)|  | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion.html)

<a name="putWebdeploymentsDeployment"></a>

# **putWebdeploymentsDeployment**



> [WebDeployment](WebDeployment.html) putWebdeploymentsDeployment(deploymentId, deployment)

Update a deployment

Wraps PUT /api/v2/webdeployments/deployments/{deploymentId}  

Requires ALL permissions: 

* webDeployments:deployment:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | The deployment ID
WebDeployment deployment = new WebDeployment(); // WebDeployment | 
try {
    WebDeployment result = apiInstance.putWebdeploymentsDeployment(deploymentId, deployment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#putWebdeploymentsDeployment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| The deployment ID | 
| **deployment** | [**WebDeployment**](WebDeployment.html)|  | 
{: class="table-striped"}


### Return type

[**WebDeployment**](WebDeployment.html)

