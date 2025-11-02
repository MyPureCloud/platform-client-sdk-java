# ShiftTradeActivityPreviewResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date) | The start date and time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthMinutes** | **Integer** | The length in minutes of this activity |  [optional] |
| **activityCodeId** | **String** | The ID of the activity code for this activity |  [optional] |
| **countsAsPaidTime** | **Boolean** | Whether this activity counts as paid time |  [optional] |
| **payableMinutes** | **Integer** | Payable minutes for this activity |  [optional] |
| **externalActivityType** | [**ExternalActivityTypeEnum**](#Enum--ExternalActivityTypeEnum) | The type of the external activity associated with this activity, if applicable |  [optional] |
| **externalActivityId** | **String** | The ID of the external activity associated with this activity, if applicable |  [optional] |


## Enum: ExternalActivityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVITYPLAN | &quot;ActivityPlan&quot; | 
| COACHING | &quot;Coaching&quot; | 
| LEARNING | &quot;Learning&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
