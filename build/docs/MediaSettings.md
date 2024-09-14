# MediaSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enableAutoAnswer** | **Boolean** | Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings. |  [optional] |
| **alertingTimeoutSeconds** | **Integer** | The alerting timeout for the media type, in seconds |  [optional] |
| **serviceLevel** | [**ServiceLevel**](ServiceLevel) | The targeted service level for the media type |  [optional] |
| **autoAnswerAlertToneSeconds** | **Double** | How long to play the alerting tone for an auto-answer interaction |  [optional] |
| **manualAnswerAlertToneSeconds** | **Double** | How long to play the alerting tone for a manual-answer interaction |  [optional] |
| **subTypeSettings** | [**Map&lt;String, BaseMediaSettings&gt;**](BaseMediaSettings) | Map of media subtype to media subtype specific settings. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
