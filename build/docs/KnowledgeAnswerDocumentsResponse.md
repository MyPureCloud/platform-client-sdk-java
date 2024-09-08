---
title: KnowledgeAnswerDocumentsResponse
---
## KnowledgeAnswerDocumentsResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **results** | <!----><!---->[**List&lt;KnowledgeAnswerDocumentResponse&gt;**](KnowledgeAnswerDocumentResponse.html)<!----> | The results with answers if the answerMode request property is not set or contains \"AnswerHighlight\". Empty array otherwise. |  [optional] |
| **answerGeneration** | <!----><!---->[**KnowledgeAnswerGenerationResponse**](KnowledgeAnswerGenerationResponse.html)<!----> | The results with AI-generated answer if the answerMode request property contains \"AnswerGeneration\". |  [optional] |
{: class="table table-striped"}



