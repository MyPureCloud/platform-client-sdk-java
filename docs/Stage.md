# Stage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Stage. |  [optional] |
| **description** | **String** | The description of the Stage. |  [optional] |
| **dateCreated** | [**Date**](Date) | The Stage creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The Stage modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | [**Date**](Date) | The Stage completion date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateStarted** | [**Date**](Date) | The Stage start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The ID of the User who modified the Stage. |  [optional] |
| **version** | **Integer** | The version of the Stage. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The Status of the Stage. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **_case** | [**CaseReference**](CaseReference) | The parent case of the Stage. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| OPEN | &quot;Open&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| TERMINATED | &quot;Terminated&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:254.0.0_
