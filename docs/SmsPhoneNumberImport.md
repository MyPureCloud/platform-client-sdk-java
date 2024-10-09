# SmsPhoneNumberImport


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **phoneNumber** | **String** | A phone number to be used for SMS communications. E.g. +13175555555 or +34234234234 |  |
| **phoneNumberType** | [**PhoneNumberTypeEnum**](#Enum--PhoneNumberTypeEnum) | Type of the phone number provisioned. |  |
| **countryCode** | **String** | The ISO 3166-1 alpha-2 country code of the country this phone number is associated with. |  |
| **integrationId** | **String** | The id of the Genesys Cloud integration this phone number belongs to. |  |
| **compliance** | [**Compliance**](Compliance) | Compliance configuration for short codes, including help, stop and opt in. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: PhoneNumberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOCAL | &quot;local&quot; | 
| MOBILE | &quot;mobile&quot; | 
| TOLLFREE | &quot;tollfree&quot; | 
| SHORTCODE | &quot;shortcode&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
