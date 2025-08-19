# UpdateWorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the work plan bid |  [optional] |
| **forecast** | [**BuShortTermForecastWeekReference**](BuShortTermForecastWeekReference) | The selected forecast in this work plan bid |  [optional] |
| **bidWindowStartDate** | [**LocalDate**](LocalDate) | The bid start date where agents start participate in work plan bidding in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **bidWindowEndDate** | [**LocalDate**](LocalDate) | The bid end date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **effectiveDate** | [**LocalDate**](LocalDate) | The date when agents will be assigned to the new work plan in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **agentRankingType** | [**AgentRankingTypeEnum**](#Enum--AgentRankingTypeEnum) | The type of agent ranking selected for this bid |  [optional] |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#Enum--RankingTiebreakerTypeEnum) | Ranking tiebreaker |  [optional] |
| **workPlanFieldsVisibleToAgents** | [**ListWrapperAgentWorkPlanField**](ListWrapperAgentWorkPlanField) | The work plan fields visible to agents whenever work plan preferences are made |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The state of the bid |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
