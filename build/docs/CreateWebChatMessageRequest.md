---
title: CreateWebChatMessageRequest
---
## CreateWebChatMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **body** | <!----><!---->**String**<!----> | The message body. Note that message bodies are limited to 4,000 characters. |  |
| **bodyType** | [**BodyTypeEnum**](#BodyTypeEnum)<!----> | The purpose of the message within the conversation, such as a standard text entry versus a greeting. |  [optional] |
{: class="table table-striped"}


<a name="BodyTypeEnum"></a>

## Enum: BodyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;standard&quot; | 
| NOTICE | &quot;notice&quot; | 
| MEMBER_JOIN | &quot;member-join&quot; | 
| MEMBER_LEAVE | &quot;member-leave&quot; | 
| MEDIA_REQUEST | &quot;media-request&quot; | 
{: class="table table-striped"}



