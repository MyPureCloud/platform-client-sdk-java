# QueueConversationCallbackEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueConversationCallbackEventTopicUriReference**](QueueConversationCallbackEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**QueueConversationCallbackEventTopicUriReference**](QueueConversationCallbackEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Integer** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;QueueConversationCallbackEventTopicUriReference&gt;**](QueueConversationCallbackEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;QueueConversationCallbackEventTopicScoredAgent&gt;**](QueueConversationCallbackEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
