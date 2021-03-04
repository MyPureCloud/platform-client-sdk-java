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
| **sort** | <!----><!---->[**List&lt;AuditQuerySort&gt;**](AuditQuerySort.html)<!----> | Sort parameter for the query. |  [optional] |
{: class="table table-striped"}


<a name="ServiceNameEnum"></a>

## Enum: ServiceNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ARCHITECT | &quot;Architect&quot; |
| CONTACTCENTER | &quot;ContactCenter&quot; |
| CONTENTMANAGEMENT | &quot;ContentManagement&quot; |
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; |
| PRESENCE | &quot;Presence&quot; |
| QUALITY | &quot;Quality&quot; |
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; |
| TOPICSDEFINITIONS | &quot;TopicsDefinitions&quot; |
| PREDICTIVEENGAGEMENT | &quot;PredictiveEngagement&quot; |
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; |
| TRIGGERS | &quot;Triggers&quot; |
| RESPONSEMANAGEMENT | &quot;ResponseManagement&quot; |
| GROUPS | &quot;Groups&quot; |
| TELEPHONY | &quot;Telephony&quot; |
| OUTBOUND | &quot;Outbound&quot; |
| SPEECHANDTEXTANALYTICS | &quot;SpeechAndTextAnalytics&quot; |
| ROUTING | &quot;Routing&quot; |
{: class="table table-striped"}



