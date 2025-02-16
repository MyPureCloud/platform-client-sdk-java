# UserRoutingStatusEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **String** | A unique (UUID) eventId for this event |  |
| **eventDateTime** | [**Date**](Date) | A timestamp as epoch representing the time this event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **agentId** | **String** | Unique identifier of the agent. |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The agent's current routing status. |  |
| **sourceId** | **String** | The agent's source platform Id. |  |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFQUEUE | &quot;OffQueue&quot; | 
| IDLE | &quot;Idle&quot; | 
| INTERACTING | &quot;Interacting&quot; | 
| COMMUNICATING | &quot;Communicating&quot; | 
| NOTRESPONDING | &quot;NotResponding&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
