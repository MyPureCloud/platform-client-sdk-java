---
title: WorkPlanBid
---
## WorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the work plan bid |  |
| **name** | <!----><!---->**String**<!----> | The name of the work plan bid |  |
| **forecast** | <!----><!---->[**BuShortTermForecastWeekReference**](BuShortTermForecastWeekReference.html)<!----> | The selected forecast in this work plan bid |  [optional] |
| **bidWindowStartDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The bid start date where agents start participate in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The bid end date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The date when agents will be assigned to the new work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The state of the bid |  |
| **agentRankingType** | [**AgentRankingTypeEnum**](#AgentRankingTypeEnum)<!----> | The type of agent ranking selected for this bid |  |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#RankingTiebreakerTypeEnum)<!----> | Ranking tiebreaker |  |
| **publishedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the work plan bid published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **workPlanFieldsVisibleToAgents** | <!---->[**List&lt;WorkPlanFieldsVisibleToAgentsEnum&gt;**](#WorkPlanFieldsVisibleToAgentsEnum)<!----> | The work plan fields visible to agents whenever work plan preferences are made |  |
| **metadata** | <!----><!---->[**WorkPlanBidMetadata**](WorkPlanBidMetadata.html)<!----> | The meta data of this bid |  [optional] |
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



