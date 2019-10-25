---
title: ConversationEventTopicCall
---
## ConversationEventTopicCall


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **recording** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **recordingState** | [**RecordingStateEnum**](#RecordingStateEnum)<!----> |  |  [optional] |
| **muted** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **confined** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **errorInfo** | <!----><!---->[**ConversationEventTopicErrorDetails**](ConversationEventTopicErrorDetails.html)<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> |  |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> |  |  [optional] |
| **documentId** | <!----><!---->**String**<!----> |  |  [optional] |
| **self** | <!----><!---->[**ConversationEventTopicAddress**](ConversationEventTopicAddress.html)<!----> |  |  [optional] |
| **other** | <!----><!---->[**ConversationEventTopicAddress**](ConversationEventTopicAddress.html)<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> |  |  [optional] |
| **peerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **disconnectReasons** | <!----><!---->[**List&lt;ConversationEventTopicDisconnectReason&gt;**](ConversationEventTopicDisconnectReason.html)<!----> |  |  [optional] |
| **faxStatus** | <!----><!---->[**ConversationEventTopicFaxStatus**](ConversationEventTopicFaxStatus.html)<!----> |  |  [optional] |
| **uuiData** | <!----><!---->**String**<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Object**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERTING | &quot;ALERTING&quot; |
| DIALING | &quot;DIALING&quot; |
| CONTACTING | &quot;CONTACTING&quot; |
| OFFERING | &quot;OFFERING&quot; |
| CONNECTED | &quot;CONNECTED&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |
| TERMINATED | &quot;TERMINATED&quot; |
| UPLOADING | &quot;UPLOADING&quot; |
| CONVERTING | &quot;CONVERTING&quot; |
| TRANSMITTING | &quot;TRANSMITTING&quot; |
| NONE | &quot;NONE&quot; |
{: class="table table-striped"}


<a name="RecordingStateEnum"></a>

## Enum: RecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE | &quot;NONE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| PAUSED | &quot;PAUSED&quot; |
{: class="table table-striped"}


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ENDPOINT | &quot;ENDPOINT&quot; |
| CLIENT | &quot;CLIENT&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| TRANSFER | &quot;TRANSFER&quot; |
| TRANSFER_CONFERENCE | &quot;TRANSFER_CONFERENCE&quot; |
| TRANSFER_CONSULT | &quot;TRANSFER_CONSULT&quot; |
| TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot; |
| TRANSFER_NOANSWER | &quot;TRANSFER_NOANSWER&quot; |
| TRANSFER_NOTAVAILABLE | &quot;TRANSFER_NOTAVAILABLE&quot; |
| TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot; |
| ERROR | &quot;ERROR&quot; |
| PEER | &quot;PEER&quot; |
| OTHER | &quot;OTHER&quot; |
| SPAM | &quot;SPAM&quot; |
| UNCALLABLE | &quot;UNCALLABLE&quot; |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
| INBOUND | &quot;INBOUND&quot; |
{: class="table table-striped"}



