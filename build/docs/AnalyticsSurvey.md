---
title: AnalyticsSurvey
---
## AnalyticsSurvey


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | <!----><!---->[**Date**](Date.html)<!----> | Specifies when an event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **queueId** | <!----><!---->**String**<!----> | The ID of the associated queue |  [optional] |
| **surveyCompletedDate** | <!----><!---->[**Date**](Date.html)<!----> | Completion datetime of the survey in ISO 8601 format |  [optional] |
| **surveyFormContextId** | <!----><!---->**String**<!----> | Unique identifier for the survey form, regardless of version |  [optional] |
| **surveyFormId** | <!----><!---->**String**<!----> | ID of the survey form used |  [optional] |
| **surveyFormName** | <!----><!---->**String**<!----> | Name of the survey form used |  [optional] |
| **surveyId** | <!----><!---->**String**<!----> | ID of the survey |  [optional] |
| **surveyPartialResponse** | <!----><!---->**Boolean**<!----> | Whether the survey was completed with any required questions unanswered. |  [optional] |
| **surveyPromoterScore** | <!----><!---->**Integer**<!----> | Score of the survey used with NPS |  [optional] |
| **surveyStatus** | <!----><!---->**String**<!----> | The status of the survey |  [optional] |
| **surveyType** | [**SurveyTypeEnum**](#SurveyTypeEnum)<!----> | The type of the survey |  [optional] |
| **userId** | <!----><!---->**String**<!----> | ID of the agent the survey was performed against |  [optional] |
| **oSurveyTotalScore** | <!----><!---->**Long**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="SurveyTypeEnum"></a>

## Enum: SurveyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEB | &quot;Web&quot; | 
| VOICE | &quot;Voice&quot; | 
{: class="table table-striped"}



