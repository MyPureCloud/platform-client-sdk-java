---
title: AgentWorkPlanBid
---
## AgentWorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the work plan bid |  |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **bidWindowStartDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The date when agents can start participating in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The inclusive end date of a bid window. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The date when agents will be assigned to the new work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The state of the bid |  |
| **workPlanFieldsVisibleToAgents** | <!---->[**List&lt;WorkPlanFieldsVisibleToAgentsEnum&gt;**](#WorkPlanFieldsVisibleToAgentsEnum)<!----> | The work plan fields visible to agents whenever work plan preferences are made |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| LOCKED | &quot;Locked&quot; | 
| OPTIMIZED | &quot;Optimized&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| OPEN | &quot;Open&quot; | 
| CLOSED | &quot;Closed&quot; | 
| PROCESSED | &quot;Processed&quot; | 
| PUBLISHED | &quot;Published&quot; | 
{: class="table table-striped"}


<a name="WorkPlanFieldsVisibleToAgentsEnum"></a>

## Enum: WorkPlanFieldsVisibleToAgentsEnum

| Name | Value |
| ---- | ----- |
| NAME | &quot;Name&quot; |
| PAIDHOURS | &quot;PaidHours&quot; |
{: class="table table-striped"}



