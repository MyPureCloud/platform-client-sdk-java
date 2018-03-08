---
title: ObjectsApi
---
## ObjectsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getAuthorizationDivisionsLimit**](ObjectsApi.html#getAuthorizationDivisionsLimit) | Returns the maximum allowed number of divisions. |
{: class="table table-striped"}

<a name="getAuthorizationDivisionsLimit"></a>

# **getAuthorizationDivisionsLimit**

> Integer getAuthorizationDivisionsLimit()

Returns the maximum allowed number of divisions.



Wraps GET /api/v2/authorization/divisions/limit  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.ObjectsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

ObjectsApi apiInstance = new ObjectsApi();
try {
    Integer result = apiInstance.getAuthorizationDivisionsLimit();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ObjectsApi#getAuthorizationDivisionsLimit");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

**Integer**

