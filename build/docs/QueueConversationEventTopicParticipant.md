---
title: QueueConversationEventTopicParticipant
---
## QueueConversationEventTopicParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **connectedTime** | [**Date**](Date.html) |  |  [optional] |
| **endTime** | [**Date**](Date.html) |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **externalContactId** | **String** |  |  [optional] |
| **externalOrganizationId** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **queueId** | **String** |  |  [optional] |
| **groupId** | **String** |  |  [optional] |
| **purpose** | **String** |  |  [optional] |
| **consultParticipantId** | **String** |  |  [optional] |
| **address** | **String** |  |  [optional] |
| **wrapupRequired** | **Boolean** |  |  [optional] |
| **wrapupExpected** | **Boolean** |  |  [optional] |
| **wrapupPrompt** | **String** |  |  [optional] |
| **wrapupTimeoutMs** | **Integer** |  |  [optional] |
| **wrapup** | [**QueueConversationEventTopicWrapup**](QueueConversationEventTopicWrapup.html) |  |  [optional] |
| **alertingTimeoutMs** | **Integer** |  |  [optional] |
| **monitoredParticipantId** | **String** |  |  [optional] |
| **screenRecordingState** | [**ScreenRecordingStateEnum**](#ScreenRecordingStateEnum) |  |  [optional] |
| **flaggedReason** | **String** |  |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** |  |  [optional] |
| **calls** | [**List&lt;QueueConversationEventTopicCall&gt;**](QueueConversationEventTopicCall.html) |  |  [optional] |
| **callbacks** | [**List&lt;QueueConversationEventTopicCallback&gt;**](QueueConversationEventTopicCallback.html) |  |  [optional] |
| **chats** | [**List&lt;QueueConversationEventTopicChat&gt;**](QueueConversationEventTopicChat.html) |  |  [optional] |
| **cobrowsesessions** | [**List&lt;QueueConversationEventTopicCobrowse&gt;**](QueueConversationEventTopicCobrowse.html) |  |  [optional] |
| **emails** | [**List&lt;QueueConversationEventTopicEmail&gt;**](QueueConversationEventTopicEmail.html) |  |  [optional] |
| **messages** | [**List&lt;QueueConversationEventTopicMessage&gt;**](QueueConversationEventTopicMessage.html) |  |  [optional] |
| **screenshares** | [**List&lt;QueueConversationEventTopicScreenshare&gt;**](QueueConversationEventTopicScreenshare.html) |  |  [optional] |
| **socialExpressions** | [**List&lt;QueueConversationEventTopicSocialExpression&gt;**](QueueConversationEventTopicSocialExpression.html) |  |  [optional] |
| **videos** | [**List&lt;QueueConversationEventTopicVideo&gt;**](QueueConversationEventTopicVideo.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
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



