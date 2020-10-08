---
title: CoachingAppointmentAggregateRequest
---
## CoachingAppointmentAggregateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Interval to aggregate across. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | A list of metrics to aggregate.  If omitted, all metrics are returned. |  [optional] |
| **groupBy** | <!---->[**List&lt;GroupByEnum&gt;**](#GroupByEnum)<!----> | An optional list of items by which to group the result data. |  [optional] |
| **filter** | <!----><!---->[**QueryRequestFilter**](QueryRequestFilter.html)<!----> | The filter applied to the data |  |
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
{: class="table table-striped"}


<a name="GroupByEnum"></a>

## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| ATTENDEEID | &quot;attendeeId&quot; |
{: class="table table-striped"}



