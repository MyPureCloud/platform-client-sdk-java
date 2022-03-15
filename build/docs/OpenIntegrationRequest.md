---
title: OpenIntegrationRequest
---
## OpenIntegrationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Open messaging integration. |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **outboundNotificationWebhookUrl** | <!----><!---->**String**<!----> | The outbound notification webhook URL for the Open messaging integration. |  |
| **outboundNotificationWebhookSignatureSecretToken** | <!----><!---->**String**<!----> | The outbound notification webhook signature secret token. This token must be longer than 15 characters. |  |
| **webhookHeaders** | <!----><!---->**Map&lt;String, String&gt;**<!----> | The user specified headers for the Open messaging integration. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



