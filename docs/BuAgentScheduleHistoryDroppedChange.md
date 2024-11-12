# BuAgentScheduleHistoryDroppedChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metadata** | [**BuAgentScheduleHistoryChangeMetadata**](BuAgentScheduleHistoryChangeMetadata) | The metadata of the change, including who and when the change was made |  [optional] |
| **shiftIds** | **List&lt;String&gt;** | The IDs of deleted shifts |  [optional] |
| **fullDayTimeOffMarkerDates** | [**List&lt;LocalDate&gt;**](LocalDate) | The dates of any deleted full day time off markers |  [optional] |
| **deletes** | [**BuAgentScheduleHistoryDeletedChange**](BuAgentScheduleHistoryDeletedChange) | The deleted shifts, full day time off markers, or the entire agent schedule |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
