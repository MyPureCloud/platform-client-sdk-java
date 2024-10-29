# RequestCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | **String** | The criteria key. |  |
| **values** | **List&lt;String&gt;** | The criteria values. |  |
| **shouldIgnoreCase** | **Boolean** | Should criteria be case insensitive. |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The comparison operator. |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONTAINSALL | &quot;containsAll&quot; | 
| CONTAINSANY | &quot;containsAny&quot; | 
| NOTCONTAINSALL | &quot;notContainsAll&quot; | 
| NOTCONTAINSANY | &quot;notContainsAny&quot; | 
| EQUAL | &quot;equal&quot; | 
| NOTEQUAL | &quot;notEqual&quot; | 
| GREATERTHAN | &quot;greaterThan&quot; | 
| GREATERTHANOREQUAL | &quot;greaterThanOrEqual&quot; | 
| LESSTHAN | &quot;lessThan&quot; | 
| LESSTHANOREQUAL | &quot;lessThanOrEqual&quot; | 
| STARTSWITH | &quot;startsWith&quot; | 
| ENDSWITH | &quot;endsWith&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
