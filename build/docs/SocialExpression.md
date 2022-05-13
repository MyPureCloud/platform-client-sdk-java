---
title: SocialExpression
---
## SocialExpression


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The connection state of this communication. |  [optional] |
| **id** | <!----><!---->**String**<!----> | A globally unique identifier for this communication. |  [optional] |
| **socialMediaId** | <!----><!---->**String**<!----> | A globally unique identifier for the social media. |  [optional] |
| **socialMediaHub** | <!----><!---->**String**<!----> | The social network of the communication |  [optional] |
| **socialUserName** | <!----><!---->**String**<!----> | The user name for the communication. |  [optional] |
| **previewText** | <!----><!---->**String**<!----> | The text preview of the communication contents |  [optional] |
| **recordingId** | <!----><!---->**String**<!----> | A globally unique identifier for the recording associated with this chat. |  [optional] |
| **segments** | <!----><!---->[**List&lt;Segment&gt;**](Segment.html)<!----> | The time line of the participant's chat, divided into activity segments. |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> | True if this call is held and the person on this side hears silence. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp the chat was placed on hold in the cloud clock if the chat is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startAlertingTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider for the social expression. |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> | The UUID of the script to use. |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **wrapup** | <!----><!---->[**Wrapup**](Wrapup.html)<!----> | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | <!----><!---->[**AfterCallWork**](AfterCallWork.html)<!----> | After-call work for the communication. |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> | Indicates if after-call work is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
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



