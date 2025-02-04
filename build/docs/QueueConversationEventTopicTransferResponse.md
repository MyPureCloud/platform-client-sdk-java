# QueueConversationEventTopicTransferResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the command. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **dateIssued** | [**Date**](Date) | The date/time that this command was issued. |  [optional] |
| **initiator** | [**QueueConversationEventTopicTransferInitiator**](QueueConversationEventTopicTransferInitiator) |  |  [optional] |
| **modifiedBy** | [**QueueConversationEventTopicTransferModifedBy**](QueueConversationEventTopicTransferModifedBy) |  |  [optional] |
| **destination** | [**QueueConversationEventTopicTransferDestination**](QueueConversationEventTopicTransferDestination) |  |  [optional] |
| **transferType** | [**TransferTypeEnum**](#Enum--TransferTypeEnum) | The type of transfer to perform. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;pending&quot; | 
| ACTIVE | &quot;active&quot; | 
| COMPLETE | &quot;complete&quot; | 
| CANCELED | &quot;canceled&quot; | 
| FAILED | &quot;failed&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| UNKNOWN | &quot;unknown&quot; | 


## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;attended&quot; | 
| UNATTENDED | &quot;unattended&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
