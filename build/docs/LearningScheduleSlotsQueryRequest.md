# LearningScheduleSlotsQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Range of time to get slots for scheduling learning activities. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **lengthInMinutes** | **Integer** | The duration of Learning Assignment to schedule in 15 minutes granularity |  |
| **userIds** | **List&lt;String&gt;** | The user IDs for which to fetch schedules. Must be only 1. |  |
| **interruptibleAssignmentId** | **String** | Assignment ID to exclude from consideration when determining blocked slots |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
