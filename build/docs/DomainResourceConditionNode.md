# DomainResourceConditionNode


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **variableName** | **String** |  |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) |  |  [optional] |
| **operands** | [**List&lt;DomainResourceConditionValue&gt;**](DomainResourceConditionValue) |  |  [optional] |
| **conjunction** | [**ConjunctionEnum**](#Enum--ConjunctionEnum) |  |  [optional] |
| **terms** | [**List&lt;DomainResourceConditionNode&gt;**](DomainResourceConditionNode) |  |  [optional] |


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


## Enum: ConjunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
