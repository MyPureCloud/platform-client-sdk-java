# QueueConversationCobrowseEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueConversationCobrowseEventTopicUriReference**](QueueConversationCobrowseEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**QueueConversationCobrowseEventTopicUriReference**](QueueConversationCobrowseEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Integer** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;QueueConversationCobrowseEventTopicUriReference&gt;**](QueueConversationCobrowseEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;QueueConversationCobrowseEventTopicScoredAgent&gt;**](QueueConversationCobrowseEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
