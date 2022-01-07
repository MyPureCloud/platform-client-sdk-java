---
title: QueueConversationVideoEventTopicConversationRoutingData
---
## QueueConversationVideoEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**QueueConversationVideoEventTopicUriReference**](QueueConversationVideoEventTopicUriReference.html)<!----> |  |  [optional] |
| **language** | <!----><!---->[**QueueConversationVideoEventTopicUriReference**](QueueConversationVideoEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicUriReference&gt;**](QueueConversationVideoEventTopicUriReference.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationVideoEventTopicScoredAgent&gt;**](QueueConversationVideoEventTopicScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



