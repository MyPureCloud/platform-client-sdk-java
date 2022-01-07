---
title: QueueConversationCallbackEventTopicConversationRoutingData
---
## QueueConversationCallbackEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**QueueConversationCallbackEventTopicUriReference**](QueueConversationCallbackEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **language** | <!----><!---->[**QueueConversationCallbackEventTopicUriReference**](QueueConversationCallbackEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;QueueConversationCallbackEventTopicUriReference&gt;**](QueueConversationCallbackEventTopicUriReference.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationCallbackEventTopicScoredAgent&gt;**](QueueConversationCallbackEventTopicScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



