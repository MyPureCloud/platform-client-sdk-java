# BuAgentScheduleHistoryChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metadata** | [**BuAgentScheduleHistoryChangeMetadata**](BuAgentScheduleHistoryChangeMetadata) | The metadata of the change, including who and when the change was made |  [optional] |
| **shifts** | [**List&lt;BuAgentScheduleShift&gt;**](BuAgentScheduleShift) | The list of changed shifts |  [optional] |
| **fullDayTimeOffMarkers** | [**List&lt;BuFullDayTimeOffMarker&gt;**](BuFullDayTimeOffMarker) | The list of changed full day time off markers |  [optional] |
| **deletes** | [**BuAgentScheduleHistoryDeletedChange**](BuAgentScheduleHistoryDeletedChange) | The deleted shifts, full day time off markers, or the entire agent schedule |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
