# CreateWebChatMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **body** | **String** | The message body. Note that message bodies are limited to 4,000 characters. |  |
| **bodyType** | [**BodyTypeEnum**](#Enum--BodyTypeEnum) | The purpose of the message within the conversation, such as a standard text entry versus a greeting. |  [optional] |


## Enum: BodyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;standard&quot; | 
| NOTICE | &quot;notice&quot; | 
| MEMBER_JOIN | &quot;member-join&quot; | 
| MEMBER_LEAVE | &quot;member-leave&quot; | 
| MEDIA_REQUEST | &quot;media-request&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
