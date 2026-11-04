Platform API version: 10953




# Major Changes (75 changes)

**/api/v2/mobiledevices/{deviceId}** (1 change)

* Path /api/v2/mobiledevices/{deviceId} was removed

**/api/v2/mobiledevices** (1 change)

* Path /api/v2/mobiledevices was removed

**DELETE /api/v2/users/me/verifiers/{verifierId}** (3 changes)

* Parameter replacementDefaultVerifierId was added
* Response 204 was removed
* Response 409 type was changed from ErrorBody to _undefined_

**GET /api/v2/casemanagement/cases/{caseId}/associations** (2 changes)

* Parameter before was removed
* Parameter pageSize was changed from string to integer

**GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans** (2 changes)

* Parameter before was removed
* Parameter pageSize was changed from string to integer

**GET /api/v2/casemanagement/cases/{caseId}/stages** (2 changes)

* Parameter before was removed
* Parameter pageSize was changed from string to integer

**GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans/{stageplanId}/stepplans** (2 changes)

* Parameter before was removed
* Parameter pageSize was changed from string to integer

**GET /api/v2/casemanagement/cases/{caseId}/stages/{stageId}/steps** (2 changes)

* Parameter before was removed
* Parameter pageSize was changed from string to integer

**GET /api/v2/externalcontacts/graphs/clusterscans/latest** (1 change)

* Response 200 type was changed from ClusterScan to LatestClusterScan

**/api/v2/conversations/messages/{conversationId}/communications/{communicationId}/messages/media** (1 change)

* Operation POST was removed

**GET /api/v2/intents/categories/{categoryId}** (1 change)

* Parameter includeUsage was added

**GET /api/v2/intents/customerintents/{customerIntentId}** (1 change)

* Parameter includeUsage was added

**POST /api/v2/oauth/clients/{clientId}/usage/query** (1 change)

* Has been deprecated

**GET /api/v2/oauth/clients/{clientId}/usage/summary** (1 change)

* Has been deprecated

**GET /api/v2/oauth/clients/{clientId}/usage/query/results/{executionId}** (1 change)

* Has been deprecated

**GET /api/v2/routing/queues/{queueId}** (1 change)

* Parameter forceMemberRecount was added

**PATCH /api/v2/scim/groups/{groupId}** (2 changes)

* Parameter attributes was added
* Parameter excludedAttributes was added

**PATCH /api/v2/scim/v2/groups/{groupId}** (2 changes)

* Parameter attributes was added
* Parameter excludedAttributes was added

**POST /api/v2/usage/query** (1 change)

* Has been deprecated

**GET /api/v2/usage/query/{executionId}/results** (1 change)

* Has been deprecated

**POST /api/v2/usage/simplesearch** (1 change)

* Has been deprecated

**GET /api/v2/usage/simplesearch/{executionId}/results** (1 change)

* Has been deprecated

**GET /api/v2/workforcemanagement/managementunits/{managementUnitId}/workplans** (1 change)

* Parameter forceDownloadService was added

**POST /api/v2/workforcemanagement/agentschedules/mine** (1 change)

* Parameter expand was added

**GET /api/v2/billing/contracts/invoices** (1 change)

* Parameter agreementId was added

**UserDevice** (1 change)

* Model UserDevice was removed

**DirectoryUserDevicesListing** (1 change)

* Model DirectoryUserDevicesListing was removed

**BuAgentSchedulesSearchResponse** (1 change)

* Model BuAgentSchedulesSearchResponse was removed

**PublicKeyCredentialCreationResponse** (1 change)

* Property clientExtensionResults was changed from Map<object, object> to ClientExtensionResults

**CaseAssociationQueryEntityListing** (3 changes)

* Property nextUri was removed
* Property selfUri was removed
* Property previousUri was removed

**CaseAssociationListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**CaseplanQueryEntityListing** (3 changes)

* Property nextUri was removed
* Property selfUri was removed
* Property previousUri was removed

**CaseplanListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**CaseListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**CommentListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**StageplanListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**StageListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**StepplanListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**StepListing** (2 changes)

* Property selfUri was removed
* Property previousUri was removed

**WhatsAppBusinessScopedId** (1 change)

* Required property bsuid was added

**ExtensionPool** (1 change)

* Property division was changed from Division to WritableDivision

**BuCurrentAgentScheduleSearchResponse** (1 change)

* Property agentSchedules was changed from BuAgentScheduleSearchResponse[] to BuScheduleSearchAgentScheduleResponse[]

**ReschedulingOptionsRunResponse** (3 changes)

* Required property activitySmoothingType was added
* Required property induceScheduleVariability was added
* Required property useUnavailableTimesSnapshot was added

**BuAsyncAgentSchedulesSearchResponse** (1 change)

* Property result was changed from BuAgentSchedulesSearchResponse to BuAgentSchedulesSearchResponseBuAgentScheduleSearchResponse

**WorkitemOnAttributeChangeCondition** (2 changes)

* Property value was removed
* Enum value wrapup was removed from property attribute

**WorkitemOnAttributeChangeConditionUpdate** (2 changes)

* Property value was removed
* Enum value wrapup was removed from property attribute

**BillingCharge** (1 change)

* Property fairuseQuantity was removed

**BillingContractPeriodDetail** (1 change)

* Property wallets was removed

**BillingContractListing** (1 change)

* Property entities was changed from BillingContract[] to BillingContractSummary[]

**BillingInvoiceItem** (1 change)

* Property quantity was changed from integer to number


# Minor Changes (258 changes)

**DELETE /api/v2/users/me/verifiers/{verifierId}** (1 change)

* Response 200 was added

**/api/v2/users/{userId}/verifiers/{verifierId}** (1 change)

* Operation get was added. Summary: Get a verifier

**PATCH /api/v2/agentic/virtualagents/{virtualAgentId}/versions/{versionId}** (1 change)

* Response 501 was added

**POST /api/v2/agentic/virtualagents/{virtualAgentId}/versions** (1 change)

* Response 501 was added

