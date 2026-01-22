# ConversationVideoEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**ConversationVideoEventTopicUriReference**](ConversationVideoEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**ConversationVideoEventTopicUriReference**](ConversationVideoEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;ConversationVideoEventTopicUriReference&gt;**](ConversationVideoEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ConversationVideoEventTopicScoredAgent&gt;**](ConversationVideoEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
