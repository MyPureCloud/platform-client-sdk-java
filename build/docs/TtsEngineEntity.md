---
title: TtsEngineEntity
---
## TtsEngineEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **languages** | <!----><!---->**List&lt;String&gt;**<!----> | The set of languages the TTS engine supports |  |
| **outputFormats** | <!----><!---->**List&lt;String&gt;**<!----> | The set of output formats the TTS engine can produce |  |
| **voices** | <!----><!---->[**List&lt;TtsVoiceEntity&gt;**](TtsVoiceEntity.html)<!----> | The set of voices the TTS engine supports |  [optional] |
| **isDefault** | <!----><!---->**Boolean**<!----> | The TTS engine is the global default engine |  [optional] |
| **isSecure** | <!----><!---->**Boolean**<!----> | The TTS engine can be used in a secure call flow |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



