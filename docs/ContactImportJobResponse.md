# ContactImportJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **statusDetails** | **String** | Detailed description for JobStatus. |  [optional] |
| **executionStep** | [**ExecutionStepEnum**](#Enum--ExecutionStepEnum) | Detailed description for the Job execution state |  [optional] |
| **metadata** | [**ContactImportJobMetadata**](ContactImportJobMetadata) | Metadata for the job |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **division** | [**StarrableDivision**](StarrableDivision) | Division for the job |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **settings** | [**AddressableEntityRef**](AddressableEntityRef) | Settings |  |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 


## Enum: ExecutionStepEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VALIDATING | &quot;Validating&quot; | 
| VALIDATED | &quot;Validated&quot; | 
| IMPORTING | &quot;Importing&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
