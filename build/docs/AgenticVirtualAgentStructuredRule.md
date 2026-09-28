# AgenticVirtualAgentStructuredRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Target name of the tool input this rule applies to. |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Operator to apply to the input value. |  |
| **value** | **Object** | Value to compare against. May be a string, integer, number, boolean, or null. Not required for 'IsNull' or 'IsNotNull' operators. |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ISNULL | &quot;IsNull&quot; | 
| ISNOTNULL | &quot;IsNotNull&quot; | 
| ISEMPTY | &quot;IsEmpty&quot; | 
| ISNOTEMPTY | &quot;IsNotEmpty&quot; | 
| EQUAL | &quot;Equal&quot; | 
| NOTEQUAL | &quot;NotEqual&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANOREQUAL | &quot;LessThanOrEqual&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUAL | &quot;GreaterThanOrEqual&quot; | 
| IN | &quot;In&quot; | 
| NOTIN | &quot;NotIn&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| DOESNTCONTAIN | &quot;DoesntContain&quot; | 
| BEGINSWITH | &quot;BeginsWith&quot; | 
| ENDSWITH | &quot;EndsWith&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:264.1.0_
