---
title: Participant
---
## Participant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A globally unique identifier for this conversation. |  [optional] |
| **startTime** | [**Date**](Date.html) | The timestamp when this participant joined the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **endTime** | [**Date**](Date.html) | The timestamp when this participant disconnected from the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **connectedTime** | [**Date**](Date.html) | The timestamp when this participant was connected to the conversation in the provider clock. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **name** | **String** | A human readable name identifying the participant. |  [optional] |
| **userUri** | **String** | If this participant represents a user, then this will be an URI that can be used to fetch the user. |  [optional] |
| **userId** | **String** | If this participant represents a user, then this will be the globally unique identifier for the user. |  [optional] |
| **externalContactId** | **String** | If this participant represents an external contact, then this will be the globally unique identifier for the external contact. |  [optional] |
| **externalOrganizationId** | **String** | If this participant represents an external org, then this will be the globally unique identifier for the external org. |  [optional] |
| **queueId** | **String** | If present, the queue id that the communication channel came in on. |  [optional] |
| **groupId** | **String** | If present, group of users the participant represents. |  [optional] |
| **queueName** | **String** | If present, the queue name that the communication channel came in on. |  [optional] |
| **purpose** | **String** | A well known string that specifies the purpose of this participant. |  [optional] |
| **participantType** | **String** | A well known string that specifies the type of this participant. |  [optional] |
| **consultParticipantId** | **String** | If this participant is part of a consult transfer, then this will be the participant id of the participant being transferred. |  [optional] |
| **address** | **String** | The address for the this participant. For a phone call this will be the ANI. |  [optional] |
| **ani** | **String** | The address for the this participant. For a phone call this will be the ANI. |  [optional] |
| **aniName** | **String** | The ani-based name for this participant. |  [optional] |
| **dnis** | **String** | The address for the this participant. For a phone call this will be the ANI. |  [optional] |
| **locale** | **String** | An ISO 639 language code specifying the locale for this participant |  [optional] |
| **wrapupRequired** | **Boolean** | True iff this participant is required to enter wrapup for this conversation. |  [optional] |
| **wrapupPrompt** | [**WrapupPromptEnum**](#WrapupPromptEnum) | This field controls how the UI prompts the agent for a wrapup. |  [optional] |
| **wrapupTimeoutMs** | **Integer** | Specifies how long a timed ACW session will last. |  [optional] |
| **wrapupSkipped** | **Boolean** | The UI sets this field when the agent chooses to skip entering a wrapup for this participant. |  [optional] |
| **wrapup** | [**Wrapup**](Wrapup.html) | Call wrap up or disposition data. |  [optional] |
| **monitoredParticipantId** | **String** | If this participant is a monitor, then this will be the id of the participant that is being monitored. |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** | Additional participant attributes |  [optional] |
| **calls** | [**List&lt;Call&gt;**](Call.html) |  |  [optional] |
| **callbacks** | [**List&lt;Callback&gt;**](Callback.html) |  |  [optional] |
| **chats** | [**List&lt;ConversationChat&gt;**](ConversationChat.html) |  |  [optional] |
| **cobrowsesessions** | [**List&lt;Cobrowsesession&gt;**](Cobrowsesession.html) |  |  [optional] |
| **emails** | [**List&lt;Email&gt;**](Email.html) |  |  [optional] |
| **messages** | [**List&lt;Message&gt;**](Message.html) |  |  [optional] |
| **screenshares** | [**List&lt;Screenshare&gt;**](Screenshare.html) |  |  [optional] |
| **socialExpressions** | [**List&lt;SocialExpression&gt;**](SocialExpression.html) |  |  [optional] |
| **videos** | [**List&lt;Video&gt;**](Video.html) |  |  [optional] |
| **evaluations** | [**List&lt;Evaluation&gt;**](Evaluation.html) |  |  [optional] |
| **screenRecordingState** | [**ScreenRecordingStateEnum**](#ScreenRecordingStateEnum) | The current screen recording state for this participant. |  [optional] |
{: class="table table-striped"}


<a name="WrapupPromptEnum"></a>

## Enum: WrapupPromptEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MANDATORY | &quot;mandatory&quot; |
| OPTIONAL | &quot;optional&quot; |
| TIMEOUT | &quot;timeout&quot; |
| FORCEDTIMEOUT | &quot;forcedTimeout&quot; |


<a name="ScreenRecordingStateEnum"></a>

## Enum: ScreenRecordingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| REQUESTED | &quot;requested&quot; |
| ACTIVE | &quot;active&quot; |
| PAUSED | &quot;paused&quot; |
| STOPPED | &quot;stopped&quot; |
| ERROR | &quot;error&quot; |
{: class="table table-striped"}


