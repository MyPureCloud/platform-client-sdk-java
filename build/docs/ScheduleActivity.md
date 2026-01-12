# ScheduleActivity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStart** | [**Date**](Date) | The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthMinutes** | **Integer** | The length of this activity in minutes |  [optional] |
| **description** | **String** | The description of this activity |  [optional] |
| **activityCodeId** | **String** | The ID of the activity code associated with this activity |  [optional] |
| **paid** | **Boolean** | Whether this activity is paid |  [optional] |
| **timeOffRequestId** | **String** | The ID of the time off request associated with this activity, if applicable |  [optional] |
| **externalActivityId** | **String** | The ID of the external activity associated with this activity, if applicable |  [optional] |
| **externalActivityType** | [**ExternalActivityTypeEnum**](#Enum--ExternalActivityTypeEnum) | The type of the external activity associated with this activity, if applicable |  [optional] |


## Enum: ExternalActivityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITYPLAN | &quot;ActivityPlan&quot; | 
| COACHING | &quot;Coaching&quot; | 
| LEARNING | &quot;Learning&quot; | 
| OPPORTUNITY | &quot;Opportunity&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
