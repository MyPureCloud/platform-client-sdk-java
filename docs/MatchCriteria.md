# MatchCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **jsonPath** | **String** | The Goessner json path of the field to match |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The type of operation to perform for matching check |  [optional] |
| **value** | [**JsonNode**](JsonNode) | The value to match on. Only one of value and values can be included |  [optional] |
| **values** | [**List&lt;JsonNode&gt;**](JsonNode) | The list of values to match on. Only one of value and values can be included |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GREATERTHANOREQUAL | &quot;GreaterThanOrEqual&quot; | 
| LESSTHANOREQUAL | &quot;LessThanOrEqual&quot; | 
| EQUAL | &quot;Equal&quot; | 
| NOTEQUAL | &quot;NotEqual&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| NOTIN | &quot;NotIn&quot; | 
| IN | &quot;In&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| ALL | &quot;All&quot; | 
| EXISTS | &quot;Exists&quot; | 
| SIZE | &quot;Size&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
