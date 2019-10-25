---
title: QueueConversationSocialExpressionEventTopicParticipant
---
## QueueConversationSocialExpressionEventTopicParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **connectedTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalContactId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalOrganizationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **queueId** | <!----><!---->**String**<!----> |  |  [optional] |
| **groupId** | <!----><!---->**String**<!----> |  |  [optional] |
| **purpose** | <!----><!---->**String**<!----> |  |  [optional] |
| **consultParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **address** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupRequired** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **wrapupExpected** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **wrapupPrompt** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupTimeoutMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **wrapup** | <!----><!---->[**QueueConversationSocialExpressionEventTopicWrapup**](QueueConversationSocialExpressionEventTopicWrapup.html)<!----> |  |  [optional] |
| **conversationRoutingData** | <!----><!---->[**QueueConversationSocialExpressionEventTopicConversationRoutingData**](QueueConversationSocialExpressionEventTopicConversationRoutingData.html)<!----> |  |  [optional] |
| **alertingTimeoutMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **monitoredParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **screenRecordingState** | [**ScreenRecordingStateEnum**](#ScreenRecordingStateEnum)<!----> |  |  [optional] |
| **flaggedReason** | <!----><!---->**String**<!----> |  |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
| **calls** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicCall&gt;**](QueueConversationSocialExpressionEventTopicCall.html)<!----> |  |  [optional] |
| **callbacks** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicCallback&gt;**](QueueConversationSocialExpressionEventTopicCallback.html)<!----> |  |  [optional] |
| **chats** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicChat&gt;**](QueueConversationSocialExpressionEventTopicChat.html)<!----> |  |  [optional] |
| **cobrowsesessions** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicCobrowse&gt;**](QueueConversationSocialExpressionEventTopicCobrowse.html)<!----> |  |  [optional] |
| **emails** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicEmail&gt;**](QueueConversationSocialExpressionEventTopicEmail.html)<!----> |  |  [optional] |
| **messages** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicMessage&gt;**](QueueConversationSocialExpressionEventTopicMessage.html)<!----> |  |  [optional] |
| **screenshares** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicScreenshare&gt;**](QueueConversationSocialExpressionEventTopicScreenshare.html)<!----> |  |  [optional] |
| **socialExpressions** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicSocialExpression&gt;**](QueueConversationSocialExpressionEventTopicSocialExpression.html)<!----> |  |  [optional] |
| **videos** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicVideo&gt;**](QueueConversationSocialExpressionEventTopicVideo.html)<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Object**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ScreenRecordingStateEnum"></a>

## Enum: ScreenRecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| PAUSED | &quot;PAUSED&quot; |
| STOPPED | &quot;STOPPED&quot; |
| ERROR | &quot;ERROR&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
{: class="table table-striped"}



