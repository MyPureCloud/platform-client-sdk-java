---
title: AnalyticsConversationWithoutAttributes
---
## AnalyticsConversationWithoutAttributes


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationEnd** | <!----><!---->[**Date**](Date.html)<!----> | The end time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | Unique identifier for the conversation |  [optional] |
| **conversationStart** | <!----><!---->[**Date**](Date.html)<!----> | The start time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **divisionIds** | <!----><!---->**List&lt;String&gt;**<!----> | Identifier(s) of division(s) associated with a conversation |  [optional] |
| **externalTag** | <!----><!---->**String**<!----> | External tag for the conversation |  [optional] |
| **mediaStatsMinConversationMos** | <!----><!---->**Double**<!----> | The lowest estimated average MOS among all the audio streams belonging to this conversation |  [optional] |
| **mediaStatsMinConversationRFactor** | <!----><!---->**Double**<!----> | The lowest R-factor value among all of the audio streams belonging to this conversation |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#OriginatingDirectionEnum)<!----> | The original direction of the conversation |  [optional] |
| **evaluations** | <!----><!---->[**List&lt;AnalyticsEvaluation&gt;**](AnalyticsEvaluation.html)<!----> | Evaluations associated with this conversation |  [optional] |
| **surveys** | <!----><!---->[**List&lt;AnalyticsSurvey&gt;**](AnalyticsSurvey.html)<!----> | Surveys associated with this conversation |  [optional] |
| **resolutions** | <!----><!---->[**List&lt;AnalyticsResolution&gt;**](AnalyticsResolution.html)<!----> | Resolutions associated with this conversation |  [optional] |
| **participants** | <!----><!---->[**List&lt;AnalyticsParticipantWithoutAttributes&gt;**](AnalyticsParticipantWithoutAttributes.html)<!----> | Participants in the conversation |  [optional] |
{: class="table table-striped"}


<a name="OriginatingDirectionEnum"></a>

## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}



