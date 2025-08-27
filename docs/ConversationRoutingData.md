# ConversationRoutingData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**AddressableEntityRef**](AddressableEntityRef) | The queue to use for routing decisions |  [optional] |
| **language** | [**AddressableEntityRef**](AddressableEntityRef) | The language to use for routing decisions |  [optional] |
| **priority** | **Integer** | The priority of the conversation to use for routing decisions |  [optional] |
| **skills** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | The skills to use for routing decisions |  [optional] |
| **scoredAgents** | [**List&lt;ScoredAgent&gt;**](ScoredAgent) | A collection of agents and their assigned scores for this conversation (0 - 100, higher being better), for use in routing to preferred agents |  [optional] |
| **label** | **String** | An optional label that categorizes the conversation.  Max-utilization settings can be configured at a per-label level |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
