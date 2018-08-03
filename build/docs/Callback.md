---
title: Callback
---
## Callback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum) | The connection state of this communication. |  [optional] |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **segments** | [**List&lt;Segment&gt;**](Segment.html) | The time line of the participant&#39;s callback, divided into activity segments. |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the call |  [optional] |
| **held** | **Boolean** | True if this call is held and the person on this side hears silence. |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) | System defined string indicating what caused the communication to disconnect. Will be null until the communication disconnects. |  [optional] |
| **startHoldTime** | [**Date**](Date.html) | The timestamp the callback was placed on hold in the cloud clock if the callback is currently on hold. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dialerPreview** | [**DialerPreview**](DialerPreview.html) | The preview data to be used when this callback is a Preview. |  [optional] |
| **voicemail** | [**Voicemail**](Voicemail.html) | The voicemail data to be used when this callback is an ACD voicemail. |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** | The phone number(s) to use to place the callback. |  [optional] |
| **callbackUserName** | **String** | The name of the user requesting a callback. |  [optional] |
| **scriptId** | **String** | The UUID of the script to use. |  [optional] |
| **skipEnabled** | **Boolean** | True if the ability to skip a callback should be enabled. |  [optional] |
| **timeoutSeconds** | **Integer** | The number of seconds before the system automatically places a call for a callback.  0 means the automatic placement is disabled. |  [optional] |
| **connectedTime** | [**Date**](Date.html) | The timestamp when this communication was connected in the cloud clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **disconnectedTime** | [**Date**](Date.html) | The timestamp when this communication disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **callbackScheduledTime** | [**Date**](Date.html) | The timestamp when this communication is scheduled in the provider clock. If this value is missing it indicates the callback will be placed immediately. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **automatedCallbackConfigId** | **String** | The id of the config for automatically placing the callback (and handling the disposition). If null, the callback will not be placed automatically but routed to an agent as per normal. |  [optional] |
| **provider** | **String** | The source provider for the callback. |  [optional] |
| **peerId** | **String** | The id of the peer communication corresponding to a matching leg for this communication. |  [optional] |
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


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
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



