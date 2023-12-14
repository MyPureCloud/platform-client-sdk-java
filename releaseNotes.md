Platform API version: 7567




# Major Changes (33 changes)

**GET /api/v2/alerting/alerts/active** (1 change)

* Has been deprecated

**GET /api/v2/alerting/interactionstats/alerts/{alertId}** (1 change)

* Has been deprecated

**PUT /api/v2/alerting/interactionstats/alerts/{alertId}** (1 change)

* Has been deprecated

**DELETE /api/v2/alerting/interactionstats/alerts/{alertId}** (1 change)

* Has been deprecated

**GET /api/v2/alerting/interactionstats/alerts** (1 change)

* Has been deprecated

**GET /api/v2/alerting/interactionstats/rules/{ruleId}** (1 change)

* Has been deprecated

**PUT /api/v2/alerting/interactionstats/rules/{ruleId}** (1 change)

* Has been deprecated

**DELETE /api/v2/alerting/interactionstats/rules/{ruleId}** (1 change)

* Has been deprecated

**GET /api/v2/alerting/interactionstats/rules** (1 change)

* Has been deprecated

**POST /api/v2/alerting/interactionstats/rules** (1 change)

* Has been deprecated

**GET /api/v2/alerting/interactionstats/alerts/unread** (1 change)

* Has been deprecated

**PUT /api/v2/analytics/reporting/schedules/{scheduleId}** (1 change)

* Has been deprecated

**POST /api/v2/analytics/reporting/schedules** (1 change)

* Has been deprecated

**POST /api/v2/analytics/reporting/schedules/{scheduleId}/runreport** (1 change)

* Has been deprecated

**GET /api/v2/quality/agents/activity** (1 change)

* Parameter agentTeamId was added

**GET /api/v2/quality/evaluations/query** (1 change)

* Parameter agentTeamId was added

**GET /api/v2/quality/evaluators/activity** (1 change)

* Parameter agentTeamId was added

**GET /api/v2/routing/utilization** (1 change)

* Response 200 type was changed from Utilization to UtilizationResponse

**PUT /api/v2/routing/utilization** (1 change)

* Response 200 type was changed from Utilization to UtilizationResponse

**GET /api/v2/routing/users/{userId}/utilization** (1 change)

* Response 200 type was changed from AgentMaxUtilization to AgentMaxUtilizationResponse

**PUT /api/v2/routing/users/{userId}/utilization** (1 change)

* Response 200 type was changed from AgentMaxUtilization to AgentMaxUtilizationResponse

**GET /api/v2/learning/modules** (1 change)

* Parameter externalIds was added

**LabelUtilization** (1 change)

* Model LabelUtilization was removed

**Utilization** (1 change)

* Model Utilization was removed

**AgentMaxUtilization** (1 change)

* Model AgentMaxUtilization was removed

**UserInsightsTrend** (2 changes)

* Property entities was changed from InsightsTrendMetricItem[] to UserInsightsTrendMetricItem[]
* Property total was changed from InsightsTrendTotalItem to UserInsightsTrendTotalItem

**AppEventResponse** (2 changes)

* Property ipAddress was removed
* Property externalContact was removed

**Workitem** (1 change)

* Property queue was changed from QueueReference to WorkitemQueueReference

**WorkitemVersion** (1 change)

* Property queue was changed from QueueReference to WorkitemQueueReference

**Worktype** (1 change)

* Property defaultQueue was changed from QueueReference to WorkitemQueueReference

**WorktypeVersion** (1 change)

* Property defaultQueue was changed from QueueReference to WorkitemQueueReference


# Minor Changes (120 changes)

**POST /api/v2/authorization/divisions/{divisionId}/restore** (1 change)

* Parameter body was made optional

**/api/v2/analytics/botflows/{botFlowId}/sessions** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/outbound/contactlisttemplates/{contactListTemplateId}** (4 changes)

* Path was added
* Operation GET was added
* Operation PUT was added
* Operation DELETE was added

**/api/v2/outbound/contactlisttemplates** (4 changes)

* Path was added
* Operation GET was added
* Operation POST was added
* Operation DELETE was added

**/api/v2/outbound/contactlisttemplates/bulk/add** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/outbound/importtemplates/{importTemplateId}/importstatus** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/outbound/importtemplates/{importTemplateId}** (4 changes)

* Path was added
* Operation GET was added
* Operation PUT was added
* Operation DELETE was added

