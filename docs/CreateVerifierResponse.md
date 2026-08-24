# CreateVerifierResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique identifier of the verifier. |  [optional] |
| **name** | **String** | The name of the verifier. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of verifier. |  [optional] |
| **enabled** | **Boolean** | Indicates whether this verifier is enabled. |  [optional] |
| **keyUri** | **String** | The key URI for TOTP authenticator app registration. |  [optional] |
| **_default** | **Boolean** | Indicates whether this is the default verifier. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TOTP | &quot;TOTP&quot; | 
| WEBAUTHN | &quot;WEBAUTHN&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
