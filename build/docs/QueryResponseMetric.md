---
title: QueryResponseMetric
---
## QueryResponseMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | The metric this applies to |  [optional] |
| **stats** | <!----><!---->[**QueryResponseStats**](QueryResponseStats.html)<!----> | The aggregated values for this metric |  [optional] |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NACTIVITIES | &quot;nActivities&quot; | 
| NPLANNEDACTIVITIES | &quot;nPlannedActivities&quot; | 
| NINPROGRESSACTIVITIES | &quot;nInProgressActivities&quot; | 
| NCOMPLETEACTIVITIES | &quot;nCompleteActivities&quot; | 
| NOVERDUEACTIVITIES | &quot;nOverdueActivities&quot; | 
| NINVALIDSCHEDULEACTIVITIES | &quot;nInvalidScheduleActivities&quot; | 
{: class="table table-striped"}



