---
title: QueueConversationCobrowseEventTopicConversationRoutingData
---
## QueueConversationCobrowseEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**QueueConversationCobrowseEventTopicUriReference**](QueueConversationCobrowseEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **language** | <!----><!---->[**QueueConversationCobrowseEventTopicUriReference**](QueueConversationCobrowseEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;QueueConversationCobrowseEventTopicUriReference&gt;**](QueueConversationCobrowseEventTopicUriReference.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationCobrowseEventTopicScoredAgent&gt;**](QueueConversationCobrowseEventTopicScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



