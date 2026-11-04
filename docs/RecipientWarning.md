# RecipientWarning


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **email** | **String** | The recipient email address that failed validation. |  [optional] |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) | The reason the recipient failed validation. |  [optional] |
| **fieldName** | **String** | The array-index path of the recipient within the draft, for example \"to[0]\", \"cc[1]\" or \"bcc[0]\". |  [optional] |


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INVALIDEMAIL | &quot;InvalidEmail&quot; | 
| DOMAINNOTPERMITTED | &quot;DomainNotPermitted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
