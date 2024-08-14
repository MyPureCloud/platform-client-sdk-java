---
title: CreateWorkPlanBid
---
## CreateWorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the work plan bid |  |
| **forecast** | <!----><!---->[**BuShortTermForecastWeekReference**](BuShortTermForecastWeekReference.html)<!----> | The selected forecast in this work plan bid |  [optional] |
| **bidWindowStartDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The bid start date where agents start participate in work plan bidding in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The bid end date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The date when agents will be assigned to the new work plan in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **agentRankingType** | [**AgentRankingTypeEnum**](#AgentRankingTypeEnum)<!----> | The type of agent ranking selected for this bid |  |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#RankingTiebreakerTypeEnum)<!----> | Ranking tiebreaker to be used |  |
| **workPlanFieldsVisibleToAgents** | <!---->[**List&lt;WorkPlanFieldsVisibleToAgentsEnum&gt;**](#WorkPlanFieldsVisibleToAgentsEnum)<!----> | The work plan fields visible to agents whenever work plan preferences are made |  |
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


<a name="WorkPlanFieldsVisibleToAgentsEnum"></a>

## Enum: WorkPlanFieldsVisibleToAgentsEnum

| Name | Value |
| ---- | ----- |
| NAME | &quot;Name&quot; |
| PAIDHOURS | &quot;PaidHours&quot; |
{: class="table table-striped"}



