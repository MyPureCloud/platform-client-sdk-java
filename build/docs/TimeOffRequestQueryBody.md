---
title: TimeOffRequestQueryBody
---
## TimeOffRequestQueryBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userIds** | <!----><!---->**List&lt;String&gt;**<!----> | The set of user ids to filter time off requests |  [optional] |
| **statuses** | <!---->[**List&lt;StatusesEnum&gt;**](#StatusesEnum)<!----> | The set of statuses to filter time off requests |  [optional] |
| **dateRange** | <!----><!---->[**DateRange**](DateRange.html)<!----> | The inclusive range of dates to filter time off requests |  [optional] |
{: class="table table-striped"}


<a name="StatusesEnum"></a>

## Enum: StatusesEnum

| Name | Value |
| ---- | ----- |
| PENDING | &quot;PENDING&quot; |
{: class="table table-striped"}



