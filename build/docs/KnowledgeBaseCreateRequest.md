---
title: KnowledgeBaseCreateRequest
---
## KnowledgeBaseCreateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | Knowledge base name |  |
| **description** | <!----><!---->**String**<!----> | Knowledge base description |  [optional] |
| **coreLanguage** | [**CoreLanguageEnum**](#CoreLanguageEnum)<!----> | Core language for knowledge base in which initial content must be created, language codes [en-US, en-UK, en-AU, de-DE] are supported currently. However, the new DX knowledge will support all these language codes, along with 'early preview' language codes [ca-ES, tr-TR, sv-SE, fi-FI, nb-NO, da-DK, ja-JP, ar-AE] which might have a lower accuracy. |  |
{: class="table table-striped"}


<a name="CoreLanguageEnum"></a>

## Enum: CoreLanguageEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EN_US | &quot;en-US&quot; | 
| EN_UK | &quot;en-UK&quot; | 
| EN_AU | &quot;en-AU&quot; | 
| EN_CA | &quot;en-CA&quot; | 
| EN_HK | &quot;en-HK&quot; | 
| EN_IN | &quot;en-IN&quot; | 
| EN_IE | &quot;en-IE&quot; | 
| EN_NZ | &quot;en-NZ&quot; | 
| EN_PH | &quot;en-PH&quot; | 
| EN_SG | &quot;en-SG&quot; | 
| EN_ZA | &quot;en-ZA&quot; | 
| DE_DE | &quot;de-DE&quot; | 
| DE_AT | &quot;de-AT&quot; | 
| DE_CH | &quot;de-CH&quot; | 
| ES_AR | &quot;es-AR&quot; | 
| ES_CO | &quot;es-CO&quot; | 
| ES_MX | &quot;es-MX&quot; | 
| ES_US | &quot;es-US&quot; | 
| ES_ES | &quot;es-ES&quot; | 
| FR_FR | &quot;fr-FR&quot; | 
| FR_BE | &quot;fr-BE&quot; | 
| FR_CA | &quot;fr-CA&quot; | 
| FR_CH | &quot;fr-CH&quot; | 
| PT_BR | &quot;pt-BR&quot; | 
| PT_PT | &quot;pt-PT&quot; | 
| NL_NL | &quot;nl-NL&quot; | 
| NL_BE | &quot;nl-BE&quot; | 
| IT_IT | &quot;it-IT&quot; | 
| CA_ES | &quot;ca-ES&quot; | 
| TR_TR | &quot;tr-TR&quot; | 
| SV_SE | &quot;sv-SE&quot; | 
| FI_FI | &quot;fi-FI&quot; | 
| NB_NO | &quot;nb-NO&quot; | 
| DA_DK | &quot;da-DK&quot; | 
| JA_JP | &quot;ja-JP&quot; | 
| AR_AE | &quot;ar-AE&quot; | 
{: class="table table-striped"}



