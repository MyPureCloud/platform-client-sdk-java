---
title: AuditTopicAuditLogMessage
---
## AuditTopicAuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> |  |  [optional] |
| **userHomeOrgId** | <!----><!---->**String**<!----> |  |  [optional] |
| **username** | <!----><!---->[**AuditTopicDomainEntityRef**](AuditTopicDomainEntityRef.html)<!----> |  |  [optional] |
| **userDisplay** | <!----><!---->**String**<!----> |  |  [optional] |
| **clientId** | <!----><!---->[**AuditTopicAddressableEntityRef**](AuditTopicAddressableEntityRef.html)<!----> |  |  [optional] |
| **remoteIp** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> |  |  [optional] |
| **eventTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **message** | <!----><!---->[**AuditTopicMessageInfo**](AuditTopicMessageInfo.html)<!----> |  |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> |  |  [optional] |
| **entityType** | [**EntityTypeEnum**](#EntityTypeEnum)<!----> |  |  [optional] |
| **entity** | <!----><!---->[**AuditTopicDomainEntityRef**](AuditTopicDomainEntityRef.html)<!----> |  |  [optional] |
| **propertyChanges** | <!----><!---->[**List&lt;AuditTopicPropertyChange&gt;**](AuditTopicPropertyChange.html)<!----> |  |  [optional] |
| **context** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ServiceNameEnum"></a>

## Enum: ServiceNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ARCHITECT | &quot;Architect&quot; |
| ANALYTICSREPORTING | &quot;AnalyticsReporting&quot; |
| CONTACTCENTER | &quot;ContactCenter&quot; |
| CONTENTMANAGEMENT | &quot;ContentManagement&quot; |
| EMPLOYEEPERFORMANCE | &quot;EmployeePerformance&quot; |
| GAMIFICATION | &quot;Gamification&quot; |
| GROUPS | &quot;Groups&quot; |
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; |
| LEARNING | &quot;Learning&quot; |
| OUTBOUND | &quot;Outbound&quot; |
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; |
| PREDICTIVEENGAGEMENT | &quot;PredictiveEngagement&quot; |
| PRESENCE | &quot;Presence&quot; |
| QUALITY | &quot;Quality&quot; |
| RESPONSEMANAGEMENT | &quot;ResponseManagement&quot; |
| ROUTING | &quot;Routing&quot; |
| SPEECHANDTEXTANALYTICS | &quot;SpeechAndTextAnalytics&quot; |
| TELEPHONY | &quot;Telephony&quot; |
| TOPICSDEFINITIONS | &quot;TopicsDefinitions&quot; |
| TRIGGERS | &quot;Triggers&quot; |
| WEBDEPLOYMENTS | &quot;WebDeployments&quot; |
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CREATE | &quot;Create&quot; |
| VIEW | &quot;View&quot; |
| UPDATE | &quot;Update&quot; |
| MOVE | &quot;Move&quot; |
| DELETE | &quot;Delete&quot; |
| DOWNLOAD | &quot;Download&quot; |
| UPLOAD | &quot;Upload&quot; |
| MEMBERADD | &quot;MemberAdd&quot; |
| MEMBERUPDATE | &quot;MemberUpdate&quot; |
| MEMBERREMOVE | &quot;MemberRemove&quot; |
| READ | &quot;Read&quot; |
| WRITE | &quot;Write&quot; |
| APPLYPROTECTION | &quot;ApplyProtection&quot; |
| REVOKEPROTECTION | &quot;RevokeProtection&quot; |
| UPDATERETENTION | &quot;UpdateRetention&quot; |
| READALL | &quot;ReadAll&quot; |
| EXECUTE | &quot;Execute&quot; |
| PUBLISH | &quot;Publish&quot; |
| UNPUBLISH | &quot;Unpublish&quot; |
| ACTIVATE | &quot;Activate&quot; |
| CHECKIN | &quot;Checkin&quot; |
| CHECKOUT | &quot;Checkout&quot; |
| DEACTIVATE | &quot;Deactivate&quot; |
| DEBUG | &quot;Debug&quot; |
| SAVE | &quot;Save&quot; |
| REVERT | &quot;Revert&quot; |
| TRANSCODE | &quot;Transcode&quot; |
| ENABLE | &quot;Enable&quot; |
| DISABLE | &quot;Disable&quot; |
| AUTHORIZE | &quot;Authorize&quot; |
| DEAUTHORIZE | &quot;Deauthorize&quot; |
| AUTHENTICATE | &quot;Authenticate&quot; |
| CHANGEPASSWORD | &quot;ChangePassword&quot; |
| REVOKE | &quot;Revoke&quot; |
| EXPORT | &quot;Export&quot; |
| APPEND | &quot;Append&quot; |
| RECYCLE | &quot;Recycle&quot; |
| PURGE | &quot;Purge&quot; |
| PROCESSED | &quot;Processed&quot; |
| ASSIGN | &quot;Assign&quot; |
| UNASSIGN | &quot;Unassign&quot; |
| RESET | &quot;Reset&quot; |
| REASSIGN | &quot;Reassign&quot; |
{: class="table table-striped"}


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACCESSTOKEN | &quot;AccessToken&quot; |
| ACTIONMAP | &quot;ActionMap&quot; |
| ACTIONTEMPLATE | &quot;ActionTemplate&quot; |
| ACTIVITYCODE | &quot;ActivityCode&quot; |
| AGENTROUTINGINFO | &quot;AgentRoutingInfo&quot; |
| ANALYTICSREPORTINGSETTINGS | &quot;AnalyticsReportingSettings&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| ATTEMPTLIMITS | &quot;AttemptLimits&quot; |
| AUTHORGANIZATION | &quot;AuthOrganization&quot; |
| AUTHUSER | &quot;AuthUser&quot; |
| BULKACTIONS | &quot;BulkActions&quot; |
| BUSINESSUNIT | &quot;BusinessUnit&quot; |
| CALLANALYSISRESPONSESET | &quot;CallAnalysisResponseSet&quot; |
| CALLABLETIMESET | &quot;CallableTimeSet&quot; |
| CAMPAIGN | &quot;Campaign&quot; |
| CAMPAIGNRULE | &quot;CampaignRule&quot; |
| CAMPAIGNSCHEDULE | &quot;CampaignSchedule&quot; |
| CLICKSTREAMSETTINGS | &quot;ClickstreamSettings&quot; |
| CONFIGURATION | &quot;Configuration&quot; |
| CONFIGURATIONVERSION | &quot;ConfigurationVersion&quot; |
| CONTACTLIST | &quot;ContactList&quot; |
| CONTACTLISTFILTER | &quot;ContactListFilter&quot; |
| DASHBOARDSETTINGS | &quot;DashboardSettings&quot; |
| DID | &quot;DID&quot; |
| DIDPOOL | &quot;DIDPool&quot; |
| DNCLIST | &quot;DNCList&quot; |
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; |
| DEPLOYMENT | &quot;Deployment&quot; |
| DOCUMENT | &quot;Document&quot; |
| DYNAMICGROUP | &quot;DynamicGroup&quot; |
| EDGE | &quot;Edge&quot; |
| EDGEGROUP | &quot;EdgeGroup&quot; |
| EMERGENCYGROUP | &quot;EmergencyGroup&quot; |
| EVENTTYPE | &quot;EventType&quot; |
| EXPORTS | &quot;Exports&quot; |
| EXTENSION | &quot;Extension&quot; |
| EXTENSIONPOOL | &quot;ExtensionPool&quot; |
| EXTERNALMETRICSDEFINITION | &quot;ExternalMetricsDefinition&quot; |
| EXTERNALMETRICSDATA | &quot;ExternalMetricsData&quot; |
| FEEDBACK | &quot;Feedback&quot; |
| FLOW | &quot;Flow&quot; |
| FLOWMILESTONE | &quot;FlowMilestone&quot; |
| FLOWOUTCOME | &quot;FlowOutcome&quot; |
| FORECAST | &quot;Forecast&quot; |
| HISTORICALDATA | &quot;HistoricalData&quot; |
| INSIGHTSETTINGS | &quot;InsightSettings&quot; |
| IVR | &quot;IVR&quot; |
| LINE | &quot;Line&quot; |
| LINEBASE | &quot;LineBase&quot; |
| MANAGEMENTUNIT | &quot;ManagementUnit&quot; |
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; |
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; |
| METRIC | &quot;Metric&quot; |
| MODULE | &quot;Module&quot; |
| NUMBERPLAN | &quot;NumberPlan&quot; |
| OAUTHCLIENT | &quot;OAuthClient&quot; |
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; |
| ORGANIZATIONAUTHORIZATIONTRUST | &quot;OrganizationAuthorizationTrust&quot; |
| ORGANIZATIONAUTHORIZATIONUSERTRUST | &quot;OrganizationAuthorizationUserTrust&quot; |
| ORGANIZATIONSETTINGS | &quot;OrganizationSettings&quot; |
| OUTBOUNDROUTE | &quot;OutboundRoute&quot; |
| OUTCOME | &quot;Outcome&quot; |
| PHONE | &quot;Phone&quot; |
| PHONEBASE | &quot;PhoneBase&quot; |
| PLANNINGGROUP | &quot;PlanningGroup&quot; |
| PREDICTOR | &quot;Predictor&quot; |
| PROFILE | &quot;Profile&quot; |
| PROFILEMEMBERS | &quot;ProfileMembers&quot; |
| PROGRAM | &quot;Program&quot; |
| PROMPT | &quot;Prompt&quot; |
| PROMPTRESOURCE | &quot;PromptResource&quot; |
| QUEUE | &quot;Queue&quot; |
| RECORDING | &quot;Recording&quot; |
| RESPONSE | &quot;Response&quot; |
| ROLE | &quot;Role&quot; |
| ROUTINGTRANSCRIPTIONSETTINGS | &quot;RoutingTranscriptionSettings&quot; |
| ROUTINGUTILIZATIONTAG | &quot;RoutingUtilizationTag&quot; |
| RULE | &quot;Rule&quot; |
| RULESET | &quot;RuleSet&quot; |
| SCHEDULE | &quot;Schedule&quot; |
| SCHEDULEDEXPORTS | &quot;ScheduledExports&quot; |
| SCHEDULEGROUP | &quot;ScheduleGroup&quot; |
| SEGMENT | &quot;Segment&quot; |
| SEQUENCE | &quot;Sequence&quot; |
| SEQUENCESCHEDULE | &quot;SequenceSchedule&quot; |
| SERVICEGOALTEMPLATE | &quot;ServiceGoalTemplate&quot; |
| SESSIONTYPE | &quot;SessionType&quot; |
| SHIFTTRADE | &quot;ShiftTrade&quot; |
| SITE | &quot;Site&quot; |
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; |
| STATUS | &quot;Status&quot; |
| TEAM | &quot;Team&quot; |
| TIMEOFFLIMIT | &quot;TimeOffLimit&quot; |
| TIMEOFFPLAN | &quot;TimeOffPlan&quot; |
| TIMEOFFREQUEST | &quot;TimeOffRequest&quot; |
| TOPIC | &quot;Topic&quot; |
| TRANSCRIPTIONSETTINGS | &quot;TranscriptionSettings&quot; |
| TRIGGER | &quot;Trigger&quot; |
| TRUNK | &quot;Trunk&quot; |
| TRUNKBASE | &quot;TrunkBase&quot; |
| USERPRESENCE | &quot;UserPresence&quot; |
| VOICEMAILPOLICY | &quot;VoicemailPolicy&quot; |
| VOICEMAILUSERPOLICY | &quot;VoicemailUserPolicy&quot; |
| WORKPLAN | &quot;WorkPlan&quot; |
| WORKPLANROTATION | &quot;WorkPlanRotation&quot; |
| WORKSPACE | &quot;Workspace&quot; |
| WRAPUPCODEMAPPING | &quot;WrapUpCodeMapping&quot; |
| WRAPUPCODE | &quot;WrapupCode&quot; |
{: class="table table-striped"}



