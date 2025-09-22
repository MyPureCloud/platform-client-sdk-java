# WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataPurgeRequestComplete


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **entities** | [**List&lt;WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity&gt;**](WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDeleteEntity) |  |  [optional] |
| **disallowedEntities** | [**List&lt;WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity&gt;**](WfmHistoricalDataImportPurgeCompleteTopicHistoricalDataDisallowedDeleteEntity) |  |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
