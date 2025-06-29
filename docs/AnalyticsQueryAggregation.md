# AnalyticsQueryAggregation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | **String** | For use with termFrequency aggregations |  [optional] |
| **metric** | **String** | For use with numericRange aggregations |  [optional] |
| **size** | **Integer** | For use with termFrequency aggregations |  [optional] |
| **ranges** | [**List&lt;AggregationRange&gt;**](AggregationRange) | For use with numericRange aggregations |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERMFREQUENCY | &quot;termFrequency&quot; | 
| NUMERICRANGE | &quot;numericRange&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
