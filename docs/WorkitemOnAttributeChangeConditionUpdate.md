# WorkitemOnAttributeChangeConditionUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **attribute** | [**AttributeEnum**](#Enum--AttributeEnum) | The name of the workitem attribute whose change will be evaluated as part of the rule. |  |
| **newValue** | **String** | The new value of the attribute. If the attribute is updated to this value this part of the condition will be met. Required for exact-match conditions (when operator is not set). |  [optional] |
| **oldValue** | **String** | The old value of the attribute. If the attribute was updated from this value this part of the condition will be met. |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The comparison operator used to evaluate the priority attribute against the value. |  [optional] |
| **value** | **Integer** | The numeric value compared against the priority attribute using the operator. Required when operator is set. Only supported for the priority attribute. |  [optional] |


## Enum: AttributeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STATUSID | &quot;statusId&quot; | 
| PRIORITY | &quot;priority&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| ASSIGNEEID | &quot;assigneeId&quot; | 
| ASSIGNMENTSTATE | &quot;assignmentState&quot; | 
| LANGUAGEID | &quot;languageId&quot; | 
| EXTERNALTAG | &quot;externalTag&quot; | 
| WRAPUP | &quot;wrapup&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;EQ&quot; | 
| GT | &quot;GT&quot; | 
| LT | &quot;LT&quot; | 
| GTE | &quot;GTE&quot; | 
| LTE | &quot;LTE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
