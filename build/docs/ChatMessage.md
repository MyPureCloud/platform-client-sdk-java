---
title: ChatMessage
---
## ChatMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **body** | <!----><!---->**String**<!----> | The message body |  [optional] |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **to** | <!----><!---->**String**<!----> | The message recipient |  [optional] |
| **from** | <!----><!---->**String**<!----> | The message sender |  [optional] |
| **utc** | <!----><!---->**String**<!----> |  |  [optional] |
| **chat** | <!----><!---->**String**<!----> | The interaction id (if available) |  [optional] |
| **message** | <!----><!---->**String**<!----> | The message id |  [optional] |
| **type** | <!----><!---->**String**<!----> |  |  [optional] |
| **bodyType** | [**BodyTypeEnum**](#BodyTypeEnum)<!----> | Type of the message body (v2 chats only) |  [optional] |
| **senderCommunicationId** | <!----><!---->**String**<!----> | Communication of sender (v2 chats only) |  [optional] |
| **participantPurpose** | <!----><!---->**String**<!----> | Participant purpose of sender (v2 chats only) |  [optional] |
| **user** | <!----><!---->[**ChatMessageUser**](ChatMessageUser.html)<!----> | The user information for the sender (if available) |  [optional] |
{: class="table table-striped"}


<a name="BodyTypeEnum"></a>

## Enum: BodyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;STANDARD&quot; | 
| ACTIVITY | &quot;ACTIVITY&quot; | 
| TYPING | &quot;TYPING&quot; | 
| NOTICE | &quot;NOTICE&quot; | 
| MEMBERJOIN | &quot;MEMBERJOIN&quot; | 
| MEMBERLEAVE | &quot;MEMBERLEAVE&quot; | 
| MEDIAREQUEST | &quot;MEDIAREQUEST&quot; | 
{: class="table table-striped"}



