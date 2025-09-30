# QueueConversationVideoEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueConversationVideoEventTopicUriReference**](QueueConversationVideoEventTopicUriReference) |  |  [optional] |
| **language** | [**QueueConversationVideoEventTopicUriReference**](QueueConversationVideoEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;QueueConversationVideoEventTopicUriReference&gt;**](QueueConversationVideoEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;QueueConversationVideoEventTopicScoredAgent&gt;**](QueueConversationVideoEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
