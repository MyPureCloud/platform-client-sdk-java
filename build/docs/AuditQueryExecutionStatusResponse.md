---
title: AuditQueryExecutionStatusResponse
---
## AuditQueryExecutionStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the audit query execution request. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Status of the audit query execution request. |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Start date and time of the audit query execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **interval** | <!----><!---->**String**<!----> | Interval for the audit query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> | Service name for the audit query. |  [optional] |
| **filters** | <!----><!---->[**List&lt;AuditQueryFilter&gt;**](AuditQueryFilter.html)<!----> | Filters for the audit query. |  [optional] |
| **sort** | <!----><!---->[**List&lt;AuditQuerySort&gt;**](AuditQuerySort.html)<!----> | Sort parameter for the audit query. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;Queued&quot; | 
| RUNNING | &quot;Running&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 
| CANCELLED | &quot;Cancelled&quot; | 
{: class="table table-striped"}


<a name="ServiceNameEnum"></a>

## Enum: ServiceNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ANALYTICSREPORTING | &quot;AnalyticsReporting&quot; | 
| ARCHITECT | &quot;Architect&quot; | 
| COACHING | &quot;Coaching&quot; | 
| CONTACTCENTER | &quot;ContactCenter&quot; | 
| CONTENTMANAGEMENT | &quot;ContentManagement&quot; | 
| DATATABLES | &quot;Datatables&quot; | 
| DIRECTORY | &quot;Directory&quot; | 
| DYNAMICSCHEMA | &quot;DynamicSchema&quot; | 
| GAMIFICATION | &quot;Gamification&quot; | 
| GROUPS | &quot;Groups&quot; | 
| INTEGRATIONS | &quot;Integrations&quot; | 
| KNOWLEDGE | &quot;Knowledge&quot; | 
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; | 
| LEARNING | &quot;Learning&quot; | 
| LIMITS | &quot;Limits&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; | 
| EMPLOYEEPERFORMANCE | &quot;EmployeePerformance&quot; | 
| PREDICTIVEENGAGEMENT | &quot;PredictiveEngagement&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| QUALITY | &quot;Quality&quot; | 
| RESPONSEMANAGEMENT | &quot;ResponseManagement&quot; | 
| ROUTING | &quot;Routing&quot; | 
| SPEECHANDTEXTANALYTICS | &quot;SpeechAndTextAnalytics&quot; | 
| TELEPHONY | &quot;Telephony&quot; | 
| TOPICSDEFINITIONS | &quot;TopicsDefinitions&quot; | 
| TRIGGERS | &quot;Triggers&quot; | 
| PROCESSAUTOMATION | &quot;ProcessAutomation&quot; | 
| VOICEMAIL | &quot;Voicemail&quot; | 
| WEBDEPLOYMENTS | &quot;WebDeployments&quot; | 
| WEBHOOKS | &quot;Webhooks&quot; | 
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; | 
| MESSAGING | &quot;Messaging&quot; | 
| SUPPORTABILITY | &quot;Supportability&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| WORKITEMS | &quot;Workitems&quot; | 
| SCIM | &quot;SCIM&quot; | 
| NUMBERPURCHASING | &quot;NumberPurchasing&quot; | 
| MARKETPLACE | &quot;Marketplace&quot; | 
{: class="table table-striped"}



