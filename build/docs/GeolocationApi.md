---
title: GeolocationApi
---
## GeolocationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getGeolocationsSettings**](GeolocationApi.html#getGeolocationsSettings) | Get a organization&#39;s GeolocationSettings |
| [**getUserGeolocation**](GeolocationApi.html#getUserGeolocation) | Get a user&#39;s Geolocation |
| [**patchGeolocationsSettings**](GeolocationApi.html#patchGeolocationsSettings) | Patch a organization&#39;s GeolocationSettings |
| [**patchUserGeolocation**](GeolocationApi.html#patchUserGeolocation) | Patch a user&#39;s Geolocation |
{: class="table table-striped"}

<a name="getGeolocationsSettings"></a>

# **getGeolocationsSettings**



> [GeolocationSettings](GeolocationSettings.html) getGeolocationsSettings()

Get a organization&#39;s GeolocationSettings



Wraps GET /api/v2/geolocations/settings  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
try {
    GeolocationSettings result = apiInstance.getGeolocationsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#getGeolocationsSettings");
    e.printStackTrace();
}
~~~

### Parameters

This endpoint does not require any parameters.
{: class="table table-striped"}

### Return type

[**GeolocationSettings**](GeolocationSettings.html)

<a name="getUserGeolocation"></a>

# **getUserGeolocation**



> [Geolocation](Geolocation.html) getUserGeolocation(userId, clientId)

Get a user&#39;s Geolocation



Wraps GET /api/v2/users/{userId}/geolocations/{clientId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
try {
    Geolocation result = apiInstance.getUserGeolocation(userId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#getUserGeolocation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | |
| **clientId** | **String**| client Id | |
{: class="table table-striped"}

### Return type

[**Geolocation**](Geolocation.html)

<a name="patchGeolocationsSettings"></a>

# **patchGeolocationsSettings**



> [GeolocationSettings](GeolocationSettings.html) patchGeolocationsSettings(body)

Patch a organization&#39;s GeolocationSettings



Wraps PATCH /api/v2/geolocations/settings  

Requires ANY permissions: 

* telephony:plugin:all

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
GeolocationSettings body = new GeolocationSettings(); // GeolocationSettings | Geolocation settings
try {
    GeolocationSettings result = apiInstance.patchGeolocationsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#patchGeolocationsSettings");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GeolocationSettings**](GeolocationSettings.html)| Geolocation settings | |
{: class="table table-striped"}

### Return type

[**GeolocationSettings**](GeolocationSettings.html)

<a name="patchUserGeolocation"></a>

# **patchUserGeolocation**



> [Geolocation](Geolocation.html) patchUserGeolocation(userId, clientId, body)

Patch a user&#39;s Geolocation

The geolocation object can be patched one of three ways. Option 1: Set the &#39;primary&#39; property to true. This will set the client as the user&#39;s primary geolocation source.  Option 2: Provide the &#39;latitude&#39; and &#39;longitude&#39; values.  This will enqueue an asynchronous update of the &#39;city&#39;, &#39;region&#39;, and &#39;country&#39;, generating a notification. A subsequent GET operation will include the new values for &#39;city&#39;, &#39;region&#39; and &#39;country&#39;.  Option 3:  Provide the &#39;city&#39;, &#39;region&#39;, &#39;country&#39; values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.

Wraps PATCH /api/v2/users/{userId}/geolocations/{clientId}  

Requires NO permissions: 


### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud OAuth
OAuth PureCloud OAuth = (OAuth) defaultClient.getAuthentication("PureCloud OAuth");
PureCloud OAuth.setAccessToken("YOUR ACCESS TOKEN");

GeolocationApi apiInstance = new GeolocationApi();
String userId = "userId_example"; // String | user Id
String clientId = "clientId_example"; // String | client Id
Geolocation body = new Geolocation(); // Geolocation | Geolocation
try {
    Geolocation result = apiInstance.patchUserGeolocation(userId, clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#patchUserGeolocation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | |
| **clientId** | **String**| client Id | |
| **body** | [**Geolocation**](Geolocation.html)| Geolocation | |
{: class="table table-striped"}

### Return type

[**Geolocation**](Geolocation.html)

