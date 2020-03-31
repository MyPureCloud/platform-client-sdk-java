---
title: ConversationEventTopicParticipant
---
## ConversationEventTopicParticipant


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
| **teamId** | <!----><!---->**String**<!----> |  |  [optional] |
| **purpose** | <!----><!---->**String**<!----> |  |  [optional] |
| **consultParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **address** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupRequired** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **wrapupExpected** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **wrapupPrompt** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupTimeoutMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **wrapup** | <!----><!---->[**ConversationEventTopicWrapup**](ConversationEventTopicWrapup.html)<!----> |  |  [optional] |
| **startAcwTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **endAcwTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **conversationRoutingData** | <!----><!---->[**ConversationEventTopicConversationRoutingData**](ConversationEventTopicConversationRoutingData.html)<!----> |  |  [optional] |
| **alertingTimeoutMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **monitoredParticipantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **screenRecordingState** | [**ScreenRecordingStateEnum**](#ScreenRecordingStateEnum)<!----> |  |  [optional] |
| **flaggedReason** | <!----><!---->**String**<!----> |  |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
| **calls** | <!----><!---->[**List&lt;ConversationEventTopicCall&gt;**](ConversationEventTopicCall.html)<!----> |  |  [optional] |
| **callbacks** | <!----><!---->[**List&lt;ConversationEventTopicCallback&gt;**](ConversationEventTopicCallback.html)<!----> |  |  [optional] |
| **chats** | <!----><!---->[**List&lt;ConversationEventTopicChat&gt;**](ConversationEventTopicChat.html)<!----> |  |  [optional] |
| **cobrowsesessions** | <!----><!---->[**List&lt;ConversationEventTopicCobrowse&gt;**](ConversationEventTopicCobrowse.html)<!----> |  |  [optional] |
| **emails** | <!----><!---->[**List&lt;ConversationEventTopicEmail&gt;**](ConversationEventTopicEmail.html)<!----> |  |  [optional] |
| **messages** | <!----><!---->[**List&lt;ConversationEventTopicMessage&gt;**](ConversationEventTopicMessage.html)<!----> |  |  [optional] |
| **screenshares** | <!----><!---->[**List&lt;ConversationEventTopicScreenshare&gt;**](ConversationEventTopicScreenshare.html)<!----> |  |  [optional] |
| **socialExpressions** | <!----><!---->[**List&lt;ConversationEventTopicSocialExpression&gt;**](ConversationEventTopicSocialExpression.html)<!----> |  |  [optional] |
| **videos** | <!----><!---->[**List&lt;ConversationEventTopicVideo&gt;**](ConversationEventTopicVideo.html)<!----> |  |  [optional] |
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



