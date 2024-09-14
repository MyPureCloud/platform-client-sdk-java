# BuAgentScheduleHistoryResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **priorPublishedSchedules** | [**List&lt;BuScheduleReference&gt;**](BuScheduleReference) | The list of previously published schedules |  [optional] |
| **basePublishedSchedule** | [**BuAgentScheduleHistoryChange**](BuAgentScheduleHistoryChange) | The originally published agent schedules |  [optional] |
| **droppedChanges** | [**List&lt;BuAgentScheduleHistoryDroppedChange&gt;**](BuAgentScheduleHistoryDroppedChange) | The changes dropped from the schedule history. This will happen if the schedule history is too large |  [optional] |
| **changes** | [**List&lt;BuAgentScheduleHistoryChange&gt;**](BuAgentScheduleHistoryChange) | The list of changes for the schedule history |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
