---
title: ConversationContentNotificationTemplate
---
## ConversationContentNotificationTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The identifier of the message template in 'your-namespace@your-template-id/name' format. For External vendor (e.g WhatsApp), 'your-namespace@your-template-name'. For GenesysCloud canned response message template use 'cannedresponse' as your-namespace and use response ID as your-template-id (e.g. response ID=1234 then 'cannedresponse@1234') |  [optional] |
| **language** | <!----><!---->**String**<!----> | Template language. |  [optional] |
| **header** | <!----><!---->[**ConversationNotificationTemplateHeader**](ConversationNotificationTemplateHeader.html)<!----> | The template header. |  [optional] |
| **body** | <!----><!---->[**ConversationNotificationTemplateBody**](ConversationNotificationTemplateBody.html)<!----> | The template body. |  |
| **footer** | <!----><!---->[**ConversationNotificationTemplateFooter**](ConversationNotificationTemplateFooter.html)<!----> | The template footer. |  [optional] |
{: class="table table-striped"}



