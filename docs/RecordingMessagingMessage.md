# RecordingMessagingMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **from** | **String** | The message sender session id. |  [optional] |
| **fromUser** | [**User**](User) | The user who sent this message. |  [optional] |
| **fromExternalContact** | [**ExternalContact**](ExternalContact) | The PureCloud external contact sender details. |  [optional] |
| **to** | **String** | The message recipient. |  [optional] |
| **timestamp** | [**Date**](Date) | The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **id** | **String** | A globally unique identifier for this communication. |  [optional] |
| **purpose** | **String** | A well known string that specifies the purpose or type of the participant on this communication. |  [optional] |
| **participantId** | **String** | A globally unique identifier for the participant on this communication. |  [optional] |
| **queue** | [**AddressableEntityRef**](AddressableEntityRef) | A globally unique identifier for the queue involved in this communication. |  [optional] |
| **workflow** | [**AddressableEntityRef**](AddressableEntityRef) | A globally unique identifier for the workflow involved in this communication. |  [optional] |
| **messageText** | **String** | The content of this message. |  [optional] |
| **messageMediaAttachments** | [**List&lt;MessageMediaAttachment&gt;**](MessageMediaAttachment) | List of media objects attached  with this message. |  [optional] |
| **messageStickerAttachments** | [**List&lt;MessageStickerAttachment&gt;**](MessageStickerAttachment) | List of message stickers attached with this message. |  [optional] |
| **quickReplies** | [**List&lt;QuickReply&gt;**](QuickReply) | List of quick reply options offered with this message. |  [optional] |
| **buttonResponse** | [**ButtonResponse**](ButtonResponse) | Button Response selected by user for this message. |  [optional] |
| **story** | [**RecordingContentStory**](RecordingContentStory) | Ephemeral story content. |  [optional] |
| **cards** | [**List&lt;Card&gt;**](Card) | List of cards offered for this message |  [optional] |
| **contentType** | [**ContentTypeEnum**](#Enum--ContentTypeEnum) | Indicates the content type for this message |  [optional] |


## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| STORY | &quot;Story&quot; | 
| CARD | &quot;Card&quot; | 
| CAROUSEL | &quot;Carousel&quot; | 
| ATTACHMENT | &quot;Attachment&quot; | 
| LOCATION | &quot;Location&quot; | 
| NOTIFICATION | &quot;Notification&quot; | 
| GENERICTEMPLATE | &quot;GenericTemplate&quot; | 
| LISTTEMPLATE | &quot;ListTemplate&quot; | 
| POSTBACK | &quot;Postback&quot; | 
| REACTIONS | &quot;Reactions&quot; | 
| MENTION | &quot;Mention&quot; | 
| BUTTONRESPONSE | &quot;ButtonResponse&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
