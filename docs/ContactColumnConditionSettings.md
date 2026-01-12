# ContactColumnConditionSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columnName** | **String** | The name of the contact list column to evaluate. |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator to use when comparing values. |  |
| **value** | **String** | The value to compare against the contact's data. |  |
| **valueType** | [**ValueTypeEnum**](#Enum--ValueTypeEnum) | The data type the value should be treated as. |  |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;Equals&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANEQUALS | &quot;LessThanEquals&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANEQUALS | &quot;GreaterThanEquals&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| BEGINSWITH | &quot;BeginsWith&quot; | 
| ENDSWITH | &quot;EndsWith&quot; | 
| BEFORE | &quot;Before&quot; | 
| AFTER | &quot;After&quot; | 


## Enum: ValueTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATETIME | &quot;DateTime&quot; | 
| NUMERIC | &quot;Numeric&quot; | 
| PERIOD | &quot;Period&quot; | 
| STRING | &quot;String&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
