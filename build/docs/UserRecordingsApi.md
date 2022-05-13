---
title: UserRecordingsApi
---
## UserRecordingsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteUserrecording**](UserRecordingsApi.html#deleteUserrecording) | Delete a user recording. |
| [**getUserrecording**](UserRecordingsApi.html#getUserrecording) | Get a user recording. |
| [**getUserrecordingMedia**](UserRecordingsApi.html#getUserrecordingMedia) | Download a user recording. |
| [**getUserrecordings**](UserRecordingsApi.html#getUserrecordings) | Get a list of user recordings. |
| [**getUserrecordingsSummary**](UserRecordingsApi.html#getUserrecordingsSummary) | Get user recording summary |
| [**putUserrecording**](UserRecordingsApi.html#putUserrecording) | Update a user recording. |
{: class="table-striped"}

<a name="deleteUserrecording"></a>

# **deleteUserrecording**



> Void deleteUserrecording(recordingId)

Delete a user recording.

Wraps DELETE /api/v2/userrecordings/{recordingId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
try {
    apiInstance.deleteUserrecording(recordingId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#deleteUserrecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recordingId** | **String**| User Recording ID | 
{: class="table-striped"}


### Return type

null (empty response body)

<a name="getUserrecording"></a>

# **getUserrecording**



> [UserRecording](UserRecording.html) getUserrecording(recordingId, expand)

Get a user recording.

Wraps GET /api/v2/userrecordings/{recordingId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    UserRecording result = apiInstance.getUserrecording(recordingId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getUserrecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recordingId** | **String**| User Recording ID | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: conversation 
{: class="table-striped"}


### Return type

[**UserRecording**](UserRecording.html)

<a name="getUserrecordingMedia"></a>

# **getUserrecordingMedia**



> [DownloadResponse](DownloadResponse.html) getUserrecordingMedia(recordingId, formatId)

Download a user recording.

Wraps GET /api/v2/userrecordings/{recordingId}/media  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
String formatId = "WEBM"; // String | The desired media format.
try {
    DownloadResponse result = apiInstance.getUserrecordingMedia(recordingId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getUserrecordingMedia");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recordingId** | **String**| User Recording ID | 
| **formatId** | **String**| The desired media format. | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE 
{: class="table-striped"}


### Return type

[**DownloadResponse**](DownloadResponse.html)

<a name="getUserrecordings"></a>

# **getUserrecordings**



> [UserRecordingEntityListing](UserRecordingEntityListing.html) getUserrecordings(pageSize, pageNumber, expand)

Get a list of user recordings.

Wraps GET /api/v2/userrecordings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserRecordingsApi apiInstance = new UserRecordingsApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    UserRecordingEntityListing result = apiInstance.getUserrecordings(pageSize, pageNumber, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getUserrecordings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: conversation 
{: class="table-striped"}


### Return type

[**UserRecordingEntityListing**](UserRecordingEntityListing.html)

<a name="getUserrecordingsSummary"></a>

# **getUserrecordingsSummary**



> [FaxSummary](FaxSummary.html) getUserrecordingsSummary()

Get user recording summary

Wraps GET /api/v2/userrecordings/summary  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserRecordingsApi apiInstance = new UserRecordingsApi();
try {
    FaxSummary result = apiInstance.getUserrecordingsSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getUserrecordingsSummary");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**FaxSummary**](FaxSummary.html)

<a name="putUserrecording"></a>

# **putUserrecording**



> [UserRecording](UserRecording.html) putUserrecording(recordingId, body, expand)

Update a user recording.

Wraps PUT /api/v2/userrecordings/{recordingId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.UserRecordingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

UserRecordingsApi apiInstance = new UserRecordingsApi();
String recordingId = "recordingId_example"; // String | User Recording ID
UserRecording body = new UserRecording(); // UserRecording | UserRecording
List<String> expand = Arrays.asList(null); // List<String> | Which fields, if any, to expand.
try {
    UserRecording result = apiInstance.putUserrecording(recordingId, body, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#putUserrecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recordingId** | **String**| User Recording ID | 
| **body** | [**UserRecording**](UserRecording.html)| UserRecording | 
| **expand** | [**List&lt;String&gt;**](String.html)| Which fields, if any, to expand. | [optional]<br />**Values**: conversation 
{: class="table-striped"}


### Return type

[**UserRecording**](UserRecording.html)

