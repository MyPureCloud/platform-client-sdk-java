# AdditionalMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **textBody** | **String** | The body of the text message.  Maximum character counts are: SMS - 765 characters, other channels - 2000 characters. |  |
| **mediaIds** | **List&lt;String&gt;** | The media ids associated with the text message. See https://developer.genesys.cloud/api/rest/v2/conversations/messaging-media-upload for example usage. |  [optional] |
| **stickerIds** | **List&lt;String&gt;** | The sticker ids associated with the text message. |  [optional] |
| **messagingTemplate** | [**SendMessagingTemplateRequest**](SendMessagingTemplateRequest) | The messaging template use to send a predefined canned response with the message |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
