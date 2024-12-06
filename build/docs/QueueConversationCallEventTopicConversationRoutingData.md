# QueueConversationCallEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**QueueConversationCallEventTopicUriReference**](QueueConversationCallEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Integer** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;QueueConversationCallEventTopicUriReference&gt;**](QueueConversationCallEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;QueueConversationCallEventTopicScoredAgent&gt;**](QueueConversationCallEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
