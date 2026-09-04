# CreateVerifierRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **algorithm** | [**AlgorithmEnum**](#Enum--AlgorithmEnum) | The hashing algorithm for the TOTP verifier. |  [optional] |
| **digits** | **Integer** | The number of digits in the TOTP code. Must be between 6 and 12. |  [optional] |
| **enabled** | **Boolean** | Indicates whether this verifier will be enabled. |  [optional] |
| **name** | **String** | The name of the verifier. Maximum length is 100 characters. |  |
| **period** | **Integer** | The time period in seconds for the TOTP code. |  [optional] |
| **secretSize** | **Integer** | The size of the shared secret in bytes. Must be between 10 and 64. |  [optional] |
| **_default** | **Boolean** | Indicates whether this will be the default verifier. |  [optional] |


## Enum: AlgorithmEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SHA1 | &quot;SHA1&quot; | 
| SHA256 | &quot;SHA256&quot; | 
| SHA512 | &quot;SHA512&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
