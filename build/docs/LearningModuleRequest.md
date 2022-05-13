---
title: LearningModuleRequest
---
## LearningModuleRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of learning module |  |
| **description** | <!----><!---->**String**<!----> | The description of learning module |  [optional] |
| **completionTimeInDays** | <!----><!---->**Integer**<!----> | The completion time of learning module in days |  |
| **informSteps** | <!----><!---->[**List&lt;LearningModuleInformStepRequest&gt;**](LearningModuleInformStepRequest.html)<!----> | The list of inform steps in a learning module |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type for the learning module |  [optional] |
| **assessmentForm** | <!----><!---->[**AssessmentForm**](AssessmentForm.html)<!----> | The assessment form for learning module |  [optional] |
| **coverArt** | <!----><!---->[**LearningModuleCoverArtRequest**](LearningModuleCoverArtRequest.html)<!----> | The cover art for the learning module |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFORMATIONAL | &quot;Informational&quot; | 
| ASSESSEDCONTENT | &quot;AssessedContent&quot; | 
| ASSESSMENT | &quot;Assessment&quot; | 
{: class="table table-striped"}



