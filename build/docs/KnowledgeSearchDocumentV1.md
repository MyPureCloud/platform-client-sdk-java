# KnowledgeSearchDocumentV1


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **languageCode** | [**LanguageCodeEnum**](#Enum--LanguageCodeEnum) | Language of the document |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Document type |  |
| **faq** | [**DocumentFaq**](DocumentFaq) | FAQ document details |  [optional] |
| **dateCreated** | [**Date**](Date) | Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **categories** | [**List&lt;KnowledgeCategory&gt;**](KnowledgeCategory) | Document categories |  [optional] |
| **knowledgeBase** | [**KnowledgeBase**](KnowledgeBase) | Knowledge base which document does belong to |  [optional] |
| **externalUrl** | **String** | External URL to the document |  [optional] |
| **article** | [**DocumentArticle**](DocumentArticle) | Article |  [optional] |
| **confidence** | **Double** | The confidence associated with a document with respect to a search query |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAQ | &quot;Faq&quot; | 
| ARTICLE | &quot;Article&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
