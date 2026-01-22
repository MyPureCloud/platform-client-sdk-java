# EvaluationSearchCriteriaDTO


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of query Operation to Perform |  |
| **field** | [**FieldEnum**](#Enum--FieldEnum) | Field name to search against |  |
| **endValue** | **String** | The end value of the range. This field is used for range search types. Date values must be in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. |  [optional] |
| **values** | **List&lt;String&gt;** | A list of values for the search to match against. Only for Type: EXACT |  [optional] |
| **startValue** | **String** | The start value of the range. This field is used for range search types. Date values must be in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. |  [optional] |
| **value** | **String** | A value for the search to match against |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | How to apply this search criteria against other criteria |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXACT | &quot;EXACT&quot; | 
| DATE_RANGE | &quot;DATE_RANGE&quot; | 
| GREATER_THAN | &quot;GREATER_THAN&quot; | 
| GREATER_THAN_EQUAL_TO | &quot;GREATER_THAN_EQUAL_TO&quot; | 
| LESS_THAN | &quot;LESS_THAN&quot; | 
| LESS_THAN_EQUAL_TO | &quot;LESS_THAN_EQUAL_TO&quot; | 
| RANGE | &quot;RANGE&quot; | 
| REQUIRED_FIELDS | &quot;REQUIRED_FIELDS&quot; | 


## Enum: FieldEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EVALUATIONID | &quot;evaluationId&quot; | 
| CONVERSATIONID | &quot;conversationId&quot; | 
| CONTEXTID | &quot;contextId&quot; | 
| FORMID | &quot;formId&quot; | 
| EVALUATIONSTATUS | &quot;evaluationStatus&quot; | 
| QUEUEID | &quot;queueId&quot; | 
| AGENTTEAMID | &quot;agentTeamId&quot; | 
| DIVISIONID | &quot;divisionId&quot; | 
| AGENTID | &quot;agentId&quot; | 
| EVALUATORID | &quot;evaluatorId&quot; | 
| ASSIGNEEID | &quot;assigneeId&quot; | 
| TOTALSCORE | &quot;totalScore&quot; | 
| TOTALCRITICALSCORE | &quot;totalCriticalScore&quot; | 
| CONVERSATIONDATE | &quot;conversationDate&quot; | 
| CREATEDDATE | &quot;createdDate&quot; | 
| SUBMITTEDDATE | &quot;submittedDate&quot; | 
| RELEASEDATE | &quot;releaseDate&quot; | 
| RELEASED | &quot;released&quot; | 
| MEDIATYPE | &quot;mediaType&quot; | 
| QUESTIONGROUPID | &quot;questionGroupId&quot; | 
| QUESTIONGROUPMARKEDNA | &quot;questionGroupMarkedNA&quot; | 
| QUESTIONGROUPSCORE | &quot;questionGroupScore&quot; | 
| CRITICALQUESTIONGROUPSCORE | &quot;criticalQuestionGroupScore&quot; | 
| QUESTIONGROUPSCOREPERCENTAGE | &quot;questionGroupScorePercentage&quot; | 
| CRITICALQUESTIONGROUPSCOREPERCENTAGE | &quot;criticalQuestionGroupScorePercentage&quot; | 
| QUESTIONID | &quot;questionId&quot; | 
| QUESTIONANSWERID | &quot;questionAnswerId&quot; | 
| QUESTIONSCORE | &quot;questionScore&quot; | 
| QUESTIONMARKEDNA | &quot;questionMarkedNA&quot; | 
| FAILEDKILLQUESTION | &quot;failedKillQuestion&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| NOT | &quot;NOT&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
