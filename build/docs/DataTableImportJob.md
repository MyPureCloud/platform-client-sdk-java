# DataTableImportJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **owner** | [**AddressableEntityRef**](AddressableEntityRef) | The PureCloud user who started the import job |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the import job |  |
| **dateCreated** | [**Date**](Date) | The timestamp of when the import began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | [**Date**](Date) | The timestamp of when the import stopped (either successfully or unsuccessfully). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **uploadURI** | **String** | The URL of the location at which the caller can upload the file to be imported |  [optional] |
| **importMode** | [**ImportModeEnum**](#Enum--ImportModeEnum) | The indication of whether the processing should remove rows that don't appear in the import file |  [optional] |
| **errorInformation** | [**ErrorBody**](ErrorBody) | Any error information, or null of the processing is not in an error state |  [optional] |
| **countRecordsUpdated** | **Integer** | The current count of the number of records processed |  [optional] |
| **countRecordsDeleted** | **Integer** | The current count of the number of records deleted |  [optional] |
| **countRecordsFailed** | **Integer** | The current count of the number of records that failed to import |  [optional] |
| **uploadHeaders** | **Map&lt;String, String&gt;** | Required headers when uploading a file through PUT request to the URL in the 'uploadURI' field |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WAITINGFORUPLOAD | &quot;WaitingForUpload&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| FAILED | &quot;Failed&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 


## Enum: ImportModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REPLACEALL | &quot;ReplaceAll&quot; | 
| APPEND | &quot;Append&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
