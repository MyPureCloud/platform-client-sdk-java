---
title: SmsPhoneNumberProvision
---
## SmsPhoneNumberProvision


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **phoneNumber** | <!----><!---->**String**<!----> | A phone number to be used for SMS communications. E.g. +13175555555 or +34234234234 |  |
| **phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum)<!----> | Type of the phone number provisioned. |  |
| **countryCode** | <!----><!---->**String**<!----> | The ISO 3166-1 alpha-2 country code of the country this phone number is associated with. |  |
| **addressId** | <!----><!---->**String**<!----> | The id of an address added on your account. Due to regulatory requirements in some countries, an address may be required when provisioning a sms number. In those cases you should provide the provisioned sms address id here |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="PhoneNumberTypeEnum"></a>

## Enum: PhoneNumberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOCAL | &quot;local&quot; | 
| MOBILE | &quot;mobile&quot; | 
| TOLLFREE | &quot;tollfree&quot; | 
| SHORTCODE | &quot;shortcode&quot; | 
{: class="table table-striped"}



