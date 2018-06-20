---
title: SurveyForm
---
## SurveyForm


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The survey form name |  |
| **modifiedDate** | [**Date**](Date.html) | Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **published** | **Boolean** | Is this form published |  [optional] |
| **disabled** | **Boolean** | Is this form disabled |  [optional] |
| **contextId** | **String** | Unique Id for all versions of this form |  |
| **headerImageId** | **String** | Id of the header image appearing at the top of the form. |  [optional] |
| **headerImageUrl** | **String** | Temporary URL for accessing header image |  [optional] |
| **header** | **String** | Markdown text for the top of the form. |  [optional] |
| **footer** | **String** | Markdown text for the bottom of the form. |  [optional] |
| **questionGroups** | [**List&lt;QuestionGroup&gt;**](QuestionGroup.html) | A list of question groups |  |
| **publishedVersions** | [**DomainEntityListingSurveyForm**](DomainEntityListingSurveyForm.html) | List of published version of this form |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


