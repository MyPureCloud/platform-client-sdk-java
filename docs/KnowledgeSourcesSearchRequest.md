# KnowledgeSourcesSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | Input query to search content on the knowledge setting. |  |
| **knowledgeSettingId** | **String** | Knowledge Setting Id to use for search request. |  |
| **application** | [**V3KnowledgeSearchClientApplication**](V3KnowledgeSearchClientApplication) | The client application details from which search requested. |  [optional] |
| **conversationContext** | [**KnowledgeV3ConversationContext**](KnowledgeV3ConversationContext) | Conversation context information if the search is initiated in the context of a conversation. |  [optional] |
| **sessionId** | **String** | The session id for search request. |  [optional] |
| **queryType** | [**QueryTypeEnum**](#Enum--QueryTypeEnum) | The type of the query that initiates the search. |  [optional] |
| **generationLanguage** | [**GenerationLanguageEnum**](#Enum--GenerationLanguageEnum) | The language to use for answer generation. |  [optional] |
| **conversationTurns** | [**List&lt;KnowledgeConversationTurn&gt;**](KnowledgeConversationTurn) | List of conversation turns to use for stateful search. |  [optional] |


## Enum: QueryTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOSEARCH | &quot;AutoSearch&quot; | 
| MANUALSEARCH | &quot;ManualSearch&quot; | 


## Enum: GenerationLanguageEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AR_AE | &quot;ar-AE&quot; | 
| CS_CZ | &quot;cs-CZ&quot; | 
| DA_DK | &quot;da-DK&quot; | 
| DE_AT | &quot;de-AT&quot; | 
| DE_CH | &quot;de-CH&quot; | 
| DE_DE | &quot;de-DE&quot; | 
| EN_AU | &quot;en-AU&quot; | 
| EN_CA | &quot;en-CA&quot; | 
| EN_GB | &quot;en-GB&quot; | 
| EN_HK | &quot;en-HK&quot; | 
| EN_IE | &quot;en-IE&quot; | 
| EN_IN | &quot;en-IN&quot; | 
| EN_NZ | &quot;en-NZ&quot; | 
| EN_PH | &quot;en-PH&quot; | 
| EN_SG | &quot;en-SG&quot; | 
| EN_US | &quot;en-US&quot; | 
| EN_ZA | &quot;en-ZA&quot; | 
| ES_AR | &quot;es-AR&quot; | 
| ES_CO | &quot;es-CO&quot; | 
| ES_ES | &quot;es-ES&quot; | 
| ES_MX | &quot;es-MX&quot; | 
| ES_US | &quot;es-US&quot; | 
| FI_FI | &quot;fi-FI&quot; | 
| FR_BE | &quot;fr-BE&quot; | 
| FR_CA | &quot;fr-CA&quot; | 
| FR_CH | &quot;fr-CH&quot; | 
| FR_FR | &quot;fr-FR&quot; | 
| HI_IN | &quot;hi-IN&quot; | 
| HU_HU | &quot;hu-HU&quot; | 
| IT_IT | &quot;it-IT&quot; | 
| JA_JP | &quot;ja-JP&quot; | 
| KO_KR | &quot;ko-KR&quot; | 
| NB_NO | &quot;nb-NO&quot; | 
| NL_BE | &quot;nl-BE&quot; | 
| NL_NL | &quot;nl-NL&quot; | 
| PT_BR | &quot;pt-BR&quot; | 
| PT_PT | &quot;pt-PT&quot; | 
| SV_SE | &quot;sv-SE&quot; | 
| TR_TR | &quot;tr-TR&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:252.0.0_
