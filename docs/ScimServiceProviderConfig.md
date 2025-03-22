# ScimServiceProviderConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemas** | **List&lt;String&gt;** | The list of supported schemas. |  [optional] |
| **documentationUri** | **String** | The HTTP-addressable URL that points to the service provider's documentation. |  [optional] |
| **patch** | [**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature) | The \"patch\" configuration options. |  [optional] |
| **filter** | [**ScimServiceProviderConfigFilterFeature**](ScimServiceProviderConfigFilterFeature) | The \"filter\" configuration options. |  [optional] |
| **etag** | [**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature) | The \"etag\" configuration options. |  [optional] |
| **sort** | [**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature) | The \"sort\" configuration options. |  [optional] |
| **bulk** | [**ScimServiceProviderConfigBulkFeature**](ScimServiceProviderConfigBulkFeature) | The \"bulk\" configuration options. |  [optional] |
| **changePassword** | [**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature) | The \"changePassword\" configuration options. |  [optional] |
| **authenticationSchemes** | [**List&lt;ScimServiceProviderConfigAuthenticationScheme&gt;**](ScimServiceProviderConfigAuthenticationScheme) | The list of supported authentication schemes. |  [optional] |
| **meta** | [**ScimMetadata**](ScimMetadata) | The metadata of the SCIM resource. Metadata is defined as immutable per SCIM RFC. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
