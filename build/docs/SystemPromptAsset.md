---
title: SystemPromptAsset
---
## SystemPromptAsset


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **promptId** | <!----><!---->**String**<!----> |  |  [optional] |
| **language** | <!----><!---->**String**<!----> | The asset resource language |  |
| **durationSeconds** | <!----><!---->**Double**<!----> |  |  [optional] |
| **mediaUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **ttsString** | <!----><!---->**String**<!----> |  |  [optional] |
| **text** | <!----><!---->**String**<!----> |  |  [optional] |
| **uploadUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **uploadStatus** | [**UploadStatusEnum**](#UploadStatusEnum)<!----> |  |  [optional] |
| **hasDefault** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **languageDefault** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **tags** | <!----><!---->[**Map&lt;String, List&lt;String&gt;&gt;**](List.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="UploadStatusEnum"></a>

## Enum: UploadStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;created&quot; | 
| UPLOADED | &quot;uploaded&quot; | 
| TRANSCODED | &quot;transcoded&quot; | 
| TRANSCODEFAILED | &quot;transcodeFailed&quot; | 
{: class="table table-striped"}



