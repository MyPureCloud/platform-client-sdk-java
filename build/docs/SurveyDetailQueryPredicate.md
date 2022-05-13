---
title: SurveyDetailQueryPredicate
---
## SurveyDetailQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Optional type, can usually be inferred |  [optional] |
| **dimension** | [**DimensionEnum**](#DimensionEnum)<!----> | Left hand side for dimension predicates |  [optional] |
| **metric** | [**MetricEnum**](#MetricEnum)<!----> | Left hand side for metric predicates |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Optional operator, default is matches |  [optional] |
| **value** | <!----><!---->**String**<!----> | Right hand side for dimension or metric predicates |  [optional] |
| **range** | <!----><!---->[**NumericRange**](NumericRange.html)<!----> | Right hand side for dimension or metric predicates |  [optional] |
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
| EVENTTIME | &quot;eventTime&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| SURVEYCOMPLETEDDATE | &quot;surveyCompletedDate&quot; | 
| SURVEYFORMCONTEXTID | &quot;surveyFormContextId&quot; | 
| SURVEYFORMID | &quot;surveyFormId&quot; | 
| SURVEYID | &quot;surveyId&quot; | 
| SURVEYPROMOTERSCORE | &quot;surveyPromoterScore&quot; | 
| SURVEYSTATUS | &quot;surveyStatus&quot; | 
| USERID | &quot;userId&quot; | 
{: class="table table-striped"}


<a name="MetricEnum"></a>

## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OSURVEYTOTALSCORE | &quot;oSurveyTotalScore&quot; | 
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



