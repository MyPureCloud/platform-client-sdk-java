---
title: TranscriptionTopicTranscriptResult
---
## TranscriptionTopicTranscriptResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **utteranceId** | <!----><!---->**String**<!----> |  |  [optional] |
| **isFinal** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **channel** | [**ChannelEnum**](#ChannelEnum)<!----> |  |  [optional] |
| **alternatives** | <!----><!---->[**List&lt;TranscriptionTopicTranscriptAlternative&gt;**](TranscriptionTopicTranscriptAlternative.html)<!----> |  |  [optional] |
| **agentAssistantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **engineId** | <!----><!---->**String**<!----> |  |  [optional] |
| **dialect** | <!----><!---->**String**<!----> |  |  [optional] |
| **speechTextAnalyticsProgramId** | <!----><!---->**String**<!----> |  |  [optional] |
| **agentAssistEnabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **voiceTranscriptionEnabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ChannelEnum"></a>

## Enum: ChannelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| INTERNAL | &quot;INTERNAL&quot; | 
| EXTERNAL | &quot;EXTERNAL&quot; | 
| BOTH | &quot;BOTH&quot; | 
{: class="table table-striped"}



