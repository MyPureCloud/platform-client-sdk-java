# MinerTopic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Topic name. |  [optional] |
| **miner** | [**Miner**](Miner) | The miner to which the topic belongs. |  [optional] |
| **conversationCount** | **Integer** | Number of conversations where a topic has occurred. |  [optional] |
| **conversationPercent** | **Float** | Percentage of conversations where a topic has occurred. |  [optional] |
| **utteranceCount** | **Integer** | Number of unique utterances where a topic has occurred. |  [optional] |
| **phraseCount** | **Integer** | Number of unique phrases (sub-utterances) where a topic has occurred. |  [optional] |
| **phrases** | [**List&lt;TopicPhrase&gt;**](TopicPhrase) | Phrases associated with a topic. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
