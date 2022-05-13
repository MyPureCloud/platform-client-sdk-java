---
title: ScimServiceProviderConfig
---
## ScimServiceProviderConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemas** | <!----><!---->**List&lt;String&gt;**<!----> | The list of supported schemas. |  [optional] |
| **documentationUri** | <!----><!---->**String**<!----> | The HTTP-addressable URL that points to the service provider's documentation. |  [optional] |
| **patch** | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.html)<!----> | The \"patch\" configuration options. |  [optional] |
| **filter** | <!----><!---->[**ScimServiceProviderConfigFilterFeature**](ScimServiceProviderConfigFilterFeature.html)<!----> | The \"filter\" configuration options. |  [optional] |
| **etag** | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.html)<!----> | The \"etag\" configuration options. |  [optional] |
| **sort** | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.html)<!----> | The \"sort\" configuration options. |  [optional] |
| **bulk** | <!----><!---->[**ScimServiceProviderConfigBulkFeature**](ScimServiceProviderConfigBulkFeature.html)<!----> | The \"bulk\" configuration options. |  [optional] |
| **changePassword** | <!----><!---->[**ScimServiceProviderConfigSimpleFeature**](ScimServiceProviderConfigSimpleFeature.html)<!----> | The \"changePassword\" configuration options. |  [optional] |
| **authenticationSchemes** | <!----><!---->[**List&lt;ScimServiceProviderConfigAuthenticationScheme&gt;**](ScimServiceProviderConfigAuthenticationScheme.html)<!----> | The list of supported authentication schemes. |  [optional] |
| **meta** | <!----><!---->[**ScimMetadata**](ScimMetadata.html)<!----> | The metadata of the SCIM resource. |  [optional] |
{: class="table table-striped"}



