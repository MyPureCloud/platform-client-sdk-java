# AgentMuQueryResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the operation |  |
| **operationId** | **String** | The ID for the operation |  |
| **result** | [**AgentMuScheduleResult**](AgentMuScheduleResult) | The schema of the result of the operation. Null if downloadUrl is populated, but defines the schema of the data that will be returned from the downloadUrl |  [optional] |
| **downloadUrl** | **String** | The URL from which to download the result. The result will follow the schema documented by the result field |  [optional] |
| **error** | [**ErrorBody**](ErrorBody) | Error details if status == 'Error'. Will always be null but the schema is documented in case of an error in an async notification |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
