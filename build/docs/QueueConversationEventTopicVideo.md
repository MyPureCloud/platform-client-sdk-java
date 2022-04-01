---
title: QueueConversationEventTopicVideo
---
## QueueConversationEventTopicVideo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The connection state of this communication. |  [optional] |
| **self** | <!----><!---->[**QueueConversationEventTopicAddress**](QueueConversationEventTopicAddress.html)<!----> | Address and name data for a call endpoint. |  [optional] |
| **id** | <!----><!---->**String**<!----> | A globally unique identifier for this communication. |  [optional] |
| **context** | <!----><!---->**String**<!----> | The room id context (xmpp jid) for the conference session. |  [optional] |
| **audioMuted** | <!----><!---->**Boolean**<!----> | Indicates whether this participant has muted their outgoing audio. |  [optional] |
| **videoMuted** | <!----><!---->**Boolean**<!----> | Indicates whether this participant has muted/paused their outgoing video. |  [optional] |
| **sharingScreen** | <!----><!---->**Boolean**<!----> | Indicates whether this participant is sharing their screen to the session. |  [optional] |
| **peerCount** | <!----><!---->[**QueueConversationEventTopicObject**](QueueConversationEventTopicObject.html)<!----> | The number of peer participants from the perspective of the participant in the conference. |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The media provider controlling the video. |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> | The UUID of the script to use. |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication was connected in the cloud clock. |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication disconnected from the conversation in the provider clock. |  [optional] |
| **msids** | <!----><!---->**List&lt;String&gt;**<!----> | List of media stream ids |  [optional] |
| **wrapup** | <!----><!---->[**QueueConversationEventTopicWrapup**](QueueConversationEventTopicWrapup.html)<!----> | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | <!----><!---->[**QueueConversationEventTopicAfterCallWork**](QueueConversationEventTopicAfterCallWork.html)<!----> | A communication&#39;s after-call work data. |  [optional] |
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



