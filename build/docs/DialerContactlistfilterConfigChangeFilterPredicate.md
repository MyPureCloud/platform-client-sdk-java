# DialerContactlistfilterConfigChangeFilterPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **column** | **String** | The contact list column |  [optional] |
| **columnType** | [**ColumnTypeEnum**](#Enum--ColumnTypeEnum) | Whether a contact column is numeric or alphabetic |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The comparison operator |  [optional] |
| **value** | **String** | The value the predicate applies to |  [optional] |
| **range** | [**DialerContactlistfilterConfigChangeFilterRange**](DialerContactlistfilterConfigChangeFilterRange) |  |  [optional] |
| **inverted** | **Boolean** | Whether or not to invert to result of evaluating the predicate |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **getAdditionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: ColumnTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NUMERIC | &quot;numeric&quot; | 
| ALPHABETIC | &quot;alphabetic&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;EQUALS&quot; | 
| LESS_THAN | &quot;LESS_THAN&quot; | 
| LESS_THAN_EQUALS | &quot;LESS_THAN_EQUALS&quot; | 
| GREATER_THAN | &quot;GREATER_THAN&quot; | 
| GREATER_THAN_EQUALS | &quot;GREATER_THAN_EQUALS&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| BEGINS_WITH | &quot;BEGINS_WITH&quot; | 
| ENDS_WITH | &quot;ENDS_WITH&quot; | 
| BEFORE | &quot;BEFORE&quot; | 
| AFTER | &quot;AFTER&quot; | 
| BETWEEN | &quot;BETWEEN&quot; | 
| IN | &quot;IN&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
