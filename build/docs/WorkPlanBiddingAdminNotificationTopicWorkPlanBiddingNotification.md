---
title: WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification
---
## WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **buId** | <!----><!---->**String**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **bidWindowStartDate** | <!----><!---->**String**<!----> |  |  [optional] |
| **bidWindowEndDate** | <!----><!---->**String**<!----> |  |  [optional] |
| **effectiveDate** | <!----><!---->**String**<!----> |  |  [optional] |
| **agentRankingType** | [**AgentRankingTypeEnum**](#AgentRankingTypeEnum)<!----> |  |  [optional] |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#RankingTiebreakerTypeEnum)<!----> |  |  [optional] |
| **workPlanFieldsVisibleToAgents** | <!---->[**List&lt;WorkPlanFieldsVisibleToAgentsEnum&gt;**](#WorkPlanFieldsVisibleToAgentsEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| DRAFT | &quot;Draft&quot; | 
| LOCKED | &quot;Locked&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| OPTIMIZED | &quot;Optimized&quot; | 
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
| UNKNOWN | &quot;Unknown&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
{: class="table table-striped"}


<a name="RankingTiebreakerTypeEnum"></a>

## Enum: RankingTiebreakerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| RANDOMLYASSIGN | &quot;RandomlyAssign&quot; | 
{: class="table table-striped"}


<a name="WorkPlanFieldsVisibleToAgentsEnum"></a>

## Enum: WorkPlanFieldsVisibleToAgentsEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;Unknown&quot; |
| NAME | &quot;Name&quot; |
| PAIDHOURS | &quot;PaidHours&quot; |
{: class="table table-striped"}



