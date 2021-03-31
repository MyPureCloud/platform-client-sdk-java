---
title: MessagingRecipient
---
## MessagingRecipient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **nickname** | <!----><!---->**String**<!----> | Nickname/user name |  [optional] |
| **id** | <!----><!---->**String**<!----> | The recipient identifier specific for particular channel/integration. This is required when sending a message. |  |
| **idType** | [**IdTypeEnum**](#IdTypeEnum)<!----> | The recipient identifier type. This is used to indicate the format used by the recipient identifier. |  [optional] |
| **image** | <!----><!---->**String**<!----> | Path or URI to an image file containing an avatar |  [optional] |
| **firstName** | <!----><!---->**String**<!----> | Sender&#39;s first name |  [optional] |
| **lastName** | <!----><!---->**String**<!----> | Sender&#39;s last name |  [optional] |
| **email** | <!----><!---->**String**<!----> | Sender&#39;s email address |  [optional] |
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



