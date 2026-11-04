# SelfScheduleManagementUnitSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether agent self-scheduling is enabled for this management unit |  |
| **checkWorkPlanConstraints** | **Boolean** | Whether self-scheduling is further restricted by work plan constraints |  |
| **minimumMinutesBeforeEarliestScheduleChange** | **Integer** | The minimum number of minutes before the new activity start time to which the agent is allowed to self-schedule |  |
| **movableActivityCategories** | [**List<MovableActivityCategoriesEnum>**](#Enum--MovableActivityCategoriesEnum) | Movable activity categories enabled for self-scheduling |  |
| **movableActivityCodeIds** | **List&lt;String&gt;** | Movable activity codes enabled for self-scheduling |  |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this management unit's self-scheduling settings |  |


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
