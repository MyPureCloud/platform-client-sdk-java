# EvaluationQuestion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **contextId** | **String** | An identifier for this question that stays the same across versions of the form. |  [optional] |
| **text** | **String** |  |  [optional] |
| **helpText** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **naEnabled** | **Boolean** |  |  [optional] |
| **commentsRequired** | **Boolean** |  |  [optional] |
| **visibilityCondition** | [**VisibilityCondition**](VisibilityCondition) |  |  [optional] |
| **answerOptions** | [**List&lt;AnswerOption&gt;**](AnswerOption) | Options from which to choose an answer for this question. Only used by Multiple Choice type questions. |  [optional] |
| **isKill** | **Boolean** |  |  [optional] |
| **isCritical** | **Boolean** |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MULTIPLECHOICEQUESTION | &quot;multipleChoiceQuestion&quot; | 
| MULTIPLESELECTQUESTION | &quot;multipleSelectQuestion&quot; | 
| FREETEXTQUESTION | &quot;freeTextQuestion&quot; | 
| NPSQUESTION | &quot;npsQuestion&quot; | 
| READONLYTEXTBLOCKQUESTION | &quot;readOnlyTextBlockQuestion&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
