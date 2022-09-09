---
title: TwitterIntegrationRequest
---
## TwitterIntegrationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Twitter Integration |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingRequestReference**](MessagingSettingRequestReference.html)<!----> | Defines the message settings to be applied for this integration |  [optional] |
| **accessTokenKey** | <!----><!---->**String**<!----> | The Access Token Key from Twitter messenger |  |
| **accessTokenSecret** | <!----><!---->**String**<!----> | The Access Token Secret from Twitter messenger |  |
| **consumerKey** | <!----><!---->**String**<!----> | The Consumer Key from Twitter messenger |  |
| **consumerSecret** | <!----><!---->**String**<!----> | The Consumer Secret from Twitter messenger |  |
| **tier** | [**TierEnum**](#TierEnum)<!----> | The type of twitter account to be used for the integration |  |
| **envName** | <!----><!---->**String**<!----> | The Twitter environment name, e.g.: env-beta (required for premium tier) |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TierEnum"></a>

## Enum: TierEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PREMIUM | &quot;premium&quot; | 
| ENTERPRISE | &quot;enterprise&quot; | 
{: class="table table-striped"}



