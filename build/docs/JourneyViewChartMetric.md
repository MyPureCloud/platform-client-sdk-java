# JourneyViewChartMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The unique identifier of the metric within the chart |  |
| **elementId** | **String** | The element in the list of elements which the metric is measuring |  |
| **aggregate** | [**AggregateEnum**](#Enum--AggregateEnum) | How to aggregate the given element, defaults to EventCount |  [optional] |
| **displayLabel** | **String** | A display label for the metric |  [optional] |
{: class="table table-striped"}


## Enum: AggregateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVENTCOUNT | &quot;EventCount&quot; | 
| CUSTOMERCOUNT | &quot;CustomerCount&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
