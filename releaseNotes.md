Platform API version: 5828


# Major Changes (18 changes)

**/api/v2/gamification/profiles/{performanceProfileId}/members/validate** (1 change)

* Path /api/v2/gamification/profiles/{performanceProfileId}/members/validate was removed

**/api/v2/gamification/profiles/{performanceProfileId}/members** (1 change)

* Path /api/v2/gamification/profiles/{performanceProfileId}/members was removed

**GET /api/v2/gamification/profiles/{profileId}/metrics** (1 change)

* Parameter metricIds was added

**PUT /api/v2/routing/sms/phonenumbers/{addressId}** (2 changes)

* Parameter async was removed
* Response 501 was removed

**DELETE /api/v2/routing/sms/phonenumbers/{addressId}** (2 changes)

* Parameter async was removed
* Response 501 was removed

**POST /api/v2/routing/sms/phonenumbers** (2 changes)

* Parameter async was removed
* Response 501 was removed

**MediaParticipantRequest** (1 change)

* Property wrapup was changed from Wrapup to ExtendedWrapup

**Survey** (1 change)

* Property conversation was changed from Conversation to ConversationReference

**ScimPhoneNumber** (1 change)

* Enum value ringcentral was removed from property type

**UCIntegration** (2 changes)

* Enum value RingCentral was removed from property integrationPresenceSource
* Required property badgeIcons was added

**UserSearchRequest** (1 change)

* Enum value RingCentral was removed from property integrationPresenceSource

**UserScheduleAdherence** (3 changes)

* Property businessUnit was changed from BusinessUnit to BusinessUnitReference
* Property managementUnit was changed from ManagementUnit to ManagementUnitReference
* Property team was changed from Team to TeamReference


# Minor Changes (118 changes)

**/api/v2/conversations/calls/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/callbacks/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/chats/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/cobrowsesessions/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/emails/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/messages/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/screenshares/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/socials/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/conversations/videos/{conversationId}/recordingstate** (2 changes)

* Path was added
* Operation PUT was added

**/api/v2/gamification/profiles/{profileId}/members** (3 changes)

* Path was added
* Operation GET was added
* Operation POST was added

**/api/v2/gamification/profiles/{profileId}/members/validate** (2 changes)

* Path was added
* Operation POST was added

**Condition** (1 change)

* Enum value systemDispositionCondition was added to property type

**ReportingTurnAction** (1 change)

* Enum value ShowKnowledgeArticleAction was added to property actionType

**ViewFilter** (7 changes)

* Optional property hasFax was added
* Optional property dataActionIds was added
* Optional property actionCategoryName was added
* Optional property responseStatuses was added
* Optional property availableDashboard was added
* Optional property favouriteDashboard was added
* Optional property myDashboard was added

**ReportingExportJobResponse** (8 changes)

* Enum value DATA_ACTIONS_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value DATA_ACTIONS_PERFORMANCE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_TIMELINE_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_TIMELINE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_LOGIN_LOGOUT_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_LOGIN_LOGOUT_DETAIL_VIEW was added to property viewType
* Enum value CAMPAIGN_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value CAMPAIGN_PERFORMANCE_DETAIL_VIEW was added to property viewType

**ReportingExportMetadataJobResponse** (8 changes)

* Enum value DATA_ACTIONS_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value DATA_ACTIONS_PERFORMANCE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_TIMELINE_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_TIMELINE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_LOGIN_LOGOUT_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_LOGIN_LOGOUT_DETAIL_VIEW was added to property viewType
* Enum value CAMPAIGN_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value CAMPAIGN_PERFORMANCE_DETAIL_VIEW was added to property viewType

**ReportingExportJobRequest** (8 changes)

* Enum value DATA_ACTIONS_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value DATA_ACTIONS_PERFORMANCE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_TIMELINE_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_TIMELINE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_LOGIN_LOGOUT_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_LOGIN_LOGOUT_DETAIL_VIEW was added to property viewType
* Enum value CAMPAIGN_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value CAMPAIGN_PERFORMANCE_DETAIL_VIEW was added to property viewType

**AuditLogMessage** (1 change)

* Enum value Unarchive was added to property action

**AuditQueryEntity** (1 change)

* Enum value Unarchive was added to property actions

**DataSchema** (1 change)

* Enum value WORKITEM was added to property appliesTo

**Call** (1 change)

* Optional property initialState was added

**Callback** (1 change)

* Optional property initialState was added

**Cobrowsesession** (1 change)

* Optional property initialState was added

**ConversationChat** (1 change)

* Optional property initialState was added

**ConversationMessageMetadata** (1 change)

* Model was added

**ConversationMessageMetadataContent** (1 change)

* Model was added

**ConversationMessageMetadataEvent** (1 change)

* Model was added

**ConversationReference** (2 changes)

* id is no longer readonly
* selfUri is no longer readonly

**Email** (1 change)

* Optional property initialState was added

**Message** (1 change)

* Optional property initialState was added

