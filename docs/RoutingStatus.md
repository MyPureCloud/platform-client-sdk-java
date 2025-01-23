# RoutingStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | **String** | The userId of the agent |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Indicates the Routing State of the agent.  A value of OFF_QUEUE will be returned if the specified user does not exist. |  [optional] |
| **startTime** | [**Date**](Date) | The timestamp when the agent went into this state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFF_QUEUE | &quot;OFF_QUEUE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| INTERACTING | &quot;INTERACTING&quot; | 
| NOT_RESPONDING | &quot;NOT_RESPONDING&quot; | 
| COMMUNICATING | &quot;COMMUNICATING&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