**/api/v2/knowledge/sources/files/counts** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/knowledge/sources/tags** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/knowledge/sources/tags/grouped** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/speechandtextanalytics/conversations/{conversationId}/communications/{communicationId}/transcriptoutline** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/telephony/trunkbasesettings/metrics** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/telephony/trunkbasesettings/{trunkBaseId}/metrics** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/{activityPlanId}/occurrences** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/{activityPlanId}/occurrences/{occurrenceId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/{activityPlanId}/occurrences/{occurrenceId}/deletions/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/activityplans/{activityPlanId}/occurrences/{occurrenceId}/deletions/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/businessunits/{businessUnitId}/capacityplans/forecast/uploadurls** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/managementunits/{managementUnitId}/selfschedule/settings** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/workforcemanagement/selfschedule/activitymoves/{activityMoveId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/selfschedule/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/selfschedule/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/selfschedule/offers/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/workforcemanagement/selfschedule/offers/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/selfschedule/query** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/selfschedule/settings** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/intents/categories/similar** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/intents/customerintents/similar** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/search/settings** (3 changes)

* Path was added
* Operation GET was added
* Operation PATCH was added

**/api/v2/search/settings/contentsearch** (2 changes)

* Path was added
* Operation PATCH was added

**MessagingInitialConfiguration** (1 change)

* Enum value LinkedIn was added to property messageType

**DeleteVerifierResponse** (1 change)

* Model was added

**AuthenticationExtensionsLargeBlobOutputs** (1 change)

* Model was added

**AuthenticationExtensionsPRFOutputs** (1 change)

* Model was added

**ClientExtensionResults** (1 change)

* Model was added

**CredentialPropertiesOutput** (1 change)

* Model was added

**PureCloud** (2 changes)

* Optional property nativeLoginExceptionsEnabled was added
* Optional property nativeLoginExceptionGroupIds was added

**OrgAuthSettings** (1 change)

* Optional property ssoLoginFirst was added

**Limit** (1 change)

* Enum value agentic.intent.classifier was added to property namespace

**AgenticVirtualAgentMcpSchemas** (1 change)

* Model was added

**AgenticVirtualAgentRepetitionCheck** (1 change)

* Enum value VeryLoose was added to property similarity

**AgenticVirtualAgentTool** (1 change)

* Enum value MCP was added to property type

**AgenticVirtualAgentTypeDefinition** (1 change)

* Enum value A2AError was added to property type

**AnalyticsAgentStateAgentSessionResult** (1 change)

* Enum value video was added to property segmentType

**AnalyticsAgentStateAgentWorkitemResult** (1 change)

* Model was added

**AgentStateSegmentTypeCount** (1 change)

* Enum value video was added to property segmentType

**AgentStateWorkitemAssignmentStateCount** (1 change)

* Model was added

**AgentStateWorkitemStatusCategoryCount** (1 change)

* Model was added

**AgentStateWorkitemFilter** (1 change)

* Model was added

**AgentStateWorkitemQueryClause** (1 change)

* Model was added

**AgentStateWorkitemQueryPredicate** (1 change)

* Model was added

**AgentStateQueryRequest** (5 changes)

* Enum value workitemDateDue was added to property userOrderBy
* Enum value workitemDateExpires was added to property userOrderBy
* Enum value workitemDateStatusChanged was added to property userOrderBy
* Enum value workitemDateAssignmentStateChanged was added to property userOrderBy
* Enum value workitemDateCreated was added to property userOrderBy

**AnalyticsConversationSegment** (1 change)

* Enum value video was added to property segmentType

**ConversationDetailQueryPredicate** (1 change)

* Enum value tActiveVideo was added to property metric

**ConversationAggregationQuery** (1 change)

* Enum value tActiveVideo was added to property metrics

**ConversationAggregationSort** (1 change)

* Enum value tActiveVideo was added to property name

**ConversationAggregationView** (1 change)

* Enum value tActiveVideo was added to property target

**ConversationAsyncAggregationQuery** (1 change)

* Enum value tActiveVideo was added to property metrics

**ReportingTurnKnowledgeMetadata** (1 change)

* Enum value DelegatedToAgenticVirtualAgent was added to property answerGenerationStatus

**ViewFilter** (4 changes)

* Enum value linkedin was added to property messageTypes
* Enum value LinkedIn was added to property botMessageTypes
* Enum value YouTube was added to property socialChannels
* Enum value video was added to property segmentTypes

**Widget** (1 change)

* Enum value video was added to property selectedSegmentTypes

**ReportingExportJobResponse** (4 changes)

* Enum value CASE_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value CASE_PERFORMANCE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_CASE_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_CASE_PERFORMANCE_DETAIL_VIEW was added to property viewType

**ReportingExportMetadataJobResponse** (4 changes)

* Enum value CASE_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value CASE_PERFORMANCE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_CASE_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_CASE_PERFORMANCE_DETAIL_VIEW was added to property viewType

**ReportingExportJobRequest** (4 changes)

* Enum value CASE_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value CASE_PERFORMANCE_DETAIL_VIEW was added to property viewType
* Enum value AGENT_CASE_PERFORMANCE_SUMMARY_VIEW was added to property viewType
* Enum value AGENT_CASE_PERFORMANCE_DETAIL_VIEW was added to property viewType

**Copilot** (1 change)

* Optional property emailSummaryGenerationConfig was added

**KnowledgeBaseWithDialectReference** (6 changes)

* Enum value ca-ES was added to property languageCode
* Enum value en-NZ was added to property languageCode
* Enum value zh-HK was added to property languageCode
* Enum value zh-TW was added to property languageCode
* Enum value zh-CN was added to property languageCode
* Enum value ar-SA was added to property languageCode

**CaseplanFilter** (1 change)

* Enum value EQ was added to property operator

**CaseQueryJobCreate** (3 changes)

* Optional property filterGroups was added
* Enum value externalId was added to property attributes
* Enum value description was added to property attributes

**CaseQueryJobFilter** (1 change)

* Optional property caseSensitive was added

**CaseQueryJobFilterGroup** (1 change)

* Model was added

**InitiateVideoChatRecording** (1 change)

* Model was added

**ContactIdentifier** (1 change)

* Optional property portfolioId was added

**WhatsAppBusinessScopedId** (2 changes)

* Optional property parent was added
* Optional property portfolioId was added

**WhatsAppId** (2 changes)

* Optional property username was added
* Optional property whatsAppBusinessScopedIds was added

**ClusterScanGraphSettings** (1 change)

* Model was added

**LatestClusterScan** (1 change)

* Model was added

**CsvMappingEntry** (1 change)

* Optional property valueFormat was added

**Callback** (1 change)

* Optional property clientIpAddress was added

**Message** (1 change)

* Enum value linkedin was added to property type

**ActivationTrigger** (1 change)

* Enum value Sentiment was added to property triggerType

**ChecklistActivationPayload** (1 change)

* Enum value Sentiment was added to property activationTriggerType

**ConversationCustomAttributesSearchRequest** (2 changes)

* Optional property queryReservedFields was added
* Optional property queryCustomAttributes was added

**CampaignIdentityResolutionConfig** (1 change)

* Model was added

**CallbackMediaParticipant** (1 change)

* Optional property clientIpAddress was added

**EmailMessage** (1 change)

* Optional property recipientWarnings was added

**RecipientWarning** (1 change)

* Model was added

**EmailMessagePreview** (1 change)

* Optional property recipientWarnings was added

**EmailMessageReply** (1 change)

* Optional property recipientWarnings was added

**ConversationNormalizedMessage** (1 change)

* Enum value Modified was added to property status

**MessageMediaParticipant** (1 change)

* Enum value linkedin was added to property type

**OpenNormalizedMessage** (1 change)

* Enum value Modified was added to property status

**Suggestion** (1 change)

* Optional property suggestedKnowledgeAnswer was added

**ConversationSessionSummary** (7 changes)

* Optional property latestCommunication was added
* Optional property labels was added
* Optional property queue was added
* Optional property triggerSource was added
* Optional property summarySourceType was added
* Optional property triggerType was added
* Optional property lastEditedBy was added

**ConversationSummary** (7 changes)

* Optional property latestCommunication was added
* Optional property labels was added
* Optional property queue was added
* Optional property triggerSource was added
* Optional property summarySourceType was added
* Optional property triggerType was added
* Optional property lastEditedBy was added

**AttemptLimits** (1 change)

* Optional property phoneTypeRecallEntries was added

**CallbackBasic** (1 change)

* Optional property clientIpAddress was added

**EventMessage** (2 changes)

* Enum value AGENT_APPROACHING_ACTIVE_CAMPAIGNS_LIMIT was added to property code
* Enum value CAMPAIGN_STOPPED_AGENT_ACTIVE_LIMIT_EXCEEDED was added to property code

**CustomerIntentUsage** (1 change)

* Model was added

**IntentsCategory** (1 change)

* Optional property usage was added

**CustomerIntentResponse** (1 change)

* Optional property usage was added

**KnowledgeSearchResult** (2 changes)

* Optional property failureReason was added
* Optional property message was added

**V3SourceFileCountEntry** (1 change)

* Model was added

**V3SourceFileCountsResponse** (1 change)

* Model was added

**V3SourceFileCountsRequest** (1 change)

* Model was added

**V3SourceTagResponse** (1 change)

* Model was added

**OrgV3SourcesTagsResponse** (1 change)

* Model was added

**V3SourceTagsGroupedEntry** (1 change)

* Model was added

**V3SourceTagsGroupedResponse** (1 change)

* Model was added

**ApprovalNamespace** (1 change)

* Enum value agentic.intent.classifier was added to property namespace

**LimitChangeRequestDetails** (1 change)

* Enum value agentic.intent.classifier was added to property namespace

**StatusChange** (1 change)

* Enum value agentic.intent.classifier was added to property namespace

**OperationalEvent** (2 changes)

* Optional property referenceId was added
* Optional property referenceType was added

**RecordingMessageReceipt** (1 change)

* Enum value Modified was added to property status

**RecordingSettings** (1 change)

* Optional property hierarchyAccessControlEnabled was added

**CommonRule** (3 changes)

* Optional property muted was added
* Optional property dateStartMute was added
* Optional property dateEndMute was added

**ModifiableRuleProperties** (3 changes)

* Optional property muted was added
* Optional property dateStartMute was added
* Optional property dateEndMute was added

**DataIngestionRuleCriteria** (1 change)

* Enum value YouTube was added to property effectivePlatform

**SpeechTextAnalyticsConversationSummary** (2 changes)

* Optional property communicationId was added
* Optional property labels was added

**TranscriptOutlineResponse** (1 change)

* Model was added

**TranscriptOutlineSegment** (1 change)

* Model was added

**TrunkBaseMetrics** (1 change)

* Model was added

**TrunkBaseMetricsEntityListing** (1 change)

* Model was added

**ExportDetails** (1 change)

* Enum value FlowInfoSpec was added to property exportType

**Dependency** (2 changes)

* Enum value EXTERNALMCPSERVERINTEGRATION was added to property type
* Enum value SURVEYFORMCONTEXT was added to property type

**DependencyObject** (2 changes)

* Enum value EXTERNALMCPSERVERINTEGRATION was added to property type
* Enum value SURVEYFORMCONTEXT was added to property type

**WorkPlanListResponse** (1 change)

* Optional property downloadUrl was added

**ActivityPlanOccurrenceListItem** (1 change)

* Model was added

**ActivityPlanOccurrenceListing** (1 change)

* Model was added

**BuScheduleSummary** (1 change)

* Model was added

**ActivityPlanOccurrenceResponse** (1 change)

* Model was added

**ActivityPlanOccurrenceSessionWithAttendees** (1 change)

* Model was added

**ActivityPlanOccurrenceViolation** (1 change)

* Model was added

**ActivityPlanSessionViolation** (1 change)

* Model was added

**ActivityPlanUnscheduledAttendee** (1 change)

* Model was added

**ActivityPlanViolationDetails** (1 change)

* Model was added

**CapacityPlanResponse** (1 change)

* Optional property importedForecast was added

**CapacityPlanRequest** (1 change)

* Optional property importedForecast was added

**UpdateCapacityPlanRequest** (1 change)

* Optional property importedForecast was added

**CopyCapacityPlanRequest** (1 change)

* Optional property importedForecast was added

**CapacityPlanForecastActualValues** (1 change)

* Model was added

**CapacityPlanForecastDistribution** (1 change)

* Model was added

**CapacityPlanForecastDistributionValues** (1 change)

* Model was added

**CapacityPlanForecastImportSchema** (1 change)

* Model was added

**CapacityPlanForecastImportUpload** (1 change)

* Model was added

**CapacityPlanForecastImportUploadResponse** (1 change)

* Model was added

**CapacityPlanForecastPlanningGroup** (1 change)

* Model was added

**CapacityPlanForecastImportUploadRequest** (1 change)

* Model was added

**AgentMuScheduleResult** (1 change)

* Optional property visibilityRange was added

**BuCurrentAgentScheduleSearchResponse** (1 change)

* Optional property visibilityRange was added

**BuScheduleSearchAgentScheduleResponse** (1 change)

* Model was added

**BuAgentScheduleSearchResponse** (1 change)

* Optional property workPlansPerWeek was added

**BuAgentSchedulesSearchResponseBuAgentScheduleSearchResponse** (1 change)

* Model was added

**SelfScheduleManagementUnitSettings** (1 change)

* Model was added

**SelfScheduleManagementUnitSettingsRequest** (1 change)

* Model was added

**SetWrapperActivityCategory** (1 change)

* Model was added

**SelfScheduleActivityMoveListItem** (1 change)

* Model was added

**SelfScheduleJob** (1 change)

* Model was added

**SelfScheduleActivityMoveRequestItem** (1 change)

* Model was added

**SelfScheduleJobRequest** (1 change)

* Model was added

**SelfScheduleOffersActivityMoveTemplate** (1 change)

* Model was added

**SelfScheduleOffersJob** (1 change)

* Model was added

**SelfScheduleOffersResultTemplate** (1 change)

* Model was added

**SelfScheduleOffersJobRequest** (1 change)

* Model was added

**SelfScheduleQuery** (1 change)

* Model was added

**SelfScheduleAgentManagementUnitSettings** (1 change)

* Model was added

**WorkitemOnAttributeChangeConditionGroup** (1 change)

* Model was added

**WorkitemOnAttributeChangeMatch** (1 change)

* Model was added

**WorkitemOnAttributeChangeRule** (1 change)

* Optional property match was added

**WorkitemOnAttributeChangeRuleUpdate** (1 change)

* Optional property match was added

**WorkitemOnAttributeChangeRuleCreate** (1 change)

* Optional property match was added

**BillingAiSubItem** (1 change)

* Model was added

**BillingCharge** (3 changes)

* Optional property fairuseAllocation was added
* Optional property fairuseAmount was added
* Optional property aiSubItems was added

**BillingContract** (2 changes)

* Optional property organizations was added
* Optional property wallets was added

**BillingContractSummary** (1 change)

* Model was added

**BillingInvoice** (1 change)

* Optional property agreementIds was added

**SimilarCategoriesResponse** (1 change)

* Model was added

**SimilarCategoryResult** (1 change)

* Model was added

**SimilarCustomerIntentResult** (1 change)

* Model was added

**SimilarCustomerIntentsResponse** (1 change)

* Model was added

**SimilarEntityRef** (1 change)

* Model was added

**SimilarCustomerIntentsRequest** (1 change)

* Model was added

**OrgSettings** (1 change)

* Model was added

**ContentSearchSetting** (1 change)

* Model was added

**AgentSchedulingPreferencesTiebreaker** (1 change)

* Model was added


# Point Changes (18 changes)

**DELETE /api/v2/users/me/verifiers/{verifierId}** (1 change)

* Response 409 was changed from The request conflicts with the current state of the target resource. to The verifier state changed during deletion

**GET /api/v2/casemanagement/cases/{caseId}/associations** (2 changes)

* Description was changed for parameter after
* Description was changed for parameter pageSize

**GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans** (2 changes)

* Description was changed for parameter after
* Description was changed for parameter pageSize

**GET /api/v2/casemanagement/cases/{caseId}/stages** (2 changes)

* Description was changed for parameter after
* Description was changed for parameter pageSize

**GET /api/v2/casemanagement/caseplans/{caseplanId}/versions/{versionId}/stageplans/{stageplanId}/stepplans** (2 changes)

* Description was changed for parameter after
* Description was changed for parameter pageSize

**GET /api/v2/casemanagement/cases/{caseId}/stages/{stageId}/steps** (2 changes)

* Description was changed for parameter after
* Description was changed for parameter pageSize

**POST /api/v2/oauth/clients/{clientId}/usage/query** (1 change)

* Description was changed

**GET /api/v2/oauth/clients/{clientId}/usage/summary** (1 change)

* Description was changed

**GET /api/v2/oauth/clients/{clientId}/usage/query/results/{executionId}** (1 change)

* Description was changed

**POST /api/v2/usage/query** (1 change)

* Description was changed

**GET /api/v2/usage/query/{executionId}/results** (1 change)

* Description was changed

**POST /api/v2/usage/simplesearch** (1 change)

* Description was changed

**GET /api/v2/usage/simplesearch/{executionId}/results** (1 change)

* Description was changed
