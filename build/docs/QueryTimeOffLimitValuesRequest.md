---
title: QueryTimeOffLimitValuesRequest
---
## QueryTimeOffLimitValuesRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffLimitId** | <!----><!---->**String**<!----> | The time off limit object id to retrieve values for. Required if activityCodeId is not specified |  [optional] |
| **activityCodeId** | <!----><!---->**String**<!----> | The activity code id to filter the affected limit objects by. Required if timeOffLimitId is not specified |  [optional] |
| **dateRanges** | <!----><!---->[**List&lt;LocalDateRange&gt;**](LocalDateRange.html)<!----> | The list of the date ranges to return time off limit, allocated and waitlisted minutes. The valid number of date ranges is between 1 and 30. Maximum total number of days in all ranges in 366. |  |
{: class="table table-striped"}



