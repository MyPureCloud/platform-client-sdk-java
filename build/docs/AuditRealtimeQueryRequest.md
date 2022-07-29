---
title: AuditRealtimeQueryRequest
---
## AuditRealtimeQueryRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Date and time range of data to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ssZ/YYYY-MM-DDThh:mm:ssZ |  |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> | Name of the service to query audits for. |  |
| **filters** | <!----><!---->[**List&lt;AuditQueryFilter&gt;**](AuditQueryFilter.html)<!----> | Additional filters for the query. |  [optional] |
| **sort** | <!----><!---->[**List&lt;AuditQuerySort&gt;**](AuditQuerySort.html)<!----> | Sort parameter for the query. |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> | Page number |  [optional] |
| **pageSize** | <!----><!---->**Integer**<!----> | Page size |  [optional] |
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



