# QueueConversationVideoEventTopicCallback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) |  |  [optional] |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of the call |  [optional] |
| **held** | **Boolean** | True if this call is held and the person on this side hears silence. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | [**Date**](Date) | The timestamp the callback was placed on hold in the cloud clock if the callback is currently on hold. |  [optional] |
| **dialerPreview** | [**QueueConversationVideoEventTopicDialerPreview**](QueueConversationVideoEventTopicDialerPreview) |  |  [optional] |
| **voicemail** | [**QueueConversationVideoEventTopicVoicemail**](QueueConversationVideoEventTopicVoicemail) |  |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** | The phone number(s) to use to place the callback. |  [optional] |
| **callbackUserName** | **String** | The name of the user requesting a callback. |  [optional] |
| **scriptId** | **String** | The UUID of the script to use. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **externalCampaign** | **Boolean** | True if the call for the callback uses external dialing. |  [optional] |
| **skipEnabled** | **Boolean** | True if the ability to skip a callback should be enabled. |  [optional] |
| **provider** | **String** | The source provider of the callback. |  [optional] |
| **timeoutSeconds** | **Long** | The number of seconds before the system automatically places a call for a callback.  0 means the automatic placement is disabled. |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **callbackScheduledTime** | [**Date**](Date) | The timestamp when this communication is scheduled in the provider clock. If this value is missing it indicates the callback will be placed immediately. |  [optional] |
| **automatedCallbackConfigId** | **String** | The id of the config for automatically placing the callback (and handling the disposition). If null, the callback will not be placed automatically but routed to an agent as per normal. |  [optional] |
| **wrapup** | [**QueueConversationVideoEventTopicWrapup**](QueueConversationVideoEventTopicWrapup) | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | [**QueueConversationVideoEventTopicAfterCallWork**](QueueConversationVideoEventTopicAfterCallWork) | A communication's after-call work data. |  [optional] |
| **afterCallWorkRequired** | **Boolean** | Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
| **callerId** | **String** | The phone number displayed to recipients of the phone call. The value should conform to the E164 format. |  [optional] |
| **callerIdName** | **String** | The name displayed to recipients of the phone call. |  [optional] |
| **queueMediaSettings** | [**QueueConversationVideoEventTopicQueueMediaSettings**](QueueConversationVideoEventTopicQueueMediaSettings) | Represents the queue setting for this media. |  [optional] |


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
| SCHEDULED | &quot;scheduled&quot; | 
| UPLOADING | &quot;uploading&quot; | 
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
| SCHEDULED | &quot;scheduled&quot; | 
| UPLOADING | &quot;uploading&quot; | 
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
| ENDPOINT_DND | &quot;endpoint.dnd&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFER_CONFERENCE | &quot;transfer.conference&quot; | 
| TRANSFER_CONSULT | &quot;transfer.consult&quot; | 
| TRANSFER_FORWARD | &quot;transfer.forward&quot; | 
| TRANSFER_NOANSWER | &quot;transfer.noanswer&quot; | 
| TRANSFER_NOTAVAILABLE | &quot;transfer.notavailable&quot; | 
| TRANSFER_DND | &quot;transfer.dnd&quot; | 
| TRANSPORT_FAILURE | &quot;transport.failure&quot; | 
| ERROR | &quot;error&quot; | 
| PEER | &quot;peer&quot; | 
| OTHER | &quot;other&quot; | 
| SPAM | &quot;spam&quot; | 
| UNCALLABLE | &quot;uncallable&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
