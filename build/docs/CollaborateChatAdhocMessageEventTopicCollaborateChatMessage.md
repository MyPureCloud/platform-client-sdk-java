# CollaborateChatAdhocMessageEventTopicCollaborateChatMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | **String** |  |  [optional] |
| **created** | **String** |  |  [optional] |
| **actionType** | [**ActionTypeEnum**](#Enum--ActionTypeEnum) |  |  [optional] |
| **body** | **String** |  |  [optional] |
| **from** | [**CollaborateChatAdhocMessageEventTopicCollaborateChatEntity**](CollaborateChatAdhocMessageEventTopicCollaborateChatEntity) |  |  [optional] |
| **to** | [**CollaborateChatAdhocMessageEventTopicCollaborateChatEntity**](CollaborateChatAdhocMessageEventTopicCollaborateChatEntity) |  |  [optional] |
| **mentions** | [**List&lt;CollaborateChatAdhocMessageEventTopicCollaborateChatEntity&gt;**](CollaborateChatAdhocMessageEventTopicCollaborateChatEntity) |  |  [optional] |
| **notifyAll** | **Boolean** |  |  [optional] |
| **reactions** | [**Map&lt;String, List&lt;String&gt;&gt;**](List) |  |  [optional] |


## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;Create&quot; | 
| EDIT | &quot;Edit&quot; | 
| DELETE | &quot;Delete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
