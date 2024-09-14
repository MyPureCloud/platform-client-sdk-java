# ConversationCategory


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the category |  [optional] |
| **name** | **String** | The name of the category |  [optional] |
| **description** | **String** | The description of the category |  [optional] |
| **interactionType** | [**InteractionTypeEnum**](#Enum--InteractionTypeEnum) | The type of interaction the category will apply to |  [optional] |
| **criteria** | [**Operand**](Operand) | A collection of conditions joined together by logical operation to provide more refined filtering of conversations |  [optional] |


## Enum: InteractionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| DIGITAL | &quot;Digital&quot; | 
| ALL | &quot;All&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
