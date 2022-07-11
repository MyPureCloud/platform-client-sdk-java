---
title: TimeOffRequestQueryBody
---
## TimeOffRequestQueryBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ids** | <!----><!---->**List&lt;String&gt;**<!----> | The set of ids to filter time off requests |  [optional] |
| **userIds** | <!----><!---->**List&lt;String&gt;**<!----> | The set of user ids to filter time off requests |  [optional] |
| **statuses** | <!---->[**List&lt;StatusesEnum&gt;**](#StatusesEnum)<!----> | The set of statuses to filter time off requests |  [optional] |
| **substatuses** | <!---->[**List&lt;SubstatusesEnum&gt;**](#SubstatusesEnum)<!----> | The set of substatuses to filter time off requests |  [optional] |
| **dateRange** | <!----><!---->[**DateRange**](DateRange.html)<!----> | The inclusive range of dates to filter time off requests |  [optional] |
{: class="table table-striped"}


<a name="StatusesEnum"></a>

## Enum: StatusesEnum

| Name | Value |
| ---- | ----- |
| PENDING | &quot;PENDING&quot; |
{: class="table table-striped"}


<a name="SubstatusesEnum"></a>

## Enum: SubstatusesEnum

| Name | Value |
| ---- | ----- |
| ADVANCETIMEELAPSED | &quot;AdvanceTimeElapsed&quot; |
| AUTOAPPROVED | &quot;AutoApproved&quot; |
| INSUFFICIENTBALANCE | &quot;InsufficientBalance&quot; |
| INVALIDDAILYDURATION | &quot;InvalidDailyDuration&quot; |
| OUTSIDESHIFT | &quot;OutsideShift&quot; |
| REMOVEDFROMWAITLIST | &quot;RemovedFromWaitlist&quot; |
| WAITLISTED | &quot;Waitlisted&quot; |
{: class="table table-striped"}



