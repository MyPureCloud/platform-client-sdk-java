---
title: Call
---
## Call


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The connection state of this communication. |  [optional] |
| **id** | <!----><!---->**String**<!----> | A globally unique identifier for this communication. |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the call |  [optional] |
| **recording** | <!----><!---->**Boolean**<!----> | True if this call is being recorded. |  [optional] |
| **recordingState** | [**RecordingStateEnum**](#RecordingStateEnum)<!----> | State of recording on this call. |  [optional] |
| **muted** | <!----><!---->**Boolean**<!----> | True if this call is muted so that remote participants can't hear any audio from this end. |  [optional] |
| **confined** | <!----><!---->**Boolean**<!----> | True if this call is held and the person on this side hears hold music. |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> | True if this call is held and the person on this side hears silence. |  [optional] |
| **recordingId** | <!----><!---->**String**<!----> | A globally unique identifier for the recording associated with this call. |  [optional] |
| **segments** | <!----><!---->[**List&lt;Segment&gt;**](Segment.html)<!----> | The time line of the participant's call, divided into activity segments. |  [optional] |
| **errorInfo** | <!----><!---->[**ErrorInfo**](ErrorInfo.html)<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp the call was placed on hold in the cloud clock if the call is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **documentId** | <!----><!---->**String**<!----> | If call is an outbound fax of a document from content management, then this is the id in content management. |  [optional] |
| **startAlertingTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **disconnectReasons** | <!----><!---->[**List&lt;DisconnectReason&gt;**](DisconnectReason.html)<!----> | List of reasons that this call was disconnected. This will be set once the call disconnects. |  [optional] |
| **faxStatus** | <!----><!---->[**FaxStatus**](FaxStatus.html)<!----> | Extra information on fax transmission. |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider for the call. |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> | The UUID of the script to use. |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **uuiData** | <!----><!---->**String**<!----> | User to User Information (UUI) data managed by SIP session application. |  [optional] |
| **self** | <!----><!---->[**Address**](Address.html)<!----> | Address and name data for a call endpoint. |  [optional] |
| **other** | <!----><!---->[**Address**](Address.html)<!----> | Address and name data for a call endpoint. |  [optional] |
| **wrapup** | <!----><!---->[**Wrapup**](Wrapup.html)<!----> | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | <!----><!---->[**AfterCallWork**](AfterCallWork.html)<!----> | After-call work for the communication. |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> | Indicates if after-call work is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
| **agentAssistantId** | <!----><!---->**String**<!----> | UUID of virtual agent assistant that provide suggestions to the agent participant during the conversation. |  [optional] |
| **initialState** | [**InitialStateEnum**](#InitialStateEnum)<!----> | The initial connection state of this communication. |  [optional] |
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
| CONVERTING | &quot;converting&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| TRANSMITTING | &quot;transmitting&quot; | 
| NONE | &quot;none&quot; | 
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
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
| CONVERTING | &quot;converting&quot; | 
| UPLOADING | &quot;uploading&quot; | 
| TRANSMITTING | &quot;transmitting&quot; | 
| NONE | &quot;none&quot; | 
{: class="table table-striped"}



