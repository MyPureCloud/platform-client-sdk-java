# OrgAuthSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **multifactorAuthenticationRequired** | **Boolean** | Indicates whether multi-factor authentication is required. |  [optional] |
| **domainAllowlistEnabled** | **Boolean** | Indicates whether the domain allowlist is enabled. |  [optional] |
| **domainAllowlist** | **List&lt;String&gt;** | The list of domains that will be allowed to embed Genesys Cloud applications. |  [optional] |
| **ipAddressAllowlist** | **List&lt;String&gt;** | The list of IP addresses that will be allowed to authenticate with Genesys Cloud. |  [optional] |
| **passwordRequirements** | [**PasswordRequirements**](PasswordRequirements) | The password requirements for the organization. |  [optional] |
| **inactivityTimeoutExclusions** | **List&lt;String&gt;** | The list of exempt apis from inactivity timeout. |  [optional] |
| **universalLogout** | **Boolean** | Indicates whether universal logout is enabled for the organization. |  [optional] |
| **tokenStorageLocation** | [**TokenStorageLocationEnum**](#Enum--TokenStorageLocationEnum) | The browser storage location used for authentication tokens. |  [optional] |


## Enum: TokenStorageLocationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PERSISTENT | &quot;persistent&quot; | 
| SESSION | &quot;session&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
