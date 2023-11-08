---
title: MediaSettings
---
## MediaSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enableAutoAnswer** | <!----><!---->**Boolean**<!----> | Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings. |  [optional] |
| **alertingTimeoutSeconds** | <!----><!---->**Integer**<!----> | The alerting timeout for the media type, in seconds |  [optional] |
| **serviceLevel** | <!----><!---->[**ServiceLevel**](ServiceLevel.html)<!----> | The targeted service level for the media type |  [optional] |
| **autoAnswerAlertToneSeconds** | <!----><!---->**Double**<!----> | How long to play the alerting tone for an auto-answer interaction |  [optional] |
| **manualAnswerAlertToneSeconds** | <!----><!---->**Double**<!----> | How long to play the alerting tone for a manual-answer interaction |  [optional] |
| **subTypeSettings** | <!----><!---->[**Map&lt;String, BaseMediaSettings&gt;**](BaseMediaSettings.html)<!----> | Map of media subtype to media subtype specific settings. |  [optional] |
{: class="table table-striped"}



