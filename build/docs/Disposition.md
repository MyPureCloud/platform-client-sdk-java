# Disposition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name of the disposition. Either a platform predefined value, or the name of the disposition in the disposition table.. |  |
| **analyzer** | **String** | The final media analyzer result that triggered the disposition result, if any. |  [optional] |
| **dispositionParameters** | [**DispositionParameters**](DispositionParameters) | Contains various parameters related to call analysis. |  [optional] |
| **detectedSpeechStart** | [**Date**](Date) | Absolute time when the speech started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **detectedSpeechEnd** | [**Date**](Date) | Absolute time when the speech ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
