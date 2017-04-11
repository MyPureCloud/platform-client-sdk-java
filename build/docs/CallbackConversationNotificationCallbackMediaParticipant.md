---
title: CallbackConversationNotificationCallbackMediaParticipant
---
## CallbackConversationNotificationCallbackMediaParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **address** | **String** |  |  [optional] |
| **startTime** | [**Date**](Date.html) |  |  [optional] |
| **connectedTime** | [**Date**](Date.html) |  |  [optional] |
| **endTime** | [**Date**](Date.html) |  |  [optional] |
| **startHoldTime** | [**Date**](Date.html) |  |  [optional] |
| **purpose** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum) |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum) |  |  [optional] |
| **held** | **Boolean** |  |  [optional] |
| **wrapupRequired** | **Boolean** |  |  [optional] |
| **wrapupPrompt** | **String** |  |  [optional] |
| **user** | [**DocumentDataV2NotificationCreatedBy**](DocumentDataV2NotificationCreatedBy.html) |  |  [optional] |
| **queue** | [**CallbackConversationNotificationUriReference**](CallbackConversationNotificationUriReference.html) |  |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** |  |  [optional] |
| **errorInfo** | [**CallbackConversationNotificationErrorInfo**](CallbackConversationNotificationErrorInfo.html) |  |  [optional] |
| **script** | [**CallbackConversationNotificationUriReference**](CallbackConversationNotificationUriReference.html) |  |  [optional] |
| **wrapupTimeoutMs** | **Integer** |  |  [optional] |
| **wrapupSkipped** | **Boolean** |  |  [optional] |
| **provider** | **String** |  |  [optional] |
| **externalContact** | [**CallbackConversationNotificationUriReference**](CallbackConversationNotificationUriReference.html) |  |  [optional] |
| **externalOrganization** | [**CallbackConversationNotificationUriReference**](CallbackConversationNotificationUriReference.html) |  |  [optional] |
| **wrapup** | [**ConversationNotificationWrapup**](ConversationNotificationWrapup.html) |  |  [optional] |
| **outboundPreview** | [**ConversationNotificationDialerPreview**](ConversationNotificationDialerPreview.html) |  |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** |  |  [optional] |
| **callbackUserName** | **String** |  |  [optional] |
| **skipEnabled** | **Boolean** |  |  [optional] |
| **timeoutSeconds** | **Integer** |  |  [optional] |
| **callbackScheduledTime** | [**Date**](Date.html) |  |  [optional] |
| **automatedCallbackConfigId** | **String** |  |  [optional] |
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
| SCHEDULED | &quot;scheduled&quot; |
| NONE | &quot;none&quot; |


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |


<a name="DisconnectTypeEnum"></a>

## Enum: DisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ENDPOINT | &quot;endpoint&quot; |
| CLIENT | &quot;client&quot; |
| SYSTEM | &quot;system&quot; |
| TRANSFER | &quot;transfer&quot; |
| TIMEOUT | &quot;timeout&quot; |
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


