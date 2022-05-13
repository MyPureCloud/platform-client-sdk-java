---
title: InboundMessageRequest
---
## InboundMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queueId** | <!----><!---->**String**<!----> | The ID of the queue to use for routing the email conversation. This field is mutually exclusive with flowId |  [optional] |
| **flowId** | <!----><!---->**String**<!----> | The ID of the flow to use for routing email conversation. This field is mutually exclusive with queueId |  [optional] |
| **provider** | <!----><!---->**String**<!----> | The name of the provider that is sourcing the email such as Oracle, Salesforce, etc. |  |
| **skillIds** | <!----><!---->**List&lt;String&gt;**<!----> | The list of skill ID's to use for routing. |  [optional] |
| **languageId** | <!----><!---->**String**<!----> | The ID of the language to use for routing. |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority to assign to the conversation for routing. |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> | The list of attributes to associate with the customer participant. |  [optional] |
| **toAddress** | <!----><!---->**String**<!----> | The email address of the recipient of the email. |  [optional] |
| **toName** | <!----><!---->**String**<!----> | The name of the recipient of the email. |  [optional] |
| **fromAddress** | <!----><!---->**String**<!----> | The email address of the sender of the email. |  [optional] |
| **fromName** | <!----><!---->**String**<!----> | The name of the sender of the email. |  [optional] |
| **subject** | <!----><!---->**String**<!----> | The subject of the email |  [optional] |
{: class="table table-striped"}



