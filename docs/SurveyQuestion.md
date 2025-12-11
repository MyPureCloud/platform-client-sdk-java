# SurveyQuestion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **contextId** | **String** | An identifier for this question that stays the same across versions of the form. |  [optional] |
| **text** | **String** |  |  [optional] |
| **helpText** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **naEnabled** | **Boolean** |  |  [optional] |
| **visibilityCondition** | [**VisibilityCondition**](VisibilityCondition) |  |  [optional] |
| **answerOptions** | [**List&lt;AnswerOption&gt;**](AnswerOption) | Options from which to choose an answer for this question. Only used by Multiple Choice type questions. |  [optional] |
| **maxResponseCharacters** | **Integer** | How many characters are allowed in the text response to this question. Used by NPS and Free Text question types. |  [optional] |
| **explanationPrompt** | **String** | Prompt for details explaining the chosen NPS score. Used by NPS questions. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MULTIPLECHOICEQUESTION | &quot;multipleChoiceQuestion&quot; | 
| MULTIPLESELECTQUESTION | &quot;multipleSelectQuestion&quot; | 
| FREETEXTQUESTION | &quot;freeTextQuestion&quot; | 
| NPSQUESTION | &quot;npsQuestion&quot; | 
| READONLYTEXTBLOCKQUESTION | &quot;readOnlyTextBlockQuestion&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
