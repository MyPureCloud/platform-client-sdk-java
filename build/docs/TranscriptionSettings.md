---
title: TranscriptionSettings
---
## TranscriptionSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transcription** | [**TranscriptionEnum**](#TranscriptionEnum)<!----> | Setting to enable/disable transcription capability |  |
| **transcriptionConfidenceThreshold** | <!----><!---->**Integer**<!----> | Configure confidence threshold. The possible values are from 1 to 100. |  |
| **lowLatencyTranscriptionEnabled** | <!----><!---->**Boolean**<!----> | Boolean flag indicating whether low latency transcription via Notification API is enabled |  [optional] |
| **contentSearchEnabled** | <!----><!---->**Boolean**<!----> | Setting to enable/disable content search |  [optional] |
{: class="table table-striped"}


<a name="TranscriptionEnum"></a>

## Enum: TranscriptionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DISABLED | &quot;Disabled&quot; | 
| ENABLEDGLOBALLY | &quot;EnabledGlobally&quot; | 
| ENABLEDQUEUEFLOW | &quot;EnabledQueueFlow&quot; | 
{: class="table table-striped"}



