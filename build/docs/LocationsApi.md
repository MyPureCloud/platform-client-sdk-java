---
title: LocationsApi
---
## LocationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getLocation**](LocationsApi.html#getLocation) | Get Location by ID. |
| [**getLocations**](LocationsApi.html#getLocations) | Get a list of all locations. |
| [**getLocationsSearch**](LocationsApi.html#getLocationsSearch) | Search locations using the q64 value returned from a previous search |
| [**postLocationsSearch**](LocationsApi.html#postLocationsSearch) | Search locations |
{: class="table table-striped"}

<a name="getLocation"></a>

# **getLocation**



> [LocationDefinition](LocationDefinition.html) getLocation(locationId)

Get Location by ID.



Wraps GET /api/v2/locations/{locationId}  

Requires ANY permissions: 

* telephony:plugin:all

### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
String locationId = "locationId_example"; // String | Location ID
try {
    LocationDefinition result = apiInstance.getLocation(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocation");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationId** | **String**| Location ID | |
{: class="table table-striped"}

### Return type

[**LocationDefinition**](LocationDefinition.html)

<a name="getLocations"></a>

# **getLocations**



> [LocationEntityListing](LocationEntityListing.html) getLocations(pageSize, pageNumber, sortOrder)

Get a list of all locations.



Wraps GET /api/v2/locations  

Requires NO permissions: 



### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortOrder = "sortOrder_example"; // String | Sort order
try {
    LocationEntityListing result = apiInstance.getLocations(pageSize, pageNumber, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocations");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] |
| **sortOrder** | **String**| Sort order | [optional]<br />**Values**: asc, desc |
{: class="table table-striped"}

### Return type

[**LocationEntityListing**](LocationEntityListing.html)

<a name="getLocationsSearch"></a>

# **getLocationsSearch**



> [LocationsSearchResponse](LocationsSearchResponse.html) getLocationsSearch(q64, expand)

Search locations using the q64 value returned from a previous search



Wraps GET /api/v2/locations/search  

Requires NO permissions: 



### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
String q64 = "q64_example"; // String | q64
List<String> expand = Arrays.asList("expand_example"); // List<String> | expand
try {
    LocationsSearchResponse result = apiInstance.getLocationsSearch(q64, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocationsSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q64** | **String**| q64 | |
| **expand** | [**List&lt;String&gt;**](String.html)| expand | [optional] |
{: class="table table-striped"}

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.html)

<a name="postLocationsSearch"></a>

# **postLocationsSearch**



> [LocationsSearchResponse](LocationsSearchResponse.html) postLocationsSearch(body)

Search locations



Wraps POST /api/v2/locations/search  

Requires NO permissions: 



### Example

~~~java
//Import classes:
//import com.mypurecloud.sdk.v2.ApiClient;
//import com.mypurecloud.sdk.v2.ApiException;
//import com.mypurecloud.sdk.v2.Configuration;
//import com.mypurecloud.sdk.v2.auth.*;
//import com.mypurecloud.sdk.v2.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PureCloud Auth
OAuth PureCloud Auth = (OAuth) defaultClient.getAuthentication("PureCloud Auth");
PureCloud Auth.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
LocationSearchRequest body = new LocationSearchRequest(); // LocationSearchRequest | Search request options
try {
    LocationsSearchResponse result = apiInstance.postLocationsSearch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#postLocationsSearch");
    e.printStackTrace();
}
~~~

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LocationSearchRequest**](LocationSearchRequest.html)| Search request options | |
{: class="table table-striped"}

### Return type

[**LocationsSearchResponse**](LocationsSearchResponse.html)

