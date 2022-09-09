---
title: FacebookIntegrationRequest
---
## FacebookIntegrationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Facebook Integration |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingRequestReference**](MessagingSettingRequestReference.html)<!----> | Defines the message settings to be applied for this integration |  [optional] |
| **pageAccessToken** | <!----><!---->**String**<!----> | The long-lived Page Access Token of Facebook page.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When a pageAccessToken is provided, pageId and userAccessToken are not required. |  [optional] |
| **userAccessToken** | <!----><!---->**String**<!----> | The short-lived User Access Token of the Facebook user logged into the Facebook app.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When userAccessToken is provided, pageId is mandatory.  When userAccessToken/pageId combination is provided, pageAccessToken is not required. |  [optional] |
| **pageId** | <!----><!---->**String**<!----> | The page Id of Facebook page. The pageId is required when userAccessToken is provided. |  [optional] |
| **appId** | <!----><!---->**String**<!----> | The app Id of Facebook app. The appId is required when a customer wants to use their own approved Facebook app. |  [optional] |
| **appSecret** | <!----><!---->**String**<!----> | The app Secret of Facebook app. The appSecret is required when appId is provided. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



