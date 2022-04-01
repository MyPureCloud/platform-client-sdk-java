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
| WEBDEPLOYMENTS | &quot;WebDeployments&quot; |
| WEBHOOKS | &quot;Webhooks&quot; |
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; |
| MESSAGING | &quot;Messaging&quot; |
| SUPPORTABILITY | &quot;Supportability&quot; |
| CALLBACK | &quot;Callback&quot; |
| WORKITEMS | &quot;Workitems&quot; |
| SCIM | &quot;SCIM&quot; |
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
| COPY | &quot;Copy&quot; |
| DELETE | &quot;Delete&quot; |
| DELETEALL | &quot;DeleteAll&quot; |
| FAX | &quot;Fax&quot; |
| VERSIONCREATE | &quot;VersionCreate&quot; |
| DOWNLOAD | &quot;Download&quot; |
| UPLOAD | &quot;Upload&quot; |
| MEMBERADD | &quot;MemberAdd&quot; |
| MEMBERUPDATE | &quot;MemberUpdate&quot; |
| MEMBERREMOVE | &quot;MemberRemove&quot; |
| SHAREADD | &quot;ShareAdd&quot; |
| SHAREREMOVE | &quot;ShareRemove&quot; |
| TAGADD | &quot;TagAdd&quot; |
| TAGREMOVE | &quot;TagRemove&quot; |
| TAGUPDATE | &quot;TagUpdate&quot; |
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
| PROMOTE | &quot;Promote&quot; |
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
| REPLACE | &quot;Replace&quot; |
| UPDATEINSERVICE | &quot;UpdateInService&quot; |
| UPDATEOUTOFSERVICE | &quot;UpdateOutOfService&quot; |
| CYCLE | &quot;Cycle&quot; |
| SCALE | &quot;Scale&quot; |
| IPALLOWLISTCLEAR | &quot;IpAllowlistClear&quot; |
| ADDPAIRINGROLE | &quot;AddPairingRole&quot; |
| ADD | &quot;Add&quot; |
| VERIFY | &quot;Verify&quot; |
| ASSIGN | &quot;Assign&quot; |
| UNASSIGN | &quot;Unassign&quot; |
| REASSIGN | &quot;Reassign&quot; |
| RESCHEDULE | &quot;Reschedule&quot; |
| CANCEL | &quot;Cancel&quot; |
| SOFTDELETE | &quot;SoftDelete&quot; |
| HARDDELETE | &quot;HardDelete&quot; |
| RESET | &quot;Reset&quot; |
{: class="table table-striped"}


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACCESSTOKEN | &quot;AccessToken&quot; |
| ACTION | &quot;Action&quot; |
| ACTIONDRAFT | &quot;ActionDraft&quot; |
| ACTIONMAP | &quot;ActionMap&quot; |
| ACTIONTEMPLATE | &quot;ActionTemplate&quot; |
| ACTIVITYCODE | &quot;ActivityCode&quot; |
| AGENTROUTINGINFO | &quot;AgentRoutingInfo&quot; |
| ANALYTICSREPORTINGSETTINGS | &quot;AnalyticsReportingSettings&quot; |
| ANNOTATION | &quot;Annotation&quot; |
| APPOINTMENT | &quot;Appointment&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| ATTEMPTLIMITS | &quot;AttemptLimits&quot; |
| AUTHORGANIZATION | &quot;AuthOrganization&quot; |
| AUTHUSER | &quot;AuthUser&quot; |
| BULK | &quot;Bulk&quot; |
| BULKACTIONS | &quot;BulkActions&quot; |
| BUSINESSUNIT | &quot;BusinessUnit&quot; |
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
| CONTACTSCHEMA | &quot;ContactSchema&quot; |
| CONVERSATIONATTRIBUTES | &quot;ConversationAttributes&quot; |
| CONVERSATIONACCOUNT | &quot;ConversationAccount&quot; |
| CONVERSATIONDEFAULTSUPPORTEDCONTENT | &quot;ConversationDefaultSupportedContent&quot; |
| CONVERSATIONPHONENUMBER | &quot;ConversationPhoneNumber&quot; |
| CONVERSATIONRECIPIENT | &quot;ConversationRecipient&quot; |
| CONVERSATIONTHREADINGWINDOW | &quot;ConversationThreadingWindow&quot; |
| CREDENTIAL | &quot;Credential&quot; |
| DASHBOARDSETTINGS | &quot;DashboardSettings&quot; |
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; |
| DEPLOYMENT | &quot;Deployment&quot; |
| DID | &quot;DID&quot; |
| DIDPOOL | &quot;DIDPool&quot; |
| DNCLIST | &quot;DNCList&quot; |
| DOCUMENT | &quot;Document&quot; |
| DYNAMICGROUP | &quot;DynamicGroup&quot; |
| DYNAMICSCHEMA | &quot;DynamicSchema&quot; |
| EDGE | &quot;Edge&quot; |
| EDGEGROUP | &quot;EdgeGroup&quot; |
| EDGELOG | &quot;EdgeLog&quot; |
| EDGELOGZIP | &quot;EdgeLogZip&quot; |
| EDGEPCAPS | &quot;EdgePcaps&quot; |
| EDGEPREFERENCES | &quot;EdgePreferences&quot; |
| EDGETRACELEVEL | &quot;EdgeTraceLevel&quot; |
| EMERGENCYGROUP | &quot;EmergencyGroup&quot; |
| EVALUATION | &quot;Evaluation&quot; |
| EVALUATIONFORM | &quot;EvaluationForm&quot; |
| EVENTTYPE | &quot;EventType&quot; |
| EXPORTS | &quot;Exports&quot; |
| EXTENSION | &quot;Extension&quot; |
| EXTENSIONPOOL | &quot;ExtensionPool&quot; |
| EXTERNALMETRICSDATA | &quot;ExternalMetricsData&quot; |
| EXTERNALMETRICSDEFINITION | &quot;ExternalMetricsDefinition&quot; |
| EXTERNALORGANIZATIONSCHEMA | &quot;ExternalOrganizationSchema&quot; |
| FEEDBACK | &quot;Feedback&quot; |
| FLOW | &quot;Flow&quot; |
| FLOWMILESTONE | &quot;FlowMilestone&quot; |
| FLOWOUTCOME | &quot;FlowOutcome&quot; |
| FORECAST | &quot;Forecast&quot; |
| HISTORICALDATA | &quot;HistoricalData&quot; |
| INSIGHTSETTINGS | &quot;InsightSettings&quot; |
| INTEGRATION | &quot;Integration&quot; |
| IVR | &quot;IVR&quot; |
| KNOWLEDGEBASE | &quot;KnowledgeBase&quot; |
| KNOWLEDGECATEGORY | &quot;KnowledgeCategory&quot; |
| KNOWLEDGEDOCUMENT | &quot;KnowledgeDocument&quot; |
| KNOWLEDGEDOCUMENTVARIATION | &quot;KnowledgeDocumentVariation&quot; |
| KNOWLEDGESEARCHFEEDBACK | &quot;KnowledgeSearchFeedback&quot; |
| KNOWLEDGETRAINING | &quot;KnowledgeTraining&quot; |
| LINE | &quot;Line&quot; |
| LINEBASE | &quot;LineBase&quot; |
| LOCATION | &quot;Location&quot; |
| MANAGEMENTUNIT | &quot;ManagementUnit&quot; |
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; |
| MEDIADIAGNOSTICSTRACEFILE | &quot;MediaDiagnosticsTraceFile&quot; |
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; |
| METRIC | &quot;Metric&quot; |
| MODULE | &quot;Module&quot; |
| NUMBERORDER | &quot;NumberOrder&quot; |
| NUMBERPLAN | &quot;NumberPlan&quot; |
| OAUTHCLIENT | &quot;OAuthClient&quot; |
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; |
| ORGANIZATIONAUTHORIZATIONTRUST | &quot;OrganizationAuthorizationTrust&quot; |
| ORGANIZATIONAUTHORIZATIONUSERTRUST | &quot;OrganizationAuthorizationUserTrust&quot; |
| ORGANIZATIONFEATURE | &quot;OrganizationFeature&quot; |
| ORGANIZATIONINTEGRATIONSACCESS | &quot;OrganizationIntegrationsAccess&quot; |
| ORGANIZATIONSETTINGS | &quot;OrganizationSettings&quot; |
| ORPHANEDRECORDING | &quot;OrphanedRecording&quot; |
| OUTBOUNDROUTE | &quot;OutboundRoute&quot; |
| OUTCOME | &quot;Outcome&quot; |
| PCAPS | &quot;Pcaps&quot; |
| PHONE | &quot;Phone&quot; |
| PHONEBASE | &quot;PhoneBase&quot; |
| PLANNINGGROUP | &quot;PlanningGroup&quot; |
| POLICY | &quot;Policy&quot; |
| PREDICTOR | &quot;Predictor&quot; |
| PRODUCT | &quot;Product&quot; |
| PROFILE | &quot;Profile&quot; |
| PROFILEMEMBERS | &quot;ProfileMembers&quot; |
| PROGRAM | &quot;Program&quot; |
| PROMPT | &quot;Prompt&quot; |
| PROMPTRESOURCE | &quot;PromptResource&quot; |
| QUEUE | &quot;Queue&quot; |
| RECORDING | &quot;Recording&quot; |
| RECORDINGANNOTATION | &quot;RecordingAnnotation&quot; |
| RECORDINGSETTINGS | &quot;RecordingSettings&quot; |
| RESPONSE | &quot;Response&quot; |
| RESPONSEASSET | &quot;ResponseAsset&quot; |
| ROLE | &quot;Role&quot; |
| ROW | &quot;Row&quot; |
| ROUTINGTRANSCRIPTIONSETTINGS | &quot;RoutingTranscriptionSettings&quot; |
| ROUTINGUTILIZATIONTAG | &quot;RoutingUtilizationTag&quot; |
| RULE | &quot;Rule&quot; |
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
| SERVICEGOALTEMPLATE | &quot;ServiceGoalTemplate&quot; |
| SESSIONTYPE | &quot;SessionType&quot; |
| SHIFTTRADE | &quot;ShiftTrade&quot; |
| SITE | &quot;Site&quot; |
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; |
| STATUS | &quot;Status&quot; |
| SUPPORTEDCONTENT | &quot;SupportedContent&quot; |
| SUPPORTFILE | &quot;SupportFile&quot; |
| SURVEY | &quot;Survey&quot; |
| SURVEYFORM | &quot;SurveyForm&quot; |
| TEAM | &quot;Team&quot; |
| TIMEOFFLIMIT | &quot;TimeOffLimit&quot; |
| TIMEOFFPLAN | &quot;TimeOffPlan&quot; |
| TIMEOFFREQUEST | &quot;TimeOffRequest&quot; |
| TOPIC | &quot;Topic&quot; |
| TRANSCRIPTIONSETTINGS | &quot;TranscriptionSettings&quot; |
| TRIGGER | &quot;Trigger&quot; |
| TRUNK | &quot;Trunk&quot; |
| TRUNKBASE | &quot;TrunkBase&quot; |
| USER | &quot;User&quot; |
| USERPRESENCE | &quot;UserPresence&quot; |
| VOICEMAILPOLICY | &quot;VoicemailPolicy&quot; |
| VOICEMAILUSERPOLICY | &quot;VoicemailUserPolicy&quot; |
| WEBHOOK | &quot;Webhook&quot; |
| WORKBIN | &quot;Workbin&quot; |
| WORKITEM | &quot;Workitem&quot; |
| WORKPLAN | &quot;WorkPlan&quot; |
| WORKPLANROTATION | &quot;WorkPlanRotation&quot; |
| WORKSPACE | &quot;Workspace&quot; |
| WORKTYPE | &quot;Worktype&quot; |
| WRAPUPCODE | &quot;WrapupCode&quot; |
| WRAPUPCODEMAPPING | &quot;WrapUpCodeMapping&quot; |
| PARTICIPANT | &quot;Participant&quot; |
{: class="table table-striped"}



