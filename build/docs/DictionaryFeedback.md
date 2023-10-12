---
title: DictionaryFeedback
---
## DictionaryFeedback


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **term** | <!----><!---->**String**<!----> | The dictionary term which needs to be added to dictionary feedback system |  |
| **dialect** | <!----><!---->**String**<!----> | The dialect for the given term, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard |  |
| **boostValue** | <!----><!---->**Float**<!----> | A weighted value assigned to a phrase. The higher the value, the higher the likelihood that the system will choose the word or phrase from the possible alternatives. Boost range is from 1.0 to 10.0. Default is 2.0 |  [optional] |
| **source** | [**SourceEnum**](#SourceEnum)<!----> | The source of the given dictionary feedback |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The Timestamp when dictionary feedback created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The Id of the user who created the dictionary feedback |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The Timestamp when dictionary feedback modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The Id of the user who modified the dictionary feedback |  [optional] |
| **examplePhrases** | <!----><!---->[**List&lt;DictionaryFeedbackExamplePhrase&gt;**](DictionaryFeedbackExamplePhrase.html)<!----> | A list of at least 3 and up to 20 unique phrases that are example usage of the term |  |
| **soundsLike** | <!----><!---->**List&lt;String&gt;**<!----> | A list of up to 10 terms that give examples of how the term sounds |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SourceEnum"></a>

## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MANUAL | &quot;Manual&quot; | 
{: class="table table-striped"}



