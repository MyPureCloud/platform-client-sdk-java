# RecordingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteConversationRecordingAnnotation**](RecordingApi#deleteConversationRecordingAnnotation) | Delete annotation |
| [**deleteOrphanrecording**](RecordingApi#deleteOrphanrecording) | Deletes a single orphan recording |
| [**deleteRecordingCrossplatformMediaretentionpolicies**](RecordingApi#deleteRecordingCrossplatformMediaretentionpolicies) | Delete media retention policies |
| [**deleteRecordingCrossplatformMediaretentionpolicy**](RecordingApi#deleteRecordingCrossplatformMediaretentionpolicy) | Delete a media retention policy |
| [**deleteRecordingJob**](RecordingApi#deleteRecordingJob) | Delete the recording bulk job |
| [**deleteRecordingMediaretentionpolicies**](RecordingApi#deleteRecordingMediaretentionpolicies) | Delete media retention policies |
| [**deleteRecordingMediaretentionpolicy**](RecordingApi#deleteRecordingMediaretentionpolicy) | Delete a media retention policy |
| [**getConversationRecording**](RecordingApi#getConversationRecording) | Gets a specific recording. |
| [**getConversationRecordingAnnotation**](RecordingApi#getConversationRecordingAnnotation) | Get annotation |
| [**getConversationRecordingAnnotations**](RecordingApi#getConversationRecordingAnnotations) | Get annotations for recording |
| [**getConversationRecordingmetadata**](RecordingApi#getConversationRecordingmetadata) | Get recording metadata for a conversation. Does not return playable media nor system annotations. Bookmark annotations will be excluded if either recording:recording:view or recording:annotation:view permission is missing. |
| [**getConversationRecordingmetadataRecordingId**](RecordingApi#getConversationRecordingmetadataRecordingId) | Get metadata for a specific recording. Does not return playable media. |
| [**getConversationRecordings**](RecordingApi#getConversationRecordings) | Get all of a Conversation's Recordings. |
| [**getOrphanrecording**](RecordingApi#getOrphanrecording) | Gets a single orphan recording |
| [**getOrphanrecordingMedia**](RecordingApi#getOrphanrecordingMedia) | Gets the media of a single orphan recording |
| [**getOrphanrecordings**](RecordingApi#getOrphanrecordings) | Gets all orphan recordings |
| [**getRecordingBatchrequest**](RecordingApi#getRecordingBatchrequest) | Get the status and results for a batch request job, only the user that submitted the job may retrieve results. Each result may contain either a URL to a recording or an error; additionally, a recording could be associated with multiple results. |
| [**getRecordingCrossplatformMediaretentionpolicies**](RecordingApi#getRecordingCrossplatformMediaretentionpolicies) | Gets media retention policy list with query options to filter on name and enabled. |
| [**getRecordingCrossplatformMediaretentionpolicy**](RecordingApi#getRecordingCrossplatformMediaretentionpolicy) | Get a media retention policy |
| [**getRecordingJob**](RecordingApi#getRecordingJob) | Get the status of the job associated with the job id. |
| [**getRecordingJobFailedrecordings**](RecordingApi#getRecordingJobFailedrecordings) | Get IDs of recordings that the bulk job failed for |
| [**getRecordingJobs**](RecordingApi#getRecordingJobs) | Get the status of all jobs within the user's organization |
| [**getRecordingKeyconfiguration**](RecordingApi#getRecordingKeyconfiguration) | Get the encryption key configurations |
| [**getRecordingKeyconfigurations**](RecordingApi#getRecordingKeyconfigurations) | Get a list of key configurations data |
| [**getRecordingMediaretentionpolicies**](RecordingApi#getRecordingMediaretentionpolicies) | Gets media retention policy list with query options to filter on name and enabled. |
| [**getRecordingMediaretentionpolicy**](RecordingApi#getRecordingMediaretentionpolicy) | Get a media retention policy |
| [**getRecordingRecordingkeys**](RecordingApi#getRecordingRecordingkeys) | Get encryption key list |
| [**getRecordingRecordingkeysRotationschedule**](RecordingApi#getRecordingRecordingkeysRotationschedule) | Get key rotation schedule |
| [**getRecordingSettings**](RecordingApi#getRecordingSettings) | Get the Recording Settings for the Organization |
| [**getRecordingUploadsReport**](RecordingApi#getRecordingUploadsReport) | Get the status of a recording upload status report |
| [**getRecordingsRetentionQuery**](RecordingApi#getRecordingsRetentionQuery) | Query for recording retention data |
| [**getRecordingsScreensessionsDetails**](RecordingApi#getRecordingsScreensessionsDetails) | Retrieves an object containing the total number of concurrent active screen recordings |
| [**patchRecordingCrossplatformMediaretentionpolicy**](RecordingApi#patchRecordingCrossplatformMediaretentionpolicy) | Patch a media retention policy |
| [**patchRecordingMediaretentionpolicy**](RecordingApi#patchRecordingMediaretentionpolicy) | Patch a media retention policy |
| [**postConversationRecordingAnnotations**](RecordingApi#postConversationRecordingAnnotations) | Create annotation |
| [**postRecordingBatchrequests**](RecordingApi#postRecordingBatchrequests) | Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration. |
| [**postRecordingCrossplatformMediaretentionpolicies**](RecordingApi#postRecordingCrossplatformMediaretentionpolicies) | Create media retention policy |
| [**postRecordingJobs**](RecordingApi#postRecordingJobs) | Create a recording bulk job. |
| [**postRecordingKeyconfigurations**](RecordingApi#postRecordingKeyconfigurations) | Setup configurations for encryption key creation |
| [**postRecordingKeyconfigurationsValidate**](RecordingApi#postRecordingKeyconfigurationsValidate) | Validate encryption key configurations without saving it |
| [**postRecordingLocalkeys**](RecordingApi#postRecordingLocalkeys) | create a local key management recording key |
| [**postRecordingMediaretentionpolicies**](RecordingApi#postRecordingMediaretentionpolicies) | Create media retention policy |
| [**postRecordingRecordingkeys**](RecordingApi#postRecordingRecordingkeys) | Create encryption key |
| [**postRecordingUploadsReports**](RecordingApi#postRecordingUploadsReports) | Creates a recording upload status report |
| [**postRecordingsDeletionprotection**](RecordingApi#postRecordingsDeletionprotection) | Get a list of conversations with protected recordings |
| [**postRecordingsScreensessionsAcknowledge**](RecordingApi#postRecordingsScreensessionsAcknowledge) | Acknowledge a screen recording. |
| [**postRecordingsScreensessionsMetadata**](RecordingApi#postRecordingsScreensessionsMetadata) | Provide meta-data a screen recording. |
| [**putConversationRecording**](RecordingApi#putConversationRecording) | Updates the retention records on a recording. |
| [**putConversationRecordingAnnotation**](RecordingApi#putConversationRecordingAnnotation) | Update annotation |
| [**putOrphanrecording**](RecordingApi#putOrphanrecording) | Updates an orphan recording to a regular recording with retention values |
| [**putRecordingCrossplatformMediaretentionpolicy**](RecordingApi#putRecordingCrossplatformMediaretentionpolicy) | Update a media retention policy |
| [**putRecordingJob**](RecordingApi#putRecordingJob) | Execute the recording bulk job. |
| [**putRecordingKeyconfiguration**](RecordingApi#putRecordingKeyconfiguration) | Update the encryption key configurations |
| [**putRecordingMediaretentionpolicy**](RecordingApi#putRecordingMediaretentionpolicy) | Update a media retention policy |
| [**putRecordingRecordingkeysRotationschedule**](RecordingApi#putRecordingRecordingkeysRotationschedule) | Update key rotation schedule |
| [**putRecordingSettings**](RecordingApi#putRecordingSettings) | Update the Recording Settings for the Organization |
| [**putRecordingsDeletionprotection**](RecordingApi#putRecordingsDeletionprotection) | Apply or revoke recording protection for conversations |
{: class="table-striped"}


# **deleteConversationRecordingAnnotation**


> Void deleteConversationRecordingAnnotation(conversationId, recordingId, annotationId)

Delete annotation

Wraps DELETE /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}  

Requires ANY permissions: 

* recording:annotation:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
try {
    apiInstance.deleteConversationRecordingAnnotation(conversationId, recordingId, annotationId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteConversationRecordingAnnotation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
| **annotationId** | **String**| Annotation ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteOrphanrecording**


> [OrphanRecording](OrphanRecording) deleteOrphanrecording(orphanId)

Deletes a single orphan recording

Wraps DELETE /api/v2/orphanrecordings/{orphanId}  

Requires ANY permissions: 

* recording:orphan:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
try {
    OrphanRecording result = apiInstance.deleteOrphanrecording(orphanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteOrphanrecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orphanId** | **String**| Orphan ID | 
{: class="table-striped"}


### Return type

[**OrphanRecording**](OrphanRecording)


# **deleteRecordingCrossplatformMediaretentionpolicies**


> Void deleteRecordingCrossplatformMediaretentionpolicies(ids)

Delete media retention policies

Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.

Wraps DELETE /api/v2/recording/crossplatform/mediaretentionpolicies  

Requires ANY permissions: 

* recording:crossPlatformRetentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String ids = "ids_example"; // String | 
try {
    apiInstance.deleteRecordingCrossplatformMediaretentionpolicies(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingCrossplatformMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | **String**|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteRecordingCrossplatformMediaretentionpolicy**


> Void deleteRecordingCrossplatformMediaretentionpolicy(policyId)

Delete a media retention policy

Wraps DELETE /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:crossPlatformRetentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    apiInstance.deleteRecordingCrossplatformMediaretentionpolicy(policyId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteRecordingJob**


> Void deleteRecordingJob(jobId)

Delete the recording bulk job

Wraps DELETE /api/v2/recording/jobs/{jobId}  

Requires ALL permissions: 

* recording:job:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
try {
    apiInstance.deleteRecordingJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteRecordingMediaretentionpolicies**


> Void deleteRecordingMediaretentionpolicies(ids)

Delete media retention policies

Bulk delete of media retention policies, this will only delete the polices that match the ids specified in the query param.

Wraps DELETE /api/v2/recording/mediaretentionpolicies  

Requires ANY permissions: 

* recording:retentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String ids = "ids_example"; // String | 
try {
    apiInstance.deleteRecordingMediaretentionpolicies(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | **String**|  | 
{: class="table-striped"}


### Return type

null (empty response body)


# **deleteRecordingMediaretentionpolicy**


> Void deleteRecordingMediaretentionpolicy(policyId)

Delete a media retention policy

Wraps DELETE /api/v2/recording/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:retentionPolicy:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    apiInstance.deleteRecordingMediaretentionpolicy(policyId);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#deleteRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getConversationRecording**


> [Recording](Recording) getConversationRecording(conversationId, recordingId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats)

Gets a specific recording.

Wraps GET /api/v2/conversations/{conversationId}/recordings/{recordingId}  

Requires ANY permissions: 

* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String formatId = "WEBM"; // String | The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE
String emailFormatId = "EML"; // String | The desired media format when downloading an email recording. Valid values:EML,NONE
String chatFormatId = "ZIP"; // String | The desired media format when downloading a chat recording. Valid values:ZIP,NONE 
String messageFormatId = "ZIP"; // String | The desired media format when downloading a message recording. Valid values:ZIP,NONE
Boolean download = false; // Boolean | requesting a download format of the recording. Valid values:true,false
String fileName = "fileName_example"; // String | the name of the downloaded fileName
String locale = "locale_example"; // String | The locale for the requested file when downloading or for redacting sensitive information in requested files, as an ISO 639-1 code
List<String> mediaFormats = Arrays.asList(null); // List<String> | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3
try {
    Recording result = apiInstance.getConversationRecording(conversationId, recordingId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
| **formatId** | **String**| The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE 
| **emailFormatId** | **String**| The desired media format when downloading an email recording. Valid values:EML,NONE | [optional] [default to EML]<br />**Values**: EML, NONE 
| **chatFormatId** | **String**| The desired media format when downloading a chat recording. Valid values:ZIP,NONE  | [optional] [default to ZIP]<br />**Values**: ZIP, NONE 
| **messageFormatId** | **String**| The desired media format when downloading a message recording. Valid values:ZIP,NONE | [optional] [default to ZIP]<br />**Values**: ZIP, NONE 
| **download** | **Boolean**| requesting a download format of the recording. Valid values:true,false | [optional] [default to false]<br />**Values**: true, false 
| **fileName** | **String**| the name of the downloaded fileName | [optional] 
| **locale** | **String**| The locale for the requested file when downloading or for redacting sensitive information in requested files, as an ISO 639-1 code | [optional] 
| **mediaFormats** | [**List&lt;String&gt;**](String)| All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 | [optional] 
{: class="table-striped"}


### Return type

[**Recording**](Recording)


# **getConversationRecordingAnnotation**


> [Annotation](Annotation) getConversationRecordingAnnotation(conversationId, recordingId, annotationId)

Get annotation

Wraps GET /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}  

Requires ANY permissions: 

* recording:annotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
try {
    Annotation result = apiInstance.getConversationRecordingAnnotation(conversationId, recordingId, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingAnnotation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
| **annotationId** | **String**| Annotation ID | 
{: class="table-striped"}


### Return type

[**Annotation**](Annotation)


# **getConversationRecordingAnnotations**


> [List&lt;Annotation&gt;](Annotation) getConversationRecordingAnnotations(conversationId, recordingId)

Get annotations for recording

Wraps GET /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations  

Requires ANY permissions: 

* recording:annotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
try {
    List<Annotation> result = apiInstance.getConversationRecordingAnnotations(conversationId, recordingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingAnnotations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
{: class="table-striped"}


### Return type

[**List&lt;Annotation&gt;**](Annotation)


# **getConversationRecordingmetadata**


> [List&lt;RecordingMetadata&gt;](RecordingMetadata) getConversationRecordingmetadata(conversationId)

Get recording metadata for a conversation. Does not return playable media nor system annotations. Bookmark annotations will be excluded if either recording:recording:view or recording:annotation:view permission is missing.

Wraps GET /api/v2/conversations/{conversationId}/recordingmetadata  

Requires ANY permissions: 

* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
try {
    List<RecordingMetadata> result = apiInstance.getConversationRecordingmetadata(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingmetadata");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
{: class="table-striped"}


### Return type

[**List&lt;RecordingMetadata&gt;**](RecordingMetadata)


# **getConversationRecordingmetadataRecordingId**


> [RecordingMetadata](RecordingMetadata) getConversationRecordingmetadataRecordingId(conversationId, recordingId)

Get metadata for a specific recording. Does not return playable media.

Wraps GET /api/v2/conversations/{conversationId}/recordingmetadata/{recordingId}  

Requires ANY permissions: 

* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
try {
    RecordingMetadata result = apiInstance.getConversationRecordingmetadataRecordingId(conversationId, recordingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordingmetadataRecordingId");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
{: class="table-striped"}


### Return type

[**RecordingMetadata**](RecordingMetadata)


# **getConversationRecordings**


> [List&lt;Recording&gt;](Recording) getConversationRecordings(conversationId, maxWaitMs, formatId, mediaFormats, locale, includePauseAnnotationsForScreenRecordings)

Get all of a Conversation's Recordings.

Wraps GET /api/v2/conversations/{conversationId}/recordings  

Requires ANY permissions: 

* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
Integer maxWaitMs = 5000; // Integer | The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value.
String formatId = "WEBM"; // String | The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE.
List<String> mediaFormats = Arrays.asList(null); // List<String> | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3.
String locale = "locale_example"; // String | The locale used for redacting sensitive information in requested files, as an ISO 639-1 code
Boolean includePauseAnnotationsForScreenRecordings = false; // Boolean | Include applicable Secure Pause annotations from all audio recordings to all screen recordings
try {
    List<Recording> result = apiInstance.getConversationRecordings(conversationId, maxWaitMs, formatId, mediaFormats, locale, includePauseAnnotationsForScreenRecordings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getConversationRecordings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **maxWaitMs** | **Integer**| The maximum number of milliseconds to wait for the recording to be ready. Must be a positive value. | [optional] [default to 5000] 
| **formatId** | **String**| The desired media format. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3,NONE. | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE 
| **mediaFormats** | [**List&lt;String&gt;**](String)| All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3. | [optional] 
| **locale** | **String**| The locale used for redacting sensitive information in requested files, as an ISO 639-1 code | [optional] 
| **includePauseAnnotationsForScreenRecordings** | **Boolean**| Include applicable Secure Pause annotations from all audio recordings to all screen recordings | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**List&lt;Recording&gt;**](Recording)


# **getOrphanrecording**


> [OrphanRecording](OrphanRecording) getOrphanrecording(orphanId)

Gets a single orphan recording

Wraps GET /api/v2/orphanrecordings/{orphanId}  

Requires ANY permissions: 

* recording:orphan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
try {
    OrphanRecording result = apiInstance.getOrphanrecording(orphanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanrecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orphanId** | **String**| Orphan ID | 
{: class="table-striped"}


### Return type

[**OrphanRecording**](OrphanRecording)


# **getOrphanrecordingMedia**


> [Recording](Recording) getOrphanrecordingMedia(orphanId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats)

Gets the media of a single orphan recording

A 202 response means the orphaned media is currently transcoding and will be available shortly.A 200 response denotes the transcoded orphan media is available now and is contained in the response body.

Wraps GET /api/v2/orphanrecordings/{orphanId}/media  

Requires ANY permissions: 

* recording:orphan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
String formatId = "WEBM"; // String | The desired media format.
String emailFormatId = "EML"; // String | The desired media format when downloading an email recording.
String chatFormatId = "ZIP"; // String | The desired media format when downloading a chat recording.
String messageFormatId = "ZIP"; // String | The desired media format when downloading a message recording.
Boolean download = false; // Boolean | requesting a download format of the recording
String fileName = "fileName_example"; // String | the name of the downloaded fileName
String locale = "locale_example"; // String | The locale for the requested file when downloading, as an ISO 639-1 code
List<String> mediaFormats = Arrays.asList(null); // List<String> | All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3
try {
    Recording result = apiInstance.getOrphanrecordingMedia(orphanId, formatId, emailFormatId, chatFormatId, messageFormatId, download, fileName, locale, mediaFormats);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanrecordingMedia");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orphanId** | **String**| Orphan ID | 
| **formatId** | **String**| The desired media format. | [optional] [default to WEBM]<br />**Values**: WAV, WEBM, WAV_ULAW, OGG_VORBIS, OGG_OPUS, MP3, NONE 
| **emailFormatId** | **String**| The desired media format when downloading an email recording. | [optional] [default to EML]<br />**Values**: EML, NONE 
| **chatFormatId** | **String**| The desired media format when downloading a chat recording. | [optional] [default to ZIP]<br />**Values**: ZIP, NONE 
| **messageFormatId** | **String**| The desired media format when downloading a message recording. | [optional] [default to ZIP]<br />**Values**: ZIP, NONE 
| **download** | **Boolean**| requesting a download format of the recording | [optional] [default to false]<br />**Values**: true, false 
| **fileName** | **String**| the name of the downloaded fileName | [optional] 
| **locale** | **String**| The locale for the requested file when downloading, as an ISO 639-1 code | [optional] 
| **mediaFormats** | [**List&lt;String&gt;**](String)| All acceptable media formats. Overrides formatId. Valid values:WAV,WEBM,WAV_ULAW,OGG_VORBIS,OGG_OPUS,MP3 | [optional] 
{: class="table-striped"}


### Return type

[**Recording**](Recording)


# **getOrphanrecordings**


> [OrphanRecordingListing](OrphanRecordingListing) getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, hasConversation, media)

Gets all orphan recordings

Wraps GET /api/v2/orphanrecordings  

Requires ANY permissions: 

* recording:orphan:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
Boolean hasConversation = false; // Boolean | Filter resulting orphans by whether the conversation is known. False returns all orphans for the organization.
String media = "media_example"; // String | Filter resulting orphans based on their media type
try {
    OrphanRecordingListing result = apiInstance.getOrphanrecordings(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, hasConversation, media);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getOrphanrecordings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **hasConversation** | **Boolean**| Filter resulting orphans by whether the conversation is known. False returns all orphans for the organization. | [optional] [default to false] 
| **media** | **String**| Filter resulting orphans based on their media type | [optional]<br />**Values**: Call, Screen 
{: class="table-striped"}


### Return type

[**OrphanRecordingListing**](OrphanRecordingListing)


# **getRecordingBatchrequest**


> [BatchDownloadJobStatusResult](BatchDownloadJobStatusResult) getRecordingBatchrequest(jobId)

Get the status and results for a batch request job, only the user that submitted the job may retrieve results. Each result may contain either a URL to a recording or an error; additionally, a recording could be associated with multiple results.

Wraps GET /api/v2/recording/batchrequests/{jobId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
try {
    BatchDownloadJobStatusResult result = apiInstance.getRecordingBatchrequest(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingBatchrequest");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**BatchDownloadJobStatusResult**](BatchDownloadJobStatusResult)


# **getRecordingCrossplatformMediaretentionpolicies**


> [PolicyEntityListing](PolicyEntityListing) getRecordingCrossplatformMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold)

Gets media retention policy list with query options to filter on name and enabled.

for a less verbose response, add summary=true to this endpoint

Wraps GET /api/v2/recording/crossplatform/mediaretentionpolicies  

Requires ANY permissions: 

* recording:crossPlatformRetentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | the policy name - used for filtering results in searches.
Boolean enabled = true; // Boolean | checks to see if policy is enabled - use enabled = true or enabled = false
Boolean summary = false; // Boolean | provides a less verbose response of policy lists.
Boolean hasErrors = true; // Boolean | provides a way to fetch all policies with errors or policies that do not have errors
Integer deleteDaysThreshold = 56; // Integer | provides a way to fetch all policies with any actions having deleteDays exceeding the provided value
try {
    PolicyEntityListing result = apiInstance.getRecordingCrossplatformMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingCrossplatformMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **name** | **String**| the policy name - used for filtering results in searches. | [optional] 
| **enabled** | **Boolean**| checks to see if policy is enabled - use enabled &#x3D; true or enabled &#x3D; false | [optional] 
| **summary** | **Boolean**| provides a less verbose response of policy lists. | [optional] [default to false] 
| **hasErrors** | **Boolean**| provides a way to fetch all policies with errors or policies that do not have errors | [optional] 
| **deleteDaysThreshold** | **Integer**| provides a way to fetch all policies with any actions having deleteDays exceeding the provided value | [optional] 
{: class="table-striped"}


### Return type

[**PolicyEntityListing**](PolicyEntityListing)


# **getRecordingCrossplatformMediaretentionpolicy**


> [CrossPlatformPolicy](CrossPlatformPolicy) getRecordingCrossplatformMediaretentionpolicy(policyId)

Get a media retention policy

Wraps GET /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:crossPlatformRetentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    CrossPlatformPolicy result = apiInstance.getRecordingCrossplatformMediaretentionpolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
{: class="table-striped"}


### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy)


# **getRecordingJob**


> [RecordingJob](RecordingJob) getRecordingJob(jobId)

Get the status of the job associated with the job id.

Wraps GET /api/v2/recording/jobs/{jobId}  

Requires ALL permissions: 

* recording:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
try {
    RecordingJob result = apiInstance.getRecordingJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
{: class="table-striped"}


### Return type

[**RecordingJob**](RecordingJob)


# **getRecordingJobFailedrecordings**


> [FailedRecordingEntityListing](FailedRecordingEntityListing) getRecordingJobFailedrecordings(jobId, pageSize, pageNumber, includeTotal, cursor)

Get IDs of recordings that the bulk job failed for

Wraps GET /api/v2/recording/jobs/{jobId}/failedrecordings  

Requires ALL permissions: 

* recording:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
Integer pageSize = 25; // Integer | Page size. Maximum is 100.
Integer pageNumber = 1; // Integer | Page number
Boolean includeTotal = true; // Boolean | If false, cursor will be used to locate the page instead of pageNumber. It is recommended to set it to false for improved performance.
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
try {
    FailedRecordingEntityListing result = apiInstance.getRecordingJobFailedrecordings(jobId, pageSize, pageNumber, includeTotal, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingJobFailedrecordings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **pageSize** | **Integer**| Page size. Maximum is 100. | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **includeTotal** | **Boolean**| If false, cursor will be used to locate the page instead of pageNumber. It is recommended to set it to false for improved performance. | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page) | [optional] 
{: class="table-striped"}


### Return type

[**FailedRecordingEntityListing**](FailedRecordingEntityListing)


# **getRecordingJobs**


> [RecordingJobEntityListing](RecordingJobEntityListing) getRecordingJobs(pageSize, pageNumber, sortBy, state, showOnlyMyJobs, jobType, includeTotal, cursor)

Get the status of all jobs within the user's organization

Wraps GET /api/v2/recording/jobs  

Requires ALL permissions: 

* recording:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
String sortBy = "userId"; // String | Sort by
String state = "state_example"; // String | Filter by state
Boolean showOnlyMyJobs = true; // Boolean | Show only my jobs
String jobType = "jobType_example"; // String | Job Type (Can be left empty for both)
Boolean includeTotal = true; // Boolean | If false, cursor will be used to locate the page instead of pageNumber. It is recommended to set it to false for improved performance.
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
try {
    RecordingJobEntityListing result = apiInstance.getRecordingJobs(pageSize, pageNumber, sortBy, state, showOnlyMyJobs, jobType, includeTotal, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **sortBy** | **String**| Sort by | [optional] [default to userId]<br />**Values**: userId, dateCreated 
| **state** | **String**| Filter by state | [optional]<br />**Values**: FULFILLED, PENDING, READY, PROCESSING, CANCELLED, FAILED 
| **showOnlyMyJobs** | **Boolean**| Show only my jobs | [optional] 
| **jobType** | **String**| Job Type (Can be left empty for both) | [optional]<br />**Values**: ARCHIVE, DELETE, EXPORT 
| **includeTotal** | **Boolean**| If false, cursor will be used to locate the page instead of pageNumber. It is recommended to set it to false for improved performance. | [optional] 
| **cursor** | **String**| Indicates where to resume query results (not required for first page) | [optional] 
{: class="table-striped"}


### Return type

[**RecordingJobEntityListing**](RecordingJobEntityListing)


# **getRecordingKeyconfiguration**


> [RecordingEncryptionConfiguration](RecordingEncryptionConfiguration) getRecordingKeyconfiguration(keyConfigurationId)

Get the encryption key configurations

Wraps GET /api/v2/recording/keyconfigurations/{keyConfigurationId}  

Requires ANY permissions: 

* recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String keyConfigurationId = "keyConfigurationId_example"; // String | Key Configurations Id
try {
    RecordingEncryptionConfiguration result = apiInstance.getRecordingKeyconfiguration(keyConfigurationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingKeyconfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyConfigurationId** | **String**| Key Configurations Id | 
{: class="table-striped"}


### Return type

[**RecordingEncryptionConfiguration**](RecordingEncryptionConfiguration)


# **getRecordingKeyconfigurations**


> [RecordingEncryptionConfigurationListing](RecordingEncryptionConfigurationListing) getRecordingKeyconfigurations()

Get a list of key configurations data

Wraps GET /api/v2/recording/keyconfigurations  

Requires ANY permissions: 

* recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
try {
    RecordingEncryptionConfigurationListing result = apiInstance.getRecordingKeyconfigurations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingKeyconfigurations");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**RecordingEncryptionConfigurationListing**](RecordingEncryptionConfigurationListing)


# **getRecordingMediaretentionpolicies**


> [PolicyEntityListing](PolicyEntityListing) getRecordingMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold)

Gets media retention policy list with query options to filter on name and enabled.

for a less verbose response, add summary=true to this endpoint

Wraps GET /api/v2/recording/mediaretentionpolicies  

Requires ANY permissions: 

* recording:retentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
List<String> expand = Arrays.asList(null); // List<String> | variable name requested by expand list
String nextPage = "nextPage_example"; // String | next page token
String previousPage = "previousPage_example"; // String | Previous page token
String name = "name_example"; // String | the policy name - used for filtering results in searches.
Boolean enabled = true; // Boolean | checks to see if policy is enabled - use enabled = true or enabled = false
Boolean summary = false; // Boolean | provides a less verbose response of policy lists.
Boolean hasErrors = true; // Boolean | provides a way to fetch all policies with errors or policies that do not have errors
Integer deleteDaysThreshold = 56; // Integer | provides a way to fetch all policies with any actions having deleteDays exceeding the provided value
try {
    PolicyEntityListing result = apiInstance.getRecordingMediaretentionpolicies(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, enabled, summary, hasErrors, deleteDaysThreshold);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **expand** | [**List&lt;String&gt;**](String)| variable name requested by expand list | [optional] 
| **nextPage** | **String**| next page token | [optional] 
| **previousPage** | **String**| Previous page token | [optional] 
| **name** | **String**| the policy name - used for filtering results in searches. | [optional] 
| **enabled** | **Boolean**| checks to see if policy is enabled - use enabled &#x3D; true or enabled &#x3D; false | [optional] 
| **summary** | **Boolean**| provides a less verbose response of policy lists. | [optional] [default to false] 
| **hasErrors** | **Boolean**| provides a way to fetch all policies with errors or policies that do not have errors | [optional] 
| **deleteDaysThreshold** | **Integer**| provides a way to fetch all policies with any actions having deleteDays exceeding the provided value | [optional] 
{: class="table-striped"}


### Return type

[**PolicyEntityListing**](PolicyEntityListing)


# **getRecordingMediaretentionpolicy**


> [Policy](Policy) getRecordingMediaretentionpolicy(policyId)

Get a media retention policy

Wraps GET /api/v2/recording/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:retentionPolicy:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
try {
    Policy result = apiInstance.getRecordingMediaretentionpolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
{: class="table-striped"}


### Return type

[**Policy**](Policy)


# **getRecordingRecordingkeys**


> [EncryptionKeyEntityListing](EncryptionKeyEntityListing) getRecordingRecordingkeys(pageSize, pageNumber)

Get encryption key list

Wraps GET /api/v2/recording/recordingkeys  

Requires ANY permissions: 

* recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer pageSize = 25; // Integer | Page size
Integer pageNumber = 1; // Integer | Page number
try {
    EncryptionKeyEntityListing result = apiInstance.getRecordingRecordingkeys(pageSize, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingRecordingkeys");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
{: class="table-striped"}


### Return type

[**EncryptionKeyEntityListing**](EncryptionKeyEntityListing)


# **getRecordingRecordingkeysRotationschedule**


> [KeyRotationSchedule](KeyRotationSchedule) getRecordingRecordingkeysRotationschedule()

Get key rotation schedule

Wraps GET /api/v2/recording/recordingkeys/rotationschedule  

Requires ANY permissions: 

* recording:encryptionKey:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
try {
    KeyRotationSchedule result = apiInstance.getRecordingRecordingkeysRotationschedule();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingRecordingkeysRotationschedule");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**KeyRotationSchedule**](KeyRotationSchedule)


# **getRecordingSettings**


> [RecordingSettings](RecordingSettings) getRecordingSettings(createDefault)

Get the Recording Settings for the Organization

Wraps GET /api/v2/recording/settings  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Boolean createDefault = false; // Boolean | If no settings are found, a new one is created with default values
try {
    RecordingSettings result = apiInstance.getRecordingSettings(createDefault);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createDefault** | **Boolean**| If no settings are found, a new one is created with default values | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**RecordingSettings**](RecordingSettings)


# **getRecordingUploadsReport**


> [RecordingUploadReport](RecordingUploadReport) getRecordingUploadsReport(reportId)

Get the status of a recording upload status report

Wraps GET /api/v2/recording/uploads/reports/{reportId}  

Requires ALL permissions: 

* recording:uploadReport:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String reportId = "reportId_example"; // String | reportId
try {
    RecordingUploadReport result = apiInstance.getRecordingUploadsReport(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingUploadsReport");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportId** | **String**| reportId | 
{: class="table-striped"}


### Return type

[**RecordingUploadReport**](RecordingUploadReport)


# **getRecordingsRetentionQuery**


> [RecordingRetentionCursorEntityListing](RecordingRetentionCursorEntityListing) getRecordingsRetentionQuery(retentionThresholdDays, cursor, pageSize)

Query for recording retention data

Wraps GET /api/v2/recordings/retention/query  

Requires ANY permissions: 

* recording:recording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Integer retentionThresholdDays = 56; // Integer | Fetch retention data for recordings retained for more days than the provided value.
String cursor = "cursor_example"; // String | Indicates where to resume query results (not required for first page)
Integer pageSize = 25; // Integer | Page size. Maximum is 500.
try {
    RecordingRetentionCursorEntityListing result = apiInstance.getRecordingsRetentionQuery(retentionThresholdDays, cursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingsRetentionQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **retentionThresholdDays** | **Integer**| Fetch retention data for recordings retained for more days than the provided value. | 
| **cursor** | **String**| Indicates where to resume query results (not required for first page) | [optional] 
| **pageSize** | **Integer**| Page size. Maximum is 500. | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**RecordingRetentionCursorEntityListing**](RecordingRetentionCursorEntityListing)


# **getRecordingsScreensessionsDetails**


> [ScreenRecordingActiveSessions](ScreenRecordingActiveSessions) getRecordingsScreensessionsDetails()

Retrieves an object containing the total number of concurrent active screen recordings

Wraps GET /api/v2/recordings/screensessions/details  

Requires ANY permissions: 

* recording:screenRecording:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
try {
    ScreenRecordingActiveSessions result = apiInstance.getRecordingsScreensessionsDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#getRecordingsScreensessionsDetails");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**ScreenRecordingActiveSessions**](ScreenRecordingActiveSessions)


# **patchRecordingCrossplatformMediaretentionpolicy**


> [CrossPlatformPolicy](CrossPlatformPolicy) patchRecordingCrossplatformMediaretentionpolicy(policyId, body)

Patch a media retention policy

Wraps PATCH /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:crossPlatformRetentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
CrossPlatformPolicyUpdate body = new CrossPlatformPolicyUpdate(); // CrossPlatformPolicyUpdate | Policy
try {
    CrossPlatformPolicy result = apiInstance.patchRecordingCrossplatformMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#patchRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
| **body** | [**CrossPlatformPolicyUpdate**](CrossPlatformPolicyUpdate)| Policy | 
{: class="table-striped"}


### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy)


# **patchRecordingMediaretentionpolicy**


> [Policy](Policy) patchRecordingMediaretentionpolicy(policyId, body)

Patch a media retention policy

Wraps PATCH /api/v2/recording/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:retentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
PolicyUpdate body = new PolicyUpdate(); // PolicyUpdate | Policy
try {
    Policy result = apiInstance.patchRecordingMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#patchRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
| **body** | [**PolicyUpdate**](PolicyUpdate)| Policy | 
{: class="table-striped"}


### Return type

[**Policy**](Policy)


# **postConversationRecordingAnnotations**


> [Annotation](Annotation) postConversationRecordingAnnotations(conversationId, recordingId, body)

Create annotation

Wraps POST /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations  

Requires ANY permissions: 

* recording:annotation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
Annotation body = new Annotation(); // Annotation | annotation
try {
    Annotation result = apiInstance.postConversationRecordingAnnotations(conversationId, recordingId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postConversationRecordingAnnotations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
| **body** | [**Annotation**](Annotation)| annotation | 
{: class="table-striped"}


### Return type

[**Annotation**](Annotation)


# **postRecordingBatchrequests**


> [BatchDownloadJobSubmissionResult](BatchDownloadJobSubmissionResult) postRecordingBatchrequests(body)

Submit a batch download request for recordings. Recordings in response will be in their original format/codec - configured in the Trunk configuration.

Wraps POST /api/v2/recording/batchrequests  

Requires ANY permissions: 

* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
BatchDownloadJobSubmission body = new BatchDownloadJobSubmission(); // BatchDownloadJobSubmission | Job submission criteria
try {
    BatchDownloadJobSubmissionResult result = apiInstance.postRecordingBatchrequests(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingBatchrequests");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**BatchDownloadJobSubmission**](BatchDownloadJobSubmission)| Job submission criteria | 
{: class="table-striped"}


### Return type

[**BatchDownloadJobSubmissionResult**](BatchDownloadJobSubmissionResult)


# **postRecordingCrossplatformMediaretentionpolicies**


> [CrossPlatformPolicy](CrossPlatformPolicy) postRecordingCrossplatformMediaretentionpolicies(body)

Create media retention policy

Policy does not work retroactively

Wraps POST /api/v2/recording/crossplatform/mediaretentionpolicies  

Requires ANY permissions: 

* recording:crossPlatformRetentionPolicy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
CrossPlatformPolicyCreate body = new CrossPlatformPolicyCreate(); // CrossPlatformPolicyCreate | Policy
try {
    CrossPlatformPolicy result = apiInstance.postRecordingCrossplatformMediaretentionpolicies(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingCrossplatformMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CrossPlatformPolicyCreate**](CrossPlatformPolicyCreate)| Policy | 
{: class="table-striped"}


### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy)


# **postRecordingJobs**


> [RecordingJob](RecordingJob) postRecordingJobs(body)

Create a recording bulk job.

Each organization can run up to a maximum of two concurrent jobs that are either in pending or processing state. Furthermore, the recording:recording:viewSensitiveData permission is required to access recordings with PCI DSS and/or PII data when redaction is enabled for their organization. If the requester does not have that permission and includeRecordingsWithSensitiveData is set to true, then their request will be rejected. It is recommended to query over smaller time periods so your request does not time out.

Wraps POST /api/v2/recording/jobs  

Requires ALL permissions: 

* recording:job:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
RecordingJobsQuery body = new RecordingJobsQuery(); // RecordingJobsQuery | query
try {
    RecordingJob result = apiInstance.postRecordingJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RecordingJobsQuery**](RecordingJobsQuery)| query | 
{: class="table-striped"}


### Return type

[**RecordingJob**](RecordingJob)


# **postRecordingKeyconfigurations**


> [RecordingEncryptionConfiguration](RecordingEncryptionConfiguration) postRecordingKeyconfigurations(body)

Setup configurations for encryption key creation

Wraps POST /api/v2/recording/keyconfigurations  

Requires ANY permissions: 

* recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
RecordingEncryptionConfiguration body = new RecordingEncryptionConfiguration(); // RecordingEncryptionConfiguration | Encryption Configuration
try {
    RecordingEncryptionConfiguration result = apiInstance.postRecordingKeyconfigurations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingKeyconfigurations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RecordingEncryptionConfiguration**](RecordingEncryptionConfiguration)| Encryption Configuration | 
{: class="table-striped"}


### Return type

[**RecordingEncryptionConfiguration**](RecordingEncryptionConfiguration)


# **postRecordingKeyconfigurationsValidate**


> [RecordingEncryptionConfiguration](RecordingEncryptionConfiguration) postRecordingKeyconfigurationsValidate(body)

Validate encryption key configurations without saving it

Wraps POST /api/v2/recording/keyconfigurations/validate  

Requires ANY permissions: 

* recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
RecordingEncryptionConfiguration body = new RecordingEncryptionConfiguration(); // RecordingEncryptionConfiguration | Encryption Configuration
try {
    RecordingEncryptionConfiguration result = apiInstance.postRecordingKeyconfigurationsValidate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingKeyconfigurationsValidate");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RecordingEncryptionConfiguration**](RecordingEncryptionConfiguration)| Encryption Configuration | 
{: class="table-striped"}


### Return type

[**RecordingEncryptionConfiguration**](RecordingEncryptionConfiguration)


# **postRecordingLocalkeys**


> [EncryptionKey](EncryptionKey) postRecordingLocalkeys(body)

create a local key management recording key

Wraps POST /api/v2/recording/localkeys  

Requires ANY permissions: 

* recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
LocalEncryptionKeyRequest body = new LocalEncryptionKeyRequest(); // LocalEncryptionKeyRequest | Local Encryption body
try {
    EncryptionKey result = apiInstance.postRecordingLocalkeys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingLocalkeys");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**LocalEncryptionKeyRequest**](LocalEncryptionKeyRequest)| Local Encryption body | 
{: class="table-striped"}


### Return type

[**EncryptionKey**](EncryptionKey)


# **postRecordingMediaretentionpolicies**


> [Policy](Policy) postRecordingMediaretentionpolicies(body)

Create media retention policy

Policy does not work retroactively

Wraps POST /api/v2/recording/mediaretentionpolicies  

Requires ANY permissions: 

* recording:retentionPolicy:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
PolicyCreate body = new PolicyCreate(); // PolicyCreate | Policy
try {
    Policy result = apiInstance.postRecordingMediaretentionpolicies(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingMediaretentionpolicies");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**PolicyCreate**](PolicyCreate)| Policy | 
{: class="table-striped"}


### Return type

[**Policy**](Policy)


# **postRecordingRecordingkeys**


> [EncryptionKey](EncryptionKey) postRecordingRecordingkeys()

Create encryption key

Wraps POST /api/v2/recording/recordingkeys  

Requires ANY permissions: 

* recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
try {
    EncryptionKey result = apiInstance.postRecordingRecordingkeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingRecordingkeys");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not require any parameters.



### Return type

[**EncryptionKey**](EncryptionKey)


# **postRecordingUploadsReports**


> [RecordingUploadReport](RecordingUploadReport) postRecordingUploadsReports(body)

Creates a recording upload status report

Wraps POST /api/v2/recording/uploads/reports  

Requires ALL permissions: 

* recording:uploadReport:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
RecordingUploadReportRequest body = new RecordingUploadReportRequest(); // RecordingUploadReportRequest | Report parameters
try {
    RecordingUploadReport result = apiInstance.postRecordingUploadsReports(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingUploadsReports");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RecordingUploadReportRequest**](RecordingUploadReportRequest)| Report parameters | 
{: class="table-striped"}


### Return type

[**RecordingUploadReport**](RecordingUploadReport)


# **postRecordingsDeletionprotection**


> [List&lt;AddressableEntityRef&gt;](AddressableEntityRef) postRecordingsDeletionprotection(body)

Get a list of conversations with protected recordings

Wraps POST /api/v2/recordings/deletionprotection  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
ConversationDeletionProtectionQuery body = new ConversationDeletionProtectionQuery(); // ConversationDeletionProtectionQuery | conversationIds
try {
    List<AddressableEntityRef> result = apiInstance.postRecordingsDeletionprotection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingsDeletionprotection");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ConversationDeletionProtectionQuery**](ConversationDeletionProtectionQuery)| conversationIds | 
{: class="table-striped"}


### Return type

[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef)


# **postRecordingsScreensessionsAcknowledge**


> Void postRecordingsScreensessionsAcknowledge(body)

Acknowledge a screen recording.

Wraps POST /api/v2/recordings/screensessions/acknowledge  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
AcknowledgeScreenRecordingRequest body = new AcknowledgeScreenRecordingRequest(); // AcknowledgeScreenRecordingRequest | AcknowledgeScreenRecordingRequest
try {
    apiInstance.postRecordingsScreensessionsAcknowledge(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingsScreensessionsAcknowledge");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AcknowledgeScreenRecordingRequest**](AcknowledgeScreenRecordingRequest)| AcknowledgeScreenRecordingRequest | 
{: class="table-striped"}


### Return type

null (empty response body)


# **postRecordingsScreensessionsMetadata**


> Void postRecordingsScreensessionsMetadata(body)

Provide meta-data a screen recording.

Wraps POST /api/v2/recordings/screensessions/metadata  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
ScreenRecordingMetaDataRequest body = new ScreenRecordingMetaDataRequest(); // ScreenRecordingMetaDataRequest | ScreenRecordingMetaDataRequest
try {
    apiInstance.postRecordingsScreensessionsMetadata(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#postRecordingsScreensessionsMetadata");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**ScreenRecordingMetaDataRequest**](ScreenRecordingMetaDataRequest)| ScreenRecordingMetaDataRequest | 
{: class="table-striped"}


### Return type

null (empty response body)


# **putConversationRecording**


> [Recording](Recording) putConversationRecording(conversationId, recordingId, body, clearExport)

Updates the retention records on a recording.

Currently supports updating and removing both archive and delete dates for eligible recordings. A request to change the archival date of an archived recording will result in a restoration of the recording until the new date set. The recording:recording:view permission is required for the recording, as well as either the recording:recording:editRetention or recording:screenRecording:editRetention permissions depending on the type of recording.

Wraps PUT /api/v2/conversations/{conversationId}/recordings/{recordingId}  

Requires ANY permissions: 

* recording:recording:view
* recording:recording:editRetention
* recording:screenRecording:editRetention

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
Recording body = new Recording(); // Recording | recording
Boolean clearExport = true; // Boolean | Whether to clear the pending export for the recording
try {
    Recording result = apiInstance.putConversationRecording(conversationId, recordingId, body, clearExport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putConversationRecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
| **body** | [**Recording**](Recording)| recording | 
| **clearExport** | **Boolean**| Whether to clear the pending export for the recording | [optional] 
{: class="table-striped"}


### Return type

[**Recording**](Recording)


# **putConversationRecordingAnnotation**


> [Annotation](Annotation) putConversationRecordingAnnotation(conversationId, recordingId, annotationId, body)

Update annotation

Wraps PUT /api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}  

Requires ANY permissions: 

* recording:annotation:edit
* recording:recording:view
* recording:recordingSegment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String conversationId = "conversationId_example"; // String | Conversation ID
String recordingId = "recordingId_example"; // String | Recording ID
String annotationId = "annotationId_example"; // String | Annotation ID
Annotation body = new Annotation(); // Annotation | annotation
try {
    Annotation result = apiInstance.putConversationRecordingAnnotation(conversationId, recordingId, annotationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putConversationRecordingAnnotation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationId** | **String**| Conversation ID | 
| **recordingId** | **String**| Recording ID | 
| **annotationId** | **String**| Annotation ID | 
| **body** | [**Annotation**](Annotation)| annotation | 
{: class="table-striped"}


### Return type

[**Annotation**](Annotation)


# **putOrphanrecording**


> [Recording](Recording) putOrphanrecording(orphanId, body)

Updates an orphan recording to a regular recording with retention values

If this operation is successful the orphan will no longer exist. It will be replaced by the resulting recording in the response. This replacement recording is accessible by the normal Recording api.

Wraps PUT /api/v2/orphanrecordings/{orphanId}  

Requires ANY permissions: 

* recording:orphan:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String orphanId = "orphanId_example"; // String | Orphan ID
OrphanUpdateRequest body = new OrphanUpdateRequest(); // OrphanUpdateRequest | 
try {
    Recording result = apiInstance.putOrphanrecording(orphanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putOrphanrecording");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orphanId** | **String**| Orphan ID | 
| **body** | [**OrphanUpdateRequest**](OrphanUpdateRequest)|  | [optional] 
{: class="table-striped"}


### Return type

[**Recording**](Recording)


# **putRecordingCrossplatformMediaretentionpolicy**


> [CrossPlatformPolicy](CrossPlatformPolicy) putRecordingCrossplatformMediaretentionpolicy(policyId, body)

Update a media retention policy

Policy does not work retroactively

Wraps PUT /api/v2/recording/crossplatform/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:crossPlatformRetentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
CrossPlatformPolicy body = new CrossPlatformPolicy(); // CrossPlatformPolicy | Policy
try {
    CrossPlatformPolicy result = apiInstance.putRecordingCrossplatformMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingCrossplatformMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
| **body** | [**CrossPlatformPolicy**](CrossPlatformPolicy)| Policy | 
{: class="table-striped"}


### Return type

[**CrossPlatformPolicy**](CrossPlatformPolicy)


# **putRecordingJob**


> [RecordingJob](RecordingJob) putRecordingJob(jobId, body)

Execute the recording bulk job.

Each organization can run up to a maximum of two concurrent jobs that are either in pending or processing state. A job must be executed by the same user whom originally created the job.  In addition, the user must have permission to update the recording's retention.

Wraps PUT /api/v2/recording/jobs/{jobId}  

Requires ALL permissions: 

* recording:job:edit
* recording:recording:editRetention
* recording:screenRecording:editRetention

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String jobId = "jobId_example"; // String | jobId
ExecuteRecordingJobsQuery body = new ExecuteRecordingJobsQuery(); // ExecuteRecordingJobsQuery | query
try {
    RecordingJob result = apiInstance.putRecordingJob(jobId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| jobId | 
| **body** | [**ExecuteRecordingJobsQuery**](ExecuteRecordingJobsQuery)| query | 
{: class="table-striped"}


### Return type

[**RecordingJob**](RecordingJob)


# **putRecordingKeyconfiguration**


> [RecordingEncryptionConfiguration](RecordingEncryptionConfiguration) putRecordingKeyconfiguration(keyConfigurationId, body)

Update the encryption key configurations

Wraps PUT /api/v2/recording/keyconfigurations/{keyConfigurationId}  

Requires ANY permissions: 

* recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String keyConfigurationId = "keyConfigurationId_example"; // String | Key Configurations Id
RecordingEncryptionConfiguration body = new RecordingEncryptionConfiguration(); // RecordingEncryptionConfiguration | Encryption key configuration metadata
try {
    RecordingEncryptionConfiguration result = apiInstance.putRecordingKeyconfiguration(keyConfigurationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingKeyconfiguration");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **keyConfigurationId** | **String**| Key Configurations Id | 
| **body** | [**RecordingEncryptionConfiguration**](RecordingEncryptionConfiguration)| Encryption key configuration metadata | 
{: class="table-striped"}


### Return type

[**RecordingEncryptionConfiguration**](RecordingEncryptionConfiguration)


# **putRecordingMediaretentionpolicy**


> [Policy](Policy) putRecordingMediaretentionpolicy(policyId, body)

Update a media retention policy

Policy does not work retroactively. In the conditions.forUsers section, each user object can include the 'id' field containing the user's unique identifier. Example: [{\"id\":\"<userId>\"}].

Wraps PUT /api/v2/recording/mediaretentionpolicies/{policyId}  

Requires ANY permissions: 

* recording:retentionPolicy:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
String policyId = "policyId_example"; // String | Policy ID
Policy body = new Policy(); // Policy | Policy
try {
    Policy result = apiInstance.putRecordingMediaretentionpolicy(policyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingMediaretentionpolicy");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **policyId** | **String**| Policy ID | 
| **body** | [**Policy**](Policy)| Policy | 
{: class="table-striped"}


### Return type

[**Policy**](Policy)


# **putRecordingRecordingkeysRotationschedule**


> [KeyRotationSchedule](KeyRotationSchedule) putRecordingRecordingkeysRotationschedule(body)

Update key rotation schedule

Wraps PUT /api/v2/recording/recordingkeys/rotationschedule  

Requires ANY permissions: 

* recording:encryptionKey:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
KeyRotationSchedule body = new KeyRotationSchedule(); // KeyRotationSchedule | KeyRotationSchedule
try {
    KeyRotationSchedule result = apiInstance.putRecordingRecordingkeysRotationschedule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingRecordingkeysRotationschedule");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**KeyRotationSchedule**](KeyRotationSchedule)| KeyRotationSchedule | 
{: class="table-striped"}


### Return type

[**KeyRotationSchedule**](KeyRotationSchedule)


# **putRecordingSettings**


> [RecordingSettings](RecordingSettings) putRecordingSettings(body)

Update the Recording Settings for the Organization

Wraps PUT /api/v2/recording/settings  

Requires ANY permissions: 

* recording:settings:editScreenRecordings
* recording:settings:editRegionalStorage
* recording:settings:editUrlExpiration

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
RecordingSettings body = new RecordingSettings(); // RecordingSettings | Recording settings
try {
    RecordingSettings result = apiInstance.putRecordingSettings(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingSettings");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**RecordingSettings**](RecordingSettings)| Recording settings | 
{: class="table-striped"}


### Return type

[**RecordingSettings**](RecordingSettings)


# **putRecordingsDeletionprotection**


> Void putRecordingsDeletionprotection(protect, body)

Apply or revoke recording protection for conversations

Wraps PUT /api/v2/recordings/deletionprotection  

Requires ANY permissions: 

* recording:deletionProtection:apply
* recording:deletionProtection:revoke

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.RecordingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

RecordingApi apiInstance = new RecordingApi();
Boolean protect = true; // Boolean | Check for apply, uncheck for revoke (each action requires the respective permission)
ConversationDeletionProtectionQuery body = new ConversationDeletionProtectionQuery(); // ConversationDeletionProtectionQuery | 
try {
    apiInstance.putRecordingsDeletionprotection(protect, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RecordingApi#putRecordingsDeletionprotection");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **protect** | **Boolean**| Check for apply, uncheck for revoke (each action requires the respective permission) | [optional] [default to true] 
| **body** | [**ConversationDeletionProtectionQuery**](ConversationDeletionProtectionQuery)|  | [optional] 
{: class="table-striped"}


### Return type

null (empty response body)


_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
