# WfmScheduleTopicWfmScheduleNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **operationId** | **String** |  |  [optional] |
| **downloadUrl** | **String** |  |  [optional] |
| **percentComplete** | **Integer** |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPDATE | &quot;Update&quot; | 
| IMPORT | &quot;Import&quot; | 
| COPY | &quot;Copy&quot; | 
| GENERATE | &quot;Generate&quot; | 
| RESCHEDULE | &quot;Reschedule&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
