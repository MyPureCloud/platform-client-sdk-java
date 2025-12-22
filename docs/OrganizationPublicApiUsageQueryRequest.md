# OrganizationPublicApiUsageQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Specify the interval to query on. Start and end are inclusive. Start date cannot be more than a year ago. End date cannot be more than 90 days after the start. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Specify the granularity to aggregate the data to. |  [optional] |
| **sortBy** | [**List&lt;UsageQuerySortBy&gt;**](UsageQuerySortBy) | Specify how to sort the returned data. |  [optional] |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Specify which metrics you want returned (all will be returned by default). |  [optional] |
| **templateUris** | **List&lt;String&gt;** | Specify if you only want a subset of templateUris represented in the query. |  [optional] |
| **httpMethods** | [**List<HttpMethodsEnum>**](#Enum--HttpMethodsEnum) | Specify if you only want a subset of httpMethods represented in the query. |  [optional] |
| **platforms** | **List&lt;String&gt;** | Specify if you only want a subset of platforms represented in the query. |  [optional] |
| **groupBy** | [**List<GroupByEnum>**](#Enum--GroupByEnum) | Specify how to aggregate the data (by default the data is not aggregated). |  [optional] |
| **userIds** | **List&lt;String&gt;** | Specify if you only want a subset of userIds represented in the query. |  [optional] |
| **oauthClientIds** | **List&lt;String&gt;** | Specify if you only want a subset of oauthClientIds represented in the query. |  [optional] |


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
| REQUESTS | &quot;Requests&quot; |
| STATUS200 | &quot;Status200&quot; |
| STATUS300 | &quot;Status300&quot; |
| STATUS400 | &quot;Status400&quot; |
| STATUS429 | &quot;Status429&quot; |
| STATUS500 | &quot;Status500&quot; |


## Enum: HttpMethodsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| PATCH | &quot;PATCH&quot; |
| DELETE | &quot;DELETE&quot; |
| HEAD | &quot;HEAD&quot; |


## Enum: GroupByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OAUTHCLIENTNAME | &quot;OauthClientName&quot; |
| OAUTHCLIENTID | &quot;OauthClientId&quot; |
| USERID | &quot;UserId&quot; |
| HTTPMETHOD | &quot;HttpMethod&quot; |
| TEMPLATEURI | &quot;TemplateUri&quot; |
| PLATFORM | &quot;Platform&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
