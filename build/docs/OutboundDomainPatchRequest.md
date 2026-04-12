# OutboundDomainPatchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **customSMTPServer** | [**CustomSmtpServerRequest**](CustomSmtpServerRequest) | The custom SMTP server integration to use when sending outbound emails from this domain. |  [optional] |
| **senderType** | [**SenderTypeEnum**](#Enum--SenderTypeEnum) | Sender Type |  [optional] |
| **emailSetting** | [**EmailSettingReference**](EmailSettingReference) | The email settings to associate with this domain. |  [optional] |


## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EMAILDOMAIN | &quot;EmailDomain&quot; | 
| MOCKEMAILDOMAIN | &quot;MockEmailDomain&quot; | 
| EMAILSMTPDOMAIN | &quot;EmailSmtpDomain&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:252.0.0_
