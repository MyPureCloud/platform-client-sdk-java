# WorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the work plan bid |  |
| **name** | **String** | The name of the work plan bid |  |
| **forecast** | [**BuShortTermForecastWeekReference**](BuShortTermForecastWeekReference) | The selected forecast in this work plan bid |  [optional] |
| **bidWindowStartDate** | [**LocalDate**](LocalDate) | The bid start date where agents start participate in work plan bidding. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | [**LocalDate**](LocalDate) | The bid end date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | [**LocalDate**](LocalDate) | The date when agents will be assigned to the new work plan. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The state of the bid |  |
| **agentRankingType** | [**AgentRankingTypeEnum**](#Enum--AgentRankingTypeEnum) | The type of agent ranking selected for this bid |  |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#Enum--RankingTiebreakerTypeEnum) | Ranking tiebreaker |  |
| **publishedDate** | [**Date**](Date) | The date the work plan bid published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **workPlanFieldsVisibleToAgents** | [**List<WorkPlanFieldsVisibleToAgentsEnum>**](#Enum--WorkPlanFieldsVisibleToAgentsEnum) | The work plan fields visible to agents whenever work plan preferences are made |  |
| **metadata** | [**WorkPlanBidMetadata**](WorkPlanBidMetadata) | The meta data of this bid |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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


## Enum: AgentRankingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 


## Enum: RankingTiebreakerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| RANDOMLYASSIGN | &quot;RandomlyAssign&quot; | 


## Enum: WorkPlanFieldsVisibleToAgentsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NAME | &quot;Name&quot; |
| PAIDHOURS | &quot;PaidHours&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
