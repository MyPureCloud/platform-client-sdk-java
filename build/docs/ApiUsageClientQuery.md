# ApiUsageClientQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Date granularity of the results |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *). |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group. |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAY | &quot;Day&quot; | 
| WEEK | &quot;Week&quot; | 
| MONTH | &quot;Month&quot; | 


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| STATUS200 | &quot;Status200&quot; |
| STATUS300 | &quot;Status300&quot; |
| STATUS400 | &quot;Status400&quot; |
| STATUS500 | &quot;Status500&quot; |
| STATUS429 | &quot;Status429&quot; |
| REQUESTS | &quot;Requests&quot; |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OAUTHCLIENTID | &quot;OAuthClientId&quot; |
| ORGANIZATIONID | &quot;OrganizationId&quot; |
| TEMPLATEURI | &quot;TemplateUri&quot; |
| HTTPMETHOD | &quot;HttpMethod&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
