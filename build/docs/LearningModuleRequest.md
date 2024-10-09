# LearningModuleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of learning module |  |
| **description** | **String** | The description of learning module |  [optional] |
| **completionTimeInDays** | **Integer** | The completion time of learning module in days |  |
| **informSteps** | [**List&lt;LearningModuleInformStepRequest&gt;**](LearningModuleInformStepRequest) | The list of inform steps in a learning module |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type for the learning module. Informational, AssessedContent and Assessment are deprecated |  [optional] |
| **assessmentForm** | [**AssessmentForm**](AssessmentForm) | The assessment form for learning module |  [optional] |
| **coverArt** | [**LearningModuleCoverArtRequest**](LearningModuleCoverArtRequest) | The cover art for the learning module |  [optional] |
| **lengthInMinutes** | **Integer** | The recommended time in minutes to complete the module |  [optional] |
| **excludedFromCatalog** | **Boolean** | If true, learning module is excluded when retrieving modules for manual assignment |  [optional] |
| **externalId** | **String** | The external ID of the learning module. Maximum length: 50 characters. |  [optional] |
| **enforceContentOrder** | **Boolean** | If true, learning module content should be viewed one by one in order |  [optional] |
| **reviewAssessmentResults** | [**ReviewAssessmentResults**](ReviewAssessmentResults) | Allows to view Assessment results in detail |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFORMATIONAL | &quot;Informational&quot; | 
| ASSESSEDCONTENT | &quot;AssessedContent&quot; | 
| ASSESSMENT | &quot;Assessment&quot; | 
| EXTERNAL | &quot;External&quot; | 
| NATIVE | &quot;Native&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
