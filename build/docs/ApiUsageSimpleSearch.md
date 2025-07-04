# ApiUsageSimpleSearch


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **metrics** | [**List<MetricsEnum>**](#Enum--MetricsEnum) | Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *). |  [optional] |
| **oauthClientNames** | **List&lt;String&gt;** | Behaves like a SQL WHERE with multiple IN operators. Specifies a list of OAuth client names to be queried. |  [optional] |
| **httpMethods** | [**List<HttpMethodsEnum>**](#Enum--HttpMethodsEnum) | Behaves like a SQL WHERE with multiple IN operators. Specifies a list of HTTP methods to be queried. |  [optional] |
| **templateUris** | **List&lt;String&gt;** | Behaves like a SQL WHERE with multiple IN operators. Specifies a list of Template Uris to be queried. |  [optional] |


## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DATE | &quot;Date&quot; |
| CLIENTNAME | &quot;ClientName&quot; |
| HTTPMETHOD | &quot;HttpMethod&quot; |
| TEMPLATEURI | &quot;TemplateUri&quot; |
| STATUS200 | &quot;Status200&quot; |
| STATUS300 | &quot;Status300&quot; |
| STATUS400 | &quot;Status400&quot; |
| STATUS500 | &quot;Status500&quot; |
| STATUS429 | &quot;Status429&quot; |


## Enum: HttpMethodsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| DELETE | &quot;DELETE&quot; |
| PATCH | &quot;PATCH&quot; |
| PUT | &quot;PUT&quot; |
| HEAD | &quot;HEAD&quot; |
| CONNECT | &quot;CONNECT&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| TRACE | &quot;TRACE&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
