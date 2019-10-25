---
title: FacebookIntegrationRequest
---
## FacebookIntegrationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Facebook Integration |  |
| **pageAccessToken** | <!----><!---->**String**<!----> | The long-lived Page Access Token of a facebook page.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When a pageAccessToken is provided, pageId and userAccessToken are not required. |  [optional] |
| **userAccessToken** | <!----><!---->**String**<!----> | The short-lived User Access Token of the facebook user logged into the facebook app.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When userAccessToken is provided, pageId is mandatory.  When userAccessToken/pageId combination is provided, pageAccessToken is not required. |  [optional] |
| **pageId** | <!----><!---->**String**<!----> | The page Id of a facebook page. The pageId is required when userAccessToken is provided. |  [optional] |
| **appId** | <!----><!---->**String**<!----> | The app Id of a facebook app |  |
| **appSecret** | <!----><!---->**String**<!----> | The app Secret of a facebook app |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



