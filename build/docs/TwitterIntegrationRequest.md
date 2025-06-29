# TwitterIntegrationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Twitter Integration |  |
| **supportedContent** | [**SupportedContentReference**](SupportedContentReference) | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | [**MessagingSettingRequestReference**](MessagingSettingRequestReference) | Defines the message settings to be applied for this integration |  [optional] |
| **signupCode** | **String** | The authorization code returned from the signup flow to request access tokens later on |  |
| **appId** | **String** | The appId of the Twitter app to register the integration on |  |
| **codeChallenge** | **String** | The codeChallenge used during the signup flow |  |
| **redirectUri** | **String** | The redirectUri used during the signup flow |  |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
