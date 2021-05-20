---
title: TranscriptionsTopicTranscriptResult
---
## TranscriptionsTopicTranscriptResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **utteranceId** | <!----><!---->**String**<!----> |  |  [optional] |
| **isFinal** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **channel** | [**ChannelEnum**](#ChannelEnum)<!----> |  |  [optional] |
| **alternatives** | <!----><!---->[**List&lt;TranscriptionsTopicTranscriptAlternative&gt;**](TranscriptionsTopicTranscriptAlternative.html)<!----> |  |  [optional] |
| **agentAssistantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **engineId** | <!----><!---->**String**<!----> |  |  [optional] |
| **dialect** | <!----><!---->**String**<!----> |  |  [optional] |
| **speechTextAnalyticsProgramId** | <!----><!---->**String**<!----> |  |  [optional] |
| **startTimeMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **offsetMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **durationMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
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



