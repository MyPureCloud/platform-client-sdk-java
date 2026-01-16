# RowSearchPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columnId** | **String** | The decision table column identifier this predicate applies to |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The search operator for this predicate |  |
| **value** | **String** | The value that will be searched for in rows. Exactly one of 'value' or 'special' can be used. |  [optional] |
| **special** | [**SpecialEnum**](#Enum--SpecialEnum) | The special value that will be searched for in rows. Exactly one of 'value' or 'special' can be used. |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;Equals&quot; | 
| STARTSWITH | &quot;StartsWith&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUALS | &quot;GreaterThanOrEquals&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANOREQUALS | &quot;LessThanOrEquals&quot; | 
| CONTAINSITEM | &quot;ContainsItem&quot; | 


## Enum: SpecialEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WILDCARD | &quot;Wildcard&quot; | 
| NULL | &quot;Null&quot; | 
| EMPTY | &quot;Empty&quot; | 
| CURRENTTIME | &quot;CurrentTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
