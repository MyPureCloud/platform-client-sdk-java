# EdgeLogsJobFile


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the entity. |  |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The resource's description. |  [optional] |
| **version** | **Integer** | The current version of the resource. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | **String** | The application that last modified the resource. |  [optional] |
| **createdByApp** | **String** | The application that created the resource. |  [optional] |
| **timeCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **timeModified** | [**Date**](Date) | The time this log file was last modified on the Edge. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **sizeBytes** | **Double** | The size of this file in bytes. |  [optional] |
| **uploadStatus** | [**UploadStatusEnum**](#Enum--UploadStatusEnum) | The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload. |  [optional] |
| **edgePath** | **String** | The path of this file on the Edge. |  [optional] |
| **downloadId** | **String** | The download ID to use with the downloads API. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 


## Enum: UploadStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPLOADING | &quot;UPLOADING&quot; | 
| NOT_UPLOADED | &quot;NOT_UPLOADED&quot; | 
| UPLOADED | &quot;UPLOADED&quot; | 
| ERROR_ON_UPLOAD | &quot;ERROR_ON_UPLOAD&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
