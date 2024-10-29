# AggregationResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **dimension** | **String** | For termFrequency aggregations |  [optional] |
| **metric** | **String** | For numericRange aggregations |  [optional] |
| **count** | **Long** |  |  [optional] |
| **results** | [**List&lt;AggregationResultEntry&gt;**](AggregationResultEntry) |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERMFREQUENCY | &quot;termFrequency&quot; | 
| NUMERICRANGE | &quot;numericRange&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
