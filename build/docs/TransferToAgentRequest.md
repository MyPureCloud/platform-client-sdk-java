---
title: TransferToAgentRequest
---
## TransferToAgentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transferType** | [**TransferTypeEnum**](#TransferTypeEnum)<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> | The id of the internal user. |  [optional] |
| **userName** | <!----><!---->**String**<!----> | The userName (like user’s email) of the internal user. |  [optional] |
| **userDisplayName** | <!----><!---->**String**<!----> | The name of the internal user. |  [optional] |
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



