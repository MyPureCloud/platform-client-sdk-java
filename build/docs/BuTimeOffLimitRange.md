---
title: BuTimeOffLimitRange
---
## BuTimeOffLimitRange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Start date of the range. The end date is determined by the size of 'limitMinutesPerDay'. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **limitMinutesPerDay** | <!----><!---->**List&lt;Integer&gt;**<!----> | The list of time-off limit values in minutes per day. If 'null' is specified, then the day-specific value is cleared. Such a day will have a value of 0 |  |
{: class="table table-striped"}



