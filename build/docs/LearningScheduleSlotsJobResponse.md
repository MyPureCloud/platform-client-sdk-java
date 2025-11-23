# LearningScheduleSlotsJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **userIds** | **List&lt;String&gt;** | The user IDs to fetch the slots for. |  [optional] |
| **lengthInMinutes** | **Integer** | The length in minutes of the slots. |  [optional] |
| **businessUnitId** | **String** | The Business Unit Id of the users. |  [optional] |
| **activityCodeId** | **String** | The Activity Code Id of the slots. |  [optional] |
| **slotsType** | [**SlotsTypeEnum**](#Enum--SlotsTypeEnum) | The type of slots fetched in the job. |  [optional] |
| **results** | [**List&lt;LearningScheduleSlotsJobResult&gt;**](LearningScheduleSlotsJobResult) | The results of the job. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SlotsTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BESTTIME | &quot;BestTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
