---
title: ConversationScreenShareEventTopicConversationRoutingData
---
## ConversationScreenShareEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **language** | <!----><!---->[**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;ConversationScreenShareEventTopicUriReference&gt;**](ConversationScreenShareEventTopicUriReference.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ConversationScreenShareEventTopicScoredAgent&gt;**](ConversationScreenShareEventTopicScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



