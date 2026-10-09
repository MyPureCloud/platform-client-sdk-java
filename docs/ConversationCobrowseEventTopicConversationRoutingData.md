# ConversationCobrowseEventTopicConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**ConversationCobrowseEventTopicUriReference**](ConversationCobrowseEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **language** | [**ConversationCobrowseEventTopicUriReference**](ConversationCobrowseEventTopicUriReference) | A UriReference for a resource |  [optional] |
| **priority** | **Long** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;ConversationCobrowseEventTopicUriReference&gt;**](ConversationCobrowseEventTopicUriReference) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ConversationCobrowseEventTopicScoredAgent&gt;**](ConversationCobrowseEventTopicScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
| **skillExpressionId** | **String** | The skill expression to use for routing decisions. If specified, it takes priority over skills. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:265.1.0_
