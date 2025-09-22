# HistoricalImportDeleteFilesJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The Job Id Request |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Property denoting the state of the remove request |  [optional] |
| **entities** | [**List&lt;HistoricalDataDeleteEntity&gt;**](HistoricalDataDeleteEntity) | The request entities that got deleted |  [optional] |
| **disallowedEntities** | [**List&lt;HistoricalDataDisallowedDeleteEntity&gt;**](HistoricalDataDisallowedDeleteEntity) | The request entities that were disallowed to be deleted |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
