# GetUploadSourceUrlJobStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the upload from URL job. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the upload job |  [optional] |
| **uploadKey** | **String** | Key that identifies the file in the storage including the file name |  [optional] |
| **errorInformation** | [**ErrorBody**](ErrorBody) | Any error information, or null of the processing is not in failed state. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
