# QueueConversationEmailEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueConversationEmailEventTopicUriReference**](QueueConversationEmailEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**QueueConversationEmailEventTopicUriReference**](QueueConversationEmailEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Integer** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;QueueConversationEmailEventTopicUriReference&gt;**](QueueConversationEmailEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;QueueConversationEmailEventTopicScoredAgent&gt;**](QueueConversationEmailEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
