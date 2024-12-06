# WfmBuScheduleTopicBuScheduleNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **operationId** | **String** |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **result** | [**WfmBuScheduleTopicBuScheduleMetadata**](WfmBuScheduleTopicBuScheduleMetadata) |  |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPDATE | &quot;Update&quot; | 
| IMPORT | &quot;Import&quot; | 
| COPY | &quot;Copy&quot; | 
| DELETE | &quot;Delete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
