---
title: Operand
---
## Operand


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The Operand type of the category |  |
| **occurrence** | <!----><!---->**Integer**<!----> | The minimum number of occurrences of the defined operand type |  [optional] |
| **inverted** | <!----><!---->**Boolean**<!----> | Applies a NOT modifier to the operand group |  [optional] |
| **term** | <!----><!---->[**Term**](Term.html)<!----> | Filter interaction by word(s) |  [optional] |
| **topicId** | <!----><!---->**String**<!----> | Filter interaction by topic ID |  [optional] |
| **voiceSecondsPosition** | <!----><!---->[**OperandPosition**](OperandPosition.html)<!----> | Dictates when the operand must occur in a voice interaction |  [optional] |
| **digitalWordsPosition** | <!----><!---->[**OperandPosition**](OperandPosition.html)<!----> | Dictates when the operand must occur in a digital interaction |  [optional] |
| **infixOperator** | <!----><!---->[**InfixOperator**](InfixOperator.html)<!----> | Defines a logical operation that is applied on the current operand, against the following operand |  [optional] |
| **operands** | <!----><!---->[**List&lt;Operand&gt;**](Operand.html)<!----> | Contains a new level of operands |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERM | &quot;Term&quot; | 
| TOPIC | &quot;Topic&quot; | 
| OPERANDGROUP | &quot;OperandGroup&quot; | 
{: class="table table-striped"}



