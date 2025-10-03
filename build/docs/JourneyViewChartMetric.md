# JourneyViewChartMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique identifier of the metric within the chart |  |
| **elementId** | **String** | The element in the list of elements which the metric is measuring |  |
| **aggregate** | [**AggregateEnum**](#Enum--AggregateEnum) | How to aggregate the given element, defaults to CustomerCount |  [optional] |
| **displayLabel** | **String** | A display label for the metric |  [optional] |


## Enum: AggregateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTCOUNT | &quot;EventCount&quot; | 
| CUSTOMERCOUNT | &quot;CustomerCount&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
