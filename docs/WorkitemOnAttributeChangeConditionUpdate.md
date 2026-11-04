# WorkitemOnAttributeChangeConditionUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **attribute** | [**AttributeEnum**](#Enum--AttributeEnum) | The name of the workitem attribute whose change will be evaluated as part of the rule. |  |
| **newValue** | **String** | The value the attribute's new value is compared against. Compared for equality unless an operator is supplied. Null matches the attribute having been cleared, on clearable attributes. |  [optional] |
| **oldValue** | **String** | The value the attribute is transitioning from. Not permitted for the priority attribute. Omitted or null matches any previous value. |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | How the attribute's new value is compared against newValue. Only supported for the priority attribute. |  [optional] |


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


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;EQ&quot; | 
| GT | &quot;GT&quot; | 
| LT | &quot;LT&quot; | 
| GTE | &quot;GTE&quot; | 
| LTE | &quot;LTE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
