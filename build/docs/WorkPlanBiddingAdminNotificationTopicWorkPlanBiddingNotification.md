# WorkPlanBiddingAdminNotificationTopicWorkPlanBiddingNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **buId** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **bidWindowStartDate** | **String** |  |  [optional] |
| **bidWindowEndDate** | **String** |  |  [optional] |
| **effectiveDate** | **String** |  |  [optional] |
| **agentRankingType** | [**AgentRankingTypeEnum**](#Enum--AgentRankingTypeEnum) |  |  [optional] |
| **rankingTiebreakerType** | [**RankingTiebreakerTypeEnum**](#Enum--RankingTiebreakerTypeEnum) |  |  [optional] |
| **workPlanFieldsVisibleToAgents** | [**List<WorkPlanFieldsVisibleToAgentsEnum>**](#Enum--WorkPlanFieldsVisibleToAgentsEnum) |  |  [optional] |


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


## Enum: AgentRankingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 


## Enum: RankingTiebreakerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| HIREDATE | &quot;HireDate&quot; | 
| PERFORMANCE | &quot;Performance&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| RANDOMLYASSIGN | &quot;RandomlyAssign&quot; | 


## Enum: WorkPlanFieldsVisibleToAgentsEnum

| Name | Value |
| ---- | ----- |
| UNKNOWN | &quot;Unknown&quot; |
| NAME | &quot;Name&quot; |
| PAIDHOURS | &quot;PaidHours&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
