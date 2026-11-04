# SelfScheduleAgentManagementUnitSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether agent self-scheduling is enabled for this management unit |  |
| **minimumMinutesBeforeEarliestScheduleChange** | **Integer** | The minimum number of minutes before the new activity start time to which the agent is allowed to self-schedule |  |
| **movableActivityCategories** | [**List<MovableActivityCategoriesEnum>**](#Enum--MovableActivityCategoriesEnum) | Movable activity categories enabled for self-schedule |  |
| **movableActivityCodeIds** | **List&lt;String&gt;** | Movable activity codes enabled for self-schedule |  |


## Enum: MovableActivityCategoriesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ONQUEUEWORK | &quot;OnQueueWork&quot; |
| BREAK | &quot;Break&quot; |
| MEAL | &quot;Meal&quot; |
| MEETING | &quot;Meeting&quot; |
| OFFQUEUEWORK | &quot;OffQueueWork&quot; |
| TIMEOFF | &quot;TimeOff&quot; |
| TRAINING | &quot;Training&quot; |
| UNAVAILABLE | &quot;Unavailable&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
