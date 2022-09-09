---
title: StatusChange
---
## StatusChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStatusChanged** | <!----><!---->[**Date**](Date.html)<!----> | The date of this status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status the change request transitioned to |  [optional] |
| **previousStatus** | [**PreviousStatusEnum**](#PreviousStatusEnum)<!----> | The status the change request transitioned from |  [optional] |
| **namespace** | [**NamespaceEnum**](#NamespaceEnum)<!----> | The namespace for the status change |  [optional] |
| **message** | <!----><!---->**String**<!----> | A short message describing the status change |  [optional] |
| **rejectReason** | [**RejectReasonEnum**](#RejectReasonEnum)<!----> | The reason for rejecting the limit override request |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

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
{: class="table table-striped"}


<a name="PreviousStatusEnum"></a>

## Enum: PreviousStatusEnum

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
{: class="table table-striped"}


<a name="NamespaceEnum"></a>

## Enum: NamespaceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONTACTS | &quot;contacts&quot; | 
| AGENT_ASSISTANT | &quot;agent.assistant&quot; | 
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
| COBROWSE | &quot;cobrowse&quot; | 
| CONTENT_MANAGEMENT | &quot;content.management&quot; | 
| CONVERSATION | &quot;conversation&quot; | 
| DATAACTIONS | &quot;dataactions&quot; | 
| DATATABLES | &quot;datatables&quot; | 
| DIRECTORY | &quot;directory&quot; | 
| EMAIL | &quot;email&quot; | 
| EVENT_ORCHESTRATION | &quot;event.orchestration&quot; | 
| EXTERNAL_CONTACTS | &quot;external.contacts&quot; | 
| GCV | &quot;gcv&quot; | 
| GDPR | &quot;gdpr&quot; | 
| GROUPS | &quot;groups&quot; | 
| HISTORICAL_ADHERENCE | &quot;historical.adherence&quot; | 
| INFRASTRUCTUREASCODE | &quot;infrastructureascode&quot; | 
| INTEGRATIONS | &quot;integrations&quot; | 
| INTENT_MINER | &quot;intent.miner&quot; | 
| JOURNEY | &quot;journey&quot; | 
| KNOWLEDGE | &quot;knowledge&quot; | 
| LANGUAGE_UNDERSTANDING | &quot;language.understanding&quot; | 
| LIMIT_REGISTRY | &quot;limit.registry&quot; | 
| MARKETPLACE | &quot;marketplace&quot; | 
| MESSAGING | &quot;messaging&quot; | 
| NOTIFICATIONS | &quot;notifications&quot; | 
| ONBOARDING | &quot;onboarding&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
| PLATFORM_API | &quot;platform.api&quot; | 
| PREDICTIVE_ROUTING | &quot;predictive.routing&quot; | 
| QUALITY | &quot;quality&quot; | 
| RECORDING | &quot;recording&quot; | 
| RESPONSE_MANAGEMENT | &quot;response.management&quot; | 
| ROUTING | &quot;routing&quot; | 
| SCIM | &quot;scim&quot; | 
| SEARCH | &quot;search&quot; | 
| SPEECH_AND_TEXT_ANALYTICS | &quot;speech.and.text.analytics&quot; | 
| SPEECH_INTEGRATION | &quot;speech.integration&quot; | 
| SUPPORTABILITY | &quot;supportability&quot; | 
| TASK_MANAGEMENT | &quot;task.management&quot; | 
| TELEPHONY_CONFIGURATION | &quot;telephony.configuration&quot; | 
| WEB_DEPLOYMENTS | &quot;web.deployments&quot; | 
| WEB_MESSAGING | &quot;web.messaging&quot; | 
| WEBCHAT | &quot;webchat&quot; | 
| WEBHOOKS | &quot;webhooks&quot; | 
| WORKFORCE_MANAGEMENT | &quot;workforce.management&quot; | 
{: class="table table-striped"}


<a name="RejectReasonEnum"></a>

## Enum: RejectReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALTERNATIVEEXISTS | &quot;AlternativeExists&quot; | 
| INCREASENOTREQUIRED | &quot;IncreaseNotRequired&quot; | 
| PLATFORMMISUSE | &quot;PlatformMisuse&quot; | 
| PLATFORMSTABILITY | &quot;PlatformStability&quot; | 
| OTHERREASON | &quot;OtherReason&quot; | 
{: class="table table-striped"}



