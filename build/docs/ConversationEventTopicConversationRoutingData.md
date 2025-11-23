# ConversationEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**ConversationEventTopicUriReference**](ConversationEventTopicUriReference) |  |  [optional] |
| **language** | [**ConversationEventTopicUriReference**](ConversationEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;ConversationEventTopicUriReference&gt;**](ConversationEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ConversationEventTopicScoredAgent&gt;**](ConversationEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
