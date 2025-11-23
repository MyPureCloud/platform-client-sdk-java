# QualityAuditQueryExecutionStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the audit query execution request. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Status of the audit query execution request. |  [optional] |
| **dateStart** | [**Date**](Date) | Start date and time of the audit query execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **interval** | **String** | Interval for the audit query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **filters** | [**List&lt;QualityAuditQueryFilter&gt;**](QualityAuditQueryFilter) | Filters for the audit query. |  [optional] |
| **sort** | [**List&lt;AuditQuerySort&gt;**](AuditQuerySort) | Sort parameter for the audit query. |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;Queued&quot; | 
| RUNNING | &quot;Running&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
