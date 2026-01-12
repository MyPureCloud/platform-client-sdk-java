# ConversationCallEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**ConversationCallEventTopicUriReference**](ConversationCallEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;ConversationCallEventTopicUriReference&gt;**](ConversationCallEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ConversationCallEventTopicScoredAgent&gt;**](ConversationCallEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
