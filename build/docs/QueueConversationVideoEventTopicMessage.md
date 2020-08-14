---
title: QueueConversationVideoEventTopicMessage
---
## QueueConversationVideoEventTopicMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **errorInfo** | <!----><!---->[**QueueConversationVideoEventTopicErrorDetails**](QueueConversationVideoEventTopicErrorDetails.html)<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> |  |  [optional] |
| **peerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> |  |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **toAddress** | <!----><!---->[**QueueConversationVideoEventTopicAddress**](QueueConversationVideoEventTopicAddress.html)<!----> |  |  [optional] |
| **fromAddress** | <!----><!---->[**QueueConversationVideoEventTopicAddress**](QueueConversationVideoEventTopicAddress.html)<!----> |  |  [optional] |
| **messages** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicMessageDetails&gt;**](QueueConversationVideoEventTopicMessageDetails.html)<!----> |  |  [optional] |
| **messagesTranscriptUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **recipientCountry** | <!----><!---->**String**<!----> |  |  [optional] |
| **recipientType** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapup** | <!----><!---->[**QueueConversationVideoEventTopicWrapup**](QueueConversationVideoEventTopicWrapup.html)<!----> |  |  [optional] |
| **afterCallWork** | <!----><!---->[**QueueConversationVideoEventTopicAfterCallWork**](QueueConversationVideoEventTopicAfterCallWork.html)<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Object**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERTING | &quot;ALERTING&quot; |
| CONNECTED | &quot;CONNECTED&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |
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


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;SMS&quot; |
| TWITTER | &quot;TWITTER&quot; |
| FACEBOOK | &quot;FACEBOOK&quot; |
| LINE | &quot;LINE&quot; |
| VIBER | &quot;VIBER&quot; |
| WECHAT | &quot;WECHAT&quot; |
| WHATSAPP | &quot;WHATSAPP&quot; |
| TELEGRAM | &quot;TELEGRAM&quot; |
| KAKAO | &quot;KAKAO&quot; |
{: class="table table-striped"}



