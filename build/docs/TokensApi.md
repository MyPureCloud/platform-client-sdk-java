---
title: TokensApi
---
## TokensApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteToken**](TokensApi.html#deleteToken) | Delete all auth tokens for the specified user. |
| [**deleteTokensMe**](TokensApi.html#deleteTokensMe) | Delete auth token used to make the request. |
| [**getTokensMe**](TokensApi.html#getTokensMe) | Fetch information about the current token |
| [**getTokensTimeout**](TokensApi.html#getTokensTimeout) | Get the current Idle Token Timeout Value |
| [**headTokensMe**](TokensApi.html#headTokensMe) | Verify user token |
| [**putTokensTimeout**](TokensApi.html#putTokensTimeout) | Update or Enable/Disable the Idle Token Timeout |
{: class="table-striped"}

<a name="deleteToken"></a>

# **deleteToken**



> Void deleteToken(userId)

Delete all auth tokens for the specified user.

Wraps DELETE /api/v2/tokens/{userId}  

Requires ANY permissions: 

* oauth:token:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
String userId = "userId_example"; // String | User ID
try {
    apiInstance.deleteToken(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| User ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="deleteTokensMe"></a>

# **deleteTokensMe**



> Void deleteTokensMe()

Delete auth token used to make the request.

Wraps DELETE /api/v2/tokens/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
try {
    apiInstance.deleteTokensMe();
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#deleteTokensMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="getTokensMe"></a>

# **getTokensMe**



> [TokenInfo](TokenInfo.html) getTokensMe(preserveIdleTTL)

Fetch information about the current token

Wraps GET /api/v2/tokens/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
Boolean preserveIdleTTL = true; // Boolean | preserveIdleTTL indicates whether the idle token timeout should be reset or preserved. If preserveIdleTTL is true, then TTL value is not reset. If unset or false, the value is reset.
try {
    TokenInfo result = apiInstance.getTokensMe(preserveIdleTTL);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#getTokensMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **preserveIdleTTL** | **Boolean**| preserveIdleTTL indicates whether the idle token timeout should be reset or preserved. If preserveIdleTTL is true, then TTL value is not reset. If unset or false, the value is reset. | [optional] 
{: class="table-striped"}


### Return type

[**TokenInfo**](TokenInfo.html)

<a name="getTokensTimeout"></a>

# **getTokensTimeout**



> [IdleTokenTimeout](IdleTokenTimeout.html) getTokensTimeout()

Get the current Idle Token Timeout Value

Wraps GET /api/v2/tokens/timeout  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
try {
    IdleTokenTimeout result = apiInstance.getTokensTimeout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#getTokensTimeout");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**IdleTokenTimeout**](IdleTokenTimeout.html)

<a name="headTokensMe"></a>

# **headTokensMe**



> Void headTokensMe()

Verify user token

Wraps HEAD /api/v2/tokens/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
try {
    apiInstance.headTokensMe();
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#headTokensMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

null (empty response body)

<a name="putTokensTimeout"></a>

# **putTokensTimeout**



> [IdleTokenTimeout](IdleTokenTimeout.html) putTokensTimeout(body)

Update or Enable/Disable the Idle Token Timeout

Wraps PUT /api/v2/tokens/timeout  

Requires ANY permissions: 

* directory:organization:admin

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.TokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

TokensApi apiInstance = new TokensApi();
IdleTokenTimeout body = new IdleTokenTimeout(); // IdleTokenTimeout | 
try {
    IdleTokenTimeout result = apiInstance.putTokensTimeout(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#putTokensTimeout");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**IdleTokenTimeout**](IdleTokenTimeout.html)|  | [optional] 
{: class="table-striped"}


### Return type

[**IdleTokenTimeout**](IdleTokenTimeout.html)

