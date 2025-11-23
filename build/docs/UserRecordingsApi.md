# UserRecordingsApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteUserrecording**](UserRecordingsApi#deleteUserrecording) | Delete a user recording. |
| [**getUserrecording**](UserRecordingsApi#getUserrecording) | Get a user recording. |
| [**getUserrecordingTranscoding**](UserRecordingsApi#getUserrecordingTranscoding) | Download a user recording. |
| [**getUserrecordings**](UserRecordingsApi#getUserrecordings) | Get a list of user recordings. |
| [**getUserrecordingsSummary**](UserRecordingsApi#getUserrecordingsSummary) | Get user recording summary |
| [**putUserrecording**](UserRecordingsApi#putUserrecording) | Update a user recording. |
{: class="table-striped"}


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


# **getUserrecording**


> [UserRecording](UserRecording) getUserrecording(recordingId, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: conversation 
{: class="table-striped"}


### Return type

[**UserRecording**](UserRecording)


# **getUserrecordingTranscoding**


> [DownloadResponse](DownloadResponse) getUserrecordingTranscoding(recordingId, formatId)

Download a user recording.

Wraps GET /api/v2/userrecordings/{recordingId}/transcoding  

Requires ANY permissions: 

* They are enforced by the backend

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
    DownloadResponse result = apiInstance.getUserrecordingTranscoding(recordingId, formatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserRecordingsApi#getUserrecordingTranscoding");
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

[**DownloadResponse**](DownloadResponse)


# **getUserrecordings**


> [UserRecordingEntityListing](UserRecordingEntityListing) getUserrecordings(pageSize, pageNumber, expand)

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
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: conversation 
{: class="table-striped"}


### Return type

[**UserRecordingEntityListing**](UserRecordingEntityListing)


# **getUserrecordingsSummary**


> [FaxSummary](FaxSummary) getUserrecordingsSummary()

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

[**FaxSummary**](FaxSummary)


# **putUserrecording**


> [UserRecording](UserRecording) putUserrecording(recordingId, body, expand)

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
| **body** | [**UserRecording**](UserRecording)| UserRecording | 
| **expand** | [**List&lt;String&gt;**](String)| Which fields, if any, to expand. | [optional]<br />**Values**: conversation 
{: class="table-striped"}


### Return type

[**UserRecording**](UserRecording)


_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
