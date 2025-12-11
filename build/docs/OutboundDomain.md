# OutboundDomain


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique Id of the domain such as: example.com |  |
| **name** | **String** |  |  [optional] |
| **cnameVerificationResult** | [**VerificationResult**](VerificationResult) | CNAME registration Status |  [optional] |
| **dkimVerificationResult** | [**VerificationResult**](VerificationResult) | DKIM registration Status |  [optional] |
| **senderType** | [**SenderTypeEnum**](#Enum--SenderTypeEnum) | Sender Type |  [optional] |
| **emailSetting** | [**EmailSetting**](EmailSetting) | The email settings associated with this domain. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EMAILDOMAIN | &quot;EmailDomain&quot; | 
| MOCKEMAILDOMAIN | &quot;MockEmailDomain&quot; | 
| EMAILSMTPDOMAIN | &quot;EmailSmtpDomain&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
