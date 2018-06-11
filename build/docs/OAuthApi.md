---
title: OAuthApi
---
## OAuthApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteOauthClient**](OAuthApi.html#deleteOauthClient) | Delete OAuth Client |
| [**getOauthClient**](OAuthApi.html#getOauthClient) | Get OAuth Client |
| [**getOauthClients**](OAuthApi.html#getOauthClients) | The list of OAuth clients |
| [**postOauthClientSecret**](OAuthApi.html#postOauthClientSecret) | Regenerate Client Secret |
| [**postOauthClients**](OAuthApi.html#postOauthClients) | Create OAuth client |
| [**putOauthClient**](OAuthApi.html#putOauthClient) | Update OAuth Client |
{: class="table table-striped"}

<a name="deleteOauthClient"></a>

# **deleteOauthClient**



> Void deleteOauthClient(clientId)

Delete OAuth Client



Wraps DELETE /api/v2/oauth/clients/{clientId}  

Requires ANY permissions: 

* oauth:client:delete

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    apiInstance.deleteOauthClient(clientId);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#deleteOauthClient");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getOauthClient"></a>

# **getOauthClient**



> [OAuthClient](OAuthClient.html) getOauthClient(clientId)

Get OAuth Client



Wraps GET /api/v2/oauth/clients/{clientId}  

Requires ANY permissions: 

* oauth:client:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    OAuthClient result = apiInstance.getOauthClient(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthClient");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | |
{: class="table table-striped"}

### Return type

[**OAuthClient**](OAuthClient.html)

<a name="getOauthClients"></a>

# **getOauthClients**



> [OAuthClientEntityListing](OAuthClientEntityListing.html) getOauthClients()

The list of OAuth clients



Wraps GET /api/v2/oauth/clients  

Requires ANY permissions: 

* oauth:client:view

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
try {
    OAuthClientEntityListing result = apiInstance.getOauthClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#getOauthClients");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**OAuthClientEntityListing**](OAuthClientEntityListing.html)

<a name="postOauthClientSecret"></a>

# **postOauthClientSecret**



> [OAuthClient](OAuthClient.html) postOauthClientSecret(clientId)

Regenerate Client Secret

This operation will set the client secret to a randomly generated cryptographically random value. All clients must be updated with the new secret. This operation should be used with caution.

Wraps POST /api/v2/oauth/clients/{clientId}/secret  

Requires ANY permissions: 

* oauth:client:edit

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
try {
    OAuthClient result = apiInstance.postOauthClientSecret(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#postOauthClientSecret");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | |
{: class="table table-striped"}

### Return type

[**OAuthClient**](OAuthClient.html)

<a name="postOauthClients"></a>

# **postOauthClients**



> [OAuthClient](OAuthClient.html) postOauthClients(body)

Create OAuth client

The OAuth Grant/Client is required in order to create an authentication token and gain access to PureCloud.  The preferred authorizedGrantTypes is &#39;CODE&#39; which requires applications to send a client ID and client secret. This is typically a web server.  If the client is unable to secure the client secret then the &#39;TOKEN&#39; grant type aka IMPLICIT should be used. This is would be for browser or mobile apps.  If a client is to be used outside of the context of a user then the &#39;CLIENT-CREDENTIALS&#39; grant may be used. In this case the client must be granted roles  via the &#39;roleIds&#39; field.

Wraps POST /api/v2/oauth/clients  

Requires ANY permissions: 

* oauth:client:add

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
OAuthClient body = new OAuthClient(); // OAuthClient | Client
try {
    OAuthClient result = apiInstance.postOauthClients(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#postOauthClients");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**OAuthClient**](OAuthClient.html)| Client | |
{: class="table table-striped"}

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

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.OAuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

OAuthApi apiInstance = new OAuthApi();
String clientId = "clientId_example"; // String | Client ID
OAuthClient body = new OAuthClient(); // OAuthClient | Client
try {
    OAuthClient result = apiInstance.putOauthClient(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OAuthApi#putOauthClient");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **String**| Client ID | |
| **body** | [**OAuthClient**](OAuthClient.html)| Client | |
{: class="table table-striped"}

### Return type

[**OAuthClient**](OAuthClient.html)

