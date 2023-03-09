---
title: ConversationMessageEventTopicErrorDetails
---
## ConversationMessageEventTopicErrorDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | <!----><!---->**Integer**<!----> | The HTTP status code for this message (400, 401, 403, 404, 500, etc. |  [optional] |
| **code** | <!----><!---->**String**<!----> | A code unique to this error. |  [optional] |
| **message** | <!----><!---->**String**<!----> | Friendly description of this error. |  [optional] |
| **messageWithParams** | <!----><!---->**String**<!----> | This is the same as message except it uses template fields for variable replacement. For instance: 'User {username} was not found' |  [optional] |
| **messageParams** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Used in conjunction with messageWithParams. These are the template parameters. For instance: UserParam.key = 'username', UserParam.value = 'john.doe' |  [optional] |
| **contextId** | <!----><!---->**String**<!----> | The correlation Id or context Id for this message. If left blank the Public API will look at the HTTP response header 'ININ-Correlation-Id' instead. |  [optional] |
| **uri** | <!----><!---->**String**<!----> |  |  [optional] |
{: class="table table-striped"}



