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
| EN_US | &quot;en-US&quot; |
| ES_US | &quot;es-US&quot; |
| EN_AU | &quot;en-AU&quot; |
| EN_GB | &quot;en-GB&quot; |
| EN_ZA | &quot;en-ZA&quot; |
| ES_ES | &quot;es-ES&quot; |
| EN_IN | &quot;en-IN&quot; |
| FR_FR | &quot;fr-FR&quot; |
| FR_CA | &quot;fr-CA&quot; |
| IT_IT | &quot;it-IT&quot; |
| DE_DE | &quot;de-DE&quot; |
| PT_BR | &quot;pt-BR&quot; |
| PL_PL | &quot;pl-PL&quot; |
| PT_PT | &quot;pt-PT&quot; |
{: class="table table-striped"}


<a name="ModeEnum"></a>

## Enum: ModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SKIP | &quot;Skip&quot; |
| MERGE | &quot;Merge&quot; |
{: class="table table-striped"}



