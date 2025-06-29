# ConversationContentNotificationTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The identifier of the message template in 'your-namespace@your-template-id/name' format. For External vendor (e.g WhatsApp), 'your-namespace@your-template-name'. For GenesysCloud canned response message template use 'cannedresponse' as your-namespace and use response ID as your-template-id (e.g. response ID=1234 then 'cannedresponse@1234') |  [optional] |
| **language** | **String** | Template language. |  [optional] |
| **header** | [**ConversationNotificationTemplateHeader**](ConversationNotificationTemplateHeader) | The template header. |  [optional] |
| **body** | [**ConversationNotificationTemplateBody**](ConversationNotificationTemplateBody) | The template body. |  |
| **buttons** | [**List&lt;ConversationNotificationTemplateButton&gt;**](ConversationNotificationTemplateButton) | Template buttons |  [optional] |
| **footer** | [**ConversationNotificationTemplateFooter**](ConversationNotificationTemplateFooter) | The template footer. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
