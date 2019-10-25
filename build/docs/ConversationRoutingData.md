---
title: ConversationRoutingData
---
## ConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The queue to use for routing decisions |  [optional] |
| **language** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The language to use for routing decisions |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | <!----><!---->[**List&lt;ScoredAgent&gt;**](ScoredAgent.html)<!----> | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
{: class="table table-striped"}



