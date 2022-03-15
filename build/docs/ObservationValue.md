---
title: ObservationValue
---
## ObservationValue


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **observationDate** | <!----><!---->[**Date**](Date.html)<!----> | The time at which the observation occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conversationId** | <!----><!---->**String**<!----> | Unique identifier for the conversation |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | The unique identifier of this session |  [optional] |
| **requestedRoutingSkillIds** | <!----><!---->**List&lt;String&gt;**<!----> | Unique identifier for a skill requested for an interaction |  [optional] |
| **requestedLanguageId** | <!----><!---->**String**<!----> | Unique identifier for the language requested for an interaction |  [optional] |
| **routingPriority** | <!----><!---->**Long**<!----> | Routing priority for the current interaction |  [optional] |
| **participantName** | <!----><!---->**String**<!----> | A human readable name identifying the participant |  [optional] |
| **userId** | <!----><!---->**String**<!----> | Unique identifier for the user |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> | The direction of the communication |  [optional] |
| **convertedFrom** | <!----><!---->**String**<!----> | Session media type that was converted from in case of a media type conversion |  [optional] |
| **convertedTo** | <!----><!---->**String**<!----> | Session media type that was converted to in case of a media type conversion |  [optional] |
| **addressFrom** | <!----><!---->**String**<!----> | The address that initiated an action |  [optional] |
| **addressTo** | <!----><!---->**String**<!----> | The address receiving an action |  [optional] |
| **ani** | <!----><!---->**String**<!----> | Automatic Number Identification (caller&#39;s number) |  [optional] |
| **dnis** | <!----><!---->**String**<!----> | Dialed number identification service (number dialed by the calling party) |  [optional] |
| **teamId** | <!----><!---->**String**<!----> | The team id the user is a member of |  [optional] |
| **requestedRoutings** | <!---->[**List&lt;RequestedRoutingsEnum&gt;**](#RequestedRoutingsEnum)<!----> | All routing types for requested/attempted routing methods |  [optional] |
| **usedRouting** | [**UsedRoutingEnum**](#UsedRoutingEnum)<!----> | Complete routing method |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;AnalyticsScoredAgent&gt;**](AnalyticsScoredAgent.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


<a name="RequestedRoutingsEnum"></a>

## Enum: RequestedRoutingsEnum

| Name | Value |
| ---- | ----- |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
{: class="table table-striped"}


<a name="UsedRoutingEnum"></a>

## Enum: UsedRoutingEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BULLSEYE | &quot;Bullseye&quot; |
| CONDITIONAL | &quot;Conditional&quot; |
| LAST | &quot;Last&quot; |
| MANUAL | &quot;Manual&quot; |
| PREDICTIVE | &quot;Predictive&quot; |
| PREFERRED | &quot;Preferred&quot; |
| STANDARD | &quot;Standard&quot; |
{: class="table table-striped"}



