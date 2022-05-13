---
title: GeolocationApi
---
## GeolocationApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getGeolocationsSettings**](GeolocationApi.html#getGeolocationsSettings) | Get a organization's GeolocationSettings |
| [**getUserGeolocation**](GeolocationApi.html#getUserGeolocation) | Get a user's Geolocation |
| [**patchGeolocationsSettings**](GeolocationApi.html#patchGeolocationsSettings) | Patch a organization's GeolocationSettings |
| [**patchUserGeolocation**](GeolocationApi.html#patchUserGeolocation) | Patch a user's Geolocation |
{: class="table-striped"}

<a name="getGeolocationsSettings"></a>

# **getGeolocationsSettings**



> [GeolocationSettings](GeolocationSettings.html) getGeolocationsSettings()

Get a organization's GeolocationSettings

Wraps GET /api/v2/geolocations/settings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GeolocationApi apiInstance = new GeolocationApi();
try {
    GeolocationSettings result = apiInstance.getGeolocationsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#getGeolocationsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**GeolocationSettings**](GeolocationSettings.html)

<a name="getUserGeolocation"></a>

# **getUserGeolocation**



> [Geolocation](Geolocation.html) getUserGeolocation(userId, clientId)

Get a user's Geolocation

Wraps GET /api/v2/users/{userId}/geolocations/{clientId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
| **clientId** | **String**| client Id | 
{: class="table-striped"}


### Return type

[**Geolocation**](Geolocation.html)

<a name="patchGeolocationsSettings"></a>

# **patchGeolocationsSettings**



> [GeolocationSettings](GeolocationSettings.html) patchGeolocationsSettings(body)

Patch a organization's GeolocationSettings

Wraps PATCH /api/v2/geolocations/settings  

Requires ANY permissions: 

* geolocation:settings:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

GeolocationApi apiInstance = new GeolocationApi();
GeolocationSettings body = new GeolocationSettings(); // GeolocationSettings | Geolocation settings
try {
    GeolocationSettings result = apiInstance.patchGeolocationsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeolocationApi#patchGeolocationsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**GeolocationSettings**](GeolocationSettings.html)| Geolocation settings | 
{: class="table-striped"}


### Return type

[**GeolocationSettings**](GeolocationSettings.html)

<a name="patchUserGeolocation"></a>

# **patchUserGeolocation**



> [Geolocation](Geolocation.html) patchUserGeolocation(userId, clientId, body)

Patch a user's Geolocation

The geolocation object can be patched one of three ways. Option 1: Set the 'primary' property to true. This will set the client as the user's primary geolocation source.  Option 2: Provide the 'latitude' and 'longitude' values.  This will enqueue an asynchronous update of the 'city', 'region', and 'country', generating a notification. A subsequent GET operation will include the new values for 'city', 'region' and 'country'.  Option 3:  Provide the 'city', 'region', 'country' values.  Option 1 can be combined with Option 2 or Option 3.  For example, update the client as primary and provide latitude and longitude values.

Wraps PATCH /api/v2/users/{userId}/geolocations/{clientId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.GeolocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

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
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userId** | **String**| user Id | 
| **clientId** | **String**| client Id | 
| **body** | [**Geolocation**](Geolocation.html)| Geolocation | 
{: class="table-striped"}


### Return type

[**Geolocation**](Geolocation.html)

