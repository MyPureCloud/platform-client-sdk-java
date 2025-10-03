# QueueConversationMessageEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**QueueConversationMessageEventTopicUriReference**](QueueConversationMessageEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;QueueConversationMessageEventTopicUriReference&gt;**](QueueConversationMessageEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;QueueConversationMessageEventTopicScoredAgent&gt;**](QueueConversationMessageEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
