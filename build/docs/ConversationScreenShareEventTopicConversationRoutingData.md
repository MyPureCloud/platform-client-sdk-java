# ConversationScreenShareEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**ConversationScreenShareEventTopicUriReference**](ConversationScreenShareEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;ConversationScreenShareEventTopicUriReference&gt;**](ConversationScreenShareEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ConversationScreenShareEventTopicScoredAgent&gt;**](ConversationScreenShareEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
