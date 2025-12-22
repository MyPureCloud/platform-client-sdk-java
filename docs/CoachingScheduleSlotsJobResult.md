# CoachingScheduleSlotsJobResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | The interval of the job. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job |  [optional] |
| **slot** | [**CoachingScheduleSlotsJobSlot**](CoachingScheduleSlotsJobSlot) | The slot found from the job |  [optional] |
| **hasConflict** | **Boolean** | True if the slot conflicts with a Coaching Appointment |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
