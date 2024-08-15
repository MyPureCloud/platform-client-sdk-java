# ConversationEventTopicRecentTransfer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the command. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **dateIssued** | [**Date**](Date) | The date/time that this command was issued. |  [optional] |
| **initiator** | [**ConversationEventTopicInitiator**](ConversationEventTopicInitiator) |  |  [optional] |
| **modifiedBy** | [**ConversationEventTopicModifiedBy**](ConversationEventTopicModifiedBy) |  |  [optional] |
| **destination** | [**ConversationEventTopicDestination**](ConversationEventTopicDestination) |  |  [optional] |
| **transferType** | [**TransferTypeEnum**](#Enum--TransferTypeEnum) | The type of transfer to perform. |  [optional] |
{: class="table table-striped"}


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
{: class="table table-striped"}


## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;attended&quot; | 
| UNATTENDED | &quot;unattended&quot; | 
{: class="table table-striped"}