**/api/v2/outbound/importtemplates** (4 changes)

* Path was added
* Operation GET was added
* Operation POST was added
* Operation DELETE was added

**/api/v2/outbound/importtemplates/bulk/add** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/diagnostics/logcapture/browser/entries/download/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/diagnostics/logcapture/browser/entries/download/jobs** (2 changes)

* Path was added
* Operation POST was added

**GET /api/v2/journey/deployments/{deploymentId}/customers/{customerCookieId}/ping** (1 change)

* Parameter sessionId was made optional

**/api/v2/analytics/flowexecutions/aggregates/query** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/analytics/flowexecutions/aggregates/jobs** (2 changes)

* Path was added
* Operation POST was added

**/api/v2/analytics/flowexecutions/aggregates/jobs/{jobId}** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/analytics/flowexecutions/aggregates/jobs/{jobId}/results** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/learning/modules/{moduleId}/users/{userId}/assignments** (2 changes)

* Path was added
* Operation PATCH was added

**BotChannel** (1 change)

* Model was added

**BotFlowSession** (1 change)

* Model was added

**SessionsResponse** (1 change)

* Model was added

**Queue** (1 change)

* Optional property enableAudioMonitoring was added

**Limit** (1 change)

* Enum value employee.engagement was added to property namespace

**CallMediaPolicyConditions** (1 change)

* Optional property teams was added

**ChatMediaPolicyConditions** (1 change)

* Optional property teams was added

**EmailMediaPolicyConditions** (1 change)

* Optional property teams was added

**MessageMediaPolicyConditions** (1 change)

* Optional property teams was added

**PolicyConditions** (1 change)

* Optional property teams was added

**PhoneNumber** (1 change)

* Optional property normalizationCountryCode was added

**ExternalOrganizationTrustorLink** (2 changes)

* Optional property id was added
* Optional property selfUri was added

**Evaluation** (1 change)

* Optional property agentTeam was added

**EvaluationQuestionGroupScore** (1 change)

* Optional property systemMarkedNA was added

**EvaluationQuestionScore** (1 change)

* Optional property systemMarkedNA was added

**ImportStatus** (2 changes)

* Optional property targetContactListIds was added
* Optional property listNamePrefix was added

**ContactListFilter** (2 changes)

* Optional property contactListTemplate was added
* Optional property sourceType was added

**ContactListTemplate** (1 change)

* Model was added

**ContactListTemplateEntityListing** (1 change)

* Model was added

**EventMessage** (3 changes)

* Enum value IMPORT_NO_LISTS_CREATED_NO_CONTACTS_MATCH_FILTER was added to property code
* Enum value IMPORT_TARGET_CONTACT_LIST_NAME_EXISTS was added to property code
* Enum value IMPORT_CONTACT_LIST_NAME_LENGTH_EXCEEDED was added to property code

**ImportTemplate** (1 change)

* Model was added

**SplittingInformation** (1 change)

* Model was added

**ImportTemplateEntityListing** (1 change)

* Model was added

**UserInsightsTrendMetricItem** (1 change)

* Model was added

**UserInsightsTrendTotalItem** (1 change)

* Model was added

**UserInsightsTrends** (1 change)

* Model was added

**UserTrendData** (1 change)

* Model was added

**KnowledgeBase** (1 change)

* Enum value ar-AE was added to property coreLanguage

**KnowledgeCategory** (1 change)

* Enum value ar-AE was added to property languageCode

**KnowledgeSearchDocument** (1 change)

* Enum value ar-AE was added to property languageCode

**KnowledgeExtendedCategory** (1 change)

* Enum value ar-AE was added to property languageCode

**KnowledgeImport** (1 change)

* Enum value ar-AE was added to property languageCode

**KnowledgeDocument** (1 change)

* Enum value ar-AE was added to property languageCode

**KnowledgeBaseCreateRequest** (1 change)

* Enum value ar-AE was added to property coreLanguage

**ApprovalNamespace** (1 change)

* Enum value employee.engagement was added to property namespace

**LimitChangeRequestDetails** (1 change)

* Enum value employee.engagement was added to property namespace

**StatusChange** (1 change)

* Enum value employee.engagement was added to property namespace

**LogCaptureDownloadExecutionResponse** (1 change)

* Model was added

**LogCaptureQueryRequest** (1 change)

* Model was added

