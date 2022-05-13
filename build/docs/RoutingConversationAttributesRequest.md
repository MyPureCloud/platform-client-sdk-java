---
title: RoutingConversationAttributesRequest
---
## RoutingConversationAttributesRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **priority** | <!----><!---->**Integer**<!----> | Priority for the conversation.  Each point of priority is equivalent to one minute of time in queue.  Range:[-25000000, 25000000].  To reset, specify 0. |  [optional] |
| **skillIds** | <!----><!---->**List&lt;String&gt;**<!----> | Skill requirements for the conversation.  To remove all skill requirements, specify an empty list, i.e. []. |  [optional] |
| **languageId** | <!----><!---->**String**<!----> | Language requirement for the conversation.  To remove the language requirement, specify an empty string, i.e., \"\". |  [optional] |
| **requestScoredAgents** | <!----><!---->[**List&lt;RequestScoredAgent&gt;**](RequestScoredAgent.html)<!----> |  |  [optional] |
{: class="table table-striped"}



