Platform API version: 8336




# Major Changes (54 changes)

**/api/v2/conversations/messaging/stickers/{messengerType}** (1 change)

* Path /api/v2/conversations/messaging/stickers/{messengerType} was removed

**/api/v2/outbound/audits** (1 change)

* Path /api/v2/outbound/audits was removed

**/api/v2/workforcemanagement/adhocmodelingjobs/{jobId}** (1 change)

* Path /api/v2/workforcemanagement/adhocmodelingjobs/{jobId} was removed

**GET /api/v2/audits/query/{transactionId}/results** (1 change)

* Parameter allowRedirect was added

**POST /api/v2/externalcontacts/identifierlookup** (1 change)

* Parameter expand was added

**POST /api/v2/conversations/messages** (1 change)

* Response 200 type was changed from MessageConversation to CreateOutboundMessagingConversationResponse

**GET /api/v2/journey/sessions/{sessionId}/events** (1 change)

* Parameter eventType was added

**GET /api/v2/quality/evaluations/query** (2 changes)

* Parameter sortBy was removed
* Parameter nextPage was removed

**PATCH /api/v2/recordings/screensessions/{recordingSessionId}** (1 change)

* Has been deprecated

**GET /api/v2/routing/sms/phonenumbers** (1 change)

* Parameter supportedContent.id was added

**GET /api/v2/userrecordings/{recordingId}/media** (1 change)

* Has been deprecated

**POST /api/v2/taskmanagement/workbins** (1 change)

* Parameter body was made required

**PATCH /api/v2/taskmanagement/worktypes/{worktypeId}/statuses/{statusId}** (1 change)

* Parameter body was made required

**POST /api/v2/taskmanagement/worktypes/{worktypeId}/statuses** (1 change)

* Parameter body was made required

**PATCH /api/v2/taskmanagement/worktypes/{worktypeId}** (1 change)

* Parameter body was made required

**POST /api/v2/taskmanagement/worktypes** (1 change)

* Parameter body was made required

**GET /api/v2/journey/views** (5 changes)

* Parameter pageNumber was added
* Parameter pageSize was added
* Parameter nameOrCreatedBy was added
* Parameter expand was added
* Response 200 type was changed from AddressableEntityListing to JourneyViewListing

**GET /api/v2/knowledge/knowledgebases/{knowledgeBaseId}/operations** (1 change)

* Parameter sourceId was added

**GET /api/v2/taskmanagement/worktypes/{worktypeId}/history** (1 change)

* Parameter fields was added

**MessagingSticker** (1 change)

* Model MessagingSticker was removed

**MessagingStickerEntityListing** (1 change)

* Model MessagingStickerEntityListing was removed

**AuditEntity** (1 change)

* Model AuditEntity was removed

**AuditMessage** (1 change)

* Model AuditMessage was removed

**AuditSearchResult** (1 change)

* Model AuditSearchResult was removed

**AuditUser** (1 change)

* Model AuditUser was removed

**Change** (1 change)

* Model Change was removed

**Entry** (1 change)

* Model Entry was removed

**FacetInfo** (1 change)

* Model FacetInfo was removed

**ServiceContext** (1 change)

* Model ServiceContext was removed

**AuditFacet** (1 change)

* Model AuditFacet was removed

**AuditFilter** (1 change)

* Model AuditFilter was removed

**DialerAuditRequest** (1 change)

* Model DialerAuditRequest was removed

**ModelingProcessingError** (1 change)

* Model ModelingProcessingError was removed

**ModelingStatusResponse** (1 change)

* Model ModelingStatusResponse was removed

**AddressableEntityListing** (1 change)

* Model AddressableEntityListing was removed

**AiScoringSettings** (2 changes)

* Property enabled was removed
* Property prompt was removed

**MessageData** (1 change)

* Enum value line was removed from property messengerType

**MessagingIntegration** (1 change)

* Enum value line was removed from property messengerType

**ConversationThreadingWindowSetting** (1 change)

* Enum value line was removed from property messengerType

**FieldConfig** (1 change)

* Enum value externalContact was removed from property entityType

**Miner** (1 change)

* Enum value nl-nl was removed from property language

**Recipient** (1 change)

* Enum value line was removed from property messengerType

**KeyPerformanceIndicator** (1 change)

* Enum value NumberOfTransfers was removed from property kpiType

**EngineIntegration** (1 change)

* Property name was removed

**FieldConfigs** (1 change)

* Property externalContact was removed

**ActivityCodeReference** (2 changes)

* Property name was removed
* Property secondaryPresences was removed

**UserScheduleAdherence** (1 change)

* Property scheduledActivityCode was changed from ActivityCodeReference to ActivityCodeSummary


# Minor Changes (633 changes)

**/api/v2/users/agentui/agents/autoanswer/{agentId}/settings** (5 changes)

* Path was added
* Operation GET was added
* Operation PUT was added
* Operation DELETE was added
* Operation PATCH was added

**/api/v2/analytics/reporting/settings/dashboards/query** (1 change)

* Operation get was added. Summary: Get list of dashboard configurations

**GET /api/v2/audits/query/{transactionId}/results** (1 change)

* Response 302 was added

**POST /api/v2/conversations/calls** (1 change)

* Response 202 was added

