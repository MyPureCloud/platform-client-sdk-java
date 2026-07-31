# PublicKeyCredentialCreationOptions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **challenge** | **String** | Cryptographic challenge from the relying party (base64url-encoded). Must be returned to the relying party in the authenticator's response. |  |
| **rp** | [**RelyingPartyEntity**](RelyingPartyEntity) | Information about the relying party. |  |
| **user** | [**UserEntity**](UserEntity) | Information about the user being registered. |  |
| **pubKeyCredParams** | [**List&lt;CredentialParameter&gt;**](CredentialParameter) | Public key credential parameters acceptable to the relying party, in order of preference. |  |
| **timeout** | **Integer** | Time in milliseconds the relying party is willing to wait for the registration operation to complete. |  [optional] |
| **excludeCredentials** | [**List&lt;CredentialDescriptor&gt;**](CredentialDescriptor) | Credentials that should be excluded from registration (e.g., to prevent re-registering an existing authenticator). |  [optional] |
| **authenticatorSelection** | [**AuthenticatorSelection**](AuthenticatorSelection) | Constraints on the type of authenticator that can be used. |  [optional] |
| **hints** | **List&lt;String&gt;** | Hints about the type of authenticator the user should use (e.g., 'security-key', 'client-device', 'hybrid'). |  [optional] |
| **attestation** | **String** | The relying party's attestation conveyance preference ('none', 'indirect', 'direct', or 'enterprise'). |  [optional] |
| **attestationFormats** | **List&lt;String&gt;** | Acceptable attestation statement formats, in order of preference. |  [optional] |
| **extensions** | **Map&lt;String, Object&gt;** | Inputs to client-side WebAuthn extensions. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
