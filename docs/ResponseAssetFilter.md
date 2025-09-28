# ResponseAssetFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **endValue** | **String** | The end value of the range. This field is used for range search types. Accepts numbers and date in ISO8601 format |  [optional] |
| **values** | **List&lt;String&gt;** | A list of values for the search to match against |  [optional] |
| **startValue** | **String** | The start value of the range. This field is used for range search types. Accepts numbers and date in ISO8601 format |  [optional] |
| **fields** | **List&lt;String&gt;** | Field name to search against. Allowed Values: divisionId, name, contentLength, contentType, dateCreated |  [optional] |
| **value** | **String** | A value for the search to match against |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | How to apply this search criteria against other criteria. Filter type supported for each field:- name:[STARTS_WITH, TERM], divisionId:[TERM, TERMS], contentLength:[RANGE, GREATER_THAN_EQUAL_TO, LESS_THAN_EQUAL_TO], contentType:[STARTS_WITH, TERM] dateCreated:[DATE_RANGE] |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERM | &quot;TERM&quot; | 
| TERMS | &quot;TERMS&quot; | 
| STARTS_WITH | &quot;STARTS_WITH&quot; | 
| RANGE | &quot;RANGE&quot; | 
| GREATER_THAN_EQUAL_TO | &quot;GREATER_THAN_EQUAL_TO&quot; | 
| LESS_THAN_EQUAL_TO | &quot;LESS_THAN_EQUAL_TO&quot; | 
| DATE_RANGE | &quot;DATE_RANGE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
