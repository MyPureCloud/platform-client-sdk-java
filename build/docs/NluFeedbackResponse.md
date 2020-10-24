---
title: NluFeedbackResponse
---
## NluFeedbackResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **text** | <!----><!---->**String**<!----> | The feedback text. |  [optional] |
| **intents** | <!----><!---->[**List&lt;IntentFeedback&gt;**](IntentFeedback.html)<!----> | Detected intent of the utterance |  [optional] |
| **version** | <!----><!---->[**NluDomainVersion**](NluDomainVersion.html)<!----> | The domain version of the feedback. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date when the feedback was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



