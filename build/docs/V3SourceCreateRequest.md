# V3SourceCreateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the source. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the source. Required if connectionId is not specified, inherits the connection type otherwise. |  [optional] |
| **connectionId** | **String** | The id of the connection related to the source. Required if type is Sharepoint. |  [optional] |
| **triggerType** | [**TriggerTypeEnum**](#Enum--TriggerTypeEnum) | The trigger type of the source. Default is Manual. |  [optional] |
| **scheduleSettings** | [**V3SourceScheduleSettings**](V3SourceScheduleSettings) | Settings that determine when the source starts a sync. Required if triggerType is Scheduled. |  [optional] |
| **filters** | [**V3SourceFilter**](V3SourceFilter) | Filters that determine what documents are synced. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SHAREPOINT | &quot;Sharepoint&quot; | 
| FILEUPLOAD | &quot;FileUpload&quot; | 


## Enum: TriggerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| MANUAL | &quot;Manual&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.1.0_
