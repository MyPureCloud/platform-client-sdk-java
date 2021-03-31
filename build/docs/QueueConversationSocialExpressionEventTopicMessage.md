---
title: QueueConversationSocialExpressionEventTopicMessage
---
## QueueConversationSocialExpressionEventTopicMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **errorInfo** | <!----><!---->[**QueueConversationSocialExpressionEventTopicErrorDetails**](QueueConversationSocialExpressionEventTopicErrorDetails.html)<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **scriptId** | <!----><!---->**String**<!----> |  |  [optional] |
| **peerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **disconnectType** | [**DisconnectTypeEnum**](#DisconnectTypeEnum)<!----> |  |  [optional] |
| **startHoldTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **disconnectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **toAddress** | <!----><!---->[**QueueConversationSocialExpressionEventTopicAddress**](QueueConversationSocialExpressionEventTopicAddress.html)<!----> |  |  [optional] |
| **fromAddress** | <!----><!---->[**QueueConversationSocialExpressionEventTopicAddress**](QueueConversationSocialExpressionEventTopicAddress.html)<!----> |  |  [optional] |
| **messages** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicMessageDetails&gt;**](QueueConversationSocialExpressionEventTopicMessageDetails.html)<!----> |  |  [optional] |
| **messagesTranscriptUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **recipientCountry** | <!----><!---->**String**<!----> |  |  [optional] |
| **recipientType** | <!----><!---->**String**<!----> |  |  [optional] |
| **journeyContext** | <!----><!---->[**QueueConversationSocialExpressionEventTopicJourneyContext**](QueueConversationSocialExpressionEventTopicJourneyContext.html)<!----> |  |  [optional] |
| **wrapup** | <!----><!---->[**QueueConversationSocialExpressionEventTopicWrapup**](QueueConversationSocialExpressionEventTopicWrapup.html)<!----> |  |  [optional] |
| **afterCallWork** | <!----><!---->[**QueueConversationSocialExpressionEventTopicAfterCallWork**](QueueConversationSocialExpressionEventTopicAfterCallWork.html)<!----> |  |  [optional] |
| **afterCallWorkRequired** | <!----><!---->**Boolean**<!----> |  |  [optional] |
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
| UNKNOWN | &quot;UNKNOWN&quot; |
| SMS | &quot;SMS&quot; |
| TWITTER | &quot;TWITTER&quot; |
| FACEBOOK | &quot;FACEBOOK&quot; |
| LINE | &quot;LINE&quot; |
| VIBER | &quot;VIBER&quot; |
| WECHAT | &quot;WECHAT&quot; |
| WHATSAPP | &quot;WHATSAPP&quot; |
| TELEGRAM | &quot;TELEGRAM&quot; |
| KAKAO | &quot;KAKAO&quot; |
| WEBMESSAGING | &quot;WEBMESSAGING&quot; |
| OPEN | &quot;OPEN&quot; |
{: class="table table-striped"}



