# AssistantQueueUsersJobsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **selfUri** | **String** | The URI for this object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the job. |  [optional] |
| **errorInfo** | [**AssistantQueueUsersJobErrorInfo**](AssistantQueueUsersJobErrorInfo) | Error, if any, related to the job. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
