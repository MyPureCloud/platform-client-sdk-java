---
title: FacebookIntegrationUpdateRequest
---
## FacebookIntegrationUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Facebook Integration |  [optional] |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingRequestReference**](MessagingSettingRequestReference.html)<!----> | Defines the message settings to be applied for this integration |  [optional] |
| **pageAccessToken** | <!----><!---->**String**<!----> | The long-lived Page Access Token of Facebook page.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  Either pageAccessToken or userAccessToken should be provided. |  [optional] |
| **userAccessToken** | <!----><!---->**String**<!----> | The short-lived User Access Token of the Facebook user logged into the Facebook app.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  Either pageAccessToken or userAccessToken should be provided. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



