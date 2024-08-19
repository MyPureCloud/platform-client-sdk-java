# JourneyViewChart


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **version** | **Integer** | The version of the journey view chart |  [optional] |
| **groupByTime** | [**GroupByTimeEnum**](#Enum--GroupByTimeEnum) | A time unit to group the metrics by. There is a limit on the number of groupBy properties which can be specified. |  [optional] |
| **groupByAttributes** | [**List&lt;JourneyViewChartGroupByAttribute&gt;**](JourneyViewChartGroupByAttribute) | A list of attributes to group the metrics by. There is a limit on the number of groupBy properties which can be specified. |  [optional] |
| **metrics** | [**List&lt;JourneyViewChartMetric&gt;**](JourneyViewChartMetric) | A list of metrics to calculate within the chart by (aka the y axis) |  |
| **displayAttributes** | [**JourneyViewChartDisplayAttributes**](JourneyViewChartDisplayAttributes) | Optional display attributes for rendering the chart |  [optional] |
| **groupByMax** | **Integer** | A maximum on the number of values being grouped by |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: GroupByTimeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAY | &quot;Day&quot; | 
| WEEK | &quot;Week&quot; | 
| MONTH | &quot;Month&quot; | 
| YEAR | &quot;Year&quot; | 
{: class="table table-striped"}



