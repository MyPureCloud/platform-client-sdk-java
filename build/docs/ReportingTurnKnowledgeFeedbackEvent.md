---
title: ReportingTurnKnowledgeFeedbackEvent
---
## ReportingTurnKnowledgeFeedbackEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **searchId** | <!----><!---->**String**<!----> | The ID of this knowledge search. |  [optional] |
| **knowledgeBaseId** | <!----><!---->**String**<!----> | The Knowledge Base ID that the captured knowledge data relates to. |  [optional] |
| **documents** | <!----><!---->[**List&lt;ReportingTurnKnowledgeDocument&gt;**](ReportingTurnKnowledgeDocument.html)<!----> | The list of search documents that the feedback applies to. |  [optional] |
| **feedbackRating** | <!----><!---->**Integer**<!----> | The feedback rating for the search (1.0 - 5.0). 1 = Negative, 5 = Positive. |  [optional] |
| **documentVariationId** | <!----><!---->**String**<!----> | The variation of the document. |  [optional] |
| **documentVersionId** | <!----><!---->**String**<!----> | The version of the document. |  [optional] |
{: class="table table-striped"}



