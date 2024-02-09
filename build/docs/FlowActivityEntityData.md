---
title: FlowActivityEntityData
---
## FlowActivityEntityData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityDate** | <!----><!---->[**Date**](Date.html)<!----> | The time at which the activity was observed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | Activity metric |  [optional] |
| **activeRouting** | [**ActiveRoutingEnum**](#ActiveRoutingEnum)<!----> | Active routing method |  [optional] |
| **addressFrom** | <!----><!---->**String**<!----> | The address that initiated an action |  [optional] |
| **addressTo** | <!----><!---->**String**<!----> | The address receiving an action |  [optional] |
| **ani** | <!----><!---->**String**<!----> | Automatic Number Identification (caller's number) |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | Unique identifier for the conversation |  [optional] |
| **convertedFrom** | <!----><!---->**String**<!----> | Session media type that was converted from in case of a media type conversion |  [optional] |
| **convertedTo** | <!----><!---->**String**<!----> | Session media type that was converted to in case of a media type conversion |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the communication |  [optional] |
| **dnis** | <!----><!---->**String**<!----> | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **flowId** | <!----><!---->**String**<!----> | The unique identifier of this flow |  [optional] |
| **flowType** | [**FlowTypeEnum**](#FlowTypeEnum)<!----> | The type of this flow |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The session media type |  [optional] |
| **participantName** | <!----><!---->**String**<!----> | A human readable name identifying the participant |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | Queue identifier |  [optional] |
| **requestedLanguageId** | <!----><!---->**String**<!----> | Unique identifier for the language requested for an interaction |  [optional] |
| **requestedRoutingSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | Unique identifier(s) for skill(s) requested for an interaction |  [optional] |
| **requestedRoutings** | <!---->[**List&lt;RequestedRoutingsEnum&gt;**](#RequestedRoutingsEnum)<!----> | Routing type(s) for requested/attempted routing methods. |  [optional] |
| **routingPriority** | <!----><!---->**Long**<!----> | Routing priority for the current interaction |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | The unique identifier of this session |  [optional] |
| **teamId** | <!----><!---->**String**<!----> | The team ID the user is a member of |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#UsedRoutingEnum)<!----> | Complete routing method |  [optional] |
| **userId** | <!----><!---->**String**<!----> | Unique identifier for the user |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;FlowActivityScoredAgent&gt;**](FlowActivityScoredAgent.html)<!----> | Scored agents |  [optional] |
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFLOW | &quot;oFlow&quot; | 
{: class="table table-striped"}


<a name="ActiveRoutingEnum"></a>

## Enum: ActiveRoutingEnum

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
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
{: class="table table-striped"}


<a name="FlowTypeEnum"></a>

## Enum: FlowTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BOT | &quot;BOT&quot; | 
| COMMONMODULE | &quot;COMMONMODULE&quot; | 
| DIGITALBOT | &quot;DIGITALBOT&quot; | 
| INBOUNDCALL | &quot;INBOUNDCALL&quot; | 
| INBOUNDCHAT | &quot;INBOUNDCHAT&quot; | 
| INBOUNDEMAIL | &quot;INBOUNDEMAIL&quot; | 
| INBOUNDSHORTMESSAGE | &quot;INBOUNDSHORTMESSAGE&quot; | 
| INQUEUECALL | &quot;INQUEUECALL&quot; | 
| INQUEUEEMAIL | &quot;INQUEUEEMAIL&quot; | 
| INQUEUESHORTMESSAGE | &quot;INQUEUESHORTMESSAGE&quot; | 
| OUTBOUNDCALL | &quot;OUTBOUNDCALL&quot; | 
| SECURECALL | &quot;SECURECALL&quot; | 
| SPEECH | &quot;SPEECH&quot; | 
| SURVEYINVITE | &quot;SURVEYINVITE&quot; | 
| VOICE | &quot;VOICE&quot; | 
| VOICEMAIL | &quot;VOICEMAIL&quot; | 
| VOICESURVEY | &quot;VOICESURVEY&quot; | 
| WORKFLOW | &quot;WORKFLOW&quot; | 
| WORKITEM | &quot;WORKITEM&quot; | 
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALLBACK | &quot;callback&quot; | 
| CHAT | &quot;chat&quot; | 
| COBROWSE | &quot;cobrowse&quot; | 
| EMAIL | &quot;email&quot; | 
| MESSAGE | &quot;message&quot; | 
| SCREENSHARE | &quot;screenshare&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| VIDEO | &quot;video&quot; | 
| VOICE | &quot;voice&quot; | 
{: class="table table-striped"}


<a name="RequestedRoutingsEnum"></a>

## Enum: RequestedRoutingsEnum

| Name | Value |
| ---- | ----- |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| DIRECT | &quot;Direct&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
| VIP | &quot;Vip&quot; |
{: class="table table-striped"}


<a name="UsedRoutingEnum"></a>

## Enum: UsedRoutingEnum

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
{: class="table table-striped"}



