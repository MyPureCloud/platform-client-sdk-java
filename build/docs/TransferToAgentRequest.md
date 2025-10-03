# TransferToAgentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transferType** | [**TransferTypeEnum**](#Enum--TransferTypeEnum) | The type of transfer to perform. Attended, where the initiating agent maintains ownership of the conversation until the intended recipient accepts the transfer, or Unattended, where the initiating agent immediately disconnects. Default is Unattended. |  [optional] |
| **keepInternalMessageAlive** | **Boolean** | If true, the digital internal message will NOT be terminated. |  [optional] |
| **userId** | **String** | The id of the internal user. |  [optional] |
| **userName** | **String** | The userName (like user’s email) of the internal user. |  [optional] |
| **userDisplayName** | **String** | The name of the internal user. |  [optional] |
| **voicemail** | **Boolean** | If true, transfer to the voicemail inbox of the participant that is being replaced. |  [optional] |


## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
