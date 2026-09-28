# AgenticVirtualAgentStructuredOutputRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mapping** | **List&lt;Object&gt;** | Path into the tool output type this rule applies to. Each element is a field name (string) or an array index (integer). |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Operator to apply to the value at the mapped path. |  |
| **value** | **Object** | Value to compare against. May be a string, integer, number, boolean, or null. Not required for 'IsNull', 'IsNotNull', 'IsEmpty', or 'IsNotEmpty' operators. |  [optional] |


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
