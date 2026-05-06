# GoogleBusinessProfileOpenIntegrationUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Google Business Profile Open Integration. |  [optional] |
| **supportedContent** | [**SupportedContentReference**](SupportedContentReference) | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | [**MessagingSettingRequestReference**](MessagingSettingRequestReference) | Defines the message settings to be applied for this integration |  [optional] |
| **token** | [**GoogleAuthTokenReference**](GoogleAuthTokenReference) | Google OAuth 2 access token reference. The actual token cannot be accessed via Genesys API, only referenced by this property by its ID. When the token is not referenced by any integration, it is deleted after 24 hours. |  [optional] |
| **account** | [**GoogleBusinessProfileAccountReference**](GoogleBusinessProfileAccountReference) | Google Business Profile account accessible with the authorization token |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:252.1.0_
