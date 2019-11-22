---
title: SmsPhoneNumber
---
## SmsPhoneNumber


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **phoneNumber** | <!----><!---->**String**<!----> | A phone number provisioned for SMS communications in E.164 format. E.g. +13175555555 or +34234234234 |  |
| **phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum)<!----> | Type of the phone number provisioned. |  [optional] |
| **provisionedThroughPureCloud** | <!----><!---->**Boolean**<!----> | Is set to false, if the phone number is provisioned through a SMS provider, outside of PureCloud |  [optional] |
| **phoneNumberStatus** | [**PhoneNumberStatusEnum**](#PhoneNumberStatusEnum)<!----> | Status of the provisioned phone number. |  [optional] |
| **capabilities** | <!---->[**List&lt;CapabilitiesEnum&gt;**](#CapabilitiesEnum)<!----> | The capabilities of the phone number available for provisioning. |  [optional] |
| **countryCode** | <!----><!---->**String**<!----> | The ISO 3166-1 alpha-2 country code of the country this phone number is associated with. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date this phone number was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date this phone number was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **createdBy** | <!----><!---->[**User**](User.html)<!----> | User that provisioned this phone number |  [optional] |
| **modifiedBy** | <!----><!---->[**User**](User.html)<!----> | User that last modified this phone number |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Version number required for updates. |  |
| **purchaseDate** | <!----><!---->[**Date**](Date.html)<!----> | Date this phone number was purchased, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **cancellationDate** | <!----><!---->[**Date**](Date.html)<!----> | Contract end date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **renewalDate** | <!----><!---->[**Date**](Date.html)<!----> | Contract renewal date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **autoRenewable** | [**AutoRenewableEnum**](#AutoRenewableEnum)<!----> | Renewal time period of this phone number, if the phoneNumberType is shortcode. |  [optional] |
| **addressId** | <!----><!---->[**SmsAddress**](SmsAddress.html)<!----> | The id of an address attached to this phone number. |  [optional] |
| **shortCodeBillingType** | [**ShortCodeBillingTypeEnum**](#ShortCodeBillingTypeEnum)<!----> | BillingType of this phone number, if the phoneNumberType is shortcode. |  [optional] |
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


<a name="PhoneNumberStatusEnum"></a>

## Enum: PhoneNumberStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INVALID | &quot;INVALID&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| PORTING | &quot;PORTING&quot; |
| PENDING | &quot;PENDING&quot; |
| PENDING_CANCELLATION | &quot;PENDING_CANCELLATION&quot; |
{: class="table table-striped"}


<a name="CapabilitiesEnum"></a>

## Enum: CapabilitiesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;sms&quot; |
| MMS | &quot;mms&quot; |
| VOICE | &quot;voice&quot; |
{: class="table table-striped"}


<a name="AutoRenewableEnum"></a>

## Enum: AutoRenewableEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
{: class="table table-striped"}


<a name="ShortCodeBillingTypeEnum"></a>

## Enum: ShortCodeBillingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BASIC | &quot;Basic&quot; |
| VANITY | &quot;Vanity&quot; |
{: class="table table-striped"}



