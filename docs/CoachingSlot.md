# CoachingSlot


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStart** | [**Date**](Date) | Start date and time of scheduled coaching appointment slot. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthInMinutes** | **Integer** | Length of coaching appointment slot in minutes |  [optional] |
| **staffingDifference** | **Double** | Difference between scheduled and forecast headcount for this slot after scheduling the coaching appointment |  [optional] |
| **differenceRating** | [**DifferenceRatingEnum**](#Enum--DifferenceRatingEnum) | Rating based on the staffing difference for scheduled slot |  [optional] |
| **wfmSchedule** | [**WfmScheduleReference**](WfmScheduleReference) | Workforce Management schedule information associated with the slot |  [optional] |


## Enum: DifferenceRatingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POOR | &quot;Poor&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| GOOD | &quot;Good&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
