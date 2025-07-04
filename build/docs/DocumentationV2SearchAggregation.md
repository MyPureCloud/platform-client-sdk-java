# DocumentationV2SearchAggregation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **field** | **String** | The field used for aggregation |  [optional] |
| **name** | **String** | The name of the aggregation. The response aggregation uses this name. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of aggregation to perform |  [optional] |
| **value** | **String** | A value to use for aggregation |  [optional] |
| **size** | **Integer** | The number aggregations results to return out of the entire result set |  [optional] |
| **order** | [**List<OrderEnum>**](#Enum--OrderEnum) | The order in which aggregation results are sorted |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERM | &quot;TERM&quot; | 
| COUNT | &quot;COUNT&quot; | 


## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VALUE_DESC | &quot;VALUE_DESC&quot; |
| VALUE_ASC | &quot;VALUE_ASC&quot; |
| COUNT_DESC | &quot;COUNT_DESC&quot; |
| COUNT_ASC | &quot;COUNT_ASC&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
