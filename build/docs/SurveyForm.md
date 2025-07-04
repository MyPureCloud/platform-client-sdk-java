# SurveyForm


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The survey form name |  |
| **modifiedDate** | [**Date**](Date) | Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **published** | **Boolean** | Is this form published |  [optional] |
| **disabled** | **Boolean** | Is this form disabled |  [optional] |
| **contextId** | **String** | Unique Id for all versions of this form |  |
| **language** | **String** | Language for survey viewer localization. Currently localized languages: da, de, en-US, es, fi, fr, it, ja, ko, nl, no, pl, pt-BR, sv, th, tr, zh-CH, zh-TW |  |
| **header** | **String** | Markdown text for the top of the form. |  [optional] |
| **footer** | **String** | Markdown text for the bottom of the form. |  [optional] |
| **questionGroups** | [**List&lt;SurveyQuestionGroup&gt;**](SurveyQuestionGroup) | A list of question groups |  [optional] |
| **publishedVersions** | [**DomainEntityListingSurveyForm**](DomainEntityListingSurveyForm) | List of published version of this form |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
