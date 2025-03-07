# QueueConversationSocialExpressionEventTopicCobrowse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **initialState** | [**InitialStateEnum**](#Enum--InitialStateEnum) |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#Enum--DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **self** | [**QueueConversationSocialExpressionEventTopicAddress**](QueueConversationSocialExpressionEventTopicAddress) | Address and name data for a call endpoint. |  [optional] |
| **roomId** | **String** | The room id for the chat. |  [optional] |
| **cobrowseSessionId** | **String** | The co-browse session ID. |  [optional] |
| **cobrowseRole** | **String** | This value identifies the role of the co-browse client within the co-browse session (a client is a sharer or a viewer). |  [optional] |
| **controlling** | **List&lt;String&gt;** | ID of co-browse participants for which this client has been granted control (list is empty if this client cannot control any shared pages). |  [optional] |
| **viewerUrl** | **String** | The URL that can be used to open co-browse session in web browser. |  [optional] |
| **provider** | **String** | The source provider of the co-browse communication. |  [optional] |
| **scriptId** | **String** | The UUID of the script to use. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **providerEventTime** | [**Date**](Date) | The time when the provider event which triggered this conversation update happened in the corrected provider clock (milliseconds since 1970-01-01 00:00:00 UTC). |  [optional] |
| **connectedTime** | [**Date**](Date) | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | [**Date**](Date) | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **wrapup** | [**QueueConversationSocialExpressionEventTopicWrapup**](QueueConversationSocialExpressionEventTopicWrapup) | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | [**QueueConversationSocialExpressionEventTopicAfterCallWork**](QueueConversationSocialExpressionEventTopicAfterCallWork) | A communication's after-call work data. |  [optional] |
| **afterCallWorkRequired** | **Boolean** | Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
| **queueMediaSettings** | [**QueueConversationSocialExpressionEventTopicQueueMediaSettings**](QueueConversationSocialExpressionEventTopicQueueMediaSettings) | Represents the queue setting for this media. |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
