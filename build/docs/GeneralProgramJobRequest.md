---
title: GeneralProgramJobRequest
---
## GeneralProgramJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dialect** | [**DialectEnum**](#DialectEnum)<!----> | The dialect of the topics to link with the general program, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard |  |
| **mode** | [**ModeEnum**](#ModeEnum)<!----> | The mode to use for the general program job, default value is Skip |  [optional] |
{: class="table table-striped"}


<a name="DialectEnum"></a>

## Enum: DialectEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AR_001 | &quot;ar-001&quot; | 
| AR_AE | &quot;ar-AE&quot; | 
| AR_BH | &quot;ar-BH&quot; | 
| AR_EG | &quot;ar-EG&quot; | 
| AR_IL | &quot;ar-IL&quot; | 
| AR_SA | &quot;ar-SA&quot; | 
| AR_TN | &quot;ar-TN&quot; | 
| DA_DK | &quot;da-DK&quot; | 
| DE_CH | &quot;de-CH&quot; | 
| DE_DE | &quot;de-DE&quot; | 
| EN_AU | &quot;en-AU&quot; | 
| EN_GB | &quot;en-GB&quot; | 
| EN_HK | &quot;en-HK&quot; | 
| EN_IE | &quot;en-IE&quot; | 
| EN_IN | &quot;en-IN&quot; | 
| EN_NZ | &quot;en-NZ&quot; | 
| EN_SG | &quot;en-SG&quot; | 
| EN_US | &quot;en-US&quot; | 
| EN_ZA | &quot;en-ZA&quot; | 
| ES_ES | &quot;es-ES&quot; | 
| ES_US | &quot;es-US&quot; | 
| FI_FI | &quot;fi-FI&quot; | 
| FR_CA | &quot;fr-CA&quot; | 
| FR_FR | &quot;fr-FR&quot; | 
| HE_IL | &quot;he-IL&quot; | 
| IT_IT | &quot;it-IT&quot; | 
| JA_JP | &quot;ja-JP&quot; | 
| KO_KR | &quot;ko-KR&quot; | 
| NB_NO | &quot;nb-NO&quot; | 
| NL_NL | &quot;nl-NL&quot; | 
| PL_PL | &quot;pl-PL&quot; | 
| PT_BR | &quot;pt-BR&quot; | 
| PT_PT | &quot;pt-PT&quot; | 
| SV_SE | &quot;sv-SE&quot; | 
{: class="table table-striped"}


<a name="ModeEnum"></a>

## Enum: ModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SKIP | &quot;Skip&quot; | 
| MERGE | &quot;Merge&quot; | 
| REPLACEMERGE | &quot;ReplaceMerge&quot; | 
{: class="table table-striped"}



