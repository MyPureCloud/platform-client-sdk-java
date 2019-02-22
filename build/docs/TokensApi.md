---
title: TokensApi
---
## TokensApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteToken**](TokensApi.html#deleteToken) | Delete all auth tokens for the specified user. |
| [**deleteTokensMe**](TokensApi.html#deleteTokensMe) | Delete  auth token used to make the request. |
| [**getTokensMe**](TokensApi.html#getTokensMe) | Fetch information about the current token |
{: class="table table-striped"}

<a name="deleteToken"></a>

# **deleteToken**



> Void deleteToken(userId)

Delete all auth tokens for the specified user.



Wraps DELETE /api/v2/tokens/{userId}  

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
| **userId** | **String**| User ID | |
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="deleteTokensMe"></a>

# **deleteTokensMe**



> Void deleteTokensMe()

Delete  auth token used to make the request.



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
{: class="table table-striped"}

### Return type

null (empty response body)

<a name="getTokensMe"></a>

# **getTokensMe**



> [TokenInfo](TokenInfo.html) getTokensMe()

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
try {
    TokenInfo result = apiInstance.getTokensMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokensApi#getTokensMe");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**TokenInfo**](TokenInfo.html)

