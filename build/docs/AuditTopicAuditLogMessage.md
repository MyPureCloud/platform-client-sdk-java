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
| **level** | <!----><!---->**String**<!----> |  |  [optional] |
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
| LANGUAGEUNDERSTANDING | &quot;LanguageUnderstanding&quot; | 
| CONTENTMANAGEMENT | &quot;ContentManagement&quot; | 
| PEOPLEPERMISSIONS | &quot;PeoplePermissions&quot; | 
| PRESENCE | &quot;Presence&quot; | 
| ARCHITECT | &quot;Architect&quot; | 
| CONTACTCENTER | &quot;ContactCenter&quot; | 
| QUALITY | &quot;Quality&quot; | 
| SPEECHANDTEXTANALYTICS | &quot;SpeechAndTextAnalytics&quot; | 
| PREDICTIVEENGAGEMENT | &quot;PredictiveEngagement&quot; | 
| KNOWLEDGE | &quot;Knowledge&quot; | 
| COACHING | &quot;Coaching&quot; | 
| LEARNING | &quot;Learning&quot; | 
| EMPLOYEEENGAGEMENT | &quot;EmployeeEngagement&quot; | 
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; | 
| TRIGGERS | &quot;Triggers&quot; | 
| PROCESSAUTOMATION | &quot;ProcessAutomation&quot; | 
| RESPONSEMANAGEMENT | &quot;ResponseManagement&quot; | 
| GROUPS | &quot;Groups&quot; | 
| TELEPHONY | &quot;Telephony&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
| ROUTING | &quot;Routing&quot; | 
| GAMIFICATION | &quot;Gamification&quot; | 
| INTEGRATIONS | &quot;Integrations&quot; | 
| WEBHOOKS | &quot;Webhooks&quot; | 
| ANALYTICSREPORTING | &quot;AnalyticsReporting&quot; | 
| LIMITS | &quot;Limits&quot; | 
| EMPLOYEEPERFORMANCE | &quot;EmployeePerformance&quot; | 
| DATATABLES | &quot;Datatables&quot; | 
| MESSAGING | &quot;Messaging&quot; | 
| WEBDEPLOYMENTS | &quot;WebDeployments&quot; | 
| SUPPORTABILITY | &quot;Supportability&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| DIRECTORY | &quot;Directory&quot; | 
| EXTERNALCONTACTS | &quot;ExternalContacts&quot; | 
| TASKMANAGEMENT | &quot;TaskManagement&quot; | 
| SCIM | &quot;SCIM&quot; | 
| NUMBERPURCHASING | &quot;NumberPurchasing&quot; | 
| MARKETPLACE | &quot;Marketplace&quot; | 
| LOGCAPTURE | &quot;LogCapture&quot; | 
| GDPR | &quot;GDPR&quot; | 
| AGENTCONFIG | &quot;AgentConfig&quot; | 
| EMAILS | &quot;Emails&quot; | 
| SCRIPTER | &quot;Scripter&quot; | 
| BILLING | &quot;Billing&quot; | 
| JOURNEYANALYTICS | &quot;JourneyAnalytics&quot; | 
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VIEW | &quot;View&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 
| MOVE | &quot;Move&quot; | 
| COPY | &quot;Copy&quot; | 
| DOWNLOAD | &quot;Download&quot; | 
| SHAREADD | &quot;ShareAdd&quot; | 
| SHAREREMOVE | &quot;ShareRemove&quot; | 
| FAX | &quot;Fax&quot; | 
| VERSIONCREATE | &quot;VersionCreate&quot; | 
| TAGADD | &quot;TagAdd&quot; | 
| TAGREMOVE | &quot;TagRemove&quot; | 
| TAGUPDATE | &quot;TagUpdate&quot; | 
| ADD | &quot;Add&quot; | 
| REMOVE | &quot;Remove&quot; | 
| MEMBERADD | &quot;MemberAdd&quot; | 
| MEMBERUPDATE | &quot;MemberUpdate&quot; | 
| MEMBERREMOVE | &quot;MemberRemove&quot; | 
| AUTHORIZE | &quot;Authorize&quot; | 
| DEAUTHORIZE | &quot;Deauthorize&quot; | 
| AUTHENTICATE | &quot;Authenticate&quot; | 
| CHANGEPASSWORD | &quot;ChangePassword&quot; | 
| AUTHENTICATIONFAILED | &quot;AuthenticationFailed&quot; | 
| REVOKE | &quot;Revoke&quot; | 
| CHECKIN | &quot;Checkin&quot; | 
| CHECKOUT | &quot;Checkout&quot; | 
| DEACTIVATE | &quot;Deactivate&quot; | 
| DEBUG | &quot;Debug&quot; | 
| PUBLISH | &quot;Publish&quot; | 
| REVERT | &quot;Revert&quot; | 
| SAVE | &quot;Save&quot; | 
| TRANSCODE | &quot;Transcode&quot; | 
| UPLOAD | &quot;Upload&quot; | 
| WRAPUPCODEADD | &quot;WrapupCodeAdd&quot; | 
| WRAPUPCODEREMOVE | &quot;WrapupCodeRemove&quot; | 
| READ | &quot;Read&quot; | 
| EXECUTE | &quot;Execute&quot; | 
| ABANDON | &quot;Abandon&quot; | 
| ARCHIVE | &quot;Archive&quot; | 
| EXPORT | &quot;Export&quot; | 
| RESTOREREQUEST | &quot;RestoreRequest&quot; | 
| RESTORECOMPLETE | &quot;RestoreComplete&quot; | 
| UPDATERETENTION | &quot;UpdateRetention&quot; | 
| APPLYPROTECTION | &quot;ApplyProtection&quot; | 
| REVOKEPROTECTION | &quot;RevokeProtection&quot; | 
| ROTATE | &quot;Rotate&quot; | 
| DELETEALL | &quot;DeleteAll&quot; | 
| REASSIGN | &quot;Reassign&quot; | 
| UNARCHIVE | &quot;Unarchive&quot; | 
| ACTIVATE | &quot;Activate&quot; | 
| ASSIGN | &quot;Assign&quot; | 
| UNASSIGN | &quot;Unassign&quot; | 
| RESET | &quot;Reset&quot; | 
| RESCHEDULE | &quot;Reschedule&quot; | 
| UNPUBLISH | &quot;Unpublish&quot; | 
| PURGE | &quot;Purge&quot; | 
| PROCESSED | &quot;Processed&quot; | 
| ENABLE | &quot;Enable&quot; | 
| DISABLE | &quot;Disable&quot; | 
| RECYCLE | &quot;Recycle&quot; | 
| APPEND | &quot;Append&quot; | 
| RESTORE | &quot;Restore&quot; | 
| OPEN | &quot;Open&quot; | 
| APPROVED | &quot;Approved&quot; | 
| REJECTED | &quot;Rejected&quot; | 
| ROLLBACK | &quot;Rollback&quot; | 
| IMPLEMENTINGCHANGE | &quot;ImplementingChange&quot; | 
| CHANGEIMPLEMENTED | &quot;ChangeImplemented&quot; | 
| IMPLEMENTINGROLLBACK | &quot;ImplementingRollback&quot; | 
| ROLLBACKIMPLEMENTED | &quot;RollbackImplemented&quot; | 
| WRITE | &quot;Write&quot; | 
| REPLACE | &quot;Replace&quot; | 
| UPDATEINSERVICE | &quot;UpdateInService&quot; | 
| UPDATEOUTOFSERVICE | &quot;UpdateOutOfService&quot; | 
| CYCLE | &quot;Cycle&quot; | 
| SCALE | &quot;Scale&quot; | 
| IPALLOWLISTCLEAR | &quot;IpAllowlistClear&quot; | 
| ADDPAIRINGROLE | &quot;AddPairingRole&quot; | 
| VERIFY | &quot;Verify&quot; | 
| RESTOREDELETED | &quot;RestoreDeleted&quot; | 
| RESTOREALL | &quot;RestoreAll&quot; | 
| APPROVE | &quot;Approve&quot; | 
| REJECT | &quot;Reject&quot; | 
| REVERSE | &quot;Reverse&quot; | 
| CANCEL | &quot;Cancel&quot; | 
| HARDDELETE | &quot;HardDelete&quot; | 
| SOFTDELETE | &quot;SoftDelete&quot; | 
| ENABLECAPTURE | &quot;EnableCapture&quot; | 
| DOWNLOADCAPTURE | &quot;DownloadCapture&quot; | 
| INITIATE | &quot;Initiate&quot; | 
| REVERSEMANUALLY | &quot;ReverseManually&quot; | 
{: class="table table-striped"}


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FEEDBACK | &quot;Feedback&quot; | 
| DOCUMENT | &quot;Document&quot; | 
| WORKSPACE | &quot;Workspace&quot; | 
| TAG | &quot;Tag&quot; | 
| ACCESSTOKEN | &quot;AccessToken&quot; | 
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; | 
| AUTHORGANIZATION | &quot;AuthOrganization&quot; | 
| OAUTHCLIENT | &quot;OAuthClient&quot; | 
| AUTHUSER | &quot;AuthUser&quot; | 
| ORGANIZATIONAUTHORIZATIONTRUST | &quot;OrganizationAuthorizationTrust&quot; | 
| ORGANIZATIONAUTHORIZATIONUSERTRUST | &quot;OrganizationAuthorizationUserTrust&quot; | 
| ROLE | &quot;Role&quot; | 
| ROLESETTINGS | &quot;RoleSettings&quot; | 
| VOICEMAILUSERPOLICY | &quot;VoicemailUserPolicy&quot; | 
| USERPRESENCE | &quot;UserPresence&quot; | 
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; | 
| FLOW | &quot;Flow&quot; | 
| PROMPT | &quot;Prompt&quot; | 
| PROMPTRESOURCE | &quot;PromptResource&quot; | 
| FLOWOUTCOME | &quot;FlowOutcome&quot; | 
| FLOWMILESTONE | &quot;FlowMilestone&quot; | 
| GRAMMAR | &quot;Grammar&quot; | 
| GRAMMARLANGUAGE | &quot;GrammarLanguage&quot; | 
| AGENTROUTINGINFO | &quot;AgentRoutingInfo&quot; | 
| QUEUE | &quot;Queue&quot; | 
| WRAPUPCODE | &quot;WrapupCode&quot; | 
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; | 
| CONVERSATIONATTRIBUTES | &quot;ConversationAttributes&quot; | 
| ROUTINGUTILIZATIONTAG | &quot;RoutingUtilizationTag&quot; | 
| EVALUATION | &quot;Evaluation&quot; | 
| CALIBRATION | &quot;Calibration&quot; | 
| SURVEY | &quot;Survey&quot; | 
| EVALUATIONFORM | &quot;EvaluationForm&quot; | 
| SURVEYFORM | &quot;SurveyForm&quot; | 
| RECORDING | &quot;Recording&quot; | 
| SCREENRECORDING | &quot;ScreenRecording&quot; | 
| BULKACTIONS | &quot;BulkActions&quot; | 
| ORPHANEDRECORDING | &quot;OrphanedRecording&quot; | 
| POLICY | &quot;Policy&quot; | 
| RECORDINGANNOTATION | &quot;RecordingAnnotation&quot; | 
| RECORDINGSETTINGS | &quot;RecordingSettings&quot; | 
| RECORDINGKEY | &quot;RecordingKey&quot; | 
| RECORDINGKEYCONFIG | &quot;RecordingKeyConfig&quot; | 
| TOPIC | &quot;Topic&quot; | 
| PROGRAM | &quot;Program&quot; | 
| CATEGORY | &quot;Category&quot; | 
| SENTIMENTFEEDBACK | &quot;SentimentFeedback&quot; | 
| DICTIONARYFEEDBACK | &quot;DictionaryFeedback&quot; | 
| SEGMENT | &quot;Segment&quot; | 
| OUTCOME | &quot;Outcome&quot; | 
| ACTIONMAP | &quot;ActionMap&quot; | 
| ACTIONTEMPLATE | &quot;ActionTemplate&quot; | 
| CLICKSTREAMSETTINGS | &quot;ClickstreamSettings&quot; | 
| EVENTTYPE | &quot;EventType&quot; | 
| SESSIONTYPE | &quot;SessionType&quot; | 
| KNOWLEDGEBASE | &quot;KnowledgeBase&quot; | 
| KNOWLEDGECATEGORY | &quot;KnowledgeCategory&quot; | 
| KNOWLEDGECONTEXT | &quot;KnowledgeContext&quot; | 
| KNOWLEDGECONTEXTVALUE | &quot;KnowledgeContextValue&quot; | 
| KNOWLEDGEDOCUMENT | &quot;KnowledgeDocument&quot; | 
| KNOWLEDGEDOCUMENTVARIATION | &quot;KnowledgeDocumentVariation&quot; | 
| KNOWLEDGELABEL | &quot;KnowledgeLabel&quot; | 
| KNOWLEDGETRAINING | &quot;KnowledgeTraining&quot; | 
| KNOWLEDGESEARCHFEEDBACK | &quot;KnowledgeSearchFeedback&quot; | 
| TRANSCRIPTIONSETTINGS | &quot;TranscriptionSettings&quot; | 
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; | 
| APPOINTMENT | &quot;Appointment&quot; | 
| ANNOTATION | &quot;Annotation&quot; | 
| ORGANIZATION | &quot;Organization&quot; | 
| MODULE | &quot;Module&quot; | 
| RULE | &quot;Rule&quot; | 
| ASSIGNMENT | &quot;Assignment&quot; | 
| RECOGNITION | &quot;Recognition&quot; | 
| ACTIVITYCODE | &quot;ActivityCode&quot; | 
| ADHERENCEEXPLANATION | &quot;AdherenceExplanation&quot; | 
| ALTERNATIVESHIFT | &quot;AlternativeShift&quot; | 
| BUSINESSUNIT | &quot;BusinessUnit&quot; | 
| FORECAST | &quot;Forecast&quot; | 
| MANAGEMENTUNIT | &quot;ManagementUnit&quot; | 
| PLANNINGGROUP | &quot;PlanningGroup&quot; | 
| SCHEDULE | &quot;Schedule&quot; | 
| SERVICEGOALTEMPLATE | &quot;ServiceGoalTemplate&quot; | 
| SHIFTTRADE | &quot;ShiftTrade&quot; | 
| TIMEOFFLIMIT | &quot;TimeOffLimit&quot; | 
| TIMEOFFPLAN | &quot;TimeOffPlan&quot; | 
| TIMEOFFREQUEST | &quot;TimeOffRequest&quot; | 
| WORKPLAN | &quot;WorkPlan&quot; | 
| WORKPLANROTATION | &quot;WorkPlanRotation&quot; | 
| HISTORICALDATA | &quot;HistoricalData&quot; | 
| STAFFINGGROUP | &quot;StaffingGroup&quot; | 
| TRIGGER | &quot;Trigger&quot; | 
| RESPONSE | &quot;Response&quot; | 
| RESPONSEASSET | &quot;ResponseAsset&quot; | 
| SKILLGROUP | &quot;SkillGroup&quot; | 
| DIRECTORYGROUP | &quot;DirectoryGroup&quot; | 
| TEAM | &quot;Team&quot; | 
| SKILLGROUPDEFINITION | &quot;SkillGroupDefinition&quot; | 
| EDGE | &quot;Edge&quot; | 
| EDGEGROUP | &quot;EdgeGroup&quot; | 
| VOICEMAILPOLICY | &quot;VoicemailPolicy&quot; | 
| ROUTINGTRANSCRIPTIONSETTINGS | &quot;RoutingTranscriptionSettings&quot; | 
| TRUNK | &quot;Trunk&quot; | 
| TRUNKBASE | &quot;TrunkBase&quot; | 
| SCHEDULEGROUP | &quot;ScheduleGroup&quot; | 
| EMERGENCYGROUP | &quot;EmergencyGroup&quot; | 
| IVR | &quot;IVR&quot; | 
| DID | &quot;DID&quot; | 
| DIDPOOL | &quot;DIDPool&quot; | 
| EXTENSION | &quot;Extension&quot; | 
| EXTENSIONPOOL | &quot;ExtensionPool&quot; | 
| PHONE | &quot;Phone&quot; | 
| PHONEBASE | &quot;PhoneBase&quot; | 
| LINE | &quot;Line&quot; | 
| LINEBASE | &quot;LineBase&quot; | 
| OUTBOUNDROUTE | &quot;OutboundRoute&quot; | 
| NUMBERPLAN | &quot;NumberPlan&quot; | 
| SITE | &quot;Site&quot; | 
| ATTEMPTLIMITS | &quot;AttemptLimits&quot; | 
| CALLABLETIMESET | &quot;CallableTimeSet&quot; | 
| CAMPAIGN | &quot;Campaign&quot; | 
| CAMPAIGNRULE | &quot;CampaignRule&quot; | 
| CAMPAIGNSCHEDULE | &quot;CampaignSchedule&quot; | 
| SEQUENCE | &quot;Sequence&quot; | 
| SEQUENCESCHEDULE | &quot;SequenceSchedule&quot; | 
| CONTACTLIST | &quot;ContactList&quot; | 
| CONTACTLISTFILTER | &quot;ContactListFilter&quot; | 
| CONTACTLISTTEMPLATE | &quot;ContactListTemplate&quot; | 
| DIGITALRULESET | &quot;DigitalRuleSet&quot; | 
| DNCLIST | &quot;DNCList&quot; | 
| FILESPECIFICATIONTEMPLATE | &quot;FileSpecificationTemplate&quot; | 
| IMPORTTEMPLATE | &quot;ImportTemplate&quot; | 
| ORGANIZATIONSETTINGS | &quot;OrganizationSettings&quot; | 
| CALLANALYSISRESPONSESET | &quot;CallAnalysisResponseSet&quot; | 
| RULESET | &quot;RuleSet&quot; | 
| WRAPUPCODEMAPPING | &quot;WrapUpCodeMapping&quot; | 
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; | 
| MESSAGINGCAMPAIGNSCHEDULE | &quot;MessagingCampaignSchedule&quot; | 
| EMAILCAMPAIGNSCHEDULE | &quot;EmailCampaignSchedule&quot; | 
| PREDICTOR | &quot;Predictor&quot; | 
| KPISPECIFICATION | &quot;KpiSpecification&quot; | 
| METRIC | &quot;Metric&quot; | 
| STATUS | &quot;Status&quot; | 
| PROFILE | &quot;Profile&quot; | 
| PROFILEMEMBERS | &quot;ProfileMembers&quot; | 
| ACTION | &quot;Action&quot; | 
| ACTIONDRAFT | &quot;ActionDraft&quot; | 
| INTEGRATION | &quot;Integration&quot; | 
| WEBHOOK | &quot;Webhook&quot; | 
| DASHBOARDSETTINGS | &quot;DashboardSettings&quot; | 
| INSIGHTSETTINGS | &quot;InsightSettings&quot; | 
| ANALYTICSREPORTINGSETTINGS | &quot;AnalyticsReportingSettings&quot; | 
| SCHEDULEDEXPORTS | &quot;ScheduledExports&quot; | 
| EXPORTS | &quot;Exports&quot; | 
| CHANGEREQUEST | &quot;ChangeRequest&quot; | 
| MIGRATION | &quot;Migration&quot; | 
| EXTERNALMETRICSDEFINITION | &quot;ExternalMetricsDefinition&quot; | 
| EXTERNALMETRICSDATA | &quot;ExternalMetricsData&quot; | 
| SCHEMA | &quot;Schema&quot; | 
| ROW | &quot;Row&quot; | 
| BULK | &quot;Bulk&quot; | 
| SUPPORTEDCONTENT | &quot;SupportedContent&quot; | 
| CONVERSATIONPHONENUMBER | &quot;ConversationPhoneNumber&quot; | 
| CONVERSATIONRECIPIENT | &quot;ConversationRecipient&quot; | 
| CONVERSATIONACCOUNT | &quot;ConversationAccount&quot; | 
| CONVERSATIONDEFAULTSUPPORTEDCONTENT | &quot;ConversationDefaultSupportedContent&quot; | 
| CONVERSATIONTHREADINGWINDOW | &quot;ConversationThreadingWindow&quot; | 
| DEPLOYMENT | &quot;Deployment&quot; | 
| CONFIGURATION | &quot;Configuration&quot; | 
| CONFIGURATIONVERSION | &quot;ConfigurationVersion&quot; | 
| EDGEPREFERENCES | &quot;EdgePreferences&quot; | 
| EDGETRACELEVEL | &quot;EdgeTraceLevel&quot; | 
| ORGANIZATIONINTEGRATIONSACCESS | &quot;OrganizationIntegrationsAccess&quot; | 
| SUPPORTFILE | &quot;SupportFile&quot; | 
| EDGELOGZIP | &quot;EdgeLogZip&quot; | 
| PCAPS | &quot;Pcaps&quot; | 
| MEDIADIAGNOSTICSTRACEFILE | &quot;MediaDiagnosticsTraceFile&quot; | 
| EDGEPCAPS | &quot;EdgePcaps&quot; | 
| EDGELOG | &quot;EdgeLog&quot; | 
| ORGANIZATIONFEATURE | &quot;OrganizationFeature&quot; | 
| PRODUCT | &quot;Product&quot; | 
| USER | &quot;User&quot; | 
| LOCATION | &quot;Location&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
| ORGANIZATIONSUSPENSION | &quot;OrganizationSuspension&quot; | 
| PARTICIPANT | &quot;Participant&quot; | 
| CONTACTSCHEMA | &quot;ContactSchema&quot; | 
| EXTERNALORGANIZATIONSCHEMA | &quot;ExternalOrganizationSchema&quot; | 
| WORKBIN | &quot;Workbin&quot; | 
| WORKTYPE | &quot;Worktype&quot; | 
| CREDENTIAL | &quot;Credential&quot; | 
| NUMBERORDER | &quot;NumberOrder&quot; | 
| ENTERPRISEAGREEMENT | &quot;EnterpriseAgreement&quot; | 
| GDPRREQUEST | &quot;GdprRequest&quot; | 
| DEFAULTPANELSETTINGS | &quot;DefaultPanelSettings&quot; | 
| INBOUNDDOMAIN | &quot;InboundDomain&quot; | 
| OUTBOUNDDOMAIN | &quot;OutboundDomain&quot; | 
| INBOUNDROUTE | &quot;InboundRoute&quot; | 
| ORGANIZATIONLIMITS | &quot;OrganizationLimits&quot; | 
| USERSKILL | &quot;UserSkill&quot; | 
| USERLANGUAGE | &quot;UserLanguage&quot; | 
| COMPOSERPAGE | &quot;ComposerPage&quot; | 
| COMPOSERPUBLISHEDSCRIPT | &quot;ComposerPublishedScript&quot; | 
| COMPOSERSCRIPT | &quot;ComposerScript&quot; | 
| COMPOSERTEMPLATE | &quot;ComposerTemplate&quot; | 
| INTENTMINER | &quot;IntentMiner&quot; | 
| TOPICMINER | &quot;TopicMiner&quot; | 
| SOFTSUSPENSION | &quot;SoftSuspension&quot; | 
| ACTIVITYPLAN | &quot;ActivityPlan&quot; | 
| ACTIVITYPLANOCCURRENCE | &quot;ActivityPlanOccurrence&quot; | 
| JOURNEYVIEW | &quot;JourneyView&quot; | 
| ALTERNATIVESHIFTTRADE | &quot;AlternativeShiftTrade&quot; | 
{: class="table table-striped"}



