# ConversationSocialExpressionEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**ConversationSocialExpressionEventTopicUriReference**](ConversationSocialExpressionEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**ConversationSocialExpressionEventTopicUriReference**](ConversationSocialExpressionEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;ConversationSocialExpressionEventTopicUriReference&gt;**](ConversationSocialExpressionEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ConversationSocialExpressionEventTopicScoredAgent&gt;**](ConversationSocialExpressionEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
