---
title: AnalyticsParticipant
---
## AnalyticsParticipant


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **participantId** | <!----><!---->**String**<!----> | Unique identifier for the participant |  [optional] |
| **participantName** | <!----><!---->**String**<!----> | A human readable name identifying the participant |  [optional] |
| **userId** | <!----><!---->**String**<!----> | If a user, then this will be the unique identifier for the user |  [optional] |
| **purpose** | [**PurposeEnum**](#PurposeEnum)<!----> | The participant&#39;s purpose |  [optional] |
| **externalContactId** | <!----><!---->**String**<!----> | External Contact Identifier |  [optional] |
| **externalOrganizationId** | <!----><!---->**String**<!----> | External Organization Identifier |  [optional] |
| **flaggedReason** | [**FlaggedReasonEnum**](#FlaggedReasonEnum)<!----> | Reason for which participant flagged conversation |  [optional] |
| **teamId** | <!----><!---->**String**<!----> | The team id the user is a member of |  [optional] |
| **agentAssistantIds** | <!----><!---->**List&lt;String&gt;**<!----> | Unique identifiers of the active virtual agent assistants |  [optional] |
| **sessions** | <!----><!---->[**List&lt;AnalyticsSession&gt;**](AnalyticsSession.html)<!----> | List of sessions associated to this participant |  [optional] |
| **attributes** | <!----><!---->**Map&lt;String, String&gt;**<!----> | List of attributes associated to this participant |  [optional] |
{: class="table table-striped"}


<a name="PurposeEnum"></a>

## Enum: PurposeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MANUAL | &quot;manual&quot; |
| DIALER | &quot;dialer&quot; |
| INBOUND | &quot;inbound&quot; |
| ACD | &quot;acd&quot; |
| IVR | &quot;ivr&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| OUTBOUND | &quot;outbound&quot; |
| AGENT | &quot;agent&quot; |
| USER | &quot;user&quot; |
| STATION | &quot;station&quot; |
| GROUP | &quot;group&quot; |
| CUSTOMER | &quot;customer&quot; |
| EXTERNAL | &quot;external&quot; |
| FAX | &quot;fax&quot; |
| WORKFLOW | &quot;workflow&quot; |
| CAMPAIGN | &quot;campaign&quot; |
| API | &quot;api&quot; |
{: class="table table-striped"}


<a name="FlaggedReasonEnum"></a>

## Enum: FlaggedReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| GENERAL | &quot;general&quot; |
{: class="table table-striped"}



