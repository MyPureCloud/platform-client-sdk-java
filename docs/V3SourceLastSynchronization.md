# V3SourceLastSynchronization


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **dateStart** | [**Date**](Date) | The start time of the synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | [**Date**](Date) | The end time of the synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateSourceIntervalStart** | [**Date**](Date) | The start time of the interval to be synchronized from the source. Source item changes during that interval are included in this synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateSourceIntervalEnd** | [**Date**](Date) | The end time of the interval to be synchronized from the source. Source item changes during that interval are included in this synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **triggerType** | [**TriggerTypeEnum**](#Enum--TriggerTypeEnum) | The trigger type of the synchronization. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the synchronization. |  [optional] |
| **statistics** | [**V3SynchronizationStatistics**](V3SynchronizationStatistics) | Statistics of the synchronization. |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | The error that occurred during the synchronization. |  [optional] |
| **ingestionStatus** | [**IngestionStatusEnum**](#Enum--IngestionStatusEnum) | The status of the ingestion. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TriggerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| MANUAL | &quot;Manual&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INQUEUE | &quot;InQueue&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| POSTPROCESSING | &quot;PostProcessing&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 


## Enum: IngestionStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| INQUEUE | &quot;InQueue&quot; | 
| STARTING | &quot;Starting&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| STOPPING | &quot;Stopping&quot; | 
| STOPPED | &quot;Stopped&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
