# ScreenMonitoring


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) | The initial connection state of this communication. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The connection state of this communication. |  [optional] |
| **segments** | [**List&lt;Segment&gt;**](Segment) | The time line of the participant's Screen Monitoring media, divided into activity segments. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **provider** | **String** | The source provider of Screen Monitoring media. |  [optional] |
| **targetUser** | [**AddressableEntityRef**](AddressableEntityRef) | The user participant who is being screen monitored. |  [optional] |
| **screenMonitoring** | [**AddressableEntityRef**](AddressableEntityRef) | Screen Monitoring identifier unique to the sourceUserId-targetUserId pair. |  [optional] |
| **monitoringType** | [**MonitoringTypeEnum**](#Enum--MonitoringTypeEnum) | The screen monitoring type. |  [optional] |
| **count** | **Long** | Number of Screen Monitoring sessions the targetUserId is involved in. |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: InitialStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;none&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: StateEnum

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




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
