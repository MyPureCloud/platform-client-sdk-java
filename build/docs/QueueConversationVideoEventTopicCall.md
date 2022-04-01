---
title: QueueConversationVideoEventTopicCall
---
## QueueConversationVideoEventTopicCall


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | A globally unique identifier for this communication. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The connection state of this communication. |  [optional] |
| **recording** | <!----><!---->**Boolean**<!----> | True if this call is being recorded. |  [optional] |
| **recordingState** | [**RecordingStateEnum**](#RecordingStateEnum)<!----> | State of recording on this call. |  [optional] |
| **muted** | <!----><!---->**Boolean**<!----> | True if this call is muted so that remote participants can&#39;t hear any audio from this end. |  [optional] |
| **confined** | <!----><!---->**Boolean**<!----> | True if this call is held and the person on this side hears hold music. |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> | True if this call is held and the person on this side hears silence. |  [optional] |
| **errorInfo** | <!----><!---->[**QueueConversationVideoEventTopicErrorDetails**](QueueConversationVideoEventTopicErrorDetails.html)<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp the call was placed on hold in the cloud clock if the call is currently on hold. |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | Whether a call is inbound or outbound. |  [optional] |
| **documentId** | <!----><!---->**String**<!----> | If call is a fax of a document in content management, the id of the document in content management. |  [optional] |
| **self** | <!----><!---->[**QueueConversationVideoEventTopicAddress**](QueueConversationVideoEventTopicAddress.html)<!----> |  |  [optional] |
| **other** | <!----><!---->[**QueueConversationVideoEventTopicAddress**](QueueConversationVideoEventTopicAddress.html)<!----> | Address and name data for a call endpoint. |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider of the call. |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> | The UUID of the script to use. |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **disconnectReasons** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicDisconnectReason&gt;**](QueueConversationVideoEventTopicDisconnectReason.html)<!----> | List of reasons that this call was disconnected. This will be set once the call disconnects. |  [optional] |
| **faxStatus** | <!----><!---->[**QueueConversationVideoEventTopicFaxStatus**](QueueConversationVideoEventTopicFaxStatus.html)<!----> |  |  [optional] |
| **uuiData** | <!----><!---->**String**<!----> | User to User Information (UUI) data managed by SIP session application. |  [optional] |
| **bargedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this participant was connected to the barge conference in the provider clock. |  [optional] |
| **wrapup** | <!----><!---->[**QueueConversationVideoEventTopicWrapup**](QueueConversationVideoEventTopicWrapup.html)<!----> | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | <!----><!---->[**QueueConversationVideoEventTopicAfterCallWork**](QueueConversationVideoEventTopicAfterCallWork.html)<!----> |  |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> | Indicates if after-call is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
| **agentAssistantId** | <!----><!---->**String**<!----> | UUID of virtual agent assistant that provide suggestions to the agent participant during the conversation. |  [optional] |
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
| UPLOADING | &quot;uploading&quot; |
| CONVERTING | &quot;converting&quot; |
| TRANSMITTING | &quot;transmitting&quot; |
| NONE | &quot;none&quot; |
{: class="table table-striped"}


<a name="RecordingStateEnum"></a>

## Enum: RecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE | &quot;none&quot; |
| ACTIVE | &quot;active&quot; |
| PAUSED | &quot;paused&quot; |
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
| TRANSFER_FORWARD | &quot;transfer.forward&quot; |
| TRANSFER_NOANSWER | &quot;transfer.noanswer&quot; |
| TRANSFER_NOTAVAILABLE | &quot;transfer.notavailable&quot; |
| TRANSPORT_FAILURE | &quot;transport.failure&quot; |
| ERROR | &quot;error&quot; |
| PEER | &quot;peer&quot; |
| OTHER | &quot;other&quot; |
| SPAM | &quot;spam&quot; |
| UNCALLABLE | &quot;uncallable&quot; |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OUTBOUND | &quot;outbound&quot; |
| INBOUND | &quot;inbound&quot; |
{: class="table table-striped"}