**MessageDetails** (1 change)

* Optional property messageMetadata was added

**Screenshare** (1 change)

* Optional property initialState was added

**Video** (1 change)

* Optional property initialState was added

**SetRecordingState** (1 change)

* Model was added

**ExtendedWrapup** (1 change)

* Model was added

**ConversationMessageContent** (5 changes)

* Enum value ListTemplate was added to property contentType
* Enum value Postback was added to property contentType
* Enum value Reactions was added to property contentType
* Enum value Mention was added to property contentType
* Enum value Unknown was added to property contentType

**ConversationNormalizedMessage** (1 change)

* Enum value Unknown was added to property type

**CallBasic** (1 change)

* Optional property initialState was added

**CallbackBasic** (1 change)

* Optional property initialState was added

**ColumnDataTypeSpecification** (1 change)

* Model was added

**EventLog** (1 change)

* Enum value DIGITAL_RULE was added to property category

**EventMessage** (4 changes)

* Enum value DIGITAL_RULE_EVALUATION_FAILED was added to property code
* Enum value DIGITAL_RULE_INTERNAL_ERROR was added to property code
* Enum value DIGITAL_RULE_NO_DNC_LISTS_CONFIGURED was added to property code
* Enum value DIGITAL_RULE_UPDATED_CONTACT_ADDRESS was added to property code

**MetricDefinition** (2 changes)

* Optional property mediaTypeFilteringAllowed was added
* Optional property queueFilteringAllowed was added

**KnowledgeImport** (1 change)

* Enum value Json was added to property fileType

**TranscriptionSettings** (1 change)

* Optional property lowLatencyTranscriptionEnabled was added

**KeyPerformanceIndicator** (1 change)

* Optional property optimizationType was added

**ScimPhoneNumber** (1 change)

* Enum value eighbyeight was added to property type

**GeneralProgramJobRequest** (2 changes)

* Enum value nl-NL was added to property dialect
* Enum value ko-KR was added to property dialect

**Format** (11 changes)

* Enum value CaseArticle was added to property flags
* Enum value CaseAccusative was added to property flags
* Enum value CaseDative was added to property flags
* Enum value CaseGenitive was added to property flags
* Enum value CaseNominative was added to property flags
* Enum value QuantityPlural was added to property flags
* Enum value QuantitySingular was added to property flags
* Enum value GenderCommon was added to property flags
* Enum value GenderFeminine was added to property flags
* Enum value GenderMasculine was added to property flags
* Enum value GenderNeuter was added to property flags

**UCIntegration** (1 change)

* Enum value EightByEight was added to property integrationPresenceSource

**UserSearchRequest** (1 change)

* Enum value EightByEight was added to property integrationPresenceSource

**Dependency** (1 change)

* Enum value IMAGE was added to property type

**DependencyObject** (1 change)

* Enum value IMAGE was added to property type

**MessengerHomeScreen** (1 change)

* Optional property logoUrl was added

**SupportCenterFeedbackSettings** (1 change)

* Model was added

**SupportCenterSettings** (1 change)

* Optional property feedback was added

**LearningCoverArtThumbnail** (1 change)

* Model was added

**LearningModuleCoverArtResponse** (1 change)

* Optional property thumbnails was added

**TeamReference** (1 change)

* Model was added


# Point Changes (15 changes)

**GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories** (1 change)

* Description was changed for parameter limit

**GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/documents** (1 change)

* Description was changed for parameter limit

**GET /api/v2/knowledge/knowledgebases** (1 change)

* Description was changed for parameter limit

**GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/trainings** (1 change)

* Description was changed for parameter limit

**GET /api/v2/routing/assessments** (1 change)

* Description was changed for parameter limit

**PUT /api/v2/routing/sms/phonenumbers/{addressId}** (1 change)

* Response 202 was changed from Accepted - If async is true, the phone number update is in progress. to Accepted - The phone number update is in progress.

**DELETE /api/v2/routing/sms/phonenumbers/{addressId}** (1 change)

* Response 202 was changed from Accepted - If async is true, the phone number delete is in progress. to Accepted -The phone number delete is in progress.

**POST /api/v2/routing/sms/phonenumbers** (1 change)

* Response 202 was changed from Accepted - If async is true, the phone number create is in progress. to Accepted - the phone number create is in progress.

**GET /api/v2/routing/predictors** (1 change)

* Description was changed for parameter limit

**POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/agentschedules/search** (2 changes)

* Description was changed for parameter forceAsync
* Description was changed for parameter forceDownloadService

**POST /api/v2/workforcemanagement/businessunits/{businessUnitId}/weeks/{weekId}/schedules/{scheduleId}/agentschedules/query** (2 changes)

* Description was changed for parameter forceAsync
* Description was changed for parameter forceDownloadService

**POST /api/v2/workforcemanagement/managementunits/{managementUnitId}/agentschedules/search** (2 changes)

* Description was changed for parameter forceAsync
* Description was changed for parameter forceDownloadService
