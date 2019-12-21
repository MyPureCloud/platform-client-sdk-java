---
title: AuditQueryRequest
---
## AuditQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Date and time range of data to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> | Name of the service to query audits for. |  |
| **filters** | <!----><!---->[**List&lt;AuditQueryFilter&gt;**](AuditQueryFilter.html)<!----> | Additional filters for the query. |  [optional] |
{: class="table table-striped"}


<a name="ServiceNameEnum"></a>

## Enum: ServiceNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONTACTCENTER | &quot;ContactCenter&quot; |
| CONTENTMANAGEMENT | &quot;ContentManagement&quot; |
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; |
| QUALITY | &quot;Quality&quot; |
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; |
| TOPICSDEFINITIONSSERVICE | &quot;TopicsDefinitionsService&quot; |
{: class="table table-striped"}



