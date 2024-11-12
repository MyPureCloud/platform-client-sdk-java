# CreateWorkPlanBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the work plan bid |  |
| **forecast** | [**BuShortTermForecastWeekReference**](BuShortTermForecastWeekReference) | The selected forecast in this work plan bid |  [optional] |
| **bidWindowStartDate** | [**LocalDate**](LocalDate) | The bid start date where agents start participate in work plan bidding in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | [**LocalDate**](LocalDate) | The bid end date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | [**LocalDate**](LocalDate) | The date when agents will be assigned to the new work plan in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **agentRankingType** | [**AgentRankingTypeEnum**](#Enum--AgentRankingTypeEnum) | The type of agent ranking selected for this bid |  |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#Enum--RankingTiebreakerTypeEnum) | Ranking tiebreaker to be used |  |
| **workPlanFieldsVisibleToAgents** | [**List<WorkPlanFieldsVisibleToAgentsEnum>**](#Enum--WorkPlanFieldsVisibleToAgentsEnum) | The work plan fields visible to agents whenever work plan preferences are made |  |


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
| NAME | &quot;Name&quot; |
| PAIDHOURS | &quot;PaidHours&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
