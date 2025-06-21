# Suggestion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the documents for which the suggestion is. |  [optional] |
| **faq** | [**Faq**](Faq) | The Faq from the knowledgebase that was provided as the suggestion. |  [optional] |
| **article** | [**Article**](Article) | The article from the knowledgebase that was provided as the suggestion. |  [optional] |
| **dateCreated** | [**Date**](Date) | Date when the suggestion was created. For example: yyyy-MM-ddTHH:mm:ss.SSZ. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **answerRecordId** | **String** | The ID of the knowledge search that provided the suggestion. |  [optional] |
| **triggerType** | [**TriggerTypeEnum**](#Enum--TriggerTypeEnum) | The trigger type of the suggestion. |  [optional] |
| **context** | [**SuggestionContext**](SuggestionContext) | The conversation context in which the suggestion was raised. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the suggestion. |  [optional] |
| **knowledgeSearch** | [**SuggestionKnowledgeSearch**](SuggestionKnowledgeSearch) | The suggested knowledge search result that was provided as the suggestion. |  [optional] |
| **knowledgeArticle** | [**SuggestionKnowledgeArticle**](SuggestionKnowledgeArticle) | The suggested knowledge article that was provided as the suggestion. |  [optional] |
| **cannedResponse** | [**SuggestionCannedResponse**](SuggestionCannedResponse) | The suggested canned response that was provided as the suggestion. |  [optional] |
| **script** | [**SuggestionScript**](SuggestionScript) | The suggested script that was provided as the suggestion. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
| **conversation** | [**AddressableEntityRef**](AddressableEntityRef) | The conversation that the suggestions correspond to. |  [optional] |
| **assistant** | [**AddressableEntityRef**](AddressableEntityRef) | The assistant that was used to provide the suggestions. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAQ | &quot;Faq&quot; | 
| ARTICLE | &quot;Article&quot; | 
| KNOWLEDGEARTICLE | &quot;KnowledgeArticle&quot; | 
| KNOWLEDGESEARCH | &quot;KnowledgeSearch&quot; | 
| CANNEDRESPONSE | &quot;CannedResponse&quot; | 
| SCRIPT | &quot;Script&quot; | 


## Enum: TriggerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| FALLBACK | &quot;Fallback&quot; | 
| CONVERSATIONSTART | &quot;ConversationStart&quot; | 
| CONVERSATIONTRANSFER | &quot;ConversationTransfer&quot; | 
| CONVERSATIONEND | &quot;ConversationEnd&quot; | 
| INTENT | &quot;Intent&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUGGESTED | &quot;Suggested&quot; | 
| ACCEPTED | &quot;Accepted&quot; | 
| DISMISSED | &quot;Dismissed&quot; | 
| FAILED | &quot;Failed&quot; | 
| RATED | &quot;Rated&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
