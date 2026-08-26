# ScheduleBidScheduledActivity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) | The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **lengthMinutes** | **Integer** | The length of this activity in minutes |  |
| **description** | **String** | The description of this activity |  |
| **activityCategory** | [**ActivityCategoryEnum**](#Enum--ActivityCategoryEnum) | The activity code's category |  |
| **activityCodeId** | **String** | The ID of the activity code associated with this activity |  |
| **paid** | **Boolean** | Whether this activity is paid |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:261.0.0_
