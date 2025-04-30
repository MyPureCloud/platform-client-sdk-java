# InfrastructureascodeJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **dryRun** | **Boolean** | Whether or not the job was a dry run |  |
| **acceleratorId** | **String** | Accelerator associated with the job |  [optional] |
| **dateSubmitted** | [**Date**](Date) | Date and time on which job was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **submittedBy** | [**UserReference**](UserReference) | User who submitted the job |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Job status |  [optional] |
| **errorInfo** | [**ErrorInfo**](ErrorInfo) | Information about errors, if any |  [optional] |
| **results** | **String** | The output results of the terraform job |  [optional] |
| **rollbackResults** | **String** | The results of rolling back the job if there were errors.  Not returned if job was successful. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| QUEUED | &quot;Queued&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| INTERNALERROR | &quot;InternalError&quot; | 
| INCOMPLETE | &quot;Incomplete&quot; | 
| FAILED | &quot;Failed&quot; | 
| ROLLBACKFAILED | &quot;RollbackFailed&quot; | 
| ROLLBACKCOMPLETE | &quot;RollbackComplete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
