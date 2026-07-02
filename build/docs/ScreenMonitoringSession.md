# ScreenMonitoringSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sourceUser** | [**AddressableEntityRef**](AddressableEntityRef) | The user who initiated the screen monitoring session |  |
| **targetUser** | [**AddressableEntityRef**](AddressableEntityRef) | The user being monitored (for agent-level monitoring) |  [optional] |
| **conversation** | [**AddressableEntityRef**](AddressableEntityRef) | The conversation being monitored (for conversation-level monitoring) |  [optional] |
| **participantId** | **String** | The ID of the participant being monitored (for conversation-level monitoring) |  [optional] |
| **monitoringType** | [**MonitoringTypeEnum**](#Enum--MonitoringTypeEnum) | The type of screen monitoring session |  |
| **dateCreated** | [**Date**](Date) | The date and time when the screen monitoring session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **screenMonitoringId** | **String** | The unique identifier for this screen monitoring session |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: MonitoringTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTLEVEL | &quot;AgentLevel&quot; | 
| CONVERSATIONLEVEL | &quot;ConversationLevel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
