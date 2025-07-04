# KnowledgeImport


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the import operation |  [optional] |
| **name** | **String** | Name of the import operation |  [optional] |
| **uploadKey** | **String** | Upload key |  |
| **fileType** | [**FileTypeEnum**](#Enum--FileTypeEnum) | file type of the document |  |
| **ignoreHeaders** | **Boolean** | Ignore headers for the specified file |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the operation |  [optional] |
| **report** | [**ImportReport**](ImportReport) | Report of the import operation |  [optional] |
| **knowledgeBase** | [**KnowledgeBase**](KnowledgeBase) | Knowledge base which document import does belong to |  [optional] |
| **languageCode** | [**LanguageCodeEnum**](#Enum--LanguageCodeEnum) | Language code |  [optional] |
| **dateCreated** | [**Date**](Date) | Created date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: FileTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CSV | &quot;Csv&quot; | 
| JSONLINES | &quot;JsonLines&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| VALIDATIONINPROGRESS | &quot;ValidationInProgress&quot; | 
| VALIDATIONCOMPLETED | &quot;ValidationCompleted&quot; | 
| VALIDATIONFAILED | &quot;ValidationFailed&quot; | 
| STARTED | &quot;Started&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| PARTIALCOMPLETED | &quot;PartialCompleted&quot; | 
| FAILED | &quot;Failed&quot; | 
| ABORTREQUESTED | &quot;AbortRequested&quot; | 
| ABORTED | &quot;Aborted&quot; | 


## Enum: LanguageCodeEnum

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
| ZH_CN | &quot;zh-CN&quot; | 
| ZH_TW | &quot;zh-TW&quot; | 
| ZH_HK | &quot;zh-HK&quot; | 
| KO_KR | &quot;ko-KR&quot; | 
| PL_PL | &quot;pl-PL&quot; | 
| HI_IN | &quot;hi-IN&quot; | 
| TH_TH | &quot;th-TH&quot; | 
| HU_HU | &quot;hu-HU&quot; | 
| VI_VN | &quot;vi-VN&quot; | 
| UK_UA | &quot;uk-UA&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
