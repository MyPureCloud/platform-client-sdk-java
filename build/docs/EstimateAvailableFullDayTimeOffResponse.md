---
title: EstimateAvailableFullDayTimeOffResponse
---
## EstimateAvailableFullDayTimeOffResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Date in yyyy-MM-dd format for full day request. Should be interpreted in the business unit's configured time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **durationMinutes** | <!----><!---->**Integer**<!----> | An estimation of time off request length in minutes |  |
| **payableMinutes** | <!----><!---->**Integer**<!----> | An estimation of payable part of time off request in minutes |  |
| **flexible** | <!----><!---->**Boolean**<!----> | Whether there is flexibility for a user to choose different hours than the system estimated |  |
{: class="table table-striped"}



