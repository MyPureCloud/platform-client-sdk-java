---
title: SupportedLanguagesInfoDefinition
---
## SupportedLanguagesInfoDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **language** | <!----><!---->**String**<!----> | The given supported Language |  [optional] |
| **intentClassification** | <!----><!---->**Boolean**<!----> | The boolean status of if intent classification is supported in this language |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The language release status |  [optional] |
| **supportedEntityTypes** | <!----><!---->**List&lt;String&gt;**<!----> | The supported entity types for this language |  [optional] |
| **supportedEntityTypeConfiguration** | <!----><!---->[**SupportedEntityTypeStatus**](SupportedEntityTypeStatus.html)<!----> | The configuration for the supported entity types |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EARLY_PREVIEW | &quot;EARLY_PREVIEW&quot; | 
| PREVIEW | &quot;PREVIEW&quot; | 
| GA | &quot;GA&quot; | 
{: class="table table-striped"}



