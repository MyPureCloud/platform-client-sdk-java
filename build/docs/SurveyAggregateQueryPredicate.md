---
title: SurveyAggregateQueryPredicate
---
## SurveyAggregateQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension predicates |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIMENSION | &quot;dimension&quot; | 
| PROPERTY | &quot;property&quot; | 
| METRIC | &quot;metric&quot; | 
{: class="table table-striped"}


<a name="DimensionEnum"></a>

## Enum: DimensionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| EXTERNALCONTACTID | &quot;externalContactId&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| REQUESTEDLANGUAGEID | &quot;requestedLanguageId&quot; | 
| REQUESTEDROUTINGSKILLID | &quot;requestedRoutingSkillId&quot; | 
| SURVEYANSWERID | &quot;surveyAnswerId&quot; | 
| SURVEYCREATEDDATE | &quot;surveyCreatedDate&quot; | 
| SURVEYERRORREASON | &quot;surveyErrorReason&quot; | 
| SURVEYFORMCONTEXTID | &quot;surveyFormContextId&quot; | 
| SURVEYFORMID | &quot;surveyFormId&quot; | 
| SURVEYFORMNAME | &quot;surveyFormName&quot; | 
| SURVEYID | &quot;surveyId&quot; | 
| SURVEYPREVIOUSSTATUS | &quot;surveyPreviousStatus&quot; | 
| SURVEYPROMOTERSCORE | &quot;surveyPromoterScore&quot; | 
| SURVEYQUESTIONGROUPID | &quot;surveyQuestionGroupId&quot; | 
| SURVEYQUESTIONID | &quot;surveyQuestionId&quot; | 
| SURVEYSTATUS | &quot;surveyStatus&quot; | 
| TEAMID | &quot;teamId&quot; | 
| USERID | &quot;userId&quot; | 
| WRAPUPCODE | &quot;wrapUpCode&quot; | 
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHES | &quot;matches&quot; | 
| EXISTS | &quot;exists&quot; | 
| NOTEXISTS | &quot;notExists&quot; | 
{: class="table table-striped"}



