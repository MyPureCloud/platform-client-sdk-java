# SelfScheduleManagementUnitSettingsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether agent self-scheduling is enabled for this management unit |  [optional] |
| **checkWorkPlanConstraints** | **Boolean** | Whether self-scheduling is further restricted by work plan constraints |  [optional] |
| **minimumMinutesBeforeEarliestScheduleChange** | **Integer** | The minimum number of minutes before the new activity start time to which the agent is allowed to self-schedule |  [optional] |
| **movableActivityCategories** | [**SetWrapperActivityCategory**](SetWrapperActivityCategory) | Movable activity categories enabled for self-scheduling |  [optional] |
| **movableActivityCodeIds** | [**SetWrapperString**](SetWrapperString) | Movable activity codes enabled for self-scheduling |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for this management unit's self-scheduling settings |  |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
