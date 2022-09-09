---
title: LineIntegrationRequest
---
## LineIntegrationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the LINE Integration |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingRequestReference**](MessagingSettingRequestReference.html)<!----> | Defines the message settings to be applied for this integration |  [optional] |
| **channelId** | <!----><!---->**String**<!----> | The Channel Id from LINE messenger. New Official LINE account: To create a new official account, LINE requires a Webhook URL. It can be created without specifying Channel Id & Channel Secret. Once the Official account is created by LINE, use the update LINE Integration API to update Channel Id and Channel Secret.  All other accounts: Channel Id is mandatory. (NOTE: ChannelId can only be updated if the integration is set to inactive) |  [optional] |
| **channelSecret** | <!----><!---->**String**<!----> | The Channel Secret from LINE messenger. New Official LINE account: To create a new official account, LINE requires a Webhook URL. It can be created without specifying Channel Id & Channel Secret. Once the Official account is created by LINE, use the update LINE Integration API to update Channel Id and Channel Secret.  All other accounts: Channel Secret is mandatory. (NOTE: ChannelSecret can only be updated if the integration is set to inactive) |  [optional] |
| **switcherSecret** | <!----><!---->**String**<!----> | The Switcher Secret from LINE messenger. Some line official accounts are switcher functionality enabled. If the LINE account used for this integration is switcher enabled, then switcher secret is a required field. This secret can be found in your create documentation provided by LINE |  [optional] |
| **serviceCode** | <!----><!---->**String**<!----> | The Service Code from LINE messenger. Only applicable to LINE Enterprise accounts. This service code can be found in your create documentation provided by LINE |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



