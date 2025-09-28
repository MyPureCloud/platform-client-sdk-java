# ReprocessJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** | The description of the job. |  [optional] |
| **dateStart** | [**Date**](Date) | The date from which the reprocessing should begin. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateEnd** | [**Date**](Date) | The date at which the reprocessing should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **mediaTypes** | [**List<MediaTypesEnum>**](#Enum--MediaTypesEnum) | Media types used to filter interactions. |  |
| **programs** | **List&lt;String&gt;** | The mapped programs to be included in the job. |  |
| **dialects** | **List&lt;String&gt;** | Language dialects used to filter interactions. |  [optional] |
| **createdBy** | [**AddressableEntityRef**](AddressableEntityRef) | The user who created the job. |  |
| **dateCreated** | [**Date**](Date) | The date the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **jobStatus** | [**JobStatusEnum**](#Enum--JobStatusEnum) | The status of the job. |  |
| **queueOrder** | **Integer** | The position of the job in the queued jobs. |  [optional] |
| **processedInteractionsCount** | **Integer** | The amount of interactions successfully reprocessed. |  |
| **failedInteractionsCount** | **Integer** | The amount of failed interactions. |  |
| **totalInteractionsCount** | **Integer** | The amount of interactions in the job. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALL | &quot;Call&quot; |
| CALLBACK | &quot;Callback&quot; |
| CHAT | &quot;Chat&quot; |
| EMAIL | &quot;Email&quot; |
| MESSAGE | &quot;Message&quot; |


## Enum: JobStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;Queued&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
