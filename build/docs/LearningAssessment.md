---
title: LearningAssessment
---
## LearningAssessment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assessmentId** | <!----><!---->**String**<!----> | The Id of the assessment |  [optional] |
| **contextId** | <!----><!---->**String**<!----> | The context Id of the related assessment form |  [optional] |
| **assessmentFormId** | <!----><!---->**String**<!----> | The Id of the related assessment form |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the assessment |  [optional] |
| **answers** | <!----><!---->[**AssessmentScoringSet**](AssessmentScoringSet.html)<!----> | Answers for the assessment |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date the assessment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date the assessment was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateSubmitted** | <!----><!---->[**Date**](Date.html)<!----> | Date the assessment was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| FINISHED | &quot;Finished&quot; | 
{: class="table table-striped"}