**SurveyQuestionGroupScore** (1 change)

* Optional property systemMarkedNA was added

**SurveyQuestionScore** (1 change)

* Optional property systemMarkedNA was added

**EvaluationResponse** (1 change)

* Optional property agentTeam was added

**Survey** (1 change)

* Optional property agentTeam was added

**QueueRequest** (1 change)

* Optional property enableAudioMonitoring was added

**UserQueue** (1 change)

* Optional property enableAudioMonitoring was added

**CreateQueueRequest** (1 change)

* Optional property enableAudioMonitoring was added

**LabelUtilizationRequest** (1 change)

* Model was added

**LabelUtilizationResponse** (1 change)

* Model was added

**UtilizationResponse** (1 change)

* Model was added

**UtilizationRequest** (1 change)

* Model was added

**AgentMaxUtilizationResponse** (1 change)

* Model was added

**Dependency** (1 change)

* Enum value UTILIZATIONLABEL was added to property type

**DependencyObject** (1 change)

* Enum value UTILIZATIONLABEL was added to property type

**LearningAssignment** (1 change)

* Optional property lengthInMinutes was added

**LearningModule** (2 changes)

* Optional property excludedFromCatalog was added
* Optional property lengthInMinutes was added

**LearningAssignmentCreate** (1 change)

* Optional property lengthInMinutes was added

**LearningModuleRequest** (3 changes)

* Optional property lengthInMinutes was added
* Optional property excludedFromCatalog was added
* Optional property externalId was added

**AssignedLearningModule** (2 changes)

* Optional property excludedFromCatalog was added
* Optional property lengthInMinutes was added

**FlowExecutionAggregateDataContainer** (1 change)

* Model was added

**FlowExecutionAggregateQueryResponse** (1 change)

* Model was added

**FlowExecutionAggregateQueryClause** (1 change)

* Model was added

**FlowExecutionAggregateQueryFilter** (1 change)

* Model was added

**FlowExecutionAggregateQueryPredicate** (1 change)

* Model was added

**FlowExecutionAggregationQuery** (1 change)

* Model was added

**FlowExecutionAggregationView** (1 change)

* Model was added

**FlowExecutionAsyncAggregationQuery** (1 change)

* Model was added

**FlowExecutionAsyncAggregateQueryResponse** (1 change)

* Model was added

**ExecutionDataEntity** (1 change)

* Optional property statusCode was added

**MediaEndpointStatistics** (1 change)

* Optional property reconnectAttemptCount was added

**LearningAssignmentExternalUpdate** (1 change)

* Model was added

**WorkitemQueueReference** (1 change)

* Model was added


# Point Changes (23 changes)

**GET /api/v2/alerting/alerts/active** (2 changes)

* Description was changed
* Summary was changed

**GET /api/v2/alerting/interactionstats/alerts/{alertId}** (1 change)

* Description was changed

**PUT /api/v2/alerting/interactionstats/alerts/{alertId}** (1 change)

* Description was changed

**DELETE /api/v2/alerting/interactionstats/alerts/{alertId}** (1 change)

* Description was changed

**GET /api/v2/alerting/interactionstats/alerts** (2 changes)

* Description was changed
* Summary was changed

**GET /api/v2/alerting/interactionstats/rules/{ruleId}** (2 changes)

* Description was changed
* Summary was changed

**PUT /api/v2/alerting/interactionstats/rules/{ruleId}** (1 change)

* Description was changed

**DELETE /api/v2/alerting/interactionstats/rules/{ruleId}** (2 changes)

* Description was changed
* Summary was changed

**GET /api/v2/alerting/interactionstats/rules** (2 changes)

* Description was changed
* Summary was changed

**POST /api/v2/alerting/interactionstats/rules** (2 changes)

* Description was changed
* Summary was changed

**GET /api/v2/alerting/interactionstats/alerts/unread** (2 changes)

* Description was changed
* Summary was changed

**GET /api/v2/analytics/botflows/{botFlowId}/reportingturns** (1 change)

* Description was changed

**PUT /api/v2/analytics/reporting/schedules/{scheduleId}** (1 change)

* Description was changed

**POST /api/v2/analytics/reporting/schedules** (1 change)

* Description was changed

**POST /api/v2/analytics/reporting/schedules/{scheduleId}/runreport** (1 change)

* Description was changed

**POST /api/v2/integrations/actions** (1 change)

* Summary was changed
