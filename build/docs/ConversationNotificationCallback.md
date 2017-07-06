---
title: ConversationNotificationCallback
---
## ConversationNotificationCallback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum) |  |  [optional] |
| **id** | **String** |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |
| **held** | **Boolean** |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional] |
| **startHoldTime** | [**Date**](Date.html) |  |  [optional] |
| **dialerPreview** | [**ConversationNotificationDialerPreview**](ConversationNotificationDialerPreview.html) |  |  [optional] |
| **voicemail** | [**ConversationNotificationVoicemail**](ConversationNotificationVoicemail.html) |  |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** |  |  [optional] |
| **callbackUserName** | **String** |  |  [optional] |
| **scriptId** | **String** |  |  [optional] |
| **peerId** | **String** |  |  [optional] |
| **skipEnabled** | **Boolean** |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **timeoutSeconds** | **Integer** |  |  [optional] |
| **connectedTime** | [**Date**](Date.html) |  |  [optional] |
| **disconnectedTime** | [**Date**](Date.html) |  |  [optional] |
| **callbackScheduledTime** | [**Date**](Date.html) |  |  [optional] |
| **automatedCallbackConfigId** | **String** |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
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
| SCHEDULED | &quot;SCHEDULED&quot; |
| UPLOADING | &quot;UPLOADING&quot; |
| NONE | &quot;NONE&quot; |


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |


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
| TRANSFER_NOANSWER | &quot;TRANSFER_NOANSWER&quot; |
| TRANSFER_NOTAVAILABLE | &quot;TRANSFER_NOTAVAILABLE&quot; |
| TRANSFER_FORWARD | &quot;TRANSFER_FORWARD&quot; |
| TRANSPORT_FAILURE | &quot;TRANSPORT_FAILURE&quot; |
| ERROR | &quot;ERROR&quot; |
| PEER | &quot;PEER&quot; |
| OTHER | &quot;OTHER&quot; |
| SPAM | &quot;SPAM&quot; |
| UNCALLABLE | &quot;UNCALLABLE&quot; |
{: class="table table-striped"}


