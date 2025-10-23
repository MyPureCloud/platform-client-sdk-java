# TimeAndDateSubCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of time/date sub-condition. |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator to use for comparison. |  [optional] |
| **inverted** | **Boolean** | If true, inverts the result of evaluating this sub-condition. Default is false. |  [optional] |
| **includeYear** | **Boolean** | If true, includes year in date comparison for specificDate type. When false, only month and day are compared. Default is true. Only applicable for specificDate type. |  [optional] |
| **thresholdValue** | **String** | Threshold value for BEFORE or AFTER operators. Format depends on type: timeOfDay: HH:mm, dayOfWeek: 1-7 (Monday-Sunday), dayOfMonth: 1-31 and/ or LAST_DAY, ODD_DAY, EVEN_DAY, specificDate: yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false). For single-value comparison, use a list with one element. |  [optional] |
| **range** | [**TimeAndDateSubConditionRange**](TimeAndDateSubConditionRange) | A range of values for BETWEEN and IN operators. Format follows the same rules as 'thresholdValue'. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TIMEOFDAY | &quot;timeOfDay&quot; | 
| DAYOFWEEK | &quot;dayOfWeek&quot; | 
| DAYOFMONTH | &quot;dayOfMonth&quot; | 
| SPECIFICDATE | &quot;specificDate&quot; | 


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
| IN | &quot;IN&quot; | 
| BETWEEN | &quot;BETWEEN&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
