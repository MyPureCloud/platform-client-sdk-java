# WebDeploymentsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteWebdeploymentsConfiguration**](WebDeploymentsApi#deleteWebdeploymentsConfiguration) | Delete all versions of a configuration |
| [**deleteWebdeploymentsDeployment**](WebDeploymentsApi#deleteWebdeploymentsDeployment) | Delete a deployment |
| [**deleteWebdeploymentsDeploymentCobrowseSessionId**](WebDeploymentsApi#deleteWebdeploymentsDeploymentCobrowseSessionId) | Deletes a cobrowse session |
| [**deleteWebdeploymentsTokenRevoke**](WebDeploymentsApi#deleteWebdeploymentsTokenRevoke) | Invalidate JWT |
| [**getWebdeploymentsConfigurationVersion**](WebDeploymentsApi#getWebdeploymentsConfigurationVersion) | Get a configuration version |
| [**getWebdeploymentsConfigurationVersions**](WebDeploymentsApi#getWebdeploymentsConfigurationVersions) | Get the versions of a configuration |
| [**getWebdeploymentsConfigurationVersionsDraft**](WebDeploymentsApi#getWebdeploymentsConfigurationVersionsDraft) | Get the configuration draft |
| [**getWebdeploymentsConfigurations**](WebDeploymentsApi#getWebdeploymentsConfigurations) | View configuration drafts |
| [**getWebdeploymentsDeployment**](WebDeploymentsApi#getWebdeploymentsDeployment) | Get a deployment |
| [**getWebdeploymentsDeploymentCobrowseSessionId**](WebDeploymentsApi#getWebdeploymentsDeploymentCobrowseSessionId) | Retrieves a cobrowse session |
| [**getWebdeploymentsDeploymentConfigurations**](WebDeploymentsApi#getWebdeploymentsDeploymentConfigurations) | Get active configuration for a given deployment |
| [**getWebdeploymentsDeployments**](WebDeploymentsApi#getWebdeploymentsDeployments) | Get deployments |
| [**postWebdeploymentsConfigurationVersionsDraftPublish**](WebDeploymentsApi#postWebdeploymentsConfigurationVersionsDraftPublish) | Publish the configuration draft and create a new version |
| [**postWebdeploymentsConfigurations**](WebDeploymentsApi#postWebdeploymentsConfigurations) | Create a configuration draft |
| [**postWebdeploymentsDeployments**](WebDeploymentsApi#postWebdeploymentsDeployments) | Create a deployment |
| [**postWebdeploymentsTokenOauthcodegrantjwtexchange**](WebDeploymentsApi#postWebdeploymentsTokenOauthcodegrantjwtexchange) | Exchange an oAuth code (obtained using the Authorization Code Flow) for a JWT that can be used by webdeployments. |
| [**postWebdeploymentsTokenRefresh**](WebDeploymentsApi#postWebdeploymentsTokenRefresh) | Refresh a JWT. |
| [**putWebdeploymentsConfigurationVersionsDraft**](WebDeploymentsApi#putWebdeploymentsConfigurationVersionsDraft) | Update the configuration draft |
| [**putWebdeploymentsDeployment**](WebDeploymentsApi#putWebdeploymentsDeployment) | Update a deployment |
{: class="table-striped"}


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


# **deleteWebdeploymentsDeploymentCobrowseSessionId**



> Empty deleteWebdeploymentsDeploymentCobrowseSessionId(deploymentId, sessionId)

Deletes a cobrowse session

Wraps DELETE /api/v2/webdeployments/deployments/{deploymentId}/cobrowse/{sessionId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;


WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | WebMessaging deployment ID
String sessionId = "sessionId_example"; // String | Cobrowse session id or join code
try {
    Empty result = apiInstance.deleteWebdeploymentsDeploymentCobrowseSessionId(deploymentId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#deleteWebdeploymentsDeploymentCobrowseSessionId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| WebMessaging deployment ID | 
| **sessionId** | **String**| Cobrowse session id or join code | 
{: class="table-striped"}


### Return type

**Empty**


# **deleteWebdeploymentsTokenRevoke**



> Void deleteWebdeploymentsTokenRevoke(xJourneySessionId, xJourneySessionType)

Invalidate JWT

Wraps DELETE /api/v2/webdeployments/token/revoke  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;


WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String xJourneySessionId = "xJourneySessionId_example"; // String | The Customer's journey sessionId.
String xJourneySessionType = "xJourneySessionType_example"; // String | The Customer's journey session type.
try {
    apiInstance.deleteWebdeploymentsTokenRevoke(xJourneySessionId, xJourneySessionType);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#deleteWebdeploymentsTokenRevoke");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xJourneySessionId** | **String**| The Customer&#39;s journey sessionId. | [optional] 
| **xJourneySessionType** | **String**| The Customer&#39;s journey session type. | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


# **getWebdeploymentsConfigurationVersion**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion) getWebdeploymentsConfigurationVersion(configurationId, versionId)

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

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion)


# **getWebdeploymentsConfigurationVersions**



> [WebDeploymentConfigurationVersionEntityListing](WebDeploymentConfigurationVersionEntityListing) getWebdeploymentsConfigurationVersions(configurationId)

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

[**WebDeploymentConfigurationVersionEntityListing**](WebDeploymentConfigurationVersionEntityListing)


# **getWebdeploymentsConfigurationVersionsDraft**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion) getWebdeploymentsConfigurationVersionsDraft(configurationId)

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

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion)


# **getWebdeploymentsConfigurations**



> [WebDeploymentConfigurationVersionEntityListing](WebDeploymentConfigurationVersionEntityListing) getWebdeploymentsConfigurations(showOnlyPublished)

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

[**WebDeploymentConfigurationVersionEntityListing**](WebDeploymentConfigurationVersionEntityListing)


# **getWebdeploymentsDeployment**



> [WebDeployment](WebDeployment) getWebdeploymentsDeployment(deploymentId, expand)

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
List<String> expand = Arrays.asList(null); // List<String> | The specified entity attributes will be filled. Comma separated values expected. 
try {
    WebDeployment result = apiInstance.getWebdeploymentsDeployment(deploymentId, expand);
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
| **expand** | [**List&lt;String&gt;**](String)| The specified entity attributes will be filled. Comma separated values expected.  | [optional]<br />**Values**: supportedContent 
{: class="table-striped"}


### Return type

[**WebDeployment**](WebDeployment)


# **getWebdeploymentsDeploymentCobrowseSessionId**



> [CobrowseWebMessagingSession](CobrowseWebMessagingSession) getWebdeploymentsDeploymentCobrowseSessionId(deploymentId, sessionId)

Retrieves a cobrowse session

Wraps GET /api/v2/webdeployments/deployments/{deploymentId}/cobrowse/{sessionId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;


WebDeploymentsApi apiInstance = new WebDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | WebMessaging deployment ID
String sessionId = "sessionId_example"; // String | Cobrowse session id or join code
try {
    CobrowseWebMessagingSession result = apiInstance.getWebdeploymentsDeploymentCobrowseSessionId(deploymentId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsDeploymentCobrowseSessionId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deploymentId** | **String**| WebMessaging deployment ID | 
| **sessionId** | **String**| Cobrowse session id or join code | 
{: class="table-striped"}


### Return type

[**CobrowseWebMessagingSession**](CobrowseWebMessagingSession)


# **getWebdeploymentsDeploymentConfigurations**



> [WebDeploymentActiveConfigurationOnDeployment](WebDeploymentActiveConfigurationOnDeployment) getWebdeploymentsDeploymentConfigurations(deploymentId, type, expand)

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
List<String> expand = Arrays.asList(null); // List<String> | Expand instructions for the return value
try {
    WebDeploymentActiveConfigurationOnDeployment result = apiInstance.getWebdeploymentsDeploymentConfigurations(deploymentId, type, expand);
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
| **expand** | [**List&lt;String&gt;**](String)| Expand instructions for the return value | [optional]<br />**Values**: supportedContent 
{: class="table-striped"}


### Return type

[**WebDeploymentActiveConfigurationOnDeployment**](WebDeploymentActiveConfigurationOnDeployment)


# **getWebdeploymentsDeployments**



> [ExpandableWebDeploymentEntityListing](ExpandableWebDeploymentEntityListing) getWebdeploymentsDeployments(expand)

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
List<String> expand = Arrays.asList(null); // List<String> | The specified entity attributes will be filled. Comma separated values expected.
try {
    ExpandableWebDeploymentEntityListing result = apiInstance.getWebdeploymentsDeployments(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#getWebdeploymentsDeployments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expand** | [**List&lt;String&gt;**](String)| The specified entity attributes will be filled. Comma separated values expected. | [optional]<br />**Values**: Configuration, SupportedContent 
{: class="table-striped"}


### Return type

[**ExpandableWebDeploymentEntityListing**](ExpandableWebDeploymentEntityListing)


# **postWebdeploymentsConfigurationVersionsDraftPublish**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion) postWebdeploymentsConfigurationVersionsDraftPublish(configurationId)

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

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion)


# **postWebdeploymentsConfigurations**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion) postWebdeploymentsConfigurations(configurationVersion)

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
| **configurationVersion** | [**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion)|  | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion)


# **postWebdeploymentsDeployments**



> [WebDeployment](WebDeployment) postWebdeploymentsDeployments(deployment)

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
| **deployment** | [**WebDeployment**](WebDeployment)|  | 
{: class="table-striped"}


### Return type

[**WebDeployment**](WebDeployment)


# **postWebdeploymentsTokenOauthcodegrantjwtexchange**



> [WebDeploymentsAuthorizationResponse](WebDeploymentsAuthorizationResponse) postWebdeploymentsTokenOauthcodegrantjwtexchange(body)

Exchange an oAuth code (obtained using the Authorization Code Flow) for a JWT that can be used by webdeployments.

Wraps POST /api/v2/webdeployments/token/oauthcodegrantjwtexchange  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;


WebDeploymentsApi apiInstance = new WebDeploymentsApi();
WebDeploymentsOAuthExchangeRequest body = new WebDeploymentsOAuthExchangeRequest(); // WebDeploymentsOAuthExchangeRequest | webDeploymentsOAuthExchangeRequest
try {
    WebDeploymentsAuthorizationResponse result = apiInstance.postWebdeploymentsTokenOauthcodegrantjwtexchange(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsTokenOauthcodegrantjwtexchange");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WebDeploymentsOAuthExchangeRequest**](WebDeploymentsOAuthExchangeRequest)| webDeploymentsOAuthExchangeRequest | 
{: class="table-striped"}


### Return type

[**WebDeploymentsAuthorizationResponse**](WebDeploymentsAuthorizationResponse)


# **postWebdeploymentsTokenRefresh**



> [SignedData](SignedData) postWebdeploymentsTokenRefresh(body)

Refresh a JWT.

Wraps POST /api/v2/webdeployments/token/refresh  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.api.WebDeploymentsApi;


WebDeploymentsApi apiInstance = new WebDeploymentsApi();
WebDeploymentsRefreshJWTRequest body = new WebDeploymentsRefreshJWTRequest(); // WebDeploymentsRefreshJWTRequest | 
try {
    SignedData result = apiInstance.postWebdeploymentsTokenRefresh(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebDeploymentsApi#postWebdeploymentsTokenRefresh");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**WebDeploymentsRefreshJWTRequest**](WebDeploymentsRefreshJWTRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**SignedData**](SignedData)


# **putWebdeploymentsConfigurationVersionsDraft**



> [WebDeploymentConfigurationVersion](WebDeploymentConfigurationVersion) putWebdeploymentsConfigurationVersionsDraft(configurationId, configurationVersion)

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
| **configurationVersion** | [**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion)|  | 
{: class="table-striped"}


### Return type

[**WebDeploymentConfigurationVersion**](WebDeploymentConfigurationVersion)


# **putWebdeploymentsDeployment**



> [WebDeployment](WebDeployment) putWebdeploymentsDeployment(deploymentId, deployment)

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
| **deployment** | [**WebDeployment**](WebDeployment)|  | 
{: class="table-striped"}


### Return type

[**WebDeployment**](WebDeployment)


_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
