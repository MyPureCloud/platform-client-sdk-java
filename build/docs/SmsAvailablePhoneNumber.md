---
title: SmsAvailablePhoneNumber
---
## SmsAvailablePhoneNumber


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **phoneNumber** | <!----><!---->**String**<!----> | A phone number available for provisioning in E.164 format. E.g. +13175555555 or +34234234234 |  [optional] |
| **countryCode** | <!----><!---->**String**<!----> | The ISO 3166-1 alpha-2 country code of the country this phone number is associated with. |  [optional] |
| **region** | <!----><!---->**String**<!----> | The region/province/state the phone number is associated with. |  [optional] |
| **city** | <!----><!---->**String**<!----> | The city the phone number is associated with. |  [optional] |
| **capabilities** | <!---->[**List&lt;CapabilitiesEnum&gt;**](#CapabilitiesEnum)<!----> | The capabilities of the phone number available for provisioning. |  [optional] |
| **phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum)<!----> | The type of phone number available for provisioning. |  [optional] |
| **addressRequirement** | [**AddressRequirementEnum**](#AddressRequirementEnum)<!----> | The address requirement needed for provisioning this number. If there is a requirement, the address must be the residence or place of business of the individual or entity using the phone number. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="CapabilitiesEnum"></a>

## Enum: CapabilitiesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;sms&quot; |
| MMS | &quot;mms&quot; |
| VOICE | &quot;voice&quot; |
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


<a name="AddressRequirementEnum"></a>

## Enum: AddressRequirementEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;none&quot; | 
| ANY | &quot;any&quot; | 
| LOCAL | &quot;local&quot; | 
| FOREIGN | &quot;foreign&quot; | 
{: class="table table-striped"}



