---
title: QueueConversationChatEventTopicConversationRoutingData
---
## QueueConversationChatEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**QueueConversationChatEventTopicUriReference**](QueueConversationChatEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **language** | <!----><!---->[**QueueConversationChatEventTopicUriReference**](QueueConversationChatEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;QueueConversationChatEventTopicUriReference&gt;**](QueueConversationChatEventTopicUriReference.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationChatEventTopicScoredAgent&gt;**](QueueConversationChatEventTopicScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



