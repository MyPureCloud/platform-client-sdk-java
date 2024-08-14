---
title: UpdateWorkPlanBid
---
## UpdateWorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the work plan bid |  [optional] |
| **forecast** | <!----><!---->[**BuShortTermForecastWeekReference**](BuShortTermForecastWeekReference.html)<!----> | The selected forecast in this work plan bid |  [optional] |
| **bidWindowStartDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The bid start date where agents start participate in work plan bidding in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **bidWindowEndDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The bid end date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **effectiveDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The date when agents will be assigned to the new work plan in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **agentRankingType** | [**AgentRankingTypeEnum**](#AgentRankingTypeEnum)<!----> | The type of agent ranking selected for this bid |  [optional] |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#RankingTiebreakerTypeEnum)<!----> | Ranking tiebreaker |  [optional] |
| **workPlanFieldsVisibleToAgents** | <!----><!---->[**ListWrapperAgentWorkPlanField**](ListWrapperAgentWorkPlanField.html)<!----> | The work plan fields visible to agents whenever work plan preferences are made |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The state of the bid |  [optional] |
{: class="table table-striped"}


<a name="AgentRankingTypeEnum"></a>

## Enum: AgentRankingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
{: class="table table-striped"}


<a name="RankingTiebreakerTypeEnum"></a>

## Enum: RankingTiebreakerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| RANDOMLYASSIGN | &quot;RandomlyAssign&quot; | 
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



