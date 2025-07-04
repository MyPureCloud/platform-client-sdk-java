# ContactListFilterPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **column** | **String** | Contact list column from the ContactListFilter's contactList. |  [optional] |
| **columnType** | [**ColumnTypeEnum**](#Enum--ColumnTypeEnum) | The type of data in the contact column. |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator for this ContactListFilterPredicate. |  [optional] |
| **value** | **String** | Value with which to compare the contact's data. This could be text, a number, or a relative time. A value for relative time should follow the format PxxDTyyHzzM, where xx, yy, and zz specify the days, hours and minutes. For example, a value of P01DT08H30M corresponds to 1 day, 8 hours, and 30 minutes from now. To specify a time in the past, include a negative sign before each numeric value. For example, a value of P-01DT-08H-30M corresponds to 1 day, 8 hours, and 30 minutes in the past. You can also do things like P01DT00H-30M, which would correspond to 23 hours and 30 minutes from now (1 day - 30 minutes). |  [optional] |
| **range** | [**ContactListFilterRange**](ContactListFilterRange) | A range of values. Required for operators BETWEEN and IN. |  [optional] |
| **inverted** | **Boolean** | Inverts the result of the predicate (i.e., if the predicate returns true, inverting it will return false). |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
