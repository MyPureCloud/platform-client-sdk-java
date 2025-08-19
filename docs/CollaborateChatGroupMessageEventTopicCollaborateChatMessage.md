# CollaborateChatGroupMessageEventTopicCollaborateChatMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | **String** |  |  [optional] |
| **created** | **String** |  |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) |  |  [optional] |
| **body** | **String** |  |  [optional] |
| **from** | [**CollaborateChatGroupMessageEventTopicCollaborateChatEntity**](CollaborateChatGroupMessageEventTopicCollaborateChatEntity) |  |  [optional] |
| **to** | [**CollaborateChatGroupMessageEventTopicCollaborateChatEntity**](CollaborateChatGroupMessageEventTopicCollaborateChatEntity) |  |  [optional] |
| **mentions** | [**List&lt;CollaborateChatGroupMessageEventTopicCollaborateChatEntity&gt;**](CollaborateChatGroupMessageEventTopicCollaborateChatEntity) |  |  [optional] |
| **notifyAll** | **Boolean** |  |  [optional] |
| **reactions** | [**Map&lt;String, List&lt;String&gt;&gt;**](List) |  |  [optional] |


## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;Create&quot; | 
| EDIT | &quot;Edit&quot; | 
| DELETE | &quot;Delete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
