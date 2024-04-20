---
title: TransferToExternalRequest
---
## TransferToExternalRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transferType** | [**TransferTypeEnum**](#TransferTypeEnum)<!----> | The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended. |  [optional] |
| **address** | <!----><!---->**String**<!----> | The address (like phone number) of the external contact. |  [optional] |
{: class="table table-striped"}


<a name="TransferTypeEnum"></a>

## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 
{: class="table table-striped"}



