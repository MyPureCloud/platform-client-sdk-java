# ConversationEmailEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**ConversationEmailEventTopicUriReference**](ConversationEmailEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**ConversationEmailEventTopicUriReference**](ConversationEmailEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Integer** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;ConversationEmailEventTopicUriReference&gt;**](ConversationEmailEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ConversationEmailEventTopicScoredAgent&gt;**](ConversationEmailEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
