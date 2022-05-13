---
title: ScorableSurvey
---
## ScorableSurvey


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **surveyForm** | <!----><!---->[**SurveyForm**](SurveyForm.html)<!----> | Survey form used for this survey. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **answers** | <!----><!---->[**SurveyScoringSet**](SurveyScoringSet.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| SENT | &quot;Sent&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| FINISHED | &quot;Finished&quot; | 
| OPTOUT | &quot;OptOut&quot; | 
| ERROR | &quot;Error&quot; | 
| EXPIRED | &quot;Expired&quot; | 
{: class="table table-striped"}



