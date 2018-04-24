---
title: ConversationNotificationParticipant
---
## ConversationNotificationParticipant


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
| **wrapup** | [**ConversationNotificationWrapup**](ConversationNotificationWrapup.html) |  |  [optional] |
| **monitoredParticipantId** | **String** |  |  [optional] |
| **screenRecordingState** | [**ScreenRecordingStateEnum**](#ScreenRecordingStateEnum) |  |  [optional] |
| **flaggedReason** | **String** |  |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** |  |  [optional] |
| **calls** | [**List&lt;ConversationNotificationCalls&gt;**](ConversationNotificationCalls.html) |  |  [optional] |
| **callbacks** | [**List&lt;ConversationNotificationCallbacks&gt;**](ConversationNotificationCallbacks.html) |  |  [optional] |
| **chats** | [**List&lt;ConversationNotificationChats&gt;**](ConversationNotificationChats.html) |  |  [optional] |
| **cobrowsesessions** | [**List&lt;ConversationNotificationCobrowsesessions&gt;**](ConversationNotificationCobrowsesessions.html) |  |  [optional] |
| **emails** | [**List&lt;ConversationNotificationEmails&gt;**](ConversationNotificationEmails.html) |  |  [optional] |
| **messages** | [**List&lt;ConversationNotificationMessages1&gt;**](ConversationNotificationMessages1.html) |  |  [optional] |
| **screenshares** | [**List&lt;ConversationNotificationScreenshares&gt;**](ConversationNotificationScreenshares.html) |  |  [optional] |
| **socialExpressions** | [**List&lt;ConversationNotificationSocialExpressions&gt;**](ConversationNotificationSocialExpressions.html) |  |  [optional] |
| **videos** | [**List&lt;ConversationNotificationVideos&gt;**](ConversationNotificationVideos.html) |  |  [optional] |
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


