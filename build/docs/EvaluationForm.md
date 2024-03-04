---
title: EvaluationForm
---
## EvaluationForm


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The evaluation form name |  |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **published** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **contextId** | <!----><!---->**String**<!----> |  |  [optional] |
| **questionGroups** | <!----><!---->[**List&lt;EvaluationQuestionGroup&gt;**](EvaluationQuestionGroup.html)<!----> | A list of question groups |  |
| **publishedVersions** | <!----><!---->[**DomainEntityListingEvaluationForm**](DomainEntityListingEvaluationForm.html)<!----> | A list of the published versions of this form. Not populated by default, its availability depends on the endpoint. Use the 'expand=publishHistory' query parameter to retrieve this data where applicable (refer to the endpoint description to see if it is applicable). |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



