# NluFeedbackResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **text** | **String** | The feedback text. |  [optional] |
| **intents** | [**List&lt;IntentFeedback&gt;**](IntentFeedback) | Detected intent of the utterance |  [optional] |
| **version** | [**NluDomainVersion**](NluDomainVersion) | The domain version of the feedback. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date when the feedback was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **language** | **String** | The language of the version to which feedback is linked, e.g. en-us, de-de |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
