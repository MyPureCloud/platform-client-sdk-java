# QueueConversationScreenShareEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueConversationScreenShareEventTopicUriReference**](QueueConversationScreenShareEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**QueueConversationScreenShareEventTopicUriReference**](QueueConversationScreenShareEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;QueueConversationScreenShareEventTopicUriReference&gt;**](QueueConversationScreenShareEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;QueueConversationScreenShareEventTopicScoredAgent&gt;**](QueueConversationScreenShareEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
