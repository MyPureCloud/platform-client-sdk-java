# TranscriptionSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **transcription** | [**TranscriptionEnum**](#Enum--TranscriptionEnum) | Setting to enable/disable transcription capability |  |
| **transcriptionConfidenceThreshold** | **Integer** | Configure confidence threshold. The possible values are from 1 to 100. |  |
| **lowLatencyTranscriptionEnabled** | **Boolean** | Boolean flag indicating whether low latency transcription via Notification API is enabled |  [optional] |
| **contentSearchEnabled** | **Boolean** | Setting to enable/disable content search |  [optional] |
| **pciDssRedactionEnabled** | **Boolean** | Setting to enable/disable PCI DSS Redaction |  [optional] |
| **piiRedactionEnabled** | **Boolean** | Setting to enable/disable PII Redaction |  [optional] |


## Enum: TranscriptionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DISABLED | &quot;Disabled&quot; | 
| ENABLEDGLOBALLY | &quot;EnabledGlobally&quot; | 
| ENABLEDQUEUEFLOW | &quot;EnabledQueueFlow&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
