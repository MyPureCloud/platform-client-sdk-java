# V3SourceExpandableResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the source. |  [optional] |
| **connectionId** | **String** | The connectionId of the source. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the source. |  [optional] |
| **triggerType** | [**TriggerTypeEnum**](#Enum--TriggerTypeEnum) | The trigger type of the source. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the source. |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the source. |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The user who modified the document. |  [optional] |
| **dateCreated** | [**Date**](Date) | Source creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Source last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastSync** | [**V3SourceLastSynchronization**](V3SourceLastSynchronization) | The last synchronization of the source. |  [optional] |
| **scheduleSettings** | [**V3SourceScheduleSettings**](V3SourceScheduleSettings) | Settings that determine when the source starts a sync. |  [optional] |
| **filters** | [**V3SourceFilter**](V3SourceFilter) | Filters that determine what documents are synced. |  [optional] |
| **filterDetails** | [**V3SourceFilterDetails**](V3SourceFilterDetails) | Additional details to the source's filters. |  [optional] |
| **connection** | [**ConnectionResponse**](ConnectionResponse) | The connection associated with the source. Needs to be expanded. |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Optional error details of an errored source. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| ERRORED | &quot;Errored&quot; | 
| DELETED | &quot;Deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:256.0.0_
