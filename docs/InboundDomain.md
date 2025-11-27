# InboundDomain


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique Id of the domain such as: example.com |  [optional] |
| **name** | **String** |  |  [optional] |
| **mxRecordStatus** | [**MxRecordStatusEnum**](#Enum--MxRecordStatusEnum) | Mx Record Status |  [optional] |
| **subDomain** | **Boolean** | Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email. |  [optional] |
| **mailFromSettings** | [**MailFromResult**](MailFromResult) | The DNS settings if the inbound domain is using a custom Mail From. These settings can only be used on InboundDomains where subDomain is false. |  [optional] |
| **customSMTPServer** | [**DomainEntityRef**](DomainEntityRef) | The custom SMTP server integration to use when sending outbound emails from this domain. |  [optional] |
| **emailSetting** | [**EmailSetting**](EmailSetting) | The email settings associated with this domain. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: MxRecordStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VALID | &quot;VALID&quot; | 
| INVALID | &quot;INVALID&quot; | 
| NOT_AVAILABLE | &quot;NOT_AVAILABLE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
