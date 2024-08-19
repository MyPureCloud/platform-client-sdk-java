# BuSchedulingSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageSeverities** | [**List&lt;SchedulerMessageTypeSeverity&gt;**](SchedulerMessageTypeSeverity) | Schedule generation message severity configuration |  [optional] |
| **syncTimeOffProperties** | [**SetWrapperSyncTimeOffProperty**](SetWrapperSyncTimeOffProperty) | Synchronize set of time off properties from scheduled activities to time off requests when the schedule is published. |  [optional] |
| **serviceGoalImpact** | [**WfmServiceGoalImpactSettings**](WfmServiceGoalImpactSettings) | Configures the max percent increase and decrease of service goals for this business unit |  [optional] |
| **allowWorkPlanPerMinuteGranularity** | **Boolean** | Indicates whether or not per minute granularity for scheduling will be enabled for this business unit. Defaults to false. |  [optional] |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
