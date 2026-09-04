# CreateScheduleBid


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the schedule bid |  |
| **forecast** | [**BuShortTermForecastWeekReference**](BuShortTermForecastWeekReference) | The selected forecast used for schedule set generation for this bid |  [optional] |
| **bidWindowStartDate** | [**LocalDate**](LocalDate) | The bid start date where agents start participating in schedule bidding relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **bidWindowEndDate** | [**LocalDate**](LocalDate) | The bid end date relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **effectiveDate** | [**LocalDate**](LocalDate) | The date when schedule sets would be effective for schedule generation relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **weeksToSchedule** | **Integer** | The number of weeks to generate schedule set through this bid |  |
| **endOverridesAndRotations** | **Boolean** | If true, all existing overrides, work plan rotations will be ended one day before effective date of this bid |  [optional] |
| **agentRankingType** | [**AgentRankingTypeEnum**](#Enum--AgentRankingTypeEnum) | The type of agent ranking selected for this bid |  |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#Enum--RankingTiebreakerTypeEnum) | Ranking tiebreaker to be used |  |


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




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
