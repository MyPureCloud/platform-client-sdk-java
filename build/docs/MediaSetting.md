---
title: MediaSetting
---
## MediaSetting


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enableAutoAnswer** | <!----><!---->**Boolean**<!----> | Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings. |  [optional] |
| **alertingTimeoutSeconds** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **serviceLevel** | <!----><!---->[**ServiceLevel**](ServiceLevel.html)<!----> |  |  [optional] |
| **subTypeSettings** | <!----><!---->[**Map&lt;String, BaseMediaSettings&gt;**](BaseMediaSettings.html)<!----> | Map of media subtype to media subtype specific settings. |  [optional] |
{: class="table table-striped"}



