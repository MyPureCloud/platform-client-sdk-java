# AvailableTime


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStart** | [**Date**](Date) | Start of the availability period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthInMinutes** | **Integer** | Length of availability period in minutes |  [optional] |
| **isPaid** | **Boolean** | Indicates if this availability period is paid in Workforce Management schedule |  [optional] |
| **activityCategory** | [**ActivityCategoryEnum**](#Enum--ActivityCategoryEnum) | Workforce Management activity category for this availability period |  [optional] |
| **wfmSchedule** | [**WfmScheduleReference**](WfmScheduleReference) | Workforce Management schedule information associated with the available time |  [optional] |


## Enum: ActivityCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONQUEUEWORK | &quot;OnQueueWork&quot; | 
| BREAK | &quot;Break&quot; | 
| MEAL | &quot;Meal&quot; | 
| MEETING | &quot;Meeting&quot; | 
| OFFQUEUEWORK | &quot;OffQueueWork&quot; | 
| TIMEOFF | &quot;TimeOff&quot; | 
| TRAINING | &quot;Training&quot; | 
| UNAVAILABLE | &quot;Unavailable&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
