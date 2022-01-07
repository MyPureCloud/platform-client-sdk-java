---
title: QueueConversationSocialExpressionEventTopicConversationRoutingData
---
## QueueConversationSocialExpressionEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**QueueConversationSocialExpressionEventTopicUriReference**](QueueConversationSocialExpressionEventTopicUriReference.html)<!----> |  |  [optional] |
| **language** | <!----><!---->[**QueueConversationSocialExpressionEventTopicUriReference**](QueueConversationSocialExpressionEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicUriReference&gt;**](QueueConversationSocialExpressionEventTopicUriReference.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;QueueConversationSocialExpressionEventTopicScoredAgent&gt;**](QueueConversationSocialExpressionEventTopicScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



