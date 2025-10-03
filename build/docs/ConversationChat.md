# ConversationChat


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) | The connection state of this communication. |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) | The initial connection state of this communication. |  [optional] |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **roomId** | **String** | The room id for the chat. |  [optional] |
| **recordingId** | **String** | A globally unique identifier for the recording associated with this chat. |  [optional] |
| **segments** | [**List&lt;Segment&gt;**](Segment) | The time line of the participant's chat, divided into activity segments. |  [optional] |
| **held** | **Boolean** | True if this call is held and the person on this side hears silence. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the chat |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | [**Date**](Date) | The timestamp the chat was placed on hold in the cloud clock if the chat is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startAlertingTime** | [**Date**](Date) | The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **provider** | **String** | The source provider for the email. |  [optional] |
| **scriptId** | **String** | The UUID of the script to use. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **avatarImageUrl** | **String** | If available, the URI to the avatar image of this communication. |  [optional] |
| **journeyContext** | [**JourneyContext**](JourneyContext) | A subset of the Journey System's data relevant to a part of a conversation (for external linkage and internal usage/context). |  [optional] |
| **wrapup** | [**Wrapup**](Wrapup) | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | [**AfterCallWork**](AfterCallWork) | After-call work for the communication. |  [optional] |
| **afterCallWorkRequired** | **Boolean** | Indicates if after-call work is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
| **queueMediaSettings** | [**ConversationQueueMediaSettings**](ConversationQueueMediaSettings) | Represents the queue settings for this media type. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| DIALING | &quot;dialing&quot; | 
| CONTACTING | &quot;contacting&quot; | 
| OFFERING | &quot;offering&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 
| TERMINATED | &quot;terminated&quot; | 
| NONE | &quot;none&quot; | 


## Enum: InitialStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALERTING | &quot;alerting&quot; | 
| DIALING | &quot;dialing&quot; | 
| CONTACTING | &quot;contacting&quot; | 
| OFFERING | &quot;offering&quot; | 
| CONNECTED | &quot;connected&quot; | 
| DISCONNECTED | &quot;disconnected&quot; | 
| TERMINATED | &quot;terminated&quot; | 
| NONE | &quot;none&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 


## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENDPOINT | &quot;endpoint&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFER_CONFERENCE | &quot;transfer.conference&quot; | 
| TRANSFER_CONSULT | &quot;transfer.consult&quot; | 
| TRANSFER_FORWARD | &quot;transfer.forward&quot; | 
| ERROR | &quot;error&quot; | 
| PEER | &quot;peer&quot; | 
| OTHER | &quot;other&quot; | 
| UNCALLABLE | &quot;uncallable&quot; | 
| TIMEOUT | &quot;timeout&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
