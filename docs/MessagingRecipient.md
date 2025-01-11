# MessagingRecipient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **nickname** | **String** | Nickname or display name of the recipient. |  [optional] |
| **id** | **String** | The recipient ID specific to the provider. |  |
| **idType** | [**IdTypeEnum**](#Enum--IdTypeEnum) | The recipient ID type. This is used to indicate the format used for the ID. |  [optional] |
| **image** | **String** | URL of an image that represents the recipient. |  [optional] |
| **firstName** | **String** | First name of the recipient. |  [optional] |
| **lastName** | **String** | Last name of the recipient. |  [optional] |
| **email** | **String** | E-mail address of the recipient. |  [optional] |
| **externalContactId** | **String** | The identifier of the external contact. |  [optional] |
| **additionalIds** | [**List&lt;RecipientAdditionalIdentifier&gt;**](RecipientAdditionalIdentifier) | List of recipient additional identifiers |  [optional] |


## Enum: IdTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;Email&quot; | 
| PHONE | &quot;Phone&quot; | 
| OPAQUE | &quot;Opaque&quot; | 
| TOPIC | &quot;Topic&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
