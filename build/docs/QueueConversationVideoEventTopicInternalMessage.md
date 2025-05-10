# QueueConversationVideoEventTopicInternalMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) |  |  [optional] |
| **provider** | **String** | The source provider of the message. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **targetUserId** | **String** | The user ID for the participant on receiving side of the internal message conversation. |  [optional] |
| **sourceUserId** | **String** | The user ID for the participant on sending side of the internal message conversation. |  [optional] |
| **toAddress** | [**QueueConversationVideoEventTopicAddress**](QueueConversationVideoEventTopicAddress) | Address and name data for a call endpoint. |  [optional] |
| **fromAddress** | [**QueueConversationVideoEventTopicAddress**](QueueConversationVideoEventTopicAddress) | Address and name data for a call endpoint. |  [optional] |
| **messages** | [**List&lt;QueueConversationVideoEventTopicInternalMessageDetails&gt;**](QueueConversationVideoEventTopicInternalMessageDetails) | The messages sent on this communication channel. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: InitialStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 


## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| PEER | &quot;peer&quot; | 
| TRANSFER | &quot;transfer&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
