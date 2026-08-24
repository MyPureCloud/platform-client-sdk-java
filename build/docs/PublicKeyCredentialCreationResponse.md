# PublicKeyCredentialCreationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The credential identifier (base64url-encoded). |  |
| **type** | **String** | The credential type (must be 'public-key'). |  |
| **rawId** | **String** | The raw credential identifier as a binary value (base64url-encoded). |  |
| **authenticatorAttachment** | **String** | The authenticator attachment modality used ('platform' or 'cross-platform'). |  [optional] |
| **clientExtensionResults** | **Map&lt;String, Object&gt;** | Outputs from client-side WebAuthn extensions. |  [optional] |
| **response** | [**AuthenticatorAttestationResponse**](AuthenticatorAttestationResponse) | The authenticator's attestation response. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:260.1.0_
