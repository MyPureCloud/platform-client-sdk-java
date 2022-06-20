---
title: Cobrowsesession
---
## Cobrowsesession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The connection state of this communication. |  [optional] |
| **id** | <!----><!---->**String**<!----> | A globally unique identifier for this communication. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **self** | <!----><!---->[**Address**](Address.html)<!----> | Address and name data for a call endpoint. |  [optional] |
| **cobrowseSessionId** | <!----><!---->**String**<!----> | The co-browse session ID. |  [optional] |
| **cobrowseRole** | <!----><!---->**String**<!----> | This value identifies the role of the co-browse client within the co-browse session (a client is a sharer or a viewer). |  [optional] |
| **controlling** | <!----><!---->**List&lt;String&gt;**<!----> | ID of co-browse participants for which this client has been granted control (list is empty if this client cannot control any shared pages). |  [optional] |
| **viewerUrl** | <!----><!---->**String**<!----> | The URL that can be used to open co-browse session in web browser. |  [optional] |
| **providerEventTime** | <!----><!---->[**Date**](Date.html)<!----> | The time when the provider event which triggered this conversation update happened in the corrected provider clock (milliseconds since 1970-01-01 00:00:00 UTC). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **startAlertingTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp the communication has when it is first put into an alerting state. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The source provider for the co-browse session. |  [optional] |
| **peerId** | <!----><!---->**String**<!----> | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
| **segments** | <!----><!---->[**List&lt;Segment&gt;**](Segment.html)<!----> | The time line of the participant's call, divided into activity segments. |  [optional] |
| **wrapup** | <!----><!---->[**Wrapup**](Wrapup.html)<!----> | Call wrap up or disposition data. |  [optional] |
| **afterCallWork** | <!----><!---->[**AfterCallWork**](AfterCallWork.html)<!----> | After-call work for the communication. |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> | Indicates if after-call work is required for a communication. Only used when the ACW Setting is Agent Requested. |  [optional] |
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
| SCHEDULED | &quot;scheduled&quot; | 
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
| SCHEDULED | &quot;scheduled&quot; | 
| NONE | &quot;none&quot; | 
{: class="table table-striped"}



