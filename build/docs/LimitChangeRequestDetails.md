# LimitChangeRequestDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **key** | **String** | Limit key to be overridden (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits) |  |
| **namespace** | [**NamespaceEnum**](#Enum--NamespaceEnum) | Namespace the key belongs to (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits) |  |
| **requestedValue** | **Double** | Requested limit value for a given key |  |
| **description** | **String** | Description of the need for the limit change request |  |
| **supportCaseUrl** | **String** | The support case url created by Care |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Current status of the limit change request |  [optional] |
| **currentValue** | **Double** | Current limit value for a given key |  [optional] |
| **dateCreated** | [**Date**](Date) | The date of the limit change request creation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **statusHistory** | [**List&lt;StatusChange&gt;**](StatusChange) | List of statuses that a limit change request has gone through |  [optional] |
| **dateCompleted** | [**Date**](Date) | The date of the limit change request completion (ChangeImplemented, Rejected, or RollbackImplemented. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **rejectReason** | [**RejectReasonEnum**](#Enum--RejectReasonEnum) | The reason for rejecting the limit override request |  [optional] |
| **approvalNamespaces** | [**List&lt;ApprovalNamespace&gt;**](ApprovalNamespace) | The approval breakdown for this override request. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: NamespaceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENT_ASSISTANT | &quot;agent.assistant&quot; | 
| ANALYTICS_AGENTS | &quot;analytics.agents&quot; | 
| ANALYTICS_ALERTING | &quot;analytics.alerting&quot; | 
| ANALYTICS_DATA_EXTRACTION | &quot;analytics.data.extraction&quot; | 
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
| GUIDES | &quot;guides&quot; | 
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
| USERS_RULES | &quot;users.rules&quot; | 
| VOICE_TRANSCRIPTION | &quot;voice.transcription&quot; | 
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


## Enum: RejectReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALTERNATIVEEXISTS | &quot;AlternativeExists&quot; | 
| INCREASENOTREQUIRED | &quot;IncreaseNotRequired&quot; | 
| PLATFORMMISUSE | &quot;PlatformMisuse&quot; | 
| PLATFORMSTABILITY | &quot;PlatformStability&quot; | 
| OTHERREASON | &quot;OtherReason&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
