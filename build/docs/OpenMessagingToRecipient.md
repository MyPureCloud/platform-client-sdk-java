---
title: OpenMessagingToRecipient
---
## OpenMessagingToRecipient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **nickname** | <!----><!---->**String**<!----> | Nickname or display name of the recipient. |  [optional] |
| **id** | <!----><!---->**String**<!----> | The recipient ID specific to the provider. |  |
| **idType** | [**IdTypeEnum**](#IdTypeEnum)<!----> | The recipient ID type. This is used to indicate the format used for the ID. |  [optional] |
| **firstName** | <!----><!---->**String**<!----> | First name of the recipient. |  [optional] |
| **lastName** | <!----><!---->**String**<!----> | Last name of the recipient. |  [optional] |
| **image** | <!----><!---->**String**<!----> | URL of an image that represents the recipient. |  [optional] |
| **email** | <!----><!---->**String**<!----> | E-mail address of the recipient. |  [optional] |
{: class="table table-striped"}


<a name="IdTypeEnum"></a>

## Enum: IdTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;Email&quot; | 
| PHONE | &quot;Phone&quot; | 
| OPAQUE | &quot;Opaque&quot; | 
{: class="table table-striped"}



