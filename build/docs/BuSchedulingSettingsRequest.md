# BuSchedulingSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageSeverities** | [**List&lt;SchedulerMessageTypeSeverity&gt;**](SchedulerMessageTypeSeverity) | Schedule generation message severity configuration |  [optional] |
| **syncTimeOffProperties** | [**SetWrapperSyncTimeOffProperty**](SetWrapperSyncTimeOffProperty) | Synchronize set of time off properties from scheduled activities to time off requests when the schedule is published. |  [optional] |
| **serviceGoalImpact** | [**WfmServiceGoalImpactSettings**](WfmServiceGoalImpactSettings) | Configures the max percent increase and decrease of service goals for this business unit |  [optional] |
| **allowWorkPlanPerMinuteGranularity** | **Boolean** | Indicates whether or not per minute granularity for scheduling will be enabled for this business unit. Defaults to false. |  [optional] |
| **activitySmoothingType** | [**ActivitySmoothingTypeEnum**](#Enum--ActivitySmoothingTypeEnum) | The activity smoothing type for schedule generation in this business unit |  [optional] |
| **induceScheduleVariability** | **Boolean** | Indicates whether to provide variability in schedule generation |  [optional] |


## Enum: ActivitySmoothingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSBU | &quot;ReduceConcurrentActivitiesAcrossBu&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSMU | &quot;ReduceConcurrentActivitiesAcrossMu&quot; | 
| CONSISTENTSERVICELEVEL | &quot;ConsistentServiceLevel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
