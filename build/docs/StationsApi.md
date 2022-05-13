---
title: StationsApi
---
## StationsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteStationAssociateduser**](StationsApi.html#deleteStationAssociateduser) | Unassigns the user assigned to this station |
| [**getStation**](StationsApi.html#getStation) | Get station. |
| [**getStations**](StationsApi.html#getStations) | Get the list of available stations. |
| [**getStationsSettings**](StationsApi.html#getStationsSettings) | Get an organization's StationSettings |
| [**patchStationsSettings**](StationsApi.html#patchStationsSettings) | Patch an organization's StationSettings |
{: class="table-striped"}

<a name="deleteStationAssociateduser"></a>

# **deleteStationAssociateduser**



> Void deleteStationAssociateduser(stationId)

Unassigns the user assigned to this station

Wraps DELETE /api/v2/stations/{stationId}/associateduser  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

StationsApi apiInstance = new StationsApi();
String stationId = "stationId_example"; // String | Station ID
try {
    apiInstance.deleteStationAssociateduser(stationId);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#deleteStationAssociateduser");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stationId** | **String**| Station ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getStation"></a>

# **getStation**



> [Station](Station.html) getStation(stationId)

Get station.

Wraps GET /api/v2/stations/{stationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

StationsApi apiInstance = new StationsApi();
String stationId = "stationId_example"; // String | Station ID
try {
    Station result = apiInstance.getStation(stationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#getStation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stationId** | **String**| Station ID | 
{: class="table-striped"}


### Return type

[**Station**](Station.html)

<a name="getStations"></a>

# **getStations**



> [StationEntityListing](StationEntityListing.html) getStations(pageSize, pageNumber, sortBy, name, userSelectable, webRtcUserId, id, lineAppearanceId)

Get the list of available stations.

Wraps GET /api/v2/stations  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

StationsApi apiInstance = new StationsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "name"; // String | Sort by
String name = "name_example"; // String | Name
String userSelectable = "userSelectable_example"; // String | True for stations that the user can select otherwise false
String webRtcUserId = "webRtcUserId_example"; // String | Filter for the webRtc station of the webRtcUserId
String id = "id_example"; // String | Comma separated list of stationIds
String lineAppearanceId = "lineAppearanceId_example"; // String | lineAppearanceId
try {
    StationEntityListing result = apiInstance.getStations(pageSize, pageNumber, sortBy, name, userSelectable, webRtcUserId, id, lineAppearanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#getStations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to name] 
| **name** | **String**| Name | [optional] 
| **userSelectable** | **String**| True for stations that the user can select otherwise false | [optional] 
| **webRtcUserId** | **String**| Filter for the webRtc station of the webRtcUserId | [optional] 
| **id** | **String**| Comma separated list of stationIds | [optional] 
| **lineAppearanceId** | **String**| lineAppearanceId | [optional] 
{: class="table-striped"}


### Return type

[**StationEntityListing**](StationEntityListing.html)

<a name="getStationsSettings"></a>

# **getStationsSettings**



> [StationSettings](StationSettings.html) getStationsSettings()

Get an organization's StationSettings

Wraps GET /api/v2/stations/settings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

StationsApi apiInstance = new StationsApi();
try {
    StationSettings result = apiInstance.getStationsSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#getStationsSettings");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**StationSettings**](StationSettings.html)

<a name="patchStationsSettings"></a>

# **patchStationsSettings**



> [StationSettings](StationSettings.html) patchStationsSettings(body)

Patch an organization's StationSettings

Wraps PATCH /api/v2/stations/settings  

Requires ANY permissions: 

* telephony:plugin:all

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.StationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

StationsApi apiInstance = new StationsApi();
StationSettings body = new StationSettings(); // StationSettings | Station settings
try {
    StationSettings result = apiInstance.patchStationsSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StationsApi#patchStationsSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**StationSettings**](StationSettings.html)| Station settings | 
{: class="table-striped"}


### Return type

[**StationSettings**](StationSettings.html)

