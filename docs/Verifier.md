# Verifier


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of verifier. |  [optional] |
| **enabled** | **Boolean** | Indicates whether this verifier is enabled. |  [optional] |
| **credential** | [**Credential**](Credential) | The WebAuthn credential associated with this verifier. |  [optional] |
| **_default** | **Boolean** | Indicates whether this is the default verifier. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TOTP | &quot;TOTP&quot; | 
| WEBAUTHN | &quot;WEBAUTHN&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
