---
title: IntentFeedback
---
## IntentFeedback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the detected intent. |  [optional] |
| **probability** | <!----><!---->**Double**<!----> | The probability of the detected intent. |  [optional] |
| **entities** | <!----><!---->[**List&lt;DetectedNamedEntity&gt;**](DetectedNamedEntity.html)<!----> | The collection of named entities detected. |  [optional] |
| **assessment** | [**AssessmentEnum**](#AssessmentEnum)<!----> | The assessment on the detection for feedback text. |  [optional] |
{: class="table table-striped"}


<a name="AssessmentEnum"></a>

## Enum: AssessmentEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INCORRECT | &quot;Incorrect&quot; | 
| CORRECT | &quot;Correct&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| DISABLED | &quot;Disabled&quot; | 
{: class="table table-striped"}



