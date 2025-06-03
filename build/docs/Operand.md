# Operand


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The Operand type of the category |  |
| **occurrence** | **Integer** | The minimum number of occurrences of the defined operand type |  [optional] |
| **inverted** | **Boolean** | Applies a NOT modifier to the operand group |  [optional] |
| **term** | [**Term**](Term) | Filter interaction by word(s) |  [optional] |
| **topicId** | **String** | Filter interaction by topic ID |  [optional] |
| **voiceSecondsPosition** | [**OperandPosition**](OperandPosition) | Dictates when the operand must occur in a voice interaction |  [optional] |
| **digitalWordsPosition** | [**OperandPosition**](OperandPosition) | Dictates when the operand must occur in a digital interaction |  [optional] |
| **infixOperator** | [**InfixOperator**](InfixOperator) | Defines a logical operation that is applied on the current operand, against the following operand |  [optional] |
| **operands** | [**List&lt;Operand&gt;**](Operand) | Contains a new level of operands |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERM | &quot;Term&quot; | 
| TOPIC | &quot;Topic&quot; | 
| OPERANDGROUP | &quot;OperandGroup&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
