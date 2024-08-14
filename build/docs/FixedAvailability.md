---
title: FixedAvailability
---
## FixedAvailability


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **availabilityRange** | <!----><!---->[**AvailabilityRange**](AvailabilityRange.html)<!----> | The range of time of day the activity can be scheduled |  [optional] |
| **dateRange** | <!----><!---->[**RequiredLocalDateRange**](RequiredLocalDateRange.html)<!----> | The range of date for which the activity plan could be scheduled |  [optional] |
| **daysOfWeek** | <!---->[**List&lt;DaysOfWeekEnum&gt;**](#DaysOfWeekEnum)<!----> | The days of week available for scheduling. Empty list or null means daysOfWeek is not considered |  [optional] |
{: class="table table-striped"}


<a name="DaysOfWeekEnum"></a>

## Enum: DaysOfWeekEnum

| Name | Value |
| ---- | ----- |
| SUNDAY | &quot;Sunday&quot; |
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |
{: class="table table-striped"}



