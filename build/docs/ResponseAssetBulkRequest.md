# ResponseAssetBulkRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetIds** | **List&lt;String&gt;** | List of Response Asset IDs (max 50) |  |
| **sortBy** | **String** | The field in the resource that you want to sort the results by. Allowed values: name, dateCreated, dateModified, contentLength |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | The sort order for results |  [optional] |


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;asc&quot; | 
| DESC | &quot;desc&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
