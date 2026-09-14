# WhatsAppEmbeddedSignupIntegrationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the WhatsApp Integration. Required for Embedded Signup v2; optional for v4 (set later via PATCH). |  [optional] |
| **supportedContent** | [**SupportedContentReference**](SupportedContentReference) | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | [**MessagingSettingRequestReference**](MessagingSettingRequestReference) | Defines the message settings to be applied for this integration |  [optional] |
| **embeddedSignupAccessToken** | **String** | The access token returned from the embedded signup flow. Not required for versions v4 or later. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:263.0.0_
