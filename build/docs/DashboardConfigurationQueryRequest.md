# DashboardConfigurationQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dashboardConfigurationIds** | **List&lt;String&gt;** | The user supplied dashboard configuration ids |  |
| **pageNumber** | **Integer** | The page number of the queried response |  [optional] |
| **pageSize** | **Integer** | The number of entities to return of the queried response. The max is 25 |  [optional] |
| **sortBy** | [**SortByEnum**](#Enum--SortByEnum) | The order in which response will be sorted |  [optional] |


## Enum: SortByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;Asc&quot; | 
| DESC | &quot;Desc&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
