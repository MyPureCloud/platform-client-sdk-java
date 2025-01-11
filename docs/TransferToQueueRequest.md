# TransferToQueueRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transferType** | [**TransferTypeEnum**](#Enum--TransferTypeEnum) | The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended. |  [optional] |
| **keepInternalMessageAlive** | **Boolean** | If true, the digital internal message will NOT be terminated. |  [optional] |
| **queueId** | **String** | The id of the queue. |  [optional] |
| **queueName** | **String** | The name of the queue. |  [optional] |


## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
