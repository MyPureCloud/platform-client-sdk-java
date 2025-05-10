# KnowledgeSyncJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the sync job. |  [optional] |
| **uploadKey** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the export job. |  [optional] |
| **report** | [**KnowledgeSyncJobReport**](KnowledgeSyncJobReport) | Report of the sync job |  [optional] |
| **knowledgeBase** | [**KnowledgeBaseReference**](KnowledgeBaseReference) | Knowledge base which document export belongs to. |  [optional] |
| **dateCreated** | [**Date**](Date) | The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The timestamp of when the export stopped. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the operation |  [optional] |
| **downloadURL** | **String** | The URL of the location at which the caller can download the sync file, when available. |  [optional] |
| **failedEntitiesURL** | **String** | The URL of the location at which the caller can download the entities in json format that failed during the sync. |  [optional] |
| **source** | [**KnowledgeOperationSource**](KnowledgeOperationSource) | Source of the sync job. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| VALIDATIONINPROGRESS | &quot;ValidationInProgress&quot; | 
| VALIDATIONCOMPLETED | &quot;ValidationCompleted&quot; | 
| VALIDATIONFAILED | &quot;ValidationFailed&quot; | 
| STARTED | &quot;Started&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| PARTIALCOMPLETED | &quot;PartialCompleted&quot; | 
| FAILED | &quot;Failed&quot; | 
| ABORTREQUESTED | &quot;AbortRequested&quot; | 
| ABORTED | &quot;Aborted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
