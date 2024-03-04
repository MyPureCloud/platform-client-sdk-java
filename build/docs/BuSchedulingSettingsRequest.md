---
title: BuSchedulingSettingsRequest
---
## BuSchedulingSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageSeverities** | <!----><!---->[**List&lt;SchedulerMessageTypeSeverity&gt;**](SchedulerMessageTypeSeverity.html)<!----> | Schedule generation message severity configuration |  [optional] |
| **syncTimeOffProperties** | <!----><!---->[**SetWrapperSyncTimeOffProperty**](SetWrapperSyncTimeOffProperty.html)<!----> | Synchronize set of time off properties from scheduled activities to time off requests when the schedule is published. |  [optional] |
| **serviceGoalImpact** | <!----><!---->[**WfmServiceGoalImpactSettings**](WfmServiceGoalImpactSettings.html)<!----> | Configures the max percent increase and decrease of service goals for this business unit |  [optional] |
| **allowWorkPlanPerMinuteGranularity** | <!----><!---->**Boolean**<!----> | Indicates whether or not per minute granularity for scheduling will be enabled for this business unit. Defaults to false. |  [optional] |
{: class="table table-striped"}



