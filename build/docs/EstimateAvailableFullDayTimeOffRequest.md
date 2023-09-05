---
title: EstimateAvailableFullDayTimeOffRequest
---
## EstimateAvailableFullDayTimeOffRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Date in yyyy-MM-dd format for full day request. Should be interpreted in the business unit's configured time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **requestedDurationMinutes** | <!----><!---->**Integer**<!----> | A requested length of time off request in minutes. If the value is null, then the system will use activity code length setting |  [optional] |
{: class="table table-striped"}



