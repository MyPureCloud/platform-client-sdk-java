# OpenSocialMediaRecipient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The recipient ID specific to the provider. |  |
| **idType** | [**IdTypeEnum**](#Enum--IdTypeEnum) | The recipient ID type. This is used to indicate the format used for the ID. |  [optional] |
| **firstName** | **String** | First name of the recipient. |  [optional] |
| **lastName** | **String** | Last name of the recipient. |  [optional] |
| **nickname** | **String** | Nickname or display name of the recipient. |  [optional] |
| **image** | **String** | URL of an image that represents the recipient. |  [optional] |
| **additionalIds** | [**List&lt;OpenSocialMediaRecipientAdditionalIdentifier&gt;**](OpenSocialMediaRecipientAdditionalIdentifier) | List of recipient additional identifiers |  [optional] |


## Enum: IdTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;Email&quot; | 
| PHONE | &quot;Phone&quot; | 
| OPAQUE | &quot;Opaque&quot; | 
| TOPIC | &quot;Topic&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
