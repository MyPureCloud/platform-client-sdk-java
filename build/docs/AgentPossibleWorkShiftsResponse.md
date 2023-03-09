---
title: AgentPossibleWorkShiftsResponse
---
## AgentPossibleWorkShiftsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **weekStartDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Start date of requested effective work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **pattern** | <!----><!---->**List&lt;Integer&gt;**<!----> | Each element is the ID of an effective work plan for a specific week |  [optional] |
| **weeklyPossibleWorkShifts** | <!----><!---->[**List&lt;PossibleWorkShiftsForWeek&gt;**](PossibleWorkShiftsForWeek.html)<!----> | Each element is a weekly effective work plan that can be used for multiple weeks |  [optional] |
| **schedulerIntervalLengthMinutes** | <!----><!---->**Integer**<!----> | Number of minutes in each interval in the intervalScheduleProbabilities |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | The time zone of the business unit |  [optional] |
{: class="table table-striped"}



