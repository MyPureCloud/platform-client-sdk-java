---
title: EntityChange
---
## EntityChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityId** | <!----><!---->**String**<!----> | Id of the entity that was changed |  [optional] |
| **entityName** | <!----><!---->**String**<!----> | Name of the entity that was changed |  [optional] |
| **entityType** | [**EntityTypeEnum**](#EntityTypeEnum)<!----> | Type of the entity that was changed |  [optional] |
| **oldValues** | <!----><!---->**List&lt;String&gt;**<!----> | Previous values for the entity. |  [optional] |
| **newValues** | <!----><!---->**List&lt;String&gt;**<!----> | New values for the entity. |  [optional] |
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
| ADHERENCEEXPLANATION | &quot;AdherenceExplanation&quot; | 
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
| DEFAULTPANELSETTINGS | &quot;DefaultPanelSettings&quot; | 
| DEPENDENCYTRACKINGBUILD | &quot;DependencyTrackingBuild&quot; | 
| DEPLOYMENT | &quot;Deployment&quot; | 
| DID | &quot;DID&quot; | 
| DIDPOOL | &quot;DIDPool&quot; | 
| DIGITALRULESET | &quot;DigitalRuleSet&quot; | 
| DIRECTORYGROUP | &quot;DirectoryGroup&quot; | 
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
| EMAILCAMPAIGNSCHEDULE | &quot;EmailCampaignSchedule&quot; | 
| EMERGENCYGROUP | &quot;EmergencyGroup&quot; | 
| ENTERPRISEAGREEMENT | &quot;EnterpriseAgreement&quot; | 
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
| GDPRREQUEST | &quot;GdprRequest&quot; | 
| GROUP | &quot;Group&quot; | 
| HISTORICALDATA | &quot;HistoricalData&quot; | 
| INBOUNDDOMAIN | &quot;InboundDomain&quot; | 
| INBOUNDROUTE | &quot;InboundRoute&quot; | 
| INSIGHTSETTINGS | &quot;InsightSettings&quot; | 
| INTEGRATION | &quot;Integration&quot; | 
| IVR | &quot;IVR&quot; | 
| KNOWLEDGEBASE | &quot;KnowledgeBase&quot; | 
| KNOWLEDGECATEGORY | &quot;KnowledgeCategory&quot; | 
| KNOWLEDGEDOCUMENT | &quot;KnowledgeDocument&quot; | 
| KNOWLEDGEDOCUMENTVARIATION | &quot;KnowledgeDocumentVariation&quot; | 
| KNOWLEDGELABEL | &quot;KnowledgeLabel&quot; | 
| KNOWLEDGESEARCHFEEDBACK | &quot;KnowledgeSearchFeedback&quot; | 
| KNOWLEDGETRAINING | &quot;KnowledgeTraining&quot; | 
| LINE | &quot;Line&quot; | 
| LINEBASE | &quot;LineBase&quot; | 
| LOCATION | &quot;Location&quot; | 
| MANAGEMENTUNIT | &quot;ManagementUnit&quot; | 
| MAXORGROUTINGUTILIZATIONCAPACITY | &quot;MaxOrgRoutingUtilizationCapacity&quot; | 
| MEDIADIAGNOSTICSTRACEFILE | &quot;MediaDiagnosticsTraceFile&quot; | 
| MESSAGINGCAMPAIGN | &quot;MessagingCampaign&quot; | 
| MESSAGINGCAMPAIGNSCHEDULE | &quot;MessagingCampaignSchedule&quot; | 
| METRIC | &quot;Metric&quot; | 
| MODULE | &quot;Module&quot; | 
| NUMBERORDER | &quot;NumberOrder&quot; | 
| NUMBERPLAN | &quot;NumberPlan&quot; | 
| OAUTHCLIENT | &quot;OAuthClient&quot; | 
| OAUTHCLIENTAUTHORIZATION | &quot;OAuthClientAuthorization&quot; | 
| ORGANIZATION | &quot;Organization&quot; | 
| ORGANIZATIONAUTHORIZATIONTRUST | &quot;OrganizationAuthorizationTrust&quot; | 
| ORGANIZATIONAUTHORIZATIONUSERTRUST | &quot;OrganizationAuthorizationUserTrust&quot; | 
| ORGANIZATIONFEATURE | &quot;OrganizationFeature&quot; | 
| ORGANIZATIONINTEGRATIONSACCESS | &quot;OrganizationIntegrationsAccess&quot; | 
| ORGANIZATIONLIMITS | &quot;OrganizationLimits&quot; | 
| ORGANIZATIONSETTINGS | &quot;OrganizationSettings&quot; | 
| ORPHANEDRECORDING | &quot;OrphanedRecording&quot; | 
| OUTBOUNDDOMAIN | &quot;OutboundDomain&quot; | 
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
| PUBLIC | &quot;Public&quot; | 
| QUEUE | &quot;Queue&quot; | 
| RECORDING | &quot;Recording&quot; | 
| RECORDINGANNOTATION | &quot;RecordingAnnotation&quot; | 
| RECORDINGKEY | &quot;RecordingKey&quot; | 
| RECORDINGKEYCONFIG | &quot;RecordingKeyConfig&quot; | 
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
| SKILLSGROUP | &quot;SkillsGroup&quot; | 
| SPEECHTEXTANALYTICSSETTINGS | &quot;SpeechTextAnalyticsSettings&quot; | 
| STATUS | &quot;Status&quot; | 
| SUPPORTEDCONTENT | &quot;SupportedContent&quot; | 
| SUPPORTFILE | &quot;SupportFile&quot; | 
| SURVEY | &quot;Survey&quot; | 
| SURVEYFORM | &quot;SurveyForm&quot; | 
| TAG | &quot;Tag&quot; | 
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



