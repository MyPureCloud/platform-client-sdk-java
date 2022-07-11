---
title: AvailableTimeOffRequest
---
## AvailableTimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCodeId** | <!----><!---->**String**<!----> | The ID for activity code to query available time off minutes |  |
| **dateRanges** | <!----><!---->[**List&lt;LocalDateRange&gt;**](LocalDateRange.html)<!----> | A list of date ranges of available time off minutes. A maximum number of date ranges is 30. The maximum total number of days in all ranges is 366. If no ranges are specified, then only the presence of the associated time off limit object will be checked. In such case, if the association exists, then the response will contain a list with of a single element filled with timeOffLimitId only. |  [optional] |
{: class="table table-striped"}



