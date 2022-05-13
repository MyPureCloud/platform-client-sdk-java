---
title: WorkdayPointsTrend
---
## WorkdayPointsTrend


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStartWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The start workday for the query range for the gamification points trend. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The end workday for the query range for the gamification points trend. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The targeted user for the query |  [optional] |
| **dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum)<!----> | Aggregated for same day comparison |  [optional] |
| **averagePoints** | <!----><!---->**Double**<!----> | The total average points |  [optional] |
| **trend** | <!----><!---->[**List&lt;WorkdayPointsTrendItem&gt;**](WorkdayPointsTrendItem.html)<!----> | Daily points trends |  [optional] |
{: class="table table-striped"}


<a name="DayOfWeekEnum"></a>

## Enum: DayOfWeekEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUNDAY | &quot;Sunday&quot; | 
| MONDAY | &quot;Monday&quot; | 
| TUESDAY | &quot;Tuesday&quot; | 
| WEDNESDAY | &quot;Wednesday&quot; | 
| THURSDAY | &quot;Thursday&quot; | 
| FRIDAY | &quot;Friday&quot; | 
| SATURDAY | &quot;Saturday&quot; | 
{: class="table table-striped"}



