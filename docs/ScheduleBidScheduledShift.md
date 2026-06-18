# ScheduleBidScheduledShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **workPlanShiftId** | **String** | The ID of the work plan shift that was used in schedule generation |  [optional] |
| **workPlanId** | **String** | The ID of the work plan from which the shift comes |  [optional] |
| **startDate** | [**Date**](Date) | The start date of the scheduled shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **lengthMinutes** | **Integer** | The length of the shift in minutes |  |
| **activities** | [**List&lt;ScheduleBidScheduledActivity&gt;**](ScheduleBidScheduledActivity) | The activities associated with this shift |  |




_com.mypurecloud.sdk.v2:platform-client-v2:256.1.0_
