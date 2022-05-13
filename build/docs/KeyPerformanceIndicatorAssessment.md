---
title: KeyPerformanceIndicatorAssessment
---
## KeyPerformanceIndicatorAssessment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **kpi** | <!----><!---->**String**<!----> | Name of the key performance indicator assessed. |  [optional] |
| **assessmentResult** | [**AssessmentResultEnum**](#AssessmentResultEnum)<!----> | The overall result of the assessment for a key performance indicator. |  [optional] |
| **checks** | <!----><!---->[**List&lt;Check&gt;**](Check.html)<!----> | Set of checks executed as part of an assessment. |  [optional] |
{: class="table table-striped"}


<a name="AssessmentResultEnum"></a>

## Enum: AssessmentResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| NOTSUPPORTED | &quot;NotSupported&quot; | 
| HIGH | &quot;High&quot; | 
| LOW | &quot;Low&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



