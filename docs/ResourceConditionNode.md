# ResourceConditionNode


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **variableName** | **String** |  |  [optional] |
| **conjunction** | [**ConjunctionEnum**](#Enum--ConjunctionEnum) |  |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) |  |  [optional] |
| **operands** | [**List&lt;ResourceConditionValue&gt;**](ResourceConditionValue) |  |  [optional] |
| **terms** | [**List&lt;ResourceConditionNode&gt;**](ResourceConditionNode) |  |  [optional] |


## Enum: ConjunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;EQ&quot; | 
| IN | &quot;IN&quot; | 
| GE | &quot;GE&quot; | 
| GT | &quot;GT&quot; | 
| LE | &quot;LE&quot; | 
| LT | &quot;LT&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
