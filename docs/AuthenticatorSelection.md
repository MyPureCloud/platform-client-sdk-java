# AuthenticatorSelection


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **authenticatorAttachment** | **String** | Desired authenticator attachment modality ('platform' or 'cross-platform'). |  [optional] |
| **requireResidentKey** | **Boolean** | Whether a resident (discoverable) credential is required. Deprecated by the WebAuthn spec in favor of residentKey. |  [optional] |
| **residentKey** | **String** | The relying party's requirement for resident (discoverable) credentials ('discouraged', 'preferred', or 'required'). |  [optional] |
| **userVerification** | **String** | The user verification requirement ('discouraged', 'preferred', or 'required'). |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
