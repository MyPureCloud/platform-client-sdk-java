---
title: ConversationEventTopicConversationRoutingData
---
## ConversationEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**ConversationEventTopicUriReference**](ConversationEventTopicUriReference.html)<!----> |  |  [optional] |
| **language** | <!----><!---->[**ConversationEventTopicUriReference**](ConversationEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;ConversationEventTopicUriReference&gt;**](ConversationEventTopicUriReference.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ConversationEventTopicScoredAgent&gt;**](ConversationEventTopicScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



