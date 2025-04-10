# CategoryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the category |  |
| **description** | **String** | The description of the category |  [optional] |
| **interactionType** | [**InteractionTypeEnum**](#Enum--InteractionTypeEnum) | The type of interaction the category will apply to |  |
| **criteria** | [**Operand**](Operand) | A collection of conditions joined together by logical operation to provide more refined filtering of conversations |  |


## Enum: InteractionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| DIGITAL | &quot;Digital&quot; | 
| ALL | &quot;All&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
