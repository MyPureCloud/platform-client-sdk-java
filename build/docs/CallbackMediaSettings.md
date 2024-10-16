# CallbackMediaSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enableAutoAnswer** | **Boolean** | Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings. |  [optional] |
| **alertingTimeoutSeconds** | **Integer** | The alerting timeout for the media type, in seconds |  [optional] |
| **serviceLevel** | [**ServiceLevel**](ServiceLevel) | The targeted service level for the media type |  [optional] |
| **autoAnswerAlertToneSeconds** | **Double** | How long to play the alerting tone for an auto-answer interaction |  [optional] |
| **manualAnswerAlertToneSeconds** | **Double** | How long to play the alerting tone for a manual-answer interaction |  [optional] |
| **subTypeSettings** | [**Map&lt;String, BaseMediaSettings&gt;**](BaseMediaSettings) | Map of media subtype to media subtype specific settings. |  [optional] |
| **enableAutoDialAndEnd** | **Boolean** | Flag to enable Auto-Dial and Auto-End automation for callbacks on this queue. |  [optional] |
| **autoDialDelaySeconds** | **Integer** | Time in seconds after agent connects to callback before outgoing call is auto-dialed. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds. |  [optional] |
| **autoEndDelaySeconds** | **Integer** | Time in seconds after agent disconnects from the outgoing call before the encasing callback is auto-ended. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
