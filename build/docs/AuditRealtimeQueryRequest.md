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
| AGENTCONFIG | &quot;AgentConfig&quot; | 
| ANALYTICSREPORTING | &quot;AnalyticsReporting&quot; | 
| ARCHITECT | &quot;Architect&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| COACHING | &quot;Coaching&quot; | 
| CONTACTCENTER | &quot;ContactCenter&quot; | 
| CONTENTMANAGEMENT | &quot;ContentManagement&quot; | 
| DATATABLES | &quot;Datatables&quot; | 
| DIRECTORY | &quot;Directory&quot; | 
| DYNAMICSCHEMA | &quot;DynamicSchema&quot; | 
| EMAILS | &quot;Emails&quot; | 
| EMPLOYEEPERFORMANCE | &quot;EmployeePerformance&quot; | 
| GAMIFICATION | &quot;Gamification&quot; | 
| GROUPS | &quot;Groups&quot; | 
| INTEGRATIONS | &quot;Integrations&quot; | 
| KNOWLEDGE | &quot;Knowledge&quot; | 
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; | 
| LEARNING | &quot;Learning&quot; | 
| LIMITS | &quot;Limits&quot; | 
| LOGCAPTURE | &quot;LogCapture&quot; | 
| MARKETPLACE | &quot;Marketplace&quot; | 
| MESSAGING | &quot;Messaging&quot; | 
| NUMBERPURCHASING | &quot;NumberPurchasing&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; | 
| PREDICTIVEENGAGEMENT | &quot;PredictiveEngagement&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| PROCESSAUTOMATION | &quot;ProcessAutomation&quot; | 
| QUALITY | &quot;Quality&quot; | 
| RESPONSEMANAGEMENT | &quot;ResponseManagement&quot; | 
| ROUTING | &quot;Routing&quot; | 
| SCIM | &quot;SCIM&quot; | 
| SCRIPTER | &quot;Scripter&quot; | 
| SPEECHANDTEXTANALYTICS | &quot;SpeechAndTextAnalytics&quot; | 
| SUPPORTABILITY | &quot;Supportability&quot; | 
| TELEPHONY | &quot;Telephony&quot; | 
| TRIGGERS | &quot;Triggers&quot; | 
| VOICEMAIL | &quot;Voicemail&quot; | 
| WEBDEPLOYMENTS | &quot;WebDeployments&quot; | 
| WEBHOOKS | &quot;Webhooks&quot; | 
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; | 
| WORKITEMS | &quot;Workitems&quot; | 
{: class="table table-striped"}



