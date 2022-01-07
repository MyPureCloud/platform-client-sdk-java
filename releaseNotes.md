Platform API version: 5276


# Major Changes (2 changes)

**MemberGroup** (1 change)

* Property division was changed from Division to WritableDivision

**ValidationServiceRequest** (1 change)

* Property fileUrl was removed


# Minor Changes (96 changes)

**/api/v2/gamification/profiles/{sourceProfileId}/metrics/{sourceMetricId}/link** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/gamification/profiles/{performanceProfileId}/members** (3 changes)

* Path was added
* Operation GET was added
* Operation POST was added

**/api/v2/gamification/profiles/{performanceProfileId}/members/validate** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/telephony/providers/edges/expired** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/textbots/bots/search** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/integrations/clientapps/unifiedcommunications** (2 changes)

* Path was added
* Operation GET was added

**Contact** (1 change)

* Enum value OTHER was added to property type

**BotAggregateQueryPredicate** (2 changes)

* Enum value knowledgeBaseId was added to property dimension
* Enum value selfServed was added to property dimension

**BotAggregationQuery** (2 changes)

* Enum value knowledgeBaseId was added to property groupBy
* Enum value selfServed was added to property groupBy

**AnalyticsConversationWithoutAttributes** (2 changes)

* Optional property knowledgeBaseIds was added
* Optional property selfServed was added

**ConversationAggregateQueryPredicate** (2 changes)

* Enum value knowledgeBaseId was added to property dimension
* Enum value selfServed was added to property dimension

**ConversationAggregationQuery** (4 changes)

* Enum value knowledgeBaseId was added to property groupBy
* Enum value selfServed was added to property groupBy
* Enum value oMessageTurn was added to property metrics
* Enum value tConnected was added to property metrics

**ConversationAggregationView** (2 changes)

* Enum value oMessageTurn was added to property target
* Enum value tConnected was added to property target

**ConversationDetailQueryPredicate** (2 changes)

* Enum value oMessageTurn was added to property metric
* Enum value tConnected was added to property metric

**AnalyticsConversation** (2 changes)

* Optional property knowledgeBaseIds was added
* Optional property selfServed was added

**FlowAggregateQueryPredicate** (2 changes)

* Enum value knowledgeBaseId was added to property dimension
* Enum value selfServed was added to property dimension

**FlowAggregationQuery** (2 changes)

* Enum value knowledgeBaseId was added to property groupBy
* Enum value selfServed was added to property groupBy

**ViewFilter** (1 change)

* Optional property isAssessmentPassed was added

**AuditLogMessage** (7 changes)

* Enum value Workitems was added to property serviceName
* Enum value HardDelete was added to property action
* Enum value ContactSchema was added to property entityType
* Enum value ExternalOrganizationSchema was added to property entityType
* Enum value Workbin was added to property entityType
* Enum value Workitem was added to property entityType
* Enum value Worktype was added to property entityType

**AuditRealtimeQueryRequest** (1 change)

* Enum value Workitems was added to property serviceName

**AuditQueryEntity** (6 changes)

* Enum value ContactSchema was added to property name
* Enum value ExternalOrganizationSchema was added to property name
* Enum value Workbin was added to property name
* Enum value Workitem was added to property name
* Enum value Worktype was added to property name
* Enum value HardDelete was added to property actions

**AuditQueryService** (1 change)

* Enum value Workitems was added to property name

**AuditQueryExecutionStatusResponse** (1 change)

* Enum value Workitems was added to property serviceName

**AuditQueryRequest** (1 change)

* Enum value Workitems was added to property serviceName

**MemberGroup** (1 change)

* id is no longer readonly

**Queue** (1 change)

* Optional property onHoldPrompt was added

**ColumnStatus** (1 change)

* Model was added

**ContactableStatus** (1 change)

* Model was added

**TargetPerformanceProfile** (1 change)

* Model was added

**Member** (1 change)

* Model was added

**MemberListing** (1 change)

* Model was added

**AssignmentValidation** (1 change)

* Model was added

**InvalidAssignment** (1 change)

* Model was added

**OtherProfileAssignment** (1 change)

* Model was added

**ValidateAssignUsers** (1 change)

* Model was added

**Assignment** (1 change)

* Model was added

**AssignmentError** (1 change)

* Model was added

**AssignUsers** (1 change)

* Model was added

**Miner** (1 change)

* Enum value es-es was added to property language

**RecordingContentStory** (1 change)

* Model was added

**RecordingMessagingMessage** (1 change)

* Optional property story was added

**ComparisonPeriod** (1 change)

* Optional property kpiResults was added

**KpiResult** (1 change)

* Model was added

**QueueRequest** (1 change)

* Optional property onHoldPrompt was added

**UserQueue** (1 change)

* Optional property onHoldPrompt was added

**CreateQueueRequest** (1 change)

* Optional property onHoldPrompt was added

**NluInfo** (1 change)

* Optional property engineVersion was added

**EdgeIdNamePair** (1 change)

* Model was added

**ExpiredEdgeListing** (1 change)

* Model was added

**BotSearchResponse** (1 change)

* Model was added

**BotSearchResponseEntityListing** (1 change)

* Model was added

**UCI10n** (1 change)

* Model was added

**UCIcon** (1 change)

* Model was added

**UCIntegration** (1 change)

* Model was added

**UCIntegrationListing** (1 change)

* Model was added

**Knowledge** (1 change)

* Model was added

**MessengerApps** (1 change)

* Model was added

**MessengerSettings** (1 change)

* Optional property apps was added

**SupportCenterSettings** (1 change)

* Model was added

**WebDeploymentConfigurationVersion** (1 change)

* Optional property supportCenter was added

**WfmVersionedEntityMetadata** (2 changes)

* Optional property createdBy was added
* Optional property dateCreated was added

**SecondaryPresence** (1 change)

* Model was added

**ListWrapperSecondaryPresence** (1 change)

* Model was added

**ActivityCodeReference** (1 change)

* Model was added

**UserScheduleAdherence** (1 change)

* Optional property businessUnit was added


# Point Changes (0 changes)
