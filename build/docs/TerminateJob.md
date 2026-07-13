# TerminateJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the Job. |  [optional] |
| **jobType** | [**JobTypeEnum**](#Enum--JobTypeEnum) | The type of the Job. |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The ID of the User who created this Job. |  [optional] |
| **dateCreated** | [**Date**](Date) | The Job creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The Job modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| QUEUED | &quot;Queued&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 


## Enum: JobTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| TERMINATE | &quot;Terminate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
