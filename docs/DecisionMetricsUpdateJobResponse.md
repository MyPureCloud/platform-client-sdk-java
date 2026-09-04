# DecisionMetricsUpdateJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **uploadKey** | **String** | The S3 key for the uploaded decision metrics file |  |
| **job** | [**DecisionMetricsJobReference**](DecisionMetricsJobReference) | The update job |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the update job |  |
| **metadata** | [**WfmEntityMetadata**](WfmEntityMetadata) | The metadata of the update job |  |
| **updateErrors** | [**List&lt;DecisionMetricsUpdateError&gt;**](DecisionMetricsUpdateError) | Errors occurred during update process, which will be non empty when status is `Error` |  |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
