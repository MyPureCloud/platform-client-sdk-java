# ConditionalGroupActivationCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **simpleMetric** | [**ConditionalGroupActivationSimpleMetric**](ConditionalGroupActivationSimpleMetric) | Instructs this condition to evaluate a simple queue-level metric |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator used to compare the actual value against the threshold value |  [optional] |
| **value** | **Double** | The threshold value, beyond which a rule evaluates as true |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUALTO | &quot;GreaterThanOrEqualTo&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANOREQUALTO | &quot;LessThanOrEqualTo&quot; | 
| EQUALTO | &quot;EqualTo&quot; | 
| NOTEQUALTO | &quot;NotEqualTo&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
