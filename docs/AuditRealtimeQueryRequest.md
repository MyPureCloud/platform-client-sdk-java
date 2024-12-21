# AuditRealtimeQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Date and time range of data to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ssZ/YYYY-MM-DDThh:mm:ssZ |  |
| **serviceName** | **String** | Name of the service to query audits for. |  [optional] |
| **filters** | [**List&lt;AuditQueryFilter&gt;**](AuditQueryFilter) | Additional filters for the query. |  [optional] |
| **sort** | [**List&lt;AuditQuerySort&gt;**](AuditQuerySort) | Sort parameter for the query. |  [optional] |
| **pageNumber** | **Integer** | Page number |  [optional] |
| **pageSize** | **Integer** | Page size |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