**/api/v2/conversations/emails/{conversationId}/reconnect** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/conversations/{conversationId}/suggestions/feedback** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/conversations/{conversationId}/suggestions** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/conversations/{conversationId}/suggestions/{suggestionId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/conversations/{conversationId}/suggestions/{suggestionId}/engagement** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/outbound/campaigns/{campaignId}** (1 change)

* Operation patch was added. Summary: Update a campaign.

**/api/v2/outbound/contactlists/{contactListId}/contacts/bulk/jobs** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/outbound/contactlists/{contactListId}/contacts/bulk/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/integrations/actions/certificates/truststore** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/organizations/limits/namespaces/{namespaceName}/limits/{limitName}/counts** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/organizations/limits/namespaces/{namespaceName}/counts** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/journey/deployments/{deploymentId}/webevents** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/routing/directroutingbackup/settings/me** (4 changes)

* Path was added
* Operation GET was added
* Operation PUT was added
* Operation DELETE was added

**/api/v2/routing/users/{userId}/directroutingbackup/settings** (4 changes)

* Path was added
* Operation GET was added
* Operation PUT was added
* Operation DELETE was added

**/api/v2/speechandtextanalytics/categories** (3 changes)

* Path was added
* Operation GET was added
* Operation POST was added

**/api/v2/speechandtextanalytics/categories/{categoryId}** (4 changes)

* Path was added
* Operation GET was added
* Operation PUT was added
* Operation DELETE was added

**/api/v2/speechandtextanalytics/conversations/{conversationId}/categories** (2 changes)

* Path was added
* Operation GET was added

**POST /api/v2/speechandtextanalytics/programs/publishjobs** (1 change)

* Response 405 was added

**PUT /api/v2/speechandtextanalytics/programs/{programId}** (1 change)

* Response 202 was added

**DELETE /api/v2/speechandtextanalytics/programs/{programId}** (1 change)

* Response 202 was added

**POST /api/v2/speechandtextanalytics/programs** (1 change)

* Response 202 was added

**PUT /api/v2/speechandtextanalytics/topics/{topicId}** (1 change)

* Response 405 was added

**POST /api/v2/speechandtextanalytics/topics** (1 change)

* Response 405 was added

**GET /api/v2/speechandtextanalytics/topics/general/status** (1 change)

* Response 405 was added

**GET /api/v2/speechandtextanalytics/programs/unpublished** (1 change)

* Response 405 was added

**/api/v2/userrecordings/{recordingId}/transcoding** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/employeeengagement/celebrations/{celebrationId}** (3 changes)

* Path was added
* Operation DELETE was added
* Operation PATCH was added

**/api/v2/employeeengagement/celebrations** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/learning/assignments/{assignmentId}/steps/{stepId}** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/learning/modules/{moduleId}/preview** (3 changes)

* Path was added
* Operation GET was added
* Operation PUT was added

**/api/v2/learning/scorm/{scormId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/learning/scorm** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/employeeengagement/recognitions/{recognitionId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/employeeengagement/recognitions** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/jobs** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans** (3 changes)

* Path was added
* Operation GET was added
* Operation POST was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/{activityPlanId}** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/{activityPlanId}/runs/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/{activityPlanId}/runs/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/alternativeshifts/settings** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/alternativeshifts/trades/search/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/alternativeshifts/trades/{tradeId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/alternativeshifts/trades/search** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/alternativeshifts/offers/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/alternativeshifts/offers/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/alternativeshifts/offers/search/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/alternativeshifts/offers/search/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/alternativeshifts/trades** (3 changes)

* Path was added
* Operation GET was added
* Operation POST was added

**/api/v2/workforcemanagement/alternativeshifts/trades/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/alternativeshifts/trades/{tradeId}** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/workforcemanagement/alternativeshifts/trades/state/jobs** (2 changes)

* Path was added
* Operation PATCH was added

**/api/v2/workforcemanagement/alternativeshifts/trades/state/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/workplanbids** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/workplanbids/{bidId}/preferences** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/workforcemanagement/workplanbids/{bidId}/workplans** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/alternativeshifts/settings** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/workplanbids/{bidId}/groups/summary** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/workplanbids/{bidId}/groups** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/workplanbids/{bidId}/groups/{bidGroupId}** (4 changes)

* Path was added
* Operation GET was added
* Operation DELETE was added
* Operation PATCH was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/workplanbids/{bidId}/groups/{bidGroupId}/preferences** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/workforcemanagement/users/workplanbidranks/bulk** (2 changes)

* Path was added
* Operation PATCH was added

**/api/v2/workforcemanagement/users/{userId}/workplanbidranks** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/workplanbids/{bidId}** (4 changes)

* Path was added
* Operation GET was added
* Operation DELETE was added
* Operation PATCH was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/workplanbids** (3 changes)

* Path was added
* Operation GET was added
* Operation POST was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/workplanbids/{bidId}/copy** (2 changes)

* Path was added
* Operation POST was added

**POST /api/v2/taskmanagement/workitems/{workitemId}/terminate** (1 change)

* Response 409 was added

**/api/v2/analytics/agentcopilots/aggregates/query** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/analytics/agentcopilots/aggregates/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/analytics/agentcopilots/aggregates/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/analytics/agentcopilots/aggregates/jobs/{jobId}/results** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/conversations/emails/{conversationId}/participants/{participantId}/parkingstate** (2 changes)

* Path was added
* Operation PATCH was added

**/api/v2/journey/views/jobs** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/quality/forms/evaluations/{formId}/aiscoring/settings** (2 changes)

* Path was added
* Operation PUT was added

**AutoAnswerSetting** (1 change)

* Model was added

**AutoAnswerSettings** (1 change)

* Model was added

**User** (1 change)

* Optional property workPlanBidRanks was added

**BotAggregateQueryPredicate** (2 changes)

* Enum value botFlowSubType was added to property dimension
* Enum value previewMode was added to property dimension

**BotAggregationQuery** (4 changes)

* Enum value botFlowSubType was added to property groupBy
* Enum value previewMode was added to property groupBy
* Enum value oBotSessionCollection was added to property metrics
* Enum value oBotSessionCollectionSelfServed was added to property metrics

**BotAggregationView** (2 changes)

* Enum value oBotSessionCollection was added to property target
* Enum value oBotSessionCollectionSelfServed was added to property target

**ConversationAggregationQuery** (2 changes)

* Enum value oMessageCount was added to property metrics
* Enum value oMessageSegmentCount was added to property metrics

**ConversationAggregationView** (2 changes)

* Enum value oMessageCount was added to property target
* Enum value oMessageSegmentCount was added to property target

**AnalyticsParticipantWithoutAttributes** (1 change)

* Optional property screenRecording was added

**AnalyticsSession** (2 changes)

* Optional property detectedSpeechEnd was added
* Optional property detectedSpeechStart was added

**ConversationDetailQueryPredicate** (2 changes)

* Enum value oMessageCount was added to property metric
* Enum value oMessageSegmentCount was added to property metric

**SegmentDetailQueryPredicate** (3 changes)

* Enum value detectedSpeechEnd was added to property dimension
* Enum value detectedSpeechStart was added to property dimension
* Enum value screenRecording was added to property dimension

**AnalyticsParticipant** (1 change)

* Optional property screenRecording was added

**EvaluationAggregateQueryPredicate** (1 change)

* Enum value mediaType was added to property dimension

**EvaluationAggregationQuery** (1 change)

* Enum value mediaType was added to property groupBy

**FlowAggregateQueryPredicate** (1 change)

* Enum value flowSubType was added to property dimension

**ReportingTurn** (1 change)

* Optional property dateCompleted was added

**ReportingTurnAction** (1 change)

* Enum value SetWrapupCodeAction was added to property actionType

**BotFlowSession** (1 change)

* Optional property dateCompleted was added

**DashboardConfiguration** (2 changes)

* Optional property shared was added
* Optional property dashboardsSharedWith was added

**DashboardsSharedWith** (1 change)

* Model was added

**ViewFilter** (18 changes)

* Enum value Native was added to property developmentTypeList
* Optional property agentTalkDurationMilliseconds was added
* Optional property customerTalkDurationMilliseconds was added
* Optional property overtalkDurationMilliseconds was added
* Optional property silenceDurationMilliseconds was added
* Optional property acdDurationMilliseconds was added
* Optional property ivrDurationMilliseconds was added
* Optional property otherDurationMilliseconds was added
* Optional property agentTalkPercentage was added
* Optional property customerTalkPercentage was added
* Optional property overtalkPercentage was added
* Optional property silencePercentage was added
* Optional property acdPercentage was added
* Optional property ivrPercentage was added
* Optional property otherPercentage was added
* Optional property overtalkInstances was added
* Optional property dashboardType was added
* Optional property dashboardAccessFilter was added

**Widget** (1 change)

* Optional property agentInteractionSortOrder was added

**ReportingExportJobResponse** (1 change)

* Enum value SOCIAL_LISTENING_VIEW was added to property viewType

**ReportingExportMetadataJobResponse** (1 change)

* Enum value SOCIAL_LISTENING_VIEW was added to property viewType

**ReportingExportJobRequest** (1 change)

* Enum value SOCIAL_LISTENING_VIEW was added to property viewType

**KnowledgeBaseReference** (5 changes)

* Enum value hi-IN was added to property languageCode
* Enum value th-TH was added to property languageCode
* Enum value hu-HU was added to property languageCode
* Enum value vi-VN was added to property languageCode
* Enum value uk-UA was added to property languageCode

**AuditQueryExecutionLargeResultsResponse** (1 change)

* Model was added

**Limit** (2 changes)

* Enum value internal.messaging was added to property namespace
* Enum value social.media was added to property namespace

**Room** (1 change)

* Optional property jid was added

**AiScoringSetting** (1 change)

* Model was added

**AiScoringSettings** (3 changes)

* Optional property id was added
* Optional property questionGroupSettings was added
* Optional property selfUri was added

**QuestionGroupSettings** (1 change)

* Model was added

**QuestionSettings** (1 change)

* Model was added

**ContactIdentifier** (1 change)

* Enum value ExternalId was added to property type

**OrgUser** (1 change)

* Optional property workPlanBidRanks was added

**DownloadResponse** (4 changes)

* Optional property id was added
* Optional property state was added
* Optional property resultUri was added
* Optional property selfUri was added

**ConversationMessageMetadataEvent** (1 change)

* Enum value Video was added to property eventType

**Email** (1 change)

* Optional property parkTime was added

**CallMediaParticipant** (1 change)

* Optional property parkTime was added

**CreateCallRequest** (1 change)

* Optional property attributes was added

**DynamicContactQueueingSettings** (1 change)

* Optional property filter was added

**CallbackMediaParticipant** (1 change)

* Optional property parkTime was added

**ChatMediaParticipant** (1 change)

* Optional property parkTime was added

**CobrowseMediaParticipant** (1 change)

* Optional property parkTime was added

**EmailMediaParticipant** (1 change)

* Optional property parkTime was added

**ConversationEventVideo** (1 change)

* Model was added

**ConversationMessageEvent** (2 changes)

* Enum value Video was added to property eventType
* Optional property video was added

**ConversationPublicMetadata** (1 change)

* Model was added

**ConversationRecipientAdditionalIdentifier** (3 changes)

* Enum value Topic was added to property type
* Enum value IngestionRule was added to property type
* Enum value IngestionRuleVersion was added to property type

**MessageMediaParticipant** (1 change)

* Optional property parkTime was added

**CreateOutboundMessagingConversationResponse** (1 change)

* Model was added

**CreateOutboundMessagingConversationRequest** (1 change)

* Optional property useUserFromAddress was added

**ContentButtonResponse** (1 change)

* Enum value DatePicker was added to property type

**Feedback** (1 change)

* Model was added

**Article** (1 change)

* Model was added

**Faq** (1 change)

* Model was added

**MetadataAttribute** (1 change)

* Model was added

**Suggestion** (1 change)

* Model was added

**SuggestionCannedResponse** (1 change)

* Model was added

**SuggestionContext** (1 change)

* Model was added

**SuggestionKnowledgeAnswer** (1 change)

* Model was added

**SuggestionKnowledgeArticle** (1 change)

* Model was added

**SuggestionKnowledgeSearch** (1 change)

* Model was added

**SuggestionListing** (1 change)

* Model was added

**SuggestionScript** (1 change)

* Model was added

**SuggestionEngagement** (1 change)

* Model was added

**SuggestionFeedback** (1 change)

* Model was added

**CampaignPatchRequest** (1 change)

* Model was added

**DynamicLineBalancingSettingsPatchRequest** (1 change)

* Model was added

**CampaignDiagnostics** (1 change)

* Optional property filteredOutContactsCount was added

**CampaignRuleCondition** (6 changes)

* Enum value campaignRecordsAttempted was added to property conditionType
* Enum value campaignBusinessSuccess was added to property conditionType
* Enum value campaignBusinessFailure was added to property conditionType
* Enum value campaignBusinessNeutral was added to property conditionType
* Enum value campaignValidAttempts was added to property conditionType
* Enum value campaignRightPartyContacts was added to property conditionType

**CampaignRuleParameters** (5 changes)

* Optional property abandonRate was added
* Optional property outboundLineCount was added
* Optional property relativeWeight was added
* Optional property maxCallsPerAgent was added
* Optional property queue was added

**CampaignBusinessCategoryMetrics** (1 change)

* Model was added

**CampaignStats** (1 change)

* Optional property filteredOutContactsCount was added

**ContactsBulkOperationJobListing** (1 change)

* Model was added

**ContactBulkEditRequest** (1 change)

* Optional property generateDownloadUri was added

**ContactBulkSearchParameters** (1 change)

* Optional property generateDownloadUri was added

**EventMessage** (7 changes)

* Enum value ANOTHER_CAMPAIGN_STARTING was added to property code
* Enum value QUEUE_NOT_FOUND was added to property code
* Enum value SMS_CONTENT_TEMPLATE_NOT_FOUND was added to property code
* Enum value RECURRING_SCHEDULE_NEXT_OCCURRENCE_FAILURE was added to property code
* Enum value RECURRING_SCHEDULE_ENDED was added to property code
* Enum value RECURRING_SCHEDULE_MISSED_OCCURRENCES was added to property code
* Enum value VERSION_CONFLICT was added to property code

**WrapUpCodeMapping** (3 changes)

* Enum value BUSINESS_SUCCESS was added to property defaultSet
* Enum value BUSINESS_FAILURE was added to property defaultSet
* Enum value BUSINESS_NEUTRAL was added to property defaultSet

**MessagingCampaignDiagnostics** (1 change)

* Optional property filteredOutContactsCount was added

**FlowExecutionDataQueryResult** (1 change)

* Optional property flowWarningReason was added

**TrustedCertificateInfo** (1 change)

* Model was added

**TrustedCertificates** (1 change)

* Model was added

**KnowledgeBase** (5 changes)

* Enum value hi-IN was added to property coreLanguage
* Enum value th-TH was added to property coreLanguage
* Enum value hu-HU was added to property coreLanguage
* Enum value vi-VN was added to property coreLanguage
* Enum value uk-UA was added to property coreLanguage

**KnowledgeCategory** (5 changes)

* Enum value hi-IN was added to property languageCode
* Enum value th-TH was added to property languageCode
* Enum value hu-HU was added to property languageCode
* Enum value vi-VN was added to property languageCode
* Enum value uk-UA was added to property languageCode

**KnowledgeSearchDocumentV1** (5 changes)

* Enum value hi-IN was added to property languageCode
* Enum value th-TH was added to property languageCode
* Enum value hu-HU was added to property languageCode
* Enum value vi-VN was added to property languageCode
* Enum value uk-UA was added to property languageCode

**KnowledgeExtendedCategory** (5 changes)

* Enum value hi-IN was added to property languageCode
* Enum value th-TH was added to property languageCode
* Enum value hu-HU was added to property languageCode
* Enum value vi-VN was added to property languageCode
* Enum value uk-UA was added to property languageCode

**KnowledgeImport** (5 changes)

* Enum value hi-IN was added to property languageCode
* Enum value th-TH was added to property languageCode
* Enum value hu-HU was added to property languageCode
* Enum value vi-VN was added to property languageCode
* Enum value uk-UA was added to property languageCode

**KnowledgeDocument** (5 changes)

* Enum value hi-IN was added to property languageCode
* Enum value th-TH was added to property languageCode
* Enum value hu-HU was added to property languageCode
* Enum value vi-VN was added to property languageCode
* Enum value uk-UA was added to property languageCode

**KnowledgeBaseCreateRequest** (5 changes)

* Enum value hi-IN was added to property coreLanguage
* Enum value th-TH was added to property coreLanguage
* Enum value hu-HU was added to property coreLanguage
* Enum value vi-VN was added to property coreLanguage
* Enum value uk-UA was added to property coreLanguage

**KnowledgeOperationSource** (1 change)

* Model was added

**AnswerGenerationDocument** (1 change)

* Model was added

**DocumentElementLength** (1 change)

* Model was added

**KnowledgeAnswerGenerationResponse** (1 change)

* Model was added

**KnowledgeDocumentResponse** (3 changes)

* Optional property externalUrl was added
* Optional property source was added
* Optional property readonly was added

**KnowledgeExportJobDocumentsFilter** (1 change)

* Optional property sourceId was added

**KnowledgeExportJobResponse** (1 change)

* Optional property source was added

**KnowledgeExportJobRequest** (1 change)

* Optional property sourceId was added

**KnowledgeDocumentSearch** (1 change)

* Optional property answerGeneration was added

**KnowledgeSearchDocumentResponse** (3 changes)

* Optional property externalUrl was added
* Optional property source was added
* Optional property readonly was added

**KnowledgeDocumentSearchRequest** (1 change)

* Optional property answerMode was added

**LimitCount** (1 change)

* Model was added

**LimitCountListing** (1 change)

* Model was added

**ApprovalNamespace** (2 changes)

* Enum value internal.messaging was added to property namespace
* Enum value social.media was added to property namespace

**LimitChangeRequestDetails** (2 changes)

* Enum value internal.messaging was added to property namespace
* Enum value social.media was added to property namespace

**StatusChange** (2 changes)

* Enum value internal.messaging was added to property namespace
* Enum value social.media was added to property namespace

**ContentAttachment** (1 change)

* Optional property contentSizeBytes was added

**ContentReaction** (3 changes)

* Enum value Share was added to property reactionType
* Enum value Comment was added to property reactionType
* Enum value View was added to property reactionType

**MessagingRecipient** (1 change)

* Enum value Topic was added to property idType

**RecipientAdditionalIdentifier** (3 changes)

* Enum value Topic was added to property type
* Enum value IngestionRule was added to property type
* Enum value IngestionRuleVersion was added to property type

**ResponsePage** (1 change)

* Model was added

**WebEventBrowser** (1 change)

* Model was added

**WebEventDevice** (1 change)

* Model was added

**WebEventResponse** (1 change)

* Model was added

**WebEventResponseSession** (1 change)

* Model was added

**RequestPage** (1 change)

* Model was added

**WebEventRequest** (1 change)

* Model was added

**Trustee** (2 changes)

* Optional property hasFullAccess was added
* Optional property isTrustedUser was added

**TrustUser** (1 change)

* Optional property workPlanBidRanks was added

**EvaluationResponse** (1 change)

* Optional property revisionCreatedDate was added

**EvaluationAggregationQueryMe** (1 change)

* Enum value mediaType was added to property groupBy

**ButtonResponse** (1 change)

* Enum value DatePicker was added to property type

**GenericTemplate** (1 change)

* Model was added

**RecordingButtonComponent** (1 change)

* Model was added

**RecordingContentActions** (1 change)

* Model was added

**RecordingMessagingMessage** (4 changes)

* Optional property purpose was added
* Optional property participantId was added
* Optional property queue was added
* Optional property workflow was added

**UserQueue** (1 change)

* id is no longer readonly

**UtilizationResponse** (1 change)

* Optional property labelUtilizations was added

**UtilizationRequest** (1 change)

* Optional property labelUtilizations was added

**Flow** (2 changes)

* Optional property worktypeId was added
* Optional property virtualAgentEnabled was added

**FlowVersion** (1 change)

* Optional property virtualAgentEnabled was added

**AgentDirectRoutingBackupSettings** (1 change)

* Model was added

**AgentMaxUtilizationResponse** (1 change)

* Optional property labelUtilizations was added

**CategoriesEntityListing** (1 change)

* Model was added

**InfixOperator** (1 change)

* Model was added

**Operand** (1 change)

* Model was added

**OperandPosition** (1 change)

* Model was added

**OperatorPosition** (1 change)

* Model was added

**StaCategory** (1 change)

* Model was added

**Term** (1 change)

* Model was added

**CategoryRequest** (1 change)

* Model was added

**EngineIntegration** (1 change)

* id is no longer readonly

**ConversationCategoriesEntityListing** (1 change)

* Model was added

**ConversationCategory** (1 change)

* Model was added

**Program** (1 change)

* Optional property topicLinksJob was added

**DeleteProgramResponse** (1 change)

* Model was added

**StationEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**EdgeEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**DIDPoolEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**DIDEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**EdgeGroupEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**ExtensionPoolDivisionViewEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**ExtensionPoolEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**ExtensionEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**LineBaseEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**LineEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**OutboundRouteEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**PhoneEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**SiteEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**OutboundRouteBaseEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**TrunkBaseEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**TrunkEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**InfrastructureascodeJob** (1 change)

* Optional property rollbackResults was added

**BotSearchResponse** (2 changes)

* Enum value GenesysDigitalBotFlow was added to property botType
* Enum value GenesysVoiceSurveyFlow was added to property botType

**UserMe** (1 change)

* Optional property workPlanBidRanks was added

**VoicemailMessage** (1 change)

* Optional property transcription was added

**VoicemailSearchCriteria** (1 change)

* Enum value DATE_RANGE was added to property type

**Dependency** (1 change)

* Enum value WORKTYPE was added to property type

**DependencyObject** (1 change)

* Enum value WORKTYPE was added to property type

**EmergencyGroupDivisionViewEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**HistoryEntry** (1 change)

* Optional property virtualAgentEnabled was added

**IdentityResolutionConfig** (1 change)

* Model was added

**IVREntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**IVRDivisionViewEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**ScheduleGroupDivisionViewEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**ScheduleGroupEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**ScheduleDivisionViewEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**ScheduleEntityListing** (1 change)

* Optional property totalNumberOfEntities was added

**CobrowseSettings** (1 change)

* Optional property pauseCriteria was added

**MessengerSettings** (1 change)

* Optional property sessionPersistenceType was added

**NotificationsSettings** (1 change)

* Model was added

**DevelopmentActivity** (1 change)

* Enum value Native was added to property type

**CelebrationStateParam** (1 change)

* Model was added

**Celebration** (1 change)

* Model was added

**GetCelebrationListing** (1 change)

* Model was added

**SourceEntity** (1 change)

* Model was added

**LearningAssignment** (5 changes)

* Optional property assessmentPercentageScore was added
* Optional property assessmentCompletionPercentage was added
* Optional property completionPercentage was added
* Optional property steps was added
* Optional property nextStep was added

**LearningModule** (3 changes)

* Optional property enforceContentOrder was added
* Optional property reviewAssessmentResults was added
* Enum value Native was added to property type

**ReviewAssessmentResults** (2 changes)

* Optional property byAssignees was added
* Optional property byViewers was added

**LearningModuleRequest** (3 changes)

* Enum value Native was added to property type
* Optional property enforceContentOrder was added
* Optional property reviewAssessmentResults was added

**LearningModulePreviewUpdateResponse** (1 change)

* Model was added

**LearningModulePreviewUpdateResponseAssignment** (1 change)

* Model was added

**LearningModulePreviewUpdateResponseCurrentStep** (1 change)

* Model was added

**LearningModulePreviewUpdateScoStructure** (1 change)

* Model was added

**LearningModulePreviewUpdateStep** (1 change)

* Model was added

**LearningModulePreviewUpdateRequest** (1 change)

* Model was added

**LearningModulePreviewUpdateRequestCurrentStep** (1 change)

* Model was added

**LearningModulePreviewGetResponse** (1 change)

* Model was added

**LearningModulePreviewGetResponseAssignment** (1 change)

* Model was added

**LearningModulePreviewGetResponseStep** (1 change)

* Model was added

**LearningModulePreviewGetScoStructure** (1 change)

* Model was added

**AssignedLearningModule** (3 changes)

* Optional property enforceContentOrder was added
* Optional property reviewAssessmentResults was added
* Enum value Native was added to property type

**LearningScormResponse** (1 change)

* Model was added

**LearningScormUploadResponse** (1 change)

* Model was added

**LearningScormUploadRequest** (1 change)

* Model was added

**Recognition** (1 change)

* Model was added

**RecognitionBase** (1 change)

* Model was added

**CreateRecognition** (1 change)

* Model was added

**TimeOffPlan** (2 changes)

* Enum value CheckActivityCodes was added to property autoApprovalRule
* Enum value CheckLimitsAndActivityCodes was added to property autoApprovalRule

**UpdateTimeOffPlanRequest** (2 changes)

* Enum value CheckActivityCodes was added to property autoApprovalRule
* Enum value CheckLimitsAndActivityCodes was added to property autoApprovalRule

**CreateTimeOffPlanRequest** (2 changes)

* Enum value CheckActivityCodes was added to property autoApprovalRule
* Enum value CheckLimitsAndActivityCodes was added to property autoApprovalRule

**TimeOffRequestResponse** (1 change)

* Enum value OverlapsRestrictedActivityCode was added to property substatus

**TimeOffRequest** (1 change)

* Enum value OverlapsRestrictedActivityCode was added to property substatus

**TimeOffRequestQueryBody** (1 change)

* Enum value OverlapsRestrictedActivityCode was added to property substatuses

**ActivityPlanJobException** (1 change)

* Model was added

**ActivityPlanJobListing** (1 change)

* Model was added

**ActivityPlanJobResponse** (1 change)

* Model was added

**ActivityPlanOccurrenceReference** (1 change)

* Model was added

**ActivityPlanReference** (1 change)

* Model was added

**ActivityPlanListItem** (1 change)

* Model was added

**ActivityPlanListing** (1 change)

* Model was added

**RecurrenceEndSettings** (1 change)

* Model was added

**RecurrencePeriod** (1 change)

* Model was added

**RecurrenceSettings** (1 change)

* Model was added

**ActivityPlanAbandonRateImpactOverride** (1 change)

* Model was added

**ActivityPlanAsaImpactOverride** (1 change)

* Model was added

**ActivityPlanResponse** (1 change)

* Model was added

**ActivityPlanServiceGoalImpactOverrides** (1 change)

* Model was added

**ActivityPlanServiceLevelImpactOverride** (1 change)

* Model was added

**AvailabilityRange** (1 change)

* Model was added

**FixedAvailability** (1 change)

* Model was added

**GroupSettings** (1 change)

* Model was added

**RequiredLocalDateRange** (1 change)

* Model was added

**SchedulingPeriod** (1 change)

* Model was added

**UserSearchRule** (1 change)

* Model was added

**UserSearchRulePart** (1 change)

* Model was added

**CreateActivityPlanRequest** (1 change)

* Model was added

**ListWrapperFixedAvailability** (1 change)

* Model was added

**UpdateActivityPlanRequest** (1 change)

* Model was added

**ValueWrapperActivityPlanServiceGoalImpactOverrides** (1 change)

* Model was added

**ValueWrapperGroupSettings** (1 change)

* Model was added

**ValueWrapperUserSearchRule** (1 change)

* Model was added

**ActivityPlanRunJobResponse** (1 change)

* Model was added

**ActivityCodeSummary** (1 change)

* Model was added

**AlternativeShiftBuSettingsResponse** (1 change)

* Model was added

**AlternativeShiftAgentScheduledShift** (1 change)

* Model was added

**AlternativeShiftBulkUpdateTradesResponseTemplate** (1 change)

* Model was added

**AlternativeShiftOffersViewResponseTemplate** (1 change)

* Model was added

**AlternativeShiftScheduleLookup** (1 change)

* Model was added

**AlternativeShiftTradeBulkUpdateTemplateItem** (1 change)

* Model was added

**AlternativeShiftTradeResponse** (1 change)

* Model was added

**AlternativeShiftTradesViewResponseTemplate** (1 change)

* Model was added

**BuAlternativeShiftJobResponse** (1 change)

* Model was added

**ListWrapperAlternativeShiftBuSettingsActivityCategory** (1 change)

* Model was added

**ListWrapperAlternativeShiftBuSettingsGranularity** (1 change)

* Model was added

**UpdateAlternativeShiftBuSettingsRequest** (1 change)

* Model was added

**AlternativeShiftTradeListing** (1 change)

* Model was added

**BuListAlternativeShiftTradesResponse** (1 change)

* Model was added

**SearchAlternativeShiftTradesRequest** (1 change)

* Model was added

**AlternativeShiftAsyncResponse** (1 change)

* Model was added

**AlternativeShiftJobReference** (1 change)

* Model was added

**AlternativeShiftOffersRequest** (1 change)

* Model was added

**AlternativeShiftJobResponse** (1 change)

* Model was added

**AlternativeShiftSearchOffersRequest** (1 change)

* Model was added

**InitiatingAlternativeShift** (1 change)

* Model was added

**CreateAlternativeShiftTradeRequest** (1 change)

* Model was added

**ListAlternativeShiftTradesResponse** (1 change)

* Model was added

**AgentUpdateAlternativeShiftTradeRequest** (1 change)

* Model was added

**AdminBulkUpdateAlternativeShiftTradeState** (1 change)

* Model was added

**AdminBulkUpdateAlternativeShiftTradeStateRequest** (1 change)

* Model was added

**AgentWorkPlanBid** (1 change)

* Model was added

**AgentWorkPlanBids** (1 change)

* Model was added

**AgentWorkPlanBiddingPreference** (1 change)

* Model was added

**AgentWorkPlanBiddingPreferenceResponse** (1 change)

* Model was added

**AgentWorkPlanBiddingPreferenceRequest** (1 change)

* Model was added

**UpdateAgentWorkPlanBiddingPreference** (1 change)

* Model was added

**AgentWorkPlan** (1 change)

* Model was added

**AgentWorkPlanActivity** (1 change)

* Model was added

**AgentWorkPlanListResponse** (1 change)

* Model was added

**AgentWorkPlanShift** (1 change)

* Model was added

**ActivityCodesReference** (1 change)

* Model was added

**BuTimeOffPlanResponse** (2 changes)

* Enum value CheckActivityCodes was added to property autoApprovalRule
* Enum value CheckLimitsAndActivityCodes was added to property autoApprovalRule

**BuUpdateTimeOffPlanRequest** (2 changes)

* Enum value CheckActivityCodes was added to property autoApprovalRule
* Enum value CheckLimitsAndActivityCodes was added to property autoApprovalRule

**BuCreateTimeOffPlanRequest** (2 changes)

* Enum value CheckActivityCodes was added to property autoApprovalRule
* Enum value CheckLimitsAndActivityCodes was added to property autoApprovalRule

**WorkPlanBidGroupSummary** (1 change)

* Model was added

**WorkPlanBidGroupSummaryList** (1 change)

* Model was added

**AgentCountRange** (1 change)

* Model was added

**BidGroupWorkPlanResponse** (1 change)

* Model was added

**WorkPlanBidGroup** (1 change)

* Model was added

**WorkPlanBidGroupResponse** (1 change)

* Model was added

**WorkPlanBidMetadata** (1 change)

* Model was added

**BidGroupWorkPlanRequest** (1 change)

* Model was added

**WorkPlanBidGroupCreate** (1 change)

* Model was added

**ListWrapperBidGroupWorkPlanRequest** (1 change)

* Model was added

**WorkPlanBidGroupUpdate** (1 change)

* Model was added

**AdminAgentWorkPlanBiddingPreference** (1 change)

* Model was added

**AdminAgentWorkPlanPreferenceResponse** (1 change)

* Model was added

**AgentBidWorkPlanOverrideRequest** (1 change)

* Model was added

**AgentsBidAssignedWorkPlanOverrideRequest** (1 change)

* Model was added

**BuShortTermForecastWeekReference** (1 change)

* Model was added

**WorkPlanBid** (1 change)

* Model was added

**CreateWorkPlanBid** (1 change)

* Model was added

**WorkPlanBidListResponse** (1 change)

* Model was added

**ListWrapperAgentWorkPlanField** (1 change)

* Model was added

**UpdateWorkPlanBid** (1 change)

* Model was added

**CopyWorkPlanBid** (1 change)

* Model was added

**AgentCopilotAggregateDataContainer** (1 change)

* Model was added

**AgentCopilotAggregateQueryResponse** (1 change)

* Model was added

**AgentCopilotAggregateQueryClause** (1 change)

* Model was added

**AgentCopilotAggregateQueryFilter** (1 change)

* Model was added

**AgentCopilotAggregateQueryPredicate** (1 change)

* Model was added

**AgentCopilotAggregationQuery** (1 change)

* Model was added

**AgentCopilotAggregationView** (1 change)

* Model was added

**AgentCopilotAsyncAggregationQuery** (1 change)

* Model was added

**AgentCopilotAsyncAggregateQueryResponse** (1 change)

* Model was added

**BotAsyncAggregationQuery** (4 changes)

* Enum value botFlowSubType was added to property groupBy
* Enum value previewMode was added to property groupBy
* Enum value oBotSessionCollection was added to property metrics
* Enum value oBotSessionCollectionSelfServed was added to property metrics

**ConversationAsyncAggregationQuery** (2 changes)

* Enum value oMessageCount was added to property metrics
* Enum value oMessageSegmentCount was added to property metrics

**EvaluationAsyncAggregationQuery** (1 change)

* Enum value mediaType was added to property groupBy

**ResolutionAggregateQueryPredicate** (4 changes)

* Enum value conversationId was added to property dimension
* Enum value mediaType was added to property dimension
* Enum value requestedRouting was added to property dimension
* Enum value usedRouting was added to property dimension

**ResolutionAsyncAggregationQuery** (4 changes)

* Enum value conversationId was added to property groupBy
* Enum value mediaType was added to property groupBy
* Enum value requestedRouting was added to property groupBy
* Enum value usedRouting was added to property groupBy

**TaskManagementAggregationView** (1 change)

* Enum value nWorkitemsOffered was added to property target

**TaskManagementAsyncAggregationQuery** (1 change)

* Enum value nWorkitemsOffered was added to property metrics

**TaskManagementAggregationQuery** (1 change)

* Enum value nWorkitemsOffered was added to property metrics

**ParkingStateRequest** (1 change)

* Model was added

**FunctionZipConfig** (3 changes)

* Enum value Invalid was added to property status
* Enum value InvalidFormat was added to property status
* Enum value InvalidFile was added to property status

**JourneyViewElementFilterNumberPredicate** (1 change)

* Model was added

**JourneyViewElementFilterRange** (1 change)

* Model was added

**JourneyViewElementFilterRangeData** (1 change)

* Model was added

**JourneyViewListing** (1 change)

* Model was added

**JourneyViewJobListing** (1 change)

* Model was added

**OperationResponse** (1 change)

* Optional property source was added

**WorktypeDelta** (1 change)

* Optional property serviceLevelTarget was added


# Point Changes (21 changes)

**POST /api/v2/analytics/ratelimits/aggregates/query** (2 changes)

* Description was changed
* Summary was changed

**GET /api/v2/externalcontacts/contacts/{contactId}** (1 change)

* Description was changed for parameter expand

**GET /api/v2/externalcontacts/contacts/{contactId}/unresolved** (1 change)

* Description was changed for parameter expand

**DELETE /api/v2/outbound/messagingcampaigns/{messagingCampaignId}/progress** (1 change)

* Description was changed

**GET /api/v2/recording/batchrequests/{jobId}** (1 change)

* Summary was changed

**PATCH /api/v2/recordings/screensessions/{recordingSessionId}** (1 change)

* Description was changed

**GET /api/v2/userrecordings/{recordingId}/media** (1 change)

* Description was changed

**GET /api/v2/users/{userId}** (1 change)

* Description was changed for parameter expand

**GET /api/v2/users** (1 change)

* Description was changed for parameter expand

**GET /api/v2/users/development/activities/{activityId}** (1 change)

* Description was changed for parameter type

**GET /api/v2/users/development/activities** (1 change)

* Description was changed for parameter types

**GET /api/v2/users/development/activities/me** (1 change)

* Description was changed for parameter types

**GET /api/v2/learning/assignments** (1 change)

* Description was changed for parameter types

**GET /api/v2/learning/assignments/me** (1 change)

* Description was changed for parameter types

**GET /api/v2/learning/modules** (1 change)

* Description was changed for parameter types

**POST /api/v2/taskmanagement/workbins** (1 change)

* Description was changed for parameter body

**PATCH /api/v2/taskmanagement/worktypes/{worktypeId}/statuses/{statusId}** (1 change)

* Description was changed for parameter body

**POST /api/v2/taskmanagement/worktypes/{worktypeId}/statuses** (1 change)

* Description was changed for parameter body

**PATCH /api/v2/taskmanagement/worktypes/{worktypeId}** (1 change)

* Description was changed for parameter body

**POST /api/v2/taskmanagement/worktypes** (1 change)

* Description was changed for parameter body
