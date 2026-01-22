# EvaluationSearchAggregationDTO


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the aggregation |  |
| **field** | [**FieldEnum**](#Enum--FieldEnum) | The field to aggregate on.ALLOWED FIELDS BY AGGREGATION TYPE:TERM/COUNT: evaluationStatus, aiScoringFailureType, questionAiAnswerFailureType,TERM: formId, formIdReleased, contextId, questionGroupId, questionId, questionAnswerId, released, questionGroupMarkedNA, questionMarkedNA, questionAiScored, questionEaScored,SUM/AVERAGE/STATS/RANGE: totalScore, totalCriticalScore, questionGroupScorePercentage,criticalQuestionGroupScorePercentage, questionScore,SUM: disputeCount, rescoreCount, eaSuggestionCount, eaAcceptedSuggestionCount,aiSuggestionCount, aiAcceptedSuggestionCount,DATE_HISTOGRAM: conversationDate, createdDate, submittedDate, releaseDate |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The Type of Aggregation to Perform |  |
| **size** | **Integer** | The size limit for term aggregations, 100 size limit for all fields |  [optional] |
| **calendarInterval** | **String** | The calendar interval for date histogram aggregations |  [optional] |
| **format** | **String** | The format for date histogram aggregations |  [optional] |
| **ranges** | [**List&lt;QueryApiSearchAggregationRange&gt;**](QueryApiSearchAggregationRange) | The ranges for range aggregations |  [optional] |
| **subAggregations** | [**List&lt;EvaluationSearchSubAggregationDTO&gt;**](EvaluationSearchSubAggregationDTO) | Sub-aggregations to be computed within this aggregation |  [optional] |


## Enum: FieldEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FORMID | &quot;formId&quot; | 
| FORMIDRELEASED | &quot;formIdReleased&quot; | 
| CONTEXTID | &quot;contextId&quot; | 
| QUESTIONGROUPID | &quot;questionGroupId&quot; | 
| QUESTIONID | &quot;questionId&quot; | 
| QUESTIONANSWERID | &quot;questionAnswerId&quot; | 
| EVALUATIONSTATUS | &quot;evaluationStatus&quot; | 
| AISCORINGFAILURETYPE | &quot;aiScoringFailureType&quot; | 
| QUESTIONAIANSWERFAILURETYPE | &quot;questionAiAnswerFailureType&quot; | 
| RELEASED | &quot;released&quot; | 
| QUESTIONGROUPMARKEDNA | &quot;questionGroupMarkedNA&quot; | 
| QUESTIONMARKEDNA | &quot;questionMarkedNA&quot; | 
| QUESTIONAISCORED | &quot;questionAiScored&quot; | 
| QUESTIONEASCORED | &quot;questionEaScored&quot; | 
| TOTALSCORE | &quot;totalScore&quot; | 
| TOTALCRITICALSCORE | &quot;totalCriticalScore&quot; | 
| QUESTIONGROUPSCOREPERCENTAGE | &quot;questionGroupScorePercentage&quot; | 
| CRITICALQUESTIONGROUPSCOREPERCENTAGE | &quot;criticalQuestionGroupScorePercentage&quot; | 
| QUESTIONGROUPSCORE | &quot;questionGroupScore&quot; | 
| CRITICALQUESTIONGROUPSCORE | &quot;criticalQuestionGroupScore&quot; | 
| QUESTIONSCORE | &quot;questionScore&quot; | 
| DISPUTECOUNT | &quot;disputeCount&quot; | 
| RESCORECOUNT | &quot;rescoreCount&quot; | 
| EASUGGESTIONCOUNT | &quot;eaSuggestionCount&quot; | 
| EAACCEPTEDSUGGESTIONCOUNT | &quot;eaAcceptedSuggestionCount&quot; | 
| AISUGGESTIONCOUNT | &quot;aiSuggestionCount&quot; | 
| AIACCEPTEDSUGGESTIONCOUNT | &quot;aiAcceptedSuggestionCount&quot; | 
| CONVERSATIONDATE | &quot;conversationDate&quot; | 
| CREATEDDATE | &quot;createdDate&quot; | 
| SUBMITTEDDATE | &quot;submittedDate&quot; | 
| RELEASEDATE | &quot;releaseDate&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TERM | &quot;TERM&quot; | 
| STATS | &quot;STATS&quot; | 
| SUM | &quot;SUM&quot; | 
| COUNT | &quot;COUNT&quot; | 
| AVERAGE | &quot;AVERAGE&quot; | 
| RANGE | &quot;RANGE&quot; | 
| DATE_HISTOGRAM | &quot;DATE_HISTOGRAM&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
