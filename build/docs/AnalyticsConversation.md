---
title: AnalyticsConversation
---
## AnalyticsConversation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversationId** | **String** | Unique identifier for the conversation |  [optional] |
| **conversationStart** | [**Date**](Date.html) | Date/time the conversation started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **conversationEnd** | [**Date**](Date.html) | Date/time the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **participants** | [**List&lt;AnalyticsParticipant&gt;**](AnalyticsParticipant.html) | Participants in the conversation |  [optional] |
| **evaluations** | [**List&lt;AnalyticsEvaluation&gt;**](AnalyticsEvaluation.html) | Evaluations tied to this conversation |  [optional] |
| **surveys** | [**List&lt;AnalyticsSurvey&gt;**](AnalyticsSurvey.html) | Surveys tied to this conversation |  [optional] |
| **divisionIds** | **List&lt;String&gt;** | Identifiers of divisions associated with this conversation |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


