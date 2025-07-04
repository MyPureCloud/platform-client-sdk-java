# KnowledgeAggregateQueryPredicate


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
| APPDEPLOYMENTID | &quot;appDeploymentId&quot; | 
| APPTYPE | &quot;appType&quot; | 
| BOTFLOWID | &quot;botFlowId&quot; | 
| CONVERSATIONCHANNELTYPE | &quot;conversationChannelType&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| DOCUMENTENGAGEMENTTYPE | &quot;documentEngagementType&quot; | 
| EXTERNALCONTACTID | &quot;externalContactId&quot; | 
| FEEDBACKCATEGORY | &quot;feedbackCategory&quot; | 
| FEEDBACKID | &quot;feedbackId&quot; | 
| FEEDBACKRATING | &quot;feedbackRating&quot; | 
| FEEDBACKRATINGTYPE | &quot;feedbackRatingType&quot; | 
| FEEDBACKRATINGVALUE | &quot;feedbackRatingValue&quot; | 
| FEEDBACKREASON | &quot;feedbackReason&quot; | 
| FEEDBACKTYPE | &quot;feedbackType&quot; | 
| HASCOMMENT | &quot;hasComment&quot; | 
| HASSEARCH | &quot;hasSearch&quot; | 
| KNOWLEDGEBASEDOCUMENTID | &quot;knowledgeBaseDocumentId&quot; | 
| KNOWLEDGEBASEDOCUMENTVARIATIONID | &quot;knowledgeBaseDocumentVariationId&quot; | 
| KNOWLEDGEBASEDOCUMENTVERSIONID | &quot;knowledgeBaseDocumentVersionId&quot; | 
| KNOWLEDGEBASEID | &quot;knowledgeBaseId&quot; | 
| LANGUAGECODE | &quot;languageCode&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| MESSAGETYPE | &quot;messageType&quot; | 
| PRESENTEDDOCUMENTSCOUNT | &quot;presentedDocumentsCount&quot; | 
| QUERYTYPE | &quot;queryType&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| SEARCHID | &quot;searchId&quot; | 
| SEARCHQUERY | &quot;searchQuery&quot; | 
| SELFSERVED | &quot;selfServed&quot; | 
| SESSIONID | &quot;sessionId&quot; | 
| SURFACINGMETHOD | &quot;surfacingMethod&quot; | 
| USERID | &quot;userId&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
