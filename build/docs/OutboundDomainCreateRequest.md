# OutboundDomainCreateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique Id of the domain such as: example.com |  |
| **senderType** | [**SenderTypeEnum**](#Enum--SenderTypeEnum) | Sender Type |  [optional] |
| **emailSetting** | [**EmailSettingReference**](EmailSettingReference) | The email settings to associate with this domain. |  [optional] |
| **name** | **String** | The domain such as: example.com |  |


## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EMAILDOMAIN | &quot;EmailDomain&quot; | 
| MOCKEMAILDOMAIN | &quot;MockEmailDomain&quot; | 
| EMAILSMTPDOMAIN | &quot;EmailSmtpDomain&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
