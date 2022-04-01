---
title: OAuthApi
---
## OAuthApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteOauthClient**](OAuthApi.html#deleteOauthClient) | Delete OAuth Client |
| [**getOauthAuthorization**](OAuthApi.html#getOauthAuthorization) | Get a client that is authorized by the resource owner |
| [**getOauthAuthorizations**](OAuthApi.html#getOauthAuthorizations) | List clients that have been authorized, requested, or revoked by the resource owner |
| [**getOauthClient**](OAuthApi.html#getOauthClient) | Get OAuth Client |
| [**getOauthClientUsageQueryResult**](OAuthApi.html#getOauthClientUsageQueryResult) | Get the results of a usage query |
| [**getOauthClientUsageSummary**](OAuthApi.html#getOauthClientUsageSummary) | Get a summary of OAuth client API usage |
| [**getOauthClients**](OAuthApi.html#getOauthClients) | The list of OAuth clients |
| [**getOauthScope**](OAuthApi.html#getOauthScope) | An OAuth scope |
| [**getOauthScopes**](OAuthApi.html#getOauthScopes) | The list of OAuth scopes |
| [**postOauthClientSecret**](OAuthApi.html#postOauthClientSecret) | Regenerate Client Secret |
| [**postOauthClientUsageQuery**](OAuthApi.html#postOauthClientUsageQuery) | Query for OAuth client API usage |
| [**postOauthClients**](OAuthApi.html#postOauthClients) | Create OAuth client |
| [**putOauthClient**](OAuthApi.html#putOauthClient) | Update OAuth Client |
{: class="table-striped"}

<a name="deleteOauthClient"></a>

# **deleteOauthClient**



> Void deleteOauthClient(clientId)

Delete OAuth Client



Wraps DELETE /api/v2/oauth/clients/{clientId}  

Requires ANY permissions: 

* oauth:client:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    apiInstance.deleteOauthClient(clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#deleteOauthClient");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getOauthAuthorization"></a>

# **getOauthAuthorization**



> [OAuthAuthorization](OAuthAuthorization.html) getOauthAuthorization(clientId, acceptLanguage)

Get a client that is authorized by the resource owner



Wraps GET /api/v2/oauth/authorizations/{clientId}  

Requires ANY permissions: 

* oauth:client:authorize

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | The ID of client
String acceptLanguage = "en-us"; // String | The language in which to display the client descriptions.
try {
    OAuthAuthorization result = apiInstance.getOauthAuthorization(clientId, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthAuthorization");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| The ID of client | 
| **acceptLanguage** | **String**| The language in which to display the client descriptions. | [optional] [default to en-us] 
{: class="table-striped"}


### Return type

[**OAuthAuthorization**](OAuthAuthorization.html)

<a name="getOauthAuthorizations"></a>

# **getOauthAuthorizations**



> [OAuthAuthorizationListing](OAuthAuthorizationListing.html) getOauthAuthorizations(acceptLanguage)

List clients that have been authorized, requested, or revoked by the resource owner



Wraps GET /api/v2/oauth/authorizations  

Requires ANY permissions: 

* oauth:client:authorize

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String acceptLanguage = "en-us"; // String | The language in which to display the client descriptions.
try {
    OAuthAuthorizationListing result = apiInstance.getOauthAuthorizations(acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthAuthorizations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | **String**| The language in which to display the client descriptions. | [optional] [default to en-us] 
{: class="table-striped"}


### Return type

[**OAuthAuthorizationListing**](OAuthAuthorizationListing.html)

<a name="getOauthClient"></a>

# **getOauthClient**



> [OAuthClient](OAuthClient.html) getOauthClient(clientId)

Get OAuth Client



Wraps GET /api/v2/oauth/clients/{clientId}  

Requires ANY permissions: 

* oauth:client:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    OAuthClient result = apiInstance.getOauthClient(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthClient");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
{: class="table-striped"}


### Return type

[**OAuthClient**](OAuthClient.html)

<a name="getOauthClientUsageQueryResult"></a>

# **getOauthClientUsageQueryResult**



> [ApiUsageQueryResult](ApiUsageQueryResult.html) getOauthClientUsageQueryResult(executionId, clientId)

Get the results of a usage query



Wraps GET /api/v2/oauth/clients/{clientId}/usage/query/results/{executionId}  

Requires ANY permissions: 

* oauth:client:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String executionId = "executionId_example"; // String | ID of the query execution
String clientId = "clientId_example"; // String | Client ID
try {
    ApiUsageQueryResult result = apiInstance.getOauthClientUsageQueryResult(executionId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthClientUsageQueryResult");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **executionId** | **String**| ID of the query execution | 
| **clientId** | **String**| Client ID | 
{: class="table-striped"}


### Return type

[**ApiUsageQueryResult**](ApiUsageQueryResult.html)

<a name="getOauthClientUsageSummary"></a>

# **getOauthClientUsageSummary**



> [UsageExecutionResult](UsageExecutionResult.html) getOauthClientUsageSummary(clientId, days)

Get a summary of OAuth client API usage

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps GET /api/v2/oauth/clients/{clientId}/usage/summary  

Requires ANY permissions: 

* oauth:client:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
String days = "7"; // String | Previous number of days to query
try {
    UsageExecutionResult result = apiInstance.getOauthClientUsageSummary(clientId, days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthClientUsageSummary");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
| **days** | **String**| Previous number of days to query | [optional] [default to 7] 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult.html)

<a name="getOauthClients"></a>

# **getOauthClients**



> [OAuthClientEntityListing](OAuthClientEntityListing.html) getOauthClients()

The list of OAuth clients



Wraps GET /api/v2/oauth/clients  

Requires ANY permissions: 

* oauth:client:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
try {
    OAuthClientEntityListing result = apiInstance.getOauthClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthClients");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**OAuthClientEntityListing**](OAuthClientEntityListing.html)

<a name="getOauthScope"></a>

# **getOauthScope**



> [OAuthScope](OAuthScope.html) getOauthScope(scopeId, acceptLanguage)

An OAuth scope



Wraps GET /api/v2/oauth/scopes/{scopeId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String scopeId = "scopeId_example"; // String | Scope ID
String acceptLanguage = "en-us"; // String | The language with which to display the scope description.
try {
    OAuthScope result = apiInstance.getOauthScope(scopeId, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthScope");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scopeId** | **String**| Scope ID | 
| **acceptLanguage** | **String**| The language with which to display the scope description. | [optional] [default to en-us] 
{: class="table-striped"}


### Return type

[**OAuthScope**](OAuthScope.html)

<a name="getOauthScopes"></a>

# **getOauthScopes**



> [OAuthScopeListing](OAuthScopeListing.html) getOauthScopes(acceptLanguage)

The list of OAuth scopes



Wraps GET /api/v2/oauth/scopes  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String acceptLanguage = "en-us"; // String | The language with which to display the scope descriptions.
try {
    OAuthScopeListing result = apiInstance.getOauthScopes(acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthScopes");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceptLanguage** | **String**| The language with which to display the scope descriptions. | [optional] [default to en-us] 
{: class="table-striped"}


### Return type

[**OAuthScopeListing**](OAuthScopeListing.html)

<a name="postOauthClientSecret"></a>

# **postOauthClientSecret**



> [OAuthClient](OAuthClient.html) postOauthClientSecret(clientId)

Regenerate Client Secret

This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.

Wraps POST /api/v2/oauth/clients/{clientId}/secret  

Requires ANY permissions: 

* oauth:client:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    OAuthClient result = apiInstance.postOauthClientSecret(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#postOauthClientSecret");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
{: class="table-striped"}


### Return type

[**OAuthClient**](OAuthClient.html)

<a name="postOauthClientUsageQuery"></a>

# **postOauthClientUsageQuery**



> [UsageExecutionResult](UsageExecutionResult.html) postOauthClientUsageQuery(clientId, body)

Query for OAuth client API usage

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps POST /api/v2/oauth/clients/{clientId}/usage/query  

Requires ANY permissions: 

* oauth:client:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
ApiUsageQuery body = new ApiUsageQuery(); // ApiUsageQuery | Query
try {
    UsageExecutionResult result = apiInstance.postOauthClientUsageQuery(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#postOauthClientUsageQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
| **body** | [**ApiUsageQuery**](ApiUsageQuery.html)| Query | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult.html)

<a name="postOauthClients"></a>

# **postOauthClients**



> [OAuthClient](OAuthClient.html) postOauthClients(body)

Create OAuth client

The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.

Wraps POST /api/v2/oauth/clients  

Requires ANY permissions: 

* oauth:client:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
OAuthClientRequest body = new OAuthClientRequest(); // OAuthClientRequest | Client
try {
    OAuthClient result = apiInstance.postOauthClients(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#postOauthClients");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OAuthClientRequest**](OAuthClientRequest.html)| Client | 
{: class="table-striped"}


### Return type

[**OAuthClient**](OAuthClient.html)

<a name="putOauthClient"></a>

# **putOauthClient**



> [OAuthClient](OAuthClient.html) putOauthClient(clientId, body)

Update OAuth Client



Wraps PUT /api/v2/oauth/clients/{clientId}  

Requires ANY permissions: 

* oauth:client:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
OAuthClientRequest body = new OAuthClientRequest(); // OAuthClientRequest | Client
try {
    OAuthClient result = apiInstance.putOauthClient(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#putOauthClient");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | 
| **body** | [**OAuthClientRequest**](OAuthClientRequest.html)| Client | 
{: class="table-striped"}


### Return type

[**OAuthClient**](OAuthClient.html)

