# QueueConversationEventTopicScreenMonitoring


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) |  |  [optional] |
| **provider** | **String** | The source provider. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **targetUserId** | **String** | The user ID for the participant who is being screen monitored. |  [optional] |
| **screenMonitoringId** | **String** | Screen Monitoring identifier unique to the sourceUserId-targetUserId pair. |  [optional] |
| **monitoringType** | [**MonitoringTypeEnum**](#Enum--MonitoringTypeEnum) | The screen monitoring type. |  [optional] |
| **count** | **Long** | Number of Screen Monitoring sessions the targetUserId is involved in. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;none&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: InitialStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;none&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SYSTEM | &quot;system&quot; | 


## Enum: MonitoringTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| AGENTLEVEL | &quot;AgentLevel&quot; | 
| CONVERSATIONLEVEL | &quot;ConversationLevel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
