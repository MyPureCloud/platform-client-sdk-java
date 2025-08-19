# BuAgentScheduleActivity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) | The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **lengthMinutes** | **Integer** | The length of this activity in minutes |  |
| **description** | **String** | The description of this activity |  |
| **activityCodeId** | **String** | The ID of the activity code associated with this activity |  |
| **paid** | **Boolean** | Whether this activity is paid |  [optional] |
| **payableMinutes** | **Integer** | Payable minutes for this activity |  [optional] |
| **timeOffRequestId** | **String** | The ID of the time off request associated with this activity, if applicable |  [optional] |
| **timeOffRequestSyncVersion** | **Integer** | The sync version of the partial day time off request for which the scheduled activity is associated, if applicable |  [optional] |
| **externalActivityId** | **String** | The ID of the external activity associated with this activity, if applicable |  [optional] |
| **externalActivityType** | [**ExternalActivityTypeEnum**](#Enum--ExternalActivityTypeEnum) | The type of the external activity associated with this activity, if applicable |  [optional] |


## Enum: ExternalActivityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITYPLAN | &quot;ActivityPlan&quot; | 
| COACHING | &quot;Coaching&quot; | 
| LEARNING | &quot;Learning&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
