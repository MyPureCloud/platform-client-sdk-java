# OutcomeAttributionJobStateResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of job. |  [optional] |
| **resultsUri** | **String** | URI where the query results can be retrieved.  Populated when job has reached a terminal state, i.e. no longer Running. |  [optional] |
| **percentFailedThreshold** | **Integer** | Optional percent failed threshold for validation errors; if reached will halt the job. Default is 5 percent, allowed values 0 to 100. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **createdDate** | [**Date**](Date) | Date when the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| COMPLETEDWITHERRORS | &quot;CompletedWithErrors&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
