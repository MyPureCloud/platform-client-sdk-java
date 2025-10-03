# SurveyAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |


## Enum: TargetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NSURVEYERRORS | &quot;nSurveyErrors&quot; | 
| NSURVEYFULLRESPONSES | &quot;nSurveyFullResponses&quot; | 
| NSURVEYNPSDETRACTORS | &quot;nSurveyNpsDetractors&quot; | 
| NSURVEYNPSPROMOTERS | &quot;nSurveyNpsPromoters&quot; | 
| NSURVEYNPSRESPONSES | &quot;nSurveyNpsResponses&quot; | 
| NSURVEYPARTIALRESPONSES | &quot;nSurveyPartialResponses&quot; | 
| NSURVEYQUESTIONGROUPRESPONSES | &quot;nSurveyQuestionGroupResponses&quot; | 
| NSURVEYQUESTIONRESPONSES | &quot;nSurveyQuestionResponses&quot; | 
| NSURVEYRESPONSES | &quot;nSurveyResponses&quot; | 
| NSURVEYSABANDONED | &quot;nSurveysAbandoned&quot; | 
| NSURVEYSDELETED | &quot;nSurveysDeleted&quot; | 
| NSURVEYSEXPIRED | &quot;nSurveysExpired&quot; | 
| NSURVEYSSENT | &quot;nSurveysSent&quot; | 
| NSURVEYSSTARTED | &quot;nSurveysStarted&quot; | 
| NVOICESURVEYS | &quot;nVoiceSurveys&quot; | 
| NWEBSURVEYS | &quot;nWebSurveys&quot; | 
| OSURVEYQUESTIONGROUPSCORE | &quot;oSurveyQuestionGroupScore&quot; | 
| OSURVEYQUESTIONSCORE | &quot;oSurveyQuestionScore&quot; | 
| OSURVEYTOTALSCORE | &quot;oSurveyTotalScore&quot; | 


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
