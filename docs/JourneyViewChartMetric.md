# JourneyViewChartMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique identifier of the metric within the chart |  |
| **elementId** | **String** | The element in the list of elements which the metric is measuring |  |
| **aggregate** | [**AggregateEnum**](#Enum--AggregateEnum) | How to aggregate the given element, defaults to CustomerCount |  [optional] |
| **displayLabel** | **String** | A display label for the metric |  [optional] |
| **attribute** | **String** | Attribute name |  [optional] |


## Enum: AggregateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTCOUNT | &quot;EventCount&quot; | 
| CUSTOMERCOUNT | &quot;CustomerCount&quot; | 
| MINIMUM | &quot;Minimum&quot; | 
| MAXIMUM | &quot;Maximum&quot; | 
| AVERAGE | &quot;Average&quot; | 
| SUM | &quot;Sum&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
