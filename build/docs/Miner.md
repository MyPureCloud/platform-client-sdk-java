# Miner


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Chat Corpus Name. |  |
| **language** | [**LanguageEnum**](#Enum--LanguageEnum) | Language Localization code. |  [optional] |
| **minerType** | [**MinerTypeEnum**](#Enum--MinerTypeEnum) | Type of the miner, intent or topic. |  [optional] |
| **seeding** | **Boolean** | Flag to indicate whether seeding is supported for this miner. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date when the miner was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the miner. |  [optional] |
| **conversationsDateRangeStart** | [**LocalDate**](LocalDate) | Date from which the conversations need to be taken for mining. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **conversationsDateRangeEnd** | [**LocalDate**](LocalDate) | Date till which the conversations need to be taken for mining. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateCompleted** | [**Date**](Date) | Date when the mining process was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **message** | **String** | Mining message if present. |  [optional] |
| **errorInfo** | [**MinerErrorInfo**](MinerErrorInfo) | Error Information |  [optional] |
| **warningInfo** | [**MinerErrorInfo**](MinerErrorInfo) | Warning Information |  [optional] |
| **conversationDataUploaded** | **Boolean** | Flag to indicate whether data file to be mined was uploaded. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type for filtering conversations. |  [optional] |
| **participantType** | [**ParticipantTypeEnum**](#Enum--ParticipantTypeEnum) | Type of the participant, either agent, customer or both. |  [optional] |
| **queueIds** | **List&lt;String&gt;** | List of queue IDs for filtering conversations. |  [optional] |
| **dateTriggered** | [**Date**](Date) | Date when the miner started execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date when the miner was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **latestDraftVersion** | [**Draft**](Draft) | Latest draft details of the miner. |  [optional] |
| **conversationsFetchedCount** | **Integer** | Number of conversations/transcripts fetched. |  [optional] |
| **conversationsValidCount** | **Integer** | Number of conversations/recordings/transcripts that were found valid for mining purposes. |  [optional] |
| **getminedItemCount** | **Integer** | Number of intents or topics based on the miner type. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: LanguageEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EN_US | &quot;en-us&quot; | 
| EN_GB | &quot;en-gb&quot; | 
| EN_AU | &quot;en-au&quot; | 
| EN_IN | &quot;en-in&quot; | 
| EN_ZA | &quot;en-za&quot; | 
| ES_US | &quot;es-us&quot; | 
| ES_ES | &quot;es-es&quot; | 
| FR_FR | &quot;fr-fr&quot; | 
| FR_CA | &quot;fr-ca&quot; | 
| DE_DE | &quot;de-de&quot; | 
| PT_PT | &quot;pt-pt&quot; | 
| PT_BR | &quot;pt-br&quot; | 
| IT_IT | &quot;it-it&quot; | 
| NL_NL | &quot;nl-nl&quot; | 
| DE_CH | &quot;de-ch&quot; | 
| JA_JP | &quot;ja-jp&quot; | 
| KO_KR | &quot;ko-kr&quot; | 
| HI_IN | &quot;hi-in&quot; | 
| AR_001 | &quot;ar-001&quot; | 
| AR_AE | &quot;ar-ae&quot; | 
| AR_BH | &quot;ar-bh&quot; | 
| AR_EG | &quot;ar-eg&quot; | 
| AR_IL | &quot;ar-il&quot; | 
| AR_SA | &quot;ar-sa&quot; | 
| AR_TN | &quot;ar-tn&quot; | 


## Enum: MinerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTENT | &quot;Intent&quot; | 
| TOPIC | &quot;Topic&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOTSTARTED | &quot;NotStarted&quot; | 
| FETCHINGCONVERSATIONIDS | &quot;FetchingConversationIds&quot; | 
| CONVERSATIONIDSFETCHED | &quot;ConversationIdsFetched&quot; | 
| CONVERSATIONIDSFETCHERROR | &quot;ConversationIdsFetchError&quot; | 
| FETCHINGCONVERSATIONS | &quot;FetchingConversations&quot; | 
| CONVERSATIONSFETCHED | &quot;ConversationsFetched&quot; | 
| CONVERSATIONSFETCHERROR | &quot;ConversationsFetchError&quot; | 
| QUEUED | &quot;Queued&quot; | 
| QUEUINGERROR | &quot;QueuingError&quot; | 
| MININGSTARTED | &quot;MiningStarted&quot; | 
| MASKINGUTTERANCES | &quot;MaskingUtterances&quot; | 
| MASKINGERROR | &quot;MaskingError&quot; | 
| COMPUTINGANALYTICS | &quot;ComputingAnalytics&quot; | 
| COMPUTINGANALYTICSERROR | &quot;ComputingAnalyticsError&quot; | 
| MININGCOMPLETED | &quot;MiningCompleted&quot; | 
| MININGERROR | &quot;MiningError&quot; | 
| MODELVALIDATIONERROR | &quot;ModelValidationError&quot; | 
| DELETED | &quot;Deleted&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CHAT | &quot;Chat&quot; | 
| CALL | &quot;Call&quot; | 
| MESSAGE | &quot;Message&quot; | 
| EMAIL | &quot;Email&quot; | 


## Enum: ParticipantTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOMER | &quot;Customer&quot; | 
| AGENT | &quot;Agent&quot; | 
| BOTH | &quot;Both&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
