---
title: FlowOutcomeDetailEventTopicFlowOutcomeEvent
---
## FlowOutcomeDetailEventTopicFlowOutcomeEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **participantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> |  |  [optional] |
| **ani** | <!----><!---->**String**<!----> |  |  [optional] |
| **dnis** | <!----><!---->**String**<!----> |  |  [optional] |
| **addressTo** | <!----><!---->**String**<!----> |  |  [optional] |
| **addressFrom** | <!----><!---->**String**<!----> |  |  [optional] |
| **subject** | <!----><!---->**String**<!----> |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#MessageTypeEnum)<!----> |  |  [optional] |
| **flowType** | [**FlowTypeEnum**](#FlowTypeEnum)<!----> |  |  [optional] |
| **flowId** | <!----><!---->**String**<!----> |  |  [optional] |
| **divisionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **flowVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **flowOutcomeId** | <!----><!---->**String**<!----> |  |  [optional] |
| **flowOutcomeStartTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **flowOutcomeEndTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **flowOutcomeValue** | [**FlowOutcomeValueEnum**](#FlowOutcomeValueEnum)<!----> |  |  [optional] |
| **flowMilestones** | <!----><!---->[**List&lt;FlowOutcomeDetailEventTopicFlowMilestone&gt;**](FlowOutcomeDetailEventTopicFlowMilestone.html)<!----> |  |  [optional] |
| **conversationExternalContactIds** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **conversationExternalOrganizationIds** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| VOICE | &quot;VOICE&quot; | 
| CHAT | &quot;CHAT&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| CALLBACK | &quot;CALLBACK&quot; | 
| COBROWSE | &quot;COBROWSE&quot; | 
| VIDEO | &quot;VIDEO&quot; | 
| SCREENSHARE | &quot;SCREENSHARE&quot; | 
| MESSAGE | &quot;MESSAGE&quot; | 
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| INBOUND | &quot;INBOUND&quot; | 
| OUTBOUND | &quot;OUTBOUND&quot; | 
{: class="table table-striped"}


<a name="MessageTypeEnum"></a>

## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| SMS | &quot;SMS&quot; | 
| TWITTER | &quot;TWITTER&quot; | 
| FACEBOOK | &quot;FACEBOOK&quot; | 
| LINE | &quot;LINE&quot; | 
| WHATSAPP | &quot;WHATSAPP&quot; | 
| WEBMESSAGING | &quot;WEBMESSAGING&quot; | 
| OPEN | &quot;OPEN&quot; | 
| INSTAGRAM | &quot;INSTAGRAM&quot; | 
{: class="table table-striped"}


<a name="FlowTypeEnum"></a>

## Enum: FlowTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| INBOUNDCALL | &quot;INBOUNDCALL&quot; | 
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; | 
| INQUEUECALL | &quot;INQUEUECALL&quot; | 
| SECURECALL | &quot;SECURECALL&quot; | 
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; | 
| SURVEYINVITE | &quot;SURVEYINVITE&quot; | 
| INBOUNDSHORTMESSAGE | &quot;INBOUNDSHORTMESSAGE&quot; | 
| INBOUNDCHAT | &quot;INBOUNDCHAT&quot; | 
| WORKFLOW | &quot;WORKFLOW&quot; | 
| BOT | &quot;BOT&quot; | 
| DIGITALBOT | &quot;DIGITALBOT&quot; | 
| COMMONMODULE | &quot;COMMONMODULE&quot; | 
| INQUEUEEMAIL | &quot;INQUEUEEMAIL&quot; | 
| INQUEUESHORTMESSAGE | &quot;INQUEUESHORTMESSAGE&quot; | 
| VOICE | &quot;VOICE&quot; | 
| VOICEMAIL | &quot;VOICEMAIL&quot; | 
| WORKITEM | &quot;WORKITEM&quot; | 
| VOICESURVEY | &quot;VOICESURVEY&quot; | 
{: class="table table-striped"}


<a name="FlowOutcomeValueEnum"></a>

## Enum: FlowOutcomeValueEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
{: class="table table-striped"}



