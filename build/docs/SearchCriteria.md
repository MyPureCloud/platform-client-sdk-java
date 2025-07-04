# SearchCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **endValue** | **String** | The end value of the range. This field is used for range search types. |  [optional] |
| **values** | **List&lt;String&gt;** | A list of values for the search to match against |  [optional] |
| **startValue** | **String** | The start value of the range. This field is used for range search types. |  [optional] |
| **value** | **String** | A value for the search to match against |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | How to apply this search criteria against other criteria |  [optional] |
| **group** | [**List&lt;SearchCriteria&gt;**](SearchCriteria) | Groups multiple conditions |  [optional] |
| **dateFormat** | **String** | Set date format for criteria values when using date range search type.  Supports Java date format syntax, example yyyy-MM-dd'T'HH:mm:ss.SSSX. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **fields** | **List&lt;String&gt;** | Field names to search against |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 
| NOT | &quot;NOT&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXACT | &quot;EXACT&quot; | 
| CONTAINS | &quot;CONTAINS&quot; | 
| STARTS_WITH | &quot;STARTS_WITH&quot; | 
| REQUIRED_FIELDS | &quot;REQUIRED_FIELDS&quot; | 
| RANGE | &quot;RANGE&quot; | 
| DATE_RANGE | &quot;DATE_RANGE&quot; | 
| LESS_THAN | &quot;LESS_THAN&quot; | 
| LESS_THAN_EQUAL_TO | &quot;LESS_THAN_EQUAL_TO&quot; | 
| GREATER_THAN | &quot;GREATER_THAN&quot; | 
| GREATER_THAN_EQUAL_TO | &quot;GREATER_THAN_EQUAL_TO&quot; | 
| SIMPLE | &quot;SIMPLE&quot; | 
| TERM | &quot;TERM&quot; | 
| TERMS | &quot;TERMS&quot; | 
| QUERY_STRING | &quot;QUERY_STRING&quot; | 
| MATCH_ALL | &quot;MATCH_ALL&quot; | 
| REGEX | &quot;REGEX&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
