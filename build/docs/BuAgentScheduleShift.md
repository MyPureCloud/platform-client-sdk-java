---
title: BuAgentScheduleShift
---
## BuAgentScheduleShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start date of this shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **lengthMinutes** | <!----><!---->**Integer**<!----> | The length of this shift in minutes |  [optional] |
| **activities** | <!----><!---->[**List&lt;BuAgentScheduleActivity&gt;**](BuAgentScheduleActivity.html)<!----> | The activities associated with this shift |  [optional] |
| **manuallyEdited** | <!----><!---->**Boolean**<!----> | Whether this shift was manually edited. This is only set by clients and is used for rescheduling |  [optional] |
| **schedule** | <!----><!---->[**BuScheduleReference**](BuScheduleReference.html)<!----> | The schedule to which this shift belongs |  [optional] |
{: class="table table-striped"}



