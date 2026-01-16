# LearningScheduleSlotsJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userIds** | **List&lt;String&gt;** | The user IDs to fetch the slots for. |  |
| **lengthInMinutes** | **Integer** | The length in minutes of the slots, in 15 minutes granularity. |  |
| **activityCodeId** | **String** | The Activity Code Id of the slots. |  |
| **intervals** | **List&lt;String&gt;** | The intervals to fetch the slots for. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **slotsType** | [**SlotsTypeEnum**](#Enum--SlotsTypeEnum) | The type of slots to fetch in the job. |  |


## Enum: SlotsTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BESTTIME | &quot;BestTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
