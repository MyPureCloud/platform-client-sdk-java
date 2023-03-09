---
title: QueueConversationVideoEventTopicChat
---
## QueueConversationVideoEventTopicChat


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **initialState** | [**InitialStateEnum**](#InitialStateEnum)<!----> |  |  [optional] |
| **id** | <!----><!---->**String**<!----> | A globally unique identifier for this communication. |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider of the chat. |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> | The UUID of the script to use. |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **roomId** | <!----><!---->**String**<!----> | The room id for the chat. |  [optional] |
| **avatarImageUrl** | <!----><!---->**String**<!----> | The avatar for the chat (if available). |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> | True if this call is held and the person on this side hears silence. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp the chat was placed on hold in the cloud clock if the chat is currently on hold. |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **journeyContext** | <!----><!---->[**QueueConversationVideoEventTopicJourneyContext**](QueueConversationVideoEventTopicJourneyContext.html)<!----> |  |  [optional] |
| **wrapup** | <!----><!---->[**QueueConversationVideoEventTopicWrapup**](QueueConversationVideoEventTopicWrapup.html)<!----> | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | <!----><!---->[**QueueConversationVideoEventTopicAfterCallWork**](QueueConversationVideoEventTopicAfterCallWork.html)<!----> | A communication's after-call work data. |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> | Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

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
{: class="table table-striped"}


<a name="InitialStateEnum"></a>

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
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ENDPOINT | &quot;endpoint&quot; | 
| CLIENT | &quot;client&quot; | 
| SYSTEM | &quot;system&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| TRANSFER | &quot;transfer&quot; | 
| TRANSFER_CONFERENCE | &quot;transfer.conference&quot; | 
| TRANSFER_CONSULT | &quot;transfer.consult&quot; | 
| TRANSFER_NOANSWER | &quot;transfer.noanswer&quot; | 
| TRANSFER_NOTAVAILABLE | &quot;transfer.notavailable&quot; | 
| TRANSFER_FORWARD | &quot;transfer.forward&quot; | 
| TRANSPORT_FAILURE | &quot;transport.failure&quot; | 
| ERROR | &quot;error&quot; | 
| PEER | &quot;peer&quot; | 
| OTHER | &quot;other&quot; | 
| SPAM | &quot;spam&quot; | 
| UNCALLABLE | &quot;uncallable&quot; | 
{: class="table table-striped"}



