# ViewFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaTypes** | [**List<MediaTypesEnum>**](#Enum--MediaTypesEnum) | The media types are used to filter the view |  [optional] |
| **queueIds** | **List&lt;String&gt;** | The queue ids are used to filter the view |  [optional] |
| **skillIds** | **List&lt;String&gt;** | The skill ids are used to filter the view |  [optional] |
| **assignedSkillIds** | **List&lt;String&gt;** | The assigned user skill ids are used to filter the view |  [optional] |
| **skillGroups** | **List&lt;String&gt;** | The skill groups used to filter the view |  [optional] |
| **languageIds** | **List&lt;String&gt;** | The language ids are used to filter the view |  [optional] |
| **assignedLanguageIds** | **List&lt;String&gt;** | The assigned user language ids are used to filter the view |  [optional] |
| **languageGroups** | **List&lt;String&gt;** | The language groups used to filter the view |  [optional] |
| **directions** | [**List<DirectionsEnum>**](#Enum--DirectionsEnum) | The directions are used to filter the view |  [optional] |
| **originatingDirections** | [**List<OriginatingDirectionsEnum>**](#Enum--OriginatingDirectionsEnum) | The list of orginating directions used to filter the view |  [optional] |
| **wrapUpCodes** | **List&lt;String&gt;** | The wrap up codes are used to filter the view |  [optional] |
| **dnisList** | **List&lt;String&gt;** | The dnis list is used to filter the view |  [optional] |
| **sessionDnisList** | **List&lt;String&gt;** | The list of session dnis used to filter the view |  [optional] |
| **filterQueuesByUserIds** | **List&lt;String&gt;** | The user ids are used to fetch associated queues for the view |  [optional] |
| **filterUsersByQueueIds** | **List&lt;String&gt;** | The queue ids are used to fetch associated users for the view |  [optional] |
| **userIds** | **List&lt;String&gt;** | The user ids are used to filter the view |  [optional] |
| **managementUnitIds** | **List&lt;String&gt;** | The management unit ids are used to filter the view |  [optional] |
| **addressTos** | **List&lt;String&gt;** | The address To values are used to filter the view |  [optional] |
| **addressFroms** | **List&lt;String&gt;** | The address from values are used to filter the view |  [optional] |
| **outboundCampaignIds** | **List&lt;String&gt;** | The outbound campaign ids are used to filter the view |  [optional] |
| **outboundContactListIds** | **List&lt;String&gt;** | The outbound contact list ids are used to filter the view |  [optional] |
| **contactIds** | **List&lt;String&gt;** | The contact ids are used to filter the view |  [optional] |
| **externalContactIds** | **List&lt;String&gt;** | The external contact ids are used to filter the view |  [optional] |
| **externalOrgIds** | **List&lt;String&gt;** | The external org ids are used to filter the view |  [optional] |
| **aniList** | **List&lt;String&gt;** | The ani list ids are used to filter the view |  [optional] |
| **durationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The durations in milliseconds used to filter the view |  [optional] |
| **acdDurationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The acd durations in milliseconds used to filter the view |  [optional] |
| **talkDurationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The talk durations in milliseconds used to filter the view |  [optional] |
| **acwDurationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The acw durations in milliseconds used to filter the view |  [optional] |
| **handleDurationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The handle durations in milliseconds used to filter the view |  [optional] |
| **holdDurationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The hold durations in milliseconds used to filter the view |  [optional] |
| **abandonDurationsMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The abandon durations in milliseconds used to filter the view |  [optional] |
| **evaluationScore** | [**NumericRange**](NumericRange) | The evaluationScore is used to filter the view |  [optional] |
| **evaluationCriticalScore** | [**NumericRange**](NumericRange) | The evaluationCriticalScore is used to filter the view |  [optional] |
| **evaluationFormIds** | **List&lt;String&gt;** | The evaluation form ids are used to filter the view |  [optional] |
| **evaluatedAgentIds** | **List&lt;String&gt;** | The evaluated agent ids are used to filter the view |  [optional] |
| **evaluatorIds** | **List&lt;String&gt;** | The evaluator ids are used to filter the view |  [optional] |
| **transferred** | **Boolean** | Indicates filtering for transfers |  [optional] |
| **abandoned** | **Boolean** | Indicates filtering for abandons |  [optional] |
| **answered** | **Boolean** | Indicates filtering for answered interactions |  [optional] |
| **messageTypes** | [**List<MessageTypesEnum>**](#Enum--MessageTypesEnum) | The message media types used to filter the view |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | The divison Ids used to filter the view |  [optional] |
| **surveyFormIds** | **List&lt;String&gt;** | The survey form ids used to filter the view |  [optional] |
| **surveyTotalScore** | [**NumericRange**](NumericRange) | The survey total score used to filter the view |  [optional] |
| **surveyNpsScore** | [**NumericRange**](NumericRange) | The survey NPS score used to filter the view |  [optional] |
| **mos** | [**NumericRange**](NumericRange) | The desired range for mos values |  [optional] |
| **surveyQuestionGroupScore** | [**NumericRange**](NumericRange) | The survey question group score used to filter the view |  [optional] |
| **surveyPromoterScore** | [**NumericRange**](NumericRange) | The survey promoter score used to filter the view |  [optional] |
| **surveyFormContextIds** | **List&lt;String&gt;** | The list of survey form context ids used to filter the view |  [optional] |
| **conversationIds** | **List&lt;String&gt;** | The list of conversation ids used to filter the view |  [optional] |
| **sipCallIds** | **List&lt;String&gt;** | The list of SIP call ids used to filter the view |  [optional] |
| **isEnded** | **Boolean** | Indicates filtering for ended |  [optional] |
| **isSurveyed** | **Boolean** | Indicates filtering for survey |  [optional] |
| **surveyScores** | [**List&lt;NumericRange&gt;**](NumericRange) | The list of survey score ranges used to filter the view |  [optional] |
| **promoterScores** | [**List&lt;NumericRange&gt;**](NumericRange) | The list of promoter score ranges used to filter the view |  [optional] |
| **isCampaign** | **Boolean** | Indicates filtering for campaign |  [optional] |
| **surveyStatuses** | **List&lt;String&gt;** | The list of survey statuses used to filter the view |  [optional] |
| **conversationProperties** | [**ConversationProperties**](ConversationProperties) | A grouping of conversation level filters |  [optional] |
| **isBlindTransferred** | **Boolean** | Indicates filtering for blind transferred |  [optional] |
| **isConsulted** | **Boolean** | Indicates filtering for consulted |  [optional] |
| **isConsultTransferred** | **Boolean** | Indicates filtering for consult transferred |  [optional] |
| **remoteParticipants** | **List&lt;String&gt;** | The list of remote participants used to filter the view |  [optional] |
| **flowIds** | **List&lt;String&gt;** | The list of flow Ids |  [optional] |
| **flowOutcomeIds** | **List&lt;String&gt;** | A list of outcome ids of the flow |  [optional] |
| **flowOutcomeValues** | [**List<FlowOutcomeValuesEnum>**](#Enum--FlowOutcomeValuesEnum) | A list of outcome values of the flow |  [optional] |
| **flowDestinationTypes** | [**List<FlowDestinationTypesEnum>**](#Enum--FlowDestinationTypesEnum) | The list of destination types of the flow |  [optional] |
| **flowDisconnectReasons** | [**List<FlowDisconnectReasonsEnum>**](#Enum--FlowDisconnectReasonsEnum) | The list of reasons for the flow to disconnect |  [optional] |
| **flowTypes** | [**List<FlowTypesEnum>**](#Enum--FlowTypesEnum) | A list of types of the flow |  [optional] |
| **flowEntryTypes** | [**List<FlowEntryTypesEnum>**](#Enum--FlowEntryTypesEnum) | A list of types of the flow entry |  [optional] |
| **flowEntryReasons** | **List&lt;String&gt;** | A list of reasons of flow entry |  [optional] |
| **flowVersions** | **List&lt;String&gt;** | A list of versions of a flow |  [optional] |
| **groupIds** | **List&lt;String&gt;** | A list of directory group ids |  [optional] |
| **hasJourneyCustomerId** | **Boolean** | Indicates filtering for journey customer id |  [optional] |
| **hasJourneyActionMapId** | **Boolean** | Indicates filtering for Journey action map id |  [optional] |
| **hasJourneyVisitId** | **Boolean** | Indicates filtering for Journey visit id |  [optional] |
| **hasMedia** | **Boolean** | Indicates filtering for presence of MMS media |  [optional] |
| **roleIds** | **List&lt;String&gt;** | The role Ids used to filter the view |  [optional] |
| **reportsTos** | **List&lt;String&gt;** | The report to user IDs used to filter the view |  [optional] |
| **locationIds** | **List&lt;String&gt;** | The location Ids used to filter the view |  [optional] |
| **flowOutTypes** | **List&lt;String&gt;** | A list of flow out types |  [optional] |
| **providerList** | **List&lt;String&gt;** | A list of providers |  [optional] |
| **callbackNumberList** | **List&lt;String&gt;** | A list of callback numbers or substrings of numbers (ex: [\"317\", \"13172222222\"]) |  [optional] |
| **callbackInterval** | **String** | An interval of time to filter for scheduled callbacks. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **usedRoutingTypes** | [**List<UsedRoutingTypesEnum>**](#Enum--UsedRoutingTypesEnum) | A list of routing types used |  [optional] |
| **requestedRoutingTypes** | [**List<RequestedRoutingTypesEnum>**](#Enum--RequestedRoutingTypesEnum) | A list of routing types requested |  [optional] |
| **hasAgentAssistId** | **Boolean** | Indicates filtering for agent assist id |  [optional] |
| **transcripts** | [**List&lt;Transcripts&gt;**](Transcripts) | A list of transcript contents requested |  [optional] |
| **transcriptLanguages** | **List&lt;String&gt;** | A list of transcript languages requested |  [optional] |
| **participantPurposes** | [**List<ParticipantPurposesEnum>**](#Enum--ParticipantPurposesEnum) | A list of participant purpose requested |  [optional] |
| **showFirstQueue** | **Boolean** | Indicates filtering for first queue data |  [optional] |
| **teamIds** | **List&lt;String&gt;** | The team ids used to filter the view data |  [optional] |
| **filterUsersByTeamIds** | **List&lt;String&gt;** | The team ids are used to fetch associated users for the view |  [optional] |
| **journeyActionMapIds** | **List&lt;String&gt;** | The journey action map ids are used to fetch action maps for the associated view |  [optional] |
| **journeyOutcomeIds** | **List&lt;String&gt;** | The journey outcome ids are used to fetch outcomes for the associated view |  [optional] |
| **journeySegmentIds** | **List&lt;String&gt;** | The journey segment ids are used to fetch segments for the associated view |  [optional] |
| **journeyActionMapTypes** | [**List<JourneyActionMapTypesEnum>**](#Enum--JourneyActionMapTypesEnum) | The journey action map types are used to filter action map data for the associated view |  [optional] |
| **developmentRoleList** | [**List<DevelopmentRoleListEnum>**](#Enum--DevelopmentRoleListEnum) | The list of development roles used to filter agent development view |  [optional] |
| **developmentTypeList** | [**List<DevelopmentTypeListEnum>**](#Enum--DevelopmentTypeListEnum) | The list of development types used to filter agent development view |  [optional] |
| **developmentStatusList** | [**List<DevelopmentStatusListEnum>**](#Enum--DevelopmentStatusListEnum) | The list of development status used to filter agent development view |  [optional] |
| **developmentModuleIds** | **List&lt;String&gt;** | The list of development moduleIds used to filter agent development view |  [optional] |
| **developmentActivityOverdue** | **Boolean** | Indicates filtering for development activities |  [optional] |
| **customerSentimentScore** | [**NumericRange**](NumericRange) | The customer sentiment score used to filter the view |  [optional] |
| **customerSentimentTrend** | [**NumericRange**](NumericRange) | The customer sentiment trend used to filter the view |  [optional] |
| **flowTransferTargets** | **List&lt;String&gt;** | The list of transfer targets used to filter flow data |  [optional] |
| **developmentName** | **String** | Filter for development name |  [optional] |
| **topicIds** | **List&lt;String&gt;** | Represents the topics detected in the transcript |  [optional] |
| **externalTags** | **List&lt;String&gt;** | The list of external Tags used to filter conversation data |  [optional] |
| **isNotResponding** | **Boolean** | Indicates filtering for not responding users |  [optional] |
| **isAuthenticated** | **Boolean** | Indicates filtering for the authenticated chat |  [optional] |
| **botIds** | **List&lt;String&gt;** | The list of bot IDs used to filter bot views |  [optional] |
| **botVersions** | **List&lt;String&gt;** | The list of bot versions used to filter bot views |  [optional] |
| **botMessageTypes** | [**List<BotMessageTypesEnum>**](#Enum--BotMessageTypesEnum) | The list of bot message types used to filter bot views |  [optional] |
| **botProviderList** | [**List<BotProviderListEnum>**](#Enum--BotProviderListEnum) | The list of bot providers used to filter bot views |  [optional] |
| **botProductList** | [**List<BotProductListEnum>**](#Enum--BotProductListEnum) | The list of bot products used to filter bot views |  [optional] |
| **botRecognitionFailureReasonList** | [**List<BotRecognitionFailureReasonListEnum>**](#Enum--BotRecognitionFailureReasonListEnum) | The list of bot recognition failure reasons used to filter bot views |  [optional] |
| **botIntentList** | **List&lt;String&gt;** | The list of bot intents used to filter bot views |  [optional] |
| **botFinalIntentList** | **List&lt;String&gt;** | The list of bot final intents used to filter bot views |  [optional] |
| **botSlotList** | **List&lt;String&gt;** | The list of bot slots used to filter bot views |  [optional] |
| **botResultList** | [**List<BotResultListEnum>**](#Enum--BotResultListEnum) | The list of bot results used to filter bot views |  [optional] |
| **blockedReasons** | [**List<BlockedReasonsEnum>**](#Enum--BlockedReasonsEnum) | The list of blocked reason used to filter action map constraints views |  [optional] |
| **isRecorded** | **Boolean** | Indicates filtering for recorded |  [optional] |
| **hasEvaluation** | **Boolean** | Indicates filtering for evaluation |  [optional] |
| **hasScoredEvaluation** | **Boolean** | Indicates filtering for scored evaluation |  [optional] |
| **emailDeliveryStatusList** | [**List<EmailDeliveryStatusListEnum>**](#Enum--EmailDeliveryStatusListEnum) | The list of email delivery statuses used to filter views |  [optional] |
| **isAgentOwnedCallback** | **Boolean** | Indicates filtering for agent owned callback interactions |  [optional] |
| **agentCallbackOwnerIds** | **List&lt;String&gt;** | The list of callback owners used to filter interactions |  [optional] |
| **transcriptTopics** | [**List&lt;TranscriptTopics&gt;**](TranscriptTopics) | The list of transcript topics requested in filter |  [optional] |
| **journeyFrequencyCapReasons** | **List&lt;String&gt;** | The list of frequency cap reasons to filter offer constraints |  [optional] |
| **journeyBlockingActionMapIds** | **List&lt;String&gt;** | The list of blocking action maps to filter offer constraints |  [optional] |
| **journeyActionTargetIds** | **List&lt;String&gt;** | The list of action targets to filter offer constraints |  [optional] |
| **journeyBlockingScheduleGroupIds** | **List&lt;String&gt;** | The list of blocking schedule groups to filter offer constraints |  [optional] |
| **journeyBlockingEmergencyScheduleGroupIds** | **List&lt;String&gt;** | The list of emergency schedule groups to filter offer constraints |  [optional] |
| **journeyUrlEqualConditions** | **List&lt;String&gt;** | The list of url equal conditions to filter offer constraints |  [optional] |
| **journeyUrlNotEqualConditions** | **List&lt;String&gt;** | The list of url not equal conditions to filter offer constraints |  [optional] |
| **journeyUrlStartsWithConditions** | **List&lt;String&gt;** | The list of url starts with conditions to filter offer constraints |  [optional] |
| **journeyUrlEndsWithConditions** | **List&lt;String&gt;** | The list of url ends with conditions to filter offer constraints |  [optional] |
| **journeyUrlContainsAnyConditions** | **List&lt;String&gt;** | The list of url contains any conditions to filter offer constraints |  [optional] |
| **journeyUrlNotContainsAnyConditions** | **List&lt;String&gt;** | The list of url not contains any conditions to filter offer constraints |  [optional] |
| **journeyUrlContainsAllConditions** | **List&lt;String&gt;** | The list of url contains all conditions to filter offer constraints |  [optional] |
| **journeyUrlNotContainsAllConditions** | **List&lt;String&gt;** | The list of url not contains all conditions to filter offer constraints |  [optional] |
| **flowMilestoneIds** | **List&lt;String&gt;** | The list of flow milestones to filter exports |  [optional] |
| **isAssessmentPassed** | **Boolean** | Filter to indicate if Agent passed assessment or not |  [optional] |
| **conversationInitiators** | **List&lt;String&gt;** | The list to filter based on Brands (Bot/User/Agent) or End User who initiated the first message in the conversation |  [optional] |
| **hasCustomerParticipated** | **Boolean** | Indicates if the customer has participated in an initiated conversation |  [optional] |
| **isAcdInteraction** | **Boolean** | Filter to indicate if interaction was ACD or non-ACD |  [optional] |
| **hasFax** | **Boolean** | Filters to indicate if interaction has FAX |  [optional] |
| **dataActionIds** | **List&lt;String&gt;** | The list of Data Action IDs  |  [optional] |
| **actionCategoryName** | **String** | Deprecated - Please use integrationIds instead |  [optional] |
| **integrationIds** | **List&lt;String&gt;** | The list of integration IDs for Data Action |  [optional] |
| **responseStatuses** | **List&lt;String&gt;** | The list of Response codes for Data Action |  [optional] |
| **availableDashboard** | [**AvailableDashboardEnum**](#Enum--AvailableDashboardEnum) | Filter to indicate the availability of the dashboard is public or private. |  [optional] |
| **favouriteDashboard** | **Boolean** | Filter to indicate whether the dashboard is favorite or unfavorite. |  [optional] |
| **myDashboard** | **Boolean** | Filter to indicate the dashboard owned by the user. |  [optional] |
| **stationErrors** | **List&lt;String&gt;** | The list of agent errors that are related to station |  [optional] |
| **canonicalContactIds** | **List&lt;String&gt;** | The canonical contact ids are used to filter the view |  [optional] |
| **alertRuleIds** | **List&lt;String&gt;** | The list of Alert Rule IDs |  [optional] |
| **evaluationFormContextIds** | **List&lt;String&gt;** | The list of Evaluation Form Context IDs |  [optional] |
| **evaluationStatuses** | [**List<EvaluationStatusesEnum>**](#Enum--EvaluationStatusesEnum) | The evaluation statuses that are used to filter the view |  [optional] |
| **workbinIds** | **List&lt;String&gt;** | The list of Workbin IDs |  [optional] |
| **worktypeIds** | **List&lt;String&gt;** | The list of Worktype IDs |  [optional] |
| **workitemIds** | **List&lt;String&gt;** | The list of Workitem IDs |  [optional] |
| **workitemAssigneeIds** | **List&lt;String&gt;** | The list of Workitem Assignee IDs |  [optional] |
| **workitemStatuses** | **List&lt;String&gt;** | The list of Workitem Statuses IDs |  [optional] |
| **isAnalyzedForSensitiveData** | **Boolean** | Deprecated - Use hasPciData or hasPiiData instead. |  [optional] |
| **hasSensitiveData** | **Boolean** | Deprecated. Use hasPciData or hasPiiData instead. |  [optional] |
| **hasPciData** | **Boolean** | Filter to indicate the transcript contains Pci data. |  [optional] |
| **hasPiiData** | **Boolean** | Filter to indicate the transcript contains Pii data. |  [optional] |
| **subPath** | **String** | Filter for Sub Path |  [optional] |
| **userState** | [**UserStateEnum**](#Enum--UserStateEnum) | The user supplied state value in the view |  [optional] |
| **isClearedByCustomer** | **Boolean** | Filter to indicate if the customer cleared the conversation. |  [optional] |
| **evaluationAssigneeIds** | **List&lt;String&gt;** | The evaluation assignee ids that are used to filter the view. |  [optional] |
| **evaluationAssigned** | **Boolean** | Filter to indicate that the user has no assigned evaluation. |  [optional] |
| **assistantIds** | **List&lt;String&gt;** | The assistant ids that are used to filter the view. |  [optional] |
| **knowledgeBaseIds** | **List&lt;String&gt;** | The knowledge base ids that are used to filter the view. |  [optional] |
| **isParked** | **Boolean** | Filter to indicate if the interactions are parked. |  [optional] |
| **agentEmpathyScore** | [**NumericRange**](NumericRange) | The agentEmpathyScore is used to filter the view |  [optional] |
| **surveyTypes** | [**List<SurveyTypesEnum>**](#Enum--SurveyTypesEnum) | The surveyTypes is used to filter the view |  [optional] |
| **surveyResponseStatuses** | [**List<SurveyResponseStatusesEnum>**](#Enum--SurveyResponseStatusesEnum) | The list of Survey Response Status |  [optional] |
| **botFlowTypes** | [**List<BotFlowTypesEnum>**](#Enum--BotFlowTypesEnum) | The botFlowTypes is used to filter the view |  [optional] |
| **agentTalkDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The agent talk durations in milliseconds used to filter the view |  [optional] |
| **customerTalkDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The customer talk durations in milliseconds used to filter the view |  [optional] |
| **overtalkDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The overtalk durations in milliseconds used to filter the view |  [optional] |
| **silenceDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The silence durations in milliseconds used to filter the view |  [optional] |
| **acdDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The acd durations in milliseconds used to filter the view |  [optional] |
| **ivrDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The ivr durations in milliseconds used to filter the view |  [optional] |
| **otherDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The other (hold/music) durations in milliseconds used to filter the view |  [optional] |
| **agentTalkPercentage** | [**NumericRange**](NumericRange) | The agent talk percentage used to filter the view |  [optional] |
| **customerTalkPercentage** | [**NumericRange**](NumericRange) | The customer talk percentage used to filter the view |  [optional] |
| **overtalkPercentage** | [**NumericRange**](NumericRange) | The overtalk percentage used to filter the view |  [optional] |
| **silencePercentage** | [**NumericRange**](NumericRange) | The silence percentage used to filter the view |  [optional] |
| **acdPercentage** | [**NumericRange**](NumericRange) | The acd percentage used to filter the view |  [optional] |
| **ivrPercentage** | [**NumericRange**](NumericRange) | The ivr percentage used to filter the view |  [optional] |
| **otherPercentage** | [**NumericRange**](NumericRange) | The other (hold/music percentage used to filter the view |  [optional] |
| **overtalkInstances** | [**NumericRange**](NumericRange) | The overtalk instance range used to filter the view |  [optional] |
| **isScreenRecorded** | **Boolean** | Filter to indicate if the screen is recorded |  [optional] |
| **screenMonitorUserIds** | **List&lt;String&gt;** | The list of Screen Monitor User Ids |  [optional] |
| **dashboardState** | [**DashboardStateEnum**](#Enum--DashboardStateEnum) | The state of dashboard being filtered |  [optional] |
| **dashboardType** | [**DashboardTypeEnum**](#Enum--DashboardTypeEnum) | The type of dashboard being filtered |  [optional] |
| **dashboardAccessFilter** | [**DashboardAccessFilterEnum**](#Enum--DashboardAccessFilterEnum) | The type of dashboard access being filtered |  [optional] |
| **transcriptDurationMilliseconds** | [**List&lt;NumericRange&gt;**](NumericRange) | The transcript durations in milliseconds used to filter the view |  [optional] |
| **workitemsStatuses** | [**List&lt;WorkitemStatusFilter&gt;**](WorkitemStatusFilter) | The list of workitem status with worktype |  [optional] |
| **socialCountries** | **List&lt;String&gt;** | List of countries for social filtering |  [optional] |
| **socialLanguages** | **List&lt;String&gt;** | List of languages for social filtering |  [optional] |
| **socialChannels** | [**List<SocialChannelsEnum>**](#Enum--SocialChannelsEnum) | List of channels for social filtering |  [optional] |
| **socialSentimentCategory** | [**List<SocialSentimentCategoryEnum>**](#Enum--SocialSentimentCategoryEnum) | The sentiment of the social post |  [optional] |
| **socialTopicIds** | **List&lt;String&gt;** | The list of topicIds for social filtering |  [optional] |
| **socialIngestionRuleIds** | **List&lt;String&gt;** | The list of ingestion ruleIds for social filtering |  [optional] |
| **socialConversationCreated** | **Boolean** | Filter to indicate if the post has created a conversation |  [optional] |
| **socialContentType** | [**List<SocialContentTypeEnum>**](#Enum--SocialContentTypeEnum) | The list of content Type for social filtering |  [optional] |
| **socialKeywords** | [**List&lt;SocialKeyword&gt;**](SocialKeyword) | The list of keywords for social filtering |  [optional] |
| **socialPostEscalated** | **Boolean** | Filter to indicate if the post is escalated |  [optional] |
| **socialClassifications** | [**List<SocialClassificationsEnum>**](#Enum--SocialClassificationsEnum) | Indicates if a social message was public or private |  [optional] |
| **filterUsersByManagerIds** | **List&lt;String&gt;** | The manager ids used to fetch associated users for the view |  [optional] |
| **slideshowIds** | **List&lt;String&gt;** | List of Dashboard slideshowIds to be filtered |  [optional] |
| **conferenced** | **Boolean** | Filter to indicate if the conversation has conference |  [optional] |
| **video** | **Boolean** | Filter to indicate if the conversation has video |  [optional] |
| **linkedInteraction** | **Boolean** | Filter to indicate if the conversation has linked interaction |  [optional] |
| **recommendationSources** | [**List<RecommendationSourcesEnum>**](#Enum--RecommendationSourcesEnum) | List of recommendation sources for filtering recommendation details pane |  [optional] |
| **evaluationRole** | [**EvaluationRoleEnum**](#Enum--EvaluationRoleEnum) | Sets the role when viewing agent evaluations |  [optional] |
| **comparisonQueueIds** | **List&lt;String&gt;** | The queue ids are used to for comparison to the primary queue filter in reporting |  [optional] |
| **viewMetrics** | [**List<ViewMetricsEnum>**](#Enum--ViewMetricsEnum) | A list of metrics selected for the view |  [optional] |
| **timelineCategories** | **List&lt;String&gt;** | A list of timeline categories |  [optional] |
| **acw** | **Boolean** | Filter to indicate for acw state |  [optional] |
| **segmentTypes** | [**List<SegmentTypesEnum>**](#Enum--SegmentTypesEnum) | A list of filtered segment types |  [optional] |
| **programIds** | **List&lt;String&gt;** | A list of program ids for filtering |  [optional] |
| **categoryIds** | **List&lt;String&gt;** | A list of category ids for filtering |  [optional] |
| **deliveryPushed** | **Boolean** | Filter to indicate if push notification is sent |  [optional] |
| **socialRatings** | **List&lt;Float&gt;** | A set of ratings for Google Business Profile |  [optional] |
| **virtualAgentIds** | **List&lt;String&gt;** | A list of virtual agent ids for filtering. |  [optional] |


## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALLBACK | &quot;callback&quot; |
| CHAT | &quot;chat&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| EMAIL | &quot;email&quot; |
| INTERNALMESSAGE | &quot;internalmessage&quot; |
| MESSAGE | &quot;message&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| VOICE | &quot;voice&quot; |


## Enum: DirectionsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |


## Enum: OriginatingDirectionsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |


## Enum: MessageTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SMS | &quot;sms&quot; |
| TWITTER | &quot;twitter&quot; |
| LINE | &quot;line&quot; |
| FACEBOOK | &quot;facebook&quot; |
| WHATSAPP | &quot;whatsapp&quot; |
| WEBMESSAGING | &quot;webmessaging&quot; |
| OPEN | &quot;open&quot; |
| INSTAGRAM | &quot;instagram&quot; |
| APPLE | &quot;apple&quot; |


## Enum: FlowOutcomeValuesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |


## Enum: FlowDestinationTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACD | &quot;ACD&quot; |
| USER | &quot;USER&quot; |
| GROUP | &quot;GROUP&quot; |
| NUMBER | &quot;NUMBER&quot; |
| FLOW | &quot;FLOW&quot; |
| SECURE_FLOW | &quot;SECURE_FLOW&quot; |
| ACD_VOICEMAIL | &quot;ACD_VOICEMAIL&quot; |
| USER_VOICEMAIL | &quot;USER_VOICEMAIL&quot; |
| GROUP_VOICEMAIL | &quot;GROUP_VOICEMAIL&quot; |
| RETURN_TO_AGENT | &quot;RETURN_TO_AGENT&quot; |


## Enum: FlowDisconnectReasonsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FLOW_DISCONNECT | &quot;FLOW_DISCONNECT&quot; |
| FLOW_ERROR_DISCONNECT | &quot;FLOW_ERROR_DISCONNECT&quot; |
| DISCONNECT | &quot;DISCONNECT&quot; |


## Enum: FlowTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BOT | &quot;bot&quot; |
| COMMONMODULE | &quot;commonmodule&quot; |
| DIGITALBOT | &quot;digitalbot&quot; |
| INBOUNDCALL | &quot;inboundcall&quot; |
| INBOUNDCHAT | &quot;inboundchat&quot; |
| INBOUNDEMAIL | &quot;inboundemail&quot; |
| INBOUNDSHORTMESSAGE | &quot;inboundshortmessage&quot; |
| INQUEUECALL | &quot;inqueuecall&quot; |
| INQUEUESHORTMESSAGE | &quot;inqueueshortmessage&quot; |
| INQUEUEEMAIL | &quot;inqueueemail&quot; |
| OUTBOUNDCALL | &quot;outboundcall&quot; |
| SECURECALL | &quot;securecall&quot; |
| SURVEYINVITE | &quot;surveyinvite&quot; |
| VOICE | &quot;voice&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| VOICESURVEY | &quot;voicesurvey&quot; |
| WORKFLOW | &quot;workflow&quot; |
| WORKITEM | &quot;workitem&quot; |


## Enum: FlowEntryTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AGENT | &quot;agent&quot; |
| DIRECT | &quot;direct&quot; |
| DNIS | &quot;dnis&quot; |
| FLOW | &quot;flow&quot; |
| OUTBOUND | &quot;outbound&quot; |


## Enum: UsedRoutingTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| DIRECT | &quot;Direct&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
| VIP | &quot;Vip&quot; |


## Enum: RequestedRoutingTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| DIRECT | &quot;Direct&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
| VIP | &quot;Vip&quot; |


## Enum: ParticipantPurposesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INTERNAL | &quot;internal&quot; |
| EXTERNAL | &quot;external&quot; |


## Enum: JourneyActionMapTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| WEBCHAT | &quot;webchat&quot; |
| WEBMESSAGINGOFFER | &quot;webMessagingOffer&quot; |
| CONTENTOFFER | &quot;contentOffer&quot; |
| INTEGRATIONACTION | &quot;integrationAction&quot; |
| ARCHITECTFLOW | &quot;architectFlow&quot; |
| OPENACTION | &quot;openAction&quot; |


## Enum: DevelopmentRoleListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CREATOR | &quot;Creator&quot; |
| FACILITATOR | &quot;Facilitator&quot; |
| ATTENDEE | &quot;Attendee&quot; |


## Enum: DevelopmentTypeListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INFORMATIONAL | &quot;Informational&quot; |
| COACHING | &quot;Coaching&quot; |
| ASSESSMENT | &quot;Assessment&quot; |
| ASSESSEDCONTENT | &quot;AssessedContent&quot; |
| EXTERNAL | &quot;External&quot; |
| NATIVE | &quot;Native&quot; |


## Enum: DevelopmentStatusListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PLANNED | &quot;Planned&quot; |
| SCHEDULED | &quot;Scheduled&quot; |
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; |
| INPROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| NOTCOMPLETED | &quot;NotCompleted&quot; |


## Enum: BotMessageTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| PHONE | &quot;Phone&quot; |
| SMS | &quot;SMS&quot; |
| GENESYSCHATWIDGET | &quot;GenesysChatWidget&quot; |
| FACEBOOKMESSENGER | &quot;FacebookMessenger&quot; |
| WECHAT | &quot;WeChat&quot; |
| WHATSAPP | &quot;Whatsapp&quot; |
| APPLEBUSINESSCHAT | &quot;AppleBusinessChat&quot; |
| TELEGRAM | &quot;Telegram&quot; |
| SLACK | &quot;Slack&quot; |
| SIGNAL | &quot;Signal&quot; |
| LINE | &quot;Line&quot; |
| DISCORD | &quot;Discord&quot; |
| TWITTERDIRECTMESSAGE | &quot;TwitterDirectMessage&quot; |
| OPEN | &quot;Open&quot; |
| INSTAGRAM | &quot;Instagram&quot; |
| APPLE | &quot;Apple&quot; |
| OTHER | &quot;Other&quot; |


## Enum: BotProviderListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| GENESYS | &quot;Genesys&quot; |
| AMAZON | &quot;Amazon&quot; |
| GOOGLE | &quot;Google&quot; |
| NUANCE | &quot;Nuance&quot; |


## Enum: BotProductListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| GENESYSDIALOGENGINE | &quot;GenesysDialogEngine&quot; |
| AMAZONLEX | &quot;AmazonLex&quot; |
| GOOGLEDIALOGFLOW | &quot;GoogleDialogFlow&quot; |
| GOOGLEDIALOGFLOWRESELL | &quot;GoogleDialogFlowResell&quot; |
| GENESYSBOTFLOW | &quot;GenesysBotFlow&quot; |
| NUANCEDLG | &quot;NuanceDlg&quot; |
| GOOGLEDIALOGFLOWCX | &quot;GoogleDialogFlowCx&quot; |
| GENESYSBYOB | &quot;GenesysByob&quot; |
| AMAZONLEXV2 | &quot;AmazonLexV2&quot; |
| GOOGLEDIALOGFLOWCXRESELL | &quot;GoogleDialogFlowCxResell&quot; |
| GOOGLESTTBOTFLOW | &quot;GoogleSttBotFlow&quot; |
| MICROSOFTSTTBOTFLOW | &quot;MicrosoftSttBotFlow&quot; |
| AUDIOCONNECTOR | &quot;AudioConnector&quot; |
| BOTCONNECTOR | &quot;BotConnector&quot; |


## Enum: BotRecognitionFailureReasonListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| NOINPUTCOLLECTION | &quot;NoInputCollection&quot; |
| NOINPUTCONFIRMATION | &quot;NoInputConfirmation&quot; |
| NOINPUTDISAMBIGUATION | &quot;NoInputDisambiguation&quot; |
| NOMATCHCOLLECTION | &quot;NoMatchCollection&quot; |
| NOMATCHCONFIRMATION | &quot;NoMatchConfirmation&quot; |
| NOMATCHDISAMBIGUATION | &quot;NoMatchDisambiguation&quot; |
| MAXWRONGMATCH | &quot;MaxWrongMatch&quot; |
| ALLOPTIONSREJECTED | &quot;AllOptionsRejected&quot; |


## Enum: BotResultListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| EXITREQUESTEDBYUSER | &quot;ExitRequestedByUser&quot; |
| EXITREQUESTEDBYBOT | &quot;ExitRequestedByBot&quot; |
| EXITERROR | &quot;ExitError&quot; |
| EXITRECOGNITIONFAILURE | &quot;ExitRecognitionFailure&quot; |
| DISCONNECTREQUESTEDBYUSER | &quot;DisconnectRequestedByUser&quot; |
| DISCONNECTREQUESTEDBYBOT | &quot;DisconnectRequestedByBot&quot; |
| DISCONNECTSESSIONEXPIRED | &quot;DisconnectSessionExpired&quot; |
| DISCONNECTERROR | &quot;DisconnectError&quot; |
| DISCONNECTRECOGNITIONFAILURE | &quot;DisconnectRecognitionFailure&quot; |
| TRANSFERTOACD | &quot;TransferToACD&quot; |
| TRANSFERTOUSER | &quot;TransferToUser&quot; |
| TRANSFERTOGROUP | &quot;TransferToGroup&quot; |
| TRANSFERTONUMBER | &quot;TransferToNumber&quot; |
| TRANSFERTOUSERVOICEMAIL | &quot;TransferToUserVoicemail&quot; |
| TRANSFERTOGROUPVOICEMAIL | &quot;TransferToGroupVoicemail&quot; |
| TRANSFERTOACDVOICEMAIL | &quot;TransferToACDVoicemail&quot; |


## Enum: BlockedReasonsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PAGEURLCONDITIONSNOTMATCHING | &quot;PageUrlConditionsNotMatching&quot; |
| ALREADYEXISTINGOFFER | &quot;AlreadyExistingOffer&quot; |
| TRIGGERDATEINFUTURE | &quot;TriggerDateInFuture&quot; |
| MULTIPLESIMULTANEOUSOFFERS | &quot;MultipleSimultaneousOffers&quot; |
| FREQUENCYCAPPING | &quot;FrequencyCapping&quot; |
| OFFEREDOUTSIDESCHEDULE | &quot;OfferedOutsideSchedule&quot; |
| SERVICELEVELTHROTTLING | &quot;ServiceLevelThrottling&quot; |
| NOAVAILABLEAGENTS | &quot;NoAvailableAgents&quot; |


## Enum: EmailDeliveryStatusListEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DELIVERYFAILED | &quot;DeliveryFailed&quot; |
| DELIVERYPUSHED | &quot;DeliveryPushed&quot; |
| DELIVERYSUCCESS | &quot;DeliverySuccess&quot; |
| FAILED | &quot;Failed&quot; |
| PUBLISHED | &quot;Published&quot; |
| QUEUED | &quot;Queued&quot; |
| READ | &quot;Read&quot; |
| RECEIVED | &quot;Received&quot; |
| SENT | &quot;Sent&quot; |


## Enum: AvailableDashboardEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;Public&quot; | 
| PRIVATE | &quot;Private&quot; | 


## Enum: EvaluationStatusesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FINISHED | &quot;Finished&quot; |
| INPROGRESS | &quot;InProgress&quot; |
| INREVIEW | &quot;InReview&quot; |
| PENDING | &quot;Pending&quot; |
| RETRACTED | &quot;Retracted&quot; |


## Enum: UserStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVEANDINACTIVE | &quot;ActiveAndInactive&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| DELETED | &quot;Deleted&quot; | 


## Enum: SurveyTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| WEB | &quot;Web&quot; |
| VOICE | &quot;Voice&quot; |


## Enum: SurveyResponseStatusesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| FULLRESPONSE | &quot;FullResponse&quot; |
| PARTIALRESPONSE | &quot;PartialResponse&quot; |


## Enum: BotFlowTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| BOT | &quot;Bot&quot; |
| DIGITALBOT | &quot;DigitalBot&quot; |
| VOICESURVEY | &quot;VoiceSurvey&quot; |


## Enum: DashboardStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| DELETED | &quot;Deleted&quot; | 


## Enum: DashboardTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| PUBLIC | &quot;Public&quot; | 
| PRIVATE | &quot;Private&quot; | 
| SHARED | &quot;Shared&quot; | 
| FAVORITES | &quot;Favorites&quot; | 


## Enum: DashboardAccessFilterEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OWNEDBYME | &quot;OwnedByMe&quot; | 
| OWNEDBYANYONE | &quot;OwnedByAnyone&quot; | 
| NOTOWNEDBYME | &quot;NotOwnedByMe&quot; | 


## Enum: SocialChannelsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TWITTER | &quot;Twitter&quot; |
| FACEBOOK | &quot;Facebook&quot; |
| INSTAGRAM | &quot;Instagram&quot; |
| OPEN | &quot;Open&quot; |
| GOOGLEBUSINESSPROFILE | &quot;GoogleBusinessProfile&quot; |


## Enum: SocialSentimentCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| POSITIVE | &quot;Positive&quot; |
| NEGATIVE | &quot;Negative&quot; |
| NEUTRAL | &quot;Neutral&quot; |
| UNKNOWN | &quot;Unknown&quot; |


## Enum: SocialContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TEXT | &quot;Text&quot; |
| IMAGE | &quot;Image&quot; |
| VIDEO | &quot;Video&quot; |


## Enum: SocialClassificationsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PUBLIC | &quot;Public&quot; |
| PRIVATE | &quot;Private&quot; |


## Enum: RecommendationSourcesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| KNOWLEDGESEARCH | &quot;KnowledgeSearch&quot; |
| RULESENGINE | &quot;RulesEngine&quot; |
| MANUALSEARCH | &quot;ManualSearch&quot; |


## Enum: EvaluationRoleEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVALUATOR | &quot;Evaluator&quot; | 
| SUPERVISOR | &quot;Supervisor&quot; | 


## Enum: ViewMetricsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AVG_TALK_TIME | &quot;AVG_TALK_TIME&quot; |
| AVG_HOLD_TIME | &quot;AVG_HOLD_TIME&quot; |
| AVG_ACW_TIME | &quot;AVG_ACW_TIME&quot; |
| AVG_WAIT_TIME | &quot;AVG_WAIT_TIME&quot; |
| AVG_HANDLE_TIME | &quot;AVG_HANDLE_TIME&quot; |
| AVG_ALERT_TIME | &quot;AVG_ALERT_TIME&quot; |
| AVG_ANSWER_TIME | &quot;AVG_ANSWER_TIME&quot; |
| AVG_ABANDON_TIME | &quot;AVG_ABANDON_TIME&quot; |
| TOTAL_TALK_TIME | &quot;TOTAL_TALK_TIME&quot; |
| TOTAL_HANDLE_TIME | &quot;TOTAL_HANDLE_TIME&quot; |
| TOTAL_HOLD_TIME | &quot;TOTAL_HOLD_TIME&quot; |
| TOTAL_ACW_TIME | &quot;TOTAL_ACW_TIME&quot; |
| TOTAL_ALERT_TIME | &quot;TOTAL_ALERT_TIME&quot; |
| MAX_ABANDON_TIME | &quot;MAX_ABANDON_TIME&quot; |
| MAX_WAIT_TIME | &quot;MAX_WAIT_TIME&quot; |
| MAX_TALK_TIME | &quot;MAX_TALK_TIME&quot; |
| MAX_HOLD_TIME | &quot;MAX_HOLD_TIME&quot; |
| MAX_ACW_TIME | &quot;MAX_ACW_TIME&quot; |
| MIN_ABANDON_TIME | &quot;MIN_ABANDON_TIME&quot; |
| MIN_WAIT_TIME | &quot;MIN_WAIT_TIME&quot; |
| MIN_TALK_TIME | &quot;MIN_TALK_TIME&quot; |
| MIN_HOLD_TIME | &quot;MIN_HOLD_TIME&quot; |
| MIN_ACW_TIME | &quot;MIN_ACW_TIME&quot; |
| ALERT_COUNT | &quot;ALERT_COUNT&quot; |
| OFFERED_COUNT | &quot;OFFERED_COUNT&quot; |
| ABANDONED_COUNT | &quot;ABANDONED_COUNT&quot; |
| ABANDONED_PERCENT | &quot;ABANDONED_PERCENT&quot; |
| SHORT_ABANDONED_COUNT | &quot;SHORT_ABANDONED_COUNT&quot; |
| SHORT_ABANDONED_PERCENT | &quot;SHORT_ABANDONED_PERCENT&quot; |
| ABANDONED_NO_SHORT_COUNT | &quot;ABANDONED_NO_SHORT_COUNT&quot; |
| ABANDONED_NO_SHORT_PERCENT | &quot;ABANDONED_NO_SHORT_PERCENT&quot; |
| ANSWERED_COUNT | &quot;ANSWERED_COUNT&quot; |
| ANSWERED_PERCENT | &quot;ANSWERED_PERCENT&quot; |
| FLOWOUT_COUNT | &quot;FLOWOUT_COUNT&quot; |
| FLOWOUT_PERCENT | &quot;FLOWOUT_PERCENT&quot; |
| OUTBOUND_COUNT | &quot;OUTBOUND_COUNT&quot; |
| OUTBOUND_ATTEMPTED_COUNT | &quot;OUTBOUND_ATTEMPTED_COUNT&quot; |
| VOICEMAIL_COUNT | &quot;VOICEMAIL_COUNT&quot; |
| HANDLED_COUNT | &quot;HANDLED_COUNT&quot; |
| HELD_COUNT | &quot;HELD_COUNT&quot; |
| TRANSFERRED_COUNT | &quot;TRANSFERRED_COUNT&quot; |
| TRANSFERRED_PERCENT | &quot;TRANSFERRED_PERCENT&quot; |
| WAITING_CURRENT | &quot;WAITING_CURRENT&quot; |
| INTERACTING_CURRENT | &quot;INTERACTING_CURRENT&quot; |
| HELD_CURRENT | &quot;HELD_CURRENT&quot; |
| ALERTING_CURRENT | &quot;ALERTING_CURRENT&quot; |
| SERVICE_LEVEL | &quot;SERVICE_LEVEL&quot; |
| OVER_SERVICE_LEVEL | &quot;OVER_SERVICE_LEVEL&quot; |
| ONLINE_AGENTS | &quot;ONLINE_AGENTS&quot; |
| AVAILABLE_AGENTS | &quot;AVAILABLE_AGENTS&quot; |
| AWAY_AGENTS | &quot;AWAY_AGENTS&quot; |
| BREAK_AGENTS | &quot;BREAK_AGENTS&quot; |
| MEAL_AGENTS | &quot;MEAL_AGENTS&quot; |
| TRAINING_AGENTS | &quot;TRAINING_AGENTS&quot; |
| BUSY_AGENTS | &quot;BUSY_AGENTS&quot; |
| MEETING_AGENTS | &quot;MEETING_AGENTS&quot; |
| SYSTEM_AWAY_AGENTS | &quot;SYSTEM_AWAY_AGENTS&quot; |
| OFFLINE_AGENTS | &quot;OFFLINE_AGENTS&quot; |
| ON_QUEUE_AGENTS | &quot;ON_QUEUE_AGENTS&quot; |
| OFF_QUEUE_AGENTS | &quot;OFF_QUEUE_AGENTS&quot; |
| INTERACTING_AGENTS | &quot;INTERACTING_AGENTS&quot; |
| ACW_AGENTS | &quot;ACW_AGENTS&quot; |
| COMMUNICATING_AGENTS | &quot;COMMUNICATING_AGENTS&quot; |
| IDLE_AGENTS | &quot;IDLE_AGENTS&quot; |
| NOT_RESPONDING_AGENTS | &quot;NOT_RESPONDING_AGENTS&quot; |
| LONGEST_WAITING | &quot;LONGEST_WAITING&quot; |
| LONGEST_INTERACTING | &quot;LONGEST_INTERACTING&quot; |
| FLOW_ACTIVE_LONGEST | &quot;FLOW_ACTIVE_LONGEST&quot; |
| FLOW_ACTIVE_CURRENT | &quot;FLOW_ACTIVE_CURRENT&quot; |
| FLOW_ENTRIES_COUNT | &quot;FLOW_ENTRIES_COUNT&quot; |
| FLOW_TOTAL_DURATION | &quot;FLOW_TOTAL_DURATION&quot; |
| FLOW_MAX_DURATION | &quot;FLOW_MAX_DURATION&quot; |
| FLOW_AVG_DURATION | &quot;FLOW_AVG_DURATION&quot; |
| FLOW_DISCONNECT_COUNT | &quot;FLOW_DISCONNECT_COUNT&quot; |
| FLOW_DISCONNECT_PERCENT | &quot;FLOW_DISCONNECT_PERCENT&quot; |
| FLOW_TOTAL_DISCONNECT_DURATION | &quot;FLOW_TOTAL_DISCONNECT_DURATION&quot; |
| FLOW_AVG_DISCONNECT_DURATION | &quot;FLOW_AVG_DISCONNECT_DURATION&quot; |
| FLOW_MAX_DISCONNECT_DURATION | &quot;FLOW_MAX_DISCONNECT_DURATION&quot; |
| FLOW_FLOW_DISCONNECT | &quot;FLOW_FLOW_DISCONNECT&quot; |
| FLOW_FLOW_DISCONNECT_PERCENT | &quot;FLOW_FLOW_DISCONNECT_PERCENT&quot; |
| FLOW_SYSTEM_ERROR_DISCONNECT | &quot;FLOW_SYSTEM_ERROR_DISCONNECT&quot; |
| FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT | &quot;FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT&quot; |
| FLOW_CUSTOMER_DISCONNECT | &quot;FLOW_CUSTOMER_DISCONNECT&quot; |
| FLOW_CUSTOMER_DISCONNECT_PERCENT | &quot;FLOW_CUSTOMER_DISCONNECT_PERCENT&quot; |
| FLOW_SHORT_DISCONNECT | &quot;FLOW_SHORT_DISCONNECT&quot; |
| FLOW_SHORT_DISCONNECT_PERCENT | &quot;FLOW_SHORT_DISCONNECT_PERCENT&quot; |
| FLOW_EXIT_COUNT | &quot;FLOW_EXIT_COUNT&quot; |
| FLOW_EXIT_PERCENT | &quot;FLOW_EXIT_PERCENT&quot; |
| FLOW_TOTAL_EXIT_DURATION | &quot;FLOW_TOTAL_EXIT_DURATION&quot; |
| FLOW_MAX_EXIT_DURATION | &quot;FLOW_MAX_EXIT_DURATION&quot; |
| FLOW_AVG_EXIT_DURATION | &quot;FLOW_AVG_EXIT_DURATION&quot; |
| FLOW_ACD_EXIT_COUNT | &quot;FLOW_ACD_EXIT_COUNT&quot; |
| FLOW_ACD_EXIT_PERCENT | &quot;FLOW_ACD_EXIT_PERCENT&quot; |
| FLOW_GROUP_EXIT_COUNT | &quot;FLOW_GROUP_EXIT_COUNT&quot; |
| FLOW_GROUP_EXIT_PERCENT | &quot;FLOW_GROUP_EXIT_PERCENT&quot; |
| FLOW_NUMBER_EXIT_COUNT | &quot;FLOW_NUMBER_EXIT_COUNT&quot; |
| FLOW_NUMBER_EXIT_PERCENT | &quot;FLOW_NUMBER_EXIT_PERCENT&quot; |
| FLOW_USER_EXIT_COUNT | &quot;FLOW_USER_EXIT_COUNT&quot; |
| FLOW_USER_EXIT_PERCENT | &quot;FLOW_USER_EXIT_PERCENT&quot; |
| FLOW_FLOW_EXIT_COUNT | &quot;FLOW_FLOW_EXIT_COUNT&quot; |
| FLOW_FLOW_EXIT_PERCENT | &quot;FLOW_FLOW_EXIT_PERCENT&quot; |
| FLOW_SECURE_FLOW_EXIT_COUNT | &quot;FLOW_SECURE_FLOW_EXIT_COUNT&quot; |
| FLOW_SECURE_FLOW_EXIT_PERCENT | &quot;FLOW_SECURE_FLOW_EXIT_PERCENT&quot; |
| FLOW_ACD_VOICEMAIL_EXIT_COUNT | &quot;FLOW_ACD_VOICEMAIL_EXIT_COUNT&quot; |
| FLOW_ACD_VOICEMAIL_EXIT_PERCENT | &quot;FLOW_ACD_VOICEMAIL_EXIT_PERCENT&quot; |
| FLOW_USER_VOICEMAIL_EXIT_COUNT | &quot;FLOW_USER_VOICEMAIL_EXIT_COUNT&quot; |
| FLOW_USER_VOICEMAIL_EXIT_PERCENT | &quot;FLOW_USER_VOICEMAIL_EXIT_PERCENT&quot; |
| FLOW_OUTCOME_COUNT | &quot;FLOW_OUTCOME_COUNT&quot; |
| FLOW_AVG_OUTCOME_DECIMAL | &quot;FLOW_AVG_OUTCOME_DECIMAL&quot; |
| FLOW_OUTCOME_FAILURE_COUNT | &quot;FLOW_OUTCOME_FAILURE_COUNT&quot; |
| FLOW_OUTCOME_FAILURE_PERCENT | &quot;FLOW_OUTCOME_FAILURE_PERCENT&quot; |
| FLOW_OUTCOME_SUCCESS_COUNT | &quot;FLOW_OUTCOME_SUCCESS_COUNT&quot; |
| FLOW_OUTCOME_SUCCESS_PERCENT | &quot;FLOW_OUTCOME_SUCCESS_PERCENT&quot; |
| FLOW_OUTCOME_TOTAL_DURATION | &quot;FLOW_OUTCOME_TOTAL_DURATION&quot; |
| FLOW_OUTCOME_MAX_DURATION | &quot;FLOW_OUTCOME_MAX_DURATION&quot; |
| FLOW_OUTCOME_AVG_DURATION | &quot;FLOW_OUTCOME_AVG_DURATION&quot; |
| FLOW_OUTCOME_MIN_DURATION | &quot;FLOW_OUTCOME_MIN_DURATION&quot; |
| OFF_QUEUE_TIME | &quot;OFF_QUEUE_TIME&quot; |
| OFF_QUEUE_PERCENT | &quot;OFF_QUEUE_PERCENT&quot; |
| AVAILABLE_TIME | &quot;AVAILABLE_TIME&quot; |
| AVAILABLE_PERCENT | &quot;AVAILABLE_PERCENT&quot; |
| BUSY_TIME | &quot;BUSY_TIME&quot; |
| BUSY_PERCENT | &quot;BUSY_PERCENT&quot; |
| AWAY_TIME | &quot;AWAY_TIME&quot; |
| AWAY_PERCENT | &quot;AWAY_PERCENT&quot; |
| BREAK_TIME | &quot;BREAK_TIME&quot; |
| BREAK_PERCENT | &quot;BREAK_PERCENT&quot; |
| MEAL_TIME | &quot;MEAL_TIME&quot; |
| MEAL_PERCENT | &quot;MEAL_PERCENT&quot; |
| MEETING_TIME | &quot;MEETING_TIME&quot; |
| MEETING_PERCENT | &quot;MEETING_PERCENT&quot; |
| TRAINING_TIME | &quot;TRAINING_TIME&quot; |
| TRAINING_PERCENT | &quot;TRAINING_PERCENT&quot; |
| INTERACTING_TIME | &quot;INTERACTING_TIME&quot; |
| INTERACTING_PERCENT | &quot;INTERACTING_PERCENT&quot; |
| COMMUNICATING_TIME | &quot;COMMUNICATING_TIME&quot; |
| COMMUNICATING_PERCENT | &quot;COMMUNICATING_PERCENT&quot; |
| SYSTEM_AWAY_TIME | &quot;SYSTEM_AWAY_TIME&quot; |
| SYSTEM_AWAY_PERCENT | &quot;SYSTEM_AWAY_PERCENT&quot; |
| ON_QUEUE_TIME | &quot;ON_QUEUE_TIME&quot; |
| ON_QUEUE_PERCENT | &quot;ON_QUEUE_PERCENT&quot; |
| IDLE_TIME | &quot;IDLE_TIME&quot; |
| IDLE_PERCENT | &quot;IDLE_PERCENT&quot; |
| NOT_RESPONDING_TIME | &quot;NOT_RESPONDING_TIME&quot; |
| NOT_RESPONDING_PERCENT | &quot;NOT_RESPONDING_PERCENT&quot; |
| LOGGED_IN_TIME | &quot;LOGGED_IN_TIME&quot; |
| OCCUPANCY_PERCENT | &quot;OCCUPANCY_PERCENT&quot; |
| MIN_ALERT_TIME | &quot;MIN_ALERT_TIME&quot; |
| MAX_ALERT_TIME | &quot;MAX_ALERT_TIME&quot; |
| MIN_HANDLE_TIME | &quot;MIN_HANDLE_TIME&quot; |
| MAX_HANDLE_TIME | &quot;MAX_HANDLE_TIME&quot; |
| MIN_ANSWERED_TIME | &quot;MIN_ANSWERED_TIME&quot; |
| MAX_ANSWERED_TIME | &quot;MAX_ANSWERED_TIME&quot; |
| MIN_NOT_RESPONDING_TIME | &quot;MIN_NOT_RESPONDING_TIME&quot; |
| MAX_NOT_RESPONDING_TIME | &quot;MAX_NOT_RESPONDING_TIME&quot; |
| MET_SERVICE_LEVEL | &quot;MET_SERVICE_LEVEL&quot; |
| WFM_ADHERENCE_STATUS | &quot;WFM_ADHERENCE_STATUS&quot; |
| WFM_SCHEDULED_ACTIVITY | &quot;WFM_SCHEDULED_ACTIVITY&quot; |
| WFM_ADHERENCE_DURATION | &quot;WFM_ADHERENCE_DURATION&quot; |
| AGENT_TITLE | &quot;AGENT_TITLE&quot; |
| AGENT_DEPARTMENT | &quot;AGENT_DEPARTMENT&quot; |
| AGENT_EXTENSION | &quot;AGENT_EXTENSION&quot; |
| AGENT_SKILLS | &quot;AGENT_SKILLS&quot; |
| AGENT_LOCATION | &quot;AGENT_LOCATION&quot; |
| AGENT_REPORTS_TO | &quot;AGENT_REPORTS_TO&quot; |
| AGENT_EMAIL | &quot;AGENT_EMAIL&quot; |
| AGENT_ROLE | &quot;AGENT_ROLE&quot; |
| AGENT_GROUP | &quot;AGENT_GROUP&quot; |
| AGENT_TIME_IN_STATUS | &quot;AGENT_TIME_IN_STATUS&quot; |
| AGENT_TIME_IN_ROUTING_STATUS | &quot;AGENT_TIME_IN_ROUTING_STATUS&quot; |
| AGENT_STATUS | &quot;AGENT_STATUS&quot; |
| AGENT_SECONDARY_STATUS | &quot;AGENT_SECONDARY_STATUS&quot; |
| AGENT_ROUTING_STATUS | &quot;AGENT_ROUTING_STATUS&quot; |
| AGENT_MEDIA_TYPES | &quot;AGENT_MEDIA_TYPES&quot; |
| ACW_COUNT | &quot;ACW_COUNT&quot; |
| ANSWER_TRANSFERRED_PERCENT | &quot;ANSWER_TRANSFERRED_PERCENT&quot; |
| FLOW_AVG_MILESTONE_DECIMAL | &quot;FLOW_AVG_MILESTONE_DECIMAL&quot; |
| NOT_RESPONDING_COUNT | &quot;NOT_RESPONDING_COUNT&quot; |
| AVG_ACW_HANDLED | &quot;AVG_ACW_HANDLED&quot; |
| AVG_CONTACTING_TIME | &quot;AVG_CONTACTING_TIME&quot; |
| AVG_DIALING_TIME | &quot;AVG_DIALING_TIME&quot; |
| AVG_FLOWOUT_TIME | &quot;AVG_FLOWOUT_TIME&quot; |
| AVG_HOLD_HANDLED | &quot;AVG_HOLD_HANDLED&quot; |
| AVG_MONITOR | &quot;AVG_MONITOR&quot; |
| BLIND_TRANSFER_COUNT | &quot;BLIND_TRANSFER_COUNT&quot; |
| BLIND_TRANSFER_PERCENT | &quot;BLIND_TRANSFER_PERCENT&quot; |
| CONNECTED_COUNT | &quot;CONNECTED_COUNT&quot; |
| CONSULT_COUNT | &quot;CONSULT_COUNT&quot; |
| CONSULT_TRANSFER_COUNT | &quot;CONSULT_TRANSFER_COUNT&quot; |
| CONSULT_TRANSFER_PERCENT | &quot;CONSULT_TRANSFER_PERCENT&quot; |
| CONTACTING_COUNT | &quot;CONTACTING_COUNT&quot; |
| DIALING_COUNT | &quot;DIALING_COUNT&quot; |
| ERROR_COUNT | &quot;ERROR_COUNT&quot; |
| EXTERNAL_MEDIA_COUNT | &quot;EXTERNAL_MEDIA_COUNT&quot; |
| MAX_CONTACTING_TIME | &quot;MAX_CONTACTING_TIME&quot; |
| MAX_DIALING_TIME | &quot;MAX_DIALING_TIME&quot; |
| MAX_FLOWOUT_TIME | &quot;MAX_FLOWOUT_TIME&quot; |
| FLOW_MILESTONE_COUNT | &quot;FLOW_MILESTONE_COUNT&quot; |
| MIN_FLOWOUT_TIME | &quot;MIN_FLOWOUT_TIME&quot; |
| MAX_MONITOR | &quot;MAX_MONITOR&quot; |
| MIN_CONTACTING_TIME | &quot;MIN_CONTACTING_TIME&quot; |
| MIN_DIALING_TIME | &quot;MIN_DIALING_TIME&quot; |
| MIN_MONITOR | &quot;MIN_MONITOR&quot; |
| MONITOR_COUNT | &quot;MONITOR_COUNT&quot; |
| MEDIA_COUNT | &quot;MEDIA_COUNT&quot; |
| SERVICE_LEVEL_TARGET | &quot;SERVICE_LEVEL_TARGET&quot; |
| SERVICE_LEVEL_TARGET_CURRENT | &quot;SERVICE_LEVEL_TARGET_CURRENT&quot; |
| TALK_COUNT | &quot;TALK_COUNT&quot; |
| TOTAL_ABANDON_TIME | &quot;TOTAL_ABANDON_TIME&quot; |
| TOTAL_NOT_RESPONDING_TIME | &quot;TOTAL_NOT_RESPONDING_TIME&quot; |
| TOTAL_CONTACTING | &quot;TOTAL_CONTACTING&quot; |
| TOTAL_DIALING | &quot;TOTAL_DIALING&quot; |
| TOTAL_MONITOR | &quot;TOTAL_MONITOR&quot; |
| TOTAL_WAIT_TIME | &quot;TOTAL_WAIT_TIME&quot; |
| WAIT_COUNT | &quot;WAIT_COUNT&quot; |
| PARK_COUNT | &quot;PARK_COUNT&quot; |
| AVG_PARK_TIME | &quot;AVG_PARK_TIME&quot; |
| TOTAL_PARK_TIME | &quot;TOTAL_PARK_TIME&quot; |
| MIN_PARK_TIME | &quot;MIN_PARK_TIME&quot; |
| MAX_PARK_TIME | &quot;MAX_PARK_TIME&quot; |
| INBOUND_AUDIO_COUNT | &quot;INBOUND_AUDIO_COUNT&quot; |
| OUTBOUND_AUDIO_COUNT | &quot;OUTBOUND_AUDIO_COUNT&quot; |


## Enum: SegmentTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALERT | &quot;alert&quot; |
| BARGING | &quot;barging&quot; |
| CALLBACK | &quot;callback&quot; |
| COACHING | &quot;coaching&quot; |
| CONTACTING | &quot;contacting&quot; |
| CONVERTING | &quot;converting&quot; |
| DELAY | &quot;delay&quot; |
| DIALING | &quot;dialing&quot; |
| HOLD | &quot;hold&quot; |
| INTERACT | &quot;interact&quot; |
| IVR | &quot;ivr&quot; |
| MONITORING | &quot;monitoring&quot; |
| PARKED | &quot;parked&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| SHARING | &quot;sharing&quot; |
| SYSTEM | &quot;system&quot; |
| TRANSMITTING | &quot;transmitting&quot; |
| UNKNOWN | &quot;unknown&quot; |
| UPLOADING | &quot;uploading&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| WRAPUP | &quot;wrapup&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
