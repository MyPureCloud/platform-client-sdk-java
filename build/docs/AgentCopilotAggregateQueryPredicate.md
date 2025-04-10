# AgentCopilotAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#Enum--DimensionEnum) | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Optional operator, default is matches |  [optional] |
| **value** | **String** | Right hand side for dimension predicates |  [optional] |
| **range** | [**NumericRange**](NumericRange) | Right hand side for dimension predicates |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIMENSION | &quot;dimension&quot; | 
| PROPERTY | &quot;property&quot; | 
| METRIC | &quot;metric&quot; | 


## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTASSISTANTID | &quot;agentAssistantId&quot; | 
| CANNEDRESPONSEID | &quot;cannedResponseId&quot; | 
| CANNEDRESPONSELIBRARYID | &quot;cannedResponseLibraryId&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| ENGAGEMENTTYPE | &quot;engagementType&quot; | 
| EXTERNALCONTACTID | &quot;externalContactId&quot; | 
| FEEDBACKRATING | &quot;feedbackRating&quot; | 
| HASANSWERHIGHLIGHT | &quot;hasAnswerHighlight&quot; | 
| KNOWLEDGEBASEDOCUMENTID | &quot;knowledgeBaseDocumentId&quot; | 
| KNOWLEDGEBASEDOCUMENTVERSIONID | &quot;knowledgeBaseDocumentVersionId&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGEID | &quot;messageId&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| SCRIPTID | &quot;scriptId&quot; | 
| SCRIPTPAGEID | &quot;scriptPageId&quot; | 
| SEARCHID | &quot;searchId&quot; | 
| STATE | &quot;state&quot; | 
| SUGGESTIONID | &quot;suggestionId&quot; | 
| SUGGESTIONTYPE | &quot;suggestionType&quot; | 
| TRIGGERTYPE | &quot;triggerType&quot; | 
| USERID | &quot;userId&quot; | 
| UTTERANCEID | &quot;utteranceId&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
