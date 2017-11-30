---
title: SignedDataApi
---
## SignedDataApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**postSigneddata**](SignedDataApi.html#postSigneddata) | Sign identifying information |
{: class="table table-striped"}

<a name="postSigneddata"></a>

# **postSigneddata**

> [SignedData](SignedData.html) postSigneddata(body)

Sign identifying information



Wraps POST /api/v2/signeddata  

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.SignedDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

SignedDataApi apiInstance = new SignedDataApi();
Object body = null; // Object | 
try {
    SignedData result = apiInstance.postSigneddata(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignedDataApi#postSigneddata");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **Object**|  | [optional] |
{: class="table table-striped"}

### Return type

[**SignedData**](SignedData.html)

