# UserListScheduleRequestBody


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userIds** | **List&lt;String&gt;** | The user ids for which to fetch schedules |  |
| **startDate** | [**Date**](Date) | Beginning of the range of schedules to fetch, in ISO-8601 format |  |
| **endDate** | [**Date**](Date) | End of the range of schedules to fetch, in ISO-8601 format |  |
| **loadFullWeeks** | **Boolean** | Whether to load the full week's schedule (for the requested users) of any week overlapping the start/end date query parameters, defaults to false |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
