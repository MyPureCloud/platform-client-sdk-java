# TranscriptTopic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the object. |  [optional] |
| **topicPhrase** | **String** | The phrase which detected the topic.  |  [optional] |
| **transcriptPhrase** | **String** | The transcript phrase which detected the topic. |  [optional] |
| **confidence** | **Integer** | The detection confidence of the topic. |  [optional] |
| **startTimeMilliseconds** | **Long** | The start time of the topic phrase. |  [optional] |
| **duration** | [**TopicDuration**](TopicDuration) |  |  [optional] |
| **offset** | [**TopicOffset**](TopicOffset) | Location of the phrase |  [optional] |
| **recordingLocation** | **Long** | Location of the phrase in the recording in milliseconds |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:219.0.0_
