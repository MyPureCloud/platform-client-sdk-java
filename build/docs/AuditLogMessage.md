---
title: AuditLogMessage
---
## AuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the audit message. |  [optional] |
| **userHomeOrgId** | <!----><!---->**String**<!----> | Home Organization Id associated with this audit message. |  [optional] |
| **user** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User associated with this audit message. |  [optional] |
| **client** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Client associated with this audit message. |  [optional] |
| **remoteIp** | <!----><!---->**List&lt;String&gt;**<!----> | List of IP addresses of systems that originated or handled the request. |  [optional] |
| **serviceName** | [**ServiceNameEnum**](#ServiceNameEnum)<!----> | Name of the service that logged this audit message. |  [optional] |
| **eventDate** | <!----><!---->[**Date**](Date.html)<!----> | Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **message** | <!----><!---->[**MessageInfo**](MessageInfo.html)<!----> | Message describing the event being audited. |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | Action that took place. |  [optional] |
| **entity** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | Entity that was impacted. |  [optional] |
| **entityType** | [**EntityTypeEnum**](#EntityTypeEnum)<!----> | Type of the entity that was impacted. |  [optional] |
| **propertyChanges** | <!----><!---->[**List&lt;PropertyChange&gt;**](PropertyChange.html)<!----> | List of properties that were changed and changes made to those properties. |  [optional] |
| **context** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Additional context for this message. |  [optional] |
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
| GAMIFICATION | &quot;Gamification&quot; |
| GROUPS | &quot;Groups&quot; |
| INTEGRATIONS | &quot;Integrations&quot; |
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; |
| LIMITS | &quot;Limits&quot; |
| OUTBOUND | &quot;Outbound&quot; |
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; |
| PERFORMANCE | &quot;Performance&quot; |
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
| WEBHOOKS | &quot;Webhooks&quot; |
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; |
| MESSAGING | &quot;Messaging&quot; |
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
| DELETEALL | &quot;DeleteAll&quot; |
| DOWNLOAD | &quot;Download&quot; |
| UPLOAD | &quot;Upload&quot; |
| MEMBERADD | &quot;MemberAdd&quot; |
| MEMBERUPDATE | &quot;MemberUpdate&quot; |
| MEMBERREMOVE | &quot;MemberRemove&quot; |
| READ | &quot;Read&quot; |
| READALL | &quot;ReadAll&quot; |
| EXECUTE | &quot;Execute&quot; |
| APPLYPROTECTION | &quot;ApplyProtection&quot; |
| REVOKEPROTECTION | &quot;RevokeProtection&quot; |
| UPDATERETENTION | &quot;UpdateRetention&quot; |
| ABANDON | &quot;Abandon&quot; |
| ARCHIVE | &quot;Archive&quot; |
| RESTOREREQUEST | &quot;RestoreRequest&quot; |
| RESTORECOMPLETE | &quot;RestoreComplete&quot; |
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
| OPEN | &quot;Open&quot; |
| APPROVED | &quot;Approved&quot; |
| REJECTED | &quot;Rejected&quot; |
| ROLLBACK | &quot;Rollback&quot; |
| IMPLEMENTINGCHANGE | &quot;ImplementingChange&quot; |
| CHANGEIMPLEMENTED | &quot;ChangeImplemented&quot; |
| IMPLEMENTINGROLLBACK | &quot;ImplementingRollback&quot; |
| ROLLBACKIMPLEMENTED | &quot;RollbackImplemented&quot; |
| WRITE | &quot;Write&quot; |
| PURGE | &quot;Purge&quot; |
| PROCESSED | &quot;Processed&quot; |
{: class="table table-striped"}


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACCESSTOKEN | &quot;AccessToken&quot; |
| ANNOTATION | &quot;Annotation&quot; |
| APPOINTMENT | &quot;Appointment&quot; |
| ATTEMPTLIMITS | &quot;AttemptLimits&quot; |
| AUTHORGANIZATION | &quot;AuthOrganization&quot; |
| AUTHUSER | &quot;AuthUser&quot; |
| BULK | &quot;Bulk&quot; |
| BULKACTIONS | &quot;BulkActions&quot; |
| CALIBRATION | &quot;Calibration&quot; |
| CALLABLETIMESET | &quot;CallableTimeSet&quot; |
| CALLANALYSISRESPONSESET | &quot;CallAnalysisResponseSet&quot; |
| CAMPAIGN | &quot;Campaign&quot; |
| CAMPAIGNRULE | &quot;CampaignRule&quot; |
| CAMPAIGNSCHEDULE | &quot;CampaignSchedule&quot; |
| CHANGEREQUEST | &quot;ChangeRequest&quot; |
| CLICKSTREAMSETTINGS | &quot;ClickstreamSettings&quot; |
| CONFIGURATION | &quot;Configuration&quot; |
| CONFIGURATIONVERSION | &quot;ConfigurationVersion&quot; |
| CONTACTLIST | &quot;ContactList&quot; |
| CONTACTLISTFILTER | &quot;ContactListFilter&quot; |
| DEPLOYMENT | &quot;Deployment&quot; |
| DASHBOARDSETTINGS | &quot;DashboardSettings&quot; |
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; |
| DID | &quot;DID&quot; |
| DIDPOOL | &quot;DIDPool&quot; |
| DNCLIST | &quot;DNCList&quot; |
| DOCUMENT | &quot;Document&quot; |
| EDGE | &quot;Edge&quot; |
| EDGEGROUP | &quot;EdgeGroup&quot; |
| EMERGENCYGROUP | &quot;EmergencyGroup&quot; |
| EVALUATION | &quot;Evaluation&quot; |
| EVALUATIONFORM | &quot;EvaluationForm&quot; |
| EVENTTYPE | &quot;EventType&quot; |
| EXPORTS | &quot;Exports&quot; |
| EXTENSION | &quot;Extension&quot; |
| EXTENSIONPOOL | &quot;ExtensionPool&quot; |
| EXTERNALMETRICDATA | &quot;ExternalMetricData&quot; |
| EXTERNALMETRICDEFINITION | &quot;ExternalMetricDefinition&quot; |
| FEEDBACK | &quot;Feedback&quot; |
| FLOW | &quot;Flow&quot; |
| FLOWMILESTONE | &quot;FlowMilestone&quot; |
| FLOWOUTCOME | &quot;FlowOutcome&quot; |
| FORECAST | &quot;Forecast&quot; |
| HISTORICALDATA | &quot;HistoricalData&quot; |
| INSIGHTSETTINGS | &quot;InsightSettings&quot; |
| INTEGRATION | &quot;Integration&quot; |
| IVR | &quot;IVR&quot; |
| LINE | &quot;Line&quot; |
| LINEBASE | &quot;LineBase&quot; |
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; |
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; |
| METRIC | &quot;Metric&quot; |
| NUMBERPLAN | &quot;NumberPlan&quot; |
| OAUTHCLIENT | &quot;OAuthClient&quot; |
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; |
| ORGANIZATIONAUTHORIZATIONTRUST | &quot;OrganizationAuthorizationTrust&quot; |
| ORGANIZATIONAUTHORIZATIONUSERTRUST | &quot;OrganizationAuthorizationUserTrust&quot; |
| ORGANIZATIONSETTINGS | &quot;OrganizationSettings&quot; |
| ORPHANEDRECORDING | &quot;OrphanedRecording&quot; |
| OUTBOUNDROUTE | &quot;OutboundRoute&quot; |
| OUTCOME | &quot;Outcome&quot; |
| PHONE | &quot;Phone&quot; |
| PHONEBASE | &quot;PhoneBase&quot; |
| POLICY | &quot;Policy&quot; |
| PREDICTOR | &quot;Predictor&quot; |
| PROGRAM | &quot;Program&quot; |
| PROMPT | &quot;Prompt&quot; |
| PROMPTRESOURCE | &quot;PromptResource&quot; |
| QUEUE | &quot;Queue&quot; |
| RECORDING | &quot;Recording&quot; |
| RECORDINGANNOTATION | &quot;RecordingAnnotation&quot; |
| RECORDINGSETTINGS | &quot;RecordingSettings&quot; |
| RESPONSE | &quot;Response&quot; |
| ROLE | &quot;Role&quot; |
| ROW | &quot;Row&quot; |
| ROUTINGTRANSCRIPTIONSETTINGS | &quot;RoutingTranscriptionSettings&quot; |
| RULESET | &quot;RuleSet&quot; |
| SCHEDULE | &quot;Schedule&quot; |
| SCHEDULEDEXPORTS | &quot;ScheduledExports&quot; |
| SCHEDULEGROUP | &quot;ScheduleGroup&quot; |
| SCHEMA | &quot;Schema&quot; |
| SCREENRECORDING | &quot;ScreenRecording&quot; |
| SEGMENT | &quot;Segment&quot; |
| SENTIMENTFEEDBACK | &quot;SentimentFeedback&quot; |
| SEQUENCE | &quot;Sequence&quot; |
| SEQUENCESCHEDULE | &quot;SequenceSchedule&quot; |
| SESSIONTYPE | &quot;SessionType&quot; |
| SITE | &quot;Site&quot; |
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; |
| STATUS | &quot;Status&quot; |
| SURVEY | &quot;Survey&quot; |
| SURVEYFORM | &quot;SurveyForm&quot; |
| TEAM | &quot;Team&quot; |
| TOPIC | &quot;Topic&quot; |
| TRANSCRIPTIONSETTINGS | &quot;TranscriptionSettings&quot; |
| TRIGGER | &quot;Trigger&quot; |
| TRUNK | &quot;Trunk&quot; |
| TRUNKBASE | &quot;TrunkBase&quot; |
| USERPRESENCE | &quot;UserPresence&quot; |
| VOICEMAILPOLICY | &quot;VoicemailPolicy&quot; |
| VOICEMAILUSERPOLICY | &quot;VoicemailUserPolicy&quot; |
| WEBHOOK | &quot;Webhook&quot; |
| WORKPLAN | &quot;WorkPlan&quot; |
| WORKSPACE | &quot;Workspace&quot; |
| WRAPUPCODE | &quot;WrapupCode&quot; |
| WRAPUPCODEMAPPING | &quot;WrapUpCodeMapping&quot; |
| CONVERSATIONPHONENUMBER | &quot;ConversationPhoneNumber&quot; |
| CONVERSATIONRECIPIENT | &quot;ConversationRecipient&quot; |
| CONVERSATIONACCOUNT | &quot;ConversationAccount&quot; |
| CONVERSATIONDEFAULTSUPPORTEDCONTENT | &quot;ConversationDefaultSupportedContent&quot; |
| CONVERSATIONTHREADINGWINDOW | &quot;ConversationThreadingWindow&quot; |
| SUPPORTEDCONTENT | &quot;SupportedContent&quot; |
{: class="table table-striped"}



