# WfmScheduleTopicWfmScheduleNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **operationId** | **String** |  |  [optional] |
| **downloadUrl** | **String** |  |  [optional] |
| **percentComplete** | **Long** |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |


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
| GENERATE | &quot;Generate&quot; | 
| RESCHEDULE | &quot;Reschedule&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
