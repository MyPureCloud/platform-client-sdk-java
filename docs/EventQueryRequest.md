# EventQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Date and time range to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **eventDefinitionIds** | **List&lt;String&gt;** | Filter events by a list of event definition ids |  [optional] |
| **searchTerm** | **String** | Only return events that contain the search term |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | Order of results. Default order is DESC. |  [optional] |


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;ASC&quot; | 
| DESC | &quot;DESC&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
