---
title: QueueConversationVideoEventTopicParticipant
---
## QueueConversationVideoEventTopicParticipant


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
| **wrapup** | <!----><!---->[**QueueConversationVideoEventTopicWrapup**](QueueConversationVideoEventTopicWrapup.html)<!----> |  |  [optional] |
| **startAcwTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **endAcwTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **conversationRoutingData** | <!----><!---->[**QueueConversationVideoEventTopicConversationRoutingData**](QueueConversationVideoEventTopicConversationRoutingData.html)<!----> |  |  [optional] |
| **alertingTimeoutMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **monitoredParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **screenRecordingState** | [**ScreenRecordingStateEnum**](#ScreenRecordingStateEnum)<!----> |  |  [optional] |
| **flaggedReason** | <!----><!---->**String**<!----> |  |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
| **calls** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicCall&gt;**](QueueConversationVideoEventTopicCall.html)<!----> |  |  [optional] |
| **callbacks** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicCallback&gt;**](QueueConversationVideoEventTopicCallback.html)<!----> |  |  [optional] |
| **chats** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicChat&gt;**](QueueConversationVideoEventTopicChat.html)<!----> |  |  [optional] |
| **cobrowsesessions** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicCobrowse&gt;**](QueueConversationVideoEventTopicCobrowse.html)<!----> |  |  [optional] |
| **emails** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicEmail&gt;**](QueueConversationVideoEventTopicEmail.html)<!----> |  |  [optional] |
| **messages** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicMessage&gt;**](QueueConversationVideoEventTopicMessage.html)<!----> |  |  [optional] |
| **screenshares** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicScreenshare&gt;**](QueueConversationVideoEventTopicScreenshare.html)<!----> |  |  [optional] |
| **socialExpressions** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicSocialExpression&gt;**](QueueConversationVideoEventTopicSocialExpression.html)<!----> |  |  [optional] |
| **videos** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicVideo&gt;**](QueueConversationVideoEventTopicVideo.html)<!----> |  |  [optional] |
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



