# OAuthApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteOauthClient**](OAuthApi#deleteOauthClient) | Delete OAuth Client |
| [**getOauthAuthorization**](OAuthApi#getOauthAuthorization) | Get a client that is authorized by the resource owner |
| [**getOauthAuthorizations**](OAuthApi#getOauthAuthorizations) | List clients that have been authorized, requested, or revoked by the resource owner |
| [**getOauthClient**](OAuthApi#getOauthClient) | Get OAuth Client |
| [**getOauthClientUsageQueryResult**](OAuthApi#getOauthClientUsageQueryResult) | Get the results of a usage query |
| [**getOauthClientUsageSummary**](OAuthApi#getOauthClientUsageSummary) | Get a summary of OAuth client API usage |
| [**getOauthClients**](OAuthApi#getOauthClients) | The list of OAuth clients |
| [**getOauthScope**](OAuthApi#getOauthScope) | An OAuth scope |
| [**getOauthScopes**](OAuthApi#getOauthScopes) | The list of OAuth scopes |
| [**postOauthClientSecret**](OAuthApi#postOauthClientSecret) | Regenerate Client Secret |
| [**postOauthClientUsageQuery**](OAuthApi#postOauthClientUsageQuery) | Query for OAuth client API usage |
| [**postOauthClients**](OAuthApi#postOauthClients) | Create OAuth client |
| [**putOauthClient**](OAuthApi#putOauthClient) | Update OAuth Client |
{: class="table-striped"}


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


# **getOauthAuthorization**


> [OAuthAuthorization](OAuthAuthorization) getOauthAuthorization(clientId, acceptLanguage)

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

[**OAuthAuthorization**](OAuthAuthorization)


# **getOauthAuthorizations**


> [OAuthAuthorizationListing](OAuthAuthorizationListing) getOauthAuthorizations(acceptLanguage)

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

[**OAuthAuthorizationListing**](OAuthAuthorizationListing)


# **getOauthClient**


> [OAuthClient](OAuthClient) getOauthClient(clientId)

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

[**OAuthClient**](OAuthClient)


# **getOauthClientUsageQueryResult**


> [ApiUsageQueryResult](ApiUsageQueryResult) getOauthClientUsageQueryResult(executionId, clientId)

Get the results of a usage query

Wraps GET /api/v2/oauth/clients/{clientId}/usage/query/results/{executionId}  

Requires ANY permissions: 

* oauth:client:view
* usage:client:view

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

[**ApiUsageQueryResult**](ApiUsageQueryResult)


# **getOauthClientUsageSummary**


> [UsageExecutionResult](UsageExecutionResult) getOauthClientUsageSummary(clientId, days)

Get a summary of OAuth client API usage

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps GET /api/v2/oauth/clients/{clientId}/usage/summary  

Requires ANY permissions: 

* oauth:client:view
* usage:client:view

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

[**UsageExecutionResult**](UsageExecutionResult)


# **getOauthClients**


> [OAuthClientEntityListing](OAuthClientEntityListing) getOauthClients()

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

[**OAuthClientEntityListing**](OAuthClientEntityListing)


# **getOauthScope**


> [OAuthScope](OAuthScope) getOauthScope(scopeId, acceptLanguage)

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

[**OAuthScope**](OAuthScope)


# **getOauthScopes**


> [OAuthScopeListing](OAuthScopeListing) getOauthScopes(acceptLanguage)

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

[**OAuthScopeListing**](OAuthScopeListing)


# **postOauthClientSecret**


> [OAuthClient](OAuthClient) postOauthClientSecret(clientId)

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

[**OAuthClient**](OAuthClient)


# **postOauthClientUsageQuery**


> [UsageExecutionResult](UsageExecutionResult) postOauthClientUsageQuery(clientId, body)

Query for OAuth client API usage

After calling this method, you will then need to poll for the query results based on the returned execution Id

Wraps POST /api/v2/oauth/clients/{clientId}/usage/query  

Requires ANY permissions: 

* oauth:client:view
* usage:client:view

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
ApiUsageClientQuery body = new ApiUsageClientQuery(); // ApiUsageClientQuery | Query
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
| **body** | [**ApiUsageClientQuery**](ApiUsageClientQuery)| Query | 
{: class="table-striped"}


### Return type

[**UsageExecutionResult**](UsageExecutionResult)


# **postOauthClients**


> [OAuthClient](OAuthClient) postOauthClients(body)

Create OAuth client

The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is 'CODE' which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the 'TOKEN' grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the 'CLIENT-CREDENTIALS' grant may be used. In this case the client must be granted roles  via the 'roleIds' field.

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
| **body** | [**OAuthClientRequest**](OAuthClientRequest)| Client | 
{: class="table-striped"}


### Return type

[**OAuthClient**](OAuthClient)


# **putOauthClient**


> [OAuthClient](OAuthClient) putOauthClient(clientId, body)

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
| **body** | [**OAuthClientRequest**](OAuthClientRequest)| Client | 
{: class="table-striped"}


### Return type

[**OAuthClient**](OAuthClient)


_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
