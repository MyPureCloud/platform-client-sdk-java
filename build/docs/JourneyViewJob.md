# JourneyViewJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **dateCreated** | [**Date**](Date) | Timestamp of execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateCompleted** | [**Date**](Date) | Timestamp of completion. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job |  |
| **journeyView** | [**JourneyView**](JourneyView) | The journey view for which the job is executed |  |
| **dateCompletionEstimated** | [**Date**](Date) | Timestamp for the estimated time of completion. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACCEPTED | &quot;Accepted&quot; | 
| EXECUTING | &quot;Executing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
