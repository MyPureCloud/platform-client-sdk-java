---
title: Miner
---
## Miner


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | Chat Corpus Name. |  |
| **language** | [**LanguageEnum**](#LanguageEnum)<!----> | Language Localization code. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date when the miner was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the miner. |  [optional] |
| **conversationsDateRangeStart** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Date from which the conversations need to be taken for mining. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **conversationsDateRangeEnd** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Date till which the conversations need to be taken for mining. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | Date when the mining process was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **message** | <!----><!---->**String**<!----> | Mining message if present. |  [optional] |
| **conversationDataUploaded** | <!----><!---->**Boolean**<!----> | Flag to indicate whether data file to be mined was uploaded. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type for filtering conversations. |  [optional] |
| **queueIds** | <!----><!---->**List&lt;String&gt;**<!----> | List of queue IDs for filtering conversations. |  [optional] |
| **dateTriggered** | <!----><!---->[**Date**](Date.html)<!----> | Date when the miner started execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date when the miner was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **latestDraftVersion** | <!----><!---->[**Draft**](Draft.html)<!----> | Latest draft details of the miner. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="LanguageEnum"></a>

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
{: class="table table-striped"}


<a name="StatusEnum"></a>

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
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CHAT | &quot;Chat&quot; | 
| CALL | &quot;Call&quot; | 
| MESSAGE | &quot;Message&quot; | 
{: class="table table-striped"}



