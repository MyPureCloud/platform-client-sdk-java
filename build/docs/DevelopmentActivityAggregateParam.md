---
title: DevelopmentActivityAggregateParam
---
## DevelopmentActivityAggregateParam


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Specifies the range of due dates to be used for filtering. Milliseconds will be truncated. A maximum of 1 year can be specified in the range. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | The list of metrics to be returned. If omitted, all metrics are returned. |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | Specifies if the aggregated data is combined into a single set of metrics (groupBy is empty or not specified), or contains an element per attendeeId (groupBy is \"attendeeId\") |  [optional] |
| **filter** | <!----><!---->[**DevelopmentActivityAggregateQueryRequestFilter**](DevelopmentActivityAggregateQueryRequestFilter.html)<!----> | The filter applied to the data. This is ANDed with the interval parameter. |  |
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| NACTIVITIES | &quot;nActivities&quot; |
| NPLANNEDACTIVITIES | &quot;nPlannedActivities&quot; |
| NINPROGRESSACTIVITIES | &quot;nInProgressActivities&quot; |
| NCOMPLETEACTIVITIES | &quot;nCompleteActivities&quot; |
| NOVERDUEACTIVITIES | &quot;nOverdueActivities&quot; |
| NINVALIDSCHEDULEACTIVITIES | &quot;nInvalidScheduleActivities&quot; |
| NPASSEDACTIVITIES | &quot;nPassedActivities&quot; |
| NFAILEDACTIVITIES | &quot;nFailedActivities&quot; |
| OACTIVITYSCORE | &quot;oActivityScore&quot; |
| NNOTCOMPLETEDACTIVITIES | &quot;nNotCompletedActivities&quot; |
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| ATTENDEEID | &quot;attendeeId&quot; |
{: class="table table-striped"}



