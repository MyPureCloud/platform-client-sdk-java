---
title: WebChatMessage
---
## WebChatMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **conversation** | <!----><!---->[**WebChatConversation**](WebChatConversation.html)<!----> | The identifier of the conversation |  |
| **sender** | <!----><!---->[**WebChatMemberInfo**](WebChatMemberInfo.html)<!----> | The member who sent the message |  |
| **body** | <!----><!---->**String**<!----> | The message body. |  |
| **bodyType** | [**BodyTypeEnum**](#BodyTypeEnum)<!----> | The purpose of the message within the conversation, such as a standard text entry versus a greeting. |  |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of the message, in ISO-8601 format |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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



