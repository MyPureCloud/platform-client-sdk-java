# ApprovalNamespace


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **namespace** | [**NamespaceEnum**](#Enum--NamespaceEnum) | The namespace of the associated approvers. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current namespace approval status. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of namespace approval. |  [optional] |


## Enum: NamespaceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENT_ASSISTANT | &quot;agent.assistant&quot; | 
| ANALYTICS_AGENTS | &quot;analytics.agents&quot; | 
| ANALYTICS_ALERTING | &quot;analytics.alerting&quot; | 
| ANALYTICS | &quot;analytics&quot; | 
| ANALYTICS_REALTIME | &quot;analytics.realtime&quot; | 
| ANALYTICS_REPORTING_SETTINGS | &quot;analytics.reporting.settings&quot; | 
| ARCHITECT | &quot;architect&quot; | 
| AUDIOHOOK | &quot;audiohook&quot; | 
| AUDIT | &quot;audit&quot; | 
| AUTH_API | &quot;auth.api&quot; | 
| AUTHORIZATION | &quot;authorization&quot; | 
| AUTOMATION_TESTING | &quot;automation.testing&quot; | 
| BOTS | &quot;bots&quot; | 
| BOTS_VOICE | &quot;bots.voice&quot; | 
| BUSINESS_RULES | &quot;business.rules&quot; | 
| CALLBACK | &quot;callback&quot; | 
| COBROWSE | &quot;cobrowse&quot; | 
| CONTENT_MANAGEMENT | &quot;content.management&quot; | 
| CONVERSATION | &quot;conversation&quot; | 
| DATAACTIONS | &quot;dataactions&quot; | 
| DATATABLES | &quot;datatables&quot; | 
| DIRECTORY | &quot;directory&quot; | 
| DSAR | &quot;dsar&quot; | 
| EMAIL | &quot;email&quot; | 
| EMPLOYEE_ENGAGEMENT | &quot;employee.engagement&quot; | 
| EVENT_ORCHESTRATION | &quot;event.orchestration&quot; | 
| EXTERNAL_CONTACTS | &quot;external.contacts&quot; | 
| EXTERNAL_EVENTS_DATA_INGESTION | &quot;external.events.data.ingestion&quot; | 
| GAMIFICATION | &quot;gamification&quot; | 
| GCV | &quot;gcv&quot; | 
| GDPR | &quot;gdpr&quot; | 
| GROUPS | &quot;groups&quot; | 
| HISTORICAL_ADHERENCE | &quot;historical.adherence&quot; | 
| INFRASTRUCTUREASCODE | &quot;infrastructureascode&quot; | 
| INTEGRATIONS | &quot;integrations&quot; | 
| INTENT_MINER | &quot;intent.miner&quot; | 
| INTERNAL_MESSAGING | &quot;internal.messaging&quot; | 
| JOURNEY | &quot;journey&quot; | 
| KNOWLEDGE | &quot;knowledge&quot; | 
| LANGUAGE_UNDERSTANDING | &quot;language.understanding&quot; | 
| LEARNING | &quot;learning&quot; | 
| LIMIT_REGISTRY | &quot;limit.registry&quot; | 
| MARKETPLACE | &quot;marketplace&quot; | 
| MEDIA_COMMUNICATIONS | &quot;media.communications&quot; | 
| MESSAGING | &quot;messaging&quot; | 
| MICRO_FRONTEND | &quot;micro.frontend&quot; | 
| NOTIFICATIONS | &quot;notifications&quot; | 
| ONBOARDING | &quot;onboarding&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
| PLATFORM_API | &quot;platform.api&quot; | 
| PREDICTIVE_ROUTING | &quot;predictive.routing&quot; | 
| PRESENCE | &quot;presence&quot; | 
| QUALITY | &quot;quality&quot; | 
| RECORDING | &quot;recording&quot; | 
| RESPONSE_MANAGEMENT | &quot;response.management&quot; | 
| ROUTING | &quot;routing&quot; | 
| SCIM | &quot;scim&quot; | 
| SEARCH | &quot;search&quot; | 
| SECONDARY_AUTOMATION_TESTING | &quot;secondary.automation.testing&quot; | 
| SKILLS | &quot;skills&quot; | 
| SOCIAL_MEDIA | &quot;social.media&quot; | 
| SPEECH_AND_TEXT_ANALYTICS | &quot;speech.and.text.analytics&quot; | 
| SPEECH_INTEGRATION | &quot;speech.integration&quot; | 
| SUPPORTABILITY | &quot;supportability&quot; | 
| TASK_MANAGEMENT | &quot;task.management&quot; | 
| TELEPHONY_CONFIGURATION | &quot;telephony.configuration&quot; | 
| USAGE | &quot;usage&quot; | 
| USERS | &quot;users&quot; | 
| WEB_DEPLOYMENTS | &quot;web.deployments&quot; | 
| WEB_MESSAGING | &quot;web.messaging&quot; | 
| WEBCHAT | &quot;webchat&quot; | 
| WEBHOOKS | &quot;webhooks&quot; | 
| WORKFORCE_MANAGEMENT_FORECAST | &quot;workforce.management.forecast&quot; | 
| WORKFORCE_MANAGEMENT | &quot;workforce.management&quot; | 
| SYSTEM | &quot;system&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| REJECTED | &quot;Rejected&quot; | 
| ROLLBACK | &quot;Rollback&quot; | 
| PENDING | &quot;Pending&quot; | 
| OPEN | &quot;Open&quot; | 
| SECONDARYAPPROVALNAMESPACESADDED | &quot;SecondaryApprovalNamespacesAdded&quot; | 
| REVIEWERAPPROVED | &quot;ReviewerApproved&quot; | 
| REVIEWERREJECTED | &quot;ReviewerRejected&quot; | 
| REVIEWERROLLBACK | &quot;ReviewerRollback&quot; | 
| IMPLEMENTINGCHANGE | &quot;ImplementingChange&quot; | 
| CHANGEIMPLEMENTED | &quot;ChangeImplemented&quot; | 
| IMPLEMENTINGROLLBACK | &quot;ImplementingRollback&quot; | 
| ROLLBACKIMPLEMENTED | &quot;RollbackImplemented&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRIMARY | &quot;Primary&quot; | 
| SECONDARY | &quot;Secondary&quot; | 
| SYSTEM | &quot;System&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
