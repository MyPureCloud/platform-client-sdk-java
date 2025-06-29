# KnowledgeDocumentsAnswerFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | The search query. |  [optional] |
| **language** | [**LanguageEnum**](#Enum--LanguageEnum) | The language of the documents. |  [optional] |
| **appType** | [**AppTypeEnum**](#Enum--AppTypeEnum) | The appType |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | The query type |  [optional] |
| **searchId** | **String** | The search id. |  [optional] |
| **insertHighlightIntoVariationContent** | **Boolean** | If specified - insert highlight data into the variation content. |  [optional] |
| **answerMode** | [**List<AnswerModeEnum>**](#Enum--AnswerModeEnum) | Allows extracted answers from an article (AnswerHighlight) and/or AI-generated answers (AnswerGeneration). Default mode: AnswerHighlight |  [optional] |
| **variationIds** | **List&lt;String&gt;** | The variation Ids to answer. |  |


## Enum: LanguageEnum

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


## Enum: AppTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASSISTANT | &quot;Assistant&quot; | 
| BOTFLOW | &quot;BotFlow&quot; | 
| MESSENGERKNOWLEDGEAPP | &quot;MessengerKnowledgeApp&quot; | 
| SMARTADVISOR | &quot;SmartAdvisor&quot; | 
| SUPPORTCENTER | &quot;SupportCenter&quot; | 


## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ARTICLE | &quot;Article&quot; | 
| AUTOSEARCH | &quot;AutoSearch&quot; | 
| CATEGORY | &quot;Category&quot; | 
| MANUALSEARCH | &quot;ManualSearch&quot; | 
| RECOMMENDATION | &quot;Recommendation&quot; | 
| SUGGESTION | &quot;Suggestion&quot; | 
| EXPANDEDARTICLE | &quot;ExpandedArticle&quot; | 


## Enum: AnswerModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ANSWERHIGHLIGHT | &quot;AnswerHighlight&quot; |
| ANSWERGENERATION | &quot;AnswerGeneration&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
