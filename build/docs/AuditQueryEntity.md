---
title: AuditQueryEntity
---
## AuditQueryEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**NameEnum**](#NameEnum)<!----> | Name of the Entity |  [optional] |
| **actions** | <!---->[**List&lt;ActionsEnum&gt;**](#ActionsEnum)<!----> | List of Actions |  [optional] |
{: class="table table-striped"}


<a name="NameEnum"></a>

## Enum: NameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACCESSTOKEN | &quot;AccessToken&quot; |
| ACTIONMAP | &quot;ActionMap&quot; |
| ACTIONTEMPLATE | &quot;ActionTemplate&quot; |
| ANNOTATION | &quot;Annotation&quot; |
| APPOINTMENT | &quot;Appointment&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
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
| CONVERSATIONACCOUNT | &quot;ConversationAccount&quot; |
| CONVERSATIONDEFAULTSUPPORTEDCONTENT | &quot;ConversationDefaultSupportedContent&quot; |
| CONVERSATIONPHONENUMBER | &quot;ConversationPhoneNumber&quot; |
| CONVERSATIONRECIPIENT | &quot;ConversationRecipient&quot; |
| CONVERSATIONTHREADINGWINDOW | &quot;ConversationThreadingWindow&quot; |
| DASHBOARDSETTINGS | &quot;DashboardSettings&quot; |
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; |
| DEPLOYMENT | &quot;Deployment&quot; |
| DID | &quot;DID&quot; |
| DIDPOOL | &quot;DIDPool&quot; |
| DNCLIST | &quot;DNCList&quot; |
| DOCUMENT | &quot;Document&quot; |
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
| KNOWLEDGESEARCHFEEDBACK | &quot;KnowledgeSearchFeedback&quot; |
| KNOWLEDGETRAINING | &quot;KnowledgeTraining&quot; |
| LINE | &quot;Line&quot; |
| LINEBASE | &quot;LineBase&quot; |
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; |
| MEDIADIAGNOSTICSTRACEFILE | &quot;MediaDiagnosticsTraceFile&quot; |
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; |
| METRIC | &quot;Metric&quot; |
| MODULE | &quot;Module&quot; |
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
| POLICY | &quot;Policy&quot; |
| PREDICTOR | &quot;Predictor&quot; |
| PRODUCT | &quot;Product&quot; |
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
| SESSIONTYPE | &quot;SessionType&quot; |
| SITE | &quot;Site&quot; |
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; |
| STATUS | &quot;Status&quot; |
| SUPPORTEDCONTENT | &quot;SupportedContent&quot; |
| SUPPORTFILE | &quot;SupportFile&quot; |
| SURVEY | &quot;Survey&quot; |
| SURVEYFORM | &quot;SurveyForm&quot; |
| TEAM | &quot;Team&quot; |
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
| WORKPLAN | &quot;WorkPlan&quot; |
| WORKSPACE | &quot;Workspace&quot; |
| WRAPUPCODE | &quot;WrapupCode&quot; |
| WRAPUPCODEMAPPING | &quot;WrapUpCodeMapping&quot; |
{: class="table table-striped"}


<a name="ActionsEnum"></a>

## Enum: ActionsEnum

| Name | Value |
| ---- | ----- |
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
{: class="table table-striped"}



