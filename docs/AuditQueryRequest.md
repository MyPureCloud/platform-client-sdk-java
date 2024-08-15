# AuditQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | **String** | Date and time range of data to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ssZ/YYYY-MM-DDThh:mm:ssZ |  |
| **serviceName** | **String** | Name of the service to query audits for. |  |
| **filters** | [**List&lt;AuditQueryFilter&gt;**](AuditQueryFilter) | Additional filters for the query. |  [optional] |
| **sort** | [**List&lt;AuditQuerySort&gt;**](AuditQuerySort) | Sort parameter for the query. |  [optional] |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
