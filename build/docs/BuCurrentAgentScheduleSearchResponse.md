---
title: BuCurrentAgentScheduleSearchResponse
---
## BuCurrentAgentScheduleSearchResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **agentSchedules** | <!----><!---->[**List&lt;BuAgentScheduleSearchResponse&gt;**](BuAgentScheduleSearchResponse.html)<!----> | The requested agent schedules |  [optional] |
| **businessUnitTimeZone** | <!----><!---->**String**<!----> | The time zone configured for the business unit to which this schedule applies |  [optional] |
| **publishedSchedules** | <!----><!---->[**List&lt;BuAgentSchedulePublishedScheduleReference&gt;**](BuAgentSchedulePublishedScheduleReference.html)<!----> | References to all published week schedules overlapping the start/end date query parameters |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start date of the schedules. Only populated on notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | The end date of the schedules. Only populated on notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **updates** | <!----><!---->[**List&lt;BuAgentScheduleUpdate&gt;**](BuAgentScheduleUpdate.html)<!----> | The list of updates for the schedule. Only used in notifications |  [optional] |
{: class="table table-striped"}



