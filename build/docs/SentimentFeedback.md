# SentimentFeedback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **phrase** | **String** | The phrase for which sentiment feedback is provided |  |
| **dialect** | **String** | The dialect for the given phrase, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard |  |
| **feedbackValue** | [**FeedbackValueEnum**](#Enum--FeedbackValueEnum) | The sentiment feedback value for the given phrase |  |
| **dateCreated** | [**Date**](Date) | The Timestamp when sentiment feedback created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**AddressableEntityRef**](AddressableEntityRef) | The Id of user who created the sentiment feedback |  [optional] |


## Enum: FeedbackValueEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
