---
title: TransferRequest
---
## TransferRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | <!----><!---->**String**<!----> | The user ID of the transfer target. |  [optional] |
| **address** | <!----><!---->**String**<!----> | The address of the transfer target which can be user ID, queue ID or queue name |  [optional] |
| **userName** | <!----><!---->**String**<!----> | The user name of the transfer target. |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | The queue ID of the transfer target. |  [optional] |
| **voicemail** | <!----><!---->**Boolean**<!----> | If true, transfer to the voicemail inbox of the participant that is being replaced. |  [optional] |
| **transferType** | [**TransferTypeEnum**](#TransferTypeEnum)<!----> | The type of transfer to perform. |  [optional] |
{: class="table table-striped"}


<a name="TransferTypeEnum"></a>

## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 
{: class="table table-striped"}



