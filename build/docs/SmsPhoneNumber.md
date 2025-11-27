# SmsPhoneNumber


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **phoneNumber** | **String** | A phone number provisioned for SMS communications. |  |
| **phoneNumberType** | [**PhoneNumberTypeEnum**](#Enum--PhoneNumberTypeEnum) | Type of the phone number provisioned. |  [optional] |
| **provisionedThroughPureCloud** | **Boolean** | Is set to false, if the phone number is provisioned through a SMS provider, outside of PureCloud |  [optional] |
| **phoneNumberStatus** | [**PhoneNumberStatusEnum**](#Enum--PhoneNumberStatusEnum) | Status of the provisioned phone number. |  [optional] |
| **capabilities** | [**List<CapabilitiesEnum>**](#Enum--CapabilitiesEnum) | The capabilities of the phone number available for provisioning. |  [optional] |
| **countryCode** | **String** | The ISO 3166-1 alpha-2 country code of the country this phone number is associated with. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date this phone number was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date this phone number was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**User**](User) | User that provisioned this phone number |  [optional] |
| **modifiedBy** | [**User**](User) | User that last modified this phone number |  [optional] |
| **version** | **Integer** | Version number required for updates. |  |
| **purchaseDate** | [**Date**](Date) | Date this phone number was purchased, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **cancellationDate** | [**Date**](Date) | Contract end date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **renewalDate** | [**Date**](Date) | Contract renewal date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **autoRenewable** | [**AutoRenewableEnum**](#Enum--AutoRenewableEnum) | Renewal time period of this phone number, if the phoneNumberType is shortcode. |  [optional] |
| **addressId** | [**SmsAddress**](SmsAddress) | The id of an address attached to this phone number. |  [optional] |
| **shortCodeBillingType** | [**ShortCodeBillingTypeEnum**](#Enum--ShortCodeBillingTypeEnum) | BillingType of this phone number, if the phoneNumberType is shortcode. |  [optional] |
| **provisioningStatus** | [**SmsProvisioningStatus**](SmsProvisioningStatus) | Status of latest asynchronous provisioning action |  [optional] |
| **country** | **String** | Localized country name for the country code this phone number belongs too |  [optional] |
| **supportsSms** | **Boolean** | Set to true if this phone number has the capability to support SMS |  [optional] |
| **supportsMms** | **Boolean** | Set to true if this phone number has the capability to support MMS |  [optional] |
| **supportsVoice** | **Boolean** | Set to true if this phone number has the capability to support voice |  [optional] |
| **integration** | [**DomainEntityRef**](DomainEntityRef) | The Genesys Cloud integration this phone number belongs to. |  [optional] |
| **compliance** | [**Compliance**](Compliance) | Compliance configuration for short codes, including help, stop and opt in. |  [optional] |
| **supportedContent** | [**SupportedContentReference**](SupportedContentReference) | Defines the media SupportedContent profile configured for an MMS capable phone number. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: PhoneNumberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOCAL | &quot;local&quot; | 
| MOBILE | &quot;mobile&quot; | 
| TOLLFREE | &quot;tollfree&quot; | 
| SHORTCODE | &quot;shortcode&quot; | 
| ALPHANUMERIC | &quot;alphanumeric&quot; | 


## Enum: PhoneNumberStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INVALID | &quot;INVALID&quot; | 
| ACTIVE | &quot;ACTIVE&quot; | 
| PORTING | &quot;PORTING&quot; | 
| PENDING | &quot;PENDING&quot; | 
| PENDING_CANCELLATION | &quot;PENDING_CANCELLATION&quot; | 
| INITIATED | &quot;INITIATED&quot; | 


## Enum: CapabilitiesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;sms&quot; |
| MMS | &quot;mms&quot; |
| VOICE | &quot;voice&quot; |


## Enum: AutoRenewableEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUARTERLY | &quot;Quarterly&quot; | 


## Enum: ShortCodeBillingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BASIC | &quot;Basic&quot; | 
| VANITY | &quot;Vanity&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
