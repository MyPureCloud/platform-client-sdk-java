---
title: TransferRequest
---
## TransferRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transferType** | [**TransferTypeEnum**](#TransferTypeEnum)<!----> | The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended. |  [optional] |
| **userId** | <!----><!---->**String**<!----> | The user ID of the transfer target. |  [optional] |
| **address** | <!----><!---->**String**<!----> | The user ID or queue ID of the transfer target. Address like a phone number can not be used for callbacks, but they can be used for other forms of communication. |  [optional] |
| **userName** | <!----><!---->**String**<!----> | The user name of the transfer target. |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | The queue ID of the transfer target. |  [optional] |
| **voicemail** | <!----><!---->**Boolean**<!----> | If true, transfer to the voicemail inbox of the participant that is being replaced. |  [optional] |
{: class="table table-striped"}


<a name="TransferTypeEnum"></a>

## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 
{: class="table table-striped"}



