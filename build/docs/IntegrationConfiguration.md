# IntegrationConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the integration, used to distinguish this integration from others of the same type. |  |
| **version** | **Integer** | Version number required for updates. |  |
| **properties** | **Object** | Key-value configuration settings described by the schema in the propertiesSchemaUri field. |  |
| **advanced** | **Object** | Advanced configuration described by the schema in the advancedSchemaUri field. |  |
| **notes** | **String** | Notes about the integration. |  |
| **credentials** | [**Map&lt;String, CredentialInfo&gt;**](CredentialInfo) | Credentials required by the integration. The required keys are indicated in the credentials property of the Integration Type |  |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
