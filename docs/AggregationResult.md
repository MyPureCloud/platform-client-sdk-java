# AggregationResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **dimension** | **String** | For termFrequency aggregations |  [optional] |
| **metric** | **String** | For numericRange aggregations |  [optional] |
| **count** | **Long** |  |  [optional] |
| **results** | [**List&lt;AggregationResultEntry&gt;**](AggregationResultEntry) |  |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERMFREQUENCY | &quot;termFrequency&quot; | 
| NUMERICRANGE | &quot;numericRange&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
